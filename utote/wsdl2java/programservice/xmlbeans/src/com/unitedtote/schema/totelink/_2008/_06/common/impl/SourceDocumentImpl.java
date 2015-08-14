/*
 * An XML document type.
 * Localname: Source
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Common
 * Java type: com.unitedtote.schema.totelink._2008._06.common.SourceDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.common.impl;
/**
 * A document containing one Source(@http://schema.unitedtote.com/ToteLink/2008/06/Common) element.
 *
 * This is a complex type.
 */
public class SourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.common.SourceDocument
{
    
    public SourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Common", "Source");
    
    
    /**
     * Gets the "Source" element
     */
    public com.unitedtote.schema.totelink._2008._06.common.Source getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.Source target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.Source)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Source" element
     */
    public boolean isNilSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.Source target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.Source)get_store().find_element_user(SOURCE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Source" element
     */
    public void setSource(com.unitedtote.schema.totelink._2008._06.common.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.Source target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.Source)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.common.Source)get_store().add_element_user(SOURCE$0);
            }
            target.set(source);
        }
    }
    
    /**
     * Appends and returns a new empty "Source" element
     */
    public com.unitedtote.schema.totelink._2008._06.common.Source addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.Source target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.Source)get_store().add_element_user(SOURCE$0);
            return target;
        }
    }
    
    /**
     * Nils the "Source" element
     */
    public void setNilSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.Source target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.Source)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.common.Source)get_store().add_element_user(SOURCE$0);
            }
            target.setNil();
        }
    }
}
