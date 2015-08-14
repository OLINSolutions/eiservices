/*
 * XML Type:  PriceEntity
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Result
 * Java type: com.unitedtote.schema.totelink._2008._06.result.PriceEntity
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.result.impl;
/**
 * An XML PriceEntity(@http://schema.unitedtote.com/ToteLink/2008/06/Result).
 *
 * This is a complex type.
 */
public class PriceEntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.unitedtote.schema.totelink._2008._06.result.PriceEntity
{
    
    public PriceEntityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FINISH$0 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Finish");
    private static final javax.xml.namespace.QName EXCHANGE$2 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Exchange");
    private static final javax.xml.namespace.QName HOLD$4 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Hold");
    private static final javax.xml.namespace.QName WINNINGS$6 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Winnings");
    private static final javax.xml.namespace.QName WAGER$8 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Wager");
    private static final javax.xml.namespace.QName PRICEAMOUNT$10 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "PriceAmount");
    private static final javax.xml.namespace.QName REQUIRED$12 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Required");
    private static final javax.xml.namespace.QName PAYOFF$14 = 
        new javax.xml.namespace.QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Payoff");
    
    
    /**
     * Gets the "Finish" element
     */
    public java.lang.String getFinish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINISH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Finish" element
     */
    public org.apache.xmlbeans.XmlString xgetFinish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FINISH$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Finish" element
     */
    public boolean isNilFinish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FINISH$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Finish" element
     */
    public void setFinish(java.lang.String finish)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINISH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FINISH$0);
            }
            target.setStringValue(finish);
        }
    }
    
    /**
     * Sets (as xml) the "Finish" element
     */
    public void xsetFinish(org.apache.xmlbeans.XmlString finish)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FINISH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FINISH$0);
            }
            target.set(finish);
        }
    }
    
    /**
     * Nils the "Finish" element
     */
    public void setNilFinish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FINISH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FINISH$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "Exchange" element
     */
    public boolean getExchange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCHANGE$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Exchange" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetExchange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXCHANGE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Exchange" element
     */
    public boolean isSetExchange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXCHANGE$2) != 0;
        }
    }
    
    /**
     * Sets the "Exchange" element
     */
    public void setExchange(boolean exchange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCHANGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXCHANGE$2);
            }
            target.setBooleanValue(exchange);
        }
    }
    
    /**
     * Sets (as xml) the "Exchange" element
     */
    public void xsetExchange(org.apache.xmlbeans.XmlBoolean exchange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXCHANGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(EXCHANGE$2);
            }
            target.set(exchange);
        }
    }
    
    /**
     * Unsets the "Exchange" element
     */
    public void unsetExchange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXCHANGE$2, 0);
        }
    }
    
    /**
     * Gets the "Hold" element
     */
    public boolean getHold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOLD$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Hold" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HOLD$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Hold" element
     */
    public boolean isSetHold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOLD$4) != 0;
        }
    }
    
    /**
     * Sets the "Hold" element
     */
    public void setHold(boolean hold)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOLD$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOLD$4);
            }
            target.setBooleanValue(hold);
        }
    }
    
    /**
     * Sets (as xml) the "Hold" element
     */
    public void xsetHold(org.apache.xmlbeans.XmlBoolean hold)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HOLD$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HOLD$4);
            }
            target.set(hold);
        }
    }
    
    /**
     * Unsets the "Hold" element
     */
    public void unsetHold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOLD$4, 0);
        }
    }
    
    /**
     * Gets the "Winnings" element
     */
    public java.math.BigDecimal getWinnings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WINNINGS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Winnings" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetWinnings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(WINNINGS$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Winnings" element
     */
    public boolean isNilWinnings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(WINNINGS$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Winnings" element
     */
    public boolean isSetWinnings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WINNINGS$6) != 0;
        }
    }
    
    /**
     * Sets the "Winnings" element
     */
    public void setWinnings(java.math.BigDecimal winnings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WINNINGS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WINNINGS$6);
            }
            target.setBigDecimalValue(winnings);
        }
    }
    
    /**
     * Sets (as xml) the "Winnings" element
     */
    public void xsetWinnings(org.apache.xmlbeans.XmlDecimal winnings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(WINNINGS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(WINNINGS$6);
            }
            target.set(winnings);
        }
    }
    
    /**
     * Nils the "Winnings" element
     */
    public void setNilWinnings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(WINNINGS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(WINNINGS$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Winnings" element
     */
    public void unsetWinnings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WINNINGS$6, 0);
        }
    }
    
    /**
     * Gets the "Wager" element
     */
    public java.math.BigDecimal getWager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAGER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Wager" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetWager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(WAGER$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Wager" element
     */
    public boolean isNilWager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(WAGER$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Wager" element
     */
    public boolean isSetWager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WAGER$8) != 0;
        }
    }
    
    /**
     * Sets the "Wager" element
     */
    public void setWager(java.math.BigDecimal wager)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAGER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WAGER$8);
            }
            target.setBigDecimalValue(wager);
        }
    }
    
    /**
     * Sets (as xml) the "Wager" element
     */
    public void xsetWager(org.apache.xmlbeans.XmlDecimal wager)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(WAGER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(WAGER$8);
            }
            target.set(wager);
        }
    }
    
    /**
     * Nils the "Wager" element
     */
    public void setNilWager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(WAGER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(WAGER$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Wager" element
     */
    public void unsetWager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WAGER$8, 0);
        }
    }
    
    /**
     * Gets the "PriceAmount" element
     */
    public java.math.BigDecimal getPriceAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICEAMOUNT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "PriceAmount" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetPriceAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PRICEAMOUNT$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PriceAmount" element
     */
    public boolean isNilPriceAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PRICEAMOUNT$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PriceAmount" element
     */
    public boolean isSetPriceAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRICEAMOUNT$10) != 0;
        }
    }
    
    /**
     * Sets the "PriceAmount" element
     */
    public void setPriceAmount(java.math.BigDecimal priceAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICEAMOUNT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRICEAMOUNT$10);
            }
            target.setBigDecimalValue(priceAmount);
        }
    }
    
    /**
     * Sets (as xml) the "PriceAmount" element
     */
    public void xsetPriceAmount(org.apache.xmlbeans.XmlDecimal priceAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PRICEAMOUNT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(PRICEAMOUNT$10);
            }
            target.set(priceAmount);
        }
    }
    
    /**
     * Nils the "PriceAmount" element
     */
    public void setNilPriceAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PRICEAMOUNT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(PRICEAMOUNT$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PriceAmount" element
     */
    public void unsetPriceAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRICEAMOUNT$10, 0);
        }
    }
    
    /**
     * Gets the "Required" element
     */
    public java.lang.String getRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUIRED$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Required" element
     */
    public org.apache.xmlbeans.XmlString xgetRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUIRED$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Required" element
     */
    public boolean isNilRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUIRED$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Required" element
     */
    public boolean isSetRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUIRED$12) != 0;
        }
    }
    
    /**
     * Sets the "Required" element
     */
    public void setRequired(java.lang.String required)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUIRED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUIRED$12);
            }
            target.setStringValue(required);
        }
    }
    
    /**
     * Sets (as xml) the "Required" element
     */
    public void xsetRequired(org.apache.xmlbeans.XmlString required)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUIRED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUIRED$12);
            }
            target.set(required);
        }
    }
    
    /**
     * Nils the "Required" element
     */
    public void setNilRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUIRED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUIRED$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Required" element
     */
    public void unsetRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUIRED$12, 0);
        }
    }
    
    /**
     * Gets the "Payoff" element
     */
    public java.math.BigDecimal getPayoff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYOFF$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Payoff" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetPayoff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PAYOFF$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Payoff" element
     */
    public boolean isNilPayoff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PAYOFF$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Payoff" element
     */
    public boolean isSetPayoff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAYOFF$14) != 0;
        }
    }
    
    /**
     * Sets the "Payoff" element
     */
    public void setPayoff(java.math.BigDecimal payoff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYOFF$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYOFF$14);
            }
            target.setBigDecimalValue(payoff);
        }
    }
    
    /**
     * Sets (as xml) the "Payoff" element
     */
    public void xsetPayoff(org.apache.xmlbeans.XmlDecimal payoff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PAYOFF$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(PAYOFF$14);
            }
            target.set(payoff);
        }
    }
    
    /**
     * Nils the "Payoff" element
     */
    public void setNilPayoff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PAYOFF$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(PAYOFF$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Payoff" element
     */
    public void unsetPayoff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAYOFF$14, 0);
        }
    }
}
