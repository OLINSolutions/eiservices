/*
 * An XML document type.
 * Localname: GetEventsResponse
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.GetEventsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one GetEventsResponse(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class GetEventsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.GetEventsResponseDocument
{
    
    public GetEventsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETEVENTSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "GetEventsResponse");
    
    
    /**
     * Gets the "GetEventsResponse" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.GetEventsResponseDocument.GetEventsResponse getGetEventsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.GetEventsResponseDocument.GetEventsResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.GetEventsResponseDocument.GetEventsResponse)get_store().find_element_user(GETEVENTSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetEventsResponse" element
     */
    public void setGetEventsResponse(com.unitedtote.schema.totelink._2008._06.program.GetEventsResponseDocument.GetEventsResponse getEventsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.GetEventsResponseDocument.GetEventsResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.GetEventsResponseDocument.GetEventsResponse)get_store().find_element_user(GETEVENTSRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.GetEventsResponseDocument.GetEventsResponse)get_store().add_element_user(GETEVENTSRESPONSE$0);
            }
            target.set(getEventsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetEventsResponse" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.GetEventsResponseDocument.GetEventsResponse addNewGetEventsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.GetEventsResponseDocument.GetEventsResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.GetEventsResponseDocument.GetEventsResponse)get_store().add_element_user(GETEVENTSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetEventsResponse(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
     *
     * This is a complex type.
     */
    public static class GetEventsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.GetEventsResponseDocument.GetEventsResponse
    {
        
        public GetEventsResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
