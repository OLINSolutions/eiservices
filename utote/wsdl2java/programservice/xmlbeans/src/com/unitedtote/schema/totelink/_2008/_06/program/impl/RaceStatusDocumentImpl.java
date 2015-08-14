/*
 * An XML document type.
 * Localname: RaceStatus
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.RaceStatusDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one RaceStatus(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class RaceStatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.RaceStatusDocument
{
    
    public RaceStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RACESTATUS$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "RaceStatus");
    
    
    /**
     * Gets the "RaceStatus" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.RaceStatus.Enum getRaceStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RACESTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.unitedtote.schema.totelink._2008._06.program.RaceStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "RaceStatus" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.RaceStatus xgetRaceStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceStatus target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceStatus)get_store().find_element_user(RACESTATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RaceStatus" element
     */
    public boolean isNilRaceStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceStatus target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceStatus)get_store().find_element_user(RACESTATUS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RaceStatus" element
     */
    public void setRaceStatus(com.unitedtote.schema.totelink._2008._06.program.RaceStatus.Enum raceStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RACESTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RACESTATUS$0);
            }
            target.setEnumValue(raceStatus);
        }
    }
    
    /**
     * Sets (as xml) the "RaceStatus" element
     */
    public void xsetRaceStatus(com.unitedtote.schema.totelink._2008._06.program.RaceStatus raceStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceStatus target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceStatus)get_store().find_element_user(RACESTATUS$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceStatus)get_store().add_element_user(RACESTATUS$0);
            }
            target.set(raceStatus);
        }
    }
    
    /**
     * Nils the "RaceStatus" element
     */
    public void setNilRaceStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceStatus target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceStatus)get_store().find_element_user(RACESTATUS$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceStatus)get_store().add_element_user(RACESTATUS$0);
            }
            target.setNil();
        }
    }
}
