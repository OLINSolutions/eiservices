
/**
 * ResultServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ei.eiservices.utote.client.processor;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.apache.axis2.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ei.eiservices.utote.Configurator;
import com.ei.eiservices.utote.UtoteRequestResponseLogger;
import com.ei.eiservices.utote.client.resultservice.ResultServiceStub;
import com.ei.eiservices.utote.client.resultservice.ResultServiceStub.PoolPrices;
import com.ei.eiservices.utote.client.resultservice.ResultServiceStub.ResultEntity;
import com.ei.eiservices.utote.client.resultservice.Result_GetResult_ToteFaultFault_FaultMessage;
import com.ei.eiservices.utote.client.resultservice.Result_GetResult_ValidationFaultFault_FaultMessage;
import com.ei.eiservices.utote.model.UtoteEvent;
import com.ei.eiservices.utote.model.UtotePoolPrice;
import com.ei.eiservices.utote.model.UtoteRace;
import com.ei.eiservices.utote.model.UtoteResult;

public class ResultRequestProcessor {

    private static final Logger log4j = LogManager.getLogger(ResultRequestProcessor.class);

    private ResultServiceStub.Source getSource() {
        ResultServiceStub.Source source = new ResultServiceStub.Source();
        source.setSystemId(Configurator.getSystemId());
        source.setSourceId(Configurator.getSourceId());
        return source;
    }

    private UtotePoolPrice findPoolPrice(Collection<UtotePoolPrice> poolPrices, String poolId, String poolName) {
        log4j.entry("findPoolPrice - ", poolId, poolName);
        for (UtotePoolPrice uPoolPrice : poolPrices) {
            if (uPoolPrice.getPoolId().equals(poolId) && uPoolPrice.getPoolName().equals(poolName)) {
                log4j.trace("findPoolPrice - Found UtotePoolPrice object with poolId="+poolId+", poolName="+poolName);
                return uPoolPrice;
            }
        }
        log4j.exit("findPoolPrice - Not Found.");
        return null;
    }

    private Collection<UtotePoolPrice> clonePoolPrice(UtoteResult parent, boolean newParent, ResultServiceStub.PoolPrices poolPrices) {
        log4j.entry("clonePoolPrice - for RaceId", parent.getRaceId());

        // Get the current Pool entity collection, if exists
        Collection<UtotePoolPrice> uPoolPrices = newParent?null:parent.getPoolPrices();
        if (null == uPoolPrices) {
            log4j.debug("clonePoolPrice - no Pools found in parent.  Creating and setting new array list");
            uPoolPrices = new ArrayList<UtotePoolPrice>();
        }

        // See if any pools were passed in
        if (poolPrices.isPoolPriceSpecified()) {

            log4j.debug("clonePoolPrice - {} PoolPrices are specified, about to process", poolPrices.getPoolPrice().length);

            final EntityManagerFactory emF = Configurator.getRWEMF();
            final EntityManager em = emF.createEntityManager();

            // Open transaction
            log4j.trace("clonePoolPrice - Opening PoolPrices transaction for idUtoteResult={}, eventId={}, raceId={}", parent.getIdUtoteResult(), parent.getEventId(), parent.getRaceId());


            // Iterate over the pools
            for (ResultServiceStub.PoolPrice poolPrice : poolPrices.getPoolPrice()) {

                boolean newEntity = false;
                em.getTransaction().begin();

                // If this is new, create the container
                log4j.trace("clonePoolPrice - Searching for input poolId = {}, poolName = {}", poolPrice.getPoolId(), poolPrice.getPoolName());
                UtotePoolPrice uPoolPrice = newParent?null:findPoolPrice(uPoolPrices, poolPrice.getPoolId(), poolPrice.getPoolName());
                if (null == uPoolPrice) {
                    log4j.trace("clonePoolPrice - Not found, creating new entity for poolId={}, poolName={}", poolPrice.getPoolId(), poolPrice.getPoolName());
                    uPoolPrice = new UtotePoolPrice();
                    uPoolPrice.setIdParent(parent.getIdUtoteResult());
                    uPoolPrice.setPoolId(poolPrice.getPoolId());
                    uPoolPrice.setPoolName(poolPrice.getPoolName());
                    newEntity = true;
                } else {
                    log4j.trace("clonePoolPrice - FOUND EXISTING PoolPrice with idUtotePoolPrice={}, poolId={}, poolName={}", uPoolPrice.getIdUtotePoolPrice(), uPoolPrice.getPoolId(), uPoolPrice.getPoolName());
                }

                log4j.trace("clonePoolPrice - Cloning fields for poolId={}, poolName={}", poolPrice.getPoolId(), poolPrice.getPoolName());

                // Set the values that have been specified
                if (poolPrice.isPoolNameSpecified()) {
                    uPoolPrice.setPoolName(poolPrice.getPoolName());
                }
                if (poolPrice.isCarryOverSpecified()) {
                    uPoolPrice.setCarryOver(poolPrice.getCarryOver());
                }
                if (poolPrice.isPricesSpecified()) {
                    //uPoolPrice.setPrices(poolPrice.getPrices());
                }
                if (poolPrice.isRefundSpecified()) {
                    uPoolPrice.setRefund(poolPrice.getRefund());
                }

                // Persist the element
                if (newEntity) {
                    log4j.trace("clonePoolPrice - PoolPrice Entity is NEW, calling persist for poolId={}, poolName={}", uPoolPrice.getPoolId(), uPoolPrice.getPoolName());
                    em.persist(uPoolPrice);
                } else {
                    log4j.trace("clonePoolPrice - PoolPrice Entity EXISTS, calling persist for poolId={}, poolName={}", uPoolPrice.getPoolId(), uPoolPrice.getPoolName());
                    UtotePoolPrice mergedPoolPrice = em.merge(uPoolPrice);
                    uPoolPrices.remove(uPoolPrice);
                    uPoolPrice = mergedPoolPrice;
                }

                // Commit the transaction
                try {

                    log4j.trace("clonePoolPrice - Calling commit transaction for idUtoteResult={}, eventId={}, raceId={}", parent.getIdUtoteResult(), parent.getEventId(), parent.getRaceId());
                    em.getTransaction().commit();
                    log4j.debug("clonePoolPrice - PoolPrice Entity comitted for idUtoteResult={}, eventId={}, raceId={}", parent.getIdUtoteResult(), parent.getEventId(), parent.getRaceId());

                } catch (Exception e) {
                    log4j.error("clonePoolPrice - Could not persist PoolPrice for idUtoteResult="+parent.getIdUtoteResult()+", eventId="+parent.getEventId()+", raceId=" + parent.getRaceId() + ", Exception = " + e.getMessage(),e);
                } finally {
                    if (em.getTransaction().isActive()) {
                        em.getTransaction().rollback();
                    }
                }

                // Put it into the holding array
                uPoolPrices.add(uPoolPrice);

            }

            em.close();
            emF.close();

        }

        log4j.debug("clonePoolPrice - finished.  parent.getPoolPrices().size() = {}", uPoolPrices.size());
        return uPoolPrices;
    }

    private UtoteResult cloneResult(UtoteResult utoteResult, ResultServiceStub.ResultResponse result, boolean newResult, boolean deep, boolean returnAssociations) {
        log4j.entry("cloneResult - ", result.getRunId(), result.getEventId(), result.getRaceId());

        utoteResult.setEventId(result.getEventId());
        utoteResult.setRaceId(result.getRaceId());
        if (result.isCurrencyIdSpecified()) {
            utoteResult.setCurrencyId(result.getCurrencyId());
        }
        if (result.isEventNameSpecified()) {
            utoteResult.setEventName(result.getEventName());
        }
        if (result.isPoolPricesSpecified()) {
            utoteResult.setHasPoolPrices(true);
        }
        if (result.isRaceResultsSpecified()) {
            utoteResult.setHasRaceResults(true);
            ResultEntity raceResults = result.getRaceResults();
            if (raceResults.isPositionsSpecified()) {
                utoteResult.setHasPositions(true);
            }
            if (raceResults.isScratchesSpecified()) {
                utoteResult.setScratches(raceResults.getScratches());
            }
            if (raceResults.isWinnersSpecified()) {
                utoteResult.setWinners(raceResults.getWinners());
            }
        }
        PoolPrices poolPrices = result.getPoolPrices();

        // Persist first before updating or adding any associations
        log4j.debug("cloneResult - About to persist {} Result for eventId={}, raceId={}",(newResult?"NEW":"EXISTING"), utoteResult.getEventId(), utoteResult.getRaceId());

        final EntityManagerFactory emF = Configurator.getRWEMF();
        final EntityManager em = emF.createEntityManager();

        try {

            log4j.trace("cloneResult - Opening transaction for {} Result with runId={}, eventId={}, raceId={}", (newResult?"NEW":"EXISTING"), result.getRunId(), utoteResult.getEventId(), utoteResult.getRaceId());
            em.getTransaction().begin();
            log4j.trace("cloneResult - Calling persist for {} Result with runId={}, eventId={}, raceId={}", (newResult?"NEW":"EXISTING"), result.getRunId(), utoteResult.getEventId(), utoteResult.getRaceId());
            if (newResult) {
                em.persist(utoteResult);
            } else {
                UtoteResult mergedResult = em.merge(utoteResult);
                utoteResult = mergedResult;
            }
            log4j.trace("cloneResult - Calling commit transaction for {} Result with runId={}, eventId={}, raceId={}", (newResult?"NEW":"EXISTING"), result.getRunId(), utoteResult.getEventId(), utoteResult.getRaceId());
            em.getTransaction().commit();
            log4j.debug("cloneResult - {} Event persisted for idUtoteResult = {}, runId={}, eventId={}, raceId={}", (newResult?"NEW":"EXISTING"), utoteResult.getIdUtoteResult(), result.getRunId(), utoteResult.getEventId(), utoteResult.getRaceId());

            // Now update/add Pool Prices if specified
            if (deep && utoteResult.hasPoolPrices()) {
                // If an existing Result, try to retrieve existing Pool Prices
                if (!newResult) {
                    TypedQuery<UtotePoolPrice> q = em.createNamedQuery("UtotePoolPrice.findByParent", UtotePoolPrice.class);
                    q.setParameter("idParent", utoteResult.getIdUtoteResult());
                    Collection<UtotePoolPrice> utotePoolPrices = q.getResultList();
                    if ((null != utotePoolPrices) && (utotePoolPrices.size() > 0)) {
                        utoteResult.setPoolPrices(utotePoolPrices);
                    } else {
                        log4j.warn("cloneResult - Did not find any existing Races for an existing Event: for idUtoteResult = {}, runId={}, eventId={}, raceId={}", utoteResult.getIdUtoteResult(), result.getRunId(), utoteResult.getEventId(), utoteResult.getRaceId());
                    }
                }
                // Process the races (e.g. insert or update)
                boolean needsUpdate = false;
                log4j.debug("cloneResult - Has races, about to call cloneRaces for runId={}, eventId={}, eventTime={}", utoteEvent.getRunId(), utoteEvent.getEventId(), utoteEvent.getEventTime());
                Collection<UtoteRace> clonedRaces = cloneRaces(utoteEvent, newResult, event.getRaces());
                if (newEvent) {
                    if ((null == clonedRaces) || (clonedRaces.size() == 0)) {
                        utoteEvent.setRaces(null);
                        if (utoteEvent.getHasRaces()) {
                            utoteEvent.setHasRaces(false);
                            needsUpdate = true;
                        }
                    } else {
                        utoteEvent.setRaces(clonedRaces);
                        if (!utoteEvent.getHasRaces()) {
                            utoteEvent.setHasRaces(true);
                            needsUpdate = true;
                        }
                    }
                } else {
                    // If the event had races, but does not any longer
                    if ((null == clonedRaces) || (clonedRaces.size() == 0)) {
                        if ((null != utoteEvent.getRaces()) && (utoteEvent.getRaces().size() > 0)) {
                            log4j.debug("cloneResult - Has races to remove, about to remove races for runId={}, eventId={}, eventTime={}", utoteEvent.getRunId(), utoteEvent.getEventId(), utoteEvent.getEventTime());
                            for (UtoteRace aRace : utoteEvent.getRaces()) {
                                em.remove(aRace);
                            }
                            utoteEvent.getRaces().clear();
                            utoteEvent.setRaces(null);
                            if (utoteEvent.getHasRaces()) {
                                utoteEvent.setHasRaces(false);
                                needsUpdate = true;
                            }
                        }
                    }
                }
                // If the state of the races for the event changed, do a final update
                if (needsUpdate) {
                    log4j.trace("cloneResult - Opening transaction for existing runId={}, eventId={}, eventTime={}", utoteEvent.getRunId(), utoteEvent.getEventId(), utoteEvent.getEventTime());
                    em.getTransaction().begin();
                    log4j.trace("cloneResult - Calling merge for existing runId={}, eventId={}, eventTime={}", utoteEvent.getRunId(), utoteEvent.getEventId(), utoteEvent.getEventTime());
                    UtoteEvent mergedEvent = em.merge(utoteEvent);
                    utoteEvent = mergedEvent;
                    log4j.trace("cloneResult - Calling commit transaction for existing runId={}, eventId={}, eventTime={}", utoteEvent.getRunId(), utoteEvent.getEventId(), utoteEvent.getEventTime());
                    em.getTransaction().commit();
                    log4j.debug("cloneResult - Existing entity persisted for idUtoteEvent={} runId={}, eventId={}, eventTime={}", utoteEvent.getIdUtoteEvent(), utoteEvent.getRunId(), utoteEvent.getEventId(), utoteEvent.getEventTime());
                }

                // Update transient fields
                utoteEvent.setTransients();
            } else {
                log4j.debug("cloneResult - No races specified for eventId = {}", utoteEvent.getEventId());
            }

        } catch (Exception e) {
            log4j.error("cloneResult - Could not persist eventId = {}", utoteEvent.getEventId());
            log4j.debug("cloneResult - Could not persist eventId = " + utoteEvent.getEventId() + ", Exception = " + e.getMessage(),e);
        } finally {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            em.close();
            emF.close();
        }

        log4j.exit("cloneResult");
        return utoteResult;
    }

    /**
    private UtoteResult findResults(EntityManager em, String eventId, int raceId) {
        log4j.entry("findResults - eventId, raceId", eventId, raceId);
        UtoteResult utoteResult = null;
        TypedQuery<UtoteResult> q = em.createNamedQuery("UtoteResult.findSpecific", UtoteResult.class);
        q.setParameter("eventId", eventId);
        q.setParameter("raceId", raceId);
        try {
            utoteResult = q.getSingleResult();
        } catch (javax.persistence.NoResultException e) {
            log4j.trace("findResults - Received NoResultException looking for a Race");
        }
        if (null != utoteResult) {
            log4j.debug("Found existing result. idUtoteResult={}, EventId={}, RaceId={}", utoteResult.getIdUtoteResult(), utoteResult.getEventId(), utoteResult.getRaceId());
        }
        log4j.exit("findResults");
        return utoteResult;
    }
     **/

    /**
    private UtoteResult persistResult(String eventId, int raceId, ResultServiceStub.ResultResponse result, boolean deep, boolean returnAssociations) {
        log4j.entry("persistResult - eventId, raceId ", eventId, raceId);
        boolean newResults = false;

        // Get an Entity Manager
        final EntityManagerFactory emF = Configurator.getRWEMF();
        final EntityManager em = emF.createEntityManager();

        // See if the entity already exists
        log4j.debug("persistResult - Searching for utoteResult with eventId={}, raceId={}", eventId, raceId);
        UtoteResult utoteResult = findResults(em, eventId, raceId);
        if (null == utoteResult) {
            log4j.debug("persistResult - utoteResult with eventId={}, raceId={} not found, creating new entity", eventId, raceId);
            utoteResult = new UtoteResult();
            utoteResult.setEventId(eventId);
            newResults = true;
        } else {
            log4j.debug("persistResult - Found existing utoteResult entity with eventId={}, raceId={}", eventId, raceId);
        }

        // Update the information in the record with what was submitted
        log4j.debug("persistResult - About to cloneResults for eventId={}, raceId={}", eventId, raceId);
        UtoteResult clonedResult = cloneResult(utoteResult, result, newResults, deep, returnAssociations );
        utoteResult = clonedResult;

        // Insert a new or update the existing UtoteRace
        // representing the contents of this message
        log4j.debug("persistResult - About to persiste utoteRace for raceId = {}", utoteRace.getRaceId());
        em.getTransaction().begin();
        if (newRace) {
            em.persist(utoteRace);
        } else {
            UtoteRace mergedRace = em.merge(utoteRace);
            utoteRace = mergedRace;
        }
        try {
            em.getTransaction().commit();
            int idUtoteRace = utoteRace.getIdUtoteRace();
            log4j.debug("persistResult - UtoteRace persisted, Entity Id: {}", idUtoteRace);
        } catch (Exception e) {
            log4j.debug("persistResult - Exception commiting after em.persist: "+e.getMessage(),e);
        }

        // Close the connections
        try {
            em.close();
            emF.close();
        } catch (Exception e) {
            log4j.debug("persistResult - Exception trying em.close(): "+e.getMessage(),e);
        }

        log4j.exit("persistResult");
        return utoteResult;

    }
     **/

    public UtoteResult getRaceResult(String eventId, int raceId) {

        String method = "getRaceResult";
        log4j.entry("{} - eventId, raceId", method, eventId, raceId);

        UtoteResult utoteResult = null;
        ResultServiceStub.GetResultResponse rResponse = null;
        ResultServiceStub.ResultResponse resultResponse = null;
        int requestLogId = 0;
        int responseLogId = 0;

        // Make call to GetResult
        try {

            // Setup call
            log4j.debug("{} - Settting up GetResult call for raceId={}", method, raceId);
            ResultServiceStub stub = new ResultServiceStub();
            ResultServiceStub.GetResult getResultInput = new ResultServiceStub.GetResult();
            ResultServiceStub.ResultRequest rRequest = new ResultServiceStub.ResultRequest();
            rRequest.setSource(getSource());
            rRequest.setEventId(eventId);
            rRequest.setRaceId(raceId);
            getResultInput.setResultRequest(rRequest);
            log4j.debug("{} - rRequest={}", method, rRequest.toString());
            log4j.debug("{} - getResultInput={}", method, getResultInput.toString());

            // Log the request
            requestLogId = (new UtoteRequestResponseLogger()).saveGetResultRequest(getResultInput);

            // Make the call
            log4j.debug("{} - Making GetResult call for eventId={}, raceId={}", method, eventId, raceId);
            rResponse = stub.getResult(getResultInput);

            // Make sure we got a response
            if (null == rResponse) {
                log4j.error("Null response returned from GetResult request.");
            }


        } catch (Result_GetResult_ValidationFaultFault_FaultMessage e) {
            log4j.error("getRaceResult - Result_GetResult_ValidationFaultFault_FaultMessage getting race result - "+e.getMessage(), e);
        } catch (Result_GetResult_ToteFaultFault_FaultMessage e) {
            log4j.error("getRaceResult - Result_GetResult_ToteFaultFault_FaultMessage getting race details - "+e.getMessage(), e);
        } catch (AxisFault e) {
            log4j.error("getRaceResult - AxisFault getting race details - "+e.getMessage(),e);
        } catch (Exception e) {
            log4j.error("getRaceResult - General exception getting race details - "+e.getMessage(),e);
        }

        if ((null != rResponse) && rResponse.isResultResponseSpecified()) {

            // Get the response
            resultResponse = rResponse.getResultResponse();

            // Debug for the race response header
            log4j.debug("getRaceResult - Result:");
            log4j.debug("\tItems with an \"(*)\" are optional.");
            log4j.debug("\t\tGroup Id(*): {}", resultResponse.isGroupIdSpecified()?resultResponse.getGroupId():"N/A");
            log4j.debug("\t\tRun Id(*): {}", resultResponse.isRunIdSpecified()?resultResponse.getRunId():"N/A");
            log4j.debug("\t\tSource (Source Id/System Id): {}/{}", resultResponse.getSource().getSourceId(), resultResponse.getSource().getSystemId());
            if (resultResponse.isErrorSpecified()) {
                log4j.debug("\t\tError(*): {}/{}/{}", resultResponse.getError().getNumber(), resultResponse.getError().getMessage(), resultResponse.getError().getParams().toString());
            }

            // Add in the result details if specified
            utoteResult.setEventId(eventId);
            utoteResult.setRaceId(raceId);
            if (resultResponse.isEventNameSpecified()) {
                utoteResult.setEventName(resultResponse.getEventName());
            }
            if (resultResponse.isCurrencyIdSpecified()) {
                utoteResult.setCurrencyId(resultResponse.getCurrencyId());
            }
            if (resultResponse.isRaceResultsSpecified()) {
                utoteResult.setHasRaceResults(true);
            }
            if (resultResponse.isPoolPricesSpecified()) {
                utoteResult.setHasPoolPrices(true);
            }
            /**
            if (resultResponse.isRaceResultsSpecified()) {

                ResultServiceStub..Race rRace = resultResponse.getRaceResult();
                log4j.debug("\tProgramServiceStub.Race rRace.raceId = {}",rRace.getRaceId());

                utoteRace = persistRace(
                    eventId,
                    rRace,
                    true, // deep
                    true); // return associated objects
                log4j.debug("getRaceDetails - After persistRace().  utoteRace.idUtoteRace = {}",utoteRace.getIdUtoteRace());
            } else {
                log4j.error("GetRaceResult - Race Detail: <Not Specified>");
            }
             **/

            // Log the response
            responseLogId = (new UtoteRequestResponseLogger()).saveGetResultResponse(requestLogId, rResponse, Integer.valueOf(utoteResult.getIdUtoteResult()));

            // GetRace returned, but was missing the RaceResposne
        } else if (null != rResponse) {
            responseLogId = (new UtoteRequestResponseLogger()).saveGetResultResponse(requestLogId, rResponse, null);
            log4j.error("getRaceResult - Received a result, but No race response was returned, responseLogId = {}",responseLogId);

            // Null response from GetRace call
        } else {
            log4j.error("getRaceResult - No race response was returned for Event Id={} and Race Id={}", eventId, raceId);
        }

        log4j.exit("getRaceResult");
        return utoteResult;
    }
}
