/**
 * ProgramServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ei.eiservices.utote.programservice.client;


/*
 *  ProgramServiceTest Junit test case
 */
public class ProgramServiceTest extends junit.framework.TestCase {
    /**
     * Auto generated test method
     */
    public void testgetEventDetail() throws java.lang.Exception {
        com.ei.eiservices.utote.programservice.client.ProgramServiceStub stub = new com.ei.eiservices.utote.programservice.client.ProgramServiceStub(); //the default implementation should point to the right endpoint

        com.ei.eiservices.utote.programservice.client.ProgramServiceStub.GetEventDetail getEventDetail8 =
            (com.ei.eiservices.utote.programservice.client.ProgramServiceStub.GetEventDetail) getTestObject(com.ei.eiservices.utote.programservice.client.ProgramServiceStub.GetEventDetail.class);
        // TODO : Fill in the getEventDetail8 here
        assertNotNull(stub.getEventDetail(getEventDetail8));
    }

    /**
     * Auto generated test method
     */
    public void testgetRace() throws java.lang.Exception {
        com.ei.eiservices.utote.programservice.client.ProgramServiceStub stub = new com.ei.eiservices.utote.programservice.client.ProgramServiceStub(); //the default implementation should point to the right endpoint

        com.ei.eiservices.utote.programservice.client.ProgramServiceStub.GetRace getRace10 =
            (com.ei.eiservices.utote.programservice.client.ProgramServiceStub.GetRace) getTestObject(com.ei.eiservices.utote.programservice.client.ProgramServiceStub.GetRace.class);
        // TODO : Fill in the getRace10 here
        assertNotNull(stub.getRace(getRace10));
    }

    /**
     * Auto generated test method
     */
    public void testkeepalive() throws java.lang.Exception {
        com.ei.eiservices.utote.programservice.client.ProgramServiceStub stub = new com.ei.eiservices.utote.programservice.client.ProgramServiceStub(); //the default implementation should point to the right endpoint

        com.ei.eiservices.utote.programservice.client.ProgramServiceStub.Keepalive keepalive12 =
            (com.ei.eiservices.utote.programservice.client.ProgramServiceStub.Keepalive) getTestObject(com.ei.eiservices.utote.programservice.client.ProgramServiceStub.Keepalive.class);
        // TODO : Fill in the keepalive12 here
        assertNotNull(stub.keepalive(keepalive12));
    }

    /**
     * Auto generated test method
     */
    public void testgetEvents() throws java.lang.Exception {
        com.ei.eiservices.utote.programservice.client.ProgramServiceStub stub = new com.ei.eiservices.utote.programservice.client.ProgramServiceStub(); //the default implementation should point to the right endpoint

        com.ei.eiservices.utote.programservice.client.ProgramServiceStub.GetEvents getEvents14 =
            (com.ei.eiservices.utote.programservice.client.ProgramServiceStub.GetEvents) getTestObject(com.ei.eiservices.utote.programservice.client.ProgramServiceStub.GetEvents.class);
        // TODO : Fill in the getEvents14 here
        assertNotNull(stub.getEvents(getEvents14));
    }

    //Create an ADBBean and provide it as the test object
    public org.apache.axis2.databinding.ADBBean getTestObject(
        java.lang.Class type) throws java.lang.Exception {
        return (org.apache.axis2.databinding.ADBBean) type.newInstance();
    }
}
