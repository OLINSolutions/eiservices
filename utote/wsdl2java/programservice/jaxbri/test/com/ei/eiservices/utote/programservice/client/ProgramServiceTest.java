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

        com.unitedtote.schema.totelink._2008._06.program.GetEventDetail getEventDetail8 =
            (com.unitedtote.schema.totelink._2008._06.program.GetEventDetail) getTestObject(com.unitedtote.schema.totelink._2008._06.program.GetEventDetail.class);
        // TODO : Fill in the getEventDetail8 here
        assertNotNull(stub.getEventDetail(getEventDetail8));
    }

    /**
     * Auto generated test method
     */
    public void testgetRace() throws java.lang.Exception {
        com.ei.eiservices.utote.programservice.client.ProgramServiceStub stub = new com.ei.eiservices.utote.programservice.client.ProgramServiceStub(); //the default implementation should point to the right endpoint

        com.unitedtote.schema.totelink._2008._06.program.GetRace getRace10 = (com.unitedtote.schema.totelink._2008._06.program.GetRace) getTestObject(com.unitedtote.schema.totelink._2008._06.program.GetRace.class);
        // TODO : Fill in the getRace10 here
        assertNotNull(stub.getRace(getRace10));
    }

    /**
     * Auto generated test method
     */
    public void testkeepalive() throws java.lang.Exception {
        com.ei.eiservices.utote.programservice.client.ProgramServiceStub stub = new com.ei.eiservices.utote.programservice.client.ProgramServiceStub(); //the default implementation should point to the right endpoint

        com.unitedtote.schema.totelink._2008._06.common.Keepalive keepalive12 = (com.unitedtote.schema.totelink._2008._06.common.Keepalive) getTestObject(com.unitedtote.schema.totelink._2008._06.common.Keepalive.class);
        // TODO : Fill in the keepalive12 here
        assertNotNull(stub.keepalive(keepalive12));
    }

    /**
     * Auto generated test method
     */
    public void testgetEvents() throws java.lang.Exception {
        com.ei.eiservices.utote.programservice.client.ProgramServiceStub stub = new com.ei.eiservices.utote.programservice.client.ProgramServiceStub(); //the default implementation should point to the right endpoint

        com.unitedtote.schema.totelink._2008._06.program.GetEvents getEvents14 = (com.unitedtote.schema.totelink._2008._06.program.GetEvents) getTestObject(com.unitedtote.schema.totelink._2008._06.program.GetEvents.class);
        // TODO : Fill in the getEvents14 here
        assertNotNull(stub.getEvents(getEvents14));
    }

    //Create an object and provide it as the test object
    public Object getTestObject(java.lang.Class type)
        throws java.lang.Exception {
        return type.newInstance();
    }
}
