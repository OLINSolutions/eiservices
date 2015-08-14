/**
 * Program_GetEvents_ValidationFaultFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ei.eiservices.utote.programservice.client;

public class Program_GetEvents_ValidationFaultFault_FaultMessage extends java.lang.Exception {
    private static final long serialVersionUID = 1436811125414L;
    private com.microsoft.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault faultMessage;

    public Program_GetEvents_ValidationFaultFault_FaultMessage() {
        super("Program_GetEvents_ValidationFaultFault_FaultMessage");
    }

    public Program_GetEvents_ValidationFaultFault_FaultMessage(
        java.lang.String s) {
        super(s);
    }

    public Program_GetEvents_ValidationFaultFault_FaultMessage(
        java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public Program_GetEvents_ValidationFaultFault_FaultMessage(
        java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        com.microsoft.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault msg) {
        faultMessage = msg;
    }

    public com.microsoft.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault getFaultMessage() {
        return faultMessage;
    }
}
