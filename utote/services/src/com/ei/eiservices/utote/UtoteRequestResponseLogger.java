package com.ei.eiservices.utote;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ei.eiservices.utote.client.configurationservice.ConfigurationServiceStub;
import com.ei.eiservices.utote.client.programservice.ProgramServiceStub;
import com.ei.eiservices.utote.client.programservice.ProgramServiceStub.EventDetailResponse;
import com.ei.eiservices.utote.client.programservice.ProgramServiceStub.EventsResponse;
import com.ei.eiservices.utote.client.programservice.ProgramServiceStub.RaceResponse;
import com.ei.eiservices.utote.client.resultservice.ResultServiceStub;
import com.ei.eiservices.utote.client.resultservice.ResultServiceStub.ResultResponse;
import com.ei.eiservices.utote.client.totestatusservice.ToteStatusServiceStub;
import com.ei.eiservices.utote.model.UtoteRequestLog;
import com.ei.eiservices.utote.model.UtoteResponseLog;


public class UtoteRequestResponseLogger {

    private static final Logger log4j = LogManager.getLogger(UtoteRequestResponseLogger.class.getName());

    public static final String UTOTE_REQUEST_GET_STATUS 		= "GetToteStatus";
    public static final String UTOTE_REQUEST_GET_EVENTS 		= "GetEvents";
    public static final String UTOTE_REQUEST_GET_EVENT_DETAIL	= "GetEventDetail";
    public static final String UTOTE_REQUEST_GET_RACE			= "GetRace";
    public static final String UTOTE_REQUEST_GET_RESULT         = "GetResult";
    public static final String UTOTE_REQUEST_GET_CONFIG 		= "GetConfiguration";

    public static final String UTOTE_RESPONSE_GET_STATUS 		= "GetToteStatusResponse";
    public static final String UTOTE_RESPONSE_GET_EVENTS 		= "GetEventsResponse";
    public static final String UTOTE_RESPONSE_GET_EVENT_DETAIL	= "GetEventDetailResponse";
    public static final String UTOTE_RESPONSE_GET_RACE 			= "GetRaceResponse";
    public static final String UTOTE_RESPONSE_GET_RESULT        = "GetResultResponse";
    public static final String UTOTE_RESPONSE_GET_CONFIG 		= "GetConfigurationResponse";

    public int saveToteStatusRequest(ToteStatusServiceStub.GetToteStatus getToteStatusInput) {
        log4j.entry("saveToteStatusRequest - ", getToteStatusInput);

        // Get an Entity Manager
        final EntityManagerFactory emF = Configurator.getRWEMF();
        final EntityManager em = emF.createEntityManager();

        // Insert a new UtoteStatusChange
        // representing the contents of this message
        em.getTransaction().begin();
        UtoteRequestLog requestLog = new UtoteRequestLog();
        requestLog.setRequestElementType(UTOTE_REQUEST_GET_STATUS);
        if (getToteStatusInput.isToteStatusRequestSpecified()) {
            ToteStatusServiceStub.ToteStatusRequest request = getToteStatusInput.getToteStatusRequest();
            requestLog.setSystemId(request.getSource().getSystemId());
            requestLog.setSourceId(request.getSource().getSourceId());
        }
        em.persist(requestLog);
        em.getTransaction().commit();
        int id = requestLog.getIdUtoteRequestLog();
        log4j.debug("{} Request Log Inserted, Unique ID={}", UTOTE_REQUEST_GET_STATUS, id);

        // Read the existing UToteStatusChange entries and write to console
        if (log4j.isTraceEnabled()) {
            TypedQuery<UtoteRequestLog> q = em.createQuery("SELECT l FROM UtoteRequestLog l", UtoteRequestLog.class);
            List<UtoteRequestLog> logList = q.getResultList();
            log4j.trace("{} Request logList Size={}", UTOTE_REQUEST_GET_STATUS, logList.size());
        }

        // Close the connections
        em.close();
        emF.close();

        log4j.exit(id);
        return id;

    }

    public int saveToteStatusResponse(int idUtoteRequestLog, ToteStatusServiceStub.GetToteStatusResponse sResponse) {
        log4j.entry("saveToteStatusResponse - ", idUtoteRequestLog, sResponse);

        // Get an Entity Manager
        final EntityManagerFactory emF = Configurator.getRWEMF();
        final EntityManager em = emF.createEntityManager();

        // Insert a new UtoteStatusChange
        // representing the contents of this message
        em.getTransaction().begin();
        UtoteResponseLog responseLog = new UtoteResponseLog();
        responseLog.setIdUtoteRequestLog(idUtoteRequestLog);
        responseLog.setResponseElementType(UTOTE_RESPONSE_GET_STATUS);
        if (sResponse.isGetToteStatusResultSpecified()) {
            ToteStatusServiceStub.ToteLinkResponse sResult = sResponse.getGetToteStatusResult();
            if (sResult.isRunIdSpecified()) {
                responseLog.setRunId(Integer.parseInt(sResult.getRunId()));
            }
            if (sResult.isGroupIdSpecified()) {
                responseLog.setGroupId(sResult.getGroupId());
            }
            if (sResult.isSourceSpecified()) {
                responseLog.setSystemId(sResult.getSource().getSystemId());
                responseLog.setSourceId(sResult.getSource().getSourceId());
            }
            if (sResult.isErrorSpecified()) {
                ToteStatusServiceStub.Error err = sResult.getError();
                if (err.isMessageSpecified()) {
                    responseLog.setErrorMessage(err.getMessage());
                }
                if (err.isNumberSpecified()) {
                    responseLog.setErrorNumber(Integer.parseInt(err.getNumber()));
                    responseLog.setIsError(true);
                }
                if (err.isParamsSpecified()) {
                    ToteStatusServiceStub.ArrayOfstring parms = err.getParams();
                    if (parms.isStringSpecified()) {
                        int i = 0;
                        for (String parm : parms.getString()){
                            if (0 == i++) {
                                responseLog.setErrorParameter1(parm);
                            }
                            if (1 == i++) {
                                responseLog.setErrorParameter2(parm);
                            }
                            if (2 == i++) {
                                responseLog.setErrorParameter3(parm);
                            }
                            if (3 == i++) {
                                responseLog.setErrorParameter4(parm);
                            }
                        }
                    }
                }
            }
        }
        em.persist(responseLog);
        em.getTransaction().commit();
        int id = responseLog.getIdUtoteResponseLog();
        log4j.debug("{} Response Log Inserted, Unique ID={}", UTOTE_RESPONSE_GET_STATUS, id);

        // Read the existing UToteStatusChange entries and write to console
        if (log4j.isTraceEnabled()) {
            TypedQuery<UtoteResponseLog> q = em.createQuery("SELECT l FROM UtoteResponseLog l", UtoteResponseLog.class);
            List<UtoteResponseLog> logList = q.getResultList();
            log4j.trace("{} Response logList Size={}", UTOTE_RESPONSE_GET_STATUS, logList.size());
        }

        // Close the connections
        em.close();
        emF.close();

        log4j.exit(id);
        return id;

    }

    public int saveGetEventsRequest(ProgramServiceStub.GetEvents getEventsInput) {
        log4j.entry("saveGetEventRequest - ", getEventsInput);

        // Get an Entity Manager
        final EntityManagerFactory emF = Configurator.getRWEMF();
        final EntityManager em = emF.createEntityManager();

        // Insert a new UtoteStatusChange
        // representing the contents of this message
        em.getTransaction().begin();
        UtoteRequestLog requestLog = new UtoteRequestLog();
        requestLog.setRequestElementType(UTOTE_REQUEST_GET_EVENTS);
        if (getEventsInput.isEventsRequestSpecified()) {
            ProgramServiceStub.EventsRequest request = getEventsInput.getEventsRequest();
            requestLog.setSystemId(request.getSource().getSystemId());
            requestLog.setSourceId(request.getSource().getSourceId());
            if (request.isContestIdSpecified()) {
                requestLog.setContestId(request.getContestId());
            }
            if (request.isRacesSpecified()) {
                requestLog.setRaces(request.getRaces());
            }
            if (request.isTournamentIdSpecified()) {
                requestLog.setTournamentId(request.getTournamentId());
            }
        }
        em.persist(requestLog);
        em.getTransaction().commit();
        int id = requestLog.getIdUtoteRequestLog();
        log4j.debug("{} Request Log Inserted, Unique ID={}", UTOTE_REQUEST_GET_EVENTS, id);

        // Read the existing UToteStatusChange entries and write to console
        if (log4j.isTraceEnabled()) {
            TypedQuery<UtoteRequestLog> q = em.createQuery("SELECT l FROM UtoteRequestLog l", UtoteRequestLog.class);
            List<UtoteRequestLog> logList = q.getResultList();
            log4j.trace("{} Request logList Size={}", UTOTE_REQUEST_GET_EVENTS, logList.size());
        }

        // Close the connections
        em.close();
        emF.close();

        log4j.exit(id);
        return id;

    }

    public int saveGetEventsResponse(int idUtoteRequestLog, ProgramServiceStub.GetEventsResponse eResponse, Integer idUtoteResponse) {
        log4j.entry("saveGetEventResponse - ", idUtoteRequestLog, eResponse, idUtoteResponse);

        // Get an Entity Manager
        final EntityManagerFactory emF = Configurator.getRWEMF();
        final EntityManager em = emF.createEntityManager();

        // Insert a new UtoteStatusChange
        // representing the contents of this message
        em.getTransaction().begin();
        UtoteResponseLog responseLog = new UtoteResponseLog();
        responseLog.setIdUtoteRequestLog(idUtoteRequestLog);
        responseLog.setResponseElementType(UTOTE_RESPONSE_GET_EVENTS);
        if (eResponse.isEventsResponseSpecified()) {
            EventsResponse response = eResponse.getEventsResponse();
            if (response.isTournamentIdSpecified()) {
                responseLog.setEventId(response.getTournamentId());
            }
            if (response.isContestIdSpecified()) {
                responseLog.setEventId(response.getContestId());
            }
            if (response.isRunIdSpecified()) {
                responseLog.setRunId(Integer.parseInt(response.getRunId()));
            }
            if (response.isGroupIdSpecified()) {
                responseLog.setGroupId(response.getGroupId());
            }
            if (response.isSourceSpecified()) {
                responseLog.setSystemId(response.getSource().getSystemId());
                responseLog.setSourceId(response.getSource().getSourceId());
            }
            if (response.isErrorSpecified()) {
                ProgramServiceStub.Error err = response.getError();
                if (err.isMessageSpecified()) {
                    responseLog.setErrorMessage(err.getMessage());
                }
                if (err.isNumberSpecified()) {
                    responseLog.setErrorNumber(Integer.parseInt(err.getNumber()));
                    responseLog.setIsError(true);
                }
                if (err.isParamsSpecified()) {
                    ProgramServiceStub.ArrayOfstring parms = err.getParams();
                    if (parms.isStringSpecified()) {
                        int i = 0;
                        for (String parm : parms.getString()){
                            if (0 == i++) {
                                responseLog.setErrorParameter1(parm);
                            }
                            if (1 == i++) {
                                responseLog.setErrorParameter2(parm);
                            }
                            if (2 == i++) {
                                responseLog.setErrorParameter3(parm);
                            }
                            if (3 == i++) {
                                responseLog.setErrorParameter4(parm);
                            }
                        }
                    }
                }
            }
            if (null != idUtoteResponse) {
                responseLog.setIdUtoteResponse(idUtoteResponse.intValue());
            }
        }
        em.persist(responseLog);
        em.getTransaction().commit();
        int id = responseLog.getIdUtoteResponseLog();
        log4j.debug("{} Response Log Inserted, Unique ID={}", UTOTE_RESPONSE_GET_EVENTS, id);

        // Read the existing UToteStatusChange entries and write to console
        if (log4j.isTraceEnabled()) {
            TypedQuery<UtoteResponseLog> q = em.createQuery("SELECT l FROM UtoteResponseLog l", UtoteResponseLog.class);
            List<UtoteResponseLog> logList = q.getResultList();
            log4j.trace("{} Response logList Size={}", UTOTE_RESPONSE_GET_EVENTS, logList.size());
        }

        // Close the connections
        em.close();
        emF.close();

        log4j.exit(id);
        return id;

    }

    public int saveGetEventDetailRequest(ProgramServiceStub.GetEventDetail getEventDetailInput) {
        log4j.entry("saveGetEventDetail - ", getEventDetailInput);

        // Get an Entity Manager
        final EntityManagerFactory emF = Configurator.getRWEMF();
        final EntityManager em = emF.createEntityManager();

        // Insert a new UtoteStatusChange
        // representing the contents of this message
        em.getTransaction().begin();
        UtoteRequestLog requestLog = new UtoteRequestLog();
        requestLog.setRequestElementType(UTOTE_REQUEST_GET_EVENT_DETAIL);
        if (getEventDetailInput.isEventsRequestSpecified()) {
            ProgramServiceStub.EventDetailRequest request = getEventDetailInput.getEventsRequest();
            requestLog.setSystemId(request.getSource().getSystemId());
            requestLog.setSourceId(request.getSource().getSourceId());
            if (request.isContestIdSpecified()) {
                requestLog.setContestId(request.getContestId());
            }
            if (request.isPoolsSpecified()) {
                requestLog.setPools(request.getPools());
            }
            if (request.isProgramSpecified()) {
                requestLog.setProgram(request.getProgram());
            }
            if (request.isRunnersSpecified()) {
                requestLog.setRunners(request.getRunners());
            }
            if (request.isRacesSpecified()) {
                requestLog.setRaces(request.getRaces());
            }
            if (request.isTournamentIdSpecified()) {
                requestLog.setTournamentId(request.getTournamentId());
            }
            requestLog.setEventId(request.getEventId());
        }
        em.persist(requestLog);
        em.getTransaction().commit();
        int id = requestLog.getIdUtoteRequestLog();
        log4j.debug("{} Request Log Inserted, Unique ID={}", UTOTE_REQUEST_GET_EVENT_DETAIL, id);

        // Read the existing UToteStatusChange entries and write to console
        if (log4j.isTraceEnabled()) {
            TypedQuery<UtoteRequestLog> q = em.createQuery("SELECT l FROM UtoteRequestLog l", UtoteRequestLog.class);
            List<UtoteRequestLog> logList = q.getResultList();
            log4j.trace("{} Request logList Size={}", UTOTE_REQUEST_GET_EVENT_DETAIL, logList.size());
        }

        // Close the connections
        em.close();
        emF.close();

        log4j.exit(id);
        return id;

    }

    public int saveGetEventDetailResponse(int idUtoteRequestLog, ProgramServiceStub.GetEventDetailResponse eResponse, Integer idUtoteResponse) {
        log4j.entry("saveGetEventDetailResponse - ", idUtoteRequestLog, eResponse, idUtoteResponse);

        // Get an Entity Manager
        final EntityManagerFactory emF = Configurator.getRWEMF();
        final EntityManager em = emF.createEntityManager();

        // Insert a new UtoteStatusChange
        // representing the contents of this message
        em.getTransaction().begin();
        UtoteResponseLog responseLog = new UtoteResponseLog();
        responseLog.setIdUtoteRequestLog(idUtoteRequestLog);
        responseLog.setResponseElementType(UTOTE_RESPONSE_GET_EVENT_DETAIL);
        if (eResponse.isEventsResponseSpecified()) {
            EventDetailResponse response = eResponse.getEventsResponse();
            if (response.isEventDetailSpecified()) {
                responseLog.setEventId(response.getEventDetail().getEventId());
            }
            if (response.isTournamentIdSpecified()) {
                responseLog.setEventId(response.getTournamentId());
            }
            if (response.isContestIdSpecified()) {
                responseLog.setEventId(response.getContestId());
            }
            if (response.isRunIdSpecified()) {
                responseLog.setRunId(Integer.parseInt(response.getRunId()));
            }
            if (response.isGroupIdSpecified()) {
                responseLog.setGroupId(response.getGroupId());
            }
            if (response.isSourceSpecified()) {
                responseLog.setSystemId(response.getSource().getSystemId());
                responseLog.setSourceId(response.getSource().getSourceId());
            }
            if (response.isErrorSpecified()) {
                ProgramServiceStub.Error err = response.getError();
                if (err.isMessageSpecified()) {
                    responseLog.setErrorMessage(err.getMessage());
                }
                if (err.isNumberSpecified()) {
                    responseLog.setErrorNumber(Integer.parseInt(err.getNumber()));
                    responseLog.setIsError(true);
                }
                if (err.isParamsSpecified()) {
                    ProgramServiceStub.ArrayOfstring parms = err.getParams();
                    if (parms.isStringSpecified()) {
                        int i = 0;
                        for (String parm : parms.getString()){
                            if (0 == i++) {
                                responseLog.setErrorParameter1(parm);
                            }
                            if (1 == i++) {
                                responseLog.setErrorParameter2(parm);
                            }
                            if (2 == i++) {
                                responseLog.setErrorParameter3(parm);
                            }
                            if (3 == i++) {
                                responseLog.setErrorParameter4(parm);
                            }
                        }
                    }
                }
            }
            if (null != idUtoteResponse) {
                responseLog.setIdUtoteResponse(idUtoteResponse.intValue());
            }
        }
        em.persist(responseLog);
        em.getTransaction().commit();
        int id = responseLog.getIdUtoteResponseLog();
        log4j.debug("{} Response Log Inserted, Unique ID={}", UTOTE_RESPONSE_GET_EVENT_DETAIL, id);

        // Read the existing UToteStatusChange entries and write to console
        if (log4j.isTraceEnabled()) {
            TypedQuery<UtoteResponseLog> q = em.createQuery("SELECT l FROM UtoteResponseLog l", UtoteResponseLog.class);
            List<UtoteResponseLog> logList = q.getResultList();
            log4j.trace("{} Response logList Size={}", UTOTE_RESPONSE_GET_EVENT_DETAIL, logList.size());
        }

        // Close the connections
        em.close();
        emF.close();

        log4j.exit(id);
        return id;

    }

    public int saveGetRaceRequest(ProgramServiceStub.GetRace getRaceInput) {
        log4j.entry("saveGetRaceRequest - ", getRaceInput);

        // Get an Entity Manager
        final EntityManagerFactory emF = Configurator.getRWEMF();
        final EntityManager em = emF.createEntityManager();

        // Insert a new UtoteStatusChange
        // representing the contents of this message
        em.getTransaction().begin();
        UtoteRequestLog requestLog = new UtoteRequestLog();
        requestLog.setRequestElementType(UTOTE_REQUEST_GET_RACE);
        if (getRaceInput.isRaceRequestSpecified()) {
            ProgramServiceStub.RaceRequest request = getRaceInput.getRaceRequest();
            requestLog.setSystemId(request.getSource().getSystemId());
            requestLog.setSourceId(request.getSource().getSourceId());
            if (request.isContestIdSpecified()) {
                requestLog.setContestId(request.getContestId());
            }
            if (request.isPoolsSpecified()) {
                requestLog.setPools(request.getPools());
            }
            if (request.isProgramSpecified()) {
                requestLog.setProgram(request.getProgram());
            }
            if (request.isRunnersSpecified()) {
                requestLog.setRunners(request.getRunners());
            }
            if (request.isTournamentIdSpecified()) {
                requestLog.setTournamentId(request.getTournamentId());
            }
            requestLog.setEventId(request.getEventId());
            requestLog.setRaceId(request.getRaceId());
        }
        em.persist(requestLog);
        em.getTransaction().commit();
        int id = requestLog.getIdUtoteRequestLog();
        log4j.debug("{} Request Log Inserted, Unique ID: {}", UTOTE_REQUEST_GET_RACE, id);

        // Read the existing UToteStatusChange entries and write to console
        if (log4j.isTraceEnabled()) {
            TypedQuery<UtoteRequestLog> q = em.createQuery("SELECT l FROM UtoteRequestLog l", UtoteRequestLog.class);
            List<UtoteRequestLog> logList = q.getResultList();
            log4j.trace("{} Request logList Size: {}", UTOTE_REQUEST_GET_RACE, logList.size());
        }

        // Close the connections
        em.close();
        emF.close();

        log4j.exit(id);
        return id;

    }

    public int saveGetRaceResponse(int idUtoteRequestLog, ProgramServiceStub.GetRaceResponse rResponse, Integer idUtoteResponse) {
        log4j.entry("saveGetRaceResponse - ", idUtoteRequestLog, rResponse, idUtoteResponse);

        // Get an Entity Manager
        final EntityManagerFactory emF = Configurator.getRWEMF();
        final EntityManager em = emF.createEntityManager();

        // Insert a new UtoteStatusChange
        // representing the contents of this message
        em.getTransaction().begin();
        UtoteResponseLog responseLog = new UtoteResponseLog();
        responseLog.setIdUtoteRequestLog(idUtoteRequestLog);
        responseLog.setResponseElementType(UTOTE_RESPONSE_GET_RACE);
        if (rResponse.isRaceResponseSpecified()) {
            RaceResponse response = rResponse.getRaceResponse();
            if (response.isEventIdSpecified()) {
                responseLog.setEventId(response.getEventId());
            }
            if (response.isRaceSpecified()) {
                responseLog.setRaceId(response.getRace().getRaceId());
            }
            if (response.isRunIdSpecified()) {
                responseLog.setRunId(Integer.parseInt(response.getRunId()));
            }
            if (response.isGroupIdSpecified()) {
                responseLog.setGroupId(response.getGroupId());
            }
            if (response.isSourceSpecified()) {
                responseLog.setSystemId(response.getSource().getSystemId());
                responseLog.setSourceId(response.getSource().getSourceId());
            }
            if (response.isErrorSpecified()) {
                ProgramServiceStub.Error err = response.getError();
                if (err.isMessageSpecified()) {
                    responseLog.setErrorMessage(err.getMessage());
                }
                if (err.isNumberSpecified()) {
                    responseLog.setErrorNumber(Integer.parseInt(err.getNumber()));
                    responseLog.setIsError(true);
                }
                if (err.isParamsSpecified()) {
                    ProgramServiceStub.ArrayOfstring parms = err.getParams();
                    if (parms.isStringSpecified()) {
                        int i = 0;
                        for (String parm : parms.getString()){
                            if (0 == i++) {
                                responseLog.setErrorParameter1(parm);
                            }
                            if (1 == i++) {
                                responseLog.setErrorParameter2(parm);
                            }
                            if (2 == i++) {
                                responseLog.setErrorParameter3(parm);
                            }
                            if (3 == i++) {
                                responseLog.setErrorParameter4(parm);
                            }
                        }
                    }
                }
            }
            if (null != idUtoteResponse) {
                responseLog.setIdUtoteResponse(idUtoteResponse.intValue());
            }
        }
        em.persist(responseLog);
        em.getTransaction().commit();
        int id = responseLog.getIdUtoteResponseLog();
        log4j.debug("{} Response Log Inserted, Unique ID={}", UTOTE_RESPONSE_GET_RACE, id);

        // Read the existing UToteStatusChange entries and write to console
        if (log4j.isTraceEnabled()) {
            TypedQuery<UtoteResponseLog> q = em.createQuery("SELECT l FROM UtoteResponseLog l", UtoteResponseLog.class);
            List<UtoteResponseLog> logList = q.getResultList();
            log4j.trace("{} Response logList Size={}", UTOTE_RESPONSE_GET_RACE, logList.size());
        }

        // Close the connections
        em.close();
        emF.close();

        log4j.exit(id);
        return id;

    }

    public int saveGetResultRequest(ResultServiceStub.GetResult getResultInput) {
        log4j.entry("saveGetResultRequest - ", getResultInput);

        // Get an Entity Manager
        final EntityManagerFactory emF = Configurator.getRWEMF();
        final EntityManager em = emF.createEntityManager();

        // Insert a new UtoteStatusChange
        // representing the contents of this message
        em.getTransaction().begin();
        UtoteRequestLog requestLog = new UtoteRequestLog();
        requestLog.setRequestElementType(UTOTE_REQUEST_GET_RESULT);
        if (getResultInput.isResultRequestSpecified()) {
            ResultServiceStub.ResultRequest request = getResultInput.getResultRequest();
            requestLog.setSystemId(request.getSource().getSystemId());
            requestLog.setSourceId(request.getSource().getSourceId());
            requestLog.setEventId(request.getEventId());
            requestLog.setRaceId(request.getRaceId());
        }
        em.persist(requestLog);
        em.getTransaction().commit();
        int id = requestLog.getIdUtoteRequestLog();
        log4j.debug("{} Request Log Inserted, Unique ID: {}", UTOTE_REQUEST_GET_RESULT, id);

        // Read the existing UToteStatusChange entries and write to console
        if (log4j.isTraceEnabled()) {
            TypedQuery<UtoteRequestLog> q = em.createQuery("SELECT l FROM UtoteRequestLog l", UtoteRequestLog.class);
            List<UtoteRequestLog> logList = q.getResultList();
            log4j.trace("{} Request logList Size: {}", UTOTE_REQUEST_GET_RESULT, logList.size());
        }

        // Close the connections
        em.close();
        emF.close();

        log4j.exit(id);
        return id;

    }

    public int saveGetResultResponse(int idUtoteRequestLog, ResultServiceStub.GetResultResponse rResponse, Integer idUtoteResponse) {
        log4j.entry("saveGetResultResponse - ", idUtoteRequestLog, rResponse, idUtoteResponse);

        // Get an Entity Manager
        final EntityManagerFactory emF = Configurator.getRWEMF();
        final EntityManager em = emF.createEntityManager();

        // Insert a new UtoteStatusChange
        // representing the contents of this message
        em.getTransaction().begin();
        UtoteResponseLog responseLog = new UtoteResponseLog();
        responseLog.setIdUtoteRequestLog(idUtoteRequestLog);
        responseLog.setResponseElementType(UTOTE_RESPONSE_GET_RESULT);
        if (rResponse.isResultResponseSpecified()) {
            ResultResponse response = rResponse.getResultResponse();
            if (response.isEventIdSpecified()) {
                responseLog.setEventId(response.getEventId());
            }
            if (response.isRaceIdSpecified()) {
                responseLog.setRaceId(response.getRaceId());
            }
            if (response.isRunIdSpecified()) {
                responseLog.setRunId(Integer.parseInt(response.getRunId()));
            }
            if (response.isGroupIdSpecified()) {
                responseLog.setGroupId(response.getGroupId());
            }
            if (response.isSourceSpecified()) {
                responseLog.setSystemId(response.getSource().getSystemId());
                responseLog.setSourceId(response.getSource().getSourceId());
            }
            if (response.isErrorSpecified()) {
                ResultServiceStub.Error err = response.getError();
                if (err.isMessageSpecified()) {
                    responseLog.setErrorMessage(err.getMessage());
                }
                if (err.isNumberSpecified()) {
                    responseLog.setErrorNumber(Integer.parseInt(err.getNumber()));
                    responseLog.setIsError(true);
                }
                if (err.isParamsSpecified()) {
                    ResultServiceStub.ArrayOfstring parms = err.getParams();
                    if (parms.isStringSpecified()) {
                        int i = 0;
                        for (String parm : parms.getString()){
                            if (0 == i++) {
                                responseLog.setErrorParameter1(parm);
                            }
                            if (1 == i++) {
                                responseLog.setErrorParameter2(parm);
                            }
                            if (2 == i++) {
                                responseLog.setErrorParameter3(parm);
                            }
                            if (3 == i++) {
                                responseLog.setErrorParameter4(parm);
                            }
                        }
                    }
                }
            }
            if (null != idUtoteResponse) {
                responseLog.setIdUtoteResponse(idUtoteResponse.intValue());
            }
        }
        em.persist(responseLog);
        em.getTransaction().commit();
        int id = responseLog.getIdUtoteResponseLog();
        log4j.debug("{} Response Log Inserted, Unique ID={}", UTOTE_RESPONSE_GET_RESULT, id);

        // Read the existing UToteStatusChange entries and write to console
        if (log4j.isTraceEnabled()) {
            TypedQuery<UtoteResponseLog> q = em.createQuery("SELECT l FROM UtoteResponseLog l", UtoteResponseLog.class);
            List<UtoteResponseLog> logList = q.getResultList();
            log4j.trace("{} Response logList Size={}", UTOTE_RESPONSE_GET_RESULT, logList.size());
        }

        // Close the connections
        em.close();
        emF.close();

        log4j.exit(id);
        return id;

    }

    public int saveGetConfigurationRequest(ConfigurationServiceStub.GetConfiguration getConfigInput) {
        log4j.entry("saveGetConfigurationRequest - ", getConfigInput);

        // Get an Entity Manager
        final EntityManagerFactory emF = Configurator.getRWEMF();
        final EntityManager em = emF.createEntityManager();

        // Insert a new UtoteStatusChange
        // representing the contents of this message
        em.getTransaction().begin();
        UtoteRequestLog requestLog = new UtoteRequestLog();
        requestLog.setRequestElementType(UTOTE_REQUEST_GET_CONFIG);
        if (getConfigInput.isConfigurationRequestSpecified()) {
            ConfigurationServiceStub.ConfigurationRequest request = getConfigInput.getConfigurationRequest();
            requestLog.setSystemId(request.getSource().getSystemId());
            requestLog.setSourceId(request.getSource().getSourceId());
        }
        em.persist(requestLog);
        em.getTransaction().commit();
        int id = requestLog.getIdUtoteRequestLog();
        log4j.debug("{} Request Log Inserted, Unique ID: {}", UTOTE_REQUEST_GET_CONFIG, id);

        // Read the existing UToteStatusChange entries and write to console
        if (log4j.isTraceEnabled()) {
            TypedQuery<UtoteRequestLog> q = em.createQuery("SELECT l FROM UtoteRequestLog l", UtoteRequestLog.class);
            List<UtoteRequestLog> logList = q.getResultList();
            log4j.trace("{} Request logList Size: {}", UTOTE_REQUEST_GET_CONFIG, logList.size());
        }

        // Close the connections
        em.close();
        emF.close();

        log4j.exit(id);
        return id;

    }

    public int saveGetConfigurationResponse(int idUtoteRequestLog, ConfigurationServiceStub.ConfigurationResponse response, Integer idUtoteResponse) {
        log4j.entry("saveGetConfigurationResponse - ", idUtoteRequestLog, response, idUtoteResponse);

        // Get an Entity Manager
        final EntityManagerFactory emF = Configurator.getRWEMF();
        final EntityManager em = emF.createEntityManager();

        // Insert a new UtoteStatusChange
        // representing the contents of this message
        em.getTransaction().begin();
        UtoteResponseLog responseLog = new UtoteResponseLog();
        responseLog.setIdUtoteRequestLog(idUtoteRequestLog);
        responseLog.setResponseElementType(UTOTE_RESPONSE_GET_CONFIG);
        if (response.isRunIdSpecified()) {
            responseLog.setRunId(Integer.parseInt(response.getRunId()));
        }
        if (response.isGroupIdSpecified()) {
            responseLog.setGroupId(response.getGroupId());
        }
        if (response.isSourceSpecified()) {
            responseLog.setSystemId(response.getSource().getSystemId());
            responseLog.setSourceId(response.getSource().getSourceId());
        }
        if (response.isErrorSpecified()) {
            ConfigurationServiceStub.Error err = response.getError();
            if (err.isMessageSpecified()) {
                responseLog.setErrorMessage(err.getMessage());
            }
            if (err.isNumberSpecified()) {
                responseLog.setErrorNumber(Integer.parseInt(err.getNumber()));
                responseLog.setIsError(true);
            }
            if (err.isParamsSpecified()) {
                ConfigurationServiceStub.ArrayOfstring parms = err.getParams();
                if (parms.isStringSpecified()) {
                    int i = 0;
                    for (String parm : parms.getString()){
                        if (0 == i++) {
                            responseLog.setErrorParameter1(parm);
                        }
                        if (1 == i++) {
                            responseLog.setErrorParameter2(parm);
                        }
                        if (2 == i++) {
                            responseLog.setErrorParameter3(parm);
                        }
                        if (3 == i++) {
                            responseLog.setErrorParameter4(parm);
                        }
                    }
                }
            }
        }
        if (null != idUtoteResponse) {
            responseLog.setIdUtoteResponse(idUtoteResponse.intValue());
        }
        em.persist(responseLog);
        em.getTransaction().commit();
        int id = responseLog.getIdUtoteResponseLog();
        log4j.debug("{} Response Log Inserted, Unique ID={}", UTOTE_RESPONSE_GET_CONFIG, id);

        // Read the existing UToteStatusChange entries and write to console
        if (log4j.isTraceEnabled()) {
            TypedQuery<UtoteResponseLog> q = em.createQuery("SELECT l FROM UtoteResponseLog l", UtoteResponseLog.class);
            List<UtoteResponseLog> logList = q.getResultList();
            log4j.trace("{} Response logList Size={}", UTOTE_RESPONSE_GET_CONFIG, logList.size());
        }

        // Close the connections
        em.close();
        emF.close();

        log4j.exit(id);
        return id;

    }

}
