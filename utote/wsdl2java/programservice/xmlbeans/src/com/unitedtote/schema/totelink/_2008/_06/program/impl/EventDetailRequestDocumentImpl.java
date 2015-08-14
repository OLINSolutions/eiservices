/*
 * An XML document type.
 * Localname: EventDetailRequest
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.EventDetailRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one EventDetailRequest(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class EventDetailRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.EventDetailRequestDocument
{
    
    public EventDetailRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTDETAILREQUEST$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "EventDetailRequest");
    
    
    /**
     * Gets the "EventDetailRequest" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest getEventDetailRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest)get_store().find_element_user(EVENTDETAILREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "EventDetailRequest" element
     */
    public boolean isNilEventDetailRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest)get_store().find_element_user(EVENTDETAILREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EventDetailRequest" element
     */
    public void setEventDetailRequest(com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest eventDetailRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest)get_store().find_element_user(EVENTDETAILREQUEST$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest)get_store().add_element_user(EVENTDETAILREQUEST$0);
            }
            target.set(eventDetailRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "EventDetailRequest" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest addNewEventDetailRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest)get_store().add_element_user(EVENTDETAILREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "EventDetailRequest" element
     */
    public void setNilEventDetailRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest)get_store().find_element_user(EVENTDETAILREQUEST$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest)get_store().add_element_user(EVENTDETAILREQUEST$0);
            }
            target.setNil();
        }
    }
}
