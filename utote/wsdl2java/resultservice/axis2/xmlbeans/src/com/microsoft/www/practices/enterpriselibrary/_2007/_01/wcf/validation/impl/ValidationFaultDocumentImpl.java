/*
 * An XML document type.
 * Localname: ValidationFault
 * Namespace: http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation
 * Java type: com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.impl;
/**
 * A document containing one ValidationFault(@http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation) element.
 *
 * This is a complex type.
 */
public class ValidationFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument
{
    
    public ValidationFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATIONFAULT$0 = 
        new javax.xml.namespace.QName("http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault");
    
    
    /**
     * Gets the "ValidationFault" element
     */
    public com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault getValidationFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault target = null;
            target = (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault)get_store().find_element_user(VALIDATIONFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ValidationFault" element
     */
    public boolean isNilValidationFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault target = null;
            target = (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault)get_store().find_element_user(VALIDATIONFAULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ValidationFault" element
     */
    public void setValidationFault(com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault validationFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault target = null;
            target = (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault)get_store().find_element_user(VALIDATIONFAULT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault)get_store().add_element_user(VALIDATIONFAULT$0);
            }
            target.set(validationFault);
        }
    }
    
    /**
     * Appends and returns a new empty "ValidationFault" element
     */
    public com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault addNewValidationFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault target = null;
            target = (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault)get_store().add_element_user(VALIDATIONFAULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ValidationFault" element
     */
    public void setNilValidationFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault target = null;
            target = (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault)get_store().find_element_user(VALIDATIONFAULT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault)get_store().add_element_user(VALIDATIONFAULT$0);
            }
            target.setNil();
        }
    }
}
