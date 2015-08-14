/*
 * An XML document type.
 * Localname: KeepaliveResponse
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Common
 * Java type: com.unitedtote.schema.totelink._2008._06.common.KeepaliveResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.common.impl;
/**
 * A document containing one KeepaliveResponse(@http://schema.unitedtote.com/ToteLink/2008/06/Common) element.
 *
 * This is a complex type.
 */
public class KeepaliveResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.common.KeepaliveResponseDocument
{
    
    public KeepaliveResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEEPALIVERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Common", "KeepaliveResponse");
    
    
    /**
     * Gets the "KeepaliveResponse" element
     */
    public com.unitedtote.schema.totelink._2008._06.common.KeepaliveResponseDocument.KeepaliveResponse getKeepaliveResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.KeepaliveResponseDocument.KeepaliveResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.KeepaliveResponseDocument.KeepaliveResponse)get_store().find_element_user(KEEPALIVERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "KeepaliveResponse" element
     */
    public void setKeepaliveResponse(com.unitedtote.schema.totelink._2008._06.common.KeepaliveResponseDocument.KeepaliveResponse keepaliveResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.KeepaliveResponseDocument.KeepaliveResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.KeepaliveResponseDocument.KeepaliveResponse)get_store().find_element_user(KEEPALIVERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.common.KeepaliveResponseDocument.KeepaliveResponse)get_store().add_element_user(KEEPALIVERESPONSE$0);
            }
            target.set(keepaliveResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "KeepaliveResponse" element
     */
    public com.unitedtote.schema.totelink._2008._06.common.KeepaliveResponseDocument.KeepaliveResponse addNewKeepaliveResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.KeepaliveResponseDocument.KeepaliveResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.KeepaliveResponseDocument.KeepaliveResponse)get_store().add_element_user(KEEPALIVERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML KeepaliveResponse(@http://schema.unitedtote.com/ToteLink/2008/06/Common).
     *
     * This is a complex type.
     */
    public static class KeepaliveResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.common.KeepaliveResponseDocument.KeepaliveResponse
    {
        
        public KeepaliveResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
