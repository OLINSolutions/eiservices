/*
 * An XML document type.
 * Localname: ValidationDetail
 * Namespace: http://schemas.datacontract.org/2004/07/Microsoft.Practices.EnterpriseLibrary.Validation.Integration.WCF
 * Java type: org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.impl;
/**
 * A document containing one ValidationDetail(@http://schemas.datacontract.org/2004/07/Microsoft.Practices.EnterpriseLibrary.Validation.Integration.WCF) element.
 *
 * This is a complex type.
 */
public class ValidationDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument
{
    
    public ValidationDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATIONDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.Practices.EnterpriseLibrary.Validation.Integration.WCF", "ValidationDetail");
    
    
    /**
     * Gets the "ValidationDetail" element
     */
    public org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail getValidationDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail)get_store().find_element_user(VALIDATIONDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ValidationDetail" element
     */
    public boolean isNilValidationDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail)get_store().find_element_user(VALIDATIONDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ValidationDetail" element
     */
    public void setValidationDetail(org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail validationDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail)get_store().find_element_user(VALIDATIONDETAIL$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail)get_store().add_element_user(VALIDATIONDETAIL$0);
            }
            target.set(validationDetail);
        }
    }
    
    /**
     * Appends and returns a new empty "ValidationDetail" element
     */
    public org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail addNewValidationDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail)get_store().add_element_user(VALIDATIONDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ValidationDetail" element
     */
    public void setNilValidationDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail)get_store().find_element_user(VALIDATIONDETAIL$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail)get_store().add_element_user(VALIDATIONDETAIL$0);
            }
            target.setNil();
        }
    }
}
