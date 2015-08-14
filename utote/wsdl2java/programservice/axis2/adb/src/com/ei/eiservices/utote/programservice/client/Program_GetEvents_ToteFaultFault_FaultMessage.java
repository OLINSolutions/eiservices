/**
 * Program_GetEvents_ToteFaultFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ei.eiservices.utote.programservice.client;

public class Program_GetEvents_ToteFaultFault_FaultMessage extends java.lang.Exception {
    private static final long serialVersionUID = 1436824150863L;
    private com.ei.eiservices.utote.programservice.client.ProgramServiceStub.ToteLinkFaultE faultMessage;

    public Program_GetEvents_ToteFaultFault_FaultMessage() {
        super("Program_GetEvents_ToteFaultFault_FaultMessage");
    }

    public Program_GetEvents_ToteFaultFault_FaultMessage(java.lang.String s) {
        super(s);
    }

    public Program_GetEvents_ToteFaultFault_FaultMessage(java.lang.String s,
        java.lang.Throwable ex) {
        super(s, ex);
    }

    public Program_GetEvents_ToteFaultFault_FaultMessage(
        java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        com.ei.eiservices.utote.programservice.client.ProgramServiceStub.ToteLinkFaultE msg) {
        faultMessage = msg;
    }

    public com.ei.eiservices.utote.programservice.client.ProgramServiceStub.ToteLinkFaultE getFaultMessage() {
        return faultMessage;
    }
}
