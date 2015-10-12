
/**
 * ToteLinkUpdateServiceMessageReceiverInOnly.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ei.eiservices.utote.service.totelinkupdate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * ToteLinkUpdateServiceMessageReceiverInOnly message receiver
 */

public class ToteLinkUpdateServiceMessageReceiverInOnly extends org.apache.axis2.receivers.AbstractInMessageReceiver {

    private static final Logger log4j = LogManager
            .getLogger(ToteLinkUpdateServiceMessageReceiverInOnly.class.getName());

    @Override
    public void invokeBusinessLogic(org.apache.axis2.context.MessageContext inMessage)
            throws org.apache.axis2.AxisFault {
        log4j.entry("ToteLinkUpdateServiceMessageReceiverInOnly.invokeBusinessLogic - inMessage=", (null == inMessage)?"NULL":inMessage.toString());

        if (log4j.isDebugEnabled()) {
            log4j.info(
                    "ToteLinkUpdateServiceMessageReceiverInOnly.invokeBusinessLogic inMessage={} || inMessage.getFrom()={} || inMessage.getTo()={} || inMessage.getEnvelope()={}",
                    (null == inMessage) ? "inMessage=NULL" : inMessage.toString(),
                            (null == inMessage) ? "inMessage=NULL"
                                    : (null == inMessage.getFrom()) ? "inMessage.getFrom()=NULL" : inMessage.getFrom().toString(),
                                            (null == inMessage) ? "inMessage=NULL"
                                                    : (null == inMessage.getTo()) ? "inMessage.getTo()=NULL" : inMessage.getTo().toString(),
                                                            (null == inMessage) ? "inMessage=NULL"
                                                                    : (null == inMessage.getEnvelope()) ? "inMessage.getEnvelope()=NULL" : inMessage.getEnvelope().toString());
        }

        try {

            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(inMessage);

            ToteLinkUpdateServiceSkeletonInterface skel = (ToteLinkUpdateServiceSkeletonInterface) obj;

            // Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = inMessage.getOperationContext().getAxisOperation();
            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                        "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            java.lang.String methodName;
            if ((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils
                    .xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)) {

                if ("updateNotification".equals(methodName)) {

                    org.tempuri.UpdateNotificationE wrappedParam = (org.tempuri.UpdateNotificationE) fromOM(
                            inMessage.getEnvelope().getBody().getFirstElement(), org.tempuri.UpdateNotificationE.class,
                            getEnvelopeNamespaces(inMessage.getEnvelope()));

                    skel.updateNotification(wrappedParam);
                } else if ("statusNotification".equals(methodName)) {

                    org.tempuri.StatusNotificationE wrappedParam = (org.tempuri.StatusNotificationE) fromOM(
                            inMessage.getEnvelope().getBody().getFirstElement(), org.tempuri.StatusNotificationE.class,
                            getEnvelopeNamespaces(inMessage.getEnvelope()));

                    skel.statusNotification(wrappedParam);

                } else {
                    throw new java.lang.RuntimeException("ToteLinkUpdateServiceMessageReceiverInOnly.invokeBusinessLogic - 	method not found");
                }

            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //
    @SuppressWarnings("unused")
    private org.apache.axiom.om.OMElement toOM(org.tempuri.UpdateNotificationE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(org.tempuri.UpdateNotificationE.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    @SuppressWarnings("unused")
    private org.apache.axiom.om.OMElement toOM(org.tempuri.StatusNotificationE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(org.tempuri.StatusNotificationE.MY_QNAME,
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

            if (org.tempuri.StatusNotificationE.class.equals(type)) {

                return org.tempuri.StatusNotificationE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (org.tempuri.UpdateNotificationE.class.equals(type)) {

                return org.tempuri.UpdateNotificationE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

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
