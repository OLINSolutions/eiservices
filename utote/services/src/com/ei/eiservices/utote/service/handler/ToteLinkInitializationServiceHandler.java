
/**
 * ToteLinkInitializationServiceHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ei.eiservices.utote.service.handler;

import java.util.ArrayList;
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

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

import com.ei.eiservices.utote.Configurator;
import com.ei.eiservices.utote.client.processor.ConfigurationRequestProcessor;
import com.ei.eiservices.utote.client.processor.ProgramRequestProcessor;
import com.ei.eiservices.utote.client.processor.StatusRequestProcessor;
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

	public void waitForOkay() {
		StatusRequestProcessor psr = new StatusRequestProcessor();
		try {
			// 1. Request United Tote's ToteLink status until it returns an Okay
			// or times out (60 minutes)
			// Check ToteStatus – Should return blank response for OKAY
			// Repeat until OKAY
			// Once Okay this should proceed with the rest of morning startup,
			// allow wagering, allow account interactions etc..
			boolean statusOkay = psr.waitForToteStatusOkay();
			if (statusOkay) {
				log4j.info("waitForOkay - UnitedTote responded with a valid response to a ToteStatus request.");

			}
		} catch (Exception e) {
			log4j.error(
					"waitForOkay - Exception while waiting for United Tote to return an Okay status. " + e.getMessage(),
					e);
		}
	}

	public void performStart() {

		log4j.entry();
		log4j.info(
				"performStart - Beginning UnitedTote start logic. (ToteLinkInitializationServiceHandler.performStart)");

		// If we are already mid-call, just return
		if (_startInProgress) {
			log4j.info("performStart - Returning as United Tote start response is already in progress");
			log4j.exit();
			return;
		}

		// Turn on global in-process flag as this
		// is intended to be a singleton
		synchronized (_monitor3) {
			_startInProgress = true;
		}

		// Initialize the last RunId
		log4j.debug("performStart - Before getting maxRunId.");
		int maxRunId = ToteLinkUpdateServiceHandler.getMaxRunId();
		log4j.debug("performStart - maxRunId = {}, calling initializeRunId", maxRunId);
		ToteLinkUpdateServiceHandler.setLastRunId(maxRunId);
		log4j.debug("performStart - currentRunId = {}.", ToteLinkUpdateServiceHandler.getLastRunId());

		// The following steps are based on section 3.2 on Morning Startup
		// from the United Tote ToteLink App Design Basics document
		waitForOkay();

		// Turn off global in-process flag as this
		// is intended to be a singleton
		synchronized (_monitor3) {
			_startInProgress = false;
			// Re-initialize the United Tote interface
			log4j.info("performStart - *** Completed Start Processing ***");
			ToteLinkUpdateServiceHandler.setToteStartState(true/* "started" */);
		}

		log4j.exit();

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

	public void performInitialization() {

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
				ThreadContext.put("id", _eventId + "-" + UUID.randomUUID().toString()); // Add
																						// the
																						// fishtag
				log4j.entry("GetEventDetaisWorker.run - _eventId = {}", _eventId);
				ProgramRequestProcessor ppr = new ProgramRequestProcessor();
				UtoteEvent eventDetails = ppr.getEventDetails(_eventId);
				log4j.debug("GetEventDetailsWorker.run - eventDetails.idUtoteEvent={}", eventDetails.getIdUtoteEvent());
				log4j.exit();
				ThreadContext.remove("id");
				atomicBoolean.compareAndSet(true, false);
				unlockWaiter4();
			}

		}

		log4j.entry();
		log4j.info(
				"performInitialization - Beginning UnitedTote initialization. (ToteLinkInitializationServiceHandler.performInitialization)");

		// If we are already mid-call, just return
		if (_initInProgress) {
			log4j.info("performInitialization - Returning as initialization already in progress");
			log4j.exit();
			return;
		}

		// Make sure that the performStart() has been called
		// * Required to verify ToteLink is up
		if (!ToteLinkUpdateServiceHandler.toteHasStarted()) {
			log4j.error("performInitialization - *** ERROR *** ToteLink \"start\" command not received.");
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
			ConfigurationRequestProcessor pcr = new ConfigurationRequestProcessor();
			log4j.debug("performInitialization - About to get and preserve the current configuration");
			UtoteConfiguration utoteConfig = pcr.getConfiguration();
			log4j.debug("performInitialization - Configuration returned.  utoteConfig = {}", utoteConfig);

		} catch (Exception e) {
			log4j.error(
					"performInitialization - Exception while initializing configuration for United Tote to return an Okay status. "
							+ e.getMessage(),
					e);
		}

		try {

			// 3A. Get all existing events in the system
			// GetEvents – Do a GetEvents and store returned information
			// Request should be generic and optional values set to false.
			log4j.debug("performInitialization - Before calling getEvents");
			ProgramRequestProcessor ppr = new ProgramRequestProcessor();
			ArrayList<UtoteEvent> events = (ArrayList<UtoteEvent>)ppr.getEventList();
			int evSize = events.size();
			log4j.debug("performInitialization - Retrieved {} events.", evSize);

			// 3B. Pare down the list of events by removing those that we do not handle
			boolean removedSome = events.removeIf(p -> !Configurator.isSupportedTrackType(p.getTrackType()));
			log4j.debug("performInitialization - After {}removing unhandled track types: {} events: {}", removedSome?"":"**NOT** ", events.size(), events);
			
			// 3C. Capture the list of IDs
			HashMap<String,Integer> currentEvents = new HashMap<String,Integer>();
			for (UtoteEvent anEvent : events) {
				currentEvents.put(anEvent.getEventId(), anEvent.getIdUtoteEvent());
			}
			Configurator.addCurrentEvents(currentEvents);
			
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
					log4j.trace("performInitialization - found split races: {}",rSet);
					String[] posits = rSet.split("-");
					numRaces += ((Integer.parseInt(posits[1]) - Integer.parseInt(posits[0])) + 1);
				}
				threadWaitSecs += (numRaces * Configurator.getPerThreadWaitGetRaceDetails());
				log4j.debug("performInitialization - Spawning thread to get the details for eventId={} with {} races.",
					anEvent.getEventId(), numRaces);
				GetEventDetailsWorker worker = new GetEventDetailsWorker(anEvent.getEventId());
				Future<?> f = execService.submit(worker);
				workerMap.put(f, worker);
				futureList.add(f);
			}

			// Setup scheduled task to kill get event details workers that did not complete in time
			log4j.info(
					"performInitializetion - Waiting for up to {} seconds for {} GetEventDetailsWorker tasks to complete.",
					threadWaitSecs, noOfSubmittedTasks);
			final ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(1);
			final ScheduledFuture<?> getEventKillerHandler = scheduledExecutor.schedule(new Runnable() {
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
							log4j.error("performInitializetion - Had to cancel GetEventDetailsWorker for eventId=",task.getEventId());
						}
						unlockWaiter4();
					}
				}
			}, threadWaitSecs, TimeUnit.SECONDS);

			// Wait for threads to finish via success or cancelled
			waitForGetEventDetailsWorkers();
			log4j.debug("performInitializetion - waitForGetEventDetailsWorkers has completed.");
			if (!getEventKillerHandler.isDone()) {
				log4j.debug("performInitializetion - getEventKillerHandler not done, cancelling.");
				getEventKillerHandler.cancel(true);
			}
			scheduledExecutor.shutdown();
			execService.shutdown();
			
			// See if any were cancelled
			if (noOfCancelledTasks > 0) {
				log4j.error("performInitialization - {} GetEventDetailsWorker threads did not complete.", noOfCancelledTasks);
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
					"performInitialization - Exception while initializing events and races for United Tote to return an Okay status. "
							+ e.getMessage(),
					e);
		}

		// Turn on global in-process flag as this
		// is intended to be a singleton
		synchronized (_monitor1) {
			_initInProgress = false;
			// Re-initialize the United Tote interface
			log4j.warn("processActionStart - *** New RunId Being Processed *** Performing Initialization");
			ToteLinkUpdateServiceHandler.setLinkState(true/* "up" */);
		}

		log4j.exit();
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param initializeUnitedTote0
	 * @return
	 */

	public void initializeUnitedTote(org.tempuri.types.InitializeUnitedTote initializeUnitedTote0) {

		log4j.entry(initializeUnitedTote0);
		String action = initializeUnitedTote0.getInitializeUnitedTote().getAction();
		log4j.debug("initializeUnitedTote - action={}", action);
		switch (action) {
		case "start":
			log4j.debug("initializeUnitedTote - {} - About to call performStart()", action);
			performStart();
			log4j.debug("initializeUnitedTote - {} - Returned from call to performStart()", action);
			break;
		case "startAndUp":
			log4j.debug("initializeUnitedTote - {} - About to call performStart()", action);
			performStart();
			log4j.debug("initializeUnitedTote - {} - Returned from call to performStart()", action);
			ToteLinkUpdateServiceHandler.setLinkState(true/* "up" */);
			log4j.debug("initializeUnitedTote - {} - Link is {}", action, ToteLinkUpdateServiceHandler.linkIsUp()?"UP":"DOWN");
			break;
		case "bringLinkDown":
			log4j.debug("initializeUnitedTote - {} - About to call setLinkState()", action);
			ToteLinkUpdateServiceHandler.setLinkState(false/* "down" */);
			log4j.debug("initializeUnitedTote - {} - Link is {}", action, ToteLinkUpdateServiceHandler.linkIsUp()?"UP":"DOWN");
			break;
		case "bringLinkUp":
			log4j.debug("initializeUnitedTote - {} - About to call setLinkState()", action);
			ToteLinkUpdateServiceHandler.setLinkState(true/* "up" */);
			log4j.debug("initializeUnitedTote - {} - Link is {}", action, ToteLinkUpdateServiceHandler.linkIsUp()?"UP":"DOWN");
			break;
		case "init":
			log4j.debug("initializeUnitedTote - {} - About to call performInitialization()", action);
			performInitialization();
			log4j.debug("initializeUnitedTote - {} - Returned from call to performInitialization()", action);
			break;
		case "startInit":
			log4j.debug("initializeUnitedTote - {} - About to call performStart()", action);
			performStart();
			log4j.debug("initializeUnitedTote - {} - Returned from call to performStart(), about to call performInitialization()", action);
			performInitialization();
			log4j.debug("initializeUnitedTote - {} - Returned from call to performInitialization()", action);
			break;
		case "initConfig":
			log4j.debug("initializeUnitedTote - {} - About to call Configurator.init()", action);
			Configurator.init();
			log4j.debug("initializeUnitedTote - {} - Returned from call to init(), about to call Configurator.getProperties()", action);
			Map<String, Object> props = Configurator.getProperties();
			log4j.debug("initializeUnitedTote - {} - Returned from call to Configurator.getProperties()={}", action, props);
			log4j.debug("initializeUnitedTote - {} - Result from Configurator.isInitialized={}", action, Configurator.isInitialized());
			break;
		case "reconfigureLogManager":
			Configurator.reconfigureLog4j();
			break;
			
		default:
			log4j.debug("initializeUnitedTote - {} - Unknown action", action);
			break;
		}
		log4j.exit();
	}

}
