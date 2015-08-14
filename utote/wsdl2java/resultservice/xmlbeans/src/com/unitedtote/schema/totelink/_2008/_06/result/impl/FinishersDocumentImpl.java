/*
 * An XML document type.
 * Localname: Finishers
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.FinishersDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result.impl;
/**
 * A document containing one Finishers(@http://schema.unitedtote.com/ToteLink/2008/06/Result) element.
 *
 * This is a complex type.
 */
public class FinishersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.FinishersDocument
{
    
    public FinishersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FINISHERS$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Finishers");
    
    
    /**
     * Gets the "Finishers" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.Finishers getFinishers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Finishers target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Finishers)get_store().find_element_user(FINISHERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Finishers" element
     */
    public boolean isNilFinishers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Finishers target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Finishers)get_store().find_element_user(FINISHERS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Finishers" element
     */
    public void setFinishers(com.unitedtote.schema.totelink._2008._06.result.Finishers finishers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Finishers target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Finishers)get_store().find_element_user(FINISHERS$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.Finishers)get_store().add_element_user(FINISHERS$0);
            }
            target.set(finishers);
        }
    }
    
    /**
     * Appends and returns a new empty "Finishers" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.Finishers addNewFinishers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Finishers target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Finishers)get_store().add_element_user(FINISHERS$0);
            return target;
        }
    }
    
    /**
     * Nils the "Finishers" element
     */
    public void setNilFinishers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Finishers target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Finishers)get_store().find_element_user(FINISHERS$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.Finishers)get_store().add_element_user(FINISHERS$0);
            }
            target.setNil();
        }
    }
}
