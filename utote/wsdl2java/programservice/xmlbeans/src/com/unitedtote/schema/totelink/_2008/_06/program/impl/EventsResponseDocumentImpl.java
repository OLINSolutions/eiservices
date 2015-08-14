/*
 * An XML document type.
 * Localname: EventsResponse
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.EventsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one EventsResponse(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class EventsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.EventsResponseDocument
{
    
    public EventsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "EventsResponse");
    
    
    /**
     * Gets the "EventsResponse" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.EventsResponse getEventsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventsResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventsResponse)get_store().find_element_user(EVENTSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "EventsResponse" element
     */
    public boolean isNilEventsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventsResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventsResponse)get_store().find_element_user(EVENTSRESPONSE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EventsResponse" element
     */
    public void setEventsResponse(com.unitedtote.schema.totelink._2008._06.program.EventsResponse eventsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventsResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventsResponse)get_store().find_element_user(EVENTSRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.EventsResponse)get_store().add_element_user(EVENTSRESPONSE$0);
            }
            target.set(eventsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "EventsResponse" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.EventsResponse addNewEventsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventsResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventsResponse)get_store().add_element_user(EVENTSRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Nils the "EventsResponse" element
     */
    public void setNilEventsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventsResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventsResponse)get_store().find_element_user(EVENTSRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.EventsResponse)get_store().add_element_user(EVENTSRESPONSE$0);
            }
            target.setNil();
        }
    }
}
