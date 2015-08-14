/*
 * XML Type:  RaceRequest
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.RaceRequest
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * An XML RaceRequest(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
 *
 * This is a complex type.
 */
public class RaceRequestImpl extends com.unitedtote.schema.totelink._2008._06.common.impl.ToteLinkRequestImpl implements com.unitedtote.schema.totelink._2008._06.program.RaceRequest
{
    
    public RaceRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTID$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "EventId");
    private static final javax.xml.namespace.QName RACEID$2 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "RaceId");
    private static final javax.xml.namespace.QName TOURNAMENTID$4 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "TournamentId");
    private static final javax.xml.namespace.QName CONTESTID$6 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "ContestId");
    private static final javax.xml.namespace.QName PROGRAM$8 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Program");
    private static final javax.xml.namespace.QName POOLS$10 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Pools");
    private static final javax.xml.namespace.QName RUNNERS$12 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Runners");
    
    
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
     * Gets the "RaceId" element
     */
    public int getRaceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RACEID$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "RaceId" element
     */
    public org.apache.xmlbeans.XmlInt xgetRaceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RACEID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RaceId" element
     */
    public void setRaceId(int raceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RACEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RACEID$2);
            }
            target.setIntValue(raceId);
        }
    }
    
    /**
     * Sets (as xml) the "RaceId" element
     */
    public void xsetRaceId(org.apache.xmlbeans.XmlInt raceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RACEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RACEID$2);
            }
            target.set(raceId);
        }
    }
    
    /**
     * Gets the "TournamentId" element
     */
    public java.lang.String getTournamentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOURNAMENTID$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOURNAMENTID$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOURNAMENTID$4, 0);
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
            return get_store().count_elements(TOURNAMENTID$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOURNAMENTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOURNAMENTID$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOURNAMENTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOURNAMENTID$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOURNAMENTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOURNAMENTID$4);
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
            get_store().remove_element(TOURNAMENTID$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTESTID$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTESTID$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTESTID$6, 0);
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
            return get_store().count_elements(CONTESTID$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTESTID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTESTID$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTESTID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTESTID$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTESTID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTESTID$6);
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
            get_store().remove_element(CONTESTID$6, 0);
        }
    }
    
    /**
     * Gets the "Program" element
     */
    public boolean getProgram()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROGRAM$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Program" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetProgram()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROGRAM$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "Program" element
     */
    public boolean isSetProgram()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROGRAM$8) != 0;
        }
    }
    
    /**
     * Sets the "Program" element
     */
    public void setProgram(boolean program)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROGRAM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROGRAM$8);
            }
            target.setBooleanValue(program);
        }
    }
    
    /**
     * Sets (as xml) the "Program" element
     */
    public void xsetProgram(org.apache.xmlbeans.XmlBoolean program)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROGRAM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROGRAM$8);
            }
            target.set(program);
        }
    }
    
    /**
     * Unsets the "Program" element
     */
    public void unsetProgram()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROGRAM$8, 0);
        }
    }
    
    /**
     * Gets the "Pools" element
     */
    public boolean getPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POOLS$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Pools" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(POOLS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "Pools" element
     */
    public boolean isSetPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POOLS$10) != 0;
        }
    }
    
    /**
     * Sets the "Pools" element
     */
    public void setPools(boolean pools)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POOLS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POOLS$10);
            }
            target.setBooleanValue(pools);
        }
    }
    
    /**
     * Sets (as xml) the "Pools" element
     */
    public void xsetPools(org.apache.xmlbeans.XmlBoolean pools)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(POOLS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(POOLS$10);
            }
            target.set(pools);
        }
    }
    
    /**
     * Unsets the "Pools" element
     */
    public void unsetPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POOLS$10, 0);
        }
    }
    
    /**
     * Gets the "Runners" element
     */
    public boolean getRunners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUNNERS$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Runners" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetRunners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RUNNERS$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "Runners" element
     */
    public boolean isSetRunners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RUNNERS$12) != 0;
        }
    }
    
    /**
     * Sets the "Runners" element
     */
    public void setRunners(boolean runners)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUNNERS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUNNERS$12);
            }
            target.setBooleanValue(runners);
        }
    }
    
    /**
     * Sets (as xml) the "Runners" element
     */
    public void xsetRunners(org.apache.xmlbeans.XmlBoolean runners)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RUNNERS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RUNNERS$12);
            }
            target.set(runners);
        }
    }
    
    /**
     * Unsets the "Runners" element
     */
    public void unsetRunners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RUNNERS$12, 0);
        }
    }
}
