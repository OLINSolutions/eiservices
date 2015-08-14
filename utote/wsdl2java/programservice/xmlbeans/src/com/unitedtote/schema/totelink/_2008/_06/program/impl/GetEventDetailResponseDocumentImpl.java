/*
 * An XML document type.
 * Localname: GetEventDetailResponse
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.GetEventDetailResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one GetEventDetailResponse(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class GetEventDetailResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.GetEventDetailResponseDocument
{
    
    public GetEventDetailResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETEVENTDETAILRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "GetEventDetailResponse");
    
    
    /**
     * Gets the "GetEventDetailResponse" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.GetEventDetailResponseDocument.GetEventDetailResponse getGetEventDetailResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.GetEventDetailResponseDocument.GetEventDetailResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.GetEventDetailResponseDocument.GetEventDetailResponse)get_store().find_element_user(GETEVENTDETAILRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetEventDetailResponse" element
     */
    public void setGetEventDetailResponse(com.unitedtote.schema.totelink._2008._06.program.GetEventDetailResponseDocument.GetEventDetailResponse getEventDetailResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.GetEventDetailResponseDocument.GetEventDetailResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.GetEventDetailResponseDocument.GetEventDetailResponse)get_store().find_element_user(GETEVENTDETAILRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.GetEventDetailResponseDocument.GetEventDetailResponse)get_store().add_element_user(GETEVENTDETAILRESPONSE$0);
            }
            target.set(getEventDetailResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetEventDetailResponse" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.GetEventDetailResponseDocument.GetEventDetailResponse addNewGetEventDetailResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.GetEventDetailResponseDocument.GetEventDetailResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.GetEventDetailResponseDocument.GetEventDetailResponse)get_store().add_element_user(GETEVENTDETAILRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetEventDetailResponse(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
     *
     * This is a complex type.
     */
    public static class GetEventDetailResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.GetEventDetailResponseDocument.GetEventDetailResponse
    {
        
        public GetEventDetailResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EVENTSRESPONSE$0 = 
            new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "EventsResponse");
        
        
        /**
         * Gets the "EventsResponse" element
         */
        public com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse getEventsResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse target = null;
                target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse)get_store().find_element_user(EVENTSRESPONSE$0, 0);
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
                com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse target = null;
                target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse)get_store().find_element_user(EVENTSRESPONSE$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "EventsResponse" element
         */
        public boolean isSetEventsResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EVENTSRESPONSE$0) != 0;
            }
        }
        
        /**
         * Sets the "EventsResponse" element
         */
        public void setEventsResponse(com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse eventsResponse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse target = null;
                target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse)get_store().find_element_user(EVENTSRESPONSE$0, 0);
                if (target == null)
                {
                    target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse)get_store().add_element_user(EVENTSRESPONSE$0);
                }
                target.set(eventsResponse);
            }
        }
        
        /**
         * Appends and returns a new empty "EventsResponse" element
         */
        public com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse addNewEventsResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse target = null;
                target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse)get_store().add_element_user(EVENTSRESPONSE$0);
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
                com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse target = null;
                target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse)get_store().find_element_user(EVENTSRESPONSE$0, 0);
                if (target == null)
                {
                    target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailResponse)get_store().add_element_user(EVENTSRESPONSE$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "EventsResponse" element
         */
        public void unsetEventsResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EVENTSRESPONSE$0, 0);
            }
        }
    }
}
