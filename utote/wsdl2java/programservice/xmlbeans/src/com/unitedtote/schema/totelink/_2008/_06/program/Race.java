/*
 * XML Type:  Race
 * Namespace: http://schema.unitedtote.com/ToteLink/2008/06/Program
 * Java type: com.unitedtote.schema.totelink._2008._06.program.Race
 *
 * Automatically generated - do not modify.
 */
package com.unitedtote.schema.totelink._2008._06.program;


/**
 * An XML Race(@http://schema.unitedtote.com/ToteLink/2008/06/Program).
 *
 * This is a complex type.
 */
public interface Race extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Race.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s774BCCBD03F3C43E4BB4EA6FE2757C2F").resolveHandle("race7987type");
    
    /**
     * Gets the "Pools" element
     */
    com.unitedtote.schema.totelink._2008._06.program.Pools getPools();
    
    /**
     * Tests for nil "Pools" element
     */
    boolean isNilPools();
    
    /**
     * True if has "Pools" element
     */
    boolean isSetPools();
    
    /**
     * Sets the "Pools" element
     */
    void setPools(com.unitedtote.schema.totelink._2008._06.program.Pools pools);
    
    /**
     * Appends and returns a new empty "Pools" element
     */
    com.unitedtote.schema.totelink._2008._06.program.Pools addNewPools();
    
    /**
     * Nils the "Pools" element
     */
    void setNilPools();
    
    /**
     * Unsets the "Pools" element
     */
    void unsetPools();
    
    /**
     * Gets the "Runners" element
     */
    com.unitedtote.schema.totelink._2008._06.program.Runners getRunners();
    
    /**
     * Tests for nil "Runners" element
     */
    boolean isNilRunners();
    
    /**
     * True if has "Runners" element
     */
    boolean isSetRunners();
    
    /**
     * Sets the "Runners" element
     */
    void setRunners(com.unitedtote.schema.totelink._2008._06.program.Runners runners);
    
    /**
     * Appends and returns a new empty "Runners" element
     */
    com.unitedtote.schema.totelink._2008._06.program.Runners addNewRunners();
    
    /**
     * Nils the "Runners" element
     */
    void setNilRunners();
    
    /**
     * Unsets the "Runners" element
     */
    void unsetRunners();
    
    /**
     * Gets the "RaceChanges" element
     */
    com.unitedtote.schema.totelink._2008._06.program.RaceChanges getRaceChanges();
    
    /**
     * Tests for nil "RaceChanges" element
     */
    boolean isNilRaceChanges();
    
    /**
     * True if has "RaceChanges" element
     */
    boolean isSetRaceChanges();
    
    /**
     * Sets the "RaceChanges" element
     */
    void setRaceChanges(com.unitedtote.schema.totelink._2008._06.program.RaceChanges raceChanges);
    
    /**
     * Appends and returns a new empty "RaceChanges" element
     */
    com.unitedtote.schema.totelink._2008._06.program.RaceChanges addNewRaceChanges();
    
    /**
     * Nils the "RaceChanges" element
     */
    void setNilRaceChanges();
    
    /**
     * Unsets the "RaceChanges" element
     */
    void unsetRaceChanges();
    
    /**
     * Gets the "RaceId" element
     */
    int getRaceId();
    
    /**
     * Gets (as xml) the "RaceId" element
     */
    org.apache.xmlbeans.XmlInt xgetRaceId();
    
    /**
     * Sets the "RaceId" element
     */
    void setRaceId(int raceId);
    
    /**
     * Sets (as xml) the "RaceId" element
     */
    void xsetRaceId(org.apache.xmlbeans.XmlInt raceId);
    
    /**
     * Gets the "RaceStatus" element
     */
    com.unitedtote.schema.totelink._2008._06.program.RaceStatus.Enum getRaceStatus();
    
    /**
     * Gets (as xml) the "RaceStatus" element
     */
    com.unitedtote.schema.totelink._2008._06.program.RaceStatus xgetRaceStatus();
    
    /**
     * Tests for nil "RaceStatus" element
     */
    boolean isNilRaceStatus();
    
    /**
     * True if has "RaceStatus" element
     */
    boolean isSetRaceStatus();
    
    /**
     * Sets the "RaceStatus" element
     */
    void setRaceStatus(com.unitedtote.schema.totelink._2008._06.program.RaceStatus.Enum raceStatus);
    
    /**
     * Sets (as xml) the "RaceStatus" element
     */
    void xsetRaceStatus(com.unitedtote.schema.totelink._2008._06.program.RaceStatus raceStatus);
    
    /**
     * Nils the "RaceStatus" element
     */
    void setNilRaceStatus();
    
    /**
     * Unsets the "RaceStatus" element
     */
    void unsetRaceStatus();
    
    /**
     * Gets the "TrackType" element
     */
    com.unitedtote.schema.totelink._2008._06.program.TrackType.Enum getTrackType();
    
    /**
     * Gets (as xml) the "TrackType" element
     */
    com.unitedtote.schema.totelink._2008._06.program.TrackType xgetTrackType();
    
    /**
     * Tests for nil "TrackType" element
     */
    boolean isNilTrackType();
    
    /**
     * True if has "TrackType" element
     */
    boolean isSetTrackType();
    
    /**
     * Sets the "TrackType" element
     */
    void setTrackType(com.unitedtote.schema.totelink._2008._06.program.TrackType.Enum trackType);
    
    /**
     * Sets (as xml) the "TrackType" element
     */
    void xsetTrackType(com.unitedtote.schema.totelink._2008._06.program.TrackType trackType);
    
    /**
     * Nils the "TrackType" element
     */
    void setNilTrackType();
    
    /**
     * Unsets the "TrackType" element
     */
    void unsetTrackType();
    
    /**
     * Gets the "Current" element
     */
    boolean getCurrent();
    
    /**
     * Gets (as xml) the "Current" element
     */
    org.apache.xmlbeans.XmlBoolean xgetCurrent();
    
    /**
     * True if has "Current" element
     */
    boolean isSetCurrent();
    
    /**
     * Sets the "Current" element
     */
    void setCurrent(boolean current);
    
    /**
     * Sets (as xml) the "Current" element
     */
    void xsetCurrent(org.apache.xmlbeans.XmlBoolean current);
    
    /**
     * Unsets the "Current" element
     */
    void unsetCurrent();
    
    /**
     * Gets the "PostTime" element
     */
    java.util.Calendar getPostTime();
    
    /**
     * Gets (as xml) the "PostTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetPostTime();
    
    /**
     * Tests for nil "PostTime" element
     */
    boolean isNilPostTime();
    
    /**
     * True if has "PostTime" element
     */
    boolean isSetPostTime();
    
    /**
     * Sets the "PostTime" element
     */
    void setPostTime(java.util.Calendar postTime);
    
    /**
     * Sets (as xml) the "PostTime" element
     */
    void xsetPostTime(org.apache.xmlbeans.XmlDateTime postTime);
    
    /**
     * Nils the "PostTime" element
     */
    void setNilPostTime();
    
    /**
     * Unsets the "PostTime" element
     */
    void unsetPostTime();
    
    /**
     * Gets the "NumberOfRunners" element
     */
    int getNumberOfRunners();
    
    /**
     * Gets (as xml) the "NumberOfRunners" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberOfRunners();
    
    /**
     * True if has "NumberOfRunners" element
     */
    boolean isSetNumberOfRunners();
    
    /**
     * Sets the "NumberOfRunners" element
     */
    void setNumberOfRunners(int numberOfRunners);
    
    /**
     * Sets (as xml) the "NumberOfRunners" element
     */
    void xsetNumberOfRunners(org.apache.xmlbeans.XmlInt numberOfRunners);
    
    /**
     * Unsets the "NumberOfRunners" element
     */
    void unsetNumberOfRunners();
    
    /**
     * Gets the "Finish" element
     */
    java.lang.String getFinish();
    
    /**
     * Gets (as xml) the "Finish" element
     */
    org.apache.xmlbeans.XmlString xgetFinish();
    
    /**
     * Tests for nil "Finish" element
     */
    boolean isNilFinish();
    
    /**
     * True if has "Finish" element
     */
    boolean isSetFinish();
    
    /**
     * Sets the "Finish" element
     */
    void setFinish(java.lang.String finish);
    
    /**
     * Sets (as xml) the "Finish" element
     */
    void xsetFinish(org.apache.xmlbeans.XmlString finish);
    
    /**
     * Nils the "Finish" element
     */
    void setNilFinish();
    
    /**
     * Unsets the "Finish" element
     */
    void unsetFinish();
    
    /**
     * Gets the "Program" element
     */
    boolean getProgram();
    
    /**
     * Gets (as xml) the "Program" element
     */
    org.apache.xmlbeans.XmlBoolean xgetProgram();
    
    /**
     * True if has "Program" element
     */
    boolean isSetProgram();
    
    /**
     * Sets the "Program" element
     */
    void setProgram(boolean program);
    
    /**
     * Sets (as xml) the "Program" element
     */
    void xsetProgram(org.apache.xmlbeans.XmlBoolean program);
    
    /**
     * Unsets the "Program" element
     */
    void unsetProgram();
    
    /**
     * Gets the "Odds" element
     */
    boolean getOdds();
    
    /**
     * Gets (as xml) the "Odds" element
     */
    org.apache.xmlbeans.XmlBoolean xgetOdds();
    
    /**
     * True if has "Odds" element
     */
    boolean isSetOdds();
    
    /**
     * Sets the "Odds" element
     */
    void setOdds(boolean odds);
    
    /**
     * Sets (as xml) the "Odds" element
     */
    void xsetOdds(org.apache.xmlbeans.XmlBoolean odds);
    
    /**
     * Unsets the "Odds" element
     */
    void unsetOdds();
    
    /**
     * Gets the "Conditions" element
     */
    java.lang.String getConditions();
    
    /**
     * Gets (as xml) the "Conditions" element
     */
    org.apache.xmlbeans.XmlString xgetConditions();
    
    /**
     * Tests for nil "Conditions" element
     */
    boolean isNilConditions();
    
    /**
     * True if has "Conditions" element
     */
    boolean isSetConditions();
    
    /**
     * Sets the "Conditions" element
     */
    void setConditions(java.lang.String conditions);
    
    /**
     * Sets (as xml) the "Conditions" element
     */
    void xsetConditions(org.apache.xmlbeans.XmlString conditions);
    
    /**
     * Nils the "Conditions" element
     */
    void setNilConditions();
    
    /**
     * Unsets the "Conditions" element
     */
    void unsetConditions();
    
    /**
     * Gets the "RaceType" element
     */
    java.lang.String getRaceType();
    
    /**
     * Gets (as xml) the "RaceType" element
     */
    org.apache.xmlbeans.XmlString xgetRaceType();
    
    /**
     * Tests for nil "RaceType" element
     */
    boolean isNilRaceType();
    
    /**
     * True if has "RaceType" element
     */
    boolean isSetRaceType();
    
    /**
     * Sets the "RaceType" element
     */
    void setRaceType(java.lang.String raceType);
    
    /**
     * Sets (as xml) the "RaceType" element
     */
    void xsetRaceType(org.apache.xmlbeans.XmlString raceType);
    
    /**
     * Nils the "RaceType" element
     */
    void setNilRaceType();
    
    /**
     * Unsets the "RaceType" element
     */
    void unsetRaceType();
    
    /**
     * Gets the "Surface" element
     */
    java.lang.String getSurface();
    
    /**
     * Gets (as xml) the "Surface" element
     */
    org.apache.xmlbeans.XmlString xgetSurface();
    
    /**
     * Tests for nil "Surface" element
     */
    boolean isNilSurface();
    
    /**
     * True if has "Surface" element
     */
    boolean isSetSurface();
    
    /**
     * Sets the "Surface" element
     */
    void setSurface(java.lang.String surface);
    
    /**
     * Sets (as xml) the "Surface" element
     */
    void xsetSurface(org.apache.xmlbeans.XmlString surface);
    
    /**
     * Nils the "Surface" element
     */
    void setNilSurface();
    
    /**
     * Unsets the "Surface" element
     */
    void unsetSurface();
    
    /**
     * Gets the "Distance" element
     */
    java.lang.String getDistance();
    
    /**
     * Gets (as xml) the "Distance" element
     */
    org.apache.xmlbeans.XmlString xgetDistance();
    
    /**
     * Tests for nil "Distance" element
     */
    boolean isNilDistance();
    
    /**
     * True if has "Distance" element
     */
    boolean isSetDistance();
    
    /**
     * Sets the "Distance" element
     */
    void setDistance(java.lang.String distance);
    
    /**
     * Sets (as xml) the "Distance" element
     */
    void xsetDistance(org.apache.xmlbeans.XmlString distance);
    
    /**
     * Nils the "Distance" element
     */
    void setNilDistance();
    
    /**
     * Unsets the "Distance" element
     */
    void unsetDistance();
    
    /**
     * Gets the "Purse" element
     */
    java.math.BigDecimal getPurse();
    
    /**
     * Gets (as xml) the "Purse" element
     */
    org.apache.xmlbeans.XmlDecimal xgetPurse();
    
    /**
     * True if has "Purse" element
     */
    boolean isSetPurse();
    
    /**
     * Sets the "Purse" element
     */
    void setPurse(java.math.BigDecimal purse);
    
    /**
     * Sets (as xml) the "Purse" element
     */
    void xsetPurse(org.apache.xmlbeans.XmlDecimal purse);
    
    /**
     * Unsets the "Purse" element
     */
    void unsetPurse();
    
    /**
     * Gets the "Sex" element
     */
    java.lang.String getSex();
    
    /**
     * Gets (as xml) the "Sex" element
     */
    org.apache.xmlbeans.XmlString xgetSex();
    
    /**
     * Tests for nil "Sex" element
     */
    boolean isNilSex();
    
    /**
     * True if has "Sex" element
     */
    boolean isSetSex();
    
    /**
     * Sets the "Sex" element
     */
    void setSex(java.lang.String sex);
    
    /**
     * Sets (as xml) the "Sex" element
     */
    void xsetSex(org.apache.xmlbeans.XmlString sex);
    
    /**
     * Nils the "Sex" element
     */
    void setNilSex();
    
    /**
     * Unsets the "Sex" element
     */
    void unsetSex();
    
    /**
     * Gets the "Age" element
     */
    java.lang.String getAge();
    
    /**
     * Gets (as xml) the "Age" element
     */
    org.apache.xmlbeans.XmlString xgetAge();
    
    /**
     * Tests for nil "Age" element
     */
    boolean isNilAge();
    
    /**
     * True if has "Age" element
     */
    boolean isSetAge();
    
    /**
     * Sets the "Age" element
     */
    void setAge(java.lang.String age);
    
    /**
     * Sets (as xml) the "Age" element
     */
    void xsetAge(org.apache.xmlbeans.XmlString age);
    
    /**
     * Nils the "Age" element
     */
    void setNilAge();
    
    /**
     * Unsets the "Age" element
     */
    void unsetAge();
    
    /**
     * Gets the "Claim" element
     */
    java.math.BigDecimal getClaim();
    
    /**
     * Gets (as xml) the "Claim" element
     */
    org.apache.xmlbeans.XmlDecimal xgetClaim();
    
    /**
     * True if has "Claim" element
     */
    boolean isSetClaim();
    
    /**
     * Sets the "Claim" element
     */
    void setClaim(java.math.BigDecimal claim);
    
    /**
     * Sets (as xml) the "Claim" element
     */
    void xsetClaim(org.apache.xmlbeans.XmlDecimal claim);
    
    /**
     * Unsets the "Claim" element
     */
    void unsetClaim();
    
    /**
     * Gets the "Live" element
     */
    java.lang.String getLive();
    
    /**
     * Gets (as xml) the "Live" element
     */
    com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList xgetLive();
    
    /**
     * Tests for nil "Live" element
     */
    boolean isNilLive();
    
    /**
     * True if has "Live" element
     */
    boolean isSetLive();
    
    /**
     * Sets the "Live" element
     */
    void setLive(java.lang.String live);
    
    /**
     * Sets (as xml) the "Live" element
     */
    void xsetLive(com.unitedtote.schema.totelink.totedatatypes._2008._04.CompressedList live);
    
    /**
     * Nils the "Live" element
     */
    void setNilLive();
    
    /**
     * Unsets the "Live" element
     */
    void unsetLive();
    
    /**
     * Gets the "PoolList" element
     */
    java.lang.String getPoolList();
    
    /**
     * Gets (as xml) the "PoolList" element
     */
    org.apache.xmlbeans.XmlString xgetPoolList();
    
    /**
     * Tests for nil "PoolList" element
     */
    boolean isNilPoolList();
    
    /**
     * True if has "PoolList" element
     */
    boolean isSetPoolList();
    
    /**
     * Sets the "PoolList" element
     */
    void setPoolList(java.lang.String poolList);
    
    /**
     * Sets (as xml) the "PoolList" element
     */
    void xsetPoolList(org.apache.xmlbeans.XmlString poolList);
    
    /**
     * Nils the "PoolList" element
     */
    void setNilPoolList();
    
    /**
     * Unsets the "PoolList" element
     */
    void unsetPoolList();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.unitedtote.schema.totelink._2008._06.program.Race newInstance() {
          return (com.unitedtote.schema.totelink._2008._06.program.Race) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Race newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.unitedtote.schema.totelink._2008._06.program.Race) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.unitedtote.schema.totelink._2008._06.program.Race parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.Race) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Race parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.Race) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.unitedtote.schema.totelink._2008._06.program.Race parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.Race) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Race parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.Race) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Race parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.Race) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Race parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.Race) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Race parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.Race) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Race parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.Race) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Race parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.Race) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Race parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.unitedtote.schema.totelink._2008._06.program.Race) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Race parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.Race) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Race parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.Race) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Race parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.Race) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.unitedtote.schema.totelink._2008._06.program.Race parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.unitedtote.schema.totelink._2008._06.program.Race) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.unitedtote.schema.totelink._2008._06.program.Race parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.unitedtote.schema.totelink._2008._06.program.Race) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.unitedtote.schema.totelink._2008._06.program.Race parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.unitedtote.schema.totelink._2008._06.program.Race) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
