/*
 * An XML document type.
 * Localname: PriceEntity
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.PriceEntityDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result.impl;
/**
 * A document containing one PriceEntity(@http://schema.unitedtote.com/ToteLink/2008/06/Result) element.
 *
 * This is a complex type.
 */
public class PriceEntityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.PriceEntityDocument
{
    
    public PriceEntityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRICEENTITY$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "PriceEntity");
    
    
    /**
     * Gets the "PriceEntity" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.PriceEntity getPriceEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PriceEntity target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PriceEntity)get_store().find_element_user(PRICEENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PriceEntity" element
     */
    public boolean isNilPriceEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PriceEntity target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PriceEntity)get_store().find_element_user(PRICEENTITY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PriceEntity" element
     */
    public void setPriceEntity(com.unitedtote.schema.totelink._2008._06.result.PriceEntity priceEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PriceEntity target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PriceEntity)get_store().find_element_user(PRICEENTITY$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.PriceEntity)get_store().add_element_user(PRICEENTITY$0);
            }
            target.set(priceEntity);
        }
    }
    
    /**
     * Appends and returns a new empty "PriceEntity" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.PriceEntity addNewPriceEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PriceEntity target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PriceEntity)get_store().add_element_user(PRICEENTITY$0);
            return target;
        }
    }
    
    /**
     * Nils the "PriceEntity" element
     */
    public void setNilPriceEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.PriceEntity target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.PriceEntity)get_store().find_element_user(PRICEENTITY$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.PriceEntity)get_store().add_element_user(PRICEENTITY$0);
            }
            target.setNil();
        }
    }
}
