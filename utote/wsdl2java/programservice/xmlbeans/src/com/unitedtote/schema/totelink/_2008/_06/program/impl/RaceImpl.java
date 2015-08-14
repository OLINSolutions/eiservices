/*
 * XML Type:  Race
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.Race
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * An XML Race(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
 *
 * This is a complex type.
 */
public class RaceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.Race
{
    
    public RaceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POOLS$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Pools");
    private static final javax.xml.namespace.QName RUNNERS$2 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Runners");
    private static final javax.xml.namespace.QName RACECHANGES$4 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "RaceChanges");
    private static final javax.xml.namespace.QName RACEID$6 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "RaceId");
    private static final javax.xml.namespace.QName RACESTATUS$8 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "RaceStatus");
    private static final javax.xml.namespace.QName TRACKTYPE$10 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "TrackType");
    private static final javax.xml.namespace.QName CURRENT$12 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Current");
    private static final javax.xml.namespace.QName POSTTIME$14 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "PostTime");
    private static final javax.xml.namespace.QName NUMBEROFRUNNERS$16 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "NumberOfRunners");
    private static final javax.xml.namespace.QName FINISH$18 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Finish");
    private static final javax.xml.namespace.QName PROGRAM$20 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Program");
    private static final javax.xml.namespace.QName ODDS$22 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Odds");
    private static final javax.xml.namespace.QName CONDITIONS$24 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Conditions");
    private static final javax.xml.namespace.QName RACETYPE$26 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "RaceType");
    private static final javax.xml.namespace.QName SURFACE$28 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Surface");
    private static final javax.xml.namespace.QName DISTANCE$30 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Distance");
    private static final javax.xml.namespace.QName PURSE$32 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Purse");
    private static final javax.xml.namespace.QName SEX$34 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Sex");
    private static final javax.xml.namespace.QName AGE$36 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Age");
    private static final javax.xml.namespace.QName CLAIM$38 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Claim");
    private static final javax.xml.namespace.QName LIVE$40 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Live");
    private static final javax.xml.namespace.QName POOLLIST$42 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "PoolList");
    
    
    /**
     * Gets the "Pools" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Pools getPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Pools target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Pools)get_store().find_element_user(POOLS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Pools" element
     */
    public boolean isNilPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Pools target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Pools)get_store().find_element_user(POOLS$0, 0);
            if (target == null) return false;
            return target.isNil();
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
            return get_store().count_elements(POOLS$0) != 0;
        }
    }
    
    /**
     * Sets the "Pools" element
     */
    public void setPools(com.unitedtote.schema.totelink._2008._06.program.Pools pools)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Pools target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Pools)get_store().find_element_user(POOLS$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Pools)get_store().add_element_user(POOLS$0);
            }
            target.set(pools);
        }
    }
    
    /**
     * Appends and returns a new empty "Pools" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Pools addNewPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Pools target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Pools)get_store().add_element_user(POOLS$0);
            return target;
        }
    }
    
    /**
     * Nils the "Pools" element
     */
    public void setNilPools()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Pools target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Pools)get_store().find_element_user(POOLS$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Pools)get_store().add_element_user(POOLS$0);
            }
            target.setNil();
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
            get_store().remove_element(POOLS$0, 0);
        }
    }
    
    /**
     * Gets the "Runners" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Runners getRunners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Runners target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Runners)get_store().find_element_user(RUNNERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Runners" element
     */
    public boolean isNilRunners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Runners target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Runners)get_store().find_element_user(RUNNERS$2, 0);
            if (target == null) return false;
            return target.isNil();
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
            return get_store().count_elements(RUNNERS$2) != 0;
        }
    }
    
    /**
     * Sets the "Runners" element
     */
    public void setRunners(com.unitedtote.schema.totelink._2008._06.program.Runners runners)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Runners target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Runners)get_store().find_element_user(RUNNERS$2, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Runners)get_store().add_element_user(RUNNERS$2);
            }
            target.set(runners);
        }
    }
    
    /**
     * Appends and returns a new empty "Runners" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Runners addNewRunners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Runners target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Runners)get_store().add_element_user(RUNNERS$2);
            return target;
        }
    }
    
    /**
     * Nils the "Runners" element
     */
    public void setNilRunners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Runners target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Runners)get_store().find_element_user(RUNNERS$2, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Runners)get_store().add_element_user(RUNNERS$2);
            }
            target.setNil();
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
            get_store().remove_element(RUNNERS$2, 0);
        }
    }
    
    /**
     * Gets the "RaceChanges" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.RaceChanges getRaceChanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceChanges target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceChanges)get_store().find_element_user(RACECHANGES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RaceChanges" element
     */
    public boolean isNilRaceChanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceChanges target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceChanges)get_store().find_element_user(RACECHANGES$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RaceChanges" element
     */
    public boolean isSetRaceChanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RACECHANGES$4) != 0;
        }
    }
    
    /**
     * Sets the "RaceChanges" element
     */
    public void setRaceChanges(com.unitedtote.schema.totelink._2008._06.program.RaceChanges raceChanges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceChanges target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceChanges)get_store().find_element_user(RACECHANGES$4, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceChanges)get_store().add_element_user(RACECHANGES$4);
            }
            target.set(raceChanges);
        }
    }
    
    /**
     * Appends and returns a new empty "RaceChanges" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.RaceChanges addNewRaceChanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceChanges target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceChanges)get_store().add_element_user(RACECHANGES$4);
            return target;
        }
    }
    
    /**
     * Nils the "RaceChanges" element
     */
    public void setNilRaceChanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.RaceChanges target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceChanges)get_store().find_element_user(RACECHANGES$4, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceChanges)get_store().add_element_user(RACECHANGES$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RaceChanges" element
     */
    public void unsetRaceChanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RACECHANGES$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RACEID$6, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RACEID$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RACEID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RACEID$6);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RACEID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RACEID$6);
            }
            target.set(raceId);
        }
    }
    
    /**
     * Gets the "RaceStatus" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.RaceStatus.Enum getRaceStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RACESTATUS$8, 0);
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
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceStatus)get_store().find_element_user(RACESTATUS$8, 0);
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
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceStatus)get_store().find_element_user(RACESTATUS$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RaceStatus" element
     */
    public boolean isSetRaceStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RACESTATUS$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RACESTATUS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RACESTATUS$8);
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
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceStatus)get_store().find_element_user(RACESTATUS$8, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceStatus)get_store().add_element_user(RACESTATUS$8);
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
            target = (com.unitedtote.schema.totelink._2008._06.program.RaceStatus)get_store().find_element_user(RACESTATUS$8, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceStatus)get_store().add_element_user(RACESTATUS$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RaceStatus" element
     */
    public void unsetRaceStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RACESTATUS$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKTYPE$10, 0);
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
            target = (com.unitedtote.schema.totelink._2008._06.program.TrackType)get_store().find_element_user(TRACKTYPE$10, 0);
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
            target = (com.unitedtote.schema.totelink._2008._06.program.TrackType)get_store().find_element_user(TRACKTYPE$10, 0);
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
            return get_store().count_elements(TRACKTYPE$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKTYPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRACKTYPE$10);
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
            target = (com.unitedtote.schema.totelink._2008._06.program.TrackType)get_store().find_element_user(TRACKTYPE$10, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.TrackType)get_store().add_element_user(TRACKTYPE$10);
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
            target = (com.unitedtote.schema.totelink._2008._06.program.TrackType)get_store().find_element_user(TRACKTYPE$10, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.TrackType)get_store().add_element_user(TRACKTYPE$10);
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
            get_store().remove_element(TRACKTYPE$10, 0);
        }
    }
    
    /**
     * Gets the "Current" element
     */
    public boolean getCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENT$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Current" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CURRENT$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "Current" element
     */
    public boolean isSetCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENT$12) != 0;
        }
    }
    
    /**
     * Sets the "Current" element
     */
    public void setCurrent(boolean current)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENT$12);
            }
            target.setBooleanValue(current);
        }
    }
    
    /**
     * Sets (as xml) the "Current" element
     */
    public void xsetCurrent(org.apache.xmlbeans.XmlBoolean current)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CURRENT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CURRENT$12);
            }
            target.set(current);
        }
    }
    
    /**
     * Unsets the "Current" element
     */
    public void unsetCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENT$12, 0);
        }
    }
    
    /**
     * Gets the "PostTime" element
     */
    public java.util.Calendar getPostTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTTIME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "PostTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetPostTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(POSTTIME$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PostTime" element
     */
    public boolean isNilPostTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(POSTTIME$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PostTime" element
     */
    public boolean isSetPostTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSTTIME$14) != 0;
        }
    }
    
    /**
     * Sets the "PostTime" element
     */
    public void setPostTime(java.util.Calendar postTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTTIME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTTIME$14);
            }
            target.setCalendarValue(postTime);
        }
    }
    
    /**
     * Sets (as xml) the "PostTime" element
     */
    public void xsetPostTime(org.apache.xmlbeans.XmlDateTime postTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(POSTTIME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(POSTTIME$14);
            }
            target.set(postTime);
        }
    }
    
    /**
     * Nils the "PostTime" element
     */
    public void setNilPostTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(POSTTIME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(POSTTIME$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PostTime" element
     */
    public void unsetPostTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSTTIME$14, 0);
        }
    }
    
    /**
     * Gets the "NumberOfRunners" element
     */
    public int getNumberOfRunners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFRUNNERS$16, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfRunners" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberOfRunners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFRUNNERS$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumberOfRunners" element
     */
    public boolean isSetNumberOfRunners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFRUNNERS$16) != 0;
        }
    }
    
    /**
     * Sets the "NumberOfRunners" element
     */
    public void setNumberOfRunners(int numberOfRunners)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFRUNNERS$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFRUNNERS$16);
            }
            target.setIntValue(numberOfRunners);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfRunners" element
     */
    public void xsetNumberOfRunners(org.apache.xmlbeans.XmlInt numberOfRunners)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFRUNNERS$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBEROFRUNNERS$16);
            }
            target.set(numberOfRunners);
        }
    }
    
    /**
     * Unsets the "NumberOfRunners" element
     */
    public void unsetNumberOfRunners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFRUNNERS$16, 0);
        }
    }
    
    /**
     * Gets the "Finish" element
     */
    public java.lang.String getFinish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINISH$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Finish" element
     */
    public org.apache.xmlbeans.XmlString xgetFinish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FINISH$18, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Finish" element
     */
    public boolean isNilFinish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FINISH$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Finish" element
     */
    public boolean isSetFinish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FINISH$18) != 0;
        }
    }
    
    /**
     * Sets the "Finish" element
     */
    public void setFinish(java.lang.String finish)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINISH$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FINISH$18);
            }
            target.setStringValue(finish);
        }
    }
    
    /**
     * Sets (as xml) the "Finish" element
     */
    public void xsetFinish(org.apache.xmlbeans.XmlString finish)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FINISH$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FINISH$18);
            }
            target.set(finish);
        }
    }
    
    /**
     * Nils the "Finish" element
     */
    public void setNilFinish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FINISH$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FINISH$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Finish" element
     */
    public void unsetFinish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FINISH$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROGRAM$20, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROGRAM$20, 0);
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
            return get_store().count_elements(PROGRAM$20) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROGRAM$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROGRAM$20);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROGRAM$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROGRAM$20);
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
            get_store().remove_element(PROGRAM$20, 0);
        }
    }
    
    /**
     * Gets the "Odds" element
     */
    public boolean getOdds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ODDS$22, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Odds" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetOdds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ODDS$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "Odds" element
     */
    public boolean isSetOdds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ODDS$22) != 0;
        }
    }
    
    /**
     * Sets the "Odds" element
     */
    public void setOdds(boolean odds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ODDS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ODDS$22);
            }
            target.setBooleanValue(odds);
        }
    }
    
    /**
     * Sets (as xml) the "Odds" element
     */
    public void xsetOdds(org.apache.xmlbeans.XmlBoolean odds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ODDS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ODDS$22);
            }
            target.set(odds);
        }
    }
    
    /**
     * Unsets the "Odds" element
     */
    public void unsetOdds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ODDS$22, 0);
        }
    }
    
    /**
     * Gets the "Conditions" element
     */
    public java.lang.String getConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONDITIONS$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Conditions" element
     */
    public org.apache.xmlbeans.XmlString xgetConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONDITIONS$24, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Conditions" element
     */
    public boolean isNilConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONDITIONS$24, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Conditions" element
     */
    public boolean isSetConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDITIONS$24) != 0;
        }
    }
    
    /**
     * Sets the "Conditions" element
     */
    public void setConditions(java.lang.String conditions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONDITIONS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONDITIONS$24);
            }
            target.setStringValue(conditions);
        }
    }
    
    /**
     * Sets (as xml) the "Conditions" element
     */
    public void xsetConditions(org.apache.xmlbeans.XmlString conditions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONDITIONS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONDITIONS$24);
            }
            target.set(conditions);
        }
    }
    
    /**
     * Nils the "Conditions" element
     */
    public void setNilConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONDITIONS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONDITIONS$24);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Conditions" element
     */
    public void unsetConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDITIONS$24, 0);
        }
    }
    
    /**
     * Gets the "RaceType" element
     */
    public java.lang.String getRaceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RACETYPE$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RaceType" element
     */
    public org.apache.xmlbeans.XmlString xgetRaceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RACETYPE$26, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RaceType" element
     */
    public boolean isNilRaceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RACETYPE$26, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RaceType" element
     */
    public boolean isSetRaceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RACETYPE$26) != 0;
        }
    }
    
    /**
     * Sets the "RaceType" element
     */
    public void setRaceType(java.lang.String raceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RACETYPE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RACETYPE$26);
            }
            target.setStringValue(raceType);
        }
    }
    
    /**
     * Sets (as xml) the "RaceType" element
     */
    public void xsetRaceType(org.apache.xmlbeans.XmlString raceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RACETYPE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RACETYPE$26);
            }
            target.set(raceType);
        }
    }
    
    /**
     * Nils the "RaceType" element
     */
    public void setNilRaceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RACETYPE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RACETYPE$26);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RaceType" element
     */
    public void unsetRaceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RACETYPE$26, 0);
        }
    }
    
    /**
     * Gets the "Surface" element
     */
    public java.lang.String getSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SURFACE$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Surface" element
     */
    public org.apache.xmlbeans.XmlString xgetSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SURFACE$28, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Surface" element
     */
    public boolean isNilSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SURFACE$28, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Surface" element
     */
    public boolean isSetSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SURFACE$28) != 0;
        }
    }
    
    /**
     * Sets the "Surface" element
     */
    public void setSurface(java.lang.String surface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SURFACE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SURFACE$28);
            }
            target.setStringValue(surface);
        }
    }
    
    /**
     * Sets (as xml) the "Surface" element
     */
    public void xsetSurface(org.apache.xmlbeans.XmlString surface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SURFACE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SURFACE$28);
            }
            target.set(surface);
        }
    }
    
    /**
     * Nils the "Surface" element
     */
    public void setNilSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SURFACE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SURFACE$28);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Surface" element
     */
    public void unsetSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SURFACE$28, 0);
        }
    }
    
    /**
     * Gets the "Distance" element
     */
    public java.lang.String getDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCE$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Distance" element
     */
    public org.apache.xmlbeans.XmlString xgetDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCE$30, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Distance" element
     */
    public boolean isNilDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCE$30, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Distance" element
     */
    public boolean isSetDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTANCE$30) != 0;
        }
    }
    
    /**
     * Sets the "Distance" element
     */
    public void setDistance(java.lang.String distance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCE$30);
            }
            target.setStringValue(distance);
        }
    }
    
    /**
     * Sets (as xml) the "Distance" element
     */
    public void xsetDistance(org.apache.xmlbeans.XmlString distance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTANCE$30);
            }
            target.set(distance);
        }
    }
    
    /**
     * Nils the "Distance" element
     */
    public void setNilDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTANCE$30);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Distance" element
     */
    public void unsetDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTANCE$30, 0);
        }
    }
    
    /**
     * Gets the "Purse" element
     */
    public java.math.BigDecimal getPurse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PURSE$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Purse" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetPurse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PURSE$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "Purse" element
     */
    public boolean isSetPurse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PURSE$32) != 0;
        }
    }
    
    /**
     * Sets the "Purse" element
     */
    public void setPurse(java.math.BigDecimal purse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PURSE$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PURSE$32);
            }
            target.setBigDecimalValue(purse);
        }
    }
    
    /**
     * Sets (as xml) the "Purse" element
     */
    public void xsetPurse(org.apache.xmlbeans.XmlDecimal purse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PURSE$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(PURSE$32);
            }
            target.set(purse);
        }
    }
    
    /**
     * Unsets the "Purse" element
     */
    public void unsetPurse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PURSE$32, 0);
        }
    }
    
    /**
     * Gets the "Sex" element
     */
    public java.lang.String getSex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEX$34, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Sex" element
     */
    public org.apache.xmlbeans.XmlString xgetSex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEX$34, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Sex" element
     */
    public boolean isNilSex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEX$34, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Sex" element
     */
    public boolean isSetSex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEX$34) != 0;
        }
    }
    
    /**
     * Sets the "Sex" element
     */
    public void setSex(java.lang.String sex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEX$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEX$34);
            }
            target.setStringValue(sex);
        }
    }
    
    /**
     * Sets (as xml) the "Sex" element
     */
    public void xsetSex(org.apache.xmlbeans.XmlString sex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEX$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEX$34);
            }
            target.set(sex);
        }
    }
    
    /**
     * Nils the "Sex" element
     */
    public void setNilSex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEX$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEX$34);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Sex" element
     */
    public void unsetSex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEX$34, 0);
        }
    }
    
    /**
     * Gets the "Age" element
     */
    public java.lang.String getAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGE$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Age" element
     */
    public org.apache.xmlbeans.XmlString xgetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGE$36, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Age" element
     */
    public boolean isNilAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGE$36, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Age" element
     */
    public boolean isSetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGE$36) != 0;
        }
    }
    
    /**
     * Sets the "Age" element
     */
    public void setAge(java.lang.String age)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGE$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGE$36);
            }
            target.setStringValue(age);
        }
    }
    
    /**
     * Sets (as xml) the "Age" element
     */
    public void xsetAge(org.apache.xmlbeans.XmlString age)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGE$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AGE$36);
            }
            target.set(age);
        }
    }
    
    /**
     * Nils the "Age" element
     */
    public void setNilAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGE$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AGE$36);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Age" element
     */
    public void unsetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGE$36, 0);
        }
    }
    
    /**
     * Gets the "Claim" element
     */
    public java.math.BigDecimal getClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLAIM$38, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Claim" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(CLAIM$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "Claim" element
     */
    public boolean isSetClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLAIM$38) != 0;
        }
    }
    
    /**
     * Sets the "Claim" element
     */
    public void setClaim(java.math.BigDecimal claim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLAIM$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLAIM$38);
            }
            target.setBigDecimalValue(claim);
        }
    }
    
    /**
     * Sets (as xml) the "Claim" element
     */
    public void xsetClaim(org.apache.xmlbeans.XmlDecimal claim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(CLAIM$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(CLAIM$38);
            }
            target.set(claim);
        }
    }
    
    /**
     * Unsets the "Claim" element
     */
    public void unsetClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLAIM$38, 0);
        }
    }
    
    /**
     * Gets the "Live" element
     */
    public java.lang.String getLive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIVE$40, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Live" element
     */
    public com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList xgetLive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList target = null;
            target = (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList)get_store().find_element_user(LIVE$40, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Live" element
     */
    public boolean isNilLive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList target = null;
            target = (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList)get_store().find_element_user(LIVE$40, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Live" element
     */
    public boolean isSetLive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIVE$40) != 0;
        }
    }
    
    /**
     * Sets the "Live" element
     */
    public void setLive(java.lang.String live)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIVE$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIVE$40);
            }
            target.setStringValue(live);
        }
    }
    
    /**
     * Sets (as xml) the "Live" element
     */
    public void xsetLive(com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList live)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList target = null;
            target = (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList)get_store().find_element_user(LIVE$40, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList)get_store().add_element_user(LIVE$40);
            }
            target.set(live);
        }
    }
    
    /**
     * Nils the "Live" element
     */
    public void setNilLive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList target = null;
            target = (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList)get_store().find_element_user(LIVE$40, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList)get_store().add_element_user(LIVE$40);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Live" element
     */
    public void unsetLive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIVE$40, 0);
        }
    }
    
    /**
     * Gets the "PoolList" element
     */
    public java.lang.String getPoolList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POOLLIST$42, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PoolList" element
     */
    public org.apache.xmlbeans.XmlString xgetPoolList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POOLLIST$42, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PoolList" element
     */
    public boolean isNilPoolList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POOLLIST$42, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PoolList" element
     */
    public boolean isSetPoolList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POOLLIST$42) != 0;
        }
    }
    
    /**
     * Sets the "PoolList" element
     */
    public void setPoolList(java.lang.String poolList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POOLLIST$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POOLLIST$42);
            }
            target.setStringValue(poolList);
        }
    }
    
    /**
     * Sets (as xml) the "PoolList" element
     */
    public void xsetPoolList(org.apache.xmlbeans.XmlString poolList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POOLLIST$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POOLLIST$42);
            }
            target.set(poolList);
        }
    }
    
    /**
     * Nils the "PoolList" element
     */
    public void setNilPoolList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POOLLIST$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POOLLIST$42);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PoolList" element
     */
    public void unsetPoolList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POOLLIST$42, 0);
        }
    }
}
