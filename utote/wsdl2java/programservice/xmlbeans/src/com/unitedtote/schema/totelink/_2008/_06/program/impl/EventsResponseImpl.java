/*
 * XML Type:  EventsResponse
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.EventsResponse
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * An XML EventsResponse(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
 *
 * This is a complex type.
 */
public class EventsResponseImpl extends com.unitedtote.schema.totelink._2008._06.common.impl.ToteLinkResponseImpl implements com.unitedtote.schema.totelink._2008._06.program.EventsResponse
{
    
    public EventsResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOURNAMENTID$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "TournamentId");
    private static final javax.xml.namespace.QName CONTESTID$2 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "ContestId");
    private static final javax.xml.namespace.QName EVENTS$4 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Events");
    
    
    /**
     * Gets the "TournamentId" element
     */
    public java.lang.String getTournamentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOURNAMENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TournamentId" element
     */
    public org.apache.xmlbeans.XmlString xgetTournamentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOURNAMENTID$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "TournamentId" element
     */
    public boolean isNilTournamentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOURNAMENTID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "TournamentId" element
     */
    public boolean isSetTournamentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOURNAMENTID$0) != 0;
        }
    }
    
    /**
     * Sets the "TournamentId" element
     */
    public void setTournamentId(java.lang.String tournamentId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOURNAMENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOURNAMENTID$0);
            }
            target.setStringValue(tournamentId);
        }
    }
    
    /**
     * Sets (as xml) the "TournamentId" element
     */
    public void xsetTournamentId(org.apache.xmlbeans.XmlString tournamentId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOURNAMENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOURNAMENTID$0);
            }
            target.set(tournamentId);
        }
    }
    
    /**
     * Nils the "TournamentId" element
     */
    public void setNilTournamentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOURNAMENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOURNAMENTID$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "TournamentId" element
     */
    public void unsetTournamentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOURNAMENTID$0, 0);
        }
    }
    
    /**
     * Gets the "ContestId" element
     */
    public java.lang.String getContestId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTESTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContestId" element
     */
    public org.apache.xmlbeans.XmlString xgetContestId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTESTID$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ContestId" element
     */
    public boolean isNilContestId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTESTID$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ContestId" element
     */
    public boolean isSetContestId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTESTID$2) != 0;
        }
    }
    
    /**
     * Sets the "ContestId" element
     */
    public void setContestId(java.lang.String contestId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTESTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTESTID$2);
            }
            target.setStringValue(contestId);
        }
    }
    
    /**
     * Sets (as xml) the "ContestId" element
     */
    public void xsetContestId(org.apache.xmlbeans.XmlString contestId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTESTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTESTID$2);
            }
            target.set(contestId);
        }
    }
    
    /**
     * Nils the "ContestId" element
     */
    public void setNilContestId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTESTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTESTID$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ContestId" element
     */
    public void unsetContestId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTESTID$2, 0);
        }
    }
    
    /**
     * Gets the "Events" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Events getEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Events target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Events)get_store().find_element_user(EVENTS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Events" element
     */
    public boolean isNilEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Events target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Events)get_store().find_element_user(EVENTS$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Events" element
     */
    public boolean isSetEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTS$4) != 0;
        }
    }
    
    /**
     * Sets the "Events" element
     */
    public void setEvents(com.unitedtote.schema.totelink._2008._06.program.Events events)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Events target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Events)get_store().find_element_user(EVENTS$4, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Events)get_store().add_element_user(EVENTS$4);
            }
            target.set(events);
        }
    }
    
    /**
     * Appends and returns a new empty "Events" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Events addNewEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Events target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Events)get_store().add_element_user(EVENTS$4);
            return target;
        }
    }
    
    /**
     * Nils the "Events" element
     */
    public void setNilEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Events target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Events)get_store().find_element_user(EVENTS$4, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Events)get_store().add_element_user(EVENTS$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Events" element
     */
    public void unsetEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTS$4, 0);
        }
    }
}
