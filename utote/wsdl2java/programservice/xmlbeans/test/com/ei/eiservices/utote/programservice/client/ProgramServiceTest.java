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

        com.unitedtote.schema.totelink._2008._06.program.GetEventDetailDocument getEventDetail8 =
            (com.unitedtote.schema.totelink._2008._06.program.GetEventDetailDocument) getTestObject(com.unitedtote.schema.totelink._2008._06.program.GetEventDetailDocument.class);
        // TODO : Fill in the getEventDetail8 here
        assertNotNull(stub.getEventDetail(getEventDetail8));
    }

    /**
     * Auto generated test method
     */
    public void testgetRace() throws java.lang.Exception {
        com.ei.eiservices.utote.programservice.client.ProgramServiceStub stub = new com.ei.eiservices.utote.programservice.client.ProgramServiceStub(); //the default implementation should point to the right endpoint

        com.unitedtote.schema.totelink._2008._06.program.GetRaceDocument getRace10 =
            (com.unitedtote.schema.totelink._2008._06.program.GetRaceDocument) getTestObject(com.unitedtote.schema.totelink._2008._06.program.GetRaceDocument.class);
        // TODO : Fill in the getRace10 here
        assertNotNull(stub.getRace(getRace10));
    }

    /**
     * Auto generated test method
     */
    public void testkeepalive() throws java.lang.Exception {
        com.ei.eiservices.utote.programservice.client.ProgramServiceStub stub = new com.ei.eiservices.utote.programservice.client.ProgramServiceStub(); //the default implementation should point to the right endpoint

        com.unitedtote.schema.totelink._2008._06.common.KeepaliveDocument keepalive12 =
            (com.unitedtote.schema.totelink._2008._06.common.KeepaliveDocument) getTestObject(com.unitedtote.schema.totelink._2008._06.common.KeepaliveDocument.class);
        // TODO : Fill in the keepalive12 here
        assertNotNull(stub.keepalive(keepalive12));
    }

    /**
     * Auto generated test method
     */
    public void testgetEvents() throws java.lang.Exception {
        com.ei.eiservices.utote.programservice.client.ProgramServiceStub stub = new com.ei.eiservices.utote.programservice.client.ProgramServiceStub(); //the default implementation should point to the right endpoint

        com.unitedtote.schema.totelink._2008._06.program.GetEventsDocument getEvents14 =
            (com.unitedtote.schema.totelink._2008._06.program.GetEventsDocument) getTestObject(com.unitedtote.schema.totelink._2008._06.program.GetEventsDocument.class);
        // TODO : Fill in the getEvents14 here
        assertNotNull(stub.getEvents(getEvents14));
    }

    //Create the desired XmlObject and provide it as the test object
    public org.apache.xmlbeans.XmlObject getTestObject(java.lang.Class type)
        throws java.lang.Exception {
        java.lang.reflect.Method creatorMethod = null;

        if (org.apache.xmlbeans.XmlObject.class.isAssignableFrom(type)) {
            Class[] declaredClasses = type.getDeclaredClasses();

            for (int i = 0; i < declaredClasses.length; i++) {
                Class declaredClass = declaredClasses[i];

                if (declaredClass.getName().endsWith("$Factory")) {
                    creatorMethod = declaredClass.getMethod("newInstance", null);

                    break;
                }
            }
        }

        if (creatorMethod != null) {
            return (org.apache.xmlbeans.XmlObject) creatorMethod.invoke(null,
                null);
        } else {
            throw new java.lang.Exception("Creator not found!");
        }
    }
}
