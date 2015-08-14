/*
 * An XML document type.
 * Localname: ValidationDetail
 * Namespace: http://schemas.datacontract.org/2004/07/Microsoft.Practices.EnterpriseLibrary.Validation.Integration.WCF
 * Java type: org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf;


/**
 * A document containing one ValidationDetail(@http://schemas.datacontract.org/2004/07/Microsoft.Practices.EnterpriseLibrary.Validation.Integration.WCF) element.
 *
 * This is a complex type.
 */
public interface ValidationDetailDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValidationDetailDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF27F4C75A2A2BD676C38937D3070B9F5").resolveHandle("validationdetail29bcdoctype");
    
    /**
     * Gets the "ValidationDetail" element
     */
    org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail getValidationDetail();
    
    /**
     * Tests for nil "ValidationDetail" element
     */
    boolean isNilValidationDetail();
    
    /**
     * Sets the "ValidationDetail" element
     */
    void setValidationDetail(org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail validationDetail);
    
    /**
     * Appends and returns a new empty "ValidationDetail" element
     */
    org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetail addNewValidationDetail();
    
    /**
     * Nils the "ValidationDetail" element
     */
    void setNilValidationDetail();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument newInstance() {
          return (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ValidationDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
