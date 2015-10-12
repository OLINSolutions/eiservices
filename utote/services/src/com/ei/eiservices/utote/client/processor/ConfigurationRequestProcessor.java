package com.ei.eiservices.utote.client.processor;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.apache.axis2.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ei.eiservices.utote.Configurator;
import com.ei.eiservices.utote.LogHelper;
import com.ei.eiservices.utote.UtoteRequestResponseLogger;
import com.ei.eiservices.utote.client.configurationservice.ConfigurationServiceStub;
import com.ei.eiservices.utote.client.configurationservice.Configuration_GetConfiguration_ToteFaultFault_FaultMessage;
import com.ei.eiservices.utote.client.configurationservice.Configuration_GetConfiguration_ValidationFaultFault_FaultMessage;
import com.ei.eiservices.utote.model.UtoteConfiguration;

public class ConfigurationRequestProcessor {

    private static final Logger log4j = LogManager.getLogger(ConfigurationRequestProcessor.class.getName());

    private static ConfigurationServiceStub.Source getSource() {
        ConfigurationServiceStub.Source source = new ConfigurationServiceStub.Source();
        source.setSystemId(Configurator.getSystemId());
        source.setSourceId(Configurator.getSourceId());
        return source;
    }

    private static UtoteConfiguration cloneConfiguration(UtoteConfiguration uConfig, ConfigurationServiceStub.ConfigurationResponse cResponse) {

        if (cResponse.isAccountCardSpecified()) {
            uConfig.setAccountCard(cResponse.getAccountCard());
        }
        if (cResponse.isAccountOffsetSpecified()) {
            uConfig.setAccountOffset(cResponse.getAccountOffset());
        }
        if (cResponse.isAccountSizeSpecified()) {
            uConfig.setAccountSize(cResponse.getAccountSize());
        }
        if (cResponse.isAccountTimeoutSpecified()) {
            uConfig.setAccountTimeout(cResponse.getAccountTimeout());
        }
        if (cResponse.isAccountSpecified()) {
            // Create and populate AccountContest objects
        }
        if (cResponse.isAdvertisementSpecified()) {
            // Create and populate Advertisement object
        }
        if (cResponse.isAssistanceSpecified()) {
            uConfig.setAssistance(cResponse.getAssistance());
        }
        if (cResponse.isBAMSpecified()) {
            uConfig.setBam(cResponse.getBAM());
        }
        if (cResponse.isBrandTimeSpecified()) {
            uConfig.setBrandTime(cResponse.getBrandTime());
        }
        if (cResponse.isCancelsSpecified()) {
            uConfig.setCancels(cResponse.getCancels());
        }
        if (cResponse.isCashReceiptsSpecified()) {
            uConfig.setCashReceipts(cResponse.getCashReceipts());
        }
        if (cResponse.isChannelsSpecified()) {
            uConfig.setHasChannels(true);
            // Create and populate Channel objects
        } else {
            uConfig.setHasChannels(false);
        }
        if (cResponse.isContestSpecified()) {
            // Create and populate AccountContest object
        }
        if (cResponse.isCurrenciesSpecified()) {
            uConfig.setHasCurrencies(true);
            // Create and populate Currency objects
        } else {
            uConfig.setHasCurrencies(false);
        }
        if (cResponse.isCurrentTimeSpecified()) {
            uConfig.setCurrentTime(cResponse.getCurrentTime().getTime());
        }
        if (cResponse.isCustomerLogoSpecified()) {
            uConfig.setCustomerLogo(cResponse.getCustomerLogo());
        }
        if (cResponse.isDateFormatSpecified()) {
            uConfig.setDateFormat(cResponse.getDateFormat());
        }
        if (cResponse.isDatePictureSpecified()) {
            uConfig.setDatePicture(cResponse.getDatePicture());
        }
        if (cResponse.isDefaultEventSpecified()) {
            uConfig.setDefaultEvent(cResponse.getDefaultEvent());
        }
        if (cResponse.isDemandSpecified()) {
            // Create and populate Demand object
        }
        if (cResponse.isErrorSpecified()) {
            // Process error response
        }
        if (cResponse.isFractionalSpecified()) {
            uConfig.setFractional(cResponse.getFractional());
        }
        if (cResponse.isFunBetsSpecified()) {
            uConfig.setFunBets(cResponse.getFunBets());
        }
        if (cResponse.isFundedTimeoutSpecified()) {
            uConfig.setFundedTimeout(cResponse.getFundedTimeout());
        }
        if (cResponse.isGroupIdSpecified()) {
            // Preserve Group Id
        }
        if (cResponse.isInquirySpecified()) {
            uConfig.setInquiry(cResponse.getInquiry());
        }
        if (cResponse.isLanguagesSpecified()) {
            uConfig.setHasLanguages(true);
            // Create and populate Language objects
        } else {
            uConfig.setHasChannels(false);
        }
        if (cResponse.isLimitsSpecified()) {
            // Create and populate Limit objects
        }
        if (cResponse.isLocationSpecified()) {
            uConfig.setLocation(cResponse.getLocation());
        }
        if (cResponse.isLongTicketSpecified()) {
            uConfig.setLongTicket(cResponse.getLongTicket());
        }
        if (cResponse.isManualLogOnSpecified()) {
            uConfig.setManualLogOn(cResponse.getManualLogOn());
        }
        if (cResponse.isMixedSpecified()) {
            uConfig.setMixed(cResponse.getMixed());
        }
        if (cResponse.isModeSpecified()) {
            uConfig.setMode(cResponse.getMode().getValue());
        }
        if (cResponse.isParlaySpecified()) {
            uConfig.setParlay(cResponse.getParlay());
        }
        if (cResponse.isPatronOffsetSpecified()) {
            uConfig.setPatronOffset(cResponse.getPatronOffset());
        }
        if (cResponse.isPatronSizeSpecified()) {
            uConfig.setPatronSize(cResponse.getPatronSize());
        }
        if (cResponse.isQuickSpecified()) {
            uConfig.setQuick(cResponse.getQuick());
        }
        if (cResponse.isRedactSpecified()) {
            uConfig.setRedact(cResponse.getRedact());
        }
        if (cResponse.isRunIdSpecified()) {
            // Preserve RunId
        }
        if (cResponse.isScrambleKeyPadSpecified()) {
            uConfig.setScrambleKeyPad(cResponse.getScrambleKeyPad());
        }
        if (cResponse.isSourceSpecified()) {
            // Preserve Source
        }
        if (cResponse.isSwipeRequiredSpecified()) {
            uConfig.setSwipeRequired(cResponse.getSwipeRequired());
        }
        if (cResponse.isTerminalSpecified()) {
            uConfig.setTerminal(cResponse.getTerminal());
        }
        if (cResponse.isTicketLogoSpecified()) {
            uConfig.setTicketLogo(cResponse.getTicketLogo());
        }
        if (cResponse.isTimeZoneIndexSpecified()) {
            uConfig.setTimeZoneIndex(cResponse.getTimeZoneIndex());
        }
        if (cResponse.isTokenSpecified()) {
            uConfig.setToken(cResponse.getToken());
        }
        if (cResponse.isToteVersionSpecified()) {
            uConfig.setToteVersion(cResponse.getToteVersion());
        }
        uConfig.setToteLinkVersion(cResponse.getToteLinkVersion());
        if (cResponse.isTransactionReceiptsSpecified()) {
            uConfig.setTransactionReceipts(cResponse.getTransactionReceipts());
        }
        if (cResponse.isUnfundedTimeoutSpecified()) {
            uConfig.setUnfundedTimeout(cResponse.getUnfundedTimeout());
        }
        if (cResponse.isVideoSpecified()) {
            uConfig.setVideo(cResponse.getVideo());
        }

        return uConfig;
    }

    private static UtoteConfiguration persistConfiguration(ConfigurationServiceStub.GetConfigurationResponse uConfig) {
        log4j.entry(uConfig);

        // Get an Entity Manager
        final EntityManagerFactory emF = Configurator.getRWEMF();
        final EntityManager em = emF.createEntityManager();

        // Create new configuration object
        UtoteConfiguration utoteConfig = new UtoteConfiguration();

        // Update the information in the record with what was submitted
        utoteConfig = cloneConfiguration(utoteConfig, uConfig.getConfigurationResponse());

        // Insert a new utoteConfiguration
        // representing the contents of this message
        em.getTransaction().begin();
        em.persist(utoteConfig);
        int idUtoteConfig = 0;
        try {
            em.getTransaction().commit();
            idUtoteConfig = utoteConfig.getIdUtoteConfiguration();
            log4j.info("persistConfiguration - UtoteConfiguration persisted, Entity Id={}", idUtoteConfig);
        } catch (Exception e) {
            log4j.debug("persistConfiguration - Exception commiting after em.persist: "+e.getMessage(),e);
        }
        // Read the existing UToteStatusChange entries and write to console
        if (log4j.isTraceEnabled()) {
            TypedQuery<UtoteConfiguration> q = em.createQuery("SELECT c from UtoteConfiguration c where c.idUtoteConfiguration = :idUtoteConfig", UtoteConfiguration.class);
            q.setParameter("idUtoteConfig", idUtoteConfig);
            List<UtoteConfiguration> configList = q.getResultList();
            log4j.trace("persistConfiguration - configList Size: {}", configList.size());
        }

        // Close the connections
        try {

            em.close();
            emF.close();
        } catch (Exception e) {
            log4j.debug("persistConfiguration - Exception trying em.close(): "+e.getMessage(),e);
        }

        log4j.exit(utoteConfig);
        return utoteConfig;

    }

    public static UtoteConfiguration getConfiguration() {
        log4j.entry("getConfiguration");

        UtoteConfiguration utoteConfig= new UtoteConfiguration();
        ConfigurationServiceStub.GetConfigurationResponse cResponse = null;
        ConfigurationServiceStub.ConfigurationResponse config = null;
        int requestLogId = 0;
        int responseLogId = 0;

        // Make call to GetRace
        try {

            // Setup call
            log4j.debug("getConfiguration - Settting up GetConfiguration call");
            ConfigurationServiceStub stub = new ConfigurationServiceStub();
            ConfigurationServiceStub.GetConfiguration getConfigInput = new ConfigurationServiceStub.GetConfiguration();
            ConfigurationServiceStub.ConfigurationRequest cRequest = new ConfigurationServiceStub.ConfigurationRequest();
            cRequest.setSource(getSource());
            getConfigInput.setConfigurationRequest(cRequest);
            log4j.trace("getConfiguration - cRequest={}",cRequest.toString());
            log4j.trace("getConfiguration - getConfigInput={}",getConfigInput.toString());

            // Log the request
            requestLogId = (new UtoteRequestResponseLogger()).saveGetConfigurationRequest(getConfigInput);

            // Make the call
            cResponse = stub.getConfiguration(getConfigInput);

            // Make sure we got a response
            if (null == cResponse) {
                log4j.error("getConfiguration - Null response returned from GetConfiguration request.");
            }


        } catch (Configuration_GetConfiguration_ValidationFaultFault_FaultMessage e) {
            log4j.error("getConfiguration - Configuration_GetConfiguration_ValidationFaultFault_FaultMessage getting Configuration details - "+e.getMessage(),e);
        } catch (Configuration_GetConfiguration_ToteFaultFault_FaultMessage e) {
            log4j.error("getConfiguration - Configuration_GetConfiguration_ToteFaultFault_FaultMessage getting Configuraiton details - "+e.getMessage(),e);
        } catch (AxisFault e) {
            log4j.error("getConfiguration - AxisFault getting configuration details - "+e.getMessage(),e);
        } catch (Exception e) {
            log4j.error("getConfiguration - General exception getting configuration details - "+e.getMessage(),e);
        }

        if ((null != cResponse) && cResponse.isConfigurationResponseSpecified()) {

            // Get the response
            config = cResponse.getConfigurationResponse();

            // Debug for the race response header
            log4j.debug("getConfiguration - Configuration Response:");
            log4j.debug("\tItems with an \"(*)\" are optional.");
            LogHelper.debugOut(log4j, "\tGroup Id(*): ", config.isGroupIdSpecified(), config.getGroupId());
            LogHelper.debugOut(log4j, "\tRun Id(*): ", config.isRunIdSpecified(), config.getRunId());
            log4j.debug("\tSource (Source Id/System Id): {}/{}", config.getSource().getSourceId(), config.getSource().getSystemId());
            LogHelper.debugOut(log4j, config.isErrorSpecified(), "\t", config.getError());

            // Save the configuration
            utoteConfig = persistConfiguration(cResponse);
            log4j.debug("getConfiguration - Configuration After persistConfiguration().  utoteConfig = {}",utoteConfig);

            // Log the response
            responseLogId = (new UtoteRequestResponseLogger()).saveGetConfigurationResponse(requestLogId, config, Integer.valueOf(utoteConfig.getIdUtoteConfiguration()));
            log4j.debug("getConfiguration - After saveGetConfigurationResponse() responseLogId = {}",responseLogId);

            // GetRace returned, but was missing the ConfigurationResposne
        } else if (null != cResponse) {
            log4j.error("getConfiguration - GetConfiguration returned, but did not include a Configuration instance.");
            // Null response from GetRace call
        } else {
            log4j.error("getConfiguration - No configuration response was returned.");
        }

        log4j.exit(utoteConfig);
        return utoteConfig;
    }

}
