/*
 * XML Type:  ValidationFault
 * Namespace: http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation
 * Java type: com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.impl;
/**
 * An XML ValidationFault(@http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation).
 *
 * This is a complex type.
 */
public class ValidationFaultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault
{
    
    public ValidationFaultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DETAILS$0 = 
        new javax.xml.namespace.QName("http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "Details");
    
    
    /**
     * Gets the "Details" element
     */
    public org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail getDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail)get_store().find_element_user(DETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Details" element
     */
    public boolean isNilDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail)get_store().find_element_user(DETAILS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Details" element
     */
    public boolean isSetDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETAILS$0) != 0;
        }
    }
    
    /**
     * Sets the "Details" element
     */
    public void setDetails(org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail details)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail)get_store().find_element_user(DETAILS$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail)get_store().add_element_user(DETAILS$0);
            }
            target.set(details);
        }
    }
    
    /**
     * Appends and returns a new empty "Details" element
     */
    public org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail addNewDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail)get_store().add_element_user(DETAILS$0);
            return target;
        }
    }
    
    /**
     * Nils the "Details" element
     */
    public void setNilDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail)get_store().find_element_user(DETAILS$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail)get_store().add_element_user(DETAILS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Details" element
     */
    public void unsetDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETAILS$0, 0);
        }
    }
}
