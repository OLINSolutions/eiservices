
package com.unitedtote.schema.totelink._2008._06.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.unitedtote.schema.totelink._2008._06.common package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Source_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Common", "Source");
    private final static QName _ToteLinkRequest_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Common", "ToteLinkRequest");
    private final static QName _Error_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Common", "Error");
    private final static QName _ToteLinkResponse_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Common", "ToteLinkResponse");
    private final static QName _ToteLinkResponseGroupId_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Common", "GroupId");
    private final static QName _ToteLinkResponseRunId_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Common", "RunId");
    private final static QName _ErrorMessage_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Common", "Message");
    private final static QName _ErrorNumber_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Common", "Number");
    private final static QName _ErrorParams_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Common", "Params");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.unitedtote.schema.totelink._2008._06.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ToteLinkResponse }
     * 
     */
    public ToteLinkResponse createToteLinkResponse() {
        return new ToteLinkResponse();
    }

    /**
     * Create an instance of {@link Keepalive }
     * 
     */
    public Keepalive createKeepalive() {
        return new Keepalive();
    }

    /**
     * Create an instance of {@link ToteLinkRequest }
     * 
     */
    public ToteLinkRequest createToteLinkRequest() {
        return new ToteLinkRequest();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new Source();
    }

    /**
     * Create an instance of {@link KeepaliveResponse }
     * 
     */
    public KeepaliveResponse createKeepaliveResponse() {
        return new KeepaliveResponse();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Source }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Common", name = "Source")
    public JAXBElement<Source> createSource(Source value) {
        return new JAXBElement<Source>(_Source_QNAME, Source.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToteLinkRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Common", name = "ToteLinkRequest")
    public JAXBElement<ToteLinkRequest> createToteLinkRequest(ToteLinkRequest value) {
        return new JAXBElement<ToteLinkRequest>(_ToteLinkRequest_QNAME, ToteLinkRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Error }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Common", name = "Error")
    public JAXBElement<Error> createError(Error value) {
        return new JAXBElement<Error>(_Error_QNAME, Error.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToteLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Common", name = "ToteLinkResponse")
    public JAXBElement<ToteLinkResponse> createToteLinkResponse(ToteLinkResponse value) {
        return new JAXBElement<ToteLinkResponse>(_ToteLinkResponse_QNAME, ToteLinkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Common", name = "GroupId", scope = ToteLinkResponse.class)
    public JAXBElement<String> createToteLinkResponseGroupId(String value) {
        return new JAXBElement<String>(_ToteLinkResponseGroupId_QNAME, String.class, ToteLinkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Common", name = "RunId", scope = ToteLinkResponse.class)
    public JAXBElement<String> createToteLinkResponseRunId(String value) {
        return new JAXBElement<String>(_ToteLinkResponseRunId_QNAME, String.class, ToteLinkResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Common", name = "Message", scope = Error.class)
    public JAXBElement<String> createErrorMessage(String value) {
        return new JAXBElement<String>(_ErrorMessage_QNAME, String.class, Error.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Common", name = "Number", scope = Error.class)
    public JAXBElement<String> createErrorNumber(String value) {
        return new JAXBElement<String>(_ErrorNumber_QNAME, String.class, Error.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Common", name = "Params", scope = Error.class)
    public JAXBElement<ArrayOfstring> createErrorParams(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ErrorParams_QNAME, ArrayOfstring.class, Error.class, value);
    }

}
