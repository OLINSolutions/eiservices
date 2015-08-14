/*
 * An XML document type.
 * Localname: GetEvents
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.GetEventsDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one GetEvents(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class GetEventsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.GetEventsDocument
{
    
    public GetEventsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETEVENTS$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "GetEvents");
    
    
    /**
     * Gets the "GetEvents" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.GetEventsDocument.GetEvents getGetEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.GetEventsDocument.GetEvents target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.GetEventsDocument.GetEvents)get_store().find_element_user(GETEVENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetEvents" element
     */
    public void setGetEvents(com.unitedtote.schema.totelink._2008._06.program.GetEventsDocument.GetEvents getEvents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.GetEventsDocument.GetEvents target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.GetEventsDocument.GetEvents)get_store().find_element_user(GETEVENTS$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.GetEventsDocument.GetEvents)get_store().add_element_user(GETEVENTS$0);
            }
            target.set(getEvents);
        }
    }
    
    /**
     * Appends and returns a new empty "GetEvents" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.GetEventsDocument.GetEvents addNewGetEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.GetEventsDocument.GetEvents target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.GetEventsDocument.GetEvents)get_store().add_element_user(GETEVENTS$0);
            return target;
        }
    }
    /**
     * An XML GetEvents(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
     *
     * This is a complex type.
     */
    public static class GetEventsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.GetEventsDocument.GetEvents
    {
        
        public GetEventsImpl(org.apache.xmlbeans.SchemaType sType)
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
         * True if has "EventsRequest" element
         */
        public boolean isSetEventsRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EVENTSREQUEST$0) != 0;
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
        
        /**
         * Unsets the "EventsRequest" element
         */
        public void unsetEventsRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EVENTSREQUEST$0, 0);
            }
        }
    }
}
