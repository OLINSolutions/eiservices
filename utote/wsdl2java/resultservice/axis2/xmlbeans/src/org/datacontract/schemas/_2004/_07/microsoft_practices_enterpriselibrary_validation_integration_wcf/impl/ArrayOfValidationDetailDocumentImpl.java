/*
 * An XML document type.
 * Localname: ArrayOfValidationDetail
 * Namespace: http://schemas.datacontract.org/2004/07/Microsoft.Practices.EnterpriseLibrary.Validation.Integration.WCF
 * Java type: org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetailDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.impl;
/**
 * A document containing one ArrayOfValidationDetail(@http://schemas.datacontract.org/2004/07/Microsoft.Practices.EnterpriseLibrary.Validation.Integration.WCF) element.
 *
 * This is a complex type.
 */
public class ArrayOfValidationDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetailDocument
{
    
    public ArrayOfValidationDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFVALIDATIONDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.Practices.EnterpriseLibrary.Validation.Integration.WCF", "ArrayOfValidationDetail");
    
    
    /**
     * Gets the "ArrayOfValidationDetail" element
     */
    public org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail getArrayOfValidationDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail)get_store().find_element_user(ARRAYOFVALIDATIONDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfValidationDetail" element
     */
    public boolean isNilArrayOfValidationDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail)get_store().find_element_user(ARRAYOFVALIDATIONDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfValidationDetail" element
     */
    public void setArrayOfValidationDetail(org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail arrayOfValidationDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail)get_store().find_element_user(ARRAYOFVALIDATIONDETAIL$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail)get_store().add_element_user(ARRAYOFVALIDATIONDETAIL$0);
            }
            target.set(arrayOfValidationDetail);
        }
    }
    
    /**
     * Appends and returns a new empty "ArrayOfValidationDetail" element
     */
    public org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail addNewArrayOfValidationDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail)get_store().add_element_user(ARRAYOFVALIDATIONDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfValidationDetail" element
     */
    public void setNilArrayOfValidationDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail)get_store().find_element_user(ARRAYOFVALIDATIONDETAIL$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail)get_store().add_element_user(ARRAYOFVALIDATIONDETAIL$0);
            }
            target.setNil();
        }
    }
}
