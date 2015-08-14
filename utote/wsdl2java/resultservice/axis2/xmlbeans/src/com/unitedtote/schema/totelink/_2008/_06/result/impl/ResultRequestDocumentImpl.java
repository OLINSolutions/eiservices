/*
 * An XML document type.
 * Localname: ResultRequest
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.ResultRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result.impl;
/**
 * A document containing one ResultRequest(@http://schema.unitedtote.com/ToteLink/2008/06/Result) element.
 *
 * This is a complex type.
 */
public class ResultRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.ResultRequestDocument
{
    
    public ResultRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESULTREQUEST$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "ResultRequest");
    
    
    /**
     * Gets the "ResultRequest" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.ResultRequest getResultRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.ResultRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.ResultRequest)get_store().find_element_user(RESULTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ResultRequest" element
     */
    public boolean isNilResultRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.ResultRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.ResultRequest)get_store().find_element_user(RESULTREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ResultRequest" element
     */
    public void setResultRequest(com.unitedtote.schema.totelink._2008._06.result.ResultRequest resultRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.ResultRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.ResultRequest)get_store().find_element_user(RESULTREQUEST$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.ResultRequest)get_store().add_element_user(RESULTREQUEST$0);
            }
            target.set(resultRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ResultRequest" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.ResultRequest addNewResultRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.ResultRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.ResultRequest)get_store().add_element_user(RESULTREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "ResultRequest" element
     */
    public void setNilResultRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.ResultRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.ResultRequest)get_store().find_element_user(RESULTREQUEST$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.ResultRequest)get_store().add_element_user(RESULTREQUEST$0);
            }
            target.setNil();
        }
    }
}
