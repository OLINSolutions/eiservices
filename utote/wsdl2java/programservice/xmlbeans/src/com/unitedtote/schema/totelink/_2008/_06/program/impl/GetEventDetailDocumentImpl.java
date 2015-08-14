/*
 * An XML document type.
 * Localname: GetEventDetail
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.GetEventDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one GetEventDetail(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class GetEventDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.GetEventDetailDocument
{
    
    public GetEventDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETEVENTDETAIL$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "GetEventDetail");
    
    
    /**
     * Gets the "GetEventDetail" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.GetEventDetailDocument.GetEventDetail getGetEventDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.GetEventDetailDocument.GetEventDetail target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.GetEventDetailDocument.GetEventDetail)get_store().find_element_user(GETEVENTDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetEventDetail" element
     */
    public void setGetEventDetail(com.unitedtote.schema.totelink._2008._06.program.GetEventDetailDocument.GetEventDetail getEventDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.GetEventDetailDocument.GetEventDetail target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.GetEventDetailDocument.GetEventDetail)get_store().find_element_user(GETEVENTDETAIL$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.GetEventDetailDocument.GetEventDetail)get_store().add_element_user(GETEVENTDETAIL$0);
            }
            target.set(getEventDetail);
        }
    }
    
    /**
     * Appends and returns a new empty "GetEventDetail" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.GetEventDetailDocument.GetEventDetail addNewGetEventDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.GetEventDetailDocument.GetEventDetail target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.GetEventDetailDocument.GetEventDetail)get_store().add_element_user(GETEVENTDETAIL$0);
            return target;
        }
    }
    /**
     * An XML GetEventDetail(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
     *
     * This is a complex type.
     */
    public static class GetEventDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.GetEventDetailDocument.GetEventDetail
    {
        
        public GetEventDetailImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EVENTSREQUEST$0 = 
            new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "EventsRequest");
        
        
        /**
         * Gets the "EventsRequest" element
         */
        public com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest getEventsRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest target = null;
                target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest)get_store().find_element_user(EVENTSREQUEST$0, 0);
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
                com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest target = null;
                target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest)get_store().find_element_user(EVENTSREQUEST$0, 0);
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
        public void setEventsRequest(com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest eventsRequest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest target = null;
                target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest)get_store().find_element_user(EVENTSREQUEST$0, 0);
                if (target == null)
                {
                    target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest)get_store().add_element_user(EVENTSREQUEST$0);
                }
                target.set(eventsRequest);
            }
        }
        
        /**
         * Appends and returns a new empty "EventsRequest" element
         */
        public com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest addNewEventsRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest target = null;
                target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest)get_store().add_element_user(EVENTSREQUEST$0);
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
                com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest target = null;
                target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest)get_store().find_element_user(EVENTSREQUEST$0, 0);
                if (target == null)
                {
                    target = (com.unitedtote.schema.totelink._2008._06.program.EventDetailRequest)get_store().add_element_user(EVENTSREQUEST$0);
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
