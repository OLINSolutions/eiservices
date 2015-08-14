/*
 * An XML document type.
 * Localname: Events
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.EventsDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one Events(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class EventsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.EventsDocument
{
    
    public EventsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTS$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "Events");
    
    
    /**
     * Gets the "Events" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.Events getEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.Events target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.Events)get_store().find_element_user(EVENTS$0, 0);
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
            target = (com.unitedtote.schema.totelink._2008._06.program.Events)get_store().find_element_user(EVENTS$0, 0);
            if (target == null) return false;
            return target.isNil();
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
            target = (com.unitedtote.schema.totelink._2008._06.program.Events)get_store().find_element_user(EVENTS$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Events)get_store().add_element_user(EVENTS$0);
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
            target = (com.unitedtote.schema.totelink._2008._06.program.Events)get_store().add_element_user(EVENTS$0);
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
            target = (com.unitedtote.schema.totelink._2008._06.program.Events)get_store().find_element_user(EVENTS$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.Events)get_store().add_element_user(EVENTS$0);
            }
            target.setNil();
        }
    }
}
