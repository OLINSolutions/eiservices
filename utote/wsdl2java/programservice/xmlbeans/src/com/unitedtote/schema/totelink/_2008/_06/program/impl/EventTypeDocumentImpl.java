/*
 * An XML document type.
 * Localname: EventType
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.EventTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program.impl;
/**
 * A document containing one EventType(@http://schema.unitedtote.com/ToteLink/2008/06/Program) element.
 *
 * This is a complex type.
 */
public class EventTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.program.EventTypeDocument
{
    
    public EventTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTTYPE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Program", "EventType");
    
    
    /**
     * Gets the "EventType" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.EventType.Enum getEventType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.unitedtote.schema.totelink._2008._06.program.EventType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "EventType" element
     */
    public com.unitedtote.schema.totelink._2008._06.program.EventType xgetEventType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventType target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventType)get_store().find_element_user(EVENTTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EventType" element
     */
    public boolean isNilEventType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventType target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventType)get_store().find_element_user(EVENTTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EventType" element
     */
    public void setEventType(com.unitedtote.schema.totelink._2008._06.program.EventType.Enum eventType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTTYPE$0);
            }
            target.setEnumValue(eventType);
        }
    }
    
    /**
     * Sets (as xml) the "EventType" element
     */
    public void xsetEventType(com.unitedtote.schema.totelink._2008._06.program.EventType eventType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventType target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventType)get_store().find_element_user(EVENTTYPE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.EventType)get_store().add_element_user(EVENTTYPE$0);
            }
            target.set(eventType);
        }
    }
    
    /**
     * Nils the "EventType" element
     */
    public void setNilEventType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.program.EventType target = null;
            target = (com.unitedtote.schema.totelink._2008._06.program.EventType)get_store().find_element_user(EVENTTYPE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.program.EventType)get_store().add_element_user(EVENTTYPE$0);
            }
            target.setNil();
        }
    }
}
