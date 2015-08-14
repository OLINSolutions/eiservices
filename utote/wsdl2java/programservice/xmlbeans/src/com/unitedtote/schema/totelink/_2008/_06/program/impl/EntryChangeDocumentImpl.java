/*
 * An XML document type.
 * Localname: EntryChange
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.EntryChangeDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one EntryChange(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class EntryChangeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.EntryChangeDocument
{
    
    public EntryChangeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRYCHANGE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "EntryChange");
    
    
    /**
     * Gets the "EntryChange" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.EntryChange getEntryChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EntryChange target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EntryChange)get_store().find_element_user(ENTRYCHANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "EntryChange" element
     */
    public boolean isNilEntryChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EntryChange target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EntryChange)get_store().find_element_user(ENTRYCHANGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EntryChange" element
     */
    public void setEntryChange(com.unitedtote.schema.totelink._2008._06.program.EntryChange entryChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EntryChange target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EntryChange)get_store().find_element_user(ENTRYCHANGE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.EntryChange)get_store().add_element_user(ENTRYCHANGE$0);
            }
            target.set(entryChange);
        }
    }
    
    /**
     * Appends and returns a new empty "EntryChange" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.EntryChange addNewEntryChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EntryChange target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EntryChange)get_store().add_element_user(ENTRYCHANGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "EntryChange" element
     */
    public void setNilEntryChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EntryChange target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EntryChange)get_store().find_element_user(ENTRYCHANGE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.EntryChange)get_store().add_element_user(ENTRYCHANGE$0);
            }
            target.setNil();
        }
    }
}
