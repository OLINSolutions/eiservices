/*
 * An XML document type.
 * Localname: Entries
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.EntriesDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one Entries(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class EntriesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.EntriesDocument
{
    
    public EntriesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRIES$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Entries");
    
    
    /**
     * Gets the "Entries" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Entries getEntries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Entries target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Entries)get_store().find_element_user(ENTRIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Entries" element
     */
    public boolean isNilEntries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Entries target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Entries)get_store().find_element_user(ENTRIES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Entries" element
     */
    public void setEntries(com.unitedtote.schema.totelink._2008._06.program.Entries entries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Entries target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Entries)get_store().find_element_user(ENTRIES$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Entries)get_store().add_element_user(ENTRIES$0);
            }
            target.set(entries);
        }
    }
    
    /**
     * Appends and returns a new empty "Entries" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Entries addNewEntries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Entries target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Entries)get_store().add_element_user(ENTRIES$0);
            return target;
        }
    }
    
    /**
     * Nils the "Entries" element
     */
    public void setNilEntries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Entries target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Entries)get_store().find_element_user(ENTRIES$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Entries)get_store().add_element_user(ENTRIES$0);
            }
            target.setNil();
        }
    }
}
