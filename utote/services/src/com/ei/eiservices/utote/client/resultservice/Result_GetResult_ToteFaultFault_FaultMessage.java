/**
 * Result_GetResult_ToteFaultFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ei.eiservices.utote.client.resultservice;

public class Result_GetResult_ToteFaultFault_FaultMessage extends java.lang.Exception {
    private static final long serialVersionUID = 1436823852286L;
    private com.ei.eiservices.utote.client.resultservice.ResultServiceStub.ToteLinkFaultE faultMessage;

    public Result_GetResult_ToteFaultFault_FaultMessage() {
        super("Result_GetResult_ToteFaultFault_FaultMessage");
    }

    public Result_GetResult_ToteFaultFault_FaultMessage(java.lang.String s) {
        super(s);
    }

    public Result_GetResult_ToteFaultFault_FaultMessage(java.lang.String s,
        java.lang.Throwable ex) {
        super(s, ex);
    }

    public Result_GetResult_ToteFaultFault_FaultMessage(
        java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        com.ei.eiservices.utote.client.resultservice.ResultServiceStub.ToteLinkFaultE msg) {
        faultMessage = msg;
    }

    public com.ei.eiservices.utote.client.resultservice.ResultServiceStub.ToteLinkFaultE getFaultMessage() {
        return faultMessage;
    }
}
