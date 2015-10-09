
/**
 * ToteLinkUpdateServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ei.eiservices.utote.service.totelinkupdate;

import javax.xml.namespace.QName;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 *  ToteLinkUpdateServiceStub java implementation
 */

public class ToteLinkUpdateServiceStub extends org.apache.axis2.client.Stub {
    private static final Logger log4j = LogManager.getLogger(ToteLinkUpdateServiceStub.class.getName());

    protected org.apache.axis2.description.AxisOperation[] _operations;

    private static int counter = 0;

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }
        counter = counter + 1;
        return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
    }

    private void populateAxisService() throws org.apache.axis2.AxisFault {

        // creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService("ToteLinkUpdateService" + getUniqueSuffix());
        addAnonymousOperations();

        // creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[2];

        __operation = new org.apache.axis2.description.OutOnlyAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://tempuri.org/", "updateNotification"));
        _service.addOperation(__operation);

        _operations[0] = __operation;

        __operation = new org.apache.axis2.description.OutOnlyAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://tempuri.org/", "statusNotification"));
        _service.addOperation(__operation);

        _operations[1] = __operation;

    }

    // populates the faults
    private void populateFaults() {

    }

    /**
     * Constructor that takes in a configContext
     */

    public ToteLinkUpdateServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
            java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext and useseperate listner
     */
    public ToteLinkUpdateServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
            java.lang.String targetEndpoint, boolean useSeparateListener) throws org.apache.axis2.AxisFault {
        // To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

    }

    /**
     * Default Constructor
     */
    public ToteLinkUpdateServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext)
            throws org.apache.axis2.AxisFault {

        this(configurationContext, "http://esb1.rtwbeta.com:5380/UtoteServices/services/ToteLinkUpdateService");

    }

    /**
     * Default Constructor
     */
    public ToteLinkUpdateServiceStub() throws org.apache.axis2.AxisFault {

        this("http://esb1.rtwbeta.com:5380/UtoteServices/services/ToteLinkUpdateService");

    }

    /**
     * Constructor taking the target endpoint
     */
    public ToteLinkUpdateServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }

    /**
     * Auto generated method signature
     *
     */
    public void updateNotification(org.tempuri.UpdateNotificationE updateNotification14

            ) throws java.rmi.RemoteException

    {

        log4j.trace("updateNotification - entered");
        org.apache.axis2.context.MessageContext _messageContext = null;

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[0].getName());
        _operationClient.getOptions().setAction("http://tempuri.org/IUpdateService/UpdateNotification");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        org.apache.axiom.soap.SOAPEnvelope env = null;
        _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), updateNotification14,
                optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/", "updateNotification")),
                new javax.xml.namespace.QName("http://tempuri.org/", "updateNotification"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope

        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.execute(true);

        if (_messageContext.getTransportOut() != null) {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }

        return;
    }

    /**
     * Auto generated method signature
     *
     */
    public void statusNotification(org.tempuri.StatusNotificationE statusNotification15

            ) throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient
                .createClient(_operations[1].getName());
        _operationClient.getOptions().setAction("http://tempuri.org/IUpdateService/StatusNotification");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        org.apache.axiom.soap.SOAPEnvelope env = null;
        _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), statusNotification15,
                optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/", "statusNotification")),
                new javax.xml.namespace.QName("http://tempuri.org/", "statusNotification"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope

        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.execute(true);

        if (_messageContext.getTransportOut() != null) {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }

        return;
    }

    /**
     * A utility method that copies the namepaces from the SOAPEnvelope
     */
    @SuppressWarnings({ "rawtypes", "unused", "unchecked" })
    private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }
        return returnMap;
    }

    private javax.xml.namespace.QName[] opNameArray = null;

    private boolean optimizeContent(javax.xml.namespace.QName opName) {

        if (opNameArray == null) {
            return false;
        }
        for (QName element : opNameArray) {
            if (opName.equals(element)) {
                return true;
            }
        }
        return false;
    }

    // http://esb1.rtwbeta.com:5380/UtoteServices/services/ToteLinkUpdateService
    @SuppressWarnings({ "unused" })
    private org.apache.axiom.om.OMElement toOM(org.tempuri.UpdateNotificationE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(org.tempuri.UpdateNotificationE.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    @SuppressWarnings({ "unused" })
    private org.apache.axiom.om.OMElement toOM(org.tempuri.StatusNotificationE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(org.tempuri.StatusNotificationE.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
            org.tempuri.UpdateNotificationE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                    throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(org.tempuri.UpdateNotificationE.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
            org.tempuri.StatusNotificationE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                    throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(org.tempuri.StatusNotificationE.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    /**
     * get the default envelope
     */
    @SuppressWarnings("unused")
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    @SuppressWarnings({ "unused", "rawtypes" })
    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type,
            java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {

        try {

            if (org.tempuri.StatusNotificationE.class.equals(type)) {

                log4j.debug("ToteLinkUpdateServiceStub.fromOM - attempting to parse as org.tempuri.StatusNotificationE");
                return org.tempuri.StatusNotificationE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (org.tempuri.UpdateNotificationE.class.equals(type)) {

                log4j.debug("ToteLinkUpdateServiceStub.fromOM - attempting to parse as org.tempuri.UpdateNotificationE");
                return org.tempuri.UpdateNotificationE.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
    }

}
