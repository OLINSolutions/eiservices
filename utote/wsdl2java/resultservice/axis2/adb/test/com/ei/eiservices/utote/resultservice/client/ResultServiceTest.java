/**
 * ResultServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ei.eiservices.utote.resultservice.client;


/*
 *  ResultServiceTest Junit test case
 */
public class ResultServiceTest extends junit.framework.TestCase {
    /**
     * Auto generated test method
     */
    public void testgetResult() throws java.lang.Exception {
        com.ei.eiservices.utote.resultservice.client.ResultServiceStub stub = new com.ei.eiservices.utote.resultservice.client.ResultServiceStub(); //the default implementation should point to the right endpoint

        com.ei.eiservices.utote.resultservice.client.ResultServiceStub.GetResult getResult4 =
            (com.ei.eiservices.utote.resultservice.client.ResultServiceStub.GetResult) getTestObject(com.ei.eiservices.utote.resultservice.client.ResultServiceStub.GetResult.class);
        // TODO : Fill in the getResult4 here
        assertNotNull(stub.getResult(getResult4));
    }

    /**
     * Auto generated test method
     */
    public void testkeepalive() throws java.lang.Exception {
        com.ei.eiservices.utote.resultservice.client.ResultServiceStub stub = new com.ei.eiservices.utote.resultservice.client.ResultServiceStub(); //the default implementation should point to the right endpoint

        com.ei.eiservices.utote.resultservice.client.ResultServiceStub.Keepalive keepalive6 =
            (com.ei.eiservices.utote.resultservice.client.ResultServiceStub.Keepalive) getTestObject(com.ei.eiservices.utote.resultservice.client.ResultServiceStub.Keepalive.class);
        // TODO : Fill in the keepalive6 here
        assertNotNull(stub.keepalive(keepalive6));
    }

    //Create an ADBBean and provide it as the test object
    public org.apache.axis2.databinding.ADBBean getTestObject(
        java.lang.Class type) throws java.lang.Exception {
        return (org.apache.axis2.databinding.ADBBean) type.newInstance();
    }
}
