/*
 * An XML document type.
 * Localname: ResultEntity
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.ResultEntityDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result.impl;
/**
 * A document containing one ResultEntity(@http://schema.unitedtote.com/ToteLink/2008/06/Result) element.
 *
 * This is a complex type.
 */
public class ResultEntityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.ResultEntityDocument
{
    
    public ResultEntityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESULTENTITY$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "ResultEntity");
    
    
    /**
     * Gets the "ResultEntity" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.ResultEntity getResultEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.ResultEntity target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.ResultEntity)get_store().find_element_user(RESULTENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ResultEntity" element
     */
    public boolean isNilResultEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.ResultEntity target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.ResultEntity)get_store().find_element_user(RESULTENTITY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ResultEntity" element
     */
    public void setResultEntity(com.unitedtote.schema.totelink._2008._06.result.ResultEntity resultEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.ResultEntity target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.ResultEntity)get_store().find_element_user(RESULTENTITY$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.ResultEntity)get_store().add_element_user(RESULTENTITY$0);
            }
            target.set(resultEntity);
        }
    }
    
    /**
     * Appends and returns a new empty "ResultEntity" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.ResultEntity addNewResultEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.ResultEntity target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.ResultEntity)get_store().add_element_user(RESULTENTITY$0);
            return target;
        }
    }
    
    /**
     * Nils the "ResultEntity" element
     */
    public void setNilResultEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.ResultEntity target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.ResultEntity)get_store().find_element_user(RESULTENTITY$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.ResultEntity)get_store().add_element_user(RESULTENTITY$0);
            }
            target.setNil();
        }
    }
}
