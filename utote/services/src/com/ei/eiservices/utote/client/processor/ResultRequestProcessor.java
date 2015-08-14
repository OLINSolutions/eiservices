
/**
 * ResultServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ei.eiservices.utote.client.processor;

import com.ei.eiservices.utote.Configurator;
import com.ei.eiservices.utote.client.resultservice.ResultServiceStub;

public class ResultRequestProcessor {

	private ResultServiceStub.Source getSource() {
		ResultServiceStub.Source source = new ResultServiceStub.Source();
		source.setSystemId(Configurator.getSystemId());
		source.setSourceId(Configurator.getSourceId());
		return source;
	}

	/**
	 * Auto generated test method
	 */
	public void testgetResult() throws java.lang.Exception {

		ResultServiceStub stub = new ResultServiceStub();

		ResultServiceStub.GetResult getResult4 = (ResultServiceStub.GetResult) getTestObject(
				ResultServiceStub.GetResult.class);
		
		ResultServiceStub.ResultRequest resultRequest4 = new ResultServiceStub.ResultRequest();
		resultRequest4.setSource(this.getSource());
		resultRequest4.setEventId("XX1");
		resultRequest4.setRaceId(1);
		getResult4.setResultRequest(resultRequest4);
		
		// TODO : Fill in the getResult4 here
		ResultServiceStub.GetResultResponse response4 = stub.getResult(getResult4);
		response4.getResultResponse().setSource(this.getSource());
		ResultServiceStub.ResultResponse rResponse4 = response4.getResultResponse();
		System.out.println("From Result Service:");
		System.out.println("Event Name: " + rResponse4.getEventName());
	}

	// Create an ADBBean and provide it as the test object
	public org.apache.axis2.databinding.ADBBean getTestObject(@SuppressWarnings("rawtypes") java.lang.Class type) throws java.lang.Exception {
		return (org.apache.axis2.databinding.ADBBean) type.newInstance();
	}

}
