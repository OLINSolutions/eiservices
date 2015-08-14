/*
 * XML Type:  RaceResponse
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.RaceResponse
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * An XML RaceResponse(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
 *
 * This is a complex type.
 */
public class RaceResponseImpl extends com.unitedtote.schema.totelink._2008._06.common.impl.ToteLinkResponseImpl implements com.unitedtote.schema.totelink._2008._06.program.RaceResponse
{
    
    public RaceResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTID$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "EventId");
    private static final javax.xml.namespace.QName RACE$2 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Race");
    
    
    /**
     * Gets the "EventId" element
     */
    public java.lang.String getEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EventId" element
     */
    public org.apache.xmlbeans.XmlString xgetEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTID$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EventId" element
     */
    public boolean isNilEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EventId" element
     */
    public boolean isSetEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTID$0) != 0;
        }
    }
    
    /**
     * Sets the "EventId" element
     */
    public void setEventId(java.lang.String eventId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTID$0);
            }
            target.setStringValue(eventId);
        }
    }
    
    /**
     * Sets (as xml) the "EventId" element
     */
    public void xsetEventId(org.apache.xmlbeans.XmlString eventId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTID$0);
            }
            target.set(eventId);
        }
    }
    
    /**
     * Nils the "EventId" element
     */
    public void setNilEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTID$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EventId" element
     */
    public void unsetEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTID$0, 0);
        }
    }
    
    /**
     * Gets the "Race" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Race getRace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Race target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Race)get_store().find_element_user(RACE$2, 0);
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
            target = (com.unitedtote.schema.totelink._2008._06.program.Race)get_store().find_element_user(RACE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Race" element
     */
    public boolean isSetRace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RACE$2) != 0;
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
            target = (com.unitedtote.schema.totelink._2008._06.program.Race)get_store().find_element_user(RACE$2, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Race)get_store().add_element_user(RACE$2);
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
            target = (com.unitedtote.schema.totelink._2008._06.program.Race)get_store().add_element_user(RACE$2);
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
            target = (com.unitedtote.schema.totelink._2008._06.program.Race)get_store().find_element_user(RACE$2, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Race)get_store().add_element_user(RACE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Race" element
     */
    public void unsetRace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RACE$2, 0);
        }
    }
}
