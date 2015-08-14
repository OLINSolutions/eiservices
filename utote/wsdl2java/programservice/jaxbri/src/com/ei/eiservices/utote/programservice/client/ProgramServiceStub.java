/**
 * ProgramServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ei.eiservices.utote.programservice.client;


/*
 *  ProgramServiceStub java implementation
 */
public class ProgramServiceStub extends org.apache.axis2.client.Stub {
    private static int counter = 0;

    //https://usdcpdxtl03.utote.com:8090/ToteLink/ProgramService/BASIC
    private static final javax.xml.bind.JAXBContext wsContext;

    static {
        javax.xml.bind.JAXBContext jc;
        jc = null;

        try {
            jc = javax.xml.bind.JAXBContext.newInstance(com.unitedtote.schema.totelink._2008._06.program.GetEventDetail.class,
                    com.unitedtote.schema.totelink._2008._06.program.GetEventDetailResponse.class,
                    com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault.class,
                    com.microsoft.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault.class,
                    com.unitedtote.schema.totelink._2008._06.program.GetRace.class,
                    com.unitedtote.schema.totelink._2008._06.program.GetRaceResponse.class,
                    com.unitedtote.schema.totelink._2008._06.common.Keepalive.class,
                    com.unitedtote.schema.totelink._2008._06.common.KeepaliveResponse.class,
                    com.unitedtote.schema.totelink._2008._06.program.GetEvents.class,
                    com.unitedtote.schema.totelink._2008._06.program.GetEventsResponse.class);
        } catch (javax.xml.bind.JAXBException ex) {
            System.err.println("Unable to create JAXBContext: " +
                ex.getMessage());
            ex.printStackTrace(System.err);
            Runtime.getRuntime().exit(-1);
        } finally {
            wsContext = jc;
        }
    }

    protected org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();

    /////////////////////////////////////////////////////////////////////////
    private javax.xml.namespace.QName[] opNameArray = null;

    /**
     *Constructor that takes in a configContext
     */
    public ProgramServiceStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public ProgramServiceStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
        //To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,
                _service);

        _service.applyPolicy();

        _serviceClient.getOptions()
                      .setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
    }

    /**
     * Default Constructor
     */
    public ProgramServiceStub(
        org.apache.axis2.context.ConfigurationContext configurationContext)
        throws org.apache.axis2.AxisFault {
        this(configurationContext,
            "https://usdcpdxtl03.utote.com:8090/ToteLink/ProgramService/BASIC");
    }

    /**
     * Default Constructor
     */
    public ProgramServiceStub() throws org.apache.axis2.AxisFault {
        this("https://usdcpdxtl03.utote.com:8090/ToteLink/ProgramService/BASIC");
    }

    /**
     * Constructor taking the target endpoint
     */
    public ProgramServiceStub(java.lang.String targetEndpoint)
        throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }

        counter = counter + 1;

        return java.lang.Long.toString(java.lang.System.currentTimeMillis()) +
        "_" + counter;
    }

    private void populateAxisService() throws org.apache.axis2.AxisFault {
        //creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService(
                "ProgramService" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[4];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://schema.unitedtote.com/ToteLink/2008/06/Program",
                "getEventDetail"));
        _service.addOperation(__operation);

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"Program-BASIC-S_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"Program-BASIC-S_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        _operations[0] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://schema.unitedtote.com/ToteLink/2008/06/Program",
                "getRace"));
        _service.addOperation(__operation);

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"Program-BASIC-S_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"Program-BASIC-S_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        _operations[1] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://schema.unitedtote.com/ToteLink/2008/06/Program",
                "keepalive"));
        _service.addOperation(__operation);

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"Program-BASIC-S_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"Program-BASIC-S_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        _operations[2] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://schema.unitedtote.com/ToteLink/2008/06/Program",
                "getEvents"));
        _service.addOperation(__operation);

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"Program-BASIC-S_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"Program-BASIC-S_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout></wsp:Policy></sp:TransportBinding></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        _operations[3] = __operation;
    }

    //populates the faults
    private void populateFaults() {
        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schema.unitedtote.com/ToteLink/Faults/2008/10",
                    "ToteLinkFault"), "GetEventDetail"),
            "com.ei.eiservices.utote.programservice.client.Program_GetEventDetail_ToteFaultFault_FaultMessage");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schema.unitedtote.com/ToteLink/Faults/2008/10",
                    "ToteLinkFault"), "GetEventDetail"),
            "com.ei.eiservices.utote.programservice.client.Program_GetEventDetail_ToteFaultFault_FaultMessage");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schema.unitedtote.com/ToteLink/Faults/2008/10",
                    "ToteLinkFault"), "GetEventDetail"),
            "com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation",
                    "ValidationFault"), "GetEventDetail"),
            "com.ei.eiservices.utote.programservice.client.Program_GetEventDetail_ValidationFaultFault_FaultMessage");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation",
                    "ValidationFault"), "GetEventDetail"),
            "com.ei.eiservices.utote.programservice.client.Program_GetEventDetail_ValidationFaultFault_FaultMessage");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation",
                    "ValidationFault"), "GetEventDetail"),
            "com.microsoft.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schema.unitedtote.com/ToteLink/Faults/2008/10",
                    "ToteLinkFault"), "GetRace"),
            "com.ei.eiservices.utote.programservice.client.Program_GetRace_ToteFaultFault_FaultMessage");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schema.unitedtote.com/ToteLink/Faults/2008/10",
                    "ToteLinkFault"), "GetRace"),
            "com.ei.eiservices.utote.programservice.client.Program_GetRace_ToteFaultFault_FaultMessage");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schema.unitedtote.com/ToteLink/Faults/2008/10",
                    "ToteLinkFault"), "GetRace"),
            "com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation",
                    "ValidationFault"), "GetRace"),
            "com.ei.eiservices.utote.programservice.client.Program_GetRace_ValidationFaultFault_FaultMessage");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation",
                    "ValidationFault"), "GetRace"),
            "com.ei.eiservices.utote.programservice.client.Program_GetRace_ValidationFaultFault_FaultMessage");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation",
                    "ValidationFault"), "GetRace"),
            "com.microsoft.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schema.unitedtote.com/ToteLink/Faults/2008/10",
                    "ToteLinkFault"), "GetEvents"),
            "com.ei.eiservices.utote.programservice.client.Program_GetEvents_ToteFaultFault_FaultMessage");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schema.unitedtote.com/ToteLink/Faults/2008/10",
                    "ToteLinkFault"), "GetEvents"),
            "com.ei.eiservices.utote.programservice.client.Program_GetEvents_ToteFaultFault_FaultMessage");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://schema.unitedtote.com/ToteLink/Faults/2008/10",
                    "ToteLinkFault"), "GetEvents"),
            "com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation",
                    "ValidationFault"), "GetEvents"),
            "com.ei.eiservices.utote.programservice.client.Program_GetEvents_ValidationFaultFault_FaultMessage");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation",
                    "ValidationFault"), "GetEvents"),
            "com.ei.eiservices.utote.programservice.client.Program_GetEvents_ValidationFaultFault_FaultMessage");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation",
                    "ValidationFault"), "GetEvents"),
            "com.microsoft.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault");
    }

    /**
     * Auto generated method signature
     *
     * @see com.ei.eiservices.utote.programservice.client.ProgramService#getEventDetail
     * @param getEventDetail
     * @throws com.ei.eiservices.utote.programservice.client.Program_GetEventDetail_ToteFaultFault_FaultMessage :
     * @throws com.ei.eiservices.utote.programservice.client.Program_GetEventDetail_ValidationFaultFault_FaultMessage :
     */
    public com.unitedtote.schema.totelink._2008._06.program.GetEventDetailResponse getEventDetail(
        com.unitedtote.schema.totelink._2008._06.program.GetEventDetail getEventDetail)
        throws java.rmi.RemoteException,
            com.ei.eiservices.utote.programservice.client.Program_GetEventDetail_ToteFaultFault_FaultMessage,
            com.ei.eiservices.utote.programservice.client.Program_GetEventDetail_ValidationFaultFault_FaultMessage {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions()
                            .setAction("http://schema.unitedtote.com/ToteLink/2008/06/Program/Program/GetEventDetail");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    getEventDetail,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://schema.unitedtote.com/ToteLink/2008/06/Program",
                            "getEventDetail")),
                    new javax.xml.namespace.QName(
                        "http://schema.unitedtote.com/ToteLink/2008/06/Program",
                        "getEventDetail"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    com.unitedtote.schema.totelink._2008._06.program.GetEventDetailResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.unitedtote.schema.totelink._2008._06.program.GetEventDetailResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetEventDetail"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetEventDetail"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetEventDetail"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.ei.eiservices.utote.programservice.client.Program_GetEventDetail_ToteFaultFault_FaultMessage) {
                            throw (com.ei.eiservices.utote.programservice.client.Program_GetEventDetail_ToteFaultFault_FaultMessage) ex;
                        }

                        if (ex instanceof com.ei.eiservices.utote.programservice.client.Program_GetEventDetail_ValidationFaultFault_FaultMessage) {
                            throw (com.ei.eiservices.utote.programservice.client.Program_GetEventDetail_ValidationFaultFault_FaultMessage) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see com.ei.eiservices.utote.programservice.client.ProgramService#getRace
     * @param getRace
     * @throws com.ei.eiservices.utote.programservice.client.Program_GetRace_ToteFaultFault_FaultMessage :
     * @throws com.ei.eiservices.utote.programservice.client.Program_GetRace_ValidationFaultFault_FaultMessage :
     */
    public com.unitedtote.schema.totelink._2008._06.program.GetRaceResponse getRace(
        com.unitedtote.schema.totelink._2008._06.program.GetRace getRace)
        throws java.rmi.RemoteException,
            com.ei.eiservices.utote.programservice.client.Program_GetRace_ToteFaultFault_FaultMessage,
            com.ei.eiservices.utote.programservice.client.Program_GetRace_ValidationFaultFault_FaultMessage {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
            _operationClient.getOptions()
                            .setAction("http://schema.unitedtote.com/ToteLink/2008/06/Program/Program/GetRace");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    getRace,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://schema.unitedtote.com/ToteLink/2008/06/Program",
                            "getRace")),
                    new javax.xml.namespace.QName(
                        "http://schema.unitedtote.com/ToteLink/2008/06/Program",
                        "getRace"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    com.unitedtote.schema.totelink._2008._06.program.GetRaceResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.unitedtote.schema.totelink._2008._06.program.GetRaceResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetRace"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetRace"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetRace"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.ei.eiservices.utote.programservice.client.Program_GetRace_ToteFaultFault_FaultMessage) {
                            throw (com.ei.eiservices.utote.programservice.client.Program_GetRace_ToteFaultFault_FaultMessage) ex;
                        }

                        if (ex instanceof com.ei.eiservices.utote.programservice.client.Program_GetRace_ValidationFaultFault_FaultMessage) {
                            throw (com.ei.eiservices.utote.programservice.client.Program_GetRace_ValidationFaultFault_FaultMessage) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see com.ei.eiservices.utote.programservice.client.ProgramService#keepalive
     * @param keepalive
     */
    public com.unitedtote.schema.totelink._2008._06.common.KeepaliveResponse keepalive(
        com.unitedtote.schema.totelink._2008._06.common.Keepalive keepalive)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
            _operationClient.getOptions()
                            .setAction("http://schema.unitedtote.com/ToteLink/2008/06/Common/Keepalive/Keepalive");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    keepalive,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://schema.unitedtote.com/ToteLink/2008/06/Program",
                            "keepalive")),
                    new javax.xml.namespace.QName(
                        "http://schema.unitedtote.com/ToteLink/2008/06/Program",
                        "keepalive"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    com.unitedtote.schema.totelink._2008._06.common.KeepaliveResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.unitedtote.schema.totelink._2008._06.common.KeepaliveResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "Keepalive"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Keepalive"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Keepalive"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see com.ei.eiservices.utote.programservice.client.ProgramService#getEvents
     * @param getEvents
     * @throws com.ei.eiservices.utote.programservice.client.Program_GetEvents_ToteFaultFault_FaultMessage :
     * @throws com.ei.eiservices.utote.programservice.client.Program_GetEvents_ValidationFaultFault_FaultMessage :
     */
    public com.unitedtote.schema.totelink._2008._06.program.GetEventsResponse getEvents(
        com.unitedtote.schema.totelink._2008._06.program.GetEvents getEvents)
        throws java.rmi.RemoteException,
            com.ei.eiservices.utote.programservice.client.Program_GetEvents_ToteFaultFault_FaultMessage,
            com.ei.eiservices.utote.programservice.client.Program_GetEvents_ValidationFaultFault_FaultMessage {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
            _operationClient.getOptions()
                            .setAction("http://schema.unitedtote.com/ToteLink/2008/06/Program/Program/GetEvents");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    getEvents,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://schema.unitedtote.com/ToteLink/2008/06/Program",
                            "getEvents")),
                    new javax.xml.namespace.QName(
                        "http://schema.unitedtote.com/ToteLink/2008/06/Program",
                        "getEvents"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    com.unitedtote.schema.totelink._2008._06.program.GetEventsResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.unitedtote.schema.totelink._2008._06.program.GetEventsResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetEvents"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetEvents"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetEvents"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof com.ei.eiservices.utote.programservice.client.Program_GetEvents_ToteFaultFault_FaultMessage) {
                            throw (com.ei.eiservices.utote.programservice.client.Program_GetEvents_ToteFaultFault_FaultMessage) ex;
                        }

                        if (ex instanceof com.ei.eiservices.utote.programservice.client.Program_GetEvents_ValidationFaultFault_FaultMessage) {
                            throw (com.ei.eiservices.utote.programservice.client.Program_GetEvents_ValidationFaultFault_FaultMessage) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     *  A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(
        org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();

        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }

        return returnMap;
    }

    ////////////////////////////////////////////////////////////////////////
    private static org.apache.neethi.Policy getPolicy(
        java.lang.String policyString) {
        return org.apache.neethi.PolicyEngine.getPolicy(org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                new java.io.StringReader(policyString)).getDocument()
                                                                                               .getXMLStreamReader(false));
    }

    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        if (opNameArray == null) {
            return false;
        }

        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;
            }
        }

        return false;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.unitedtote.schema.totelink._2008._06.program.GetEventDetail param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.unitedtote.schema.totelink._2008._06.program.GetEventDetail.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.unitedtote.schema.totelink._2008._06.program.GetEventDetail param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.unitedtote.schema.totelink._2008._06.program.GetEventDetail.class,
                    param, marshaller,
                    "http://schema.unitedtote.com/ToteLink/2008/06/Program",
                    "GetEventDetail");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://schema.unitedtote.com/ToteLink/2008/06/Program",
                    null);

            return factory.createOMElement(source, "GetEventDetail", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.unitedtote.schema.totelink._2008._06.program.GetEventDetail param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.unitedtote.schema.totelink._2008._06.program.GetEventDetailResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.unitedtote.schema.totelink._2008._06.program.GetEventDetailResponse.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.unitedtote.schema.totelink._2008._06.program.GetEventDetailResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.unitedtote.schema.totelink._2008._06.program.GetEventDetailResponse.class,
                    param, marshaller,
                    "http://schema.unitedtote.com/ToteLink/2008/06/Program",
                    "GetEventDetailResponse");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://schema.unitedtote.com/ToteLink/2008/06/Program",
                    null);

            return factory.createOMElement(source, "GetEventDetailResponse",
                namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.unitedtote.schema.totelink._2008._06.program.GetEventDetailResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault.class,
                    param, marshaller,
                    "http://schema.unitedtote.com/ToteLink/Faults/2008/10",
                    "ToteLinkFault");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://schema.unitedtote.com/ToteLink/Faults/2008/10",
                    null);

            return factory.createOMElement(source, "ToteLinkFault", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.unitedtote.schema.totelink.faults._2008._10.ToteLinkFault param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.microsoft.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.microsoft.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.microsoft.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.microsoft.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault.class,
                    param, marshaller,
                    "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation",
                    "ValidationFault");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation",
                    null);

            return factory.createOMElement(source, "ValidationFault", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.microsoft.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.unitedtote.schema.totelink._2008._06.program.GetRace param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.unitedtote.schema.totelink._2008._06.program.GetRace.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.unitedtote.schema.totelink._2008._06.program.GetRace param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.unitedtote.schema.totelink._2008._06.program.GetRace.class,
                    param, marshaller,
                    "http://schema.unitedtote.com/ToteLink/2008/06/Program",
                    "GetRace");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://schema.unitedtote.com/ToteLink/2008/06/Program",
                    null);

            return factory.createOMElement(source, "GetRace", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.unitedtote.schema.totelink._2008._06.program.GetRace param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.unitedtote.schema.totelink._2008._06.program.GetRaceResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.unitedtote.schema.totelink._2008._06.program.GetRaceResponse.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.unitedtote.schema.totelink._2008._06.program.GetRaceResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.unitedtote.schema.totelink._2008._06.program.GetRaceResponse.class,
                    param, marshaller,
                    "http://schema.unitedtote.com/ToteLink/2008/06/Program",
                    "GetRaceResponse");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://schema.unitedtote.com/ToteLink/2008/06/Program",
                    null);

            return factory.createOMElement(source, "GetRaceResponse", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.unitedtote.schema.totelink._2008._06.program.GetRaceResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.unitedtote.schema.totelink._2008._06.common.Keepalive param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.unitedtote.schema.totelink._2008._06.common.Keepalive.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.unitedtote.schema.totelink._2008._06.common.Keepalive param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.unitedtote.schema.totelink._2008._06.common.Keepalive.class,
                    param, marshaller,
                    "http://schema.unitedtote.com/ToteLink/2008/06/Common",
                    "Keepalive");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://schema.unitedtote.com/ToteLink/2008/06/Common",
                    null);

            return factory.createOMElement(source, "Keepalive", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.unitedtote.schema.totelink._2008._06.common.Keepalive param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.unitedtote.schema.totelink._2008._06.common.KeepaliveResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.unitedtote.schema.totelink._2008._06.common.KeepaliveResponse.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.unitedtote.schema.totelink._2008._06.common.KeepaliveResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.unitedtote.schema.totelink._2008._06.common.KeepaliveResponse.class,
                    param, marshaller,
                    "http://schema.unitedtote.com/ToteLink/2008/06/Common",
                    "KeepaliveResponse");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://schema.unitedtote.com/ToteLink/2008/06/Common",
                    null);

            return factory.createOMElement(source, "KeepaliveResponse",
                namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.unitedtote.schema.totelink._2008._06.common.KeepaliveResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.unitedtote.schema.totelink._2008._06.program.GetEvents param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.unitedtote.schema.totelink._2008._06.program.GetEvents.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.unitedtote.schema.totelink._2008._06.program.GetEvents param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.unitedtote.schema.totelink._2008._06.program.GetEvents.class,
                    param, marshaller,
                    "http://schema.unitedtote.com/ToteLink/2008/06/Program",
                    "GetEvents");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://schema.unitedtote.com/ToteLink/2008/06/Program",
                    null);

            return factory.createOMElement(source, "GetEvents", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.unitedtote.schema.totelink._2008._06.program.GetEvents param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.unitedtote.schema.totelink._2008._06.program.GetEventsResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.unitedtote.schema.totelink._2008._06.program.GetEventsResponse.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.unitedtote.schema.totelink._2008._06.program.GetEventsResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.unitedtote.schema.totelink._2008._06.program.GetEventsResponse.class,
                    param, marshaller,
                    "http://schema.unitedtote.com/ToteLink/2008/06/Program",
                    "GetEventsResponse");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://schema.unitedtote.com/ToteLink/2008/06/Program",
                    null);

            return factory.createOMElement(source, "GetEventsResponse",
                namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.unitedtote.schema.totelink._2008._06.program.GetEventsResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type, java.util.Map extraNamespaces)
        throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Unmarshaller unmarshaller = context.createUnmarshaller();

            return unmarshaller.unmarshal(param.getXMLStreamReaderWithoutCaching(),
                type).getValue();
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    class JaxbRIDataSource implements org.apache.axiom.om.OMDataSource {
        /**
         * Bound object for output.
         */
        private final Object outObject;

        /**
         * Bound class for output.
         */
        private final Class outClazz;

        /**
         * Marshaller.
         */
        private final javax.xml.bind.Marshaller marshaller;

        /**
         * Namespace
         */
        private String nsuri;

        /**
         * Local name
         */
        private String name;

        /**
         * Constructor from object and marshaller.
         *
         * @param obj
         * @param marshaller
         */
        public JaxbRIDataSource(Class clazz, Object obj,
            javax.xml.bind.Marshaller marshaller, String nsuri, String name) {
            this.outClazz = clazz;
            this.outObject = obj;
            this.marshaller = marshaller;
            this.nsuri = nsuri;
            this.name = name;
        }

        public void serialize(java.io.OutputStream output,
            org.apache.axiom.om.OMOutputFormat format)
            throws javax.xml.stream.XMLStreamException {
            try {
                marshaller.marshal(new javax.xml.bind.JAXBElement(
                        new javax.xml.namespace.QName(nsuri, name),
                        outObject.getClass(), outObject), output);
            } catch (javax.xml.bind.JAXBException e) {
                throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling",
                    e);
            }
        }

        public void serialize(java.io.Writer writer,
            org.apache.axiom.om.OMOutputFormat format)
            throws javax.xml.stream.XMLStreamException {
            try {
                marshaller.marshal(new javax.xml.bind.JAXBElement(
                        new javax.xml.namespace.QName(nsuri, name),
                        outObject.getClass(), outObject), writer);
            } catch (javax.xml.bind.JAXBException e) {
                throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling",
                    e);
            }
        }

        public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            try {
                marshaller.marshal(new javax.xml.bind.JAXBElement(
                        new javax.xml.namespace.QName(nsuri, name),
                        outObject.getClass(), outObject), xmlWriter);
            } catch (javax.xml.bind.JAXBException e) {
                throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling",
                    e);
            }
        }

        public javax.xml.stream.XMLStreamReader getReader()
            throws javax.xml.stream.XMLStreamException {
            try {
                javax.xml.bind.JAXBContext context = wsContext;
                org.apache.axiom.om.impl.builder.SAXOMBuilder builder = new org.apache.axiom.om.impl.builder.SAXOMBuilder();
                javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                marshaller.marshal(new javax.xml.bind.JAXBElement(
                        new javax.xml.namespace.QName(nsuri, name),
                        outObject.getClass(), outObject), builder);

                return builder.getRootElement().getXMLStreamReader();
            } catch (javax.xml.bind.JAXBException e) {
                throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling",
                    e);
            }
        }
    }
}
