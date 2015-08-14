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

        com.unitedtote.schema.totelink._2008._06.result.GetResultDocument getResult4 =
            (com.unitedtote.schema.totelink._2008._06.result.GetResultDocument) getTestObject(com.unitedtote.schema.totelink._2008._06.result.GetResultDocument.class);
        // TODO : Fill in the getResult4 here
        assertNotNull(stub.getResult(getResult4));
    }

    /**
     * Auto generated test method
     */
    public void testkeepalive() throws java.lang.Exception {
        com.ei.eiservices.utote.resultservice.client.ResultServiceStub stub = new com.ei.eiservices.utote.resultservice.client.ResultServiceStub(); //the default implementation should point to the right endpoint

        com.unitedtote.schema.totelink._2008._06.common.KeepaliveDocument keepalive6 =
            (com.unitedtote.schema.totelink._2008._06.common.KeepaliveDocument) getTestObject(com.unitedtote.schema.totelink._2008._06.common.KeepaliveDocument.class);
        // TODO : Fill in the keepalive6 here
        assertNotNull(stub.keepalive(keepalive6));
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
