/*
 * An XML document type.
 * Localname: GetRace
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.GetRaceDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one GetRace(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class GetRaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.GetRaceDocument
{
    
    public GetRaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRACE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "GetRace");
    
    
    /**
     * Gets the "GetRace" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.GetRaceDocument.GetRace getGetRace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.GetRaceDocument.GetRace target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.GetRaceDocument.GetRace)get_store().find_element_user(GETRACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetRace" element
     */
    public void setGetRace(com.unitedtote.schema.totelink._2008._06.program.GetRaceDocument.GetRace getRace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.GetRaceDocument.GetRace target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.GetRaceDocument.GetRace)get_store().find_element_user(GETRACE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.GetRaceDocument.GetRace)get_store().add_element_user(GETRACE$0);
            }
            target.set(getRace);
        }
    }
    
    /**
     * Appends and returns a new empty "GetRace" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.GetRaceDocument.GetRace addNewGetRace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.GetRaceDocument.GetRace target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.GetRaceDocument.GetRace)get_store().add_element_user(GETRACE$0);
            return target;
        }
    }
    /**
     * An XML GetRace(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
     *
     * This is a complex type.
     */
    public static class GetRaceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.GetRaceDocument.GetRace
    {
        
        public GetRaceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RACEREQUEST$0 = 
            new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "RaceRequest");
        
        
        /**
         * Gets the "RaceRequest" element
         */
        public com.unitedtote.schema.totelink._2008._06.program.RaceRequest getRaceRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.unitedtote.schema.totelink._2008._06.program.RaceRequest target = null;
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceRequest)get_store().find_element_user(RACEREQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "RaceRequest" element
         */
        public boolean isNilRaceRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.unitedtote.schema.totelink._2008._06.program.RaceRequest target = null;
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceRequest)get_store().find_element_user(RACEREQUEST$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "RaceRequest" element
         */
        public boolean isSetRaceRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RACEREQUEST$0) != 0;
            }
        }
        
        /**
         * Sets the "RaceRequest" element
         */
        public void setRaceRequest(com.unitedtote.schema.totelink._2008._06.program.RaceRequest raceRequest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.unitedtote.schema.totelink._2008._06.program.RaceRequest target = null;
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceRequest)get_store().find_element_user(RACEREQUEST$0, 0);
                if (target == null)
                {
                    target = (com.unitedtote.schema.totelink._2008._06.program.RaceRequest)get_store().add_element_user(RACEREQUEST$0);
                }
                target.set(raceRequest);
            }
        }
        
        /**
         * Appends and returns a new empty "RaceRequest" element
         */
        public com.unitedtote.schema.totelink._2008._06.program.RaceRequest addNewRaceRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.unitedtote.schema.totelink._2008._06.program.RaceRequest target = null;
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceRequest)get_store().add_element_user(RACEREQUEST$0);
                return target;
            }
        }
        
        /**
         * Nils the "RaceRequest" element
         */
        public void setNilRaceRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.unitedtote.schema.totelink._2008._06.program.RaceRequest target = null;
                target = (com.unitedtote.schema.totelink._2008._06.program.RaceRequest)get_store().find_element_user(RACEREQUEST$0, 0);
                if (target == null)
                {
                    target = (com.unitedtote.schema.totelink._2008._06.program.RaceRequest)get_store().add_element_user(RACEREQUEST$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "RaceRequest" element
         */
        public void unsetRaceRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RACEREQUEST$0, 0);
            }
        }
    }
}
