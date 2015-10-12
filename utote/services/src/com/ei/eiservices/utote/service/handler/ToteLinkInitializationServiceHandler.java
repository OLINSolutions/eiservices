
/**
 * ToteLinkInitializationServiceHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ei.eiservices.utote.service.handler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

import com.ei.eiservices.utote.Configurator;
import com.ei.eiservices.utote.client.processor.ConfigurationRequestProcessor;
import com.ei.eiservices.utote.client.processor.ProgramRequestProcessor;
import com.ei.eiservices.utote.client.processor.ResultRequestProcessor;
import com.ei.eiservices.utote.client.processor.StatusRequestProcessor;
import com.ei.eiservices.utote.controller.RaceController;
import com.ei.eiservices.utote.model.UtoteConfiguration;
import com.ei.eiservices.utote.model.UtoteEvent;
import com.ei.eiservices.utote.service.initializeunitedtote.InitializeUnitedToteServiceSkeletonInterface;

/**
 * ToteLinkInitializationServiceHandler java skeleton for the axisService
 */
public class ToteLinkInitializationServiceHandler implements InitializeUnitedToteServiceSkeletonInterface {

    private static final Logger log4j = LogManager.getLogger(ToteLinkInitializationServiceHandler.class.getName());

    private static volatile boolean _initInProgress = false;
    private static final Object _monitor1 = new Object();

    public static final Object monitor = new Object();
    public static boolean monitorState = false;

    private static volatile boolean _startInProgress = false;
    private static final Object _monitor3 = new Object();

    public static void unlockWaiter() {
        synchronized (monitor) {
            monitorState = false;
            monitor.notifyAll(); // unlock again
        }
    }

    public static void waitForThread() {
        monitorState = true;
        while (monitorState) {
            synchronized (monitor) {
                try {
                    monitor.wait(); // wait until notified
                } catch (Exception e) {
                }
            }
        }
    }

    public static void waitForOkay() {
        try {
            // 1. Request United Tote's ToteLink status until it returns an Okay or times out (60 minutes)
            // Check ToteStatus – Should return blank response for OKAY
            // Repeat until OKAY
            // Once Okay this should proceed with the rest of morning startup, allow wagering, allow account interactions etc..
            boolean statusOkay = StatusRequestProcessor.waitForToteStatusOkay();
            if (statusOkay) {
                log4j.info("waitForOkay - UnitedTote responded with a valid response to a ToteStatus request.");

            }
        } catch (Exception e) {
            log4j.error(
                    "waitForOkay - Exception while waiting for United Tote to return an Okay status. " + e.getMessage(),
                    e);
        }
    }

    public static void fillCurrentEvents(Collection<UtoteEvent> events) {
        final Map<String,Integer> currentEvents = new HashMap<String,Integer>();
        events.forEach(anEvent -> currentEvents.put(anEvent.getEventId(), anEvent.getIdUtoteEvent()));
        Configurator.addCurrentEvents(currentEvents);
    }

    public static void initCurrentEvents() {
        // See if the current event list already exists
        boolean newList = (null == Configurator.getCurrentEvents());

        // If the static list of events is empty, populate it now
        if (newList) {
            // Get an Entity Manager
            final EntityManagerFactory emF = Configurator.getROEMF();
            final EntityManager em = emF.createEntityManager();
            // Load current state of Events
            Collection<UtoteEvent> events = UtoteEvent.findAll(em);
            em.close();
            emF.close();
            fillCurrentEvents(events);
        }
    }


    public static ArrayList<UtoteEvent> retrieveCurrentEvents() {
        String method = "retrieveCurrentEvents";

        // 3A. Get all existing events in the system
        // GetEvents – Do a GetEvents and store returned information
        // Request should be generic and optional values set to false.
        log4j.debug("{} - Before calling getEvents", method);
        ArrayList<UtoteEvent> events = (ArrayList<UtoteEvent>)ProgramRequestProcessor.getEventList();
        int evSize = events.size();
        log4j.debug("{} - Retrieved {} events.", method, evSize);

        // 3B. Pare down the list of events by removing those that we do not handle
        boolean removedSome = events.removeIf(p -> !Configurator.isSupportedTrackType(p.getTrackType()));
        log4j.debug("{} - After {}removing unhandled track types: {} events: {}", removedSome?"":"**NOT** ", method, events.size(), events);

        // 3C. Capture the list of IDs
        fillCurrentEvents(events);

        // Return the list
        return events;
    }

    public static void checkForCardUpdates() {
        String method = "checkForCardUpdates";

        // Get an Entity Manager
        final EntityManagerFactory emF = Configurator.getRTWEMF();
        final EntityManager em = emF.createEntityManager();

        // See if the current event list already exists
        boolean newList = (null == Configurator.getCurrentEvents());

        // Load current state of Events
        Collection<UtoteEvent> events = UtoteEvent.findAll(em);

        // If the static list of events is empty, populate it now
        if (newList) {
            fillCurrentEvents(events);
        }

        // For each event
        events.forEach(anEvent -> {
            log4j.debug("{} - Processing EventId={}", method, anEvent.getEventId());
            // Load the races, runners, and entries
            anEvent.load(em, true);
            // Iterate the Races
            anEvent.getRaces().stream().forEach(aRace -> {
                log4j.debug("{} - Processing RaceId={}, EventId={}", method, aRace.getRaceId(), anEvent.getEventId());
                // Iterate the Runners
                aRace.getRunners().stream().forEach(aRunner -> {
                    log4j.debug("{} - Processing RunnerId={}, RaceId={}, EventId={}, Runner details={}", method, aRunner.getRunnerId(), aRace.getRaceId(), anEvent.getEventId(), aRunner.toString());
                    // Iterate the Entries
                    aRunner.getEntries().stream().filter(anEntry -> (anEntry.isScratch())).forEach(anEntry -> {
                        log4j.debug("{} - Processing EntryId={}, RunnerId={}, RaceId={}, eventId={}",
                                method, (null == anEntry.getEntryId())?"NULL":anEntry.getEntryId(), aRunner.getRunnerId(), aRace.getRaceId(), anEvent.getEventId());
                        // If scratchted, and not processed by RTW, scratch the horse and notify users with picks
                        boolean changes = RaceController.scratchRTWRunner(aRace, aRunner, anEntry);
                        log4j.debug("{} - {} for EntryId={}, RunnerId={}, RaceId={}, eventId={}",
                                method, changes?"Scratched RTW horse":"RTW horse already scratched",(null == anEntry.getEntryId())?"NULL":anEntry.getEntryId(), aRunner.getRunnerId(), aRace.getRaceId(), anEvent.getEventId());
                    });
                });
            });


        });

        // Close the connections
        try {
            if (em.isOpen()) {
                em.close();
            }
            if (emF.isOpen()) {
                emF.close();
            }
        } catch (Exception e) {
            log4j.error("{} - Exception trying em.close(): {}\t{}", method, e.getMessage(), e);
        }

    }

    public static void performStart() {
        String method = "performStart";
        log4j.entry();
        log4j.info(
                "{} - Beginning UnitedTote start logic. (ToteLinkInitializationServiceHandler.performStart)", method);

        // If we are already mid-call, just return
        if (_startInProgress) {
            log4j.info("{} - Returning as United Tote start response is already in progress", method);
            log4j.exit();
            return;
        }

        // Turn on global in-process flag as this
        // is intended to be a singleton
        synchronized (_monitor3) {
            _startInProgress = true;
        }

        // Initialize the last RunId
        int maxRunId = ToteLinkUpdateServiceHandler.getMaxRunId();
        log4j.debug("{} - maxRunId = {}, calling initializeRunId", method, maxRunId);
        ToteLinkUpdateServiceHandler.setLastRunId(maxRunId);
        log4j.debug("{} - currentRunId = {}.", method, ToteLinkUpdateServiceHandler.getLastRunId());

        // Make sure the tote system is up and available
        // waitForOkay is based on section 3.2 on Morning Startup
        // from the United Tote ToteLink App Design Basics document
        waitForOkay();

        // Turn off global in-process flag as this
        // is intended to be a singleton
        synchronized (_monitor3) {
            // Re-initialize the United Tote interface
            ToteLinkUpdateServiceHandler.setToteStartState(true/* "started" */);
            log4j.info("{} - *** Completed Start Processing ***", method);
            _startInProgress = false;
        }

        log4j.exit(method);

    }

    public static final Object monitor4 = new Object();
    public static int noOfSubmittedTasks = 0;
    public static int noOfCancelledTasks = 0;

    public static void unlockWaiter4() {
        synchronized (monitor4) {
            --noOfSubmittedTasks;
            monitor4.notifyAll(); // unlock again
        }
    }

    public static void waitForGetEventDetailsWorkers() {
        while (noOfSubmittedTasks > 0) {
            synchronized (monitor4) {
                try {
                    monitor4.wait(); // wait until notified
                } catch (Exception e) {
                }
            }
        }
    }

    public static void performInitialization() {

        class GetEventDetailsWorker extends Thread {

            private volatile AtomicBoolean atomicBoolean;
            String _eventId = null;

            public GetEventDetailsWorker(String eventId) {
                super();
                _eventId = eventId;
                atomicBoolean = new AtomicBoolean(false);
            }

            @Override
            public void interrupt() {
                try {
                    // clean up any resources, close connections etc.
                } catch (Throwable e) {
                } finally {
                    atomicBoolean.compareAndSet(true, false);
                    // set the interupt status of executing thread.
                    super.interrupt();
                }
            }

            public boolean isRunning() {
                return atomicBoolean.get();
            }

            public String getEventId() {
                return _eventId;
            }

            @Override
            public void run() {
                atomicBoolean.compareAndSet(false, true);
                ThreadContext.put("id", _eventId + "-" + UUID.randomUUID().toString()); // Add the fishtag
                log4j.entry("GetEventDetaisWorker.run - _eventId = {}", _eventId);
                UtoteEvent eventDetails = ProgramRequestProcessor.getEventDetails(_eventId);
                log4j.debug("GetEventDetailsWorker.run - eventDetails.idUtoteEvent={}", eventDetails.getIdUtoteEvent());
                log4j.exit();
                ThreadContext.remove("id");
                atomicBoolean.compareAndSet(true, false);
                unlockWaiter4();
            }

        }

        String method = "performInitialization";
        log4j.entry();
        log4j.info(
                "{} - Beginning UnitedTote initialization. (ToteLinkInitializationServiceHandler.performInitialization)", method);

        // If we are already mid-call, just return
        if (_initInProgress) {
            log4j.info("{} - Returning as initialization already in progress", method);
            log4j.exit();
            return;
        }

        // Make sure that the performStart() has been called
        // * Required to verify ToteLink is up
        if (!ToteLinkUpdateServiceHandler.toteHasStarted()) {
            log4j.error("{} - *** ERROR *** ToteLink \"start\" command not received.", method);
            log4j.exit();
        }

        // Turn on global in-process flag as this
        // is intended to be a singleton
        synchronized (_monitor1) {
            _initInProgress = true;
        }

        // The following steps are based on section 3.2 on Morning Startup
        // from the United Tote ToteLink App Design Basics document
        // (Step 1. is done by the call to processStart(), which will have
        // already happened).

        try {
            // 2. Get configuration on each Source (we only have one)
            // GetConfiguration – Do a GetConfiguration for each source you use.
            // Update database/storage with returned configs.
            UtoteConfiguration utoteConfig = ConfigurationRequestProcessor.getConfiguration();
            log4j.debug("{} - Configuration returned.  utoteConfig = {}", method, utoteConfig);

        } catch (Exception e) {
            log4j.error(
                    "{} - Exception while initializing configuration for United Tote to return an Okay status. Msg={}\nException={}", method, e.getMessage(),
                    e);
        }

        try {

            // 3. Get the list of current events
            Collection<UtoteEvent> events = retrieveCurrentEvents();

            // 4. For each event, get and save it's detailed information
            // GetEventDetail – Do a GetEventDetail for EACH event previously
            // returned by GetEvents. Optional Values should be turned on
            // as required here. Should make multiple simultaneous calls
            // to speed up processing

            // Create instance of executor service and maps to hold thread state
            final ExecutorService execService = Executors.newCachedThreadPool();
            Map<Future<?>, GetEventDetailsWorker> workerMap = new HashMap<Future<?>, GetEventDetailsWorker>();
            ArrayList<Future<?>> futureList = new ArrayList<Future<?>>();
            noOfSubmittedTasks = events.size();
            int threadWaitSecs = 0;

            // Create and execute each worker thread
            for (UtoteEvent anEvent : events) {
                // Calculate number of races
                String raceList = anEvent.getRaceList();
                int numRaces = 0;
                for (String rSet : raceList.split(",")) {
                    log4j.trace("{} - found split races: {}", method, rSet);
                    String[] posits = rSet.split("-");
                    numRaces += ((Integer.parseInt(posits[1]) - Integer.parseInt(posits[0])) + 1);
                }
                threadWaitSecs += (numRaces * Configurator.getPerThreadWaitGetRaceDetails());
                log4j.debug("{} - Spawning thread to get the details for eventId={} with {} races.", method,
                        anEvent.getEventId(), numRaces);
                GetEventDetailsWorker worker = new GetEventDetailsWorker(anEvent.getEventId());
                Future<?> f = execService.submit(worker);
                workerMap.put(f, worker);
                futureList.add(f);
            }

            // Setup scheduled task to kill get event details workers that did not complete in time
            log4j.info(
                    "{} - Waiting for up to {} seconds for {} GetEventDetailsWorker tasks to complete.", method,
                    threadWaitSecs, noOfSubmittedTasks);
            final ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(1);
            final ScheduledFuture<?> getEventKillerHandler = scheduledExecutor.schedule(new Runnable() {
                @Override
                public void run() {
                    for (Future<?> f : futureList) {
                        GetEventDetailsWorker task = workerMap.get(f);
                        if (task.isRunning()) {
                            /*
                             * This ensures that you process only those tasks
                             * which are run once
                             */
                            f.cancel(false);
                            ++noOfCancelledTasks;
                            log4j.error("{} - Had to cancel GetEventDetailsWorker for eventId=", method, task.getEventId());
                        }
                        unlockWaiter4();
                    }
                }
            }, threadWaitSecs, TimeUnit.SECONDS);

            // Wait for threads to finish via success or cancelled
            waitForGetEventDetailsWorkers();
            log4j.debug("{} - waitForGetEventDetailsWorkers has completed.", method);
            if (!getEventKillerHandler.isDone()) {
                log4j.debug("{} - getEventKillerHandler not done, cancelling.", method);
                getEventKillerHandler.cancel(true);
            }
            scheduledExecutor.shutdown();
            execService.shutdown();

            // See if any were cancelled
            if (noOfCancelledTasks > 0) {
                log4j.error("{} - {} GetEventDetailsWorker threads did not complete.", method, noOfCancelledTasks);
            }

            // 5. (Optional) Get the pool matrix
            // GetMatrix – Immediately after GetEventDetails a GetMatrix
            // for each race that you wish to store odds AND tote has
            // indicated (Odds = true) odds are available for should fire off.
            // - Due to large number of requests you must make simultaneous
            // calls to finish this process in a timely manner.
            // Note: Willpays are only available prior to last leg of pool
            // Note: Odds are only available on WIN normally
            // Note: Pool is available for all 1 and 2 leg pools.
            // May be available for some 3 leg pools.
            // BOTH Pool and Odds may be requested during morning
            // startup but many of them will return errors of Odds not
            // available etc.. EVEN when tote has indicated odds are available.

        } catch (Exception e) {
            log4j.error(
                    "{} - {} Exception while initializing events and races for United Tote to return an Okay status.\n{} "
                    , method, e.getMessage(),
                    e);
        }

        // Turn on global in-process flag as this
        // is intended to be a singleton
        synchronized (_monitor1) {
            // Re-initialize the United Tote interface
            ToteLinkUpdateServiceHandler.setLinkState(true/* "up" */);
            log4j.warn("{} - *** New RunId Being Processed *** Performing Initialization", method);
            _initInProgress = false;
        }

        // Check for card changes
        checkForCardUpdates();

        log4j.exit();
    }

    /**
     * Auto generated method signature
     *
     * @param initializeUnitedTote0
     * @return
     */

    @Override
    public void initializeUnitedTote(org.tempuri.types.InitializeUnitedTote initializeUnitedTote0) {
        initUnitedTote(initializeUnitedTote0);
    }

    public static void initUnitedTote(org.tempuri.types.InitializeUnitedTote initializeUnitedTote0) {
        String method = "initUnitedTote";
        log4j.entry(initializeUnitedTote0);
        String action = initializeUnitedTote0.getInitializeUnitedTote().getAction();
        log4j.debug("{} - action={}", method, action);
        /*
        // If data is passed, it will be immediately after a pipe (|) character
        // e.g. reloadEvent
        String[] actdata = action.split("|");
        if (actdata.length > 1) {
        }
         */
        switch (action) {
        case "start":
            log4j.debug("{} - {} - About to call performStart()", method, action);
            performStart();
            log4j.debug("{} - {} - Returned from call to performStart()", method, action);
            break;
        case "startAndUp":
            log4j.debug("{} - {} - About to call performStart()", method, action);
            performStart();
            log4j.debug("{} - {} - About to call initCurrentEvents()", method, action);
            initCurrentEvents();
            log4j.debug("{} - {} - Returned from call to performStart()", method, action);
            ToteLinkUpdateServiceHandler.setLinkState(true/* "up" */);
            log4j.debug("{} - {} - Link is {}", action, ToteLinkUpdateServiceHandler.linkIsUp()?"UP":"DOWN");
            break;
        case "bringLinkDown":
            log4j.debug("{} - {} - About to call setLinkState()", method, action);
            ToteLinkUpdateServiceHandler.setLinkState(false/* "down" */);
            log4j.debug("{} - {} - Link is {}", action, ToteLinkUpdateServiceHandler.linkIsUp()?"UP":"DOWN");
            break;
        case "bringLinkUp":
            log4j.debug("{} - {} - About to call setLinkState()", method, action);
            ToteLinkUpdateServiceHandler.setLinkState(true/* "up" */);
            log4j.debug("{} - {} - Link is {}", action, ToteLinkUpdateServiceHandler.linkIsUp()?"UP":"DOWN");
            break;
        case "init":
            log4j.debug("{} - {} - About to call performInitialization()", method, action);
            performInitialization();
            log4j.debug("{} - {} - Returned from call to performInitialization()", method, action);
            break;
        case "startInit":
            log4j.debug("{} - {} - About to call performStart()", method, action);
            performStart();
            log4j.debug("{} - {} - Returned from call to performStart(), about to call performInitialization()", method, action);
            performInitialization();
            log4j.debug("{} - {} - Returned from call to performInitialization()", method, action);
            break;
        case "initConfig":
            log4j.debug("{} - {} - About to call Configurator.init()", method, action);
            Configurator.init();
            log4j.debug("{} - {} - Returned from call to init(), about to call Configurator.getProperties()", method, action);
            Map<String, Object> props = Configurator.getProperties();
            log4j.debug("{} - {} - Returned from call to Configurator.getProperties()={}", method, action, props);
            log4j.debug("{} - {} - Result from Configurator.isInitialized={}", method, action, Configurator.isInitialized());
            break;
        case "reconfigureLogManager":
            log4j.debug("{} - {} - About to call Configurator.reconfigureLog4j()", method, action);
            Configurator.reconfigureLog4j();
            log4j.debug("{} - {} - Returned from call to Configurator.reconfigureLog4j(), method", action);
            break;
        case "testResultsAllRaces":
            log4j.debug("{} - {} - About to call ResultRequestProcessor.testAllRaces()", method, action);
            ResultRequestProcessor.testAllRaces();
            log4j.debug("{} - {} - Returned from call ResultRequestProcessor.testAllRaces()", method, action);
            break;
        case "testResultsFinalRaces":
            log4j.debug("{} - {} - About to call ResultRequestProcessor.testFinalRaces()", method, action);
            ResultRequestProcessor.testFinalRaces();
            log4j.debug("{} - {} - Returned from call ResultRequestProcessor.testFinalRaces()", method, action);
            break;
        case "checkForCardUpdates":
            log4j.debug("{} - {} - About to call ResultRequestProcessor.checkForCardUpdates()", method, action);
            checkForCardUpdates();
            log4j.debug("{} - {} - Returned from call ResultRequestProcessor.checkForCardUpdates()", method, action);
            break;

        default:
            log4j.debug("{} - {} - Unknown action", action);
            break;
        }
        log4j.exit();
    }

}
