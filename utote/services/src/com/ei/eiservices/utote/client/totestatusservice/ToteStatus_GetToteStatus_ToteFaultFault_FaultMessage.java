/**
 * ToteStatus_GetToteStatus_ToteFaultFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ei.eiservices.utote.client.totestatusservice;

public class ToteStatus_GetToteStatus_ToteFaultFault_FaultMessage extends java.lang.Exception {
    private static final long serialVersionUID = 1436986232879L;
    private com.ei.eiservices.utote.client.totestatusservice.ToteStatusServiceStub.ToteLinkFaultE faultMessage;

    public ToteStatus_GetToteStatus_ToteFaultFault_FaultMessage() {
        super("ToteStatus_GetToteStatus_ToteFaultFault_FaultMessage");
    }

    public ToteStatus_GetToteStatus_ToteFaultFault_FaultMessage(
        java.lang.String s) {
        super(s);
    }

    public ToteStatus_GetToteStatus_ToteFaultFault_FaultMessage(
        java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public ToteStatus_GetToteStatus_ToteFaultFault_FaultMessage(
        java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        com.ei.eiservices.utote.client.totestatusservice.ToteStatusServiceStub.ToteLinkFaultE msg) {
        faultMessage = msg;
    }

    public com.ei.eiservices.utote.client.totestatusservice.ToteStatusServiceStub.ToteLinkFaultE getFaultMessage() {
        return faultMessage;
    }
}
