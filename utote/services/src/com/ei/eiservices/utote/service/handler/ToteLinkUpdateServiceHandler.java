
/**
 * ToteLinkUpdateServiceHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ei.eiservices.utote.service.handler;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import javax.persistence.QueryTimeoutException;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;

import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.jaxws.ExceptionFactory;
import org.apache.axis2.util.threadpool.ThreadFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

import com.ei.eiservices.utote.Configurator;
import com.ei.eiservices.utote.client.processor.ProgramRequestProcessor;
import com.ei.eiservices.utote.controller.RaceController;
import com.ei.eiservices.utote.model.UtoteEntry;
import com.ei.eiservices.utote.model.UtoteEntryChange;
import com.ei.eiservices.utote.model.UtoteEvent;
import com.ei.eiservices.utote.model.UtoteRace;
import com.ei.eiservices.utote.model.UtoteRunner;
import com.ei.eiservices.utote.model.UtoteStatusChange;
import com.ei.eiservices.utote.model.UtoteUpdate;
import com.ei.eiservices.utote.service.totelinkupdate.ToteLinkUpdateServiceSkeletonInterface;
import com.unitedtote.schema.totelink._2008._06.pubsub.StatusChange;
import com.unitedtote.schema.totelink._2008._06.pubsub.Updates;

/**
 * ToteLinkUpdateServiceHandler java skeleton for the axisService
 */
public class ToteLinkUpdateServiceHandler implements ToteLinkUpdateServiceSkeletonInterface {

    private static final Logger log4j = LogManager.getLogger(ToteLinkUpdateServiceHandler.class.getName());

    private static final String UPDATE_TYPE_EVENT = "Event";
    private static final String UPDATE_TYPE_RACE = "Race";
    private static final String UPDATE_TYPE_ODDS = "Odds";
    private static final String UPDATE_TYPE_SOURCE = "Source";
    private static final String UPDATE_TYPE_BROADCAST = "Broadcast";

    // Race/terminal is open for wagering
    static final String STATUS_CHANGE_ACTION_OPEN = "open";
    // Race/terminal is closed for wagering
    static final String STATUS_CHANGE_ACTION_CLOSED = "closed";
    // Terminal is deactivated
    static final String STATUS_CHANGE_ACTION_DEACTIVATE = "deactivate";
    // System is initialized
    static final String STATUS_CHANGE_ACTION_INITIALIZE = "initialize";
    // System is starting
    static final String STATUS_CHANGE_ACTION_START = "start";
    // System is cleaning up
    static final String STATUS_CHANGE_ACTION_END = "end";
    // System is terminating
    static final String STATUS_CHANGE_ACTION_STOP = "stop";
    // Reset or initiate MTP for Race or terminal is reset
    static final String STATUS_CHANGE_ACTION_RESET = "reset";
    // Event added
    static final String STATUS_CHANGE_ACTION_ADD = "add";
    // Event is done
    static final String STATUS_CHANGE_ACTION_DONE = "done";
    // Race is open for wagering, and is the current race
    static final String STATUS_CHANGE_ACTION_BEGIN = "begin";
    // Race is post, no new wagers accepted
    static final String STATUS_CHANGE_ACTION_POST = "post";
    // Race is locked, no cancels accepted
    static final String STATUS_CHANGE_ACTION_LOCKED = "locked";
    // Race is not official and no cashing allowed
    static final String STATUS_CHANGE_ACTION_UNOFFICIAL = "unofficial";
    // Race is final, prices are available
    static final String STATUS_CHANGE_ACTION_FINAL = "final";
    // Race is cancelled and closed to wagering
    static final String STATUS_CHANGE_ACTION_CANCELLED = "cancelled";
    // Race is uncancelled and may be open for wagering
    static final String STATUS_CHANGE_ACTION_UNCANCEL = "uncancel";
    // Every xx second to keep the communication alive if there is no activity within that timeframe
    static final String STATUS_CHANGE_ACTION_KEEPALIVE = "keepalive";

    // Used to keep track of the current run identifier as sent by United Tote
    private static volatile int _lastRunId = 0;
    private static final Object _lastRunIdMonitor = new Object();

    // Link state
    private static volatile boolean _linkIsUp = false;
    private static final Object _linkIsUpMonitor = new Object();

    // Tote state
    private static volatile boolean _toteHasStarted = false;
    private static final Object _toteHasStartedMonitor = new Object();

    // Message queue management
    private static volatile Map<String, ArrayDeque<Object>> _eventRaceQueueMap = new HashMap<String, ArrayDeque<Object>>();
    private static volatile Map<String, ExecutorService> _statusWorkerMap = new HashMap<String, ExecutorService>();
    private static final Object _eventRaceQueueMapMonitor = new Object();

    /**
     * Updates the last run id value
     */
    public static void setLastRunId(int newRunId) {
        synchronized (_lastRunIdMonitor) {
            _lastRunId = newRunId;
            _lastRunIdMonitor.notifyAll(); // unlock again
        }
    }

    public static int getLastRunId() {
        return _lastRunId;
    }

    public static void setLinkState(boolean newState) {
        synchronized (_linkIsUpMonitor) {
            _linkIsUp = newState;
            _linkIsUpMonitor.notifyAll(); // unlock again
        }
    }

    public static boolean linkIsUp() {
        return _linkIsUp;
    }

    public static void setToteStartState(boolean newState) {
        synchronized (_toteHasStartedMonitor) {
            _toteHasStarted = newState;
            _toteHasStartedMonitor.notifyAll(); // unlock again
        }
    }

    public static boolean toteHasStarted() {
        return _toteHasStarted;
    }

    private void addRaceStatusMessageToQueue(StatusChange statusChange) {
        ArrayDeque<Object> q = null;
        synchronized (_eventRaceQueueMapMonitor) {
            String key = statusChange.getEventId() + "|" + statusChange.getRaceId();
            if (_eventRaceQueueMap.containsKey(key)) {
                q = _eventRaceQueueMap.get(key);
            } else {
                q = new ArrayDeque<Object>();
                _eventRaceQueueMap.put(key, q);
                ExecutorService executorService = Executors.newSingleThreadExecutor();
                executorService.execute(new RaceChangeWorkerThread(q));
                _statusWorkerMap.put(key, executorService);
            }
            _eventRaceQueueMapMonitor.notifyAll(); // unlock again
        }
        synchronized (q) {
            q.add(statusChange);
            q.notify();
        }
    }

    private void addRaceUpdateMessageToQueue(Updates updates) {
        ArrayDeque<Object> q = null;
        synchronized (_eventRaceQueueMapMonitor) {
            String key = updates.getEventId() + "|" + updates.getRaceId();
            if (_eventRaceQueueMap.containsKey(key)) {
                q = _eventRaceQueueMap.get(key);
            } else {
                q = new ArrayDeque<Object>();
                _eventRaceQueueMap.put(key, q);
                ExecutorService executorService = Executors.newSingleThreadExecutor();
                executorService.execute(new RaceChangeWorkerThread(q));
                _statusWorkerMap.put(key, executorService);
            }
            _eventRaceQueueMapMonitor.notifyAll(); // unlock again
        }
        synchronized (q) {
            q.add(updates);
            q.notify();
        }
    }

    private void shutdownAndAwaitTermination() {
        String method = "shutdownAndAwaitTermination";
        log4j.entry(method);
        synchronized (_eventRaceQueueMapMonitor) {
            _statusWorkerMap.values().forEach((pool) -> {
                pool.shutdown(); // Disable new tasks from being submitted
                try {
                    // Wait a while for existing tasks to terminate
                    if (!pool.awaitTermination(60, TimeUnit.SECONDS)) {
                        pool.shutdownNow(); // Cancel currently executing tasks
                        // Wait a while for tasks to respond to being cancelled
                        if (!pool.awaitTermination(60, TimeUnit.SECONDS)) {
                            log4j.error("shutdownAndAwaitTermination - Pool did not terminate");
                        } else {
                            log4j.debug("shutdownAndAwaitTermination - Pool terminated");
                        }
                    }
                } catch (InterruptedException ie) {
                    // (Re-)Cancel if current thread also interrupted
                    pool.shutdownNow();
                    // Preserve interrupt status
                    Thread.currentThread().interrupt();
                }
            });
            _statusWorkerMap.clear();
            // Clear any message queues that have not completed processing
            _eventRaceQueueMap.values().forEach((adsc) -> {
                synchronized (adsc) {
                    log4j.debug("shutdownAndAwaitTermination - clearing a queue - size={}",adsc.size());
                    adsc.clear();
                    adsc.notify();
                }

            });
            _eventRaceQueueMap.clear();
            _eventRaceQueueMapMonitor.notifyAll(); // unlock again
        }
        log4j.exit(method);
    }

    public static int getMaxRunId() {
        String method = "getMaxRunId";
        log4j.entry(method);

        // Get an Entity Manager
        final EntityManagerFactory emF = Configurator.getROEMF();
        final EntityManager em = emF.createEntityManager();

        // Get largest RunId from updates
        TypedQuery<Integer> q = em.createQuery("select max(u.runId) from UtoteUpdate u", Integer.class);
        Integer result = q.getSingleResult();
        int uRunId = 0;
        if (null != result) {
            uRunId = result.intValue();
        }
        log4j.debug("{} - uRunId = {}", method, uRunId);

        // Get largest RunId from status changes
        q = em.createQuery("select max(s.runId) from UtoteStatusChange s", Integer.class);
        result = q.getSingleResult();
        int sRunId = 0;
        if (null != result) {
            sRunId = result.intValue();
        }
        log4j.debug("{} - sRunId={}", method, sRunId);

        em.close();
        emF.close();

        // Determine and return the maximum
        int maxRunId = (sRunId > uRunId) ? sRunId : uRunId;
        if (!log4j.isTraceEnabled()) {
            log4j.debug("{} - maxRunId={}", method, maxRunId);
        }

        log4j.exit(method + " - maxRunId=" + maxRunId);
        return maxRunId;
    }

    private void updateRunId(int newRunId) {
        // Make sure runId has not changed
        // If so, re-perform initialization
        if (newRunId > _lastRunId) {
            synchronized (_lastRunIdMonitor) {
                _lastRunId = newRunId;
                _lastRunIdMonitor.notifyAll(); // unlock again
            }
            // Re-initialize the United Tote interface
            log4j.warn(
                    "updateRunId - *** New RunId Detected and set, now performing re-initialization. *** lastRunId={}, newRunId={}",
                    _lastRunId, newRunId);
            ToteLinkInitializationServiceHandler.performInitialization();
        }
    }

    private void updateRunId(String newRunId) {
        updateRunId(Integer.parseInt(newRunId));
    }

    private class UpdateFlag {
        private boolean updated = false;
        public UpdateFlag() {}
        public void setUpdated(boolean flag) { this.updated = flag; }
        public boolean wasUpdated() { return this.updated; }
    }

    private boolean updateRace(String callingMethod, String updateReason, String eventId, int raceId) {
        String method = "ToteLinkUpdateServiceHandler.updateRace(" + callingMethod + ")";
        log4j.entry(method);
        log4j.debug("{} - updateReason={}, eventId={}, raceId={}", method, updateReason, eventId, raceId);

        UpdateFlag performedUpdate = new UpdateFlag();

        // Get a Read-Only Entity Manager
        final EntityManagerFactory emF = Configurator.getROEMF();
        final EntityManager em = emF.createEntityManager();

        // Load the current race object
        UtoteRace curRace = UtoteRace.findSpecific(em, eventId, raceId);
        assert (null != curRace) : method + " - ******** Unable to find existing Tote Race for eventId="+eventId+", raceId="+raceId+" ********";

        log4j.debug("{} - after findSpecificRace, curRace.idUtoteRace={}, eventId={}, raceId={}", method,
                curRace.getIdUtoteRace(), (null != curRace.getEvent())?curRace.getEvent().getEventId():"NULL(curRace.getEvent() returned NULL)", raceId);

        // Make sure that this is a track type we are interested in
        if (Configurator.isSupportedTrackType(curRace.getEvent().getTrackType())) {

            // Update the race details by requesting Utote to send the most recent information about that race
            // Note, this will overwrite the details currently stored for this race
            // that is why we load the existing values above
            UtoteRace newRace = ProgramRequestProcessor.getRaceDetails(eventId, raceId);
            assert (null != newRace) : method + " - ******** Race Details not available from Tote for eventId="+eventId+", raceId="+raceId+" ********";
            log4j.debug(
                    "{} - After getRaceDetails, newRace.idUtoteRace={}, eventId={}, raceId={} newRace.getRunners().size={}",
                    method, newRace.getIdUtoteRace(), eventId, raceId,
                    (null == newRace.getRunners()) ? "null" : newRace.getRunners().size());

            // Load the race parents and embedded values.
            newRace.loadParent(em);
            newRace.load(em);
            assert (null != newRace.getEvent()) : method + " - ******** Parent Event not found after getting Race Details from Tote for eventId="+eventId+", raceId="+raceId+" ********";
            log4j.debug(
                    "{} - newRace after load after getRaceDetails, newRace.idUtoteRace={}, eventId={}, raceId={} newRace.getRunners().size()={}",
                    method, newRace.getIdUtoteRace(), newRace.getEvent().getEventId(), raceId, newRace.getRunners().size());

            // Look for changes and set flags
            boolean raceCancelled = UtoteRace.RACE_STATUS_CANCELED.equalsIgnoreCase(newRace.getRaceStatus());
            boolean statusChanged = !newRace.getRaceStatus().equalsIgnoreCase(curRace.getRaceStatus());
            boolean postTimeChanged = (0 != newRace.getPostTime().compareTo(curRace.getPostTime()));
            log4j.debug(
                    "{} - curRace.getRaceStatus()={}, newRace.getRaceStatus()={}, statusChanged={}, curRace.getPostTime()={}, " +
                            "newRace.getPostTime()={}, postTimeChanged={} for eventId={}, raceId={}, utoteRace.idUtoteRace={}",
                            method, curRace.getRaceStatus(), newRace.getRaceStatus(), statusChanged,
                            curRace.getPostTime(), newRace.getPostTime(), postTimeChanged,
                            eventId, raceId, newRace.getIdUtoteRace());

            // See if the race status or post time were changed
            if (statusChanged || postTimeChanged) {
                performedUpdate.setUpdated( RaceController.updateStatusAndPostTime(newRace, statusChanged, raceCancelled, postTimeChanged) );
            }

            // If not canceled, then check for runner changes or scratches
            if (!raceCancelled) {

                log4j.debug(
                        "{} - Race has not cancelled, new status={} for eventId={}, raceId={}, utoteRace.idUtoteRace={}",
                        method, newRace.getRaceStatus(), eventId, raceId, newRace.getIdUtoteRace());

                // Go through new runners looking for changes
                newRace.getRunners().stream()
                .forEach(newRunner -> {

                    log4j.debug("{} - Processing runner {} -  eventId={}, raceId={}, utoteRace.idUtoteRace={}",
                            method, newRunner.toString(), eventId, raceId, newRace.getIdUtoteRace());

                    // Look for matching existing runner
                    UtoteRunner curRunner = curRace.getRunners().stream().filter(aRunner -> (aRunner.getRunnerId() == newRunner.getRunnerId())).findFirst().orElse(null);

                    // If a matching runner was not found, still look to see if there are any runners to scratch
                    if (null == curRunner) {

                        log4j.debug("{} - Processing NEW (null curRunner) runner {} -  eventId={}, raceId={}, utoteRace.idUtoteRace={}",
                                method, newRunner.toString(), eventId, raceId, newRace.getIdUtoteRace());

                        // Check each entry to see if any are scratched
                        newRunner.getEntries().stream()
                        .filter(ent -> (ent.isScratch()))
                        .forEach(ent -> {
                            log4j.debug(
                                    "{} - Processing NEW (null curRunner) scratched entryId={}, RTWhorsesid={} for runnerId={} -  eventId={}, raceId={}, utoteRace.idUtoteRace={}",
                                    method, (null == ent.getEntryId()) ? "NULL" : ent.getEntryId(), ent.getRTWhorsesid(), newRunner.getRunnerId(),
                                            eventId, raceId, newRace.getIdUtoteRace());
                            performedUpdate.setUpdated( RaceController.scratchRTWRunner(newRace, newRunner, ent) );
                        });

                        // If a runner was matched/Found
                    } else {
                        log4j.debug(
                                "{} - Found existing runner {} -  eventId={}, raceId={}, utoteRace.idUtoteRace={}",
                                method, curRunner.toString(), eventId, raceId, newRace.getIdUtoteRace());

                        // Check if the new runner is scratched
                        if (newRunner.isScratched()) {

                            log4j.debug(
                                    "{} - New runner {} scratched, look for RTW horse to scratch -  eventId={}, raceId={}, utoteRace.idUtoteRace={}",
                                    method, curRunner.getRunnerId(), eventId, raceId, newRace.getIdUtoteRace());

                            // The runner, and therefore all related entries are scratched
                            newRunner.getEntries().stream()
                            .forEach(ent -> {
                                log4j.debug(
                                        "{} - Processing scratched entryId={}, RTWhorsesid={} for runnerId={} -  eventId={}, raceId={}, utoteRace.idUtoteRace={}",
                                        method, (null == ent.getEntryId()) ? "NULL" : ent.getEntryId(), ent.getRTWhorsesid(), newRunner.getRunnerId(),
                                                eventId, raceId, newRace.getIdUtoteRace());
                                performedUpdate.setUpdated( RaceController.scratchRTWRunner(newRace, newRunner, ent) );
                            });

                            // Check if the runner is now unscratched
                        } else if (!newRunner.isScratched() && curRunner.isScratched()) {

                            log4j.debug(
                                    "{} - New runner {} not scratched, exsiting runner was -  eventId={}, raceId={}, utoteRace.idUtoteRace={}",
                                    method, curRunner.getRunnerId(), eventId, raceId, newRace.getIdUtoteRace());

                            // The runner, and therefore all related entries are no longer scratched
                            newRunner.getEntries().stream()
                            .forEach(ent -> {
                                log4j.debug(
                                        "{} - \"unscratching\"  entryId={}, RTWhorsesid={} for runnerId={} -  eventId={}, raceId={}, utoteRace.idUtoteRace={}",
                                        method, (null == ent.getEntryId()) ? "NULL" : ent.getEntryId(), ent.getRTWhorsesid(), newRunner.getRunnerId(),
                                                eventId, raceId, newRace.getIdUtoteRace());
                                performedUpdate.setUpdated( RaceController.unscratchRTWRunner(newRace, newRunner, ent) );
                            });

                            // If not already scratched, check for individual entry changes
                        } else if (!newRunner.isScratched()) {

                            log4j.debug(
                                    "{} - New Runner {} is not scratched, looking for entry changes -  eventId={}, raceId={}, utoteRace.idUtoteRace={}",
                                    method, newRunner.toString(), eventId, raceId, newRace.getIdUtoteRace());

                            // Iterate through the current entries for this runner looking for entry changes (e.g. new jockey or new horse, etc.)
                            newRunner.getEntries().stream()
                            .forEach(newEntry -> {

                                log4j.debug(
                                        "{} - New Runner {} is not scratched, processing Entry={} for changes -  eventId={}, raceId={}, utoteRace.idUtoteRace={}",
                                        method, newRunner.getRunnerId(), newEntry.toString(), eventId, raceId, newRace.getIdUtoteRace());

                                // Look for the corresponding item in curEntries
                                UtoteEntry curEntry =
                                        curRunner.getEntries().stream()
                                        .filter(anEntry -> (anEntry.isSameEntry(newEntry))).findFirst().orElse(null);

                                // If no corresponding entry was found in the existing runner
                                if (null == curEntry) {

                                    log4j.debug(
                                            "{} - Could not find a matching entry in the existing runner, checking for scratches in newEntry anyway.  Entry={}, Runner={}, eventId={}, raceId={}, utoteRace.idUtoteRace={}",
                                            method, newEntry.toString(), newRunner.getRunnerId(), eventId,
                                            raceId, newRace.getIdUtoteRace());

                                    // Check for entry scratched
                                    if (newEntry.isScratch()) {
                                        log4j.debug(
                                                "{} - Corresponding entry not found, but scratching NewEntry={} Runner={} -  eventId={}, raceId={}, utoteRace.idUtoteRace={}",
                                                method, newEntry.getName(), newRunner.getRunnerId(), eventId,
                                                raceId, newRace.getIdUtoteRace());
                                        performedUpdate.setUpdated( RaceController.scratchRTWRunner(newRace, newRunner, newEntry) );
                                    }

                                } else { // If found, look for differences

                                    log4j.debug(
                                            "{} - Found a matching entry in the existing runner, checking for scratches.  Entry={}, Runner={}, eventId={}, raceId={}, utoteRace.idUtoteRace={}",
                                            method, newEntry.toString(), newRunner.getRunnerId(), eventId,
                                            raceId, newRace.getIdUtoteRace());

                                    // Check for entry scratched
                                    if (newEntry.isScratch()) {
                                        log4j.debug(
                                                "{} - Scratching curEntry={} Runner={} -  eventId={}, raceId={}, utoteRace.idUtoteRace={}",
                                                method, curEntry.getName(), newRunner.getRunnerId(), eventId,
                                                raceId, newRace.getIdUtoteRace());
                                        performedUpdate.setUpdated( RaceController.scratchRTWRunner(newRace, newRunner, newEntry) );

                                        // Check for entry scratched
                                    } else if (!newEntry.isScratch() && curEntry.isScratch()) {
                                        log4j.debug(
                                                "{} - Unscratching curEntry={} Runner={} -  eventId={}, raceId={}, utoteRace.idUtoteRace={}",
                                                method, curEntry.getName(), newRunner.getRunnerId(), eventId,
                                                raceId, newRace.getIdUtoteRace());
                                        performedUpdate.setUpdated( RaceController.unscratchRTWRunner(newRace, newRunner, newEntry) );

                                        // If the new entry has changes
                                    } else {
                                        if (!newEntry.equals(curEntry)) {
                                            log4j.debug(
                                                    "{} - New Entry and Cur Entry are not the same. New Runner={}, eventId={}, raceId={}, utoteRace.idUtoteRace={}\ncurEntry={}\nnewEntry={}",
                                                    method,  newRunner.getRunnerId(),
                                                    eventId, raceId, newRace.getIdUtoteRace(), curEntry.toString(), newEntry.toString());
                                            if (!newEntry.getJockey().trim().equalsIgnoreCase(curEntry.getJockey().trim())) {
                                                log4j.debug(
                                                        "{} - **** JOCKEY CHANGE **** - Old Value={}, New Value = {}. For new Runner={}, eventId={}, raceId={}, utoteRace.idUtoteRace={}\ncurEntry={}\nnewEntry={}",
                                                        method, curEntry.getJockey(), newEntry.getJockey(), newRunner.getRunnerId(),
                                                        eventId, raceId, newRace.getIdUtoteRace());
                                            }
                                            if (!newEntry.getMedication().trim().equalsIgnoreCase(curEntry.getMedication().trim())) {
                                                log4j.debug(
                                                        "{} - **** MEDICATION CHANGE **** - Old Value={}, New Value = {}. For new Runner={}, eventId={}, raceId={}, utoteRace.idUtoteRace={}\ncurEntry={}\nnewEntry={}",
                                                        method, curEntry.getMedication(), newEntry.getMedication(), newRunner.getRunnerId(),
                                                        eventId, raceId, newRace.getIdUtoteRace());
                                            }
                                            if (!newEntry.getName().trim().equalsIgnoreCase(curEntry.getName().trim())) {
                                                log4j.debug(
                                                        "{} - **** NAME CHANGE **** - Old Value={}, New Value = {}. For new Runner={}, eventId={}, raceId={}, utoteRace.idUtoteRace={}\ncurEntry={}\nnewEntry={}",
                                                        method, curEntry.getName(), newEntry.getName(), newRunner.getRunnerId(),
                                                        eventId, raceId, newRace.getIdUtoteRace());
                                            }
                                            if (!newEntry.getOwner().trim().equalsIgnoreCase(curEntry.getOwner().trim())) {
                                                log4j.debug(
                                                        "{} - **** OWNER CHANGE **** - Old Value={}, New Value = {}. For new Runner={}, eventId={}, raceId={}, utoteRace.idUtoteRace={}\ncurEntry={}\nnewEntry={}",
                                                        method, curEntry.getOwner(), newEntry.getOwner(), newRunner.getRunnerId(),
                                                        eventId, raceId, newRace.getIdUtoteRace());
                                            }
                                            if (!newEntry.getTrainer().trim().equalsIgnoreCase(curEntry.getTrainer().trim())) {
                                                log4j.debug(
                                                        "{} - **** TRAINER CHANGE **** - Old Value={}, New Value = {}. For new Runner={}, eventId={}, raceId={}, utoteRace.idUtoteRace={}\ncurEntry={}\nnewEntry={}",
                                                        method, curEntry.getTrainer(), newEntry.getTrainer(), newRunner.getRunnerId(),
                                                        eventId, raceId, newRace.getIdUtoteRace());
                                            }
                                        }
                                        if (newEntry.hasChanges()) {

                                            UtoteEntryChange newEC = newEntry.getEntryChange();
                                            log4j.debug(
                                                    "{} - NewEntryChanges={} \nNew Entry={}, New Runner={}, eventId={}, raceId={}, utoteRace.idUtoteRace={}",
                                                    method, newEC.toString(), newEntry.toString(), newRunner.getRunnerId(),
                                                    eventId, raceId, newRace.getIdUtoteRace());

                                            // If this is the first time there are changes, just update
                                            if (!curEntry.hasChanges()) {
                                                log4j.debug(
                                                        "{} - New Entry has changes, cur entry does not.  Entry={}, Runner={}, eventId={}, raceId={}, utoteRace.idUtoteRace={}",
                                                        method, newEntry.toString(), newRunner.getRunnerId(),
                                                        eventId, raceId, newRace.getIdUtoteRace());
                                                performedUpdate.setUpdated( RaceController.processEntryChanges(null, newEC) );

                                                // Otherwise, look to see if anything new has changed
                                            } else {

                                                UtoteEntryChange curEC = curEntry.getEntryChange();
                                                log4j.debug(
                                                        "{} - CurEntryChanges={} \nNew Entry={}, new Runner={}, eventId={}, raceId={}, utoteRace.idUtoteRace={}",
                                                        method, curEC.toString(), newEntry.toString(), newRunner.getRunnerId(),
                                                        eventId, raceId, newRace.getIdUtoteRace());

                                                // Look for any other changes
                                                if (curEC.hasDifferences(newEC)) {
                                                    log4j.debug(
                                                            "{} - New Entry has changes, cur entry already had changes.  Entry={}, Runner={}, eventId={}, raceId={}, utoteRace.idUtoteRace={}",
                                                            method, newEntry.toString(), newRunner.getRunnerId(),
                                                            eventId, raceId, newRace.getIdUtoteRace());
                                                    performedUpdate.setUpdated( RaceController.processEntryChanges(curEC, newEC) );
                                                }

                                            }
                                        }
                                    }

                                }

                            }); /* forEach */
                        }
                    }

                });

            } else {
                log4j.warn("{} - Ignoring track type ({}) for eventId={}, raceId={}, utoteRace.idUtoteRace={}", method,
                        curRace.getEvent().getTrackType(), eventId, raceId, curRace.getIdUtoteRace());
            }
        }
        em.close();
        emF.close();
        log4j.exit(method + " - performedUpdate.wasUpdated() = " + performedUpdate.wasUpdated());
        return performedUpdate.wasUpdated();
    }

    public UtoteRace findExistingRace(EntityManager em, UtoteEvent anEvent, int raceId) {
        String method = "findExistingRace";
        log4j.entry("{} - eventId, raceId", anEvent.getEventId(), raceId);
        TypedQuery<UtoteRace> q = em.createNamedQuery("UtoteRace.findSpecific", UtoteRace.class);
        q.setParameter("eventId", anEvent.getEventId());
        q.setParameter("raceId", raceId);
        UtoteRace utoteRace = null;
        try {
            utoteRace = q.getSingleResult();
            utoteRace.load(em, anEvent);
        } catch (javax.persistence.NoResultException nre) {
            log4j.trace("{} - Received NoResultException looking for a UtoteRace", method);
        } catch (Exception e) {
            log4j.error("{} - Received Exception looking for an UtoteRace. Msg={}.\nException={}", method, e.getMessage(), e);
        }
        log4j.debug("{} - anEvent {}", method, (null == utoteRace)?"IS NULL":"WAS FOUND");
        if (null != utoteRace) {
            log4j.debug("{} - Found existing event.  idUtoteRace={}, EventId={}, RaceId={}", method, utoteRace.getIdUtoteRace(), anEvent.getEventId(), raceId);
        }
        log4j.exit(method);
        return utoteRace;
    }

    public void loadNewRace(EntityManager em, UtoteEvent anEvent, UtoteRace aRace) {
        String method = "loadNewRace";
        log4j.entry("{} - eventId, raceId", anEvent.getEventId(), aRace.getRaceId());
        try {
            aRace.setEvent(anEvent);
            aRace.load(em, anEvent);
        } catch (Exception e) {
            log4j.error("{} - Received Exception loading details for an UtoteRace. Msg={}.\nException={}", method, e.getMessage(), e);
        }
        log4j.exit(method);
    }

    public UtoteEvent findExistingEvent(EntityManager em, String eventId) {
        String method = "findExistingEvent";
        log4j.entry("{} - eventId", eventId);
        TypedQuery<UtoteEvent> q = em.createNamedQuery("UtoteEvent.findByEventId", UtoteEvent.class);
        q.setParameter("eventId", eventId);
        UtoteEvent utoteEvent = null;
        try {
            utoteEvent = q.getSingleResult();
            utoteEvent.setTransients();
        } catch (javax.persistence.NoResultException nre) {
            log4j.trace("{} - Received NoResultException looking for an event", method);
        } catch (Exception e) {
            log4j.error("{} - Received Exception looking for an event. Msg={}.\nException={}", method, e.getMessage(), e);
        }
        log4j.debug("{} - anEvent {}", method, (null == utoteEvent)?"IS NULL":"WAS FOUND");
        if (null != utoteEvent) {
            log4j.debug("{} - Found existing event.  idUtoteEvent={}, RunId={}, EventId={}", method, utoteEvent.getRunId(), utoteEvent.getIdUtoteEvent(), eventId);
        }
        log4j.exit(method);
        return utoteEvent;
    }


    private class RaceChangeWorkerThread implements Runnable {

        private ArrayDeque<Object> _raceChangeQueue = null;
        private StatusChange _statusChange = null;
        private Updates _update = null;

        public RaceChangeWorkerThread(ArrayDeque<Object> raceChangeQueue) {
            this._raceChangeQueue = raceChangeQueue;
        }

        private void processUpdateRace() {
            String method = "RaceChangeWorkerThread.processUpdateRace";
            log4j.entry(method);
            if (updateRace(method, _update.getType(), _update.getEventId(), _update.getRaceId())) {
                log4j.info("{} - eventId={}, raceId={}, data={}, Track={}, Post={}", method, _update.getEventId(),
                        _update.getRaceId(), (_update.isDataSpecified()) ? _update.getData() : "Not Specified",
                                (_update.isTrackSpecified()) ? _update.getTrack() : "Not Specified", (_update.isPostSpecified())
                                        ? (_update.getPost() ? "At Post" : "Not at Post") : "Not Specified");
            }
            log4j.exit(method);
        }

        private String getUltimateStatus(String defaultStatus) {
            String outStatus = defaultStatus;
            switch (this._statusChange.getStatus()) {
            case "open":
                outStatus = UtoteRace.RACE_STATUS_OPEN;
                break;
            case "closed":
                outStatus = UtoteRace.RACE_STATUS_CLOSED;
                break;
            case "final":
                outStatus = UtoteRace.RACE_STATUS_FINAL;
                break;
            case "post":
                outStatus = UtoteRace.RACE_STATUS_POST;
                break;
            case "cancelled":
                outStatus = UtoteRace.RACE_STATUS_CANCELED;
                break;
            }
            return outStatus;
        }

        private UtoteRace updateRaceStatus(String method, String status) {
            log4j.entry("updateRaceStatus for " + method);
            final EntityManagerFactory emF = Configurator.getRWEMF();
            final EntityManager em = emF.createEntityManager();
            UtoteRace theRace = null;
            try {
                // Get the race
                TypedQuery<UtoteRace> q = em.createNamedQuery("UtoteRace.findSpecificWithValidTrackType",
                        UtoteRace.class);
                q.setParameter("validTrackTypes", Configurator.getSupportedTrackTypes());
                q.setParameter("eventId", _statusChange.getEventId());
                q.setParameter("raceId", _statusChange.getRaceId());
                em.getTransaction().begin();
                theRace = q.getSingleResult();
                theRace.setRaceStatus(getUltimateStatus(status));
                em.merge(theRace);
                em.getTransaction().commit();
                // Now get the race's parent event
                theRace.loadParent(em);
                log4j.debug(
                        "{} - Updated Race Status for raceId={} and eventId={} in order to mark as \"{}\", Event={}",
                        method, _statusChange.getRaceId(), _statusChange.getEventId(), status,
                        theRace.getEvent().toString());
            } catch (java.lang.IllegalArgumentException e) {
                log4j.error(
                        "{} - Bad query argument trying to find Race with raceId={} and eventId={} in order to mark as \"{}\"",
                        method, _statusChange.getRaceId(), _statusChange.getEventId(), status);
            } catch (javax.persistence.NoResultException e) {
                log4j.warn(
                        "{} - Race with raceId={}, trackType={}, eventId={} was not found in order to mark as \"{}\".  Possible invalid track type.",
                        method, _statusChange.getRaceId(), theRace.getTrackType(), _statusChange.getEventId(), status);
            } catch (QueryTimeoutException e) {
                log4j.error(
                        "{} - *** Query timedout finding Race with raceId={} and eventId={} in order to mark as \"{}\"\n{}\n{}",
                        method, _statusChange.getRaceId(), _statusChange.getEventId(), status, e.getMessage(), e);
            } catch (PersistenceException e) {
                log4j.error(
                        "{} - *** Persistence Exception trying to find Race with raceId={} and eventId={} in order to mark as \"{}\"\n{}\n{}",
                        method, _statusChange.getRaceId(), _statusChange.getEventId(), status, e.getMessage(), e);
            } catch (Exception e) {
                log4j.error(
                        "{} - *** Unexpected Exception trying to find Race with raceId={} and eventId={} in order to mark as \"{}\"\n{}\n{}",
                        method, _statusChange.getRaceId(), _statusChange.getEventId(), status, e.getMessage(), e);
            } finally {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
                em.close();
                emF.close();
            }
            log4j.exit(method);
            return theRace;
        }

        // Race is open for wagering
        // Update database/storage to set Race Status to Open. (wagering
        // possible)
        private boolean processRaceOpen() {
            final String method = "processRaceOpen";
            log4j.entry(method);
            UtoteRace theRace = updateRaceStatus(method, UtoteRace.RACE_STATUS_OPEN);
            log4j.debug("{} - After updateRaceStatus - eventId={}, raceId={}", method, _statusChange.getEventId(),
                    _statusChange.getRaceId());
            if (null != theRace) {
                RaceController.updateStatusAndPostTime(theRace, true /* Update the status */, false /* not cancelled */, true /* Update post time */);
                log4j.info(
                        "{} - *** Action = Race open *** Updated Race Status and Post Time for raceId={} and eventId={} in order to mark as \"{}\", and set post time to \"{}\" for Event={}",
                        method, _statusChange.getRaceId(), _statusChange.getEventId(), UtoteRace.RACE_STATUS_OPEN,
                        (null == theRace.getPostTime()) ? "NULL" : theRace.getPostTime().toString(),
                                (null == theRace.getEvent()) ? "NULL" : theRace.getEvent().toString());
            }
            log4j.exit(method);
            return (null != theRace);
        }

        // Race is open for wagering, and is the current race
        // Indicates minutes to post has been set on this race.
        // * Update database/Storage to set race status to Open if not
        // * Wait ~5 seconds and Do GetWillpays request for any pool which is
        // now in its last leg.
        // * May be used to trigger display rotations or other custom business
        // logic
        private boolean processRaceBegin() {
            final String method = "processRaceBegin";
            log4j.entry(method);
            UtoteRace theRace = updateRaceStatus(method, UtoteRace.RACE_STATUS_OPEN);
            log4j.debug("{} - After updateRaceStatus - eventId={}, raceId={}", method, _statusChange.getEventId(),
                    _statusChange.getRaceId());
            if (null != theRace) {
                RaceController.updateStatusAndPostTime(theRace, true /* Update the status */, false /* not cancelled */, true /* Update post time */);
                log4j.info(
                        "{} - *** Action = Race begin *** Updated Race Status and Post Time for raceId={} and eventId={} in order to mark as \"{}\", and set post time to \"{}\" for Event={}",
                        method, _statusChange.getRaceId(), _statusChange.getEventId(), UtoteRace.RACE_STATUS_OPEN,
                        (null == theRace.getPostTime()) ? "NULL" : theRace.getPostTime().toString(),
                                (null == theRace.getEvent()) ? "NULL" : theRace.getEvent().toString());
            }
            log4j.exit(method);
            return (null != theRace);
        }

        // Race is post, no new wagers accepted
        // Update database/Storage to set race status to Post
        private boolean processRacePost() {
            final String method = "processRacePost";
            log4j.entry(method);
            UtoteRace theRace = updateRaceStatus(method, UtoteRace.RACE_STATUS_POST);
            log4j.debug("{} - After updateRaceStatus - eventId={}, raceId={}", method, _statusChange.getEventId(),
                    _statusChange.getRaceId());
            if (null != theRace) {
                RaceController.updateStatusAndPostTime(theRace, true /* Update the status */, false /* not cancelled */, true /* Update post time */);
                log4j.info(
                        "{} - *** Action = Race post *** Updated Race Status and Post Time for raceId={} and eventId={} in order to mark as \"{}\", and set post time to \"{}\" for Event={}",
                        method, _statusChange.getRaceId(), _statusChange.getEventId(), UtoteRace.RACE_STATUS_POST,
                        (null == theRace.getPostTime()) ? "NULL" : theRace.getPostTime().toString(),
                                (null == theRace.getEvent()) ? "NULL" : theRace.getEvent().toString());
            }
            log4j.exit(method);
            return (null != theRace);
        }

        // Race is closed for wagering
        // Update database/storage to set race status to Closed
        // (wagering not possible)
        private boolean processRaceClosed() {
            final String method = "processRaceClosed";
            log4j.entry(method);
            UtoteRace theRace = updateRaceStatus(method, UtoteRace.RACE_STATUS_CLOSED);
            log4j.debug("{} - After updateRaceStatus - eventId={}, raceId={}", method, _statusChange.getEventId(),
                    _statusChange.getRaceId());
            if (null != theRace) {
                RaceController.updateStatusAndPostTime(theRace, true /* Update the status */, false /* not cancelled */, false /* Don't update post time */);
                log4j.info(
                        "{} - *** Action = Race closed *** Updated Race Status and Post Time for raceId={} and eventId={} in order to mark as \"{}\", and set post time to \"{}\" for Event={}",
                        method, _statusChange.getRaceId(), _statusChange.getEventId(), UtoteRace.RACE_STATUS_CLOSED,
                        (null == theRace.getPostTime()) ? "NULL" : theRace.getPostTime().toString(),
                                (null == theRace.getEvent()) ? "NULL" : theRace.getEvent().toString());
            }
            log4j.exit(method);
            return (null != theRace);
        }

        // Race is locked, no cancels accepted
        // Update database/Storage to set race status to locked. (canceling not possible, wagering possible)
        // * This status is not currently transmitted to end points, please
        // see/use Post.
        private boolean processRaceLocked() {
            final String method = "processRaceLocked";
            log4j.entry(method);
            UtoteRace theRace = updateRaceStatus(method, UtoteRace.RACE_STATUS_LOCKED);
            log4j.debug("{} - After updateRaceStatus - eventId={}, raceId={}", method, _statusChange.getEventId(),
                    _statusChange.getRaceId());
            if ((null != theRace) && Configurator.isSupportedTrackType(theRace.getTrackType())) {
                RaceController.updateStatusAndPostTime(theRace, true /* Update the status */, false /* not cancelled */, false /* Don't update post time */);
                log4j.info(
                        "{} - *** Action = Race locked *** Updated Race Status and Post Time for raceId={} and eventId={} in order to mark as \"{}\", and set post time to \"{}\" for Event={}",
                        method, _statusChange.getRaceId(), _statusChange.getEventId(), UtoteRace.RACE_STATUS_LOCKED,
                        (null == theRace.getPostTime()) ? "NULL" : theRace.getPostTime().toString(),
                                (null == theRace.getEvent()) ? "NULL" : theRace.getEvent().toString());
            }
            log4j.exit(method);
            return (null != theRace);
        }

        // Race is not official and no cashing allowed
        // Update database/Storage to reset race to Final status
        // Remove all payoff data from all tickets associated with race
        private boolean processRaceUnofficial() {
            final String method = "processRaceUnofficial";
            log4j.entry(method);
            UtoteRace theRace = updateRaceStatus(method, UtoteRace.RACE_STATUS_FINAL);
            log4j.debug("{} - After updateRaceStatus - eventId={}, raceId={}", method, _statusChange.getEventId(),
                    _statusChange.getRaceId());
            if (null != theRace) {
                RaceController.updateStatusAndPostTime(theRace, true /* Update the status */, false /* not cancelled */, false /* Don't update post time */);
                log4j.info(
                        "{} - *** Action = Race unofficial *** Updated Race Status and Post Time for raceId={} and eventId={} in order to mark as \"{}\", and set post time to \"{}\" for Event={}",
                        method, _statusChange.getRaceId(), _statusChange.getEventId(), UtoteRace.RACE_STATUS_FINAL,
                        (null == theRace.getPostTime()) ? "NULL" : theRace.getPostTime().toString(),
                                (null == theRace.getEvent()) ? "NULL" : theRace.getEvent().toString());
            }
            log4j.exit(method);
            return (null != theRace);
        }

        // Race is final, prices are available
        // Update database/Storage to set race status to Final
        // (Wagering not possible)
        // Trigger GetMatrix in Prices format for all pools in this race.
        // Wait ~5 seconds and check a single ticket for payoff element.
        // - If payoff element exists InquireTicket for all outstanding/pending
        // wagers in this race.
        // - If payoff element does not exist repeat wait and try again.
        private boolean processRaceFinal() {
            final String method = "processRaceFinal";
            log4j.entry(method);
            UtoteRace theRace = updateRaceStatus(method, UtoteRace.RACE_STATUS_FINAL);
            log4j.debug("{} - After updateRaceStatus - eventId={}, raceId={}", method, _statusChange.getEventId(),
                    _statusChange.getRaceId());
            if (null != theRace) {
                try {
                    RaceController.updateStatusAndPostTime(theRace, true /* Update the status */, false /* not cancelled */, false /* Don't update post time */);
                } catch (Exception e) {
                    log4j.error(
                            "{} - *** Action = Race final *** Exception={} calling updateStatusAndPostTime for raceId={} and eventId={} in order to mark as \"{}\", and set post time to \"{}\"\nfor Event={}\n{}",
                            method, e.getMessage(), _statusChange.getRaceId(), _statusChange.getEventId(), UtoteRace.RACE_STATUS_FINAL,
                            (null == theRace.getPostTime()) ? "NULL" : theRace.getPostTime().toString(),
                                    (null == theRace.getEvent()) ? "NULL" : theRace.getEvent().toString(), e);
                    return false;
                }
                try {
                    RaceController.processRaceFinal(theRace);
                } catch (Exception e) {
                    log4j.error(
                            "{} - *** Action = Race final *** Exception={} calling updateStatusAndPostTime for raceId={} and eventId={} in order to mark as \"{}\", and set post time to \"{}\"\nfor Event={}\n{}",
                            method, e.getMessage(), _statusChange.getRaceId(), _statusChange.getEventId(), UtoteRace.RACE_STATUS_FINAL,
                            (null == theRace.getPostTime()) ? "NULL" : theRace.getPostTime().toString(),
                                    (null == theRace.getEvent()) ? "NULL" : theRace.getEvent().toString(), e);
                    return false;
                }
                log4j.info(
                        "{} - *** Action = Race final *** Updated Race Status and Post Time for raceId={} and eventId={} in order to mark as \"{}\", and set post time to \"{}\" for Event={}",
                        method, _statusChange.getRaceId(), _statusChange.getEventId(), UtoteRace.RACE_STATUS_FINAL,
                        (null == theRace.getPostTime()) ? "NULL" : theRace.getPostTime().toString(),
                                (null == theRace.getEvent()) ? "NULL" : theRace.getEvent().toString());
            } else {
                log4j.error(
                        "{} - *** Action = Race final *** updateRaceStatus returned a NULL UtoteRace for raceId={} and eventId={} in order to mark as \"{}\"",
                        method, _statusChange.getRaceId(), _statusChange.getEventId(), UtoteRace.RACE_STATUS_FINAL);
            }
            log4j.exit(method);
            return (null != theRace);
        }

        // Race is cancelled and closed to wagering
        // Update database/Storage to set race status to Cancelled
        // (wagering not possible)
        private boolean processRaceCancelled() {
            final String method = "processRaceCancelled";
            log4j.entry(method);
            UtoteRace theRace = updateRaceStatus(method, UtoteRace.RACE_STATUS_CANCELED);
            log4j.debug("{} - After updateRaceStatus - eventId={}, raceId={}", method, _statusChange.getEventId(),
                    _statusChange.getRaceId());
            if (null != theRace) {
                RaceController.updateStatus(theRace, true /* is cancelled */);
                log4j.info(
                        "{} - *** Action = Race cancelled *** Updated Race Status and Post Time for raceId={} and eventId={} in order to mark as \"{}\", and set post time to \"{}\" for Event={}",
                        method, _statusChange.getRaceId(), _statusChange.getEventId(), UtoteRace.RACE_STATUS_CANCELED,
                        (null == theRace.getPostTime()) ? "NULL" : theRace.getPostTime().toString(),
                                (null == theRace.getEvent()) ? "NULL" : theRace.getEvent().toString());
            }
            log4j.exit(method);
            return (null != theRace);
        }

        // Race is uncancelled and may be open for wagering
        // Update database/Storage to set race status to Uncancelled
        // (Wagering may be possible if followed by Open notice)
        // * For most uses this status can be ignored and simply wait on Open
        // * Some clients may wish to trigger an alert on this as it could
        // signify problems in reporting etc.
        private boolean processRaceUncancelled() {
            final String method = "processRaceUncancelled";
            log4j.entry(method);
            UtoteRace theRace = updateRaceStatus(method, UtoteRace.RACE_STATUS_UNCANCELED);
            log4j.debug("{} - After updateRaceStatus - eventId={}, raceId={}", method, _statusChange.getEventId(),
                    _statusChange.getRaceId());
            if (null != theRace) {
                RaceController.updateStatusAndPostTime(theRace, true /* Update the status */, false /* not cancelled */, true /* Update post time */);
                log4j.info(
                        "{} - *** Action = Race uncancelled *** Updated Race Status and Post Time for raceId={} and eventId={} in order to mark as \"{}\", and set post time to \"{}\" for Event={}",
                        method, _statusChange.getRaceId(), _statusChange.getEventId(), UtoteRace.RACE_STATUS_UNCANCELED,
                        (null == theRace.getPostTime()) ? "NULL" : theRace.getPostTime().toString(),
                                (null == theRace.getEvent()) ? "NULL" : theRace.getEvent().toString());
            }
            log4j.exit(method);
            return (null != theRace);
        }

        // MTP has been reset
        // If MTP – Indicates minutes to post has been manually set again, may
        // be different
        // If MTP – Do GetRace to get new posttime.
        // DO NOT USE MTP IN NOTIFICATION TO SET POST TIME!
        private boolean processRaceReset() {
            final String method = "processRaceReset";
            log4j.entry(method);
            boolean success = false;
            log4j.debug("{} - Updating (re-retrieving) Race info for eventId={}, raceId={}", method,
                    _statusChange.getEventId(), _statusChange.getRaceId());
            UtoteRace theRace = ProgramRequestProcessor.getRace(_statusChange.getEventId(), _statusChange.getRaceId());
            if (null != theRace) {
                RaceController.updateStatusAndPostTime(theRace, false /* No status change */, false /* not cancelled */, true /* Update post time */);
                log4j.info(
                        "{} - *** Action = Race reset *** Updated Race Status and Post Time for raceId={} and eventId={} in order to set post time to \"{}\" for Event={}",
                        method, _statusChange.getRaceId(), _statusChange.getEventId(),
                        (null == theRace.getPostTime()) ? "NULL" : theRace.getPostTime().toString(),
                                (null == theRace.getEvent()) ? "NULL" : theRace.getEvent().toString());
                success = true;
            } else {
                log4j.error("{} - COULD NOT UPDATE (re-retrieve) Race info for eventId={}, raceId={}", method,
                        _statusChange.getEventId(), _statusChange.getRaceId());
            }
            log4j.exit(method);
            return success;
        }

        public void processAction() {
            String method = "processAction";
            String uAction = _statusChange.getAction();
            log4j.entry(method + " - uAction", uAction);
            log4j.debug("{} - uAction={}, Status={}", method, uAction, _statusChange.getStatus());

            // Make sure that the Tote Link interface is accepting requests
            if (!linkIsUp()) {
                log4j.error(
                        "{} - *** SKIPPING ToteLink StatusChange  MESSAGE *** Received a Status Change request with a Race action, but the Tote Link interface is down.",
                        method);
                return;
            }

            // Verify that the RunId has not changed.
            // If so, then re-initialize the United Tote interface
            updateRunId(_statusChange.getRunId());

            switch (uAction) {

            case STATUS_CHANGE_ACTION_OPEN:
                // Race is open for wagering
                // Update database/storage to set Race Status to Open.
                // (wagering possible)
                processRaceOpen();
                break;

            case STATUS_CHANGE_ACTION_BEGIN:
                // Race is open for wagering, and is the current race
                // Indicates minutes to post has been set on this race.
                // * Update database/Storage to set race status to Open if not
                // * Wait ~5 seconds and Do GetWillpays request for any pool which is now in its last leg.
                // * May be used to trigger display rotations or other custom business logic
                processRaceBegin();
                break;

            case STATUS_CHANGE_ACTION_POST:
                // Race is post, no new wagers accepted
                // Update database/Storage to set race status to Post
                processRacePost();
                break;

            case STATUS_CHANGE_ACTION_CLOSED:
                // Race is closed for wagering
                // Update database/storage to set race status to Closed
                // (wagering not possible)
                processRaceClosed();
                break;

            case STATUS_CHANGE_ACTION_LOCKED:
                // Race is locked, no cancels accepted
                // Update database/Storage to set race status to locked.
                // (cancelling not possible, wagering possible)
                // * This status is not currently transmitted to end points; please see/use Post.
                processRaceLocked();
                break;

            case STATUS_CHANGE_ACTION_UNOFFICIAL:
                // Race is not official and no cashing allowed
                // Update database/Storage to reset race to Final status
                // Remove all payoff data from all tickets associated with race
                processRaceUnofficial();
                break;

            case STATUS_CHANGE_ACTION_FINAL:
                // Race is final, prices are available
                // Update database/Storage to set race status to Final
                // (Wagering not possible)
                // Trigger GetMatrix in Prices format for all pools in this race.
                // Wait ~5 seconds and check a single ticket for payoff element.
                // - If payoff element exists InquireTicket for all outstanding/pending wagers in this race.
                // - If payoff element does not exist repeat wait and try again.
                processRaceFinal();
                break;

            case STATUS_CHANGE_ACTION_CANCELLED:
                // Race is cancelled and closed to wagering
                // Update database/Storage to set race status to Cancelled
                // (wagering not possible)
                processRaceCancelled();
                break;

            case STATUS_CHANGE_ACTION_UNCANCEL:
                // Race is uncancelled and may be open for wagering
                // Update database/Storage to set race status to Uncancelled
                // (Wagering may be possible if followed by Open notice)
                // * For most uses this status can be ignored and simply wait on Open
                // * Some clients may wish to trigger an alert on this as it could signify problems in reporting etc.
                processRaceUncancelled();
                break;

            case STATUS_CHANGE_ACTION_RESET: // MTP has been reset
                // If MTP – Indicates minutes to post has been manually set again, may be different
                // If MTP – Do GetRace to get new posttime.
                // DO NOT USE MTP IN NOTIFICATION TO SET POST TIME!
                processRaceReset();
                break;

                // This should never happen
            default:
                log4j.error("{} - Unrecognized action type! uAction = {}", method, uAction);
                throw ExceptionFactory
                .makeWebServiceException(method + " - Unrecognized action type! uAction=" + uAction);

            }
            log4j.exit();
        }

        @Override
        public void run() {
            ThreadContext.put("id", "raceChange-"+UUID.randomUUID().toString()); // Add the fishtag
            while (true) {
                try {
                    this._statusChange = null;
                    this._update = null;
                    Object o = null;

                    synchronized (_raceChangeQueue) {
                        while (_raceChangeQueue.isEmpty()) {
                            _raceChangeQueue.wait();
                        }

                        // Get the next work item off of the queue
                        o = _raceChangeQueue.remove();
                    }

                    // Process the work item
                    if (o instanceof StatusChange) {
                        this._statusChange = (StatusChange)o;
                        this.processAction();
                    } else {
                        this._update = (Updates)o;
                        this.processUpdateRace();
                    }
                    ;
                } catch (InterruptedException ie) {
                    break; // Terminate
                }
            }
            ThreadContext.remove("id");
        }
    }


    private class UpdatesWorkerThread implements Runnable {

        private Updates _update = null;

        public UpdatesWorkerThread(Updates inUpdate) {
            this._update = inUpdate;
        }

        private void processUpdateEvent() {
            String method = "processUpdateEvent";
            log4j.entry(method);
            UtoteEvent utoteEvent = ProgramRequestProcessor.getEventDetails(_update.getEventId());
            log4j.info("{} - eventId={}, utoteEvent.idUtoteEvent={}", method, _update.getEventId(),
                    (null == utoteEvent) ? "NULL" : utoteEvent.getIdUtoteEvent());
            log4j.exit(method);
        }

        /**
         * "Data" - describes the broadcasted data.
         *   An "*" indicates data has multiple components
         *   Values may be: Event, Race, Track(*), Group(*), Surcharge, System, Program, Guide
         * "Section" - Describes Data, if Data has multiple components
         *   Values may be: Message, Minimum, Maximum, Restriction, Terminal, Facility, Pools, Tax, Key, Exclusion, Surcharge
         * "Group" - Group Id for Broadcast Data = "Group"
         * "Track" - Track Id for Broadcast Data = "Track" or Type = "Event"
         * "Post" - Indicates race is at Post for Type = "Race"
         * "Event Id" - ITSP Event Id for current events, otherwise system Id
         * "Race Id" - Event Race Number
         * "TrackCode" - Track Code for Broadcast Data = "Track", or Type = "Event"
         */
        private void processUpdateTypeBroadcast() {
            String method = "processUpdateTypeBroadcast ("+(_update.isEventIdSpecified() ? _update.getEventId() : "N/A")+"."+ (_update.isRaceIdSpecified() ? _update.getRaceId() : "N/A")+")";
            log4j.debug(
                    "{} - **** UPDATE TYPE=BROADCAST **** Data={}, Group={}, Track={}, Post={}, EventId={}, RaceId={}, TrackCode={}",
                    method, _update.isDataSpecified() ? _update.getData() : "N/A",
                            _update.isGroupSpecified() ? _update.getGroup() : "N/A",
                                    _update.isTrackSpecified() ? _update.getTrack() : "N/A",
                                            _update.isPostSpecified() ? _update.getPost() : "N/A",
                                                    _update.isEventIdSpecified() ? _update.getEventId() : "N/A",
                                                            _update.isRaceIdSpecified() ? _update.getRaceId() : "N/A",
                                                                    _update.isTrackCodeSpecified() ? _update.getTrackCode() : "N/A");

            final EntityManagerFactory emF = Configurator.getROEMF();
            final EntityManager em = emF.createEntityManager();

            // Is an event specified?
            if (_update.isEventIdSpecified()) {

                // Get the current version of the event
                UtoteEvent curEvent = findExistingEvent(em, _update.getEventId());
                if (null != curEvent) {
                    log4j.debug("{} - **** UPDATE TYPE=BROADCAST - EXISTING UtoteEvent: **** EventId={}\nEvent={}", method, curEvent.getEventId(), curEvent.toString(false));

                    // Update the base Event image in the database
                    UtoteEvent newEvent = ProgramRequestProcessor.getEvent(_update.getEventId());
                    log4j.debug("{} - **** UPDATE TYPE=BROADCAST - NEW UtoteEvent: **** EventId={}\nEvent={}", method, newEvent.getEventId(), newEvent.toString(false));
                    boolean eventChanged = !newEvent.equals(curEvent);

                    // Is a Race specified too
                    if (_update.isRaceIdSpecified()) {

                        // Get the current version of the race
                        UtoteRace curRace = findExistingRace(em, newEvent, _update.getRaceId());
                        if (null != curRace) {
                            curRace.setEvent(curEvent);
                            log4j.debug("{} - **** UPDATE TYPE=BROADCAST - EXISTING UtoteRace: **** EventId={}, RaceId={}\ncurRace={}", method, curRace.getEventId(), curRace.getRaceId(), curRace.toString(false));

                            // Get the new Race object
                            UtoteRace newRace = ProgramRequestProcessor.getRaceDetails(_update.getEventId(), _update.getRaceId());
                            loadNewRace(em, newEvent, newRace);
                            log4j.debug("{} - **** UPDATE TYPE=BROADCAST - NEW UtoteRace: **** EventId={}, RaceId={}\nnewRace={}", method, newRace.getEventId(), newRace.getRaceId(), newRace.toString(false));

                            // Check for differences
                            if (!newRace.equals(curRace)) {

                                // Compare the two and log the results
                                if (eventChanged) {

                                    // Pull in the updated event, and therefor race
                                    newEvent = ProgramRequestProcessor.getEventDetails(_update.getEventId());

                                    log4j.debug(
                                            "{} - **** UPDATE TYPE=BROADCAST - NEW Race != EXISTING Race, NEW Event != EXISTING Event **** Data={}, Group={}, Track={}, Post={}, EventId={}, RaceId={}, TrackCode={}\nCur event={}\nNew event={}\nCur race={}\nNew race={}",
                                            method, _update.isDataSpecified() ? _update.getData() : "N/A",
                                                    _update.isGroupSpecified() ? _update.getGroup() : "N/A",
                                                            _update.isTrackSpecified() ? _update.getTrack() : "N/A",
                                                                    _update.isPostSpecified() ? _update.getPost() : "N/A",
                                                                            _update.isEventIdSpecified() ? _update.getEventId() : "N/A",
                                                                                    _update.isRaceIdSpecified() ? _update.getRaceId() : "N/A",
                                                                                            _update.isTrackCodeSpecified() ? _update.getTrackCode() : "N/A",
                                                                                                    curEvent.toString(false),
                                                                                                    newEvent.toString(false),
                                                                                                    curRace.toString(false),
                                                                                                    newRace.toString(false));
                                } else {


                                    log4j.debug(
                                            "{} - **** UPDATE TYPE=BROADCAST - NEW Race != EXISTING Race, NEW Event Loaded **** Data={}, Group={}, Track={}, Post={}, EventId={}, RaceId={}, TrackCode={}\nNew event={}\nCur race={}\nNew race={}",
                                            method, _update.isDataSpecified() ? _update.getData() : "N/A",
                                                    _update.isGroupSpecified() ? _update.getGroup() : "N/A",
                                                            _update.isTrackSpecified() ? _update.getTrack() : "N/A",
                                                                    _update.isPostSpecified() ? _update.getPost() : "N/A",
                                                                            _update.isEventIdSpecified() ? _update.getEventId() : "N/A",
                                                                                    _update.isRaceIdSpecified() ? _update.getRaceId() : "N/A",
                                                                                            _update.isTrackCodeSpecified() ? _update.getTrackCode() : "N/A",
                                                                                                    newEvent.toString(false),
                                                                                                    curRace.toString(false),
                                                                                                    newRace.toString(false));

                                }

                            } else { // RACES ARE EQUAL

                                // Compare the inner objects
                                if (null != newRace.getRunners()) {

                                    newRace.getRunners().stream().forEach(newRunner -> {

                                        if (null != curRace.getRunners()) {

                                            curRace.getRunners().stream()
                                            .filter(curRunner -> (curRunner.getRunnerId() == newRunner.getRunnerId()))
                                            .forEach(curRunner -> {

                                                // Matched a new runner to an existing runner, see if they differ
                                                if (curRunner.equals(newRunner)) {

                                                    if (null != newRunner.getEntries()) {

                                                        // Now, verify that the Entries don't differ
                                                        newRunner.getEntries().stream().forEach(newEntry -> {

                                                            if (null != curRunner.getEntries()) {

                                                                curRunner.getEntries().stream()
                                                                .filter(curEntry -> (curEntry.isSameEntry(newEntry)))
                                                                .forEach(curEntry -> {

                                                                    // Matched a new entry and an existing entry
                                                                    if (curEntry.equals(newEntry)) {
                                                                        // Entries are the same
                                                                    } else {
                                                                        // Entry differs
                                                                        log4j.debug(
                                                                                "{} - **** UPDATE TYPE=BROADCAST - Races, and Runner are equal, NEW Entry != EXISTING Entry **** Data={}, Group={}, Track={}, Post={}, EventId={}, RaceId={}, TrackCode={}\nCur Entry={}\nNew Entry={}",
                                                                                method, _update.isDataSpecified() ? _update.getData() : "N/A",
                                                                                        _update.isGroupSpecified() ? _update.getGroup() : "N/A",
                                                                                                _update.isTrackSpecified() ? _update.getTrack() : "N/A",
                                                                                                        _update.isPostSpecified() ? _update.getPost() : "N/A",
                                                                                                                _update.isEventIdSpecified() ? _update.getEventId() : "N/A",
                                                                                                                        _update.isRaceIdSpecified() ? _update.getRaceId() : "N/A",
                                                                                                                                _update.isTrackCodeSpecified() ? _update.getTrackCode() : "N/A",
                                                                                                                                        curEntry.toString(),
                                                                                                                                        newEntry.toString());
                                                                    }

                                                                });

                                                            } else {
                                                                log4j.debug("{} - **** UPDATE TYPE=BROADCAST - Races Equal, Runner match, New runner has entries, Cur runner has no entries **** ", method);
                                                            }

                                                        });

                                                    } else {
                                                        log4j.debug("{} - **** UPDATE TYPE=BROADCAST - Races Equal, Runner match, New runner has no entries **** ", method);
                                                    }

                                                } else { // curRunnner and newRunner differ
                                                    log4j.debug(
                                                            "{} - **** UPDATE TYPE=BROADCAST - Races Equal, NEW Runner != EXISTING Runner **** Data={}, Group={}, Track={}, Post={}, EventId={}, RaceId={}, TrackCode={}\nCur Runner={}\nNew Runner={}",
                                                            method, _update.isDataSpecified() ? _update.getData() : "N/A",
                                                                    _update.isGroupSpecified() ? _update.getGroup() : "N/A",
                                                                            _update.isTrackSpecified() ? _update.getTrack() : "N/A",
                                                                                    _update.isPostSpecified() ? _update.getPost() : "N/A",
                                                                                            _update.isEventIdSpecified() ? _update.getEventId() : "N/A",
                                                                                                    _update.isRaceIdSpecified() ? _update.getRaceId() : "N/A",
                                                                                                            _update.isTrackCodeSpecified() ? _update.getTrackCode() : "N/A",
                                                                                                                    curRunner.toString(),
                                                                                                                    newRunner.toString());
                                                }
                                            });

                                        } else {
                                            log4j.debug("{} - **** UPDATE TYPE=BROADCAST - Races Equal, CurRace has no runners **** ", method);
                                        }

                                    });

                                } else {
                                    log4j.debug("{} - **** UPDATE TYPE=BROADCAST - Races Equal, NewRace has no runners **** ", method);
                                }

                                // Compare the two and log the results
                                if (eventChanged) {

                                    // Pull in the updated event, and therefor race
                                    newEvent = ProgramRequestProcessor.getEventDetails(_update.getEventId());

                                    log4j.debug(
                                            "{} - **** UPDATE TYPE=BROADCAST - Races Equal, NEW Event != EXISTING Event **** Data={}, Group={}, Track={}, Post={}, EventId={}, RaceId={}, TrackCode={}\nCur event={}\nNew event={}\nNew Race={}",
                                            method, _update.isDataSpecified() ? _update.getData() : "N/A",
                                                    _update.isGroupSpecified() ? _update.getGroup() : "N/A",
                                                            _update.isTrackSpecified() ? _update.getTrack() : "N/A",
                                                                    _update.isPostSpecified() ? _update.getPost() : "N/A",
                                                                            _update.isEventIdSpecified() ? _update.getEventId() : "N/A",
                                                                                    _update.isRaceIdSpecified() ? _update.getRaceId() : "N/A",
                                                                                            _update.isTrackCodeSpecified() ? _update.getTrackCode() : "N/A",
                                                                                                    curEvent.toString(false),
                                                                                                    newEvent.toString(false),
                                                                                                    newRace.toString(false));
                                } else {
                                    log4j.debug(
                                            "{} - **** UPDATE TYPE=BROADCAST - RACES SAME, AND EVENT SAME **** Data={}, Group={}, Track={}, Post={}, EventId={}, RaceId={}, TrackCode={}\nNew event={}\nNew race={}",
                                            method, _update.isDataSpecified() ? _update.getData() : "N/A",
                                                    _update.isGroupSpecified() ? _update.getGroup() : "N/A",
                                                            _update.isTrackSpecified() ? _update.getTrack() : "N/A",
                                                                    _update.isPostSpecified() ? _update.getPost() : "N/A",
                                                                            _update.isEventIdSpecified() ? _update.getEventId() : "N/A",
                                                                                    _update.isRaceIdSpecified() ? _update.getRaceId() : "N/A",
                                                                                            _update.isTrackCodeSpecified() ? _update.getTrackCode() : "N/A",
                                                                                                    newEvent.toString(false),
                                                                                                    newRace.toString(false));

                                }

                            }

                        } else {

                            // New Race, pull it in
                            // Refresh the new Race object
                            UtoteRace newRace = ProgramRequestProcessor.getRaceDetails(_update.getEventId(), _update.getRaceId());
                            newRace.load(em, newEvent);
                            log4j.debug("{} - **** UPDATE TYPE=BROADCAST - NEW UtoteRace: **** EventId={}, RaceId={}\nnewRace={}", method, newRace.getEventId(), newRace.getRaceId(), newRace.toString(false));

                            // If the event changed, note that too
                            if (eventChanged) {

                                log4j.debug(
                                        "{} - **** UPDATE TYPE=BROADCAST - NEW Race Loaded, NEW Event != EXISTING Event **** Data={}, Group={}, Track={}, Post={}, EventId={}, RaceId={}, TrackCode={}\nCur event={}\nNew event={}\nNew race={}",
                                        method, _update.isDataSpecified() ? _update.getData() : "N/A",
                                                _update.isGroupSpecified() ? _update.getGroup() : "N/A",
                                                        _update.isTrackSpecified() ? _update.getTrack() : "N/A",
                                                                _update.isPostSpecified() ? _update.getPost() : "N/A",
                                                                        _update.isEventIdSpecified() ? _update.getEventId() : "N/A",
                                                                                _update.isRaceIdSpecified() ? _update.getRaceId() : "N/A",
                                                                                        _update.isTrackCodeSpecified() ? _update.getTrackCode() : "N/A",
                                                                                                curEvent.toString(false),
                                                                                                newEvent.toString(false),
                                                                                                newRace.toString(false));

                            } else {

                                log4j.debug(
                                        "{} - **** UPDATE TYPE=BROADCAST - NEW Race, NEW Event Loaded **** Data={}, Group={}, Track={}, Post={}, EventId={}, RaceId={}, TrackCode={}\nNew event={}\nNew race={}",
                                        method, _update.isDataSpecified() ? _update.getData() : "N/A",
                                                _update.isGroupSpecified() ? _update.getGroup() : "N/A",
                                                        _update.isTrackSpecified() ? _update.getTrack() : "N/A",
                                                                _update.isPostSpecified() ? _update.getPost() : "N/A",
                                                                        _update.isEventIdSpecified() ? _update.getEventId() : "N/A",
                                                                                _update.isRaceIdSpecified() ? _update.getRaceId() : "N/A",
                                                                                        _update.isTrackCodeSpecified() ? _update.getTrackCode() : "N/A",
                                                                                                newEvent.toString(false),
                                                                                                newRace.toString(false));
                            }

                        }

                    } else {
                        // Only the Event
                        // Compare the two and log the results
                        if (eventChanged) {

                            // Refresh the new Event object
                            newEvent = ProgramRequestProcessor.getEventDetails(_update.getEventId());

                            log4j.debug(
                                    "{} - **** UPDATE TYPE=BROADCAST - NEW Event != EXISTING Event **** Data={}, Group={}, Track={}, Post={}, EventId={}, RaceId={}, TrackCode={}\nCur event={}\nNew event={}",
                                    method, _update.isDataSpecified() ? _update.getData() : "N/A",
                                            _update.isGroupSpecified() ? _update.getGroup() : "N/A",
                                                    _update.isTrackSpecified() ? _update.getTrack() : "N/A",
                                                            _update.isPostSpecified() ? _update.getPost() : "N/A",
                                                                    _update.isEventIdSpecified() ? _update.getEventId() : "N/A",
                                                                            _update.isRaceIdSpecified() ? _update.getRaceId() : "N/A",
                                                                                    _update.isTrackCodeSpecified() ? _update.getTrackCode() : "N/A",
                                                                                            curEvent.toString(false),
                                                                                            newEvent.toString(false));
                        } else {
                            log4j.debug(
                                    "{} - **** UPDATE TYPE=BROADCAST - NEW Event Loaded **** Data={}, Group={}, Track={}, Post={}, EventId={}, RaceId={}, TrackCode={}\nNew event={}",
                                    method, _update.isDataSpecified() ? _update.getData() : "N/A",
                                            _update.isGroupSpecified() ? _update.getGroup() : "N/A",
                                                    _update.isTrackSpecified() ? _update.getTrack() : "N/A",
                                                            _update.isPostSpecified() ? _update.getPost() : "N/A",
                                                                    _update.isEventIdSpecified() ? _update.getEventId() : "N/A",
                                                                            _update.isRaceIdSpecified() ? _update.getRaceId() : "N/A",
                                                                                    _update.isTrackCodeSpecified() ? _update.getTrackCode() : "N/A",
                                                                                            newEvent.toString(false));

                        }

                    }

                } else {
                    // Refresh the new Event object
                    UtoteEvent newEvent = ProgramRequestProcessor.getEventDetails(_update.getEventId());
                    log4j.debug(
                            "{} - **** UPDATE TYPE=BROADCAST - NEW Event Loaded **** Data={}, Group={}, Track={}, Post={}, EventId={}, RaceId={}, TrackCode={}\nNew event={}",
                            method,
                            _update.isDataSpecified() ? _update.getData() : "N/A",
                                    _update.isGroupSpecified() ? _update.getGroup() : "N/A",
                                            _update.isTrackSpecified() ? _update.getTrack() : "N/A",
                                                    _update.isPostSpecified() ? _update.getPost() : "N/A",
                                                            _update.isEventIdSpecified() ? _update.getEventId() : "N/A",
                                                                    _update.isRaceIdSpecified() ? _update.getRaceId() : "N/A",
                                                                            _update.isTrackCodeSpecified() ? _update.getTrackCode() : "N/A",
                                                                                    newEvent.toString(false));

                }
            } else {
                log4j.debug(
                        "{} - **** UPDATE TYPE=BROADCAST - IGNORING NON-SPECIFIC UPDATE **** Data={}, Group={}, Track={}, Post={}, EventId={}, RaceId={}, TrackCode={}",
                        method, _update.isDataSpecified() ? _update.getData() : "N/A",
                                _update.isGroupSpecified() ? _update.getGroup() : "N/A",
                                        _update.isTrackSpecified() ? _update.getTrack() : "N/A",
                                                _update.isPostSpecified() ? _update.getPost() : "N/A",
                                                        _update.isEventIdSpecified() ? _update.getEventId() : "N/A",
                                                                _update.isRaceIdSpecified() ? _update.getRaceId() : "N/A",
                                                                        _update.isTrackCodeSpecified() ? _update.getTrackCode() : "N/A");
            }

            if (em.isOpen()) {
                em.close();
            }
            if (emF.isOpen()) {
                emF.close();
            }

        }

        private void processUpdateType() {
            String method = "processUpdateType";
            log4j.entry(method);

            // Make sure that the Tote Link interface is accepting requests
            if (!linkIsUp()) {
                log4j.error(
                        "{} - *** United Tote Interface Appears to be Down - SKIPPING ToteLink Update MESSAGE *** Received an update with an Event action, but the Tote Link interface is down.",
                        method);
                return;
            }

            // Verify that the RunId has not changed.
            // If so, then re-initialize the United Tote interface
            updateRunId(_update.getRunId());

            String uType = _update.getType();
            switch (uType) {

            case UPDATE_TYPE_EVENT: // Do GetEvenDetail Request and update database/storage.
                processUpdateEvent();
                break;

            case UPDATE_TYPE_RACE: // Do GetRace Request and update database/storage.
                addRaceUpdateMessageToQueue(_update); // (Less overhead than GetEvent)
                break;

            case UPDATE_TYPE_ODDS: // Do GetMatrix for each pool in race for odds and pool if you are storing that information
                // * Currently tote system sends this notification every cycle whether information has changed or not.
                // * This is typically triggered by a Host Tote system performing an ITSP pool cycle.
                // * This indicates POTENTIAL change. You must send the requests and read the responses to know if actual change has occurred.
                log4j.info("{} - *** IGNORING ToteLink Update ODDS MESSAGE ***", method);
                break;

            case UPDATE_TYPE_SOURCE: // Do GetConfiguration for specificed source and update database/storage.
                log4j.info("{} - *** IGNORING ToteLink Update SOURCE MESSAGE ***", method);
                break;

            case UPDATE_TYPE_BROADCAST: 		// The "Data", "Section", "Group"(*), "Track"(*), "Post", "EventId",
                processUpdateTypeBroadcast();	// "RaceId" fields describes the broadcasted data
                break;							// An "*" indicates data has multiple components

            default:
                assert false : method + " - ******** Unrecognized Update Type=" + _update.getType();
            }
            log4j.exit(method);
        }

        // async process
        @Override
        public void run() {
            ThreadContext.put("id", "update-"+UUID.randomUUID().toString()); // Add the fishtag
            log4j.entry("UpdatesWorkerThread.run - siteId, runId", this._update.getSiteId(), this._update.getRunId());
            processUpdateType();
            log4j.debug("Before leaving UpdatesWorkerThread.run();");
            log4j.exit();
            ThreadContext.remove("id");
        }
    }


    private class StatusNotificationWorkerThread implements Runnable {

        private StatusChange _statusChange = null;

        public StatusNotificationWorkerThread(StatusChange inStatusChange) {
            this._statusChange = inStatusChange;
        }

        private void processTerminalActions(String uAction) {
            String method = "processTerminalActions";
            log4j.entry(method + " - uAction", uAction);
            switch (uAction) {
            case STATUS_CHANGE_ACTION_OPEN: // Terminal is open for wagering
                if (!linkIsUp()) {
                    // Re-initialize the United Tote interface
                    log4j.debug("{} - *** Received Action = {} *** Performing Initialization", method, uAction);
                    ToteLinkInitializationServiceHandler.performInitialization();
                    log4j.info("{} - *** Received Action = {} *** Initialization complete", method, uAction);
                } else {
                    log4j.info("{} - *** Received Action = {} *** Link is already up, skipping initialization complete",
                            method, uAction);
                }
                break;
            case STATUS_CHANGE_ACTION_CLOSED: // Terminal is closed for wagering
                log4j.info("{} - *** Received Action = {} *** Closing Link", method, uAction);
                setLinkState(false);
                break;
            case STATUS_CHANGE_ACTION_DEACTIVATE: // Terminal is deactivated
                log4j.info("{} - *** Received Action = {} *** Deactivating Link", method, uAction);
                setLinkState(false);
                break;
            case STATUS_CHANGE_ACTION_RESET: // Terminal is reset
                // Re-initialize the United Tote interface
                log4j.info("{} - *** Received Action = {} *** Ignoring (per suggestion in documentation)", method,
                        uAction);
                break;
            }
            log4j.exit();
        }

        private boolean processEndAction() {
            String method = "processEndActions";
            log4j.entry(method);
            boolean success = false;
            setLinkState(false);
            // Clear out the database by moving the days data into the history tables
            final EntityManagerFactory emF = Configurator.getRWEMF();
            final EntityManager em = emF.createEntityManager();
            try {
                em.getTransaction().begin();
                StoredProcedureQuery sp = em.createStoredProcedureQuery("PrepareUtoteForNewDay");
                sp.execute();
                em.getTransaction().commit();
                log4j.info("{} - *** Received Action = END *** PrepareUtoteForNextDay has ran.", method);
                success = true;
            } catch (QueryTimeoutException e) {
                log4j.error(
                        method + " - *** Received Action = END *** Query timedout calling database procedure PrepareUtoteForNewDay *** - "
                                + e.getMessage(),
                                e);
            } catch (PersistenceException e) {
                log4j.error(
                        method + " - *** Received Action = END *** Persistence Exception calling database procedure PrepareUtoteForNewDay *** - "
                                + e.getMessage(),
                                e);
            } catch (Exception e) {
                log4j.error(
                        method + " - *** Received Action = END *** Unexpected Exception calling database procedure PrepareUtoteForNewDay *** - "
                                + e.getMessage(),
                                e);
            } finally {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
                em.close();
                emF.close();
                log4j.debug("{} - About to run shutdownAndAwaitTermination()", method);
                shutdownAndAwaitTermination();
                log4j.debug("{} - After running shutdownAndAwaitTermination()", method);
            }
            log4j.exit(method + " - " + (success ? "SUCCESS" : "FAILURE"));
            return success;
        }

        private void processSystemActions(String uAction) {
            String method = "processSystemActions";
            log4j.entry(method + " - uAction", uAction);
            switch (uAction) {
            case STATUS_CHANGE_ACTION_INITIALIZE: // System is initialized
                // Re-initialize the United Tote interface
                // Tote system is active and ready for interaction
                log4j.debug("{} - *** Received Action = {} *** Waiting for Tote to return Okay", method, uAction);
                // CheckToteStatus should return blank at this point. (Its okay)
                ToteLinkInitializationServiceHandler.waitForOkay();
                log4j.info("{} - *** Received Action = {} *** Tote returned Okay", method, uAction);
                break;
            case STATUS_CHANGE_ACTION_START: // System is starting
                // Tote system is starting
                // The system may not be ready for several seconds to minutes after this message
                // Begin morning startup routine (Check ToteStatus)
                // Update RunId if in use to track ToteSystem Runs
                log4j.info("{} - *** Received Action = {} *** Performing Start response", method, uAction);
                ToteLinkInitializationServiceHandler.performStart();
                break;
            case STATUS_CHANGE_ACTION_END: // System is cleaning up
                log4j.info("{} - *** Received Action = {} *** Ending Link", method, uAction);
                if (processEndAction()) {
                    log4j.info("{} - *** Received Action = {} *** System prepared for next day", method, uAction);
                }
                break;
            case STATUS_CHANGE_ACTION_STOP: // System is terminating
                log4j.info("{} - *** Received Action = {} *** Stoping Link", method, uAction);
                setLinkState(false);
                break;
            }
            log4j.exit();
        }

        private boolean processEventAdd() {
            String method = "processEventAdd";
            log4j.entry(method);
            boolean success = false;

            class GetEventDetailsWorker implements Runnable {

                String _eventId = null;

                public GetEventDetailsWorker(String eventId) {
                    super();
                    _eventId = eventId;
                }

                @Override
                public void run() {
                    ThreadContext.put("id", _eventId + "-" + UUID.randomUUID().toString()); // Add
                    // the
                    // fishtag
                    log4j.entry("processEventAdd.GetEventDetaisWorker.run - _eventId = {}", _eventId);
                    UtoteEvent eventDetails = ProgramRequestProcessor.getEventDetails(_eventId);
                    log4j.debug("processEventAdd.GetEventDetailsWorker.run - eventDetails.idUtoteEvent={}",
                            (null == eventDetails) ? "null" : eventDetails.getIdUtoteEvent());
                    log4j.exit();
                    ThreadContext.remove("id");
                }

            }

            ConfigurationContext confCon = null;
            try {
                confCon = ConfigurationContextFactory.createDefaultConfigurationContext();
            } catch (Exception e) {
                log4j.error(
                        "{} - Unable to create default configuration context in order to spawn thread for adding eventId={}\n{}\n{}",
                        method, _statusChange.getEventId(), e.getMessage(), e);
            }
            if (null != confCon) {
                ThreadFactory threadFactory = confCon.getThreadPool();
                log4j.info("{} - *** Received Action = Add new Event Id=", method, this._statusChange.getEventId());
                GetEventDetailsWorker worker = new GetEventDetailsWorker(this._statusChange.getEventId());
                threadFactory.execute(worker);
                success = true;
            }
            log4j.exit(method);
            return success;
        }

        private boolean processEventDone() {
            String method = "processEventDone";
            log4j.entry(method);
            boolean success = false;
            // Mark the event as finshed
            final EntityManagerFactory emF = Configurator.getRWEMF();
            final EntityManager em = emF.createEntityManager();
            UtoteEvent theEvent = null;
            try {
                // Get the event
                TypedQuery<UtoteEvent> q = em.createNamedQuery("UtoteEvent.findByEventId", UtoteEvent.class);
                q.setParameter("eventId", _statusChange.getEventId());
                em.getTransaction().begin();
                theEvent = q.getSingleResult();
                theEvent.setEventStatus(UtoteEvent.EVENT_STATUS_FINISHED);
                em.merge(theEvent);
                em.getTransaction().commit();
                log4j.info("{} - *** Received Action Done for Event Id=", method, this._statusChange.getEventId());
                success = true;
            } catch (java.lang.IllegalArgumentException e) {
                log4j.error("{} - Bad query argument trying to find Event with eventId={} in order to mark as \"Done\"",
                        method, _statusChange.getEventId());
            } catch (javax.persistence.NoResultException e) {
                log4j.error("{} - Event with eventId={} was not found in order to mark as \"Done\"", method,
                        _statusChange.getEventId());
            } catch (QueryTimeoutException e) {
                log4j.error("{} - *** Query timedout finding *** - {} {}", method, e.getMessage(), e);
            } catch (PersistenceException e) {
                log4j.error(
                        "{} - *** Persistence Exception trying to find Event with eventId={} in order to mark as \"Done\"\n{}\n{}",
                        method, _statusChange.getEventId(), e.getMessage(), e);
            } catch (Exception e) {
                log4j.error(
                        "{} - *** Unexpected Exception trying to find Event with eventId={} in order to mark as \"Done\"\n{}\n{}",
                        method, _statusChange.getEventId(), e.getMessage(), e);
            } finally {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
                em.close();
                emF.close();
            }
            log4j.exit(method + " - " + (success ? "SUCCESS" : "FAILURE"));
            return success;
        }

        private void processEventActions(String uAction) {
            String method = "processEventActions";
            log4j.entry(method + " - uAction", uAction);
            log4j.debug("{}, Status = {}", method, _statusChange.getStatus());

            // Make sure that the Tote Link interface is accepting requests
            if (!linkIsUp()) {
                log4j.error(
                        "{} - *** SKIPPING ToteLink StatusChange MESSAGE *** Received a Status Change request with an Event action, but the Tote Link interface is down.",
                        method);
                return;
            }

            // Verify that the RunId has not changed.
            // If so, then re-initialize the United Tote interface
            updateRunId(_statusChange.getRunId());

            switch (uAction) {
            case STATUS_CHANGE_ACTION_ADD: // Event has been added to the Tote
                // system
                processEventAdd(); // Do GetEventDetail for specified event and
                // update
                // database/storage
                // Do GetMatrix for odds for this event as
                // specified in morning startup
                break;

            case STATUS_CHANGE_ACTION_DONE: // Event is done
                processEventDone(); // Update database/Storage to set event
                // status to done/closed.
                break;
            }
            log4j.exit(method);
        }

        private void processKeepalive() {
            String method = "processKeepalive";
            log4j.entry(method);
            log4j.info("{} - *** Action = Keepalive *** Ignoring", method);
            log4j.exit();
        }

        private void enqueueRaceAction(String uAction) {
            String method = "enqueueRaceAction";
            log4j.entry(method + " - uAction", uAction);
            log4j.debug("{}, Status = {}", method, _statusChange.getStatus());

            // Make sure that the Tote Link interface is accepting requests
            if (!linkIsUp()) {
                log4j.error(
                        "{} - *** SKIPPING ToteLink StatusChange MESSAGE *** Received a Status Change request with an action={}, event={}, race={}, but the Tote Link interface is down.",
                        method, uAction, _statusChange.isEventIdSpecified()?_statusChange.getEventId():"None", _statusChange.isRaceIdSpecified()?_statusChange.getRaceId():"None");
                return;
            }

            addRaceStatusMessageToQueue(_statusChange);

            log4j.exit(method);
        }

        private void processActionType() throws Exception {
            String method = "processActionType";
            log4j.entry(method);
            String uAction = _statusChange.getAction();
            log4j.debug("{} - uAction={}", method, uAction);
            if (_statusChange.isRaceIdSpecified() && (_statusChange.getRaceId() > 0)) {
                enqueueRaceAction(uAction);
            } else {
                switch (uAction) {
                case STATUS_CHANGE_ACTION_OPEN:
                case STATUS_CHANGE_ACTION_CLOSED:
                case STATUS_CHANGE_ACTION_DEACTIVATE:
                    processTerminalActions(uAction);
                    break;
                case STATUS_CHANGE_ACTION_INITIALIZE:
                case STATUS_CHANGE_ACTION_START:
                case STATUS_CHANGE_ACTION_END:
                case STATUS_CHANGE_ACTION_STOP:
                case STATUS_CHANGE_ACTION_RESET:
                    processSystemActions(uAction);
                    break;
                case STATUS_CHANGE_ACTION_ADD:
                case STATUS_CHANGE_ACTION_DONE:
                    processEventActions(uAction);
                    break;
                case STATUS_CHANGE_ACTION_KEEPALIVE:
                    processKeepalive();
                    break;
                default:
                    log4j.error("{} - Unrecognized action type! uAction = {}", method, uAction);
                    throw ExceptionFactory
                    .makeWebServiceException(method + " - Unrecognized action type! uAction=" + uAction);
                }
            }
            log4j.exit(method);
        }

        private void processStatusChange() {
            log4j.entry("processStatusChange");
            try {
                log4j.debug("processStatusChange - Processing Action");
                processActionType();
            } catch (Exception e) {
                log4j.error("Exception in processStatusChange: " + e.getMessage(), e);
            }
            log4j.exit("processStatusChange");
        }

        // async process
        @Override
        public void run() {
            ThreadContext.put("id", "status-"+UUID.randomUUID().toString()); // Add the fishtag
            log4j.entry("StatusNotificationWorkerThread.run - siteId, runId", this._statusChange.getSiteId(),
                    this._statusChange.getRunId());
            processStatusChange();
            log4j.exit("StatusNotificationWorkerThread.run");
            ThreadContext.remove("id");
        }
    }


    /**
     * Auto generated method signature
     *
     * @param updateNotification0
     * @return
     */

    @Override
    public void updateNotification(org.tempuri.UpdateNotificationE updateNotification0) {
        String method = "ToteLinkUpdateServiceHandler.updateNotificaiton";
        log4j.entry(method);

        // Unmarshall the Updates instance
        Updates updates = updateNotification0.getUpdateNotification().getUpdates();

        // Create thread factory
        ConfigurationContext confCon = MessageContext.getCurrentMessageContext().getConfigurationContext();
        ThreadFactory threadFactory = confCon.getThreadPool();

        // Persist the update
        PreserveUpdatesWorkerThread puwt = new PreserveUpdatesWorkerThread(updates);
        threadFactory.execute(puwt);

        // Process the update based on type
        if (UPDATE_TYPE_ODDS.equalsIgnoreCase(updates.getType())) {
            log4j.info("{} - *** IGNORING ToteLink Update ODDS MESSAGE ***", method);
        } else if (UPDATE_TYPE_SOURCE.equalsIgnoreCase(updates.getType())) {
            log4j.info("{} - *** IGNORING ToteLink Update SOURCE MESSAGE ***", method);
        } else if (updates.isEventIdSpecified() && !Configurator.eventExists(updates.getEventId())) {
            log4j.info("{} - Ignoring message for Event Id {}, Track Type is not supported.", method,
                    updates.getEventId());
        } else {
            UpdatesWorkerThread worker = new UpdatesWorkerThread(updates);
            threadFactory.execute(worker);
        }

        log4j.exit(method);
    }


    /**
     * Auto generated method signature
     *
     * @param statusNotification1
     * @return
     */

    @Override
    public void statusNotification(org.tempuri.StatusNotificationE statusNotification1) {
        String method = "ToteLinkUpdateServiceHandler.statusNotification";
        log4j.entry(method);

        // Unmarshall the StatusUpdate instance
        StatusChange statusChange = statusNotification1.getStatusNotification().getStatusChange();

        // Create thread factory
        ConfigurationContext confCon = MessageContext.getCurrentMessageContext().getConfigurationContext();
        ThreadFactory threadFactory = confCon.getThreadPool();

        // Spin-up thread to preserve the incoming message
        PreserveStatusChangeWorkerThread pscWorker = new PreserveStatusChangeWorkerThread(statusChange);
        threadFactory.execute(pscWorker);

        if (statusChange.isEventIdSpecified() && !Configurator.eventExists(statusChange.getEventId())) {
            log4j.info(
                    "{} - Ignoring message for Event Id {}, Track Type is not supported.",
                    method, statusChange.getEventId());
        } else {
            // kick-off main worker thread, which is simply going to put
            // something on a queue
            StatusNotificationWorkerThread snWorker = new StatusNotificationWorkerThread(statusChange);
            threadFactory.execute(snWorker);
        }

        log4j.exit("Leaving " + method);
    }

    private class PreserveStatusChangeWorkerThread implements Runnable {

        private StatusChange _statusChange = null;

        public PreserveStatusChangeWorkerThread(StatusChange inStatusChange) {
            this._statusChange = inStatusChange;
        }

        @Override
        public void run() {
            ThreadContext.put("id", "preserveStatus-"+UUID.randomUUID().toString()); // Add the fishtag
            String method = "PreserveStatusChangeWorkerThread.run";
            log4j.entry(method);

            // Get an Entity Manager
            final EntityManagerFactory emF = Configurator.getRWEMF();
            final EntityManager em = emF.createEntityManager();

            // Insert a new UtoteStatusChange
            // representing the contents of this message
            em.getTransaction().begin();
            UtoteStatusChange statusChange = new UtoteStatusChange();
            statusChange.setSiteId(_statusChange.getSiteId());
            statusChange.setRunId(((null == _statusChange.getRunId()) || _statusChange.getRunId().isEmpty()) ? 0
                    : Integer.parseInt(_statusChange.getRunId()));
            statusChange.setMessageTime(Timestamp.from(_statusChange.getMessageTime().toInstant()));
            statusChange.setTransactionTime(Timestamp.from(_statusChange.getTransactionTime().toInstant()));
            if (_statusChange.isEventIdSpecified()) {
                statusChange.setEventId(_statusChange.getEventId());
            }
            if (_statusChange.isRaceIdSpecified() && (java.lang.Integer.MIN_VALUE != _statusChange.getRaceId())) {
                statusChange.setRaceId(_statusChange.getRaceId());
            }
            if (_statusChange.isSourceSpecified()) {
                statusChange.setSource(_statusChange.getSource());
            }
            statusChange.setAction(_statusChange.getAction());
            if (_statusChange.isStatusSpecified()) {
                statusChange.setStatus(_statusChange.getStatus());
            }
            if (_statusChange.isMTPSpecified() && (java.lang.Long.MIN_VALUE != _statusChange.getMTP())) {
                statusChange.setMtp(BigInteger.valueOf(_statusChange.getMTP()));
            }
            if (_statusChange.isSourceIdsSpecified()) {
                statusChange.setSourceIds(_statusChange.getSourceIds());
            }
            em.persist(statusChange);
            em.getTransaction().commit();
            if (log4j.isDebugEnabled()) {
                log4j.debug("{} - StatusChange Inserted, Unique ID={}, statusChange={}", method,
                        statusChange.getIdUtoteStatusChange(), statusChange.toString());
            }

            // Close the connections
            em.close();
            emF.close();

            log4j.exit(method);
            ThreadContext.remove("id");
        }

    }


    private class PreserveUpdatesWorkerThread implements Runnable {

        private Updates _update = null;

        public PreserveUpdatesWorkerThread(Updates inUpdate) {
            this._update = inUpdate;
        }

        @Override
        public void run() {
            ThreadContext.put("id", "preserveUpdate-"+UUID.randomUUID().toString()); // Add the fishtag
            String method = "PreserveUpdatesWorkerThread.run";
            log4j.entry(method);

            // Get an Entity Manager
            final EntityManagerFactory emF = Configurator.getRWEMF();
            final EntityManager em = emF.createEntityManager();

            // Insert a new UtoteStatusChange
            // representing the contents of this message
            em.getTransaction().begin();
            UtoteUpdate update = new UtoteUpdate();
            update.setSiteId(_update.getSiteId());
            update.setRunId(Integer.parseInt(_update.getRunId()));
            update.setMessageTime(Timestamp.from(_update.getMessageTime().toInstant()));
            update.setTransactionTime(Timestamp.from(_update.getTransactionTime().toInstant()));
            update.setType(_update.getType());
            if (_update.isDataSpecified()) {
                log4j.trace("{} - _update.Data={}", method, _update.getData());
                update.setData(_update.getData());
            }
            if (_update.isSectionSpecified()) {
                update.setSection(_update.getSection());
            }
            if (_update.isGroupSpecified()) {
                update.setGroup(_update.getGroup());
            }
            if (_update.isTrackSpecified()) {
                update.setTrack(_update.getTrack());
            }
            if (_update.isPostSpecified()) {
                update.setPost(_update.getPost());
            }
            if (_update.isEventIdSpecified()) {
                update.setEventId(_update.getEventId());
            }
            if (_update.isRaceIdSpecified() && (java.lang.Integer.MIN_VALUE != _update.getRaceId())) {
                update.setRaceId(_update.getRaceId());
            }
            if (_update.isSourceSpecified()) {
                update.setSource(_update.getSource());
            }
            if (_update.isSourceIdsSpecified()) {
                update.setSourceIds(_update.getSourceIds());
            }
            if (_update.isTrackCodeSpecified()) {
                update.setTrackCode(_update.getTrackCode());
            }
            em.persist(update);
            em.getTransaction().commit();
            if (log4j.isDebugEnabled()) {
                log4j.debug("{} - Update Inserted, Unique ID={}, update={}", method, update.getIdUtoteUpdate(),
                        update.toString());
            }

            // Close the connections
            em.close();
            emF.close();

            log4j.exit(method);
            ThreadContext.remove("id");
        }

    }


}
