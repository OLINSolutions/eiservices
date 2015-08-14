/*
 * An XML document type.
 * Localname: RaceResponse
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.RaceResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one RaceResponse(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class RaceResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.RaceResponseDocument
{
    
    public RaceResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RACERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "RaceResponse");
    
    
    /**
     * Gets the "RaceResponse" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.RaceResponse getRaceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceResponse)get_store().find_element_user(RACERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RaceResponse" element
     */
    public boolean isNilRaceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceResponse)get_store().find_element_user(RACERESPONSE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RaceResponse" element
     */
    public void setRaceResponse(com.unitedtote.schema.totelink._2008._06.program.RaceResponse raceResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceResponse)get_store().find_element_user(RACERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceResponse)get_store().add_element_user(RACERESPONSE$0);
            }
            target.set(raceResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "RaceResponse" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.RaceResponse addNewRaceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceResponse)get_store().add_element_user(RACERESPONSE$0);
            return target;
        }
    }
    
    /**
     * Nils the "RaceResponse" element
     */
    public void setNilRaceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceResponse)get_store().find_element_user(RACERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceResponse)get_store().add_element_user(RACERESPONSE$0);
            }
            target.setNil();
        }
    }
}
