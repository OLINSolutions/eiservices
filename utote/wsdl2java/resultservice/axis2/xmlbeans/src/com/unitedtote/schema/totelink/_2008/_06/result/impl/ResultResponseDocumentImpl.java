/*
 * An XML document type.
 * Localname: ResultResponse
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.ResultResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result.impl;
/**
 * A document containing one ResultResponse(@http://schema.unitedtote.com/ToteLink/2008/06/Result) element.
 *
 * This is a complex type.
 */
public class ResultResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.ResultResponseDocument
{
    
    public ResultResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESULTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "ResultResponse");
    
    
    /**
     * Gets the "ResultResponse" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.ResultResponse getResultResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.ResultResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.ResultResponse)get_store().find_element_user(RESULTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ResultResponse" element
     */
    public boolean isNilResultResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.ResultResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.ResultResponse)get_store().find_element_user(RESULTRESPONSE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ResultResponse" element
     */
    public void setResultResponse(com.unitedtote.schema.totelink._2008._06.result.ResultResponse resultResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.ResultResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.ResultResponse)get_store().find_element_user(RESULTRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.ResultResponse)get_store().add_element_user(RESULTRESPONSE$0);
            }
            target.set(resultResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ResultResponse" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.ResultResponse addNewResultResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.ResultResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.ResultResponse)get_store().add_element_user(RESULTRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ResultResponse" element
     */
    public void setNilResultResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.ResultResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.ResultResponse)get_store().find_element_user(RESULTRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.ResultResponse)get_store().add_element_user(RESULTRESPONSE$0);
            }
            target.setNil();
        }
    }
}
