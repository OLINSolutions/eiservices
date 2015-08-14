/*
 * An XML document type.
 * Localname: GetResultResponse
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.GetResultResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result.impl;
/**
 * A document containing one GetResultResponse(@http://schema.unitedtote.com/ToteLink/2008/06/Result) element.
 *
 * This is a complex type.
 */
public class GetResultResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.GetResultResponseDocument
{
    
    public GetResultResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRESULTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "GetResultResponse");
    
    
    /**
     * Gets the "GetResultResponse" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.GetResultResponseDocument.GetResultResponse getGetResultResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.GetResultResponseDocument.GetResultResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.GetResultResponseDocument.GetResultResponse)get_store().find_element_user(GETRESULTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetResultResponse" element
     */
    public void setGetResultResponse(com.unitedtote.schema.totelink._2008._06.result.GetResultResponseDocument.GetResultResponse getResultResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.GetResultResponseDocument.GetResultResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.GetResultResponseDocument.GetResultResponse)get_store().find_element_user(GETRESULTRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.GetResultResponseDocument.GetResultResponse)get_store().add_element_user(GETRESULTRESPONSE$0);
            }
            target.set(getResultResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetResultResponse" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.GetResultResponseDocument.GetResultResponse addNewGetResultResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.GetResultResponseDocument.GetResultResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.GetResultResponseDocument.GetResultResponse)get_store().add_element_user(GETRESULTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetResultResponse(@http://schema.unitedtote.com/ToteLink/2008/06/Result).
     *
     * This is a complex type.
     */
    public static class GetResultResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.GetResultResponseDocument.GetResultResponse
    {
        
        public GetResultResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
         * True if has "ResultResponse" element
         */
        public boolean isSetResultResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESULTRESPONSE$0) != 0;
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
        
        /**
         * Unsets the "ResultResponse" element
         */
        public void unsetResultResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESULTRESPONSE$0, 0);
            }
        }
    }
}
