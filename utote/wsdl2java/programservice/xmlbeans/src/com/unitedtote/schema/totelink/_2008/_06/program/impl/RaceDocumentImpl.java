/*
 * An XML document type.
 * Localname: Race
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.RaceDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one Race(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class RaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.RaceDocument
{
    
    public RaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RACE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Race");
    
    
    /**
     * Gets the "Race" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Race getRace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Race target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Race)get_store().find_element_user(RACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Race" element
     */
    public boolean isNilRace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Race target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Race)get_store().find_element_user(RACE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Race" element
     */
    public void setRace(com.unitedtote.schema.totelink._2008._06.program.Race race)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Race target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Race)get_store().find_element_user(RACE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Race)get_store().add_element_user(RACE$0);
            }
            target.set(race);
        }
    }
    
    /**
     * Appends and returns a new empty "Race" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Race addNewRace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Race target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Race)get_store().add_element_user(RACE$0);
            return target;
        }
    }
    
    /**
     * Nils the "Race" element
     */
    public void setNilRace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Race target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Race)get_store().find_element_user(RACE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Race)get_store().add_element_user(RACE$0);
            }
            target.setNil();
        }
    }
}
