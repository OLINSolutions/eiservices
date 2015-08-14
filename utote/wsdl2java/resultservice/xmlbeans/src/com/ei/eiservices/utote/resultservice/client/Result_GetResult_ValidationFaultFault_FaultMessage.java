/**
 * Result_GetResult_ValidationFaultFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ei.eiservices.utote.resultservice.client;

public class Result_GetResult_ValidationFaultFault_FaultMessage extends java.lang.Exception {
    private static final long serialVersionUID = 1436817098803L;
    private com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument faultMessage;

    public Result_GetResult_ValidationFaultFault_FaultMessage() {
        super("Result_GetResult_ValidationFaultFault_FaultMessage");
    }

    public Result_GetResult_ValidationFaultFault_FaultMessage(
        java.lang.String s) {
        super(s);
    }

    public Result_GetResult_ValidationFaultFault_FaultMessage(
        java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public Result_GetResult_ValidationFaultFault_FaultMessage(
        java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument msg) {
        faultMessage = msg;
    }

    public com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument getFaultMessage() {
        return faultMessage;
    }
}
