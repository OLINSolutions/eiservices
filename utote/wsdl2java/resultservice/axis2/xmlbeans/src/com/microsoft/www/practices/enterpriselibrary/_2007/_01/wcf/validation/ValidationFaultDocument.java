/*
 * An XML document type.
 * Localname: ValidationFault
 * Namespace: http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation
 * Java type: com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation;


/**
 * A document containing one ValidationFault(@http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation) element.
 *
 * This is a complex type.
 */
public interface ValidationFaultDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValidationFaultDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF27F4C75A2A2BD676C38937D3070B9F5").resolveHandle("validationfault8ce5doctype");
    
    /**
     * Gets the "ValidationFault" element
     */
    com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault getValidationFault();
    
    /**
     * Tests for nil "ValidationFault" element
     */
    boolean isNilValidationFault();
    
    /**
     * Sets the "ValidationFault" element
     */
    void setValidationFault(com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault validationFault);
    
    /**
     * Appends and returns a new empty "ValidationFault" element
     */
    com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault addNewValidationFault();
    
    /**
     * Nils the "ValidationFault" element
     */
    void setNilValidationFault();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument newInstance() {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
