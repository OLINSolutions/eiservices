/*
 * An XML document type.
 * Localname: GetResult
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.GetResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result.impl;
/**
 * A document containing one GetResult(@http://schema.unitedtote.com/ToteLink/2008/06/Result) element.
 *
 * This is a complex type.
 */
public class GetResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.GetResultDocument
{
    
    public GetResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRESULT$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "GetResult");
    
    
    /**
     * Gets the "GetResult" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.GetResultDocument.GetResult getGetResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.GetResultDocument.GetResult target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.GetResultDocument.GetResult)get_store().find_element_user(GETRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetResult" element
     */
    public void setGetResult(com.unitedtote.schema.totelink._2008._06.result.GetResultDocument.GetResult getResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.GetResultDocument.GetResult target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.GetResultDocument.GetResult)get_store().find_element_user(GETRESULT$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.GetResultDocument.GetResult)get_store().add_element_user(GETRESULT$0);
            }
            target.set(getResult);
        }
    }
    
    /**
     * Appends and returns a new empty "GetResult" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.GetResultDocument.GetResult addNewGetResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.GetResultDocument.GetResult target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.GetResultDocument.GetResult)get_store().add_element_user(GETRESULT$0);
            return target;
        }
    }
    /**
     * An XML GetResult(@http://schema.unitedtote.com/ToteLink/2008/06/Result).
     *
     * This is a complex type.
     */
    public static class GetResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.GetResultDocument.GetResult
    {
        
        public GetResultImpl(org.apache.xmlbeans.SchemaType sType)
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
         * True if has "ResultRequest" element
         */
        public boolean isSetResultRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESULTREQUEST$0) != 0;
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
        
        /**
         * Unsets the "ResultRequest" element
         */
        public void unsetResultRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESULTREQUEST$0, 0);
            }
        }
    }
}
