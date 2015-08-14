/*
 * An XML document type.
 * Localname: GetRaceResponse
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.GetRaceResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one GetRaceResponse(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class GetRaceResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.GetRaceResponseDocument
{
    
    public GetRaceResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRACERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "GetRaceResponse");
    
    
    /**
     * Gets the "GetRaceResponse" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.GetRaceResponseDocument.GetRaceResponse getGetRaceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.GetRaceResponseDocument.GetRaceResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.GetRaceResponseDocument.GetRaceResponse)get_store().find_element_user(GETRACERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetRaceResponse" element
     */
    public void setGetRaceResponse(com.unitedtote.schema.totelink._2008._06.program.GetRaceResponseDocument.GetRaceResponse getRaceResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.GetRaceResponseDocument.GetRaceResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.GetRaceResponseDocument.GetRaceResponse)get_store().find_element_user(GETRACERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.GetRaceResponseDocument.GetRaceResponse)get_store().add_element_user(GETRACERESPONSE$0);
            }
            target.set(getRaceResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetRaceResponse" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.GetRaceResponseDocument.GetRaceResponse addNewGetRaceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.GetRaceResponseDocument.GetRaceResponse target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.GetRaceResponseDocument.GetRaceResponse)get_store().add_element_user(GETRACERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetRaceResponse(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
     *
     * This is a complex type.
     */
    public static class GetRaceResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.GetRaceResponseDocument.GetRaceResponse
    {
        
        public GetRaceResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RACERESPONSE$0 = 
            new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "RaceResponse");
        
        
        /**
         * Gets the "RaceResponse" element
         */
        public com.unitedtote.schema.totelink._2008._06.program.RaceResponse getRaceResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.unitedtote.schema.totelink._2008._06.program.RaceResponse target = null;
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceResponse)get_store().find_element_user(RACERESPONSE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "RaceResponse" element
         */
        public boolean isNilRaceResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.unitedtote.schema.totelink._2008._06.program.RaceResponse target = null;
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceResponse)get_store().find_element_user(RACERESPONSE$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "RaceResponse" element
         */
        public boolean isSetRaceResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RACERESPONSE$0) != 0;
            }
        }
        
        /**
         * Sets the "RaceResponse" element
         */
        public void setRaceResponse(com.unitedtote.schema.totelink._2008._06.program.RaceResponse raceResponse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.unitedtote.schema.totelink._2008._06.program.RaceResponse target = null;
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceResponse)get_store().find_element_user(RACERESPONSE$0, 0);
                if (target == null)
                {
                    target = (com.unitedtote.schema.totelink._2008._06.program.RaceResponse)get_store().add_element_user(RACERESPONSE$0);
                }
                target.set(raceResponse);
            }
        }
        
        /**
         * Appends and returns a new empty "RaceResponse" element
         */
        public com.unitedtote.schema.totelink._2008._06.program.RaceResponse addNewRaceResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.unitedtote.schema.totelink._2008._06.program.RaceResponse target = null;
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceResponse)get_store().add_element_user(RACERESPONSE$0);
                return target;
            }
        }
        
        /**
         * Nils the "RaceResponse" element
         */
        public void setNilRaceResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.unitedtote.schema.totelink._2008._06.program.RaceResponse target = null;
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceResponse)get_store().find_element_user(RACERESPONSE$0, 0);
                if (target == null)
                {
                    target = (com.unitedtote.schema.totelink._2008._06.program.RaceResponse)get_store().add_element_user(RACERESPONSE$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "RaceResponse" element
         */
        public void unsetRaceResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RACERESPONSE$0, 0);
            }
        }
    }
}
