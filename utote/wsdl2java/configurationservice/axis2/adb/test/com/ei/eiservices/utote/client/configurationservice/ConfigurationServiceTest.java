/**
 * ConfigurationServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ei.eiservices.utote.client.configurationservice;


/*
 *  ConfigurationServiceTest Junit test case
 */
public class ConfigurationServiceTest extends junit.framework.TestCase {
    /**
     * Auto generated test method
     */
    public void testgetConfiguration() throws java.lang.Exception {
        com.ei.eiservices.utote.client.configurationservice.ConfigurationServiceStub stub =
            new com.ei.eiservices.utote.client.configurationservice.ConfigurationServiceStub(); //the default implementation should point to the right endpoint

        com.ei.eiservices.utote.client.configurationservice.ConfigurationServiceStub.GetConfiguration getConfiguration4 =
            (com.ei.eiservices.utote.client.configurationservice.ConfigurationServiceStub.GetConfiguration) getTestObject(com.ei.eiservices.utote.client.configurationservice.ConfigurationServiceStub.GetConfiguration.class);
        // TODO : Fill in the getConfiguration4 here
        assertNotNull(stub.getConfiguration(getConfiguration4));
    }

    /**
     * Auto generated test method
     */
    public void testkeepalive() throws java.lang.Exception {
        com.ei.eiservices.utote.client.configurationservice.ConfigurationServiceStub stub =
            new com.ei.eiservices.utote.client.configurationservice.ConfigurationServiceStub(); //the default implementation should point to the right endpoint

        com.ei.eiservices.utote.client.configurationservice.ConfigurationServiceStub.Keepalive keepalive6 =
            (com.ei.eiservices.utote.client.configurationservice.ConfigurationServiceStub.Keepalive) getTestObject(com.ei.eiservices.utote.client.configurationservice.ConfigurationServiceStub.Keepalive.class);
        // TODO : Fill in the keepalive6 here
        assertNotNull(stub.keepalive(keepalive6));
    }

    //Create an ADBBean and provide it as the test object
    public org.apache.axis2.databinding.ADBBean getTestObject(
        java.lang.Class type) throws java.lang.Exception {
        return (org.apache.axis2.databinding.ADBBean) type.newInstance();
    }
}
