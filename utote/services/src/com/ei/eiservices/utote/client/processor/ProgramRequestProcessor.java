
/**
 * ProgramServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ei.eiservices.utote.client.processor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
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
import com.ei.eiservices.utote.client.programservice.ProgramServiceStub;
import com.ei.eiservices.utote.client.programservice.ProgramServiceStub.Event;
import com.ei.eiservices.utote.client.programservice.ProgramServiceStub.GetEventDetailResponse;
import com.ei.eiservices.utote.client.programservice.Program_GetEventDetail_ToteFaultFault_FaultMessage;
import com.ei.eiservices.utote.client.programservice.Program_GetEventDetail_ValidationFaultFault_FaultMessage;
import com.ei.eiservices.utote.client.programservice.Program_GetEvents_ToteFaultFault_FaultMessage;
import com.ei.eiservices.utote.client.programservice.Program_GetEvents_ValidationFaultFault_FaultMessage;
import com.ei.eiservices.utote.client.programservice.Program_GetRace_ToteFaultFault_FaultMessage;
import com.ei.eiservices.utote.client.programservice.Program_GetRace_ValidationFaultFault_FaultMessage;
import com.ei.eiservices.utote.model.UtoteEntry;
import com.ei.eiservices.utote.model.UtoteEvent;
import com.ei.eiservices.utote.model.UtotePool;
import com.ei.eiservices.utote.model.UtoteRace;
import com.ei.eiservices.utote.model.UtoteRunner;

/*
 *  ProgramServiceTest
 */

public class ProgramRequestProcessor {

    private static final Logger log4j = LogManager.getLogger(ProgramRequestProcessor.class.getName());

    private static ProgramServiceStub.Source getSource() {
        ProgramServiceStub.Source source = new ProgramServiceStub.Source();
        source.setSystemId(Configurator.getSystemId());
        source.setSourceId(Configurator.getSourceId());
        return source;
    }

    private static UtoteEntry findEntry(Collection<UtoteEntry> entries, String entryId) {
        return (null == entries)?null:entries.stream()
                .filter(uEntry -> (
                        ((null == entryId) &&
                                (null == uEntry.getEntryId())
                                ) ||
                        ((null != entryId) &&
                                (null != uEntry.getEntryId()) &&
                                (uEntry.getEntryId().equalsIgnoreCase(entryId)))
                        )
                        )
                .findFirst().orElse(null);
    }

    private static Collection<UtoteEntry> cloneEntries(UtoteRunner parent, ProgramServiceStub.Entries entries, boolean newParent) {
        log4j.entry("cloneEntries - idParent(Race), runnerId", parent.getIdParent(), parent.getRunnerId());
        Collection<UtoteEntry> uEntries = null;

        // See if any runners were passed in
        if (entries.isEntrySpecified()) {

            // Get the current Runners entity collection, if exists
            uEntries = newParent?new ArrayList<UtoteEntry>():parent.getEntries();

            final EntityManagerFactory emF = Configurator.getRWEMF();
            final EntityManager em = emF.createEntityManager();

            // Iterate over the pools
            for (ProgramServiceStub.Entry entry : entries.getEntry()) {

                // Open transaction
                log4j.trace("cloneEntries - {} Entries are specified, about to process", entries.getEntry().length);
                em.getTransaction().begin();

                // Try to find existing entry, If this is new, create the container
                log4j.trace("cloneEntries - Searching for input entryId = {}", entry.getEntryId());
                UtoteEntry uEntry = newParent?null:findEntry(uEntries, entry.getEntryId());
                if (null == uEntry) {
                    log4j.trace("cloneEntries - Not found, creating new entity for input entryId={}", entry.getEntryId());
                    uEntry = new UtoteEntry(parent.getIdUtoteRunner(), entry);
                    // Persist first before updating or adding any associations
                    log4j.trace("cloneEntries - Entry is NEW, calling persist entryId={}, runnerId={}", uEntry.getEntryId(), parent.getRunnerId());
                    em.persist(uEntry);
                } else {
                    log4j.trace("cloneEntries - Found entity for input entryId={}, idUtoteEntry={}", uEntry.getEntryId(), uEntry.getIdUtoteEntry());
                    uEntry.updateFromTote(entry);
                    // Persist first before updating or adding any associations
                    log4j.trace("cloneEntries - Entry Entity is EXISTING, calling merge for entryId={}, runnerId={}", uEntry.getEntryId(), parent.getRunnerId());
                    UtoteEntry mergedEntry = em.merge(uEntry);
                    uEntries.remove(uEntry);
                    uEntry = mergedEntry;
                }

                // Commit the transaction
                try {
                    log4j.trace("cloneEntries - Calling commit Entry transaction for entryId={}, idUtoteRunner={}, runnerId={}", uEntry.getEntryId(), parent.getIdUtoteRunner(), parent.getRunnerId());
                    em.getTransaction().commit();
                    log4j.trace("cloneEntries - Entry Entity comitted for entryId={}, idUtoteRunner={}, runnerId={}", uEntry.getEntryId(), parent.getIdUtoteRunner(), parent.getRunnerId());
                } catch (Exception e) {
                    log4j.error("cloneEntries - Could not persist Entries for entryId={}, idUtoteRunner={}, runnerId={}, exceptionMsg={}, exception={}", uEntry.getEntryId(), parent.getIdUtoteRunner(), parent.getRunnerId(),e.getMessage(),e);
                } finally {
                    if (em.getTransaction().isActive()) {
                        em.getTransaction().rollback();
                    }
                }

                // Save the entry to return
                uEntries.add(uEntry);
            }

            if (em.isOpen()) {
                em.close();
            }
            if (emF.isOpen()) {
                emF.close();
            }
        }

        log4j.exit("cloneEntries uEntries.size = "+uEntries.size());
        return uEntries;
    }

    private static UtoteRunner findRunner(Collection<UtoteRunner> runners, int runnerId) {
        return (null == runners)?null:runners.stream()
                .filter(uRunner -> (uRunner.getRunnerId() == runnerId))
                .findFirst()
                .orElse(null);
    }

    private static Collection<UtoteRunner> cloneRunners(UtoteRace parent, boolean newParent, ProgramServiceStub.Runners runners) {
        log4j.entry("cloneRunners - raceId", parent.getRaceId());
        Collection<UtoteRunner> uRunners = null;

        // See if any runners were passed in
        if (runners.isRunnerSpecified()) {

            // Get the current Runners entity collection, if exists
            uRunners = newParent?new ArrayList<UtoteRunner>():parent.getRunners();

            final EntityManagerFactory emF = Configurator.getRWEMF();
            final EntityManager em = emF.createEntityManager();

            // Iterate over the pools
            for (ProgramServiceStub.Runner runner : runners.getRunner()) {

                boolean newRunner = false;

                // Open transaction
                log4j.debug("cloneRunners - {} Runners are specified, about to process", runners.getRunner().length);
                em.getTransaction().begin();

                // Get existing Runner, If this is new, create the container
                log4j.trace("cloneRunners - Searching for input runnerId = {}", runner.getRunnerId());
                UtoteRunner uRunner = newParent?null:findRunner(uRunners, runner.getRunnerId());

                if (null == uRunner) {
                    newRunner = true;
                    log4j.trace("cloneRunners - Not found, creating new entity for input runnerId = {}", runner.getRunnerId());
                    uRunner = new UtoteRunner(parent.getIdUtoteRace(), runner);
                    // Persist first before updating or adding any associations
                    log4j.trace("cloneRunners - Runner is NEW, calling persist for raceId = {}", parent.getRaceId());
                    em.persist(uRunner);
                } else {
                    log4j.trace("cloneRunners - Found entity for input runnerId = {}, idUtoteRunner={}", uRunner.getRunnerId(), uRunner.getIdUtoteRunner());
                    uRunner.updateFromTote(runner);
                    // Persist first before updating or adding any associations
                    UtoteRunner mergedRunner = em.merge(uRunner);
                    uRunners.remove(uRunner);
                    uRunner = mergedRunner;
                }

                // Commit the transaction
                try {
                    log4j.trace("cloneRunners - Calling commit transaction for idUtoteRace={}, raceId={}", parent.getIdUtoteRace(), parent.getRaceId());
                    em.getTransaction().commit();
                    log4j.trace("cloneRunners - Runner Entity idUtoteRunner={} comitted for idUtoteRace={}, raceId={}", uRunner.getIdUtoteRunner(), parent.getIdUtoteRace(), parent.getRaceId());
                } catch (Exception e) {
                    log4j.error("cloneRunners - Could not persist Runners for idUtoteRace={}, raceId={}, exception msg={}, exception={}", parent.getIdUtoteRace(), parent.getRaceId(),e.getMessage(),e);
                } finally {
                    if (em.getTransaction().isActive()) {
                        em.getTransaction().rollback();
                    }
                }

                // Add the entries if specified
                if (uRunner.getHasEntries()) {
                    // If an existing runner, try to retrieve existing Entries
                    if (!newRunner) {
                        TypedQuery<UtoteEntry> q = em.createNamedQuery("UtoteEntry.findByParent", UtoteEntry.class);
                        q.setParameter("idParent", uRunner.getIdUtoteRunner());
                        Collection<UtoteEntry> entryList = q.getResultList();
                        if ((null != entryList) && (entryList.size() > 0)) {
                            uRunner.setEntries(entryList);
                        } else {
                            log4j.warn("cloneRunners - Did not find any existing entries for an existing Runner: for runnerId = {}, idUtoteRunner={}", uRunner.getRunnerId(), uRunner.getIdUtoteRunner());
                        }
                    }
                    log4j.trace("cloneRunners - Cloning Entries for runnerId = {}, idUtoteRunner={}", uRunner.getRunnerId(), uRunner.getIdUtoteRunner());
                    Collection<UtoteEntry> entryList = cloneEntries(uRunner, runner.getEntries(), newParent);
                    uRunner.setEntries(entryList);
                    log4j.trace("cloneRunners - After adding Entries for Number of entries={} runnerId={}, idUtoteRunner={}", uRunner.getEntries().size(), uRunner.getRunnerId(), uRunner.getIdUtoteRunner());
                }

                // Save the runner
                uRunners.add(uRunner);

            }

            if (em.isOpen()) {
                em.close();
            }
            if (emF.isOpen()) {
                emF.close();
            }

        }

        log4j.exit("cloneRunners parent.getRunners.size = "+uRunners.size());
        return uRunners;
    }

    private static UtotePool findPool(Collection<UtotePool> pools, String poolId, int poolNumber) {
        return (null == pools)?null:pools.stream()
                .filter(uPool -> (uPool.getPoolId().equals(poolId) && (uPool.getPoolNumber() == poolNumber)))
                .findFirst().orElse(null);
    }

    private static Collection<UtotePool> clonePool(UtoteRace parent, boolean newParent, ProgramServiceStub.Pools pools) {
        String method = "ProgramRequestProcessor.clonePool";
        log4j.entry(method + " - for RaceId="+parent.getRaceId());

        // Get the current Pool entity collection, if exists
        Collection<UtotePool> uPools = newParent?new ArrayList<UtotePool>():parent.getPools();

        // See if any pools were passed in
        if (pools.isPoolSpecified()) {

            final EntityManagerFactory emF = Configurator.getRWEMF();
            final EntityManager em = emF.createEntityManager();

            log4j.debug("clonePools - {} Pools are specified, about to process", pools.getPool().length);

            // Iterate over the pools
            for (ProgramServiceStub.Pool pool : pools.getPool()) {

                // Open transaction
                log4j.trace("clonePools - Opening Pools transaction for idUtoteRace={}, raceId={}", parent.getIdUtoteRace(), parent.getRaceId());
                em.getTransaction().begin();

                // If this is new, create the container
                log4j.trace("clonePools - Searching for input poolId = {}, poolNumber = {}", pool.getPoolId(), pool.getPoolNumber());
                UtotePool uPool = newParent?null:findPool(uPools, pool.getPoolId(), pool.getPoolNumber());
                if (null == uPool) {
                    log4j.trace("clonePools - Not found, creating new entity for poolId = {}, poolNumber = {}", pool.getPoolId(), pool.getPoolNumber());
                    // Create new entity
                    uPool = new UtotePool(parent.getIdUtoteRace(), pool);
                    log4j.trace("clonePools - Pool Entity is NEW, calling persist for poolId={}, poolNumber={}", uPool.getPoolId(), uPool.getPoolName());
                    // Persist the element
                    em.persist(uPool);
                } else {
                    log4j.trace("clonePools - FOUND EXISTING Pool with idUtotePool={}, poolId={}, poolNumber={}", uPool.getIdUtotePool(), uPool.getPoolId(), uPool.getPoolName());
                    // Update the existing pool
                    uPool.updateFromTote(pool);
                    log4j.trace("clonePools - Pool Entity EXISTS, calling persist for poolId={}, poolNumber={}", uPool.getPoolId(), uPool.getPoolName());
                    // Persist the element
                    UtotePool mergedPool = em.merge(uPool);
                    uPools.remove(uPool);
                    uPool = mergedPool;
                }

                // Commit the transaction
                try {
                    em.getTransaction().commit();
                    log4j.trace("clonePools - Pool Entity comitted for idUtoteRace={}, raceId={}", parent.getIdUtoteRace(), parent.getRaceId());
                } catch (Exception e) {
                    log4j.error("clonePools - Could not persist Pools for idUtoteRace="+parent.getIdUtoteRace()+", raceId = " + parent.getRaceId() + ", Exception = " + e.getMessage(),e);
                } finally {
                    if (em.getTransaction().isActive()) {
                        em.getTransaction().rollback();
                    }
                }

                // Put it into the holding array
                uPools.add(uPool);

            }

            if (em.isOpen()) {
                em.close();
            }
            if (emF.isOpen()) {
                emF.close();
            }

        }

        log4j.debug("clonePools - finished.  parent.getPools().size() = {}", uPools.size());
        return uPools;
    }

    private static UtoteRace cloneRaceDetails(UtoteRace utoteRace, ProgramServiceStub.Race rRace, boolean newRace, boolean deep, boolean returnAssociations) {
        String method = "cloneRaceDetails";
        log4j.entry(method);

        log4j.entry("{} - cloning fields for raceId = {}.", method, rRace.getRaceId());
        utoteRace.updateFromTote(rRace);

        final EntityManagerFactory emF = Configurator.getRWEMF();
        final EntityManager em = emF.createEntityManager();
        try {

            // Persist first before updating or adding any associations
            log4j.trace("{} - About to persist for {} raceId = {}", method, (newRace?"new":"existing"), utoteRace.getRaceId());
            em.getTransaction().begin();
            log4j.trace("{} - Calling {} for raceId = {}", method, (newRace?"PERSIST":"MERGE"), utoteRace.getRaceId());
            if (newRace) {
                em.persist(utoteRace);
            } else  {
                UtoteRace mergedRace = em.merge(utoteRace);
                utoteRace = mergedRace;
            }
            log4j.trace("{} - Calling commit transaction for raceId = {}", method, utoteRace.getRaceId());
            em.getTransaction().commit();
            log4j.debug("{} - {} Entity persisted for raceId = {}, idUtoteRace = {}", method, (newRace?"new":"existing"),utoteRace.getRaceId(), utoteRace.getIdUtoteRace());

        } catch (Exception e) {
            log4j.error(method + " - Could not persist raceId = " + utoteRace.getRaceId() + ", Exception = " + e.getMessage(),e);
        } finally {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        }

        // Clone race pool
        if (deep && rRace.isPoolsSpecified()) {
            // If an existing runner, try to retrieve existing Entries
            if (!newRace) {
                TypedQuery<UtotePool> q = em.createNamedQuery("UtotePool.findByParent", UtotePool.class);
                q.setParameter("idParent", utoteRace.getIdUtoteRace());
                Collection<UtotePool> poolList = q.getResultList();
                if ((null != poolList) && (poolList.size() > 0)) {
                    utoteRace.setPools(poolList);
                } else {
                    log4j.warn("{} - Did not find any existing Pools for an existing Race: for raceId = {}, idUtoteRace={}", method, utoteRace.getRaceId(), utoteRace.getIdUtoteRace());
                }
            }
            log4j.debug("{} - PoolsSpecified is true.  Calling clonePool for raceId = {}",method, rRace.getRaceId());
            Collection<UtotePool> uPools = clonePool(utoteRace, newRace, rRace.getPools());
            log4j.debug("{} - {} Pools were cloned for raceId = {}", method, uPools.size(), rRace.getRaceId());
            if (!returnAssociations) {
                if ((null != uPools) && (uPools.size() > 0)) {
                    uPools.clear();
                }
                utoteRace.setPools(null);
            } else {
                utoteRace.setPools(uPools);
            }
        }

        // Clone runners
        if (deep && rRace.isRunnersSpecified()) {
            // If an existing runner, try to retrieve existing Entries
            if (!newRace) {
                TypedQuery<UtoteRunner> q = em.createNamedQuery("UtoteRunner.findByParent", UtoteRunner.class);
                q.setParameter("idParent", utoteRace.getIdUtoteRace());
                Collection<UtoteRunner> runnerList = q.getResultList();
                if ((null != runnerList) && (runnerList.size() > 0)) {
                    utoteRace.setRunners(runnerList);
                } else {
                    log4j.warn("{} - Did not find any existing Runners for an existing Race: for raceId = {}, idUtoteRace={}", method, utoteRace.getRaceId(), utoteRace.getIdUtoteRace());
                }
            }
            log4j.debug("{} - RunnersSpecified is true.  Calling cloneRunners for raceId = {}", method, rRace.getRaceId());
            Collection<UtoteRunner> uRunners = cloneRunners(utoteRace, newRace, rRace.getRunners());
            log4j.debug("{} - {} Runners were cloned for raceId = {}", method, uRunners.size(), rRace.getRaceId());
            if (!returnAssociations) {
                if ((null != uRunners) && (uRunners.size() > 0)) {
                    uRunners.clear();
                }
                utoteRace.setRunners(null);
            } else {
                utoteRace.setRunners(uRunners);
                log4j.debug("{} - Preserving runners in the cloned race for raceId = {}", method, rRace.getRaceId());
            }
        }

        if (em.isOpen()) {
            em.close();
        }
        if (emF.isOpen()) {
            emF.close();
        }

        log4j.debug("{} - finished.  utoteRace.idUtoteRace={}, utoteRace.raceId={}", method, utoteRace.getIdUtoteRace(), utoteRace.getRaceId());
        log4j.exit(method);

        return utoteRace;
    }

    private static UtoteRace findRace(Collection<UtoteRace> races, int raceId) {
        return (null == races)?null:races.stream()
                .filter(uRace -> (uRace.getRaceId() == raceId))
                .findFirst().orElse(null);
    }

    private static Collection<UtoteRace> cloneRaces(UtoteEvent parent, boolean newParent, ProgramServiceStub.Races races) {
        log4j.entry("cloneRaces - EventId", parent.getEventId());

        // Get the current Runners entity collection, if exists
        Collection<UtoteRace> uRaces = newParent?new ArrayList<UtoteRace>():(null == parent.getRaces())?new ArrayList<UtoteRace>():parent.getRaces();

        // See if any runners were passed in
        if (races.isRaceSpecified()) {

            log4j.debug("cloneRaces - Races are specified, about to process");

            // Iterate over the races
            for (ProgramServiceStub.Race race : races.getRace()) {
                boolean newRace = false;

                // If this is new, create the container
                log4j.debug("cloneRaces - Processing input raceId = {}", race.getRaceId());
                UtoteRace uRace = newParent?null:findRace(uRaces, race.getRaceId());
                if (null == uRace) {
                    log4j.debug("cloneRaces - ADDING new Race entity for raceId = {}", race.getRaceId());
                    newRace = true;
                    uRace = new UtoteRace();
                    uRace.setIdUtoteEvent(parent.getIdUtoteEvent());
                    uRace.setEventId(parent.getEventId());
                    uRace.setRaceId(race.getRaceId());
                } else {
                    log4j.debug("cloneRaces - FOUND existing UtoteRace - idUtoteRace={}, idParent={}, eventId={}, raceId={}", uRace.getIdUtoteRace(), uRace.getIdParent(), uRace.getEventId(), uRace.getRaceId());
                }

                // Set the values that have been specified
                log4j.debug("cloneRaces - about to clone race details for raceId = {}", race.getRaceId());
                UtoteRace clonedRace = cloneRaceDetails(uRace, race, newRace, true /* deep */, false /* do not keep associations */);

                if (newRace) {
                    log4j.debug("cloneRaces - Adding new race to cloned race array for raceId = {}", race.getRaceId());
                    uRaces.add(clonedRace);
                } else if (!uRace.equals(clonedRace)) {
                    log4j.debug("cloneRaces - Replacing existing race in cloned race array for raceId = {}", race.getRaceId());
                    uRaces.remove(uRace);
                    uRaces.add(clonedRace);
                }
            }

        } else {
            log4j.debug("cloneRaces - No races are specified");
        }

        log4j.exit("cloneRaces exiting - parent.getRaces().size() = "+uRaces.size());
        return uRaces;
    }

    private static UtoteEvent findEvent(EntityManager em, String runId, String eventId, Date eventTime) {
        log4j.entry("findEvent - runId, eventId, eventTime", runId, eventId, eventTime);
        TypedQuery<UtoteEvent> q = em.createNamedQuery("UtoteEvent.findSpecific", UtoteEvent.class);
        q.setParameter("runId", Integer.parseInt(runId));
        q.setParameter("eventId", eventId);
        q.setParameter("eventTime", eventTime);
        UtoteEvent utoteEvent = null;
        try {
            utoteEvent = q.getSingleResult();
            utoteEvent.setTransients();
        } catch (javax.persistence.NoResultException nre) {
            log4j.trace("findEvent - Received NoResultException looking for an event");
        } catch (Exception e) {
            log4j.error("findEvent - Received Exception looking for an event. Msg={}.\nException={}", e.getMessage(), e);
        }
        log4j.debug("findEvent - anEvent {}",(null == utoteEvent)?"IS NULL":"WAS FOUND");
        if (null != utoteEvent) {
            log4j.debug("findEvent - Found existing event.  idUtoteEvent={}, RunId={}, EventId={}, EventTime={}",utoteEvent.getRunId(),utoteEvent.getIdUtoteEvent(),eventId,eventTime);
        }
        log4j.exit("findEvent");
        return utoteEvent;
    }


    private static UtoteEvent cloneEvent(UtoteEvent utoteEvent, ProgramServiceStub.Event event, boolean newEvent, boolean deep) {
        log4j.entry("cloneEvent - ", event.getRunId(), event.getEventId(), event.getEventTime().getTime().toString());

        // Copy the new values over
        utoteEvent.updateFromTote(event);

        // Persist first before updating or adding any associations
        log4j.debug("cloneEvent - About to persist for {} eventId = {}",(newEvent?"NEW":"EXISTING"), utoteEvent.getEventId());

        final EntityManagerFactory emF = Configurator.getRWEMF();
        final EntityManager em = emF.createEntityManager();

        try {

            log4j.trace("cloneEvent - Opening transaction for {} Event with runId={}, eventId={}, eventTime={}", (newEvent?"NEW":"EXISTING"), utoteEvent.getRunId(), utoteEvent.getEventId(), utoteEvent.getEventTime());
            em.getTransaction().begin();
            log4j.trace("cloneEvent - Calling persist for {} Event with runId={}, eventId={}, eventTime={}", (newEvent?"NEW":"EXISTING"), utoteEvent.getRunId(), utoteEvent.getEventId(), utoteEvent.getEventTime());
            if (newEvent) {
                em.persist(utoteEvent);
            } else {
                UtoteEvent mergedEvent = em.merge(utoteEvent);
                utoteEvent = mergedEvent;
            }
            log4j.trace("cloneEvent - Calling commit transaction for {} Event with runId={}, eventId={}, eventTime={}", (newEvent?"NEW":"EXISTING"), utoteEvent.getRunId(), utoteEvent.getEventId(), utoteEvent.getEventTime());
            em.getTransaction().commit();
            log4j.debug("cloneEvent - {} Event persisted for idUtoteEvent = {}, event={}", (newEvent?"NEW":"EXISTING"), utoteEvent.toString(false));

            // Now update/add Races if specified
            if (deep && utoteEvent.hasRaces()) {
                // If an existing Event, try to retrieve existing Races
                if (!newEvent) {
                    Collection<UtoteRace> raceList = UtoteRace.findByParent(em, utoteEvent.getIdUtoteEvent());
                    if ((null != raceList) && (raceList.size() > 0)) {
                        utoteEvent.setRaces(raceList);
                    } else {
                        log4j.warn("cloneEvent - Did not find any existing Races for an existing Event: for idUtoteEvent = {}, runId={}, eventId={}, eventTime={}", utoteEvent.getIdUtoteEvent(), utoteEvent.getRunId(), utoteEvent.getEventId(), utoteEvent.getEventTime());
                    }
                }
                // Process the races (e.g. insert or update)
                boolean needsUpdate = false;
                log4j.debug("cloneEvent - Has races, about to call cloneRaces for runId={}, eventId={}, eventTime={}", utoteEvent.getRunId(), utoteEvent.getEventId(), utoteEvent.getEventTime());
                Collection<UtoteRace> clonedRaces = cloneRaces(utoteEvent, newEvent, event.getRaces());
                if (newEvent) {
                    if ((null == clonedRaces) || (clonedRaces.size() == 0)) {
                        utoteEvent.setRaces(null);
                        if (utoteEvent.hasRaces()) {
                            utoteEvent.setHasRaces(false);
                            needsUpdate = true;
                        }
                    } else {
                        utoteEvent.setRaces(clonedRaces);
                        if (!utoteEvent.hasRaces()) {
                            utoteEvent.setHasRaces(true);
                            needsUpdate = true;
                        }
                    }
                } else {
                    // If the event had races, but does not any longer
                    if ((null == clonedRaces) || (clonedRaces.size() == 0)) {
                        if ((null != utoteEvent.getRaces()) && (utoteEvent.getRaces().size() > 0)) {
                            log4j.debug("cloneEvent - Has races to remove, about to remove races for runId={}, eventId={}, eventTime={}", utoteEvent.getRunId(), utoteEvent.getEventId(), utoteEvent.getEventTime());
                            for (UtoteRace aRace : utoteEvent.getRaces()) {
                                em.remove(aRace);
                            }
                            utoteEvent.getRaces().clear();
                            utoteEvent.setRaces(null);
                            if (utoteEvent.hasRaces()) {
                                utoteEvent.setHasRaces(false);
                                needsUpdate = true;
                            }
                        }
                    }
                }
                // If the state of the races for the event changed, do a final update
                if (needsUpdate) {
                    log4j.trace("cloneEvent - Opening transaction for existing runId={}, eventId={}, eventTime={}", utoteEvent.getRunId(), utoteEvent.getEventId(), utoteEvent.getEventTime());
                    em.getTransaction().begin();
                    log4j.trace("cloneEvent - Calling merge for existing runId={}, eventId={}, eventTime={}", utoteEvent.getRunId(), utoteEvent.getEventId(), utoteEvent.getEventTime());
                    UtoteEvent mergedEvent = em.merge(utoteEvent);
                    utoteEvent = mergedEvent;
                    log4j.trace("cloneEvent - Calling commit transaction for existing runId={}, eventId={}, eventTime={}", utoteEvent.getRunId(), utoteEvent.getEventId(), utoteEvent.getEventTime());
                    em.getTransaction().commit();
                    log4j.debug("cloneEvent - Existing entity persisted for idUtoteEvent={} runId={}, eventId={}, eventTime={}", utoteEvent.getIdUtoteEvent(), utoteEvent.getRunId(), utoteEvent.getEventId(), utoteEvent.getEventTime());
                }

                // Update transient fields
                utoteEvent.setTransients();
            } else {
                log4j.debug("cloneEvent - No races specified for eventId = {}", utoteEvent.getEventId());
            }

        } catch (Exception e) {
            log4j.error("cloneEvent - Could not persist eventId = {}", utoteEvent.getEventId());
            log4j.debug("cloneEvent - Could not persist eventId = " + utoteEvent.getEventId() + ", Exception = " + e.getMessage(),e);
        } finally {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            em.close();
            emF.close();
        }

        log4j.exit("cloneEvent");
        return utoteEvent;
    }

    public static UtoteEvent persistEvent(ProgramServiceStub.Event event, boolean deep) {
        String method = "persistEvent";
        log4j.entry("{} - runId, eventId, eventTime", method, event.getRunId(), event.getEventId(), event.getEventTime().getTime().toString());

        // Get an Entity Manager
        final EntityManagerFactory emF = Configurator.getRWEMF();
        final EntityManager em = emF.createEntityManager();

        // See if the entity already exists
        boolean newEvent = false;
        int idUtoteEvent = 0;
        log4j.debug("{} - Searching for existing UtoteEvent entity with runId={}, EventId={} and EventTime={}",
                method, event.getRunId(), event.getEventId(), event.getEventTime().getTime());
        UtoteEvent utoteEvent =
                findEvent(em, event.getRunId(), event.getEventId(), event.getEventTime().getTime());
        if (null == utoteEvent) {
            log4j.debug("{} - utoteEvent for runId={}, eventId={}, eventTime={} was not found", method, event.getRunId(), event.getEventId(), event.getEventTime().getTime());
            utoteEvent = new UtoteEvent();
            utoteEvent.setRunId(Integer.parseInt(event.getRunId()));
            utoteEvent.setEventId(event.getEventId());
            utoteEvent.setEventTime(event.getEventTime().getTime());
            newEvent = true;
        } else {
            idUtoteEvent = utoteEvent.getIdUtoteEvent();
            log4j.debug("{} - FOUND UtoteEvent for idUtoteEvent={}, runId={}, eventId={}, eventTime={}", method, idUtoteEvent, utoteEvent.getRunId(), utoteEvent.getEventId(), utoteEvent.getEventTime());
        }

        // Update the information in the record with what was submitted
        log4j.debug("{} - About to clone event into UtoteEvent", method);
        UtoteEvent clonedEvent = cloneEvent(utoteEvent, event, newEvent, deep);
        utoteEvent = clonedEvent;

        // Event should have been persisted
        idUtoteEvent = utoteEvent.getIdUtoteEvent();
        log4j.debug("{} - UtoteEvent persisted, runId={}, EventId={}, EventTime={}, and idUtoteEvent={}", method, utoteEvent.getRunId(), utoteEvent.getEventId(), utoteEvent.getEventTime().toString(), utoteEvent.getIdUtoteEvent());

        // Read the existing UToteStatusChange entries and write to console
        if ((0 != idUtoteEvent) && log4j.isTraceEnabled()) {
            log4j.debug("{} - About to run through result set from returend object", method);
            UtoteEvent anEvent = null;
            try {
                anEvent = em.find(UtoteEvent.class, idUtoteEvent);
            } catch (javax.persistence.NoResultException e) {
                log4j.trace("{} - Received NoResultException looking for a newly inserted event", method);
            } catch (Exception e2) {
                log4j.trace("{} - Received Runtime Exception looking for a newly inserted event: {}\n{}", method, e2.getMessage(), e2);
            }
            log4j.trace("{} - Newly inserted event {} found", method, (null == anEvent)?"WAS NOT":"was");
        }

        // Close the connections
        try {
            em.close();
            emF.close();
        } catch (Exception e) {
            log4j.error("{} - Exception trying em.close(): {}\t{}", method, e.getMessage(), e);
        }

        log4j.exit(method);
        return utoteEvent;

    }

    public static List<UtoteEvent> getEventList() {
        log4j.entry("getEvents");

        List<UtoteEvent> utoteEvents = new ArrayList<UtoteEvent>();
        ProgramServiceStub.GetEventsResponse eResponse = null;
        ProgramServiceStub.EventsResponse eventsResponse = null;
        int requestLogId = 0;
        int responseLogId = 0;

        // Make call to GetEvents
        try {

            // Setup call
            log4j.debug("getEvents - Settting up GetEvents call");
            ProgramServiceStub stub = new ProgramServiceStub();
            ProgramServiceStub.GetEvents getEventsInput = new ProgramServiceStub.GetEvents();
            ProgramServiceStub.EventsRequest eRequest = new ProgramServiceStub.EventsRequest();
            eRequest.setSource(getSource());
            getEventsInput.setEventsRequest(eRequest);
            log4j.trace("getEvents - eRequest={}",eRequest.toString());
            log4j.trace("getEvents - getEventsInput={}",getEventsInput.toString());

            // Log the request
            requestLogId = (new UtoteRequestResponseLogger()).saveGetEventsRequest(getEventsInput);

            // Make the call
            log4j.debug("getEvents - Making GetEvents call");
            eResponse = stub.getEvents(getEventsInput);

            // Make sure we got a response
            if (null == eResponse) {
                log4j.error("getEvents - Null response returned from GetEvents request.");
            }


        } catch (Program_GetEvents_ValidationFaultFault_FaultMessage e) {
            log4j.error("getEvents - Program_GetEvents_ValidationFaultFault_FaultMessage getting events - "+e.getMessage(),e);
        } catch (Program_GetEvents_ToteFaultFault_FaultMessage e) {
            log4j.error("getEvents - Program_GetEvents_ToteFaultFault_FaultMessage getting events - "+e.getMessage(),e);
        } catch (AxisFault e) {
            log4j.error("getEvents - AxisFault getting events - "+e.getMessage(),e);
        } catch (Exception e) {
            log4j.error("getEvents - General exception getting events - "+e.getMessage(),e);
        }

        if ((null != eResponse) && eResponse.isEventsResponseSpecified()) {

            // Get the response
            eventsResponse = eResponse.getEventsResponse();

            // Debug for the race response header
            log4j.debug("getEvents - eventsResponse:");
            log4j.debug("\tItems with an \"(*)\" are optional.");
            LogHelper.debugOut(log4j, "\tGroup Id(*): ", eventsResponse.isGroupIdSpecified(), eventsResponse.getGroupId());
            LogHelper.debugOut(log4j, "\tRun Id(*): ", eventsResponse.isRunIdSpecified(), eventsResponse.getRunId());
            log4j.debug("\tSource (Source Id/System Id): {}/{}", eventsResponse.getSource().getSourceId(), eventsResponse.getSource().getSystemId());
            LogHelper.debugOut(log4j, eventsResponse.isErrorSpecified(), "\t", eventsResponse.getError());

            // Log the response
            log4j.debug("getEvents - Logging the response");
            responseLogId = (new UtoteRequestResponseLogger()).saveGetEventsResponse(requestLogId, eResponse, null);

            // Persist each of the returned events
            for (Event anEvent : eventsResponse.getEvents().getEvent()) {
                UtoteEvent utoteEvent = persistEvent( anEvent, false /* shallow */ );
                utoteEvents.add(utoteEvent);
                log4j.debug("getEvents - Persisted base event number {}", utoteEvents.size());
            }

            // GetRace returned, but was missing the RaceResposne
        } else if (null != eResponse) {
            responseLogId = (new UtoteRequestResponseLogger()).saveGetEventsResponse(requestLogId, eResponse, null);
            log4j.debug("getEvents - responseLogId = {}",responseLogId);

            // Null response from GetRace call
        } else {
            log4j.error("getEvents - No response from the GetEvents call.");
        }

        log4j.exit("getEvents");
        return utoteEvents;
    }

    public static UtoteEvent getEvent(String eventId) {
        String method = "getEvent";
        log4j.entry(method + " - eventId="+eventId);

        UtoteEvent utoteEvent = new UtoteEvent();
        GetEventDetailResponse eResponse = null;
        ProgramServiceStub.EventDetailResponse eventsResponse = null;
        int requestLogId = 0;
        int responseLogId = 0;
        int tryAgain = 3;

        while (tryAgain > 0) {

            // Make call to GetEvents
            try {

                // Setup call
                log4j.debug("{} - Settting up GetEventDetail call for eventId = {}", method, eventId);
                ProgramServiceStub stub = new ProgramServiceStub();
                ProgramServiceStub.GetEventDetail getEventDetailInput = new ProgramServiceStub.GetEventDetail();
                ProgramServiceStub.EventDetailRequest eRequest = new ProgramServiceStub.EventDetailRequest();
                eRequest.setSource(getSource());
                eRequest.setEventId(eventId);
                if (Configurator.getUtoteRacesData()) {
                    eRequest.setRaces(true);
                }
                if (Configurator.getUtoteProgramData()) {
                    eRequest.setProgram(true);
                }
                if (Configurator.getUtotePoolData()) {
                    eRequest.setPools(true);
                }
                if (Configurator.getUtoteRunnersData()) {
                    eRequest.setRunners(true);
                }
                getEventDetailInput.setEventsRequest(eRequest);
                log4j.trace("{} - eRequest={}", method, eRequest.toString());
                log4j.trace("{} - getEventsInput={}", method, getEventDetailInput.toString());

                // Log the request
                log4j.debug("{} - Saving GetEventDetail request for eventId = {}", method, eventId);
                requestLogId = (new UtoteRequestResponseLogger()).saveGetEventDetailRequest(getEventDetailInput);

                // Make the call
                log4j.debug("{} - Making GetEventDetail call for eventId = {}", method, eventId);
                eResponse = stub.getEventDetail(getEventDetailInput);

                // Make sure we got a response
                if (null == eResponse) {
                    log4j.error("{} - Null response returned from GetEventDetail request for eventId = {}.", method, eventId);
                }

                tryAgain = 1;

            } catch (Program_GetEventDetail_ValidationFaultFault_FaultMessage e) {
                log4j.error(method + " - Program_GetEventDetail_ValidationFaultFault_FaultMessage getting eventId = "+eventId+" - "+e.getMessage(),e);
            } catch (Program_GetEventDetail_ToteFaultFault_FaultMessage e) {
                log4j.error(method + " - Program_GetEventDetail_ToteFaultFault_FaultMessage getting eventId = "+eventId+" - "+e.getMessage(),e);
            } catch (AxisFault e) {
                log4j.error(method + " - AxisFault getting eventId = "+eventId+" - "+e.getMessage(),e);
            } catch (Exception e) {
                log4j.error(method + " - General exception getting eventId = "+eventId+" - "+e.getMessage(),e);
            }

            -- tryAgain;
            if (0 != tryAgain) {
                log4j.debug("{} - Could not get event, waiting 5 seconds and then trying {} more times", method, tryAgain);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    log4j.error(method + " - Received InterruptedException while waiting to retry getting event details - "+e.getMessage(),e);
                }
            }

        }

        if ((null != eResponse) && eResponse.isEventsResponseSpecified()) {

            // Get the response
            eventsResponse = eResponse.getEventsResponse();

            // Debug for the race response header
            log4j.debug("{} eventId = {}", method, eventId);
            log4j.debug("\tItems with an \"(*)\" are optional.");
            LogHelper.debugOut(log4j, "\tGroup Id(*): ", eventsResponse.isGroupIdSpecified(), eventsResponse.getGroupId());
            LogHelper.debugOut(log4j, "\tRun Id(*): ", eventsResponse.isRunIdSpecified(), eventsResponse.getRunId());
            log4j.debug("\tSource (Source Id/System Id): {}/{}", eventsResponse.getSource().getSourceId(), eventsResponse.getSource().getSystemId());
            LogHelper.debugOut(log4j, eventsResponse.isErrorSpecified(), "\t", eventsResponse.getError());

            // Persist each of the returned event details
            log4j.debug("{} - About to persiste eventsResponse", method);
            utoteEvent = persistEvent(eventsResponse.getEventDetail(), false /* Shallow */);
            log4j.debug("{} - Event persisted. eventId = {}", method, utoteEvent.getEventId());

            // Log the response
            responseLogId = (new UtoteRequestResponseLogger()).saveGetEventDetailResponse(requestLogId, eResponse, utoteEvent.getIdUtoteEvent());
            log4j.debug("{} - eventId = {}, responseLogId = {}, utoteEvent.idUtoteEvent = {}", method, eventId, responseLogId, utoteEvent.getIdUtoteEvent());

            // GetEventDetail returned, but was missing the RaceResposne
        } else if (null != eResponse) {
            responseLogId = (new UtoteRequestResponseLogger()).saveGetEventDetailResponse(requestLogId, eResponse, null);
            log4j.debug("{} - eventId = {}, responseLogId = {}", method, eventId, responseLogId);

            // Null response from GetRace call
        } else {
            log4j.error("{} - No response from the GetEventDetail call for eventId = {}.", method, eventId);
        }

        log4j.exit(method);
        return utoteEvent;
    }

    public static UtoteEvent getEventDetails(String eventId) {
        String method = "getEventDetails";
        log4j.entry(method + " - eventId="+eventId);

        UtoteEvent utoteEvent = new UtoteEvent();
        GetEventDetailResponse eResponse = null;
        ProgramServiceStub.EventDetailResponse eventsResponse = null;
        int requestLogId = 0;
        int responseLogId = 0;
        int tryAgain = 3;

        while (tryAgain > 0) {

            // Make call to GetEvents
            try {

                // Setup call
                log4j.debug("{} - Settting up GetEventDetail call for eventId = {}", method, eventId);
                ProgramServiceStub stub = new ProgramServiceStub();
                ProgramServiceStub.GetEventDetail getEventDetailInput = new ProgramServiceStub.GetEventDetail();
                ProgramServiceStub.EventDetailRequest eRequest = new ProgramServiceStub.EventDetailRequest();
                eRequest.setSource(getSource());
                eRequest.setEventId(eventId);
                if (Configurator.getUtoteRacesData()) {
                    eRequest.setRaces(true);
                }
                if (Configurator.getUtoteProgramData()) {
                    eRequest.setProgram(true);
                }
                if (Configurator.getUtotePoolData()) {
                    eRequest.setPools(true);
                }
                if (Configurator.getUtoteRunnersData()) {
                    eRequest.setRunners(true);
                }
                getEventDetailInput.setEventsRequest(eRequest);
                log4j.trace("{} - eRequest={}", method, eRequest.toString());
                log4j.trace("{} - getEventsInput={}", method, getEventDetailInput.toString());

                // Log the request
                log4j.debug("{} - Saving GetEventDetail request for eventId = {}", method, eventId);
                requestLogId = (new UtoteRequestResponseLogger()).saveGetEventDetailRequest(getEventDetailInput);

                // Make the call
                log4j.debug("{} - Making GetEventDetail call for eventId = {}", method, eventId);
                eResponse = stub.getEventDetail(getEventDetailInput);

                // Make sure we got a response
                if (null == eResponse) {
                    log4j.error("{} - Null response returned from GetEventDetail request for eventId = {}.", method, eventId);
                }

                tryAgain = 1;

            } catch (Program_GetEventDetail_ValidationFaultFault_FaultMessage e) {
                log4j.error(method + " - Program_GetEventDetail_ValidationFaultFault_FaultMessage getting eventId = "+eventId+" - "+e.getMessage(),e);
            } catch (Program_GetEventDetail_ToteFaultFault_FaultMessage e) {
                log4j.error(method + " - Program_GetEventDetail_ToteFaultFault_FaultMessage getting eventId = "+eventId+" - "+e.getMessage(),e);
            } catch (AxisFault e) {
                log4j.error(method + " - AxisFault getting eventId = "+eventId+" - "+e.getMessage(),e);
            } catch (Exception e) {
                log4j.error(method + " - General exception getting eventId = "+eventId+" - "+e.getMessage(),e);
            }

            -- tryAgain;
            if (0 != tryAgain) {
                log4j.debug("{} - Could not get event details, waiting 5 seconds and then trying {} more times", method, tryAgain);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    log4j.error(method + " - Received InterruptedException while waiting to retry getting event details - "+e.getMessage(),e);
                }
            }

        }

        if ((null != eResponse) && eResponse.isEventsResponseSpecified()) {

            // Get the response
            eventsResponse = eResponse.getEventsResponse();

            // Debug for the race response header
            log4j.debug("{} eventId = {}", method, eventId);
            log4j.debug("\tItems with an \"(*)\" are optional.");
            LogHelper.debugOut(log4j, "\tGroup Id(*): ", eventsResponse.isGroupIdSpecified(), eventsResponse.getGroupId());
            LogHelper.debugOut(log4j, "\tRun Id(*): ", eventsResponse.isRunIdSpecified(), eventsResponse.getRunId());
            log4j.debug("\tSource (Source Id/System Id): {}/{}", eventsResponse.getSource().getSourceId(), eventsResponse.getSource().getSystemId());
            LogHelper.debugOut(log4j, eventsResponse.isErrorSpecified(), "\t", eventsResponse.getError());

            // Persist each of the returned event details
            log4j.debug("{} - About to persiste eventsResponse", method);
            utoteEvent = persistEvent(eventsResponse.getEventDetail(), true /* Deep */);
            log4j.debug("{} - Event persisted. eventId = {}", method, utoteEvent.getEventId());

            // Log the response
            responseLogId = (new UtoteRequestResponseLogger()).saveGetEventDetailResponse(requestLogId, eResponse, utoteEvent.getIdUtoteEvent());
            log4j.debug("{} - eventId = {}, responseLogId = {}, utoteEvent.idUtoteEvent = {}", method, eventId, responseLogId, utoteEvent.getIdUtoteEvent());

            // GetEventDetail returned, but was missing the RaceResposne
        } else if (null != eResponse) {
            responseLogId = (new UtoteRequestResponseLogger()).saveGetEventDetailResponse(requestLogId, eResponse, null);
            log4j.debug("{} - eventId = {}, responseLogId = {}", method, eventId, responseLogId);

            // Null response from GetRace call
        } else {
            log4j.error("{} - No response from the GetEventDetail call for eventId = {}.", method, eventId);
        }

        log4j.exit(method);
        return utoteEvent;
    }

    public static ProgramServiceStub.Event getEventDetailsRaw(String eventId) {
        log4j.entry("getEventDetailsRaw - eventId",eventId);

        UtoteEvent utoteEvent = new UtoteEvent();
        GetEventDetailResponse eResponse = null;
        ProgramServiceStub.EventDetailResponse eventsResponse = null;
        int requestLogId = 0;
        int responseLogId = 0;

        // Make call to GetEvents
        try {

            // Setup call
            log4j.debug("getEventDetailsRaw - Settting up GetEventDetail call for eventId = {}", eventId);
            ProgramServiceStub stub = new ProgramServiceStub();
            ProgramServiceStub.GetEventDetail getEventDetailInput = new ProgramServiceStub.GetEventDetail();
            ProgramServiceStub.EventDetailRequest eRequest = new ProgramServiceStub.EventDetailRequest();
            eRequest.setSource(getSource());
            eRequest.setEventId(eventId);
            if (Configurator.getUtoteRacesData()) {
                eRequest.setRaces(true);
            }
            if (Configurator.getUtoteProgramData()) {
                eRequest.setProgram(true);
            }
            if (Configurator.getUtotePoolData()) {
                eRequest.setPools(true);
            }
            if (Configurator.getUtoteRunnersData()) {
                eRequest.setRunners(true);
            }
            getEventDetailInput.setEventsRequest(eRequest);
            log4j.trace("getEventDetailsRaw - eRequest={}",eRequest.toString());
            log4j.trace("getEventDetailsRaw - getEventsInput={}",getEventDetailInput.toString());

            // Log the request
            log4j.debug("getEventDetailsRaw - Saving GetEventDetail request for eventId = {}", eventId);
            requestLogId = (new UtoteRequestResponseLogger()).saveGetEventDetailRequest(getEventDetailInput);

            // Make the call
            log4j.debug("getEventDetailsRaw - Making GetEventDetail call for eventId = {}", eventId);
            eResponse = stub.getEventDetail(getEventDetailInput);

            // Make sure we got a response
            if (null == eResponse) {
                log4j.error("getEventDetailsRaw - Null response returned from GetEventDetail request for eventId = {}.", eventId);
            }


        } catch (Program_GetEventDetail_ValidationFaultFault_FaultMessage e) {
            log4j.error("getEventDetailsRaw - Program_GetEventDetail_ValidationFaultFault_FaultMessage getting eventId = "+eventId+" - "+e.getMessage(),e);
        } catch (Program_GetEventDetail_ToteFaultFault_FaultMessage e) {
            log4j.error("getEventDetailsRaw - Program_GetEventDetail_ToteFaultFault_FaultMessage getting eventId = "+eventId+" - "+e.getMessage(),e);
        } catch (AxisFault e) {
            log4j.error("getEventDetailsRaw - AxisFault getting eventId = "+eventId+" - "+e.getMessage(),e);
        } catch (Exception e) {
            log4j.error("getEventDetailsRaw - General exception getting eventId = "+eventId+" - "+e.getMessage(),e);
        }

        if ((null != eResponse) && eResponse.isEventsResponseSpecified()) {

            // Get the response
            eventsResponse = eResponse.getEventsResponse();

            // Debug for the race response header
            log4j.debug("getEventDetailsRaw eventId = "+eventId+"  - eventsResponse:");
            log4j.debug("\tItems with an \"(*)\" are optional.");
            LogHelper.debugOut(log4j, "\tGroup Id(*): ", eventsResponse.isGroupIdSpecified(), eventsResponse.getGroupId());
            LogHelper.debugOut(log4j, "\tRun Id(*): ", eventsResponse.isRunIdSpecified(), eventsResponse.getRunId());
            log4j.debug("\tSource (Source Id/System Id): {}/{}", eventsResponse.getSource().getSourceId(), eventsResponse.getSource().getSystemId());
            LogHelper.debugOut(log4j, eventsResponse.isErrorSpecified(), "\t", eventsResponse.getError());

            // Persist each of the returned event details
            log4j.debug("getEventDetailsRaw - About to persiste eventsResponse");
            utoteEvent = persistEvent(eventsResponse.getEventDetail(), true /* deep */);
            log4j.debug("getEventDetailsRaw - Event persisted. eventId = {}", utoteEvent.getEventId());

            // Log the response
            responseLogId = (new UtoteRequestResponseLogger()).saveGetEventDetailResponse(requestLogId, eResponse, utoteEvent.getIdUtoteEvent());
            log4j.debug("getEventDetailsRaw - eventId = {}, responseLogId = {}, utoteEvent.idUtoteEvent = {}",eventId, responseLogId, utoteEvent.getIdUtoteEvent());

            // GetEventDetail returned, but was missing the RaceResposne
        } else if (null != eResponse) {
            responseLogId = (new UtoteRequestResponseLogger()).saveGetEventDetailResponse(requestLogId, eResponse, null);
            log4j.debug("getEventDetailsRaw - eventId = {}, responseLogId = {}",eventId, responseLogId);

            // Null response from GetRace call
        } else {
            log4j.error("getEventDetailsRaw - No response from the GetEventDetail call for eventId = {}.", eventId);
        }

        log4j.exit("getEventDetailsRaw");
        return eventsResponse.getEventDetail();
    }

    public static void testgetEvents() throws java.lang.Exception {

        ProgramServiceStub stub = new ProgramServiceStub();

        ProgramServiceStub.GetEvents getEvents22 = new ProgramServiceStub.GetEvents();

        ProgramServiceStub.EventsRequest request = new ProgramServiceStub.EventsRequest();
        request.setSource(getSource());
        request.setRaces(true);
        getEvents22.setEventsRequest(request);

        ProgramServiceStub.GetEventsResponse result =
                stub.getEvents(getEvents22);

        log4j.debug("testgetEvents - result=" + (result.isEventsResponseSpecified()?"Available":"<Not Specified>"));
        ProgramServiceStub.EventsResponse eventsResponse = result.getEventsResponse();

        log4j.debug("START OF eventsResponse:");
        log4j.debug("\tItems with an \"(*)\" are optional.");
        LogHelper.debugOut(log4j, "\tGroup Id(*): ", eventsResponse.isGroupIdSpecified(), eventsResponse.getGroupId());
        LogHelper.debugOut(log4j, "\tRun Id(*): ", eventsResponse.isRunIdSpecified(), eventsResponse.getRunId());
        log4j.debug("\tSource (Source Id/System Id): ");
        log4j.debug(eventsResponse.getSource().getSourceId() + "/" + eventsResponse.getSource().getSystemId());
        LogHelper.debugOut(log4j, eventsResponse.isErrorSpecified(), "\t", eventsResponse.getError());
        LogHelper.debugOut(log4j, "\tTournament Id(*): ", eventsResponse.isTournamentIdSpecified(), eventsResponse.getTournamentId());
        LogHelper.debugOut(log4j, "\tContest Id(*): ", eventsResponse.isContestIdSpecified(), eventsResponse.getContestId());
        LogHelper.debugEvents(log4j, eventsResponse.isEventsSpecified(), "\t", eventsResponse.getEvents());
        log4j.debug("END OF eventsResponse:");

        // Test GetEventDetail, call for each returned event
        for (ProgramServiceStub.Event e : eventsResponse.getEvents().getEvent()) {

            log4j.debug("Settting up GetEventDetail call for Event Id: " + e.getEventId());

            stub = new ProgramServiceStub();

            ProgramServiceStub.GetEventDetail getEventDetail16 = new ProgramServiceStub.GetEventDetail();

            ProgramServiceStub.EventDetailRequest edRequest = new ProgramServiceStub.EventDetailRequest();
            edRequest.setSource(getSource());
            edRequest.setEventId(e.getEventId());
            edRequest.setRaces(true);
            edRequest.setPools(false);
            edRequest.setRunners(true);
            getEventDetail16.setEventsRequest(edRequest);

            ProgramServiceStub.GetEventDetailResponse edResponse =
                    stub.getEventDetail(getEventDetail16);

            log4j.debug("eventDetailResponse:");
            log4j.debug("\tItems with an \"(*)\" are optional.");
            ProgramServiceStub.EventDetailResponse edResult = edResponse.getEventsResponse();
            LogHelper.debugOut(log4j, "\tGroup Id(*): ", edResult.isGroupIdSpecified(), edResult.getGroupId());
            LogHelper.debugOut(log4j, "\tRun Id(*): ", edResult.isRunIdSpecified(), edResult.getRunId());
            log4j.debug("\tSource (Source Id/System Id): ");
            log4j.debug(edResult.getSource().getSourceId() + "/" + edResult.getSource().getSystemId());
            LogHelper.debugOut(log4j, edResult.isErrorSpecified(), "\t", edResult.getError());
            LogHelper.debugOut(log4j, "\tTournament Id(*): ", edResult.isTournamentIdSpecified(), edResult.getTournamentId());
            LogHelper.debugOut(log4j, "\tContest Id(*): ", edResult.isContestIdSpecified(), edResult.getContestId());
            if (edResult.isEventDetailSpecified()) {
                LogHelper.debugEvent(log4j, "\t", edResult.getEventDetail());
            } else {
                log4j.debug("\tEvent Detail: <Not Specified>");
            }
        }

        // Test GetEventDetail, call for each returned event
        for (ProgramServiceStub.Event e : eventsResponse.getEvents().getEvent()) {

            log4j.debug("Settting up GetRace call for Event Id: " + e.getEventId());

            for (ProgramServiceStub.Race r : e.getRaces().getRace()) {

                log4j.debug("Settting up GetRace call for Race Id: " + r.getRaceId());

                stub = new ProgramServiceStub();

                ProgramServiceStub.GetRace getRace18 = new ProgramServiceStub.GetRace();

                ProgramServiceStub.RaceRequest rRequest = new ProgramServiceStub.RaceRequest();
                rRequest.setSource(getSource());
                rRequest.setEventId(e.getEventId());
                rRequest.setRaceId(r.getRaceId());
                rRequest.setPools(true);
                rRequest.setRunners(true);
                getRace18.setRaceRequest(rRequest);

                ProgramServiceStub.GetRaceResponse rResponse = stub
                        .getRace(getRace18);

                log4j.debug("raceResponse:");
                log4j.debug("\tItems with an \"(*)\" are optional.");
                ProgramServiceStub.RaceResponse rResult = rResponse.getRaceResponse();
                LogHelper.debugOut(log4j, "\tGroup Id(*): ", rResult.isGroupIdSpecified(), rResult.getGroupId());
                LogHelper.debugOut(log4j, "\tRun Id(*): ", rResult.isRunIdSpecified(), rResult.getRunId());
                log4j.debug("\tSource (Source Id/System Id): ");
                log4j.debug(rResult.getSource().getSourceId() + "/" + rResult.getSource().getSystemId());
                LogHelper.debugOut(log4j, rResult.isErrorSpecified(), "\t", rResult.getError());
                if (rResult.isRaceSpecified()) {
                    LogHelper.debugRace(log4j, "\t", rResult.getRace());
                } else {
                    log4j.debug("\tRace Detail: <Not Specified>");
                }

            }
        }

    }


    private static UtoteRace findRace(EntityManager em, String eventId, int raceId) {
        log4j.entry("findRace - eventId, raceId", eventId, raceId);
        UtoteRace utoteRace = null;
        TypedQuery<UtoteRace> q = em.createNamedQuery("UtoteRace.findSpecific", UtoteRace.class);
        q.setParameter("eventId", eventId);
        q.setParameter("raceId", raceId);
        try {
            utoteRace = q.getSingleResult();
        } catch (javax.persistence.NoResultException e) {
            log4j.trace("findRace - Received NoResultException looking for a Race");
        }
        if (null != utoteRace) {
            log4j.debug("Found existing race.  idUtoteRace={}, RaceId={}",utoteRace.getIdUtoteRace(), utoteRace.getRaceId());
        }
        log4j.exit("findRace");
        return utoteRace;
    }

    private static UtoteRace persistRace(String eventId, ProgramServiceStub.Race rRace, boolean deep, boolean returnAssociations) {
        log4j.entry("persistRace - eventId, raceId ", eventId, rRace.getRaceId());
        boolean newRace = false;

        // Get an Entity Manager
        final EntityManagerFactory emF = Configurator.getRWEMF();
        final EntityManager em = emF.createEntityManager();

        // See if the entity already exists
        log4j.debug("persistRace - Searching for utoteRace with raceId = {}", rRace.getRaceId());
        UtoteRace utoteRace =
                findRace(em, eventId, rRace.getRaceId());
        if (null == utoteRace) {
            log4j.debug("persistRace - utoteRace with raceId = {} not found, creating new entity", rRace.getRaceId());
            utoteRace = new UtoteRace();
            if (null != eventId) {
                utoteRace.setEventId(eventId);
            }
            newRace = true;
        } else {
            log4j.debug("persistRace - Found existing utoteRace entity with raceId = {}", rRace.getRaceId());
        }

        // Update the information in the record with what was submitted
        log4j.debug("persistRace - About to cloneRaceDetails for raceId = {}", rRace.getRaceId());
        UtoteRace clonedRace = cloneRaceDetails(utoteRace, rRace, newRace, deep, returnAssociations	);
        utoteRace = clonedRace;

        // Insert a new or update the existing UtoteRace
        // representing the contents of this message
        log4j.debug("persistRace - About to persiste utoteRace for raceId = {}", utoteRace.getRaceId());
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
            log4j.debug("persistRace - UtoteRace persisted, Entity Id: {}", idUtoteRace);
        } catch (Exception e) {
            log4j.debug("persistRace - Exception commiting after em.persist: "+e.getMessage(),e);
        }

        // Close the connections
        try {
            em.close();
            emF.close();
        } catch (Exception e) {
            log4j.debug("persistRace - Exception trying em.close(): "+e.getMessage(),e);
        }

        log4j.exit("persistRace");
        return utoteRace;

    }

    public static UtoteRace getRace(String eventId, int raceId) {
        log4j.entry("getRace - eventId, raceId", eventId, raceId);

        UtoteRace utoteRace = new UtoteRace();
        ProgramServiceStub.GetRaceResponse rResponse = null;
        ProgramServiceStub.RaceResponse raceResponse = null;
        int requestLogId = 0;
        int responseLogId = 0;

        // Make call to GetRace
        try {

            // Setup call
            log4j.debug("getRace - Settting up GetRace call for Race Id: " + raceId);
            ProgramServiceStub stub = new ProgramServiceStub();
            ProgramServiceStub.GetRace getRaceInput = new ProgramServiceStub.GetRace();
            ProgramServiceStub.RaceRequest rRequest = new ProgramServiceStub.RaceRequest();
            rRequest.setSource(getSource());
            rRequest.setEventId(eventId);
            rRequest.setRaceId(raceId);
            getRaceInput.setRaceRequest(rRequest);
            log4j.trace("getRace - rRequest={}",rRequest.toString());
            log4j.trace("getRace - getRace={}",getRaceInput.toString());

            // Log the request
            requestLogId = (new UtoteRequestResponseLogger()).saveGetRaceRequest(getRaceInput);

            // Make the call
            log4j.debug("getRace - Making GetRace call for Race Id: " + raceId);
            rResponse = stub.getRace(getRaceInput);

            // Make sure we got a response
            if (null == rResponse) {
                log4j.error("getRace - Null response returned from GetRace request.");
            }


        } catch (Program_GetRace_ValidationFaultFault_FaultMessage e) {
            log4j.error("getRace - Program_GetRace_ValidationFaultFault_FaultMessage getting race details - "+e.getMessage(),e);
        } catch (Program_GetRace_ToteFaultFault_FaultMessage e) {
            log4j.error("getRace - Program_GetRace_ToteFaultFault_FaultMessage getting race details - "+e.getMessage(),e);
        } catch (AxisFault e) {
            log4j.error("getRace - AxisFault getting race details - "+e.getMessage(),e);
        } catch (Exception e) {
            log4j.error("getRace - General exception getting race details - "+e.getMessage(),e);
        }

        if ((null != rResponse) && rResponse.isRaceResponseSpecified()) {

            // Get the response
            raceResponse = rResponse.getRaceResponse();

            // Debug for the race response header
            log4j.debug("getRace - raceResponse:");
            log4j.debug("\tItems with an \"(*)\" are optional.");
            LogHelper.debugOut(log4j, "\tGroup Id(*): ", raceResponse.isGroupIdSpecified(), raceResponse.getGroupId());
            LogHelper.debugOut(log4j, "\tRun Id(*): ", raceResponse.isRunIdSpecified(), raceResponse.getRunId());
            log4j.debug("\tSource (Source Id/System Id): {}/{}", raceResponse.getSource().getSourceId(), raceResponse.getSource().getSystemId());
            LogHelper.debugOut(log4j, raceResponse.isErrorSpecified(), "\t", raceResponse.getError());

            // If Event ID returned, use with Race
            // otherwise, use the Event ID associated with the Update
            if (raceResponse.isEventIdSpecified()) {
                eventId = raceResponse.getEventId();
            }

            // Add in the race details if specified
            if (raceResponse.isRaceSpecified()) {

                ProgramServiceStub.Race rRace = raceResponse.getRace();
                log4j.debug("\tProgramServiceStub.Race rRace.raceId = {}",rRace.getRaceId());

                utoteRace = persistRace(eventId, rRace, false /* not deep */, false /* do not return associations */);
                log4j.debug("getRace - ProgramServiceStub.Race After persistRace().  idUtoteRace = {}",utoteRace.getIdUtoteRace());

            } else {
                utoteRace.setEventId(eventId);
                utoteRace.setRaceId(raceId);
                log4j.debug("getRace - Race Detail: <Not Specified>");
            }

            // Log the response
            responseLogId = (new UtoteRequestResponseLogger()).saveGetRaceResponse(requestLogId, rResponse, Integer.valueOf(utoteRace.getIdUtoteRace()));

            // GetRace returned, but was missing the RaceResposne
        } else if (null != rResponse) {
            responseLogId = (new UtoteRequestResponseLogger()).saveGetRaceResponse(requestLogId, rResponse, null);
            log4j.debug("getRace - responseLogId = {}",responseLogId);

            // Null response from GetRace call
        } else {
            log4j.error("getRace - No race response was returned for Event Id={} and Race Id={}", eventId, raceId);
        }

        log4j.exit("getRace");
        return utoteRace;
    }

    public static UtoteRace getRaceDetails(String eventId, int raceId) {
        String method = "getRaceDetails";
        log4j.entry(method + " - eventId, raceId", eventId, raceId);

        UtoteRace utoteRace = null;
        ProgramServiceStub.GetRaceResponse rResponse = null;
        ProgramServiceStub.RaceResponse raceResponse = null;
        int requestLogId = 0;
        int responseLogId = 0;
        int tryAgain = 3;

        while (tryAgain > 0) {

            // Make call to GetRace
            try {

                // Setup call
                log4j.debug("{} - Settting up GetRace call for Race Id={}", method, raceId);
                ProgramServiceStub stub = new ProgramServiceStub();
                ProgramServiceStub.GetRace getRaceInput = new ProgramServiceStub.GetRace();
                ProgramServiceStub.RaceRequest rRequest = new ProgramServiceStub.RaceRequest();
                rRequest.setSource(getSource());
                rRequest.setEventId(eventId);
                rRequest.setRaceId(raceId);
                if (Configurator.getUtoteProgramData()) {
                    rRequest.setProgram(true);
                }
                if (Configurator.getUtotePoolData()) {
                    rRequest.setPools(true);
                }
                if (Configurator.getUtoteRunnersData()) {
                    rRequest.setRunners(true);
                }
                getRaceInput.setRaceRequest(rRequest);
                log4j.trace("{} - rRequest={}", method, rRequest.toString());
                log4j.trace("{} - getRace={}", method, getRaceInput.toString());

                // Log the request
                requestLogId = (new UtoteRequestResponseLogger()).saveGetRaceRequest(getRaceInput);

                // Make the call
                log4j.debug("{} - Making GetRace call for raceId={}", method, raceId);
                rResponse = stub.getRace(getRaceInput);

                // Make sure we got a response
                if (null == rResponse) {
                    log4j.error("{} - Null response returned from GetRace request.", method);
                }

                tryAgain = 1;

            } catch (Program_GetRace_ValidationFaultFault_FaultMessage e) {
                log4j.error(method + " - Program_GetRace_ValidationFaultFault_FaultMessage getting race details - "+e.getMessage(),e);
            } catch (Program_GetRace_ToteFaultFault_FaultMessage e) {
                log4j.error(method + " - Program_GetRace_ToteFaultFault_FaultMessage getting race details - "+e.getMessage(),e);
            } catch (AxisFault e) {
                log4j.error(method + " - AxisFault getting race details - "+e.getMessage(),e);
            } catch (Exception e) {
                log4j.error(method + " - General exception getting race details - "+e.getMessage(),e);
            }

            -- tryAgain;
            if (0 != tryAgain) {
                log4j.debug("{} - Could not get race details, waiting 5 seconds and then trying {} more times", method, tryAgain);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    log4j.error(method + " - Received InterruptedException while waiting to retry getting race details - "+e.getMessage(),e);
                }
            }

        }

        if ((null != rResponse) && rResponse.isRaceResponseSpecified()) {

            // Get the response
            raceResponse = rResponse.getRaceResponse();

            // Debug for the race response header
            log4j.debug("{} - raceResponse:", method);
            log4j.debug("\tItems with an \"(*)\" are optional.");
            LogHelper.debugOut(log4j, "\tGroup Id(*): ", raceResponse.isGroupIdSpecified(), raceResponse.getGroupId());
            LogHelper.debugOut(log4j, "\tRun Id(*): ", raceResponse.isRunIdSpecified(), raceResponse.getRunId());
            log4j.debug("\tSource (Source Id/System Id): {}/{}", raceResponse.getSource().getSourceId(), raceResponse.getSource().getSystemId());
            LogHelper.debugOut(log4j, raceResponse.isErrorSpecified(), "\t", raceResponse.getError());

            // If Event ID returned, use with Race
            // otherwise, use the Event ID associated with the Update
            if (raceResponse.isEventIdSpecified()) {
                eventId = raceResponse.getEventId();
            }

            // Add in the race details if specified
            if (raceResponse.isRaceSpecified()) {

                ProgramServiceStub.Race rRace = raceResponse.getRace();
                log4j.debug("\tProgramServiceStub.Race rRace.raceId = {}",rRace.getRaceId());

                utoteRace = persistRace(eventId, rRace, true /* deep */, true /* return associated objects */);
                log4j.debug("{} - After persistRace().  utoteRace.idUtoteRace = {}", method, utoteRace.getIdUtoteRace());

            } else {
                log4j.error("{} - Race Detail: <Not Specified>", method);
            }

            // Log the response
            responseLogId = (new UtoteRequestResponseLogger()).saveGetRaceResponse(requestLogId, rResponse, Integer.valueOf(utoteRace.getIdUtoteRace()));

            // GetRace returned, but was missing the RaceResposne
        } else if (null != rResponse) {
            responseLogId = (new UtoteRequestResponseLogger()).saveGetRaceResponse(requestLogId, rResponse, null);
            log4j.error("{} - Received a result, but No race response was returned, responseLogId = {}", method, responseLogId);

            // Null response from GetRace call
        } else {
            log4j.error("{} - No race response was returned for Event Id={} and Race Id={}", method, eventId, raceId);
        }

        log4j.exit(method);
        return utoteRace;
    }

}
