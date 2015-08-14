/*
 * XML Type:  ArrayOfValidationDetail
 * Namespace: http://schemas.datacontract.org/2004/07/Microsoft.Practices.EnterpriseLibrary.Validation.Integration.WCF
 * Java type: org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.impl;
/**
 * An XML ArrayOfValidationDetail(@http://schemas.datacontract.org/2004/07/Microsoft.Practices.EnterpriseLibrary.Validation.Integration.WCF).
 *
 * This is a complex type.
 */
public class ArrayOfValidationDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail
{
    
    public ArrayOfValidationDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATIONDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.Practices.EnterpriseLibrary.Validation.Integration.WCF", "ValidationDetail");
    
    
    /**
     * Gets array of all "ValidationDetail" elements
     */
    public org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail[] getValidationDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALIDATIONDETAIL$0, targetList);
            org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail[] result = new org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ValidationDetail" element
     */
    public org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail getValidationDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail)get_store().find_element_user(VALIDATIONDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ValidationDetail" element
     */
    public boolean isNilValidationDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail)get_store().find_element_user(VALIDATIONDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ValidationDetail" element
     */
    public int sizeOfValidationDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDATIONDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "ValidationDetail" element
     */
    public void setValidationDetailArray(org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail[] validationDetailArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(validationDetailArray, VALIDATIONDETAIL$0);
        }
    }
    
    /**
     * Sets ith "ValidationDetail" element
     */
    public void setValidationDetailArray(int i, org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail validationDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail)get_store().find_element_user(VALIDATIONDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(validationDetail);
        }
    }
    
    /**
     * Nils the ith "ValidationDetail" element
     */
    public void setNilValidationDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail)get_store().find_element_user(VALIDATIONDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValidationDetail" element
     */
    public org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail insertNewValidationDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail)get_store().insert_element_user(VALIDATIONDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ValidationDetail" element
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
     * Removes the ith "ValidationDetail" element
     */
    public void removeValidationDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDATIONDETAIL$0, i);
        }
    }
}
