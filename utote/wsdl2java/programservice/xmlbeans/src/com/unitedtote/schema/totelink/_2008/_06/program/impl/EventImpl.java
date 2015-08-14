/*
 * XML Type:  Event
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.Event
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * An XML Event(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
 *
 * This is a complex type.
 */
public class EventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.Event
{
    
    public EventImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RACES$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Races");
    private static final javax.xml.namespace.QName EVENTID$2 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "EventId");
    private static final javax.xml.namespace.QName RUNID$4 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "RunId");
    private static final javax.xml.namespace.QName EVENTNAME$6 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "EventName");
    private static final javax.xml.namespace.QName TRACKID$8 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "TrackId");
    private static final javax.xml.namespace.QName TRACKNAME$10 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "TrackName");
    private static final javax.xml.namespace.QName TRACKCONDITION$12 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "TrackCondition");
    private static final javax.xml.namespace.QName TURFTRACK$14 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "TurfTrack");
    private static final javax.xml.namespace.QName EVENTTIME$16 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "EventTime");
    private static final javax.xml.namespace.QName EVENTINFO$18 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "EventInfo");
    private static final javax.xml.namespace.QName EVENTTYPE$20 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "EventType");
    private static final javax.xml.namespace.QName TRACKTYPE$22 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "TrackType");
    private static final javax.xml.namespace.QName EVENTCLASS$24 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "EventClass");
    private static final javax.xml.namespace.QName CURRENCYID$26 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "CurrencyId");
    private static final javax.xml.namespace.QName PARLAY$28 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Parlay");
    private static final javax.xml.namespace.QName CHANNEL$30 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Channel");
    private static final javax.xml.namespace.QName EVENTSTATUS$32 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "EventStatus");
    private static final javax.xml.namespace.QName RACELIST$34 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "RaceList");
    private static final javax.xml.namespace.QName BREAKTO$36 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "BreakTo");
    
    
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
     * True if has "Races" element
     */
    public boolean isSetRaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RACES$0) != 0;
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
    
    /**
     * Unsets the "Races" element
     */
    public void unsetRaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RACES$0, 0);
        }
    }
    
    /**
     * Gets the "EventId" element
     */
    public java.lang.String getEventId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTID$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTID$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTID$2, 0);
            if (target == null) return false;
            return target.isNil();
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTID$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTID$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTID$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "RunId" element
     */
    public java.lang.String getRunId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUNID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RunId" element
     */
    public org.apache.xmlbeans.XmlString xgetRunId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RUNID$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RunId" element
     */
    public boolean isNilRunId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RUNID$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RunId" element
     */
    public boolean isSetRunId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RUNID$4) != 0;
        }
    }
    
    /**
     * Sets the "RunId" element
     */
    public void setRunId(java.lang.String runId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUNID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUNID$4);
            }
            target.setStringValue(runId);
        }
    }
    
    /**
     * Sets (as xml) the "RunId" element
     */
    public void xsetRunId(org.apache.xmlbeans.XmlString runId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RUNID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RUNID$4);
            }
            target.set(runId);
        }
    }
    
    /**
     * Nils the "RunId" element
     */
    public void setNilRunId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RUNID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RUNID$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RunId" element
     */
    public void unsetRunId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RUNID$4, 0);
        }
    }
    
    /**
     * Gets the "EventName" element
     */
    public java.lang.String getEventName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EventName" element
     */
    public org.apache.xmlbeans.XmlString xgetEventName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTNAME$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EventName" element
     */
    public boolean isNilEventName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTNAME$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EventName" element
     */
    public boolean isSetEventName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTNAME$6) != 0;
        }
    }
    
    /**
     * Sets the "EventName" element
     */
    public void setEventName(java.lang.String eventName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTNAME$6);
            }
            target.setStringValue(eventName);
        }
    }
    
    /**
     * Sets (as xml) the "EventName" element
     */
    public void xsetEventName(org.apache.xmlbeans.XmlString eventName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTNAME$6);
            }
            target.set(eventName);
        }
    }
    
    /**
     * Nils the "EventName" element
     */
    public void setNilEventName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTNAME$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EventName" element
     */
    public void unsetEventName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTNAME$6, 0);
        }
    }
    
    /**
     * Gets the "TrackId" element
     */
    public java.lang.String getTrackId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TrackId" element
     */
    public org.apache.xmlbeans.XmlString xgetTrackId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKID$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "TrackId" element
     */
    public boolean isNilTrackId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKID$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "TrackId" element
     */
    public boolean isSetTrackId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACKID$8) != 0;
        }
    }
    
    /**
     * Sets the "TrackId" element
     */
    public void setTrackId(java.lang.String trackId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRACKID$8);
            }
            target.setStringValue(trackId);
        }
    }
    
    /**
     * Sets (as xml) the "TrackId" element
     */
    public void xsetTrackId(org.apache.xmlbeans.XmlString trackId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRACKID$8);
            }
            target.set(trackId);
        }
    }
    
    /**
     * Nils the "TrackId" element
     */
    public void setNilTrackId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRACKID$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "TrackId" element
     */
    public void unsetTrackId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACKID$8, 0);
        }
    }
    
    /**
     * Gets the "TrackName" element
     */
    public java.lang.String getTrackName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKNAME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TrackName" element
     */
    public org.apache.xmlbeans.XmlString xgetTrackName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKNAME$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "TrackName" element
     */
    public boolean isNilTrackName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKNAME$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "TrackName" element
     */
    public boolean isSetTrackName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACKNAME$10) != 0;
        }
    }
    
    /**
     * Sets the "TrackName" element
     */
    public void setTrackName(java.lang.String trackName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRACKNAME$10);
            }
            target.setStringValue(trackName);
        }
    }
    
    /**
     * Sets (as xml) the "TrackName" element
     */
    public void xsetTrackName(org.apache.xmlbeans.XmlString trackName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRACKNAME$10);
            }
            target.set(trackName);
        }
    }
    
    /**
     * Nils the "TrackName" element
     */
    public void setNilTrackName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRACKNAME$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "TrackName" element
     */
    public void unsetTrackName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACKNAME$10, 0);
        }
    }
    
    /**
     * Gets the "TrackCondition" element
     */
    public java.lang.String getTrackCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKCONDITION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TrackCondition" element
     */
    public org.apache.xmlbeans.XmlString xgetTrackCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKCONDITION$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "TrackCondition" element
     */
    public boolean isNilTrackCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKCONDITION$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "TrackCondition" element
     */
    public boolean isSetTrackCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACKCONDITION$12) != 0;
        }
    }
    
    /**
     * Sets the "TrackCondition" element
     */
    public void setTrackCondition(java.lang.String trackCondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKCONDITION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRACKCONDITION$12);
            }
            target.setStringValue(trackCondition);
        }
    }
    
    /**
     * Sets (as xml) the "TrackCondition" element
     */
    public void xsetTrackCondition(org.apache.xmlbeans.XmlString trackCondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKCONDITION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRACKCONDITION$12);
            }
            target.set(trackCondition);
        }
    }
    
    /**
     * Nils the "TrackCondition" element
     */
    public void setNilTrackCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKCONDITION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRACKCONDITION$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "TrackCondition" element
     */
    public void unsetTrackCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACKCONDITION$12, 0);
        }
    }
    
    /**
     * Gets the "TurfTrack" element
     */
    public java.lang.String getTurfTrack()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TURFTRACK$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TurfTrack" element
     */
    public org.apache.xmlbeans.XmlString xgetTurfTrack()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TURFTRACK$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "TurfTrack" element
     */
    public boolean isNilTurfTrack()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TURFTRACK$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "TurfTrack" element
     */
    public boolean isSetTurfTrack()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TURFTRACK$14) != 0;
        }
    }
    
    /**
     * Sets the "TurfTrack" element
     */
    public void setTurfTrack(java.lang.String turfTrack)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TURFTRACK$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TURFTRACK$14);
            }
            target.setStringValue(turfTrack);
        }
    }
    
    /**
     * Sets (as xml) the "TurfTrack" element
     */
    public void xsetTurfTrack(org.apache.xmlbeans.XmlString turfTrack)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TURFTRACK$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TURFTRACK$14);
            }
            target.set(turfTrack);
        }
    }
    
    /**
     * Nils the "TurfTrack" element
     */
    public void setNilTurfTrack()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TURFTRACK$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TURFTRACK$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "TurfTrack" element
     */
    public void unsetTurfTrack()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TURFTRACK$14, 0);
        }
    }
    
    /**
     * Gets the "EventTime" element
     */
    public java.util.Calendar getEventTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTIME$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EventTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetEventTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EVENTTIME$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "EventTime" element
     */
    public boolean isSetEventTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTTIME$16) != 0;
        }
    }
    
    /**
     * Sets the "EventTime" element
     */
    public void setEventTime(java.util.Calendar eventTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTIME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTTIME$16);
            }
            target.setCalendarValue(eventTime);
        }
    }
    
    /**
     * Sets (as xml) the "EventTime" element
     */
    public void xsetEventTime(org.apache.xmlbeans.XmlDateTime eventTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EVENTTIME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EVENTTIME$16);
            }
            target.set(eventTime);
        }
    }
    
    /**
     * Unsets the "EventTime" element
     */
    public void unsetEventTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTTIME$16, 0);
        }
    }
    
    /**
     * Gets the "EventInfo" element
     */
    public java.lang.String getEventInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTINFO$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EventInfo" element
     */
    public org.apache.xmlbeans.XmlString xgetEventInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTINFO$18, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EventInfo" element
     */
    public boolean isNilEventInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTINFO$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EventInfo" element
     */
    public boolean isSetEventInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTINFO$18) != 0;
        }
    }
    
    /**
     * Sets the "EventInfo" element
     */
    public void setEventInfo(java.lang.String eventInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTINFO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTINFO$18);
            }
            target.setStringValue(eventInfo);
        }
    }
    
    /**
     * Sets (as xml) the "EventInfo" element
     */
    public void xsetEventInfo(org.apache.xmlbeans.XmlString eventInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTINFO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTINFO$18);
            }
            target.set(eventInfo);
        }
    }
    
    /**
     * Nils the "EventInfo" element
     */
    public void setNilEventInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTINFO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTINFO$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EventInfo" element
     */
    public void unsetEventInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTINFO$18, 0);
        }
    }
    
    /**
     * Gets the "EventType" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.EventType.Enum getEventType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTYPE$20, 0);
            if (target == null)
            {
                return null;
            }
            return (com.unitedtote.schema.totelink._2008._06.program.EventType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "EventType" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.EventType xgetEventType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventType target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventType)get_store().find_element_user(EVENTTYPE$20, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EventType" element
     */
    public boolean isNilEventType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventType target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventType)get_store().find_element_user(EVENTTYPE$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EventType" element
     */
    public boolean isSetEventType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTTYPE$20) != 0;
        }
    }
    
    /**
     * Sets the "EventType" element
     */
    public void setEventType(com.unitedtote.schema.totelink._2008._06.program.EventType.Enum eventType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTYPE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTTYPE$20);
            }
            target.setEnumValue(eventType);
        }
    }
    
    /**
     * Sets (as xml) the "EventType" element
     */
    public void xsetEventType(com.unitedtote.schema.totelink._2008._06.program.EventType eventType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventType target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventType)get_store().find_element_user(EVENTTYPE$20, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.EventType)get_store().add_element_user(EVENTTYPE$20);
            }
            target.set(eventType);
        }
    }
    
    /**
     * Nils the "EventType" element
     */
    public void setNilEventType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventType target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventType)get_store().find_element_user(EVENTTYPE$20, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.EventType)get_store().add_element_user(EVENTTYPE$20);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EventType" element
     */
    public void unsetEventType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTTYPE$20, 0);
        }
    }
    
    /**
     * Gets the "TrackType" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.TrackType.Enum getTrackType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKTYPE$22, 0);
            if (target == null)
            {
                return null;
            }
            return (com.unitedtote.schema.totelink._2008._06.program.TrackType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TrackType" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.TrackType xgetTrackType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.TrackType target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.TrackType)get_store().find_element_user(TRACKTYPE$22, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "TrackType" element
     */
    public boolean isNilTrackType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.TrackType target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.TrackType)get_store().find_element_user(TRACKTYPE$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "TrackType" element
     */
    public boolean isSetTrackType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACKTYPE$22) != 0;
        }
    }
    
    /**
     * Sets the "TrackType" element
     */
    public void setTrackType(com.unitedtote.schema.totelink._2008._06.program.TrackType.Enum trackType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKTYPE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRACKTYPE$22);
            }
            target.setEnumValue(trackType);
        }
    }
    
    /**
     * Sets (as xml) the "TrackType" element
     */
    public void xsetTrackType(com.unitedtote.schema.totelink._2008._06.program.TrackType trackType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.TrackType target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.TrackType)get_store().find_element_user(TRACKTYPE$22, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.TrackType)get_store().add_element_user(TRACKTYPE$22);
            }
            target.set(trackType);
        }
    }
    
    /**
     * Nils the "TrackType" element
     */
    public void setNilTrackType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.TrackType target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.TrackType)get_store().find_element_user(TRACKTYPE$22, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.TrackType)get_store().add_element_user(TRACKTYPE$22);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "TrackType" element
     */
    public void unsetTrackType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACKTYPE$22, 0);
        }
    }
    
    /**
     * Gets the "EventClass" element
     */
    public java.lang.String getEventClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTCLASS$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EventClass" element
     */
    public org.apache.xmlbeans.XmlString xgetEventClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTCLASS$24, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EventClass" element
     */
    public boolean isNilEventClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTCLASS$24, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EventClass" element
     */
    public boolean isSetEventClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTCLASS$24) != 0;
        }
    }
    
    /**
     * Sets the "EventClass" element
     */
    public void setEventClass(java.lang.String eventClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTCLASS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTCLASS$24);
            }
            target.setStringValue(eventClass);
        }
    }
    
    /**
     * Sets (as xml) the "EventClass" element
     */
    public void xsetEventClass(org.apache.xmlbeans.XmlString eventClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTCLASS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTCLASS$24);
            }
            target.set(eventClass);
        }
    }
    
    /**
     * Nils the "EventClass" element
     */
    public void setNilEventClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTCLASS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTCLASS$24);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EventClass" element
     */
    public void unsetEventClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTCLASS$24, 0);
        }
    }
    
    /**
     * Gets the "CurrencyId" element
     */
    public java.lang.String getCurrencyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYID$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CurrencyId" element
     */
    public org.apache.xmlbeans.XmlString xgetCurrencyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCYID$26, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CurrencyId" element
     */
    public boolean isNilCurrencyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCYID$26, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CurrencyId" element
     */
    public boolean isSetCurrencyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENCYID$26) != 0;
        }
    }
    
    /**
     * Sets the "CurrencyId" element
     */
    public void setCurrencyId(java.lang.String currencyId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYID$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCYID$26);
            }
            target.setStringValue(currencyId);
        }
    }
    
    /**
     * Sets (as xml) the "CurrencyId" element
     */
    public void xsetCurrencyId(org.apache.xmlbeans.XmlString currencyId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCYID$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENCYID$26);
            }
            target.set(currencyId);
        }
    }
    
    /**
     * Nils the "CurrencyId" element
     */
    public void setNilCurrencyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCYID$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENCYID$26);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CurrencyId" element
     */
    public void unsetCurrencyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENCYID$26, 0);
        }
    }
    
    /**
     * Gets the "Parlay" element
     */
    public boolean getParlay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARLAY$28, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Parlay" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetParlay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PARLAY$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "Parlay" element
     */
    public boolean isSetParlay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARLAY$28) != 0;
        }
    }
    
    /**
     * Sets the "Parlay" element
     */
    public void setParlay(boolean parlay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARLAY$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARLAY$28);
            }
            target.setBooleanValue(parlay);
        }
    }
    
    /**
     * Sets (as xml) the "Parlay" element
     */
    public void xsetParlay(org.apache.xmlbeans.XmlBoolean parlay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PARLAY$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PARLAY$28);
            }
            target.set(parlay);
        }
    }
    
    /**
     * Unsets the "Parlay" element
     */
    public void unsetParlay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARLAY$28, 0);
        }
    }
    
    /**
     * Gets the "Channel" element
     */
    public java.lang.String getChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANNEL$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Channel" element
     */
    public org.apache.xmlbeans.XmlString xgetChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANNEL$30, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Channel" element
     */
    public boolean isNilChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANNEL$30, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Channel" element
     */
    public boolean isSetChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHANNEL$30) != 0;
        }
    }
    
    /**
     * Sets the "Channel" element
     */
    public void setChannel(java.lang.String channel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANNEL$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANNEL$30);
            }
            target.setStringValue(channel);
        }
    }
    
    /**
     * Sets (as xml) the "Channel" element
     */
    public void xsetChannel(org.apache.xmlbeans.XmlString channel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANNEL$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHANNEL$30);
            }
            target.set(channel);
        }
    }
    
    /**
     * Nils the "Channel" element
     */
    public void setNilChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANNEL$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHANNEL$30);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Channel" element
     */
    public void unsetChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHANNEL$30, 0);
        }
    }
    
    /**
     * Gets the "EventStatus" element
     */
    public java.lang.String getEventStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTSTATUS$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EventStatus" element
     */
    public org.apache.xmlbeans.XmlString xgetEventStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTSTATUS$32, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EventStatus" element
     */
    public boolean isNilEventStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTSTATUS$32, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EventStatus" element
     */
    public boolean isSetEventStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTSTATUS$32) != 0;
        }
    }
    
    /**
     * Sets the "EventStatus" element
     */
    public void setEventStatus(java.lang.String eventStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTSTATUS$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTSTATUS$32);
            }
            target.setStringValue(eventStatus);
        }
    }
    
    /**
     * Sets (as xml) the "EventStatus" element
     */
    public void xsetEventStatus(org.apache.xmlbeans.XmlString eventStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTSTATUS$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTSTATUS$32);
            }
            target.set(eventStatus);
        }
    }
    
    /**
     * Nils the "EventStatus" element
     */
    public void setNilEventStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTSTATUS$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTSTATUS$32);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EventStatus" element
     */
    public void unsetEventStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTSTATUS$32, 0);
        }
    }
    
    /**
     * Gets the "RaceList" element
     */
    public java.lang.String getRaceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RACELIST$34, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RaceList" element
     */
    public com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList xgetRaceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList target = null;
            target = (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList)get_store().find_element_user(RACELIST$34, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RaceList" element
     */
    public boolean isNilRaceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList target = null;
            target = (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList)get_store().find_element_user(RACELIST$34, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RaceList" element
     */
    public boolean isSetRaceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RACELIST$34) != 0;
        }
    }
    
    /**
     * Sets the "RaceList" element
     */
    public void setRaceList(java.lang.String raceList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RACELIST$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RACELIST$34);
            }
            target.setStringValue(raceList);
        }
    }
    
    /**
     * Sets (as xml) the "RaceList" element
     */
    public void xsetRaceList(com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList raceList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList target = null;
            target = (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList)get_store().find_element_user(RACELIST$34, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList)get_store().add_element_user(RACELIST$34);
            }
            target.set(raceList);
        }
    }
    
    /**
     * Nils the "RaceList" element
     */
    public void setNilRaceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList target = null;
            target = (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList)get_store().find_element_user(RACELIST$34, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList)get_store().add_element_user(RACELIST$34);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RaceList" element
     */
    public void unsetRaceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RACELIST$34, 0);
        }
    }
    
    /**
     * Gets the "BreakTo" element
     */
    public java.math.BigDecimal getBreakTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BREAKTO$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "BreakTo" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetBreakTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(BREAKTO$36, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "BreakTo" element
     */
    public boolean isNilBreakTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(BREAKTO$36, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "BreakTo" element
     */
    public boolean isSetBreakTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BREAKTO$36) != 0;
        }
    }
    
    /**
     * Sets the "BreakTo" element
     */
    public void setBreakTo(java.math.BigDecimal breakTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BREAKTO$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BREAKTO$36);
            }
            target.setBigDecimalValue(breakTo);
        }
    }
    
    /**
     * Sets (as xml) the "BreakTo" element
     */
    public void xsetBreakTo(org.apache.xmlbeans.XmlDecimal breakTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(BREAKTO$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(BREAKTO$36);
            }
            target.set(breakTo);
        }
    }
    
    /**
     * Nils the "BreakTo" element
     */
    public void setNilBreakTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(BREAKTO$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(BREAKTO$36);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "BreakTo" element
     */
    public void unsetBreakTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BREAKTO$36, 0);
        }
    }
}
