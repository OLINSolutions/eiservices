/*
 * XML Type:  PoolPrice
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.PoolPrice
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result.impl;
/**
 * An XML PoolPrice(@http://schema.unitedtote.com/ToteLink/2008/06/Result).
 *
 * This is a complex type.
 */
public class PoolPriceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.PoolPrice
{
    
    public PoolPriceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRICES$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Prices");
    private static final javax.xml.namespace.QName POOLID$2 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "PoolId");
    private static final javax.xml.namespace.QName POOLNAME$4 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "PoolName");
    private static final javax.xml.namespace.QName REFUND$6 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Refund");
    private static final javax.xml.namespace.QName CARRYOVER$8 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "CarryOver");
    
    
    /**
     * Gets the "Prices" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.Prices getPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Prices target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Prices)get_store().find_element_user(PRICES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Prices" element
     */
    public boolean isNilPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Prices target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Prices)get_store().find_element_user(PRICES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Prices" element
     */
    public boolean isSetPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRICES$0) != 0;
        }
    }
    
    /**
     * Sets the "Prices" element
     */
    public void setPrices(com.unitedtote.schema.totelink._2008._06.result.Prices prices)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Prices target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Prices)get_store().find_element_user(PRICES$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.Prices)get_store().add_element_user(PRICES$0);
            }
            target.set(prices);
        }
    }
    
    /**
     * Appends and returns a new empty "Prices" element
     */
    public com.unitedtote.schema.totelink._2008._06.result.Prices addNewPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Prices target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Prices)get_store().add_element_user(PRICES$0);
            return target;
        }
    }
    
    /**
     * Nils the "Prices" element
     */
    public void setNilPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.unitedtote.schema.totelink._2008._06.result.Prices target = null;
            target = (com.unitedtote.schema.totelink._2008._06.result.Prices)get_store().find_element_user(PRICES$0, 0);
            if (target == null)
            {
                target = (com.unitedtote.schema.totelink._2008._06.result.Prices)get_store().add_element_user(PRICES$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Prices" element
     */
    public void unsetPrices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRICES$0, 0);
        }
    }
    
    /**
     * Gets the "PoolId" element
     */
    public java.lang.String getPoolId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POOLID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PoolId" element
     */
    public org.apache.xmlbeans.XmlString xgetPoolId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POOLID$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PoolId" element
     */
    public boolean isNilPoolId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POOLID$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PoolId" element
     */
    public void setPoolId(java.lang.String poolId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POOLID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POOLID$2);
            }
            target.setStringValue(poolId);
        }
    }
    
    /**
     * Sets (as xml) the "PoolId" element
     */
    public void xsetPoolId(org.apache.xmlbeans.XmlString poolId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POOLID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POOLID$2);
            }
            target.set(poolId);
        }
    }
    
    /**
     * Nils the "PoolId" element
     */
    public void setNilPoolId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POOLID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POOLID$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "PoolName" element
     */
    public java.lang.String getPoolName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POOLNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PoolName" element
     */
    public org.apache.xmlbeans.XmlString xgetPoolName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POOLNAME$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PoolName" element
     */
    public boolean isNilPoolName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POOLNAME$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PoolName" element
     */
    public boolean isSetPoolName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POOLNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "PoolName" element
     */
    public void setPoolName(java.lang.String poolName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POOLNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POOLNAME$4);
            }
            target.setStringValue(poolName);
        }
    }
    
    /**
     * Sets (as xml) the "PoolName" element
     */
    public void xsetPoolName(org.apache.xmlbeans.XmlString poolName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POOLNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POOLNAME$4);
            }
            target.set(poolName);
        }
    }
    
    /**
     * Nils the "PoolName" element
     */
    public void setNilPoolName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POOLNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POOLNAME$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PoolName" element
     */
    public void unsetPoolName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POOLNAME$4, 0);
        }
    }
    
    /**
     * Gets the "Refund" element
     */
    public boolean getRefund()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFUND$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Refund" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetRefund()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REFUND$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Refund" element
     */
    public boolean isSetRefund()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFUND$6) != 0;
        }
    }
    
    /**
     * Sets the "Refund" element
     */
    public void setRefund(boolean refund)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFUND$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFUND$6);
            }
            target.setBooleanValue(refund);
        }
    }
    
    /**
     * Sets (as xml) the "Refund" element
     */
    public void xsetRefund(org.apache.xmlbeans.XmlBoolean refund)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REFUND$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(REFUND$6);
            }
            target.set(refund);
        }
    }
    
    /**
     * Unsets the "Refund" element
     */
    public void unsetRefund()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFUND$6, 0);
        }
    }
    
    /**
     * Gets the "CarryOver" element
     */
    public java.math.BigDecimal getCarryOver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARRYOVER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "CarryOver" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetCarryOver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(CARRYOVER$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CarryOver" element
     */
    public boolean isNilCarryOver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(CARRYOVER$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CarryOver" element
     */
    public boolean isSetCarryOver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARRYOVER$8) != 0;
        }
    }
    
    /**
     * Sets the "CarryOver" element
     */
    public void setCarryOver(java.math.BigDecimal carryOver)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARRYOVER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CARRYOVER$8);
            }
            target.setBigDecimalValue(carryOver);
        }
    }
    
    /**
     * Sets (as xml) the "CarryOver" element
     */
    public void xsetCarryOver(org.apache.xmlbeans.XmlDecimal carryOver)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(CARRYOVER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(CARRYOVER$8);
            }
            target.set(carryOver);
        }
    }
    
    /**
     * Nils the "CarryOver" element
     */
    public void setNilCarryOver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(CARRYOVER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(CARRYOVER$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CarryOver" element
     */
    public void unsetCarryOver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARRYOVER$8, 0);
        }
    }
}
