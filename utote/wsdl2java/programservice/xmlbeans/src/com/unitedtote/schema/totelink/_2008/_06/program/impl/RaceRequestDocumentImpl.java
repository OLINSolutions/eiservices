/*
 * An XML document type.
 * Localname: RaceRequest
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.RaceRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one RaceRequest(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class RaceRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.RaceRequestDocument
{
    
    public RaceRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RACEREQUEST$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "RaceRequest");
    
    
    /**
     * Gets the "RaceRequest" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.RaceRequest getRaceRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceRequest)get_store().find_element_user(RACEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RaceRequest" element
     */
    public boolean isNilRaceRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceRequest)get_store().find_element_user(RACEREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RaceRequest" element
     */
    public void setRaceRequest(com.unitedtote.schema.totelink._2008._06.program.RaceRequest raceRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceRequest)get_store().find_element_user(RACEREQUEST$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceRequest)get_store().add_element_user(RACEREQUEST$0);
            }
            target.set(raceRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "RaceRequest" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.RaceRequest addNewRaceRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceRequest)get_store().add_element_user(RACEREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "RaceRequest" element
     */
    public void setNilRaceRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceRequest)get_store().find_element_user(RACEREQUEST$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceRequest)get_store().add_element_user(RACEREQUEST$0);
            }
            target.setNil();
        }
    }
}
