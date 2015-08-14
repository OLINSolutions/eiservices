/*
 * An XML document type.
 * Localname: ToteLinkResponse
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Common
 * Java type: com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.common.impl;
/**
 * A document containing one ToteLinkResponse(@http://schema.unitedtote.com/ToteLink/2008/06/Common) element.
 *
 * This is a complex type.
 */
public class ToteLinkResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponseDocument
{
    
    public ToteLinkResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOTELINKRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Common", "ToteLinkResponse");
    
    
    /**
     * Gets the "ToteLinkResponse" element
     */
    public com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponse getToteLinkResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponse)get_store().find_element_user(TOTELINKRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ToteLinkResponse" element
     */
    public boolean isNilToteLinkResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponse)get_store().find_element_user(TOTELINKRESPONSE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ToteLinkResponse" element
     */
    public void setToteLinkResponse(com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponse toteLinkResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponse)get_store().find_element_user(TOTELINKRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponse)get_store().add_element_user(TOTELINKRESPONSE$0);
            }
            target.set(toteLinkResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ToteLinkResponse" element
     */
    public com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponse addNewToteLinkResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponse)get_store().add_element_user(TOTELINKRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ToteLinkResponse" element
     */
    public void setNilToteLinkResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponse)get_store().find_element_user(TOTELINKRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponse)get_store().add_element_user(TOTELINKRESPONSE$0);
            }
            target.setNil();
        }
    }
}
