/*
 * An XML document type.
 * Localname: Entry
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.EntryDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one Entry(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class EntryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.EntryDocument
{
    
    public EntryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRY$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Entry");
    
    
    /**
     * Gets the "Entry" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Entry getEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Entry target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Entry)get_store().find_element_user(ENTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Entry" element
     */
    public boolean isNilEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Entry target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Entry)get_store().find_element_user(ENTRY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Entry" element
     */
    public void setEntry(com.unitedtote.schema.totelink._2008._06.program.Entry entry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Entry target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Entry)get_store().find_element_user(ENTRY$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Entry)get_store().add_element_user(ENTRY$0);
            }
            target.set(entry);
        }
    }
    
    /**
     * Appends and returns a new empty "Entry" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Entry addNewEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Entry target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Entry)get_store().add_element_user(ENTRY$0);
            return target;
        }
    }
    
    /**
     * Nils the "Entry" element
     */
    public void setNilEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Entry target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Entry)get_store().find_element_user(ENTRY$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Entry)get_store().add_element_user(ENTRY$0);
            }
            target.setNil();
        }
    }
}
