
/**
 * InitializeUnitedToteServiceMessageReceiverInOnly.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ei.eiservices.utote.service.initializeunitedtote;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * InitializeUnitedToteServiceMessageReceiverInOnly message receiver
 */

public class InitializeUnitedToteServiceMessageReceiverInOnly
		extends org.apache.axis2.receivers.AbstractInMessageReceiver {

	private static final Logger log4j = LogManager
			.getLogger(InitializeUnitedToteServiceMessageReceiverInOnly.class.getName());

	public void invokeBusinessLogic(org.apache.axis2.context.MessageContext inMessage)
			throws org.apache.axis2.AxisFault {

		if (log4j.isDebugEnabled())
			log4j.debug(
					"InitializeUnitedToteServiceMessageReceiverInOnly.invokeBusinessLogic inMessage.getEnvelope().getBody()={}",
					(null == inMessage) ? "inMessage=NULL"
							: (null == inMessage.getEnvelope()) ? "inMessage.getEnvelope()=NULL"
									: (null == inMessage.getEnvelope().getBody())
											? "inMessage.getEnvelope().getBody()=NULL"
											: inMessage.getEnvelope().getBody().toString());
		try {

			// get the implementation class for the Web Service
			Object obj = getTheImplementationObject(inMessage);

			InitializeUnitedToteServiceSkeletonInterface skel = (InitializeUnitedToteServiceSkeletonInterface) obj;
			// Out Envelop
			@SuppressWarnings("unused")
			org.apache.axiom.soap.SOAPEnvelope envelope = null;
			// Find the axisOperation that has been set by the Dispatch phase.
			org.apache.axis2.description.AxisOperation op = inMessage.getOperationContext().getAxisOperation();
			if (op == null) {
				throw new org.apache.axis2.AxisFault(
						"Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
			}

			java.lang.String methodName;
			if ((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils
					.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)) {

				if ("initializeUnitedTote".equals(methodName)) {

					org.tempuri.types.InitializeUnitedTote wrappedParam = (org.tempuri.types.InitializeUnitedTote) fromOM(
							inMessage.getEnvelope().getBody().getFirstElement(),
							org.tempuri.types.InitializeUnitedTote.class,
							getEnvelopeNamespaces(inMessage.getEnvelope()));

					skel.initializeUnitedTote(wrappedParam);

				} else {
					throw new java.lang.RuntimeException("method not found");
				}

			}
		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	//
	@SuppressWarnings("unused")
	private org.apache.axiom.om.OMElement toOM(org.tempuri.types.InitializeUnitedTote param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.tempuri.types.InitializeUnitedTote.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/**
	 * get the default envelope
	 */
	@SuppressWarnings("unused")
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
		return factory.getDefaultEnvelope();
	}

	@SuppressWarnings("rawtypes")
	private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type,
			java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {

		try {

			if (org.tempuri.types.InitializeUnitedTote.class.equals(type)) {

				return org.tempuri.types.InitializeUnitedTote.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}

	/**
	 * A utility method that copies the namepaces from the SOAPEnvelope
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env) {
		java.util.Map returnMap = new java.util.HashMap();
		java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
		while (namespaceIterator.hasNext()) {
			org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
			returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
		}
		return returnMap;
	}

}// end of class
