/*
 * An XML document type.
 * Localname: ToteLinkRequest
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Common
 * Java type: com.unitedtote.schema.totelink._2008._06.common.ToteLinkRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.common.impl;
/**
 * A document containing one ToteLinkRequest(@http://schema.unitedtote.com/ToteLink/2008/06/Common) element.
 *
 * This is a complex type.
 */
public class ToteLinkRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.common.ToteLinkRequestDocument
{
    
    public ToteLinkRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOTELINKREQUEST$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Common", "ToteLinkRequest");
    
    
    /**
     * Gets the "ToteLinkRequest" element
     */
    public com.unitedtote.schema.totelink._2008._06.common.ToteLinkRequest getToteLinkRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.ToteLinkRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.ToteLinkRequest)get_store().find_element_user(TOTELINKREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ToteLinkRequest" element
     */
    public boolean isNilToteLinkRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.ToteLinkRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.ToteLinkRequest)get_store().find_element_user(TOTELINKREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ToteLinkRequest" element
     */
    public void setToteLinkRequest(com.unitedtote.schema.totelink._2008._06.common.ToteLinkRequest toteLinkRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.ToteLinkRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.ToteLinkRequest)get_store().find_element_user(TOTELINKREQUEST$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.common.ToteLinkRequest)get_store().add_element_user(TOTELINKREQUEST$0);
            }
            target.set(toteLinkRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ToteLinkRequest" element
     */
    public com.unitedtote.schema.totelink._2008._06.common.ToteLinkRequest addNewToteLinkRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.ToteLinkRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.ToteLinkRequest)get_store().add_element_user(TOTELINKREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "ToteLinkRequest" element
     */
    public void setNilToteLinkRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.ToteLinkRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.ToteLinkRequest)get_store().find_element_user(TOTELINKREQUEST$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.common.ToteLinkRequest)get_store().add_element_user(TOTELINKREQUEST$0);
            }
            target.setNil();
        }
    }
}
