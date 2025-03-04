package com.ei.eiservices.utote;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ReadListener;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.WriteListener;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.output.TeeOutputStream;
import org.apache.log4j.Logger;

public class ReqRespDumpFilter implements Filter {

	private static final Logger logger = Logger.getLogger(ReqRespDumpFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		try {
			HttpServletRequest httpServletRequest = (HttpServletRequest) request;
			HttpServletResponse httpServletResponse = (HttpServletResponse) response;

			Map<String, String> requestMap = this.getTypesafeRequestMap(httpServletRequest);
			BufferedRequestWrapper bufferedReqest = new BufferedRequestWrapper(httpServletRequest);
			BufferedResponseWrapper bufferedResponse = new BufferedResponseWrapper(httpServletResponse);

			final StringBuilder logMessage = new StringBuilder("REST Request - ").append("[HTTP METHOD:")
					.append(httpServletRequest.getMethod()).append("] [PATH INFO:")
					.append(httpServletRequest.getPathInfo()).append("] [REQUEST PARAMETERS:").append(requestMap)
					.append("] [REQUEST BODY:").append(bufferedReqest.getRequestBody()).append("] [REMOTE ADDRESS:")
					.append(httpServletRequest.getRemoteAddr()).append("]");

			chain.doFilter(bufferedReqest, bufferedResponse);
			logMessage.append(" [RESPONSE:").append(bufferedResponse.getContent()).append("]");
			logger.debug(logMessage);
		} catch (Throwable a) {
			logger.error(a);
		}
	}

	private Map<String, String> getTypesafeRequestMap(HttpServletRequest request) {
		Map<String, String> typesafeRequestMap = new HashMap<String, String>();
		Enumeration<?> requestParamNames = request.getParameterNames();
		while (requestParamNames.hasMoreElements()) {
			String requestParamName = (String) requestParamNames.nextElement();
			String requestParamValue = request.getParameter(requestParamName);
			typesafeRequestMap.put(requestParamName, requestParamValue);
		}
		return typesafeRequestMap;
	}

	@Override
	public void destroy() {
	}

	private static final class BufferedRequestWrapper extends HttpServletRequestWrapper {

		private ByteArrayInputStream bais = null;
		private ByteArrayOutputStream baos = null;
		private BufferedServletInputStream bsis = null;
		private byte[] buffer = null;

		public BufferedRequestWrapper(HttpServletRequest req) throws IOException {
			super(req);
			// Read InputStream and store its content in a buffer.
			InputStream is = req.getInputStream();
			this.baos = new ByteArrayOutputStream();
			byte buf[] = new byte[1024];
			int letti;
			while ((letti = is.read(buf)) > 0) {
				this.baos.write(buf, 0, letti);
			}
			this.buffer = this.baos.toByteArray();
		}

		@Override
		public ServletInputStream getInputStream() {
			this.bais = new ByteArrayInputStream(this.buffer);
			this.bsis = new BufferedServletInputStream(this.bais);
			return this.bsis;
		}

		String getRequestBody() throws IOException {
			BufferedReader reader = new BufferedReader(new InputStreamReader(this.getInputStream()));
			String line = null;
			StringBuilder inputBuffer = new StringBuilder();
			do {
				line = reader.readLine();
				if (null != line) {
					inputBuffer.append(line.trim());
				}
			} while (line != null);
			reader.close();
			return inputBuffer.toString().trim();
		}

	}

	private static final class BufferedServletInputStream extends ServletInputStream {

		private ByteArrayInputStream bais;
		@SuppressWarnings("unused")
		private ReadListener rl = null;

		public BufferedServletInputStream(ByteArrayInputStream bais) {
			this.bais = bais;
		}

		@Override
		public int available() {
			return this.bais.available();
		}

		@Override
		public int read() {
			return this.bais.read();
		}

		@Override
		public int read(byte[] buf, int off, int len) {
			return this.bais.read(buf, off, len);
		}

		@Override
		public boolean isFinished() {
			return (this.bais.available() <= 0);
		}

		@Override
		public boolean isReady() {
			return (this.bais.available() > 0);
		}

		@Override
		public void setReadListener(ReadListener arg0) {
			this.rl = arg0;
		}

	}

	public class TeeServletOutputStream extends ServletOutputStream {

		private final TeeOutputStream targetStream;
		@SuppressWarnings("unused")
		private WriteListener wl = null;

		public TeeServletOutputStream(OutputStream one, OutputStream two) {
			targetStream = new TeeOutputStream(one, two);
		}

		@Override
		public void write(int arg0) throws IOException {
			this.targetStream.write(arg0);
		}

		public void flush() throws IOException {
			super.flush();
			this.targetStream.flush();
		}

		public void close() throws IOException {
			super.close();
			this.targetStream.close();
		}

		@Override
		public boolean isReady() {
			return (this.targetStream != null);
		}

		@Override
		public void setWriteListener(WriteListener arg0) {
			this.wl = arg0;
			
		}
	}

	public class BufferedResponseWrapper extends  javax.servlet.http.HttpServletResponseWrapper {

		HttpServletResponse original;

		TeeServletOutputStream teeStream;

		PrintWriter teeWriter;

		ByteArrayOutputStream bos;

		public BufferedResponseWrapper(HttpServletResponse response) {
			super(response);
			original = response;
		}

		public String getContent() throws IOException {
			return bos.toString();
		}

		@Override
		public PrintWriter getWriter() throws IOException {

			if (this.teeWriter == null) {
				this.teeWriter = new PrintWriter(new OutputStreamWriter(getOutputStream()));
			}
			return this.teeWriter;
		}

		@Override
		public ServletOutputStream getOutputStream() throws IOException {

			if (teeStream == null) {
				bos = new ByteArrayOutputStream();
				teeStream = new TeeServletOutputStream(original.getOutputStream(), bos);
			}
			return teeStream;
		}

		@Override
		public void flushBuffer() throws IOException {
			if (teeStream != null) {
				teeStream.flush();
				System.err.println("teeStream flush");
			}
			if (this.teeWriter != null) {
				this.teeWriter.flush();
				System.err.println("teeWriter flush");
			}
		}
	}

}
