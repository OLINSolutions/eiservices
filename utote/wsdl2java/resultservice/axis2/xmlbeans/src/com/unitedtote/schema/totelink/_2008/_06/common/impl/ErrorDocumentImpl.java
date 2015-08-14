/*
 * An XML document type.
 * Localname: Error
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Common
 * Java type: com.unitedtote.schema.totelink._2008._06.common.ErrorDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.common.impl;
/**
 * A document containing one Error(@http://schema.unitedtote.com/ToteLink/2008/06/Common) element.
 *
 * This is a complex type.
 */
public class ErrorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.common.ErrorDocument
{
    
    public ErrorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERROR$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Common", "Error");
    
    
    /**
     * Gets the "Error" element
     */
    public com.unitedtote.schema.totelink._2008._06.common.Error getError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.Error target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.Error)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Error" element
     */
    public boolean isNilError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.Error target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.Error)get_store().find_element_user(ERROR$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Error" element
     */
    public void setError(com.unitedtote.schema.totelink._2008._06.common.Error error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.Error target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.Error)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.common.Error)get_store().add_element_user(ERROR$0);
            }
            target.set(error);
        }
    }
    
    /**
     * Appends and returns a new empty "Error" element
     */
    public com.unitedtote.schema.totelink._2008._06.common.Error addNewError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.Error target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.Error)get_store().add_element_user(ERROR$0);
            return target;
        }
    }
    
    /**
     * Nils the "Error" element
     */
    public void setNilError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.Error target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.Error)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.common.Error)get_store().add_element_user(ERROR$0);
            }
            target.setNil();
        }
    }
}
