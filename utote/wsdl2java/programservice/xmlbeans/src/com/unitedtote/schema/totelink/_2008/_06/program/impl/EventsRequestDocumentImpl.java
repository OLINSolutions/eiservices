/*
 * An XML document type.
 * Localname: EventsRequest
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.EventsRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one EventsRequest(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class EventsRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.EventsRequestDocument
{
    
    public EventsRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTSREQUEST$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "EventsRequest");
    
    
    /**
     * Gets the "EventsRequest" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.EventsRequest getEventsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventsRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventsRequest)get_store().find_element_user(EVENTSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "EventsRequest" element
     */
    public boolean isNilEventsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventsRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventsRequest)get_store().find_element_user(EVENTSREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EventsRequest" element
     */
    public void setEventsRequest(com.unitedtote.schema.totelink._2008._06.program.EventsRequest eventsRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventsRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventsRequest)get_store().find_element_user(EVENTSREQUEST$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.EventsRequest)get_store().add_element_user(EVENTSREQUEST$0);
            }
            target.set(eventsRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "EventsRequest" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.EventsRequest addNewEventsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventsRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventsRequest)get_store().add_element_user(EVENTSREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "EventsRequest" element
     */
    public void setNilEventsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventsRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventsRequest)get_store().find_element_user(EVENTSREQUEST$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.EventsRequest)get_store().add_element_user(EVENTSREQUEST$0);
            }
            target.setNil();
        }
    }
}
