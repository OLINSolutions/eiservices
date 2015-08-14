/*
 * XML Type:  Races
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.Races
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * An XML Races(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
 *
 * This is a complex type.
 */
public class RacesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.Races
{
    
    public RacesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RACE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Race");
    
    
    /**
     * Gets array of all "Race" elements
     */
    public com.unitedtote.schema.totelink._2008._06.program.Race[] getRaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RACE$0, targetList);
            com.unitedtote.schema.totelink._2008._06.program.Race[] result = new com.unitedtote.schema.totelink._2008._06.program.Race[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Race" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Race getRaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Race target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Race)get_store().find_element_user(RACE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Race" element
     */
    public boolean isNilRaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Race target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Race)get_store().find_element_user(RACE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Race" element
     */
    public int sizeOfRaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RACE$0);
        }
    }
    
    /**
     * Sets array of all "Race" element
     */
    public void setRaceArray(com.unitedtote.schema.totelink._2008._06.program.Race[] raceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(raceArray, RACE$0);
        }
    }
    
    /**
     * Sets ith "Race" element
     */
    public void setRaceArray(int i, com.unitedtote.schema.totelink._2008._06.program.Race race)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Race target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Race)get_store().find_element_user(RACE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(race);
        }
    }
    
    /**
     * Nils the ith "Race" element
     */
    public void setNilRaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Race target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Race)get_store().find_element_user(RACE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Race" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Race insertNewRace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Race target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Race)get_store().insert_element_user(RACE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Race" element
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
     * Removes the ith "Race" element
     */
    public void removeRace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RACE$0, i);
        }
    }
}
