/*
 * XML Type:  ResultEntity
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.ResultEntity
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result.impl;
/**
 * An XML ResultEntity(@http://schema.unitedtote.com/ToteLink/2008/06/Result).
 *
 * This is a complex type.
 */
public class ResultEntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.ResultEntity
{
    
    public ResultEntityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSITIONS$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Positions");
    private static final javax.xml.namespace.QName WINNERS$2 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Winners");
    private static final javax.xml.namespace.QName SCRATCHES$4 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Scratches");
    
    
    /**
     * Gets the "Positions" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.Positions getPositions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Positions target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Positions)get_store().find_element_user(POSITIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Positions" element
     */
    public boolean isNilPositions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Positions target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Positions)get_store().find_element_user(POSITIONS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Positions" element
     */
    public boolean isSetPositions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSITIONS$0) != 0;
        }
    }
    
    /**
     * Sets the "Positions" element
     */
    public void setPositions(com.unitedtote.schema.totelink._2008._06.result.Positions positions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Positions target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Positions)get_store().find_element_user(POSITIONS$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.Positions)get_store().add_element_user(POSITIONS$0);
            }
            target.set(positions);
        }
    }
    
    /**
     * Appends and returns a new empty "Positions" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.Positions addNewPositions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Positions target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Positions)get_store().add_element_user(POSITIONS$0);
            return target;
        }
    }
    
    /**
     * Nils the "Positions" element
     */
    public void setNilPositions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Positions target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Positions)get_store().find_element_user(POSITIONS$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.Positions)get_store().add_element_user(POSITIONS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Positions" element
     */
    public void unsetPositions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSITIONS$0, 0);
        }
    }
    
    /**
     * Gets the "Winners" element
     */
    public java.lang.String getWinners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WINNERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Winners" element
     */
    public org.apache.xmlbeans.XmlString xgetWinners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WINNERS$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Winners" element
     */
    public boolean isNilWinners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WINNERS$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Winners" element
     */
    public boolean isSetWinners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WINNERS$2) != 0;
        }
    }
    
    /**
     * Sets the "Winners" element
     */
    public void setWinners(java.lang.String winners)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WINNERS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WINNERS$2);
            }
            target.setStringValue(winners);
        }
    }
    
    /**
     * Sets (as xml) the "Winners" element
     */
    public void xsetWinners(org.apache.xmlbeans.XmlString winners)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WINNERS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WINNERS$2);
            }
            target.set(winners);
        }
    }
    
    /**
     * Nils the "Winners" element
     */
    public void setNilWinners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WINNERS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WINNERS$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Winners" element
     */
    public void unsetWinners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WINNERS$2, 0);
        }
    }
    
    /**
     * Gets the "Scratches" element
     */
    public java.lang.String getScratches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCRATCHES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Scratches" element
     */
    public org.apache.xmlbeans.XmlString xgetScratches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCRATCHES$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Scratches" element
     */
    public boolean isNilScratches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCRATCHES$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Scratches" element
     */
    public boolean isSetScratches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCRATCHES$4) != 0;
        }
    }
    
    /**
     * Sets the "Scratches" element
     */
    public void setScratches(java.lang.String scratches)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCRATCHES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCRATCHES$4);
            }
            target.setStringValue(scratches);
        }
    }
    
    /**
     * Sets (as xml) the "Scratches" element
     */
    public void xsetScratches(org.apache.xmlbeans.XmlString scratches)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCRATCHES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCRATCHES$4);
            }
            target.set(scratches);
        }
    }
    
    /**
     * Nils the "Scratches" element
     */
    public void setNilScratches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCRATCHES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCRATCHES$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Scratches" element
     */
    public void unsetScratches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCRATCHES$4, 0);
        }
    }
}
