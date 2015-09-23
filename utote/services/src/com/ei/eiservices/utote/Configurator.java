/**
 *
 */
package com.ei.eiservices.utote;

import java.io.InputStream;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.persistence.config.PersistenceUnitProperties;
import org.eclipse.persistence.logging.SessionLog;

/**
 * @author jordanolin
 *
 */
public class Configurator {

    private static final Logger log4j = LogManager.getLogger(Configurator.class.getName());

    private static final String SERVER_DOMAIN = "SERVER_DOMAIN";
    private static final String SERVER_DOMAIN_PROD = "racetrackwarriors.com";

    private static final String SERVER_MODE = "SERVER_MODE";
    private static final String SERVER_MODE_PROD = "PROD";
    private static final String SERVER_MODE_BETA = "BETA";

    private static final String UTOTE_MODE= "UTOTE_MODE";
    private static final String UTOTE_SYSTEM_ID = "UTOTE_SYSTEM_ID";
    private static final String UTOTE_SOURCE_ID = "UTOTE_SOURCE_ID";

    private static final String UTOTE_USERNAME = "UTOTE_BASIC_AUTH_USERNAME";
    private static final String UTOTE_PASSWORD = "UTOTE_BASIC_AUTH_PASSWORD";

    public static final String UTOTE_CONFIG_SVC_EP = "UTOTE_CONFIG_SVC_EP";
    public static final String UTOTE_PROGRAM_SVC_EP = "UTOTE_PROGRAM_SVC_EP";
    public static final String UTOTE_RESULT_SVC_EP = "UTOTE_RESULT_SVC_EP";
    public static final String UTOTE_STATUS_SVC_EP = "UTOTE_STATUS_SVC_EP";

    public static final String UTOTE_GET_PROGRAM_DATA = "UTOTE_GET_PROGRAM_DATA";
    public static final String UTOTE_GET_POOL_DATA = "UTOTE_GET_POOL_DATA";
    public static final String UTOTE_GET_RACES_DATA = "UTOTE_GET_RACES_DATA";
    public static final String UTOTE_GET_RUNNERS_DATA = "UTOTE_GET_RUNNERS_DATA";

    public static final String UTOTE_EVENT_TRACK_TYPES = "UTOTE_EVENT_TRACK_TYPES";

    private static final String JPA_JDBC_URL = PersistenceUnitProperties.JDBC_URL;
    private static final String JPA_JDBC_USER = PersistenceUnitProperties.JDBC_USER;
    private static final String JPA_JDBC_PW = PersistenceUnitProperties.JDBC_PASSWORD;
    private static final String JPA_JDBC_DRIVER = PersistenceUnitProperties.JDBC_DRIVER;
    private static final String JPA_LOGGING_FILE = PersistenceUnitProperties.LOGGING_FILE;
    private static final String JPA_LOGGING_LEVEL = PersistenceUnitProperties.LOGGING_LEVEL;
    private static final String JPA_LOGGING_LEVEL_SQL = PersistenceUnitProperties.CATEGORY_LOGGING_LEVEL_ + SessionLog.SQL;
    private static final String JPA_LOGGING_PARAMETERS = PersistenceUnitProperties.LOGGING_PARAMETERS;
    private static final String DB_RW_PROPS = "DB_RW_PROPS";
    private static final String DB_RW_URL = "DB_RW_URL";
    private static final String DB_RW_USER= "DB_RW_USER";
    private static final String DB_RW_PW = "DB_RW_PW";
    private static final String DB_RW_DRIVER = "DB_RW_DRIVER";
    private static final String DB_RW_LOGGING_ENABLED = "DB_RW_LOGGING_ENABLED";
    private static final String DB_RW_LOGGING_FILE = "DB_RW_LOGGING_FILE";
    private static final String DB_RW_LOGGING_LEVEL = "DB_RW_LOGGING_LEVEL";
    private static final String DB_RW_LOGGING_LEVEL_SQL = "DB_RW_LOGGING_LEVEL_SQL";
    private static final String DB_RW_LOGGING_PARAMETERS = "DB_RW_LOGGING_PARAMETERS";
    private static final String DB_RO_PROPS = "DB_RO_PROPS";
    private static final String DB_RO_URL = "DB_RO_URL";
    private static final String DB_RO_USER = "DB_RO_USER";
    private static final String DB_RO_PW = "DB_RO_PW";
    private static final String DB_RO_DRIVER = "DB_RO_DRIVER";
    private static final String DB_RO_LOGGING_ENABLED = "DB_RO_LOGGING_ENABLED";
    private static final String DB_RO_LOGGING_FILE = "DB_RO_LOGGING_FILE";
    private static final String DB_RO_LOGGING_LEVEL = "DB_RO_LOGGING_LEVEL";
    private static final String DB_RO_LOGGING_LEVEL_SQL = "DB_RO_LOGGING_LEVEL_SQL";
    private static final String DB_RO_LOGGING_PARAMETERS = "DB_RO_LOGGING_PARAMETERS";
    private static final String DB_RTW_PROPS = "DB_RTW_PROPS";
    private static final String DB_RTW_URL = "DB_RTW_URL";
    private static final String DB_RTW_USER= "DB_RTW_USER";
    private static final String DB_RTW_PW = "DB_RTW_PW";
    private static final String DB_RTW_DRIVER = "DB_RTW_DRIVER";
    private static final String DB_RTW_LOGGING_ENABLED = "DB_RTW_LOGGING_ENABLED";
    private static final String DB_RTW_LOGGING_FILE = "DB_RTW_LOGGING_FILE";
    private static final String DB_RTW_LOGGING_LEVEL = "DB_RTW_LOGGING_LEVEL";
    private static final String DB_RTW_LOGGING_LEVEL_SQL = "DB_RTW_LOGGING_LEVEL_SQL";
    private static final String DB_RTW_LOGGING_PARAMETERS = "DB_RTW_LOGGING_PARAMETERS";

    private static final String PER_THREAD_WAIT_GET_EVENT_DETAILS = "PER_THREAD_WAIT_GET_EVENT_DETAILS";
    private static final String PER_THREAD_WAIT_GET_RACE_DETAILS = "PER_THREAD_WAIT_GET_RACE_DETAILS";

    private static final String PERSISTENCE_UNIT_NAME = "UtoteServices";
    private static final String UNINITIALIZED = "";
    private static final String PROD_CONFIG_PROPERTIES_PATH = "/config/prod.properties";
    private static final String BETA_CONFIG_PROPERTIES_PATH = "/config/beta.properties";

    private static boolean _initialized = false;
    private static String _utoteMode = UNINITIALIZED;
    private static Map<String,Object> _properties = null;
    private static int perThreadWaitGetEventDetails = 0;
    private static int perThreadWaitGetRaceDetails = 0;
    private static boolean requestUtoteProgramData = false;
    private static boolean requestUtotePoolData = false;
    private static boolean requestUtoteRacesData = false;
    private static boolean requestUtoteRunnersData = false;
    private static Map<String,Integer> currentEvents = new HashMap<String,Integer>();

    public static void reconfigureLog4j() {
        ((org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false)).reconfigure();
    }

    public static void initLog4j() {
    }

    public static void init(){
        initLog4j();

        log4j.entry();

        Properties inProps = new Properties();
        String tempstr = "";

        // If init has been called once, clear the preceding values prior to re-load
        if (null != _properties) {
            _properties.clear();
            _properties = null;
        }
        _properties = new HashMap<String,Object>();

        try {
            String configPropertiesPath = PROD_CONFIG_PROPERTIES_PATH;

            // Determine what mode we are operating under: Prod, Beta, Test
            InetAddress address = java.net.InetAddress.getLocalHost();
            String hostname = address.getHostName();
            assert (null != hostname) : "address.getHostName() returned a null value";
            log4j.info("UtoteService Running on host {}, looking for Production domain ending with {}.", hostname, SERVER_DOMAIN_PROD);
            _properties.put(SERVER_DOMAIN, hostname);
            if (hostname.toLowerCase().endsWith(SERVER_DOMAIN_PROD)) {
                _properties.put(SERVER_DOMAIN, hostname);
                _properties.put(SERVER_MODE, SERVER_MODE_PROD);
            } else {
                configPropertiesPath = BETA_CONFIG_PROPERTIES_PATH;
                _properties.put(SERVER_MODE, SERVER_MODE_BETA);
            }

            // Load the properties from the appropriate config file
            InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(configPropertiesPath);
            inProps.load(is);

            // Process United Tote specific values
            tempstr = inProps.getProperty(UTOTE_MODE);
            assert (null != tempstr) : "Property, " + UTOTE_MODE + ", returned a null value";
            _properties.put(UTOTE_MODE, tempstr);
            tempstr = inProps.getProperty(UTOTE_SOURCE_ID);
            assert (null != tempstr) : "Property, " + UTOTE_SOURCE_ID + ", returned a null value";
            _properties.put(UTOTE_SOURCE_ID, tempstr);
            tempstr = inProps.getProperty(UTOTE_SYSTEM_ID);
            assert (null != tempstr) : "Property, " + UTOTE_SYSTEM_ID + ", returned a null value";
            _properties.put(UTOTE_SYSTEM_ID, tempstr);
            tempstr = inProps.getProperty(UTOTE_USERNAME);
            assert (null != tempstr) : "Property, " + UTOTE_USERNAME + ", returned a null value";
            _properties.put(UTOTE_USERNAME, tempstr);
            tempstr = inProps.getProperty(UTOTE_PASSWORD);
            assert (null != tempstr) : "Property, " + UTOTE_PASSWORD + ", returned a null value";
            _properties.put(UTOTE_PASSWORD, tempstr);
            tempstr = inProps.getProperty(UTOTE_EVENT_TRACK_TYPES);
            assert (null != tempstr) : "Property, " + UTOTE_PASSWORD + ", returned a null value";
            _properties.put(UTOTE_EVENT_TRACK_TYPES, Arrays.asList(tempstr.split("\\s*,\\s*")));

            // Process SOAP endpoints
            String keystr = null;
            tempstr = inProps.getProperty(UTOTE_CONFIG_SVC_EP);
            assert (null != tempstr) : "Property, " + UTOTE_CONFIG_SVC_EP + ", returned a null value";
            keystr = UTOTE_CONFIG_SVC_EP + tempstr;
            tempstr = inProps.getProperty(keystr);
            assert (null != tempstr) : "Property, " + keystr + ", returned a null value";
            _properties.put(UTOTE_CONFIG_SVC_EP, tempstr);
            tempstr = inProps.getProperty(UTOTE_PROGRAM_SVC_EP);
            assert (null != tempstr) : "Property, " + UTOTE_PROGRAM_SVC_EP + ", returned a null value";
            keystr = UTOTE_PROGRAM_SVC_EP + tempstr;
            tempstr = inProps.getProperty(keystr);
            assert (null != tempstr) : "Property, " + keystr + ", returned a null value";
            _properties.put(UTOTE_PROGRAM_SVC_EP, tempstr);
            tempstr = inProps.getProperty(UTOTE_RESULT_SVC_EP);
            assert (null != tempstr) : "Property, " + UTOTE_RESULT_SVC_EP + ", returned a null value";
            keystr = UTOTE_RESULT_SVC_EP + tempstr;
            tempstr = inProps.getProperty(keystr);
            assert (null != tempstr) : "Property, " + keystr + ", returned a null value";
            _properties.put(UTOTE_RESULT_SVC_EP, tempstr);
            tempstr = inProps.getProperty(UTOTE_STATUS_SVC_EP);
            assert (null != tempstr) : "Property, " + UTOTE_STATUS_SVC_EP + ", returned a null value";
            keystr = UTOTE_STATUS_SVC_EP + tempstr;
            tempstr = inProps.getProperty(keystr);
            assert (null != tempstr) : "Property, " + keystr + ", returned a null value";
            _properties.put(UTOTE_STATUS_SVC_EP, tempstr);
            tempstr = inProps.getProperty(UTOTE_GET_PROGRAM_DATA);
            assert (null != tempstr) : "Property, " + UTOTE_GET_PROGRAM_DATA + ", returned a null value";
            assert ((tempstr.toLowerCase() == "true") || (tempstr.toLowerCase() == "false")) : "Property, " + UTOTE_GET_PROGRAM_DATA + ", is not \"true\" or \"false\"";
            requestUtoteProgramData = "true".equals(tempstr.toLowerCase());
            tempstr = inProps.getProperty(UTOTE_GET_POOL_DATA);
            assert (null != tempstr) : "Property, " + UTOTE_GET_POOL_DATA + ", returned a null value";
            assert ((tempstr.toLowerCase() == "true") || (tempstr.toLowerCase() == "false")) : "Property, " + UTOTE_GET_POOL_DATA + ", is not \"true\" or \"false\"";
            requestUtotePoolData = "true".equals(tempstr.toLowerCase());
            tempstr = inProps.getProperty(UTOTE_GET_RACES_DATA);
            assert (null != tempstr) : "Property, " + UTOTE_GET_RACES_DATA + ", returned a null value";
            assert ((tempstr.toLowerCase() == "true") || (tempstr.toLowerCase() == "false")) : "Property, " + UTOTE_GET_RACES_DATA + ", is not \"true\" or \"false\"";
            requestUtoteRacesData = "true".equals(tempstr.toLowerCase());
            tempstr = inProps.getProperty(UTOTE_GET_RUNNERS_DATA);
            assert (null != tempstr) : "Property, " + UTOTE_GET_RUNNERS_DATA + ", returned a null value";
            assert ((tempstr.toLowerCase() == "true") || (tempstr.toLowerCase() == "false")) : "Property, " + UTOTE_GET_RUNNERS_DATA + ", is not \"true\" or \"false\"";
            requestUtoteRunnersData = "true".equals(tempstr.toLowerCase());

            // Process persistence variables for the transactional (read/write)
            Properties rwDbProps = new Properties();
            tempstr = inProps.getProperty(DB_RW_URL);
            assert (null != tempstr) : "Property, " + DB_RW_URL + ", returned a null value";
            rwDbProps.setProperty(JPA_JDBC_URL, tempstr);
            tempstr = inProps.getProperty(DB_RW_USER);
            assert (null != tempstr) : "Property, " + DB_RW_USER + ", returned a null value";
            rwDbProps.setProperty(JPA_JDBC_USER, tempstr);
            tempstr = inProps.getProperty(DB_RW_PW);
            assert (null != tempstr) : "Property, " + DB_RW_PW + ", returned a null value";
            rwDbProps.setProperty(JPA_JDBC_PW, tempstr);
            tempstr = inProps.getProperty(DB_RW_DRIVER);
            assert (null != tempstr) : "Property, " + DB_RW_DRIVER + ", returned a null value";
            rwDbProps.setProperty(JPA_JDBC_DRIVER, tempstr);
            tempstr = inProps.getProperty(DB_RW_LOGGING_ENABLED);
            if ((null != tempstr) && "true".equalsIgnoreCase(tempstr)) {
                tempstr = inProps.getProperty(DB_RW_LOGGING_FILE);
                assert (null != tempstr) : "Property, " + DB_RW_LOGGING_FILE + ", returned a null value";
                rwDbProps.setProperty(JPA_LOGGING_FILE, tempstr);
                tempstr = inProps.getProperty(DB_RW_LOGGING_LEVEL);
                assert (null != tempstr) : "Property, " + DB_RW_LOGGING_LEVEL + ", returned a null value";
                rwDbProps.setProperty(JPA_LOGGING_LEVEL, tempstr);
                tempstr = inProps.getProperty(DB_RW_LOGGING_LEVEL_SQL);
                assert (null != tempstr) : "Property, " + DB_RW_LOGGING_LEVEL_SQL + ", returned a null value";
                rwDbProps.setProperty(JPA_LOGGING_LEVEL_SQL, tempstr);
                tempstr = inProps.getProperty(DB_RW_LOGGING_PARAMETERS);
                assert (null != tempstr) : "Property, " + DB_RW_LOGGING_PARAMETERS + ", returned a null value";
                rwDbProps.setProperty(JPA_LOGGING_PARAMETERS, tempstr);
            }
            _properties.put(DB_RW_PROPS, rwDbProps);

            // Process persistence variables for the transactional (read/write)
            Properties roDbProps = new Properties();
            tempstr = inProps.getProperty(DB_RO_URL);
            assert (null != tempstr) : "Property, " + DB_RO_URL + ", returned a null value";
            roDbProps.setProperty(JPA_JDBC_URL, tempstr);
            tempstr = inProps.getProperty(DB_RO_USER);
            assert (null != tempstr) : "Property, " + DB_RO_USER + ", returned a null value";
            roDbProps.setProperty(JPA_JDBC_USER, tempstr);
            tempstr = inProps.getProperty(DB_RO_PW);
            assert (null != tempstr) : "Property, " + DB_RO_PW + ", returned a null value";
            roDbProps.setProperty(JPA_JDBC_PW, tempstr);
            tempstr = inProps.getProperty(DB_RO_DRIVER);
            assert (null != tempstr) : "Property, " + DB_RO_DRIVER + ", returned a null value";
            roDbProps.setProperty(JPA_JDBC_DRIVER, tempstr);
            tempstr = inProps.getProperty(DB_RO_LOGGING_ENABLED);
            if ((null != tempstr) && "true".equalsIgnoreCase(tempstr)) {
                tempstr = inProps.getProperty(DB_RO_LOGGING_FILE);
                assert (null != tempstr) : "Property, " + DB_RO_LOGGING_FILE + ", returned a null value";
                roDbProps.setProperty(JPA_LOGGING_FILE, tempstr);
                tempstr = inProps.getProperty(DB_RO_LOGGING_LEVEL);
                assert (null != tempstr) : "Property, " + DB_RO_LOGGING_LEVEL + ", returned a null value";
                roDbProps.setProperty(JPA_LOGGING_LEVEL, tempstr);
                tempstr = inProps.getProperty(DB_RO_LOGGING_LEVEL_SQL);
                assert (null != tempstr) : "Property, " + DB_RO_LOGGING_LEVEL_SQL + ", returned a null value";
                roDbProps.setProperty(JPA_LOGGING_LEVEL_SQL, tempstr);
                tempstr = inProps.getProperty(DB_RO_LOGGING_PARAMETERS);
                assert (null != tempstr) : "Property, " + DB_RO_LOGGING_PARAMETERS + ", returned a null value";
                roDbProps.setProperty(JPA_LOGGING_PARAMETERS, tempstr);
            }
            _properties.put(DB_RO_PROPS, roDbProps);

            // Process persistence variables for the transactional RTW (read/write)
            Properties rtwDbProps = new Properties();
            tempstr = inProps.getProperty(DB_RTW_URL);
            assert (null != tempstr) : "Property, " + DB_RTW_URL + ", returned a null value";
            rtwDbProps.setProperty(JPA_JDBC_URL, tempstr);
            tempstr = inProps.getProperty(DB_RTW_USER);
            assert (null != tempstr) : "Property, " + DB_RTW_USER + ", returned a null value";
            rtwDbProps.setProperty(JPA_JDBC_USER, tempstr);
            tempstr = inProps.getProperty(DB_RTW_PW);
            assert (null != tempstr) : "Property, " + DB_RTW_PW + ", returned a null value";
            rtwDbProps.setProperty(JPA_JDBC_PW, tempstr);
            tempstr = inProps.getProperty(DB_RTW_DRIVER);
            assert (null != tempstr) : "Property, " + DB_RTW_DRIVER + ", returned a null value";
            rtwDbProps.setProperty(JPA_JDBC_DRIVER, tempstr);
            tempstr = inProps.getProperty(DB_RTW_LOGGING_ENABLED);
            if ((null != tempstr) && "true".equalsIgnoreCase(tempstr)) {
                tempstr = inProps.getProperty(DB_RTW_LOGGING_FILE);
                assert (null != tempstr) : "Property, " + DB_RTW_LOGGING_FILE + ", returned a null value";
                rtwDbProps.setProperty(JPA_LOGGING_FILE, tempstr);
                tempstr = inProps.getProperty(DB_RTW_LOGGING_LEVEL);
                assert (null != tempstr) : "Property, " + DB_RTW_LOGGING_LEVEL + ", returned a null value";
                rtwDbProps.setProperty(JPA_LOGGING_LEVEL, tempstr);
                tempstr = inProps.getProperty(DB_RTW_LOGGING_LEVEL_SQL);
                assert (null != tempstr) : "Property, " + DB_RTW_LOGGING_LEVEL_SQL + ", returned a null value";
                rtwDbProps.setProperty(JPA_LOGGING_LEVEL_SQL, tempstr);
                tempstr = inProps.getProperty(DB_RTW_LOGGING_PARAMETERS);
                assert (null != tempstr) : "Property, " + DB_RTW_LOGGING_PARAMETERS + ", returned a null value";
                rtwDbProps.setProperty(JPA_LOGGING_PARAMETERS, tempstr);
            }
            _properties.put(DB_RTW_PROPS, rtwDbProps);

            // Process threading variables
            tempstr = inProps.getProperty(PER_THREAD_WAIT_GET_EVENT_DETAILS);
            assert (null != tempstr) : "Property, " + PER_THREAD_WAIT_GET_EVENT_DETAILS + ", returned a null value";
            perThreadWaitGetEventDetails = Integer.parseInt(tempstr);
            tempstr = inProps.getProperty(PER_THREAD_WAIT_GET_RACE_DETAILS);
            assert (null != tempstr) : "Property, " + PER_THREAD_WAIT_GET_RACE_DETAILS + ", returned a null value";
            perThreadWaitGetRaceDetails = Integer.parseInt(tempstr);

            is.close();

            _initialized = true;
        } catch (Exception e ) {
            log4j.error("Configurator.init: ",e);
        }
        if (log4j.isTraceEnabled()) {
            log4j.trace("Configurator.init completed. _properties={}, requestUtoteProgramData={}, requestUtotePoolData={}, requestUtoteRacesData={}, requestUtoteRunnersData={}, perThreadWaitGetEventDetails={}, perThreadWaitGetRaceDetails={}",_properties, requestUtoteProgramData, requestUtotePoolData, requestUtoteRacesData, requestUtoteRunnersData, perThreadWaitGetEventDetails, perThreadWaitGetRaceDetails);
        } else {
            log4j.debug("Configurator.init completed. _properties.size={}, requestUtoteProgramData={}, requestUtotePoolData={}, requestUtoteRacesData={}, requestUtoteRunnersData={}, perThreadWaitGetEventDetails={}, perThreadWaitGetRaceDetails={}",_properties.size(), requestUtoteProgramData, requestUtotePoolData, requestUtoteRacesData, requestUtoteRunnersData, perThreadWaitGetEventDetails, perThreadWaitGetRaceDetails);
        }
        log4j.exit(_properties);

    }

    public static Properties getDbRWProps() {
        return (Properties) Configurator.getObject(DB_RW_PROPS);
    }

    public static Properties getDbROProps() {
        return (Properties) Configurator.getObject(DB_RO_PROPS);
    }

    public static Properties getDbRTWProps() {
        return (Properties) Configurator.getObject(DB_RTW_PROPS);
    }

    public static String getSystemId() {
        return Configurator.getProperty(UTOTE_SYSTEM_ID);
    }

    public static String getSourceId() {
        return Configurator.getProperty(UTOTE_SOURCE_ID);
    }

    public static String getBasicAuthUsername() {
        return Configurator.getProperty(UTOTE_USERNAME);
    }

    public static String getBasicAuthPassword() {
        return Configurator.getProperty(UTOTE_PASSWORD);
    }

    public static boolean isSupportedTrackType(String trackType) {
        @SuppressWarnings("unchecked")
        List<String> lst = (List<String>) Configurator.getObject(UTOTE_EVENT_TRACK_TYPES);
        boolean found = lst.contains(trackType);
        log4j.debug("isSupportedTrackType - found={}, incoming trackType={}, lst={}", found, trackType, lst.toString());
        return (found);
    }

    @SuppressWarnings("unchecked")
    public static List<String> getSupportedTrackTypes() {
        return (List<String>) Configurator.getObject(UTOTE_EVENT_TRACK_TYPES);
    }

    public static String getProperty(String key) {
        if (!_initialized) {
            init();
        }
        return (String)_properties.get(key);
    }

    public static Object getObject(String key) {
        if (!_initialized) {
            init();
        }
        return _properties.get(key);
    }

    public static int getPerThreadWaitGetEventDetails() {
        if (!_initialized) {
            init();
        }
        return perThreadWaitGetEventDetails;
    }

    public static int getPerThreadWaitGetRaceDetails() {
        if (!_initialized) {
            init();
        }
        return perThreadWaitGetRaceDetails;
    }

    public static boolean getUtoteProgramData() {
        if (!_initialized) {
            init();
        }
        return requestUtoteProgramData;
    }

    public static boolean getUtotePoolData() {
        if (!_initialized) {
            init();
        }
        return requestUtotePoolData;
    }

    public static boolean getUtoteRacesData() {
        if (!_initialized) {
            init();
        }
        return requestUtoteRacesData;
    }

    public static boolean getUtoteRunnersData() {
        if (!_initialized) {
            init();
        }
        return requestUtoteRunnersData;
    }

    public static javax.persistence.EntityManagerFactory getRWEMF() {
        // if factory is missing, create it
        javax.persistence.EntityManagerFactory emFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME, getDbRWProps());
        // Return Entity Manager Factory
        return emFactory;
    }

    public static EntityManagerFactory getROEMF() {
        // if factory is missing, create it
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME, getDbROProps());
        // Return Entity Manager Factory
        return emFactory;
    }

    public static EntityManagerFactory getRTWEMF() {
        // if factory is missing, create it
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME, getDbRTWProps());
        // Return Entity Manager Factory
        return emFactory;
    }


    public static boolean isInitialized() {
        return _initialized;
    }

    public static Map<String,Object> getProperties() {
        return _properties;
    }

    public static void test() {
        if (_initialized) {
            return;
        }
        log4j.entry();
        if (!_initialized) {
            init();
        }
        log4j.debug("_initialted={}",_initialized);
        log4j.debug("_utoteMode={}",_utoteMode);
        log4j.trace("_properties={}",_properties);
        log4j.exit();
    }

    /**
     * @return the currentEvents
     */
    public static Map<String, Integer> getCurrentEvents() {
        return currentEvents;
    }

    /**
     * @param currentEvents the currentEvents to set
     */
    public static void setCurrentEvents(Map<String, Integer> currentEvents) {
        Configurator.currentEvents = currentEvents;
    }

    /**
     * @param currentEvents the currentEvents to set
     */
    public static void addCurrentEvents(Map<String, Integer> currentEvents) {
        Configurator.currentEvents.clear();
        Configurator.currentEvents.putAll(currentEvents);
    }

    public static boolean eventExists(String eventId) {
        return Configurator.currentEvents.containsKey(eventId);
    }

    public static Integer getIdUtoteEvent(String eventId) {
        return Configurator.currentEvents.get(eventId);
    }

}
