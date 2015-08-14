/*
 * XML Type:  ValidationFault
 * Namespace: http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation
 * Java type: com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation;


/**
 * An XML ValidationFault(@http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation).
 *
 * This is a complex type.
 */
public interface ValidationFault extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValidationFault.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF27F4C75A2A2BD676C38937D3070B9F5").resolveHandle("validationfault54f5type");
    
    /**
     * Gets the "Details" element
     */
    org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail getDetails();
    
    /**
     * Tests for nil "Details" element
     */
    boolean isNilDetails();
    
    /**
     * True if has "Details" element
     */
    boolean isSetDetails();
    
    /**
     * Sets the "Details" element
     */
    void setDetails(org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail details);
    
    /**
     * Appends and returns a new empty "Details" element
     */
    org.datacontract.schemas._2004._07.microsoft_practices_enterpriselibrary_validation_integration_wcf.ArrayOfValidationDetail addNewDetails();
    
    /**
     * Nils the "Details" element
     */
    void setNilDetails();
    
    /**
     * Unsets the "Details" element
     */
    void unsetDetails();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault newInstance() {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.www.practices.enterpriselibrary._2007._01.wcf.validation.ValidationFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
