/*
 * An XML document type.
 * Localname: Races
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.RacesDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one Races(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class RacesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.RacesDocument
{
    
    public RacesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RACES$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Races");
    
    
    /**
     * Gets the "Races" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Races getRaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Races target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Races)get_store().find_element_user(RACES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Races" element
     */
    public boolean isNilRaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Races target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Races)get_store().find_element_user(RACES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Races" element
     */
    public void setRaces(com.unitedtote.schema.totelink._2008._06.program.Races races)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Races target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Races)get_store().find_element_user(RACES$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Races)get_store().add_element_user(RACES$0);
            }
            target.set(races);
        }
    }
    
    /**
     * Appends and returns a new empty "Races" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Races addNewRaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Races target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Races)get_store().add_element_user(RACES$0);
            return target;
        }
    }
    
    /**
     * Nils the "Races" element
     */
    public void setNilRaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Races target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Races)get_store().find_element_user(RACES$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Races)get_store().add_element_user(RACES$0);
            }
            target.setNil();
        }
    }
}
