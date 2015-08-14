/*
 * XML Type:  ToteLinkResponse
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Common
 * Java type: com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponse
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.common.impl;
/**
 * An XML ToteLinkResponse(@http://schema.unitedtote.com/ToteLink/2008/06/Common).
 *
 * This is a complex type.
 */
public class ToteLinkResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.common.ToteLinkResponse
{
    
    public ToteLinkResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RUNID$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Common", "RunId");
    private static final javax.xml.namespace.QName GROUPID$2 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Common", "GroupId");
    private static final javax.xml.namespace.QName ERROR$4 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Common", "Error");
    private static final javax.xml.namespace.QName SOURCE$6 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Common", "Source");
    
    
    /**
     * Gets the "RunId" element
     */
    public java.lang.String getRunId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUNID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RunId" element
     */
    public org.apache.xmlbeans.XmlString xgetRunId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RUNID$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RunId" element
     */
    public boolean isNilRunId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RUNID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RunId" element
     */
    public boolean isSetRunId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RUNID$0) != 0;
        }
    }
    
    /**
     * Sets the "RunId" element
     */
    public void setRunId(java.lang.String runId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUNID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUNID$0);
            }
            target.setStringValue(runId);
        }
    }
    
    /**
     * Sets (as xml) the "RunId" element
     */
    public void xsetRunId(org.apache.xmlbeans.XmlString runId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RUNID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RUNID$0);
            }
            target.set(runId);
        }
    }
    
    /**
     * Nils the "RunId" element
     */
    public void setNilRunId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RUNID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RUNID$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RunId" element
     */
    public void unsetRunId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RUNID$0, 0);
        }
    }
    
    /**
     * Gets the "GroupId" element
     */
    public java.lang.String getGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "GroupId" element
     */
    public org.apache.xmlbeans.XmlString xgetGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPID$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "GroupId" element
     */
    public boolean isNilGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPID$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "GroupId" element
     */
    public boolean isSetGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPID$2) != 0;
        }
    }
    
    /**
     * Sets the "GroupId" element
     */
    public void setGroupId(java.lang.String groupId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUPID$2);
            }
            target.setStringValue(groupId);
        }
    }
    
    /**
     * Sets (as xml) the "GroupId" element
     */
    public void xsetGroupId(org.apache.xmlbeans.XmlString groupId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUPID$2);
            }
            target.set(groupId);
        }
    }
    
    /**
     * Nils the "GroupId" element
     */
    public void setNilGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUPID$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "GroupId" element
     */
    public void unsetGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPID$2, 0);
        }
    }
    
    /**
     * Gets the "Error" element
     */
    public com.unitedtote.schema.totelink._2008._06.common.Error getError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.Error target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.Error)get_store().find_element_user(ERROR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Error" element
     */
    public boolean isSetError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERROR$4) != 0;
        }
    }
    
    /**
     * Sets the "Error" element
     */
    public void setError(com.unitedtote.schema.totelink._2008._06.common.Error error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.Error target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.Error)get_store().find_element_user(ERROR$4, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.common.Error)get_store().add_element_user(ERROR$4);
            }
            target.set(error);
        }
    }
    
    /**
     * Appends and returns a new empty "Error" element
     */
    public com.unitedtote.schema.totelink._2008._06.common.Error addNewError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.Error target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.Error)get_store().add_element_user(ERROR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Error" element
     */
    public void unsetError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERROR$4, 0);
        }
    }
    
    /**
     * Gets the "Source" element
     */
    public com.unitedtote.schema.totelink._2008._06.common.Source getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.Source target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.Source)get_store().find_element_user(SOURCE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Source" element
     */
    public boolean isSetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$6) != 0;
        }
    }
    
    /**
     * Sets the "Source" element
     */
    public void setSource(com.unitedtote.schema.totelink._2008._06.common.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.Source target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.Source)get_store().find_element_user(SOURCE$6, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.common.Source)get_store().add_element_user(SOURCE$6);
            }
            target.set(source);
        }
    }
    
    /**
     * Appends and returns a new empty "Source" element
     */
    public com.unitedtote.schema.totelink._2008._06.common.Source addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.common.Source target = null;
            target = (com.unitedtote.schema.totelink._2008._06.common.Source)get_store().add_element_user(SOURCE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Source" element
     */
    public void unsetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$6, 0);
        }
    }
}
