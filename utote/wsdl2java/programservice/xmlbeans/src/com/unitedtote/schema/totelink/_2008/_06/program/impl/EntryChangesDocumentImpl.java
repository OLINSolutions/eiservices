/*
 * An XML document type.
 * Localname: EntryChanges
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.EntryChangesDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one EntryChanges(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class EntryChangesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.EntryChangesDocument
{
    
    public EntryChangesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRYCHANGES$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "EntryChanges");
    
    
    /**
     * Gets the "EntryChanges" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.EntryChanges getEntryChanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EntryChanges target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EntryChanges)get_store().find_element_user(ENTRYCHANGES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "EntryChanges" element
     */
    public boolean isNilEntryChanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EntryChanges target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EntryChanges)get_store().find_element_user(ENTRYCHANGES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EntryChanges" element
     */
    public void setEntryChanges(com.unitedtote.schema.totelink._2008._06.program.EntryChanges entryChanges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EntryChanges target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EntryChanges)get_store().find_element_user(ENTRYCHANGES$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.EntryChanges)get_store().add_element_user(ENTRYCHANGES$0);
            }
            target.set(entryChanges);
        }
    }
    
    /**
     * Appends and returns a new empty "EntryChanges" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.EntryChanges addNewEntryChanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EntryChanges target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EntryChanges)get_store().add_element_user(ENTRYCHANGES$0);
            return target;
        }
    }
    
    /**
     * Nils the "EntryChanges" element
     */
    public void setNilEntryChanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EntryChanges target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EntryChanges)get_store().find_element_user(ENTRYCHANGES$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.EntryChanges)get_store().add_element_user(ENTRYCHANGES$0);
            }
            target.setNil();
        }
    }
}
