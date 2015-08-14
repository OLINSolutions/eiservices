/*
 * An XML document type.
 * Localname: Finisher
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.FinisherDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result.impl;
/**
 * A document containing one Finisher(@http://schema.unitedtote.com/ToteLink/2008/06/Result) element.
 *
 * This is a complex type.
 */
public class FinisherDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.FinisherDocument
{
    
    public FinisherDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FINISHER$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Finisher");
    
    
    /**
     * Gets the "Finisher" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.Finisher getFinisher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Finisher target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Finisher)get_store().find_element_user(FINISHER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Finisher" element
     */
    public boolean isNilFinisher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Finisher target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Finisher)get_store().find_element_user(FINISHER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Finisher" element
     */
    public void setFinisher(com.unitedtote.schema.totelink._2008._06.result.Finisher finisher)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Finisher target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Finisher)get_store().find_element_user(FINISHER$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.Finisher)get_store().add_element_user(FINISHER$0);
            }
            target.set(finisher);
        }
    }
    
    /**
     * Appends and returns a new empty "Finisher" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.Finisher addNewFinisher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Finisher target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Finisher)get_store().add_element_user(FINISHER$0);
            return target;
        }
    }
    
    /**
     * Nils the "Finisher" element
     */
    public void setNilFinisher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Finisher target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Finisher)get_store().find_element_user(FINISHER$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.Finisher)get_store().add_element_user(FINISHER$0);
            }
            target.setNil();
        }
    }
}
