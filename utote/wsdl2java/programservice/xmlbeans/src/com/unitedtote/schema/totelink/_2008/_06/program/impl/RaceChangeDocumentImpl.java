/*
 * An XML document type.
 * Localname: RaceChange
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.RaceChangeDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one RaceChange(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class RaceChangeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.RaceChangeDocument
{
    
    public RaceChangeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RACECHANGE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "RaceChange");
    
    
    /**
     * Gets the "RaceChange" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.RaceChange getRaceChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceChange target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceChange)get_store().find_element_user(RACECHANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RaceChange" element
     */
    public boolean isNilRaceChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceChange target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceChange)get_store().find_element_user(RACECHANGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RaceChange" element
     */
    public void setRaceChange(com.unitedtote.schema.totelink._2008._06.program.RaceChange raceChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceChange target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceChange)get_store().find_element_user(RACECHANGE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceChange)get_store().add_element_user(RACECHANGE$0);
            }
            target.set(raceChange);
        }
    }
    
    /**
     * Appends and returns a new empty "RaceChange" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.RaceChange addNewRaceChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceChange target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceChange)get_store().add_element_user(RACECHANGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "RaceChange" element
     */
    public void setNilRaceChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceChange target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceChange)get_store().find_element_user(RACECHANGE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceChange)get_store().add_element_user(RACECHANGE$0);
            }
            target.setNil();
        }
    }
}
