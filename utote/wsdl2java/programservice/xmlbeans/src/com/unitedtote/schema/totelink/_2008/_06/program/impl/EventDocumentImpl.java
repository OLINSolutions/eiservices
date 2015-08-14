/*
 * An XML document type.
 * Localname: Event
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.EventDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one Event(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class EventDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.EventDocument
{
    
    public EventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENT$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Event");
    
    
    /**
     * Gets the "Event" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Event getEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Event target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Event)get_store().find_element_user(EVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Event" element
     */
    public boolean isNilEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Event target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Event)get_store().find_element_user(EVENT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Event" element
     */
    public void setEvent(com.unitedtote.schema.totelink._2008._06.program.Event event)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Event target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Event)get_store().find_element_user(EVENT$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Event)get_store().add_element_user(EVENT$0);
            }
            target.set(event);
        }
    }
    
    /**
     * Appends and returns a new empty "Event" element
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
     * Nils the "Event" element
     */
    public void setNilEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Event target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Event)get_store().find_element_user(EVENT$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Event)get_store().add_element_user(EVENT$0);
            }
            target.setNil();
        }
    }
}
