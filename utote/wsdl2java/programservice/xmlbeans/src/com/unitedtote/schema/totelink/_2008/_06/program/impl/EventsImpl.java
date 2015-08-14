/*
 * XML Type:  Events
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.Events
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * An XML Events(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
 *
 * This is a complex type.
 */
public class EventsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.Events
{
    
    public EventsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENT$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Event");
    
    
    /**
     * Gets array of all "Event" elements
     */
    public com.unitedtote.schema.totelink._2008._06.program.Event[] getEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVENT$0, targetList);
            com.unitedtote.schema.totelink._2008._06.program.Event[] result = new com.unitedtote.schema.totelink._2008._06.program.Event[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Event" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Event getEventArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Event target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Event)get_store().find_element_user(EVENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Event" element
     */
    public boolean isNilEventArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Event target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Event)get_store().find_element_user(EVENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Event" element
     */
    public int sizeOfEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENT$0);
        }
    }
    
    /**
     * Sets array of all "Event" element
     */
    public void setEventArray(com.unitedtote.schema.totelink._2008._06.program.Event[] eventArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(eventArray, EVENT$0);
        }
    }
    
    /**
     * Sets ith "Event" element
     */
    public void setEventArray(int i, com.unitedtote.schema.totelink._2008._06.program.Event event)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Event target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Event)get_store().find_element_user(EVENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(event);
        }
    }
    
    /**
     * Nils the ith "Event" element
     */
    public void setNilEventArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Event target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Event)get_store().find_element_user(EVENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Event" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Event insertNewEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Event target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Event)get_store().insert_element_user(EVENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Event" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Event addNewEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Event target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Event)get_store().add_element_user(EVENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Event" element
     */
    public void removeEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENT$0, i);
        }
    }
}
