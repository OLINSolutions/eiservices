/*
 * An XML document type.
 * Localname: EventDetailResponse
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.EventDetailResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one EventDetailResponse(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class EventDetailResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.EventDetailResponseDocument
{
    
    public EventDetailResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTDETAILRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "EventDetailResponse");
    
    
    /**
     * Gets the "EventDetailResponse" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse getEventDetailResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse)get_store().find_element_user(EVENTDETAILRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "EventDetailResponse" element
     */
    public boolean isNilEventDetailResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse)get_store().find_element_user(EVENTDETAILRESPONSE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EventDetailResponse" element
     */
    public void setEventDetailResponse(com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse eventDetailResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse)get_store().find_element_user(EVENTDETAILRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse)get_store().add_element_user(EVENTDETAILRESPONSE$0);
            }
            target.set(eventDetailResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "EventDetailResponse" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse addNewEventDetailResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse)get_store().add_element_user(EVENTDETAILRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Nils the "EventDetailResponse" element
     */
    public void setNilEventDetailResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse)get_store().find_element_user(EVENTDETAILRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse)get_store().add_element_user(EVENTDETAILRESPONSE$0);
            }
            target.setNil();
        }
    }
}
