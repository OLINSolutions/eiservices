/**
 * ResultServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ei.eiservices.utote.resultservice.client;

import javax.xml.bind.JAXBElement;

import com.unitedtote.schema.totelink._2008._06.common.*;
import com.unitedtote.schema.totelink._2008._06.result.*;

/*
 *  ResultServiceTest Junit test case
 */
public class ResultServiceTest extends junit.framework.TestCase {

	public static final String SYSTEM_ID = "TSG";
	public static final String SOURCE_ID = "EQUTST";

	private Source getSource() {
		Source source = new Source();
		source.setSystemId(SYSTEM_ID);
		source.setSourceId(SOURCE_ID);
		return source;
	}


    /**
     * Auto generated test method
     */
    public void testgetResult() throws java.lang.Exception {
    	
        com.ei.eiservices.utote.resultservice.client.ResultServiceStub stub = new com.ei.eiservices.utote.resultservice.client.ResultServiceStub(); //the default implementation should point to the right endpoint

        com.unitedtote.schema.totelink._2008._06.result.GetResult getResult4 = (com.unitedtote.schema.totelink._2008._06.result.GetResult) getTestObject(com.unitedtote.schema.totelink._2008._06.result.GetResult.class);
		
		ResultRequest resultRequest4 = new ResultRequest();
		resultRequest4.setSource(this.getSource());
		resultRequest4.setEventId("XX1");
		resultRequest4.setRaceId(1);
		com.unitedtote.schema.totelink._2008._06.result.ObjectFactory rof = new com.unitedtote.schema.totelink._2008._06.result.ObjectFactory();
		getResult4.setResultRequest(rof.createResultRequest(resultRequest4));
		
		// TODO : Fill in the getResult4 here
		GetResultResponse response4 = stub.getResult(getResult4);
		assertNotNull(response4);
		ResultResponse rResponse4 = response4.getResultResponse().getValue();
		System.out.println("From Result Service:");
		System.out.println("Event Name: " + rResponse4.getEventName());
    }

    /**
     * Auto generated test method
    public void testkeepalive() throws java.lang.Exception {
        com.ei.eiservices.utote.resultservice.client.ResultServiceStub stub = new com.ei.eiservices.utote.resultservice.client.ResultServiceStub(); //the default implementation should point to the right endpoint

        com.unitedtote.schema.totelink._2008._06.common.Keepalive keepalive6 = (com.unitedtote.schema.totelink._2008._06.common.Keepalive) getTestObject(com.unitedtote.schema.totelink._2008._06.common.Keepalive.class);
        // TODO : Fill in the keepalive6 here
        assertNotNull(stub.keepalive(keepalive6));
    }
     */

    //Create an object and provide it as the test object
    public Object getTestObject(java.lang.Class type)
        throws java.lang.Exception {
        return type.newInstance();
    }
}
