/*
 * An XML document type.
 * Localname: Keepalive
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Common
 * Java type: com.unitedtote.schema.totelink._2008._06.common.KeepaliveDocument
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.common.impl;
/**
 * A document containing one Keepalive(@http://schema.unitedtote.com/ToteLink/2008/06/Common) element.
 *
 * This is a complex type.
 */
public class KeepaliveDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.common.KeepaliveDocument
{
    
    public KeepaliveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEEPALIVE$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Common", "Keepalive");
    
    
    /**
     * Gets the "Keepalive" element
     */
    public com.unitedtote.schema.totelink._2008._06.common.KeepaliveDocument.Keepalive getKeepalive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.KeepaliveDocument.Keepalive target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.KeepaliveDocument.Keepalive)get_store().find_element_user(KEEPALIVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Keepalive" element
     */
    public void setKeepalive(com.unitedtote.schema.totelink._2008._06.common.KeepaliveDocument.Keepalive keepalive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.KeepaliveDocument.Keepalive target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.KeepaliveDocument.Keepalive)get_store().find_element_user(KEEPALIVE$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.common.KeepaliveDocument.Keepalive)get_store().add_element_user(KEEPALIVE$0);
            }
            target.set(keepalive);
        }
    }
    
    /**
     * Appends and returns a new empty "Keepalive" element
     */
    public com.unitedtote.schema.totelink._2008._06.common.KeepaliveDocument.Keepalive addNewKeepalive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.KeepaliveDocument.Keepalive target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.KeepaliveDocument.Keepalive)get_store().add_element_user(KEEPALIVE$0);
            return target;
        }
    }
    /**
     * An XML Keepalive(@http://schema.unitedtote.com/ToteLink/2008/06/Common).
     *
     * This is a complex type.
     */
    public static class KeepaliveImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.common.KeepaliveDocument.Keepalive
    {
        
        public KeepaliveImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
