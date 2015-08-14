/*
 * An XML document type.
 * Localname: CompressedList
 * Namespace: http://schema.unitedtote.com/ToteLink/ToteDataTypes/2008/04
 * Java type: com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink.totedatatypes._2008._04.impl;
/**
 * A document containing one CompressedList(@http://schema.unitedtote.com/ToteLink/ToteDataTypes/2008/04) element.
 *
 * This is a complex type.
 */
public class CompressedListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedListDocument
{
    
    public CompressedListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPRESSEDLIST$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/ToteDataTypes/2008/04", "CompressedList");
    
    
    /**
     * Gets the "CompressedList" element
     */
    public java.lang.String getCompressedList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPRESSEDLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CompressedList" element
     */
    public com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList xgetCompressedList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList target = null;
            target = (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList)get_store().find_element_user(COMPRESSEDLIST$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CompressedList" element
     */
    public boolean isNilCompressedList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList target = null;
            target = (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList)get_store().find_element_user(COMPRESSEDLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CompressedList" element
     */
    public void setCompressedList(java.lang.String compressedList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPRESSEDLIST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPRESSEDLIST$0);
            }
            target.setStringValue(compressedList);
        }
    }
    
    /**
     * Sets (as xml) the "CompressedList" element
     */
    public void xsetCompressedList(com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList compressedList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList target = null;
            target = (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList)get_store().find_element_user(COMPRESSEDLIST$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList)get_store().add_element_user(COMPRESSEDLIST$0);
            }
            target.set(compressedList);
        }
    }
    
    /**
     * Nils the "CompressedList" element
     */
    public void setNilCompressedList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList target = null;
            target = (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList)get_store().find_element_user(COMPRESSEDLIST$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList)get_store().add_element_user(COMPRESSEDLIST$0);
            }
            target.setNil();
        }
    }
}
