/*
 * An XML document type.
 * Localname: RaceChanges
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.RaceChangesDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one RaceChanges(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class RaceChangesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.RaceChangesDocument
{
    
    public RaceChangesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RACECHANGES$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "RaceChanges");
    
    
    /**
     * Gets the "RaceChanges" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.RaceChanges getRaceChanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceChanges target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceChanges)get_store().find_element_user(RACECHANGES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RaceChanges" element
     */
    public boolean isNilRaceChanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceChanges target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceChanges)get_store().find_element_user(RACECHANGES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RaceChanges" element
     */
    public void setRaceChanges(com.unitedtote.schema.totelink._2008._06.program.RaceChanges raceChanges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceChanges target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceChanges)get_store().find_element_user(RACECHANGES$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceChanges)get_store().add_element_user(RACECHANGES$0);
            }
            target.set(raceChanges);
        }
    }
    
    /**
     * Appends and returns a new empty "RaceChanges" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.RaceChanges addNewRaceChanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceChanges target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceChanges)get_store().add_element_user(RACECHANGES$0);
            return target;
        }
    }
    
    /**
     * Nils the "RaceChanges" element
     */
    public void setNilRaceChanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceChanges target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceChanges)get_store().find_element_user(RACECHANGES$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceChanges)get_store().add_element_user(RACECHANGES$0);
            }
            target.setNil();
        }
    }
}
