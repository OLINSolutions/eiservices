	
/**
 * ToteLinkUpdateServiceHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ei.eiservices.utote.service.handler;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Collection;
import java.util.UUID;

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
import com.ei.eiservices.utote.model.Horse;
import com.ei.eiservices.utote.model.Race;
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
	
	private static volatile int _lastRunId = 0;
	private static final Object _monitor1 = new Object();

	private static volatile boolean _linkIsUp = false;
	private static final Object _monitor2 = new Object();

	private static volatile boolean _toteHasStarted = false;
	private static final Object _monitor3 = new Object();

	public static void setLastRunId(int newRunId) {
		synchronized (_monitor1) {
			_lastRunId = newRunId;
			_monitor1.notifyAll(); // unlock again
		}
	}

	public static int getLastRunId() {
		return _lastRunId;
	}

	public static void setLinkState(boolean newState) {
		synchronized (_monitor2) {
			_linkIsUp = newState;
			_monitor2.notifyAll(); // unlock again
		}
	}

	public static boolean linkIsUp() {
		return _linkIsUp;
	}

	public static void setToteStartState(boolean newState) {
		synchronized (_monitor3) {
			_toteHasStarted = newState;
			_monitor3.notifyAll(); // unlock again
		}
	}

	public static boolean toteHasStarted() {
		return _toteHasStarted;
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
		if (null != result) uRunId = result.intValue();
		log4j.debug("{} - uRunId = {}", method, uRunId);
		
		// Get largest RunId from status changes
		q = em.createQuery("select max(s.runId) from UtoteStatusChange s", Integer.class);
		result = q.getSingleResult();	
		int sRunId = 0;
		if (null != result) sRunId = result.intValue();
		log4j.debug("{} - sRunId={}", method, sRunId);
		
		em.close();
		emF.close();
		
		// Determine and return the maximum
		int maxRunId = (sRunId > uRunId)?sRunId:uRunId;
		if (!log4j.isTraceEnabled()) log4j.debug("{} - maxRunId={}", method, maxRunId);
		
		log4j.exit(method + " - maxRunId=" + maxRunId);
		return maxRunId;
	}
	
	private void updateRunId(int newRunId) {
		// Make sure runId has not changed
		// If so, re-perform initialization
		if (newRunId > _lastRunId) {
			synchronized (_monitor1) {
				_lastRunId = newRunId;
				_monitor1.notifyAll(); // unlock again
			}
			// Re-initialize the United Tote interface
			log4j.warn("updateRunId - *** New RunId Detected and set, now performing re-initialization. *** lastRunId={}, newRunId={}", _lastRunId, newRunId);
			(new ToteLinkInitializationServiceHandler()).performInitialization();
		}
	}
	
	private void updateRunId(String newRunId) {
		updateRunId(Integer.parseInt(newRunId));
	}

	// Find and deeply retrieve the requested race, but detach it from
	// the associated EM.
	private UtoteRace retrieveRace(EntityManager em, String eventId, int raceId) {
		log4j.entry("retrieveRace");
		UtoteRace utoteRace = null;
		TypedQuery<UtoteRace> q = em.createNamedQuery("UtoteRace.findSpecific", UtoteRace.class);
		q.setParameter("eventId", eventId);
		q.setParameter("raceId", raceId);
		try {
			utoteRace = q.getSingleResult();
			utoteRace.loadParent(em);
			utoteRace.load(em, null);
			utoteRace.detach(em);
		} catch (javax.persistence.NoResultException e) {
			log4j.debug("retrieveRace - Received NoResultException looking for race with eventId={} and raceId={}", eventId, raceId);
		}
		log4j.exit("retrieveRace - " + ((null == utoteRace)?"NOT FOUND":"FOUND"));
		return utoteRace;
	}

	private Race getRTWRace(EntityManager em, int tracksid, long raceDate, int raceNumber) {
		assert (0 == tracksid) : "Passed zero tracksid to getRTWRace";
		assert (0 == raceDate) : "Passed zero raceDate to getRTWRace";
		assert (0 == raceNumber) : "Passed zero raceNumber to getRTWRace";
		Race r = null;
		try {
			TypedQuery<Race> q = em.createNamedQuery("Race.findSpecific", Race.class);
			q.setParameter("idParent",  tracksid);
			q.setParameter("raceDate", raceDate);
			q.setParameter("raceNumber", raceNumber);
			try {
				r = q.getSingleResult();
			} catch (javax.persistence.NoResultException e) {
				log4j.debug("getRTWRace - NoResultException running query for RTW Race with tracksid={}, raceDate={}, raceNumber={}.\nException={}", tracksid, raceDate, raceNumber, e);
			} catch (Exception e2) {
				log4j.debug("getRTWRace - Unexpected Exception running query for RTW Race with tracksid={}, raceDate={}, raceNumber={}.\nException={}", tracksid, raceDate, raceNumber, e2);
			}
		} catch (Exception e) {
			log4j.error("getRTWRace - Exception preparing query for RTW Race with tracksid={}, raceDate={}, raceNumber={}.\nException={}", tracksid, raceDate, raceNumber, e);
		}
		return r;
	}
	
	private Horse getRTWHorse(EntityManager em, Race theRace, UtoteRunner theRunner, UtoteEntry theEntry) {
		assert (null != theRace) : "Passed null Race to getRTWHorse";
		assert (null != theRunner) : "Passed null UtoteRunner to getRTWHorse";
		assert (null != theEntry) : "Passed null UtoteEntry to getRTWHorse";
		String programNumber = String.valueOf(theRunner.getRunnerId()) + (((null == theEntry) || (null == theEntry.getEntryId()))?"":theEntry.getEntryId());
		Horse h = null;
		try {
			TypedQuery<Horse> q = em.createNamedQuery("Horse.findByRaceAndProgramNumber", Horse.class);
			q.setParameter("racesid",  theRace.getRacesid());
			q.setParameter("horsesprogramnumber", programNumber);
			try {
				h = q.getSingleResult();
			} catch (javax.persistence.NoResultException e) {
				log4j.error("getRTWHorse - NoResultException running query for RTW Horse with racesid={}, horsesprogramnumber={}.", theRace.getRacesid(), programNumber);
			}
		} catch (Exception e) {
			log4j.error("getRTWHorse - Exception preparing query for RTW Horse with racesid={}, horsesprogramnumber={}.\nException={}", theRace.getRacesid(), programNumber, e);
		}
		return h;
	}
	
	private static final int RTW_RACE_STATUS_OPEN		= 1; // "Open", "Uncanceled"
	private static final int RTW_RACE_STATUS_CLOSED		= 3; //"Closed", "Post", "Locked"
	private static final int RTW_RACE_STATUS_CANCELLED  = 4; // "Cancelled"
	private static final int RTW_RACE_STATUS_OVER		= 5; // "Final"

	private int mapUtoteRaceStatusToRTWStatusId(String raceStatus) {
		int statusId = 0;
		switch (raceStatus) {
		case UtoteRace.RACE_STATUS_OPEN :
		case UtoteRace.RACE_STATUS_UNCANCELED :
			statusId = RTW_RACE_STATUS_OPEN;
			break;
		case UtoteRace.RACE_STATUS_CLOSED :
		case UtoteRace.RACE_STATUS_POST :
		case UtoteRace.RACE_STATUS_LOCKED :
			statusId = RTW_RACE_STATUS_CLOSED;
			break;
		case UtoteRace.RACE_STATUS_CANCELED :
			statusId = RTW_RACE_STATUS_CANCELLED;
			break;
		case UtoteRace.RACE_STATUS_FINAL :
			statusId = RTW_RACE_STATUS_OVER;
			break;
		default :
			assert false : "mapUtoteRaceStatusToRTWStatusId invalid raceStatus="+raceStatus;
		}
		return statusId;
	}
	
	private void updateRaceTimesBasedOnStatus(Race r, String raceStatus) {
		// Convert the time to string format for update
		// Note: MySQL provides ambiguous results when creating an epoch value
		switch (raceStatus) {
		case UtoteRace.RACE_STATUS_CLOSED :
		case UtoteRace.RACE_STATUS_POST :
		case UtoteRace.RACE_STATUS_LOCKED :
			long lTime = Instant.now().getEpochSecond();
			r.setRaceshorseselectionlocktime(lTime);
			break;
		case UtoteRace.RACE_STATUS_CANCELED :
		case UtoteRace.RACE_STATUS_FINAL :
			long eTime = Instant.now().getEpochSecond();
			r.setRacesendtime(eTime);
			break;
		}
	}
	
	private UtoteEvent getParentEvent(String callingMethod, UtoteRace theRace) {
		String method = "ToteLinkUpdateServiceHandler.getParentEvent on behalf of " + callingMethod;
		// If the provided UtoteRace's event is empty, load it
		UtoteEvent parentEvent = theRace.getEvent();
		if (null == parentEvent) {
			// Get Entity Managers
			final EntityManagerFactory roEmF = Configurator.getROEMF();
			final EntityManager roEm = roEmF.createEntityManager();
			try {
				log4j.debug("{} - Parent UtoteEvent was not loaded, attempting to load for Race matching raceId={}, and eventId={}", method, theRace.getRaceId(), theRace.getEventId());
				parentEvent = theRace.loadParent(roEm);
				if (null != parentEvent) {
					roEm.detach(parentEvent);
				} else {
					log4j.error("{} - Parent UtoteEvent not found for Race matching raceId={}, and eventId={}", method, theRace.getRaceId(), theRace.getEventId());
				}
			} catch (Exception e) {
				log4j.error("{} - Error trying to retrieve parent UtoteEvent for Race matching raceId={}, and eventId={}\nException={}", method, theRace.getRaceId(), theRace.getEventId(), e);
			} finally {
				roEm.close();
				roEmF.close();
			}
		}
		return parentEvent;
	}
	
	private boolean updateRTWRaceStatusAndPostTime(UtoteRace theRace, boolean statusUpdated, boolean isCancelled, boolean postTimeUpdated) {
		boolean performedUpdate = false;
		String method = "updateRTWRaceStatusAndPostTime";
		log4j.entry(method);
		
		// Get the parent event
		UtoteEvent parentEvent = getParentEvent(method, theRace);
		if (null != parentEvent) {
			
			// Get Entity Managers
			final EntityManagerFactory rtwEmF = Configurator.getRTWEMF();
			final EntityManager rtwEm = rtwEmF.createEntityManager();
	
			// Make sure our RTW event info was loaded; could be an unsupported track
			if (parentEvent.getRtwTracksid() != 0) {
				log4j.debug("{} - Found RTW Event matching tracksid={}, trackId={}, parentEvent.getEventDate={} and eventId={}", method, parentEvent.getRtwTracksid(), parentEvent.getTrackId(), parentEvent.getEventDate(), theRace.getEventId());
	
				// Find the matching race in our system
				Race r = getRTWRace(rtwEm, parentEvent.getRtwTracksid(), parentEvent.getEventDate(), theRace.getRaceId());
				if (null != r) {
					log4j.debug("{} - Found RTW Race matching trackId={}, tracksid={}, racesdate={}, racesid={}, and eventId={}", method, parentEvent.getTrackId(), r.getTracksid(), r.getRacesdate(), r.getRacesid(), parentEvent.getEventId());
	
					
					// Update the status, if needed
					if (statusUpdated && (r.getStatusid() != mapUtoteRaceStatusToRTWStatusId(theRace.getRaceStatus()))) {
						try {
							rtwEm.getTransaction().begin();
							r.setStatusid(mapUtoteRaceStatusToRTWStatusId(theRace.getRaceStatus()));
							updateRaceTimesBasedOnStatus(r, theRace.getRaceStatus());
							r = rtwEm.merge(r);
							rtwEm.getTransaction().commit();
							performedUpdate = true;
							log4j.debug("{} - Updated race statusid to {} ({}) for RTW Race matching trackId={}, raceId={}, and eventId={}", method, r.getStatusid(), theRace.getRaceStatus(), r.getStatusid(), parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId());
						} catch(Exception e) {
							log4j.error("{} - Error trying to update the status on the RTW Race matching trackId={}, raceId={}, and eventId={}\nException={}", method, parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId(),e);
						}
					}
					// If not cancelled, and the postTime has been changed
					if (!isCancelled && postTimeUpdated) {
						// Convert the post time to string format for stored procedure call
						// Note: MySQL provides ambiguous results if passing in an epoch value
						Instant inst3 = Instant.ofEpochMilli(theRace.getPostTime());
						String gmtString = inst3.toString();
						try {
							log4j.debug("{} - About to Updated race Post Time to {} for RTW Race matching racesid={}, pTzOffset={}, pNewPostTIme={}, trackId={}, raceId={}, and eventId={}", method, theRace.getPostTime(), r.getRacesid(), parentEvent.getRtwTimezone(), gmtString/*lPostTime*/, parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId());
							rtwEm.getTransaction().begin();
							StoredProcedureQuery q = rtwEm.createNamedStoredProcedureQuery("Race.updatePostTime");
							q.setParameter("pRacesId", r.getRacesid());
							q.setParameter("pTzOffset", parentEvent.getRtwTimezone());
							q.setParameter("pNewPostTime", gmtString);
							q.execute();
							rtwEm.getTransaction().commit();
							log4j.debug("{} - About to refresh the RTW race object after calling Race.updatePostTime", method);
							rtwEm.refresh(r);
							performedUpdate = true;
							log4j.debug("{} - Updated race Post Time to {} for RTW Race matching racesid={}, pTzOffset={}, r.racesstarttime={}, r.racesposttime={}, trackId={}, raceId={}, and eventId={}", method, theRace.getPostTime().toString(), r.getRacesid(), parentEvent.getRtwTimezone(), r.getRacesstarttime(), r.getRacesposttime(), parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId());
						} catch(Exception e) {
							log4j.error("{} - Error trying to call Race.updatePostTime for the RTW Race matching racesid={}, pTzOffset={}, pNewPostTIme={}, trackId={}, raceId={}, and eventId={}\nException={}", method, r.getRacesid(), parentEvent.getRtwTimezone(), gmtString/*lPostTime*/, parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId(),e);
						}
					}
					try {
						// Re-read and display for debugging
						rtwEm.refresh(r);
						if (log4j.isTraceEnabled()) log4j.trace("{} - Updated race status to {} for RTW Race matching trackId={}, raceId={}, and eventId={}\nResulting Race object={}", method, theRace.getRaceStatus(), parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId(),r);
					} catch(Exception e) {
						log4j.error("{} - Error trying to refresh the RTW Race object matching trackId={}, raceId={}, and eventId={}\nException={}", method, parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId(),e);
					}
				} else {
					log4j.error("{} - Did not find RTW Race matching trackId={}, raceId={}, and eventId={}", method, parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId());
				}
			} else {
				log4j.debug("{} - Did not find RTW Track matching trackId={} and eventId={}", method, parentEvent.getTrackId(), theRace.getEventId());
			}
			
			// Close down the persistence connections
			rtwEm.close();
			rtwEmF.close();

		}
	
		log4j.exit(performedUpdate);
		
		return performedUpdate;
	}
	
	private void updateRTWRaceStatus(UtoteRace theRace, boolean isCancelled) {
		updateRTWRaceStatusAndPostTime(theRace, true, isCancelled, false);
	}
	
	// Find the matching race in our system
	// Find the matching runner
	// Update the status
	private boolean scratchRTWRunner(UtoteRace theRace, UtoteRunner theRunner, UtoteEntry theEntry) {
		boolean performedUpdate = false;
		String method = "scratchRTWRunner";
		log4j.entry(method);
		
		// Get the parent event
		UtoteEvent parentEvent = getParentEvent(method, theRace);
		if (null != parentEvent) {
			
			// Get an Entity Manager
			final EntityManagerFactory rtwEmF = Configurator.getRTWEMF();
			final EntityManager rtwEm = rtwEmF.createEntityManager();
	
			// Make sure our RTW event info was loaded; could be an unsupported track
			if (parentEvent.getRtwTracksid() != 0) {
				log4j.debug("{} - Found RTW Event matching tracksid={}, trackId={}, parentEvent.getEventDate={} and eventId={}", method, parentEvent.getRtwTracksid(), parentEvent.getTrackId(), parentEvent.getEventDate(), theRace.getEventId());
	
				// Find the matching race in our system
				Race r = getRTWRace(rtwEm, parentEvent.getRtwTracksid(), parentEvent.getEventDate(), theRace.getRaceId());
				if (null != r) {
					log4j.debug("{} - Found RTW Race matching trackId={}, tracksid={}, racesdate={}, racesid={}, and eventId={}", method, parentEvent.getTrackId(), r.getTracksid(), r.getRacesdate(), r.getRacesid(), parentEvent.getEventId());
	
					// Now find the matching runner (by number)
					Horse h = getRTWHorse(rtwEm, r, theRunner, theEntry);
					if (null != h) {
						log4j.debug("{} - Found RTW Horse matching horsesprogramnumber={} trackId={}, raceId={}, and eventId={}", method, h.getHorsesprogramnumber(), parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId());
					
						// Update the horses scratch flag
						try {
							rtwEm.getTransaction().begin();
							h.setHorsesscratchindicator("Y");
							h.setHorsesscratchdescription("ToteLink Notification.");
							// Convert the time to string format for update
							// Note: MySQL provides ambiguous results when creating an epoch value
							long lTime = Instant.now().getEpochSecond();
							h.setHorsesscratchdescriptiontime(lTime);
							h = rtwEm.merge(h);
							rtwEm.getTransaction().commit();
							performedUpdate = true;
							log4j.info("{} - Updated HorsesScratchIndicator to Y for RTW Horse matching horseName={}, runnerNumber={}, raceId={}, trackId={}, and eventId={}", method, h.getHorsesname(), theRunner.getRunnerId(), theRace.getRaceId(), parentEvent.getTrackId(), theRace.getEventId());
							if (log4j.isTraceEnabled()) log4j.trace("{} - Updated horse scratch indicator status to Y for RTW Horse matching horseName={}, runnerNumber={}, raceId={}, trackId={}, and eventId={}\nResulting Horse object={}", method, h.getHorsesname(), theRunner.getRunnerId(), theRace.getRaceId(), parentEvent.getTrackId(), theRace.getEventId(),h);
						} catch(Exception e) {
							log4j.error("{} - Error trying to update the status on the RTW Horse matching horseName={}, runnerNumber={}, raceId={}, trackId={}, and eventId={}", method, h.getHorsesname(), theRunner.getRunnerId(), theRace.getRaceId(), parentEvent.getTrackId(), theRace.getEventId());
						}
					} else {
						log4j.error("{} - Did not find RTW Horse matching runnerNumber={}, raceId={}, trackId={}, and eventId={}", method, theRunner.getRunnerId(), theRace.getRaceId(), parentEvent.getTrackId(), theRace.getEventId());
					}
				} else {
					log4j.error("{} - Did not find RTW Race matching trackId={}, raceId={}, and eventId={}", method, parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId());
				}
			} else {
				log4j.debug("{} - Did not find RTW Track matching trackId={} and eventId={}", method, parentEvent.getTrackId(), theRace.getEventId());
			}
			
			// Close down the persistence connections
			rtwEm.close();
			rtwEmF.close();

		}

		log4j.exit(performedUpdate);
		return performedUpdate;
	}
	
	// Find the matching race in our system
	// Find the matching runner
	// Update the status
	private boolean unscratchRTWRunner(UtoteRace theRace, UtoteRunner theRunner, UtoteEntry theEntry) {
		boolean performedUpdate = false;
		String method = "unscratchRTWRunner";
		log4j.entry(method);
		
		// Get the parent event
		UtoteEvent parentEvent = getParentEvent(method, theRace);
		if (null != parentEvent) {
			
			// Get an Entity Manager
			final EntityManagerFactory rtwEmF = Configurator.getRTWEMF();
			final EntityManager rtwEm = rtwEmF.createEntityManager();
	
			// Make sure our RTW event info was loaded; could be an unsupported track
			if (parentEvent.getRtwTracksid() != 0) {
				log4j.debug("{} - Found RTW Event matching tracksid={}, trackId={}, parentEvent.getEventDate={} and eventId={}", method, parentEvent.getRtwTracksid(), parentEvent.getTrackId(), parentEvent.getEventDate(), theRace.getEventId());
	
				// Find the matching race in our system
				Race r = getRTWRace(rtwEm, parentEvent.getRtwTracksid(), parentEvent.getEventDate(), theRace.getRaceId());
				if (null != r) {
					log4j.debug("{} - Found RTW Race matching trackId={}, tracksid={}, racesdate={}, racesid={}, and eventId={}", method, parentEvent.getTrackId(), r.getTracksid(), r.getRacesdate(), r.getRacesid(), parentEvent.getEventId());
	
					// Now find the matching runner (by number)
					Horse h = getRTWHorse(rtwEm, r, theRunner, theEntry);
					if (null != h) {
						log4j.debug("{} - Found RTW Race matching trackId={}, raceId={}, and eventId={}", method, parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId());
					
						// Update the horses scratch flag
						try {
							rtwEm.getTransaction().begin();
							h.setHorsesscratchindicator("N");
							// Convert the time to string format for update
							// Note: MySQL provides ambiguous results when creating an epoch value
							long lTime = Instant.now().getEpochSecond();
							h.setHorsesscratchdescriptiontime(lTime);
							h = rtwEm.merge(h);
							rtwEm.getTransaction().commit();
							performedUpdate = true;
							log4j.info("{} - Updated HorsesScratchIndicator to N for RTW Horse matching horseName={}, runnerNumber={}, raceId={}, trackId={}, and eventId={}", method, h.getHorsesname(), theRunner.getRunnerId(), theRace.getRaceId(), parentEvent.getTrackId(), theRace.getEventId());
						} catch(Exception e) {
							log4j.error("{} - Error trying to update the status on the RTW Race matching horseName={}, runnerNumber={}, raceId={}, trackId={}, and eventId={}", method, h.getHorsesname(), theRunner.getRunnerId(), theRace.getRaceId(), parentEvent.getTrackId(), theRace.getEventId());
						}
						// Re-read and display for debugging
						rtwEm.refresh(r);
						if (log4j.isTraceEnabled()) log4j.trace("{} - Updated horse scratch indicator status to N for RTW Horse matching horseName={}, runnerNumber={}, raceId={}, trackId={}, and eventId={}\nResulting Horse object={}", method, h.getHorsesname(), theRunner.getRunnerId(), theRace.getRaceId(), parentEvent.getTrackId(), theRace.getEventId(),h);
					} else {
						log4j.error("{} - Did not find RTW Horse matching runnerNumber={}, raceId={}, trackId={}, and eventId={}", method, theRunner.getRunnerId(), theRace.getRaceId(), parentEvent.getTrackId(), theRace.getEventId());
					}
				} else {
					log4j.error("{} - Did not find RTW Race matching trackId={}, raceId={}, and eventId={}", method, parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId());
				}
			} else {
				log4j.debug("{} - Did not find RTW Track matching trackId={} and eventId={}", method, parentEvent.getTrackId(), theRace.getEventId());
			}
			
			// Close down the persistence connections
			rtwEm.close();
			rtwEmF.close();

		}

		log4j.exit(performedUpdate);
		return performedUpdate;
	}
	
	// Find the matching race in our system
	// Find the matching runner
	// Update the status
	private boolean setRTWRunnerEntryChanges(UtoteRace theRace, UtoteRunner theRunner, UtoteEntry theEntry, UtoteEntryChange curEC, UtoteEntryChange newEC) {
		boolean performedUpdate = false;
		String method = "setRTWRunnerEntryChanges";
		log4j.entry(method);
		
		// Get the parent event
		UtoteEvent parentEvent = getParentEvent(method, theRace);
		if (null != parentEvent) {
			
			// Get an Entity Manager
			final EntityManagerFactory rtwEmF = Configurator.getRTWEMF();
			final EntityManager rtwEm = rtwEmF.createEntityManager();
	
			// Make sure our RTW event info was loaded; could be an unsupported track
			if (parentEvent.getRtwTracksid() != 0) {
				log4j.debug("{} - Found RTW Event matching tracksid={}, trackId={}, parentEvent.getEventDate={} and eventId={}", method, parentEvent.getRtwTracksid(), parentEvent.getTrackId(), parentEvent.getEventDate(), theRace.getEventId());
	
				// Find the matching race in our system
				Race r = getRTWRace(rtwEm, parentEvent.getRtwTracksid(), parentEvent.getEventDate(), theRace.getRaceId());
				if (null != r) {
					log4j.debug("{} - Found RTW Race matching trackId={}, tracksid={}, racesdate={}, racesid={}, and eventId={}", method, parentEvent.getTrackId(), r.getTracksid(), r.getRacesdate(), r.getRacesid(), parentEvent.getEventId());
	
					// Now find the matching runner (by number)
					Horse h = getRTWHorse(rtwEm, r, theRunner, theEntry);
					if (null != h) {
						log4j.debug("{} - Found RTW Race matching trackId={}, raceId={}, and eventId={}", method, parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId());
					
						// Update the horses scratch flag
						try {
							boolean hasChanges = false;
							rtwEm.getTransaction().begin();
							
							// Jockey changed?
							if (((null == curEC) && newEC.isJockeyChanged()) ||
							    (!(curEC.isJockeyChanged() == newEC.isJockeyChanged()))) {
								// TODO: Process jockey change
							}
							// Medication changed?
							if (((null == curEC) && newEC.isMedicationChanged()) ||
								(!(curEC.isMedicationChanged() == newEC.isMedicationChanged()))) {
								h.setHorsesmedication(theEntry.getMedication());
								hasChanges = true;
							}
							// Name changed?
							if (((null == curEC) && newEC.isNameChanged()) ||
								(!(curEC.isNameChanged() == newEC.isNameChanged()))) {
								h.setHorsesname(theEntry.getName());
								hasChanges = true;
							}
							// Owner changed?
							if (((null == curEC) && newEC.isOwnerChanged()) ||
								(!(curEC.isOwnerChanged() == newEC.isOwnerChanged()))) {
								// TODO: Process owner change
							}
							// Position changed?
							if (((null == curEC) && newEC.isPositionChanged()) ||
								(!(curEC.isPositionChanged() == newEC.isPositionChanged()))) {
								try {
									h.setHorsespostposition(Integer.parseInt(theEntry.getPosition()));
									hasChanges = true;
								} catch (NumberFormatException e) {
									log4j.error("{} - Error converting new post position ({}) to an integer while trying to update the status on the RTW Race matching horseName={}, runnerNumber={}, raceId={}, trackId={}, and eventId={}", method, theEntry.getPosition(), h.getHorsesname(), theRunner.getRunnerId(), theRace.getRaceId(), parentEvent.getTrackId(), theRace.getEventId());
								}
							}
							// Trainer changed?
							if (((null == curEC) && newEC.isTrainerChanged()) ||
								(!(curEC.isTrainerChanged() == newEC.isTrainerChanged()))) {
								// TODO: Process trainer change
							}
							// Weight changed?
							if (((null == curEC) && newEC.isWeightChanged()) ||
								(!(curEC.isWeightChanged() == newEC.isWeightChanged()))) {
								try {
									h.setHorsesweight(Integer.parseInt(theEntry.getWeight()));
									hasChanges = true;
								} catch (NumberFormatException e) {
									log4j.error("{} - Error converting new weight ({}) to an integer while trying to update the status on the RTW Race matching horseName={}, runnerNumber={}, raceId={}, trackId={}, and eventId={}", method, theEntry.getWeight(), h.getHorsesname(), theRunner.getRunnerId(), theRace.getRaceId(), parentEvent.getTrackId(), theRace.getEventId());
								}
							}
							
							// If anything changed, then update the database
							if (hasChanges) {
								h = rtwEm.merge(h);
								rtwEm.getTransaction().commit();
								performedUpdate = true;
								log4j.info("{} - Updated Horse with entry changes for RTW Horse matching horseName={}, runnerNumber={}, raceId={}, trackId={}, and eventId={}", method, h.getHorsesname(), theRunner.getRunnerId(), theRace.getRaceId(), parentEvent.getTrackId(), theRace.getEventId());
							} else {
								rtwEm.getTransaction().rollback();
							}
						} catch(Exception e) {
							log4j.error("{} - Error trying to update the status on the RTW Race matching horseName={}, runnerNumber={}, raceId={}, trackId={}, and eventId={}", method, h.getHorsesname(), theRunner.getRunnerId(), theRace.getRaceId(), parentEvent.getTrackId(), theRace.getEventId());
						}
						// Re-read and display for debugging
						rtwEm.refresh(r);
						if (log4j.isTraceEnabled()) log4j.trace("{} - Updated horse scratch indicator status to Y for RTW Horse matching horseName={}, runnerNumber={}, raceId={}, trackId={}, and eventId={}\nResulting Horse object={}", method, h.getHorsesname(), theRunner.getRunnerId(), theRace.getRaceId(), parentEvent.getTrackId(), theRace.getEventId(),h);
					} else {
						log4j.error("{} - Did not find RTW Horse matching runnerNumber={}, raceId={}, trackId={}, and eventId={}", method, theRunner.getRunnerId(), theRace.getRaceId(), parentEvent.getTrackId(), theRace.getEventId());
					}
				} else {
					log4j.error("{} - Did not find RTW Race matching trackId={}, raceId={}, and eventId={}", method, parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId());
				}
			} else {
				log4j.debug("{} - Did not find RTW Track matching trackId={} and eventId={}", method, parentEvent.getTrackId(), theRace.getEventId());
			}
			
			// Close down the persistence connections
			rtwEm.close();
			rtwEmF.close();

		}

		log4j.exit(performedUpdate);
		return performedUpdate;
	}
	
	protected boolean updateRace(String callingMethod, String updateReason, String eventId, int raceId) {
		boolean performedUpdate = false;
		String method = "ToteLinkUpdateServiceHandler.updateRace - On behalf of " + callingMethod;
		log4j.entry(method);
		log4j.debug("{} - eventId={}, raceId={}", method, eventId, raceId);

		// Get a Read-Only Entity Manager
		final EntityManagerFactory emF = Configurator.getROEMF();
		final EntityManager em = emF.createEntityManager();

		// Load and detach current race object
		UtoteRace curRace = retrieveRace(em, eventId, raceId);
		if (null == curRace) {
			log4j.error("{} - ******* Tote Race expected, but not found after retreiveRace, eventId={}, raceId={}", method, eventId, raceId);
		} else {
			log4j.debug("{} - after retreiveRace, curRace.idUtoteRace={}, eventId={}, raceId={}", method, curRace.getIdUtoteRace(), eventId, raceId);
			curRace.loadParent(em);
			assert (null != curRace.getEvent()) : method + " - curRace.getEvent() returned null after call to curRace.loadParent.";
			log4j.trace("{} - Loaded parent for newRace is new for eventId={}, raceId={}, utoteRace.idUtoteRace={}", method, eventId, raceId, curRace.getIdUtoteRace());
			
			// Make sure that this is a track type we are interested in
			if (Configurator.isSupportedTrackType(curRace.getEvent().getTrackType())) {

				// Update the race details by requesting Utote to send the most recent information about that race
				// Note, this will overwrite the details currently stored for this race
				// that is why we load the existing values above
				ProgramRequestProcessor ppr = new ProgramRequestProcessor();
				UtoteRace newRace = ppr.getRaceDetails(eventId, raceId);
				if (null == newRace) {
					log4j.error("{} - ******* Null found after getRaceDetails, eventId={}, raceId={}", method, curRace.getIdUtoteRace(), eventId, raceId);
					// Assume that post time and status in RTW may need updating
					// so do it pro-actively
					log4j.debug("{} - Still updating info in RTW.  Race not found for eventId={}, raceId={}, utoteRace.idUtoteRace={}", method, eventId, raceId, curRace.getIdUtoteRace());
					performedUpdate = updateRTWRaceStatusAndPostTime(curRace, true, /* assume status changing */
							UtoteRace.RACE_STATUS_CANCELED.equalsIgnoreCase(curRace.getRaceStatus()),
							true); /* assume post time needs to be refreshed */
					if (performedUpdate)
						log4j.warn("{} - Updated RTW database for unfound race with eventId={}, raceId={}, utoteRace.idUtoteRace={}", method, eventId, raceId, curRace.getIdUtoteRace());
				} else {
					log4j.debug("{} - After getRaceDetails, newRace.idUtoteRace={}, eventId={}, raceId={} newRace.getRunners().size={}", method, newRace.getIdUtoteRace(), eventId, raceId, (null == newRace.getRunners())?"null":newRace.getRunners().size());
					newRace.loadParent(em);
					newRace.load(em);
					log4j.debug("{} - newRace after load after getRaceDetails, newRace.idUtoteRace={}, eventId={}, raceId={} newRace.getRunners().size()={}", method, newRace.getIdUtoteRace(), eventId, raceId, newRace.getRunners().size());
					boolean raceCanceled = UtoteRace.RACE_STATUS_CANCELED.equalsIgnoreCase(newRace.getRaceStatus());
			
					// Look for changes
					boolean statusChanged = !newRace.getRaceStatus().equalsIgnoreCase(curRace.getRaceStatus());
					boolean postTimeChanged = !(newRace.getPostTime() == curRace.getPostTime());
					log4j.debug("{} - statusChanged={}, postTimeChanged={}", method, statusChanged, postTimeChanged);
					// See if the race status or post time were changed
					if (statusChanged || postTimeChanged) {
						log4j.debug("{} - statusChanged={} or postTimeChanged={}.  Calling update status for Current RaceStatus={}, new RaceStatus={},Current PostTime={}, new PostTime={} for eventId={}, raceId={}, utoteRace.idUtoteRace={}", method, statusChanged, postTimeChanged, curRace.getRaceStatus(), newRace.getRaceStatus(), curRace.getPostTime().toString(), newRace.getPostTime().toString(), eventId, raceId, newRace.getIdUtoteRace());
						performedUpdate = updateRTWRaceStatusAndPostTime(newRace, statusChanged,
								raceCanceled, postTimeChanged);
					}
					// If not canceled, then check for runner changes or scratches
					if (!raceCanceled) {
			
						log4j.debug("{} - Race has not cancelled, new status={} for eventId={}, raceId={}, utoteRace.idUtoteRace={}", method, newRace.getRaceStatus(), eventId, raceId, newRace.getIdUtoteRace());
						// Go through new runners looking for changes
						for (UtoteRunner newRunner : newRace.getRunners()) {
							// Look for matching existing runner
							log4j.trace("{} - Processing runner {} -  eventId={}, raceId={}, utoteRace.idUtoteRace={}", method, newRunner.getRunnerId(), eventId, raceId, newRace.getIdUtoteRace());
							UtoteRunner curRunner = null;
							for (UtoteRunner aRunner : curRace.getRunners()) {
								if (aRunner.getRunnerId() == newRunner.getRunnerId()) {
									curRunner = aRunner;
									break;
								}
							} /* for */
							
							// Found?
							if (null != curRunner) {
								log4j.trace("{} - Found existing runner {} -  eventId={}, raceId={}, utoteRace.idUtoteRace={}", method, newRunner.getRunnerId(), eventId, raceId, newRace.getIdUtoteRace());

								// Now see if the new runner is "newly" scratched
								if (newRunner.getScratch() && !curRunner.getScratch()) {
									for (UtoteEntry anEntry : newRunner.getEntries()) {
										log4j.debug("{} - Processing scratched runner for *ALL* entries. runner={}, entry={} -  eventId={}, raceId={}, utoteRace.idUtoteRace={}", method, newRunner.getRunnerId(), (null==anEntry.getEntryId())?"NULL":anEntry.getEntryId(), eventId, raceId, newRace.getIdUtoteRace());
										performedUpdate = scratchRTWRunner(newRace, newRunner, anEntry);
									}
								
								// Now see if the new runner is "newly" unscratched
								} else if (!newRunner.getScratch() && curRunner.getScratch()) {
									for (UtoteEntry anEntry : newRunner.getEntries()) {
										log4j.debug("{} - Unscratching runner for *ALL* entries. runner={}, entry={} -  eventId={}, raceId={}, utoteRace.idUtoteRace={}", method, newRunner.getRunnerId(), (null==anEntry.getEntryId())?"NULL":anEntry.getEntryId(), eventId, raceId, newRace.getIdUtoteRace());
										performedUpdate = unscratchRTWRunner(newRace, newRunner, anEntry);
									}
									
								// If not already scratched, check for entry changes
								} else if (!newRunner.getScratch()) {
								
									log4j.debug("{} - Runner {} is not scratched, looking for entry changes -  eventId={}, raceId={}, utoteRace.idUtoteRace={}", method, newRunner.getRunnerId(), eventId, raceId, newRace.getIdUtoteRace());
									// Now look for entrant changes (e.g. new jockey or new horse)
									Collection<UtoteEntry> curEntries = curRunner.getEntries();
									Collection<UtoteEntry> newEntries = newRunner.getEntries();
									
									// Iterate through the current entries for this runner
									for (UtoteEntry newEntry : newEntries) {
										
										// Look for the corresponding item in curEntries
										UtoteEntry curEntry = null;
										for (UtoteEntry anEntry : curEntries) {
											if ((null == newEntry.getEntryId()) && 
												(null == anEntry.getEntryId())) {
												curEntry = anEntry;
												break;
											} else if ((null != newEntry.getEntryId()) &&
												(null != anEntry.getEntryId()) &&
												(newEntry.getEntryId().equalsIgnoreCase(anEntry.getEntryId()))) {
												curEntry = anEntry;
												break;
											}
										}
										
										// If found, look for differences
										if (null != curEntry) {
											
											// Check for entry scratched
											if (newEntry.isScratch() && !curEntry.isScratch()) {
												log4j.debug("{} - Scratching CurEntry={} Runner={} -  eventId={}, raceId={}, utoteRace.idUtoteRace={}", method, curEntry.getName(), newRunner.getRunnerId(), eventId, raceId, newRace.getIdUtoteRace());
												performedUpdate = scratchRTWRunner(newRace, newRunner, newEntry);

												// Check for entry scratched
											} else if (!newEntry.isScratch() && curEntry.isScratch()) {
												log4j.debug("{} - Unscratching CurEntry={} Runner={} -  eventId={}, raceId={}, utoteRace.idUtoteRace={}", method, curEntry.getName(), newRunner.getRunnerId(), eventId, raceId, newRace.getIdUtoteRace());
												performedUpdate = unscratchRTWRunner(newRace, newRunner, newEntry);

											// If the new  entry has changes
											} else if (newEntry.hasChanges()) {
												
												UtoteEntryChange newEC = newEntry.getEntryChange();

												// If this is the first time there are changes, just update
												if (!curEntry.hasChanges()) {
													log4j.debug("{} - New Entry has changes, cur entry does not.  Entry={}, Runner={}, eventId={}, raceId={}, utoteRace.idUtoteRace={}", method, newEntry.toString(), newRunner.getRunnerId(), eventId, raceId, newRace.getIdUtoteRace());
													performedUpdate = setRTWRunnerEntryChanges(newRace, newRunner, newEntry, null, newEC);

												// Otherwise, look to see if anything new has changed
												} else {

													UtoteEntryChange curEC = curEntry.getEntryChange();
													
													// Look for any other changes
													if ((!(curEC.isJockeyChanged() == newEC.isJockeyChanged())) ||
														(!(curEC.isMedicationChanged() == newEC.isMedicationChanged())) ||
														(!(curEC.isNameChanged() == newEC.isNameChanged())) ||
														(!(curEC.isOwnerChanged() == newEC.isOwnerChanged())) ||
														(!(curEC.isPositionChanged() == newEC.isPositionChanged())) ||
														(!(curEC.isTrainerChanged() == newEC.isTrainerChanged())) ||
														(!(curEC.isWeightChanged() == newEC.isWeightChanged()))) {
														log4j.debug("{} - New Entry has changes, cur entry already had changes.  Entry={}, Runner={}, eventId={}, raceId={}, utoteRace.idUtoteRace={}", method, newEntry.toString(), newRunner.getRunnerId(), eventId, raceId, newRace.getIdUtoteRace());
														performedUpdate = setRTWRunnerEntryChanges(newRace, newRunner, newEntry, curEC, newEC);
													}
													
												}
											}
											
										} else {
											log4j.error("{} - Coould not find a matching entry in the existing runner.  Entry={}, Runner={}, eventId={}, raceId={}, utoteRace.idUtoteRace={}", method, newEntry.toString(), newRunner.getRunnerId(), eventId, raceId, newRace.getIdUtoteRace());
										}

									}
								}
							}
							
						} 
					} 
				}
			} else {
				log4j.warn("{} - Ignoring track type ({}) for eventId={}, raceId={}, utoteRace.idUtoteRace={}", method, curRace.getEvent().getTrackType(), eventId, raceId, curRace.getIdUtoteRace());
			}
		}
		em.close();
		emF.close();
		log4j.exit(performedUpdate);
		return performedUpdate;
	}
	
	private static final String UPDATE_TYPE_EVENT = "Event";
	private static final String UPDATE_TYPE_RACE = "Race";
	private static final String UPDATE_TYPE_ODDS = "Odds";
	private static final String UPDATE_TYPE_SOURCE = "Source";
	private static final String UPDATE_TYPE_BROADCAST = "Broadcast";

	private class updatesWorkerThread implements Runnable {

		private Updates _update = null;

		@SuppressWarnings("unused")
		public updatesWorkerThread() {
			this._update = null;
		}

		public updatesWorkerThread(Updates inUpdate) {
			this._update = inUpdate;
		}

		private void preserveUpdate() {
			String method = "preserveUpdate";
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
			if (log4j.isDebugEnabled()) log4j.debug("{} - Update Inserted, Unique ID={}, update={}", method, update.getIdUtoteUpdate(), update.toString());

			// Close the connections
			em.close();
			emF.close();
			
			log4j.exit(method);
		}

		private void processUpdateRace() {
			String method = "processUpdateRace";
			log4j.entry(method);
			if (updateRace(method, _update.getType(), _update.getEventId(), _update.getRaceId()))
				log4j.info("{} - eventId={}, raceId={}, data={}, Track={}, Post={}", method, _update.getEventId(), _update.getRaceId(),
					 (_update.isDataSpecified())?_update.getData():"Not Specified",
					 (_update.isTrackSpecified())?_update.getTrack():"Not Specified",
					 (_update.isPostSpecified())?(_update.getPost()?"At Post":"Not at Post"):"Not Specified");
			log4j.exit(method);
		}
		
		private void processUpdateEvent() {
			String method = "processUpdateEvent";
			log4j.entry(method);
			ProgramRequestProcessor ppr = new ProgramRequestProcessor();
			UtoteEvent utoteEvent = ppr.getEventDetails(_update.getEventId());
			log4j.info("{} - eventId={}, utoteEvent.idUtoteEvent={}", method, _update.getEventId(), (null == utoteEvent)?"NULL":utoteEvent.getIdUtoteEvent());
			log4j.exit(method);
		}
		
		/**
		 *  "Data" - describes the broadcasted data.  An "*" indicates data has multiple components
				Values may be: Event, Race, Track(*), Group(*), Surcharge, System, Program, Guide
			"Section" - Describes Data, if Data has multiple components
				Values may be: Message, Minimum, Maximum, Restriction, Terminal, Facility, Pools, Tax, Key,
				    Exclusion, Surcharge
			"Group" - Group Id for Broadcast Data = "Group"
			"Track" - Track Id for Broadcast Data = "Track" or Type = "Event"
			"Post" - Indicates race is at Post for Type = "Race"
			"Event Id" - ITSP Event Id for current events, otherwise system Id
			"RaceId" - Event Race Number
			"TrackCode" - Track Code for Broadcast Data = "Track", or Type = "Event"
		 */
		private void processUpdateTypeBroadcast() {
			String method = "processUpdateTypeBroadcast";
			log4j.info("{} - **** IGNORING UPDATE TYPE=BROADCAST **** Data={}, Group={}, Track={}, Post={}, EventId={}, RaceId={}, TrackCode={}", 
					method, 
					_update.isDataSpecified()?_update.getData():"N/A",
					_update.isGroupSpecified()?_update.getGroup():"N/A",
					_update.isTrackSpecified()?_update.getTrack():"N/A",
					_update.isPostSpecified()?_update.getPost():"N/A",
					_update.isEventIdSpecified()?_update.getEventId():"N/A",
					_update.isRaceIdSpecified()?_update.getRaceId():"N/A",
					_update.isTrackCodeSpecified()?_update.getTrackCode():"N/A"
				);
		}
		
		private void processUpdateType() {
			String method = "processUpdateType";
			log4j.entry(method);

			// Make sure that the Tote Link interface is accepting requests
			if (!linkIsUp()) {
				log4j.error("{} - *** United Tote Interface Appears to be Down - SKIPPING ToteLink Update MESSAGE *** Received an update with an Event action, but the Tote Link interface is down.", method);
				return;
			}

			// Verify that the RunId has not changed.
			// If so, then re-initialize the United Tote interface
			updateRunId(_update.getRunId());


			String uType = _update.getType();
			switch (uType) {
				case UPDATE_TYPE_EVENT:			// Do GetEvenDetail Request and update database/storage.
					processUpdateEvent();
					break;
					
				case UPDATE_TYPE_RACE:			// Do GetRace Request and update database/storage.
					processUpdateRace();		// (Less overhead than GetEvent)
					break;
					
				case UPDATE_TYPE_ODDS:			// Do GetMatrix for each pool in race for odds and pool if you are 
												// storing that information
												// * Currently tote system sends this notification every cycle whether 
												//   information has changed or not.
												// * This is typically triggered by a Host Tote system performing an 
												//   ITSP pool cycle.
												// * This indicates POTENTIAL change. You must send the requests and read 
												//   the responses to know if actual change has occurred.
					log4j.info("{} - *** IGNORING ToteLink Update ODDS MESSAGE ***", method);
					break;
					
				case UPDATE_TYPE_SOURCE:		// Do GetConfiguration for specificed source and update database/storage.
					log4j.info("{} - *** IGNORING ToteLink Update SOURCE MESSAGE ***", method);
					break;
					
				case UPDATE_TYPE_BROADCAST:			// The "Data", "Section", "Group"(*), "Track"(*), "Post", "EventId", 
					processUpdateTypeBroadcast(); 	// "RaceId" fields describes the broadcasted data
													// An "*" indicates data has multiple components
					break;
					
				default:
					assert false : method+" - ******** Unrecognized Update Type="+_update.getType();
			}
			log4j.exit(method);
		}

		// async process
		public void run() {
			ThreadContext.put("id", UUID.randomUUID().toString()); // Add the fishtag
			log4j.entry("UpdatesWorkerThread.run - siteId, runId", this._update.getSiteId(), this._update.getRunId());
			preserveUpdate();
			processUpdateType();
			log4j.debug("Before leaving UpdatesWorkerThread.run();");
			log4j.exit();
			ThreadContext.remove("id");
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param updateNotification0
	 * @return
	 */

	public void updateNotification(org.tempuri.UpdateNotificationE updateNotification0) {
		String method = "ToteLinkUpdateServiceHandler.updateNotificaiton";
		log4j.entry(method);
		
		Updates updates = updateNotification0.getUpdateNotification().getUpdates();
		if (UPDATE_TYPE_ODDS.equalsIgnoreCase(updates.getType())) {
			log4j.info("{} - *** IGNORING ToteLink Update ODDS MESSAGE ***", method);
		} else if (UPDATE_TYPE_SOURCE.equalsIgnoreCase(updates.getType())) {
			log4j.info("{} - *** IGNORING ToteLink Update SOURCE MESSAGE ***", method);
		} else if (updates.isEventIdSpecified() &&
			!Configurator.eventExists(updates.getEventId())) {
			log4j.info("{} - Ignoring message for Event Id {}, Track Type is not supported.", method, updates.getEventId());
		} else {
			ConfigurationContext confCon = MessageContext.getCurrentMessageContext().getConfigurationContext();
			ThreadFactory threadFactory = confCon.getThreadPool();
			updatesWorkerThread worker = new updatesWorkerThread(updates);
			threadFactory.execute(worker);
		}
		
		log4j.exit(method);

	}

	private class StatusNotificationWorkerThread implements Runnable {

		private StatusChange _statusChange = null;

		@SuppressWarnings("unused")
		public StatusNotificationWorkerThread() {
			this._statusChange = null;
		}

		public StatusNotificationWorkerThread(StatusChange inStatusChange) {
			this._statusChange = inStatusChange;
		}

		private void preserveStatusChange() {
			String method = "preserveStatusChange";
			log4j.entry(method);

			// Get an Entity Manager
			final EntityManagerFactory emF = Configurator.getRWEMF();
			final EntityManager em = emF.createEntityManager();
			
			// Insert a new UtoteStatusChange
			// representing the contents of this message
			em.getTransaction().begin();
			UtoteStatusChange statusChange = new UtoteStatusChange();
			statusChange.setSiteId(_statusChange.getSiteId());
			statusChange.setRunId(
					((null == _statusChange.getRunId()) || _statusChange.getRunId().isEmpty())?
							0
							:
							Integer.parseInt(_statusChange.getRunId()));
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
			if(log4j.isDebugEnabled()) log4j.debug("{} - StatusChange Inserted, Unique ID={}, statusChange={}", method, statusChange.getIdUtoteStatusChange(), statusChange.toString());

			// Close the connections
			em.close();
			emF.close();
			
			log4j.exit(method);
		}

		static final String STATUS_CHANGE_ACTION_OPEN			= "open";		// Race/terminal is open for wagering
		static final String STATUS_CHANGE_ACTION_CLOSED			= "closed";		// Race/terminal is closed for wagering
		static final String STATUS_CHANGE_ACTION_DEACTIVATE		= "deactivate";	// Terminal is deactivated

		static final String STATUS_CHANGE_ACTION_INITIALIZE		= "initialize";	// System is initialized
		static final String STATUS_CHANGE_ACTION_START			= "start";		// System is starting
		static final String STATUS_CHANGE_ACTION_END			= "end";		// System is cleaning up
		static final String STATUS_CHANGE_ACTION_STOP			= "stop";		// System is terminating
		static final String STATUS_CHANGE_ACTION_RESET			= "reset";		// Reset or initiate MTP for Race or terminal is reset

		static final String STATUS_CHANGE_ACTION_ADD			= "add";		// Event added
		static final String STATUS_CHANGE_ACTION_DONE			= "done";		// Event is done

		static final String STATUS_CHANGE_ACTION_BEGIN			= "begin";		// Race is open for wagering, and is the current race
		static final String STATUS_CHANGE_ACTION_POST			= "post";		// Race is post, no new wagers accepted
		static final String STATUS_CHANGE_ACTION_LOCKED			= "locked";		// Race is locked, no cancels accepted
		static final String STATUS_CHANGE_ACTION_UNOFFICIAL		= "unofficial";	// Race is not official and no cashing allowed
		static final String STATUS_CHANGE_ACTION_FINAL			= "final";		// Race is final, prices are available
		static final String STATUS_CHANGE_ACTION_CANCELLED		= "cancelled";	// Race is cancelled and closed to wagering
		static final String STATUS_CHANGE_ACTION_UNCANCEL		= "uncancel";	// Race is uncancelled and may be open for wagering

		static final String STATUS_CHANGE_ACTION_KEEPALIVE		= "keepalive";	// Every xx second to keep the communication alive if there is no activity within that timeframe

		private void processTerminalActions(String uAction) {
			String method = "processTerminalActions";
			log4j.entry(method+" - uAction", uAction);
			switch (uAction) {
				case STATUS_CHANGE_ACTION_OPEN:			// Terminal is open for wagering
					if (!linkIsUp()) {
						// Re-initialize the United Tote interface
						log4j.debug("{} - *** Received Action = {} *** Performing Initialization", method, uAction);
						(new ToteLinkInitializationServiceHandler()).performInitialization();
						log4j.info("{} - *** Received Action = {} *** Initialization complete", method, uAction);
					} else {
						log4j.info("{} - *** Received Action = {} *** Link is already up, skipping initialization complete", method, uAction);
					}
					break;
				case STATUS_CHANGE_ACTION_CLOSED:		// Terminal is closed for wagering
					log4j.info("{} - *** Received Action = {} *** Closing Link", method, uAction);
					setLinkState(false);
					break;
				case STATUS_CHANGE_ACTION_DEACTIVATE:	// Terminal is deactivated
					log4j.info("{} - *** Received Action = {} *** Deactivating Link", method, uAction);
					setLinkState(false);
					break;
				case STATUS_CHANGE_ACTION_RESET:		// Terminal is reset
					// Re-initialize the United Tote interface
					log4j.info("{} - *** Received Action = {} *** Ignoring (per suggestion in documentation)", method, uAction);
					break;
			}
			log4j.exit();
		}
		

		private boolean processEndAction() {
			String method = "processEndActions";
			log4j.entry(method);
			boolean success = false;
			setLinkState(false);
			// Clear out the database by moving the days data into the 
			// history tables
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
				log4j.error(method+" - *** Received Action = END *** Query timedout calling database procedure PrepareUtoteForNewDay *** - "+e.getMessage(),e);
			} catch (PersistenceException e) {
				log4j.error(method+" - *** Received Action = END *** Persistence Exception calling database procedure PrepareUtoteForNewDay *** - "+e.getMessage(),e);
			} catch (Exception e) {
				log4j.error(method+" - *** Received Action = END *** Unexpected Exception calling database procedure PrepareUtoteForNewDay *** - "+e.getMessage(),e);
			} finally {
				if (em.getTransaction().isActive()) em.getTransaction().rollback();
				em.close();
				emF.close();
			}
			log4j.exit(method+" - "+(success?"SUCCESS":"FAILURE"));
			return success;
		}
		
		private void processSystemActions(String uAction) {
			String method = "processSystemActions";
			log4j.entry(method+" - uAction", uAction);
			switch (uAction) {
				case STATUS_CHANGE_ACTION_INITIALIZE:	// System is initialized
					// Re-initialize the United Tote interface
					// Tote system is active and ready for interaction
					log4j.debug("{} - *** Received Action = {} *** Waiting for Tote to return Okay", method, uAction);
					// CheckToteStatus should return blank at this point. (Its okay)
					(new ToteLinkInitializationServiceHandler()).waitForOkay();
					log4j.info("{} - *** Received Action = {} *** Tote returned Okay", method, uAction);
					break;
				case STATUS_CHANGE_ACTION_START:		// System is starting
					// Tote system is starting
					// The system may not be ready for several seconds to minutes after this message
					// Begin morning startup routine (Check ToteStatus)
					// Update RunId if in use to track ToteSystem Runs
					log4j.info("{} - *** Received Action = {} *** Performing Start response", method, uAction);
					(new ToteLinkInitializationServiceHandler()).performStart();
					break;
				case STATUS_CHANGE_ACTION_END:			// System is cleaning up
					log4j.info("{} - *** Received Action = {} *** Ending Link", method, uAction);
					if (processEndAction()) {
						log4j.info("{} - *** Received Action = {} *** System prepared for next day", method, uAction);
					}
					break;
				case STATUS_CHANGE_ACTION_STOP:			// System is terminating
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
					ThreadContext.put("id", _eventId + "-" + UUID.randomUUID().toString()); // Add the fishtag
					log4j.entry("processEventAdd.GetEventDetaisWorker.run - _eventId = {}", _eventId);
					ProgramRequestProcessor ppr = new ProgramRequestProcessor();
					UtoteEvent eventDetails = ppr.getEventDetails(_eventId);
					log4j.debug("processEventAdd.GetEventDetailsWorker.run - eventDetails.idUtoteEvent={}", (null == eventDetails)?"null":eventDetails.getIdUtoteEvent());
					log4j.exit();
					ThreadContext.remove("id");
				}
				
			}
			
			ConfigurationContext confCon = null;
			try {
				confCon = ConfigurationContextFactory.createDefaultConfigurationContext();
			} catch (Exception e) {
				log4j.error("{} - Unable to create default configuration context in order to spawn thread for adding eventId={}\n{}\n{}", method, _statusChange.getEventId(), e.getMessage(), e);
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
				TypedQuery<UtoteEvent> q = em.createNamedQuery("UtoteEvent.findByEventId",UtoteEvent.class);
				q.setParameter("eventId", _statusChange.getEventId());
				em.getTransaction().begin();
				theEvent = q.getSingleResult();
				theEvent.setEventStatus(UtoteEvent.EVENT_STATUS_FINISHED);
				em.merge(theEvent);
				em.getTransaction().commit();
				log4j.info("{} - *** Received Action Done for Event Id=", method, this._statusChange.getEventId());
				success = true;
			} catch (java.lang.IllegalArgumentException e) {
				log4j.error("{} - Bad query argument trying to find Event with eventId={} in order to mark as \"Done\"", method, _statusChange.getEventId());
			} catch (javax.persistence.NoResultException e) {
				log4j.error("{} - Event with eventId={} was not found in order to mark as \"Done\"", method, _statusChange.getEventId());
			} catch (QueryTimeoutException e) {
				log4j.error("{} - *** Query timedout finding *** - {} {}", method, e.getMessage(), e);
			} catch (PersistenceException e) {
				log4j.error("{} - *** Persistence Exception trying to find Event with eventId={} in order to mark as \"Done\"\n{}\n{}", method, _statusChange.getEventId(),e.getMessage(), e);
			} catch (Exception e) {
				log4j.error("{} - *** Unexpected Exception trying to find Event with eventId={} in order to mark as \"Done\"\n{}\n{}", method, _statusChange.getEventId(), e.getMessage(),e);
			} finally {
				if (em.getTransaction().isActive()) em.getTransaction().rollback();
				em.close();
				emF.close();
			}
			log4j.exit(method+" - "+(success?"SUCCESS":"FAILURE"));
			return success;			
		}
		
		private void processEventActions(String uAction) {
			String method = "processEventActions";
			log4j.entry(method + " - uAction", uAction);
			log4j.debug("{}, Status = {}", method, _statusChange.getStatus());

			// Make sure that the Tote Link interface is accepting requests
			if (!linkIsUp()) {
				log4j.error("{} - *** SKIPPING ToteLink StatusChange MESSAGE *** Received a Status Change request with an Event action, but the Tote Link interface is down.", method);
				return;
			}

			// Verify that the RunId has not changed.
			// If so, then re-initialize the United Tote interface
			updateRunId(_statusChange.getRunId());

			switch (uAction) {
				case STATUS_CHANGE_ACTION_ADD:			// Event has been added to the Tote system
					processEventAdd();					// Do GetEventDetail for specified event and update 
														// database/storage
														// Do GetMatrix for odds for this event as specified in morning startup
					break;
					
				case STATUS_CHANGE_ACTION_DONE:			// Event is done
					processEventDone();					// Update database/Storage to set event status to done/closed.
					break;
			}
			log4j.exit(method);
		}
		
		private String getUltimateStatus(String defaultStatus) {
			String outStatus = defaultStatus;
			switch (this._statusChange.getStatus()) {
			case "open" :
					outStatus = UtoteRace.RACE_STATUS_OPEN;
					break;
			case "closed" :
					outStatus = UtoteRace.RACE_STATUS_CLOSED;
					break;
			case "final" :
					outStatus = UtoteRace.RACE_STATUS_FINAL;
					break;
			case "post" :
					outStatus = UtoteRace.RACE_STATUS_POST;
					break;
			case "cancelled" :
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
				TypedQuery<UtoteRace> q = em.createNamedQuery("UtoteRace.findSpecificWithValidTrackType", UtoteRace.class);
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
				log4j.debug("{} - Updated Race Status for raceId={} and eventId={} in order to mark as \"{}\", Event={}", method, _statusChange.getRaceId(), _statusChange.getEventId(), status, theRace.getEvent().toString());
			} catch (java.lang.IllegalArgumentException e) {
				log4j.error("{} - Bad query argument trying to find Race with raceId={} and eventId={} in order to mark as \"{}\"", method, _statusChange.getRaceId(), _statusChange.getEventId(), status);
			} catch (javax.persistence.NoResultException e) {
				log4j.warn("{} - Race with raceId={}, trackType={}, eventId={} was not found in order to mark as \"{}\".  Possible invalid track type.", method, _statusChange.getRaceId(), theRace.getTrackType(), _statusChange.getEventId(), status);
			} catch (QueryTimeoutException e) {
				log4j.error("{} - *** Query timedout finding Race with raceId={} and eventId={} in order to mark as \"{}\"\n{}\n{}", method, _statusChange.getRaceId(), _statusChange.getEventId(), status, e.getMessage(), e);
			} catch (PersistenceException e) {
				log4j.error("{} - *** Persistence Exception trying to find Race with raceId={} and eventId={} in order to mark as \"{}\"\n{}\n{}", method, _statusChange.getRaceId(), _statusChange.getEventId(), status, e.getMessage(), e);
			} catch (Exception e) {
				log4j.error("{} - *** Unexpected Exception trying to find Race with raceId={} and eventId={} in order to mark as \"{}\"\n{}\n{}", method, _statusChange.getRaceId(), _statusChange.getEventId(), status, e.getMessage(),e);
			} finally {
				if (em.getTransaction().isActive()) em.getTransaction().rollback();
				em.close();
				emF.close();
			}
			log4j.exit(method);
			return theRace;
		}
		
		// Race is open for wagering 
		// Update database/storage to set Race Status to Open. (wagering possible)
		private boolean processRaceOpen() {
			final String method = "processRaceOpen";
			log4j.entry(method);
			UtoteRace theRace = updateRaceStatus(method, UtoteRace.RACE_STATUS_OPEN);
			log4j.debug("{} - After updateRaceStatus - eventId={}, raceId={}", method, _statusChange.getEventId(), _statusChange.getRaceId());
			if (null != theRace) {
				updateRTWRaceStatusAndPostTime(theRace, true, false, true);
				log4j.info("{} - *** Action = Race open *** Updated Race Status and Post Time for raceId={} and eventId={} in order to mark as \"{}\", and set post time to \"{}\" for Event={}", method, _statusChange.getRaceId(), _statusChange.getEventId(), UtoteRace.RACE_STATUS_OPEN, (null == theRace.getPostTime())?"NULL":theRace.getPostTime().toString(), (null == theRace.getEvent())?"NULL":theRace.getEvent().toString());
			}
			log4j.exit(method);
			return (null != theRace);
		}

		// Race is open for wagering, and is the current race
		// Indicates minutes to post has been set on this race.
		// * Update database/Storage to set race status to Open if not
		// * Wait ~5 seconds and Do GetWillpays request for any pool which is now in its last leg.
		// * May be used to trigger display rotations or other custom business logic
		private boolean processRaceBegin() {
			final String method = "processRaceBegin";
			log4j.entry(method);
			UtoteRace theRace = updateRaceStatus(method, UtoteRace.RACE_STATUS_OPEN);
			log4j.debug("{} - After updateRaceStatus - eventId={}, raceId={}", method, _statusChange.getEventId(), _statusChange.getRaceId());
			if (null != theRace) {
				updateRTWRaceStatusAndPostTime(theRace, true, false, true);
				log4j.info("{} - *** Action = Race begin *** Updated Race Status and Post Time for raceId={} and eventId={} in order to mark as \"{}\", and set post time to \"{}\" for Event={}", method, _statusChange.getRaceId(), _statusChange.getEventId(), UtoteRace.RACE_STATUS_OPEN, (null == theRace.getPostTime())?"NULL":theRace.getPostTime().toString(), (null == theRace.getEvent())?"NULL":theRace.getEvent().toString());
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
			log4j.debug("{} - After updateRaceStatus - eventId={}, raceId={}", method, _statusChange.getEventId(), _statusChange.getRaceId());
			if (null != theRace) {
				updateRTWRaceStatusAndPostTime(theRace, true, false, true);
				log4j.info("{} - *** Action = Race post *** Updated Race Status and Post Time for raceId={} and eventId={} in order to mark as \"{}\", and set post time to \"{}\" for Event={}", method, _statusChange.getRaceId(), _statusChange.getEventId(), UtoteRace.RACE_STATUS_OPEN, (null == theRace.getPostTime())?"NULL":theRace.getPostTime().toString(), (null == theRace.getEvent())?"NULL":theRace.getEvent().toString());
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
			log4j.debug("{} - After updateRaceStatus - eventId={}, raceId={}", method, _statusChange.getEventId(), _statusChange.getRaceId());
			if (null != theRace) {
				updateRTWRaceStatusAndPostTime(theRace, true, false, false);
				log4j.info("{} - *** Action = Race closed *** Updated Race Status and Post Time for raceId={} and eventId={} in order to mark as \"{}\", and set post time to \"{}\" for Event={}", method, _statusChange.getRaceId(), _statusChange.getEventId(), UtoteRace.RACE_STATUS_OPEN, (null == theRace.getPostTime())?"NULL":theRace.getPostTime().toString(), (null == theRace.getEvent())?"NULL":theRace.getEvent().toString());
			}
			log4j.exit(method);
			return (null != theRace);
		}

		// Race is locked, no cancels accepted
		// Update database/Storage to set race status to locked. 
		// (cancelling not possible, wagering possible)
		// * This status is not currently transmitted to end points, please see/use Post.
		private boolean processRaceLocked() {
			final String method = "processRaceLocked";
			log4j.entry(method);
			UtoteRace theRace = updateRaceStatus(method, UtoteRace.RACE_STATUS_LOCKED);
			log4j.debug("{} - After updateRaceStatus - eventId={}, raceId={}", method, _statusChange.getEventId(), _statusChange.getRaceId());
			if (null != theRace && Configurator.isSupportedTrackType(theRace.getTrackType())) {
				updateRTWRaceStatusAndPostTime(theRace, true, false, false);
				log4j.info("{} - *** Action = Race locked *** Updated Race Status and Post Time for raceId={} and eventId={} in order to mark as \"{}\", and set post time to \"{}\" for Event={}", method, _statusChange.getRaceId(), _statusChange.getEventId(), UtoteRace.RACE_STATUS_OPEN, (null == theRace.getPostTime())?"NULL":theRace.getPostTime().toString(), (null == theRace.getEvent())?"NULL":theRace.getEvent().toString());
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
			log4j.debug("{} - After updateRaceStatus - eventId={}, raceId={}", method, _statusChange.getEventId(), _statusChange.getRaceId());
			if (null != theRace) {
				updateRTWRaceStatusAndPostTime(theRace, true, false, false);
				log4j.info("{} - *** Action = Race unofficial *** Updated Race Status and Post Time for raceId={} and eventId={} in order to mark as \"{}\", and set post time to \"{}\" for Event={}", method, _statusChange.getRaceId(), _statusChange.getEventId(), UtoteRace.RACE_STATUS_OPEN, (null == theRace.getPostTime())?"NULL":theRace.getPostTime().toString(), (null == theRace.getEvent())?"NULL":theRace.getEvent().toString());
			}
			log4j.exit(method);
			return (null != theRace);
		}
		
		// Race is final, prices are available
		// Update database/Storage to set race status to Final
		// (Wagering not possible)
		// Trigger GetMatrix in Prices format for all pools in this race.
		// Wait ~5 seconds and check a single ticket for payoff element.
		// - If payoff element exists InquireTicket for all outstanding/pending wagers in this race.
		// - If payoff element does not exist repeat wait and try again.
		private boolean processRaceFinal() {
			final String method = "processRaceFinal";
			log4j.entry(method);
			UtoteRace theRace = updateRaceStatus(method, UtoteRace.RACE_STATUS_FINAL);
			log4j.debug("{} - After updateRaceStatus - eventId={}, raceId={}", method, _statusChange.getEventId(), _statusChange.getRaceId());
			if (null != theRace) {
				updateRTWRaceStatusAndPostTime(theRace, true, false, false);
				log4j.info("{} - *** Action = Race final *** Updated Race Status and Post Time for raceId={} and eventId={} in order to mark as \"{}\", and set post time to \"{}\" for Event={}", method, _statusChange.getRaceId(), _statusChange.getEventId(), UtoteRace.RACE_STATUS_OPEN, (null == theRace.getPostTime())?"NULL":theRace.getPostTime().toString(), (null == theRace.getEvent())?"NULL":theRace.getEvent().toString());
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
			log4j.debug("{} - After updateRaceStatus - eventId={}, raceId={}", method, _statusChange.getEventId(), _statusChange.getRaceId());
			if (null != theRace) {
				updateRTWRaceStatus(theRace, true);
				log4j.info("{} - *** Action = Race cancelled *** Updated Race Status and Post Time for raceId={} and eventId={} in order to mark as \"{}\", and set post time to \"{}\" for Event={}", method, _statusChange.getRaceId(), _statusChange.getEventId(), UtoteRace.RACE_STATUS_OPEN, (null == theRace.getPostTime())?"NULL":theRace.getPostTime().toString(), (null == theRace.getEvent())?"NULL":theRace.getEvent().toString());
			}
			log4j.exit(method);
			return (null != theRace);
		}
		
		// Race is uncancelled and may be open for wagering
		// Update database/Storage to set race status to Uncancelled 
		// (Wagering may be possible if followed by Open notice)
		// * For most uses this status can be ignored and simply wait on Open
		// * Some clients may wish to trigger an alert on this as it could signify problems in reporting etc.
		private boolean processRaceUncancelled() {
			final String method = "processRaceUncancelled";
			log4j.entry(method);
			UtoteRace theRace = updateRaceStatus(method, UtoteRace.RACE_STATUS_UNCANCELED);
			log4j.debug("{} - After updateRaceStatus - eventId={}, raceId={}", method, _statusChange.getEventId(), _statusChange.getRaceId());
			if (null != theRace) {
				updateRTWRaceStatusAndPostTime(theRace, true, false, true);
				log4j.info("{} - *** Action = Race uncancelled *** Updated Race Status and Post Time for raceId={} and eventId={} in order to mark as \"{}\", and set post time to \"{}\" for Event={}", method, _statusChange.getRaceId(), _statusChange.getEventId(), UtoteRace.RACE_STATUS_OPEN, (null == theRace.getPostTime())?"NULL":theRace.getPostTime().toString(), (null == theRace.getEvent())?"NULL":theRace.getEvent().toString());
			}
			log4j.exit(method);
			return (null != theRace);
		}
		
		// MTP has been reset
		// If MTP – Indicates minutes to post has been manually set again, may be different
		// If MTP – Do GetRace to get new posttime. 
		// DO NOT USE MTP IN NOTIFICATION TO SET POST TIME!
		private boolean processRaceReset() {
			final String method = "processRaceReset";
			log4j.entry(method);
			boolean success = false;
			log4j.debug("{} - Updating (re-retrieving) Race info for eventId={}, raceId={}", method, _statusChange.getEventId(), _statusChange.getRaceId());
			ProgramRequestProcessor ppr = new ProgramRequestProcessor();
			UtoteRace theRace = ppr.getRace(_statusChange.getEventId(), _statusChange.getRaceId());
			if (null != theRace) {
				updateRTWRaceStatusAndPostTime(theRace, false/*no status change*/, false/*not canceled*/, true/*update post time*/);
				log4j.info("{} - *** Action = Race reset *** Updated Race Status and Post Time for raceId={} and eventId={} in order to mark as \"{}\", and set post time to \"{}\" for Event={}", method, _statusChange.getRaceId(), _statusChange.getEventId(), UtoteRace.RACE_STATUS_OPEN, (null == theRace.getPostTime())?"NULL":theRace.getPostTime().toString(), (null == theRace.getEvent())?"NULL":theRace.getEvent().toString());
				success = true;
			} else {
				log4j.error("{} - COULD NOT UPDATE (re-retrieve) Race info for eventId={}, raceId={}", method, _statusChange.getEventId(), _statusChange.getRaceId());
			}
			log4j.exit(method);
			return success;
		}
		
		private void processRaceActions(String uAction) {
			String method = "processRaceActions";
			log4j.entry(method+" - uAction", uAction);
			log4j.debug("{} - uAction={}, Status={}", method, uAction, _statusChange.getStatus());

			// Make sure that the Tote Link interface is accepting requests
			if (!linkIsUp()) {
				log4j.error("{} - *** SKIPPING ToteLink StatusChange  MESSAGE *** Received a Status Change request with a Race action, but the Tote Link interface is down.", method);
				return;
			}

			// Verify that the RunId has not changed.
			// If so, then re-initialize the United Tote interface
			updateRunId(_statusChange.getRunId());

			switch (uAction) {

				case STATUS_CHANGE_ACTION_OPEN:			// Race is open for wagering
					processRaceOpen();					// Update database/storage
														// to set Race Status to Open. 
														// (wagering possible)
					break;
					
				case STATUS_CHANGE_ACTION_BEGIN:		// Race is open for wagering, and is the current race
					processRaceBegin();					// Indicates minutes to post has been set on this race.
														// * Update database/Storage to set race status to Open if not
														// * Wait ~5 seconds and Do GetWillpays request for any pool which is now in its last leg.
														// * May be used to trigger display rotations or other 
														//   custom business logic
					break;
					
				case STATUS_CHANGE_ACTION_POST:			// Race is post, no new wagers accepted
					processRacePost();					// Update database/Storage to set race status to Post
					break;
					
				case STATUS_CHANGE_ACTION_CLOSED:		// Race is closed for wagering
					processRaceClosed();				// Update database/storage to 
														// set race status to Closed 
														// (wagering not possible)
					break;
				case STATUS_CHANGE_ACTION_LOCKED:		// Race is locked, no cancels accepted
					processRaceLocked();				// Update database/Storage to set race status to locked. 
														// (cancelling not possible, wagering possible)
														// * This status is not currently transmitted to end points.
														// please see/use Post.
					break;
					
				case STATUS_CHANGE_ACTION_UNOFFICIAL:	// Race is not official and no cashing allowed
					processRaceUnofficial();			// Update database/Storage to reset race to Final status
														// Remove all payoff data from all tickets associated with race
					break;
					
				case STATUS_CHANGE_ACTION_FINAL:		// Race is final, prices are available
					processRaceFinal();					// Update database/Storage to set race status to Final
														// (Wagering not possible)
														// Trigger GetMatrix in Prices format for all pools in this race.
														// Wait ~5 seconds and check a single ticket for payoff element.
														// - If payoff element exists InquireTicket for all outstanding/pending wagers in this race.
														// - If payoff element does not exist repeat wait and try again.
					break;
					
				case STATUS_CHANGE_ACTION_CANCELLED:	// Race is cancelled and closed to wagering
					processRaceCancelled();				// Update database/Storage to set race status to Cancelled 
														// (wagering not possible)
					break;
					
				case STATUS_CHANGE_ACTION_UNCANCEL:		// Race is uncancelled and may be open for wagering
					processRaceUncancelled();			// Update database/Storage to set race status to Uncancelled 
														// (Wagering may be possible if followed by Open notice)
														// * For most uses this status can be ignored and simply wait on Open
														// * Some clients may wish to trigger an alert on this as it could signify problems in reporting etc.
					break;
					
				case STATUS_CHANGE_ACTION_RESET:		// MTP has been reset
					processRaceReset();					// If MTP – Indicates minutes to post has been manually 
														// set again, may be different
														// If MTP – Do GetRace to get new posttime. 
														// DO NOT USE MTP IN NOTIFICATION TO SET POST TIME!
					break;

				// This should never happen
				default :
					log4j.error("{} - Unrecognized action type! uAction = {}", method, uAction);
					throw ExceptionFactory.makeWebServiceException(method+" - Unrecognized action type! uAction="+uAction);
					
			}
			log4j.exit();
		}
		
		private void processKeepalive() {
			String method = "processKeepalive";
			log4j.entry(method);
			log4j.info("{} - *** Action = Keepalive *** Ignoring", method);
			log4j.exit();
		}

		private void processActionType() throws Exception {
			String method = "processActionType";
			log4j.entry(method);
			String uAction = _statusChange.getAction();
			log4j.debug("{} - uAction={}", method, uAction);
			if (_statusChange.isRaceIdSpecified()  && _statusChange.getRaceId() > 0) {
				processRaceActions(uAction);
			} else switch (uAction) {
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
					throw ExceptionFactory.makeWebServiceException(method+" - Unrecognized action type! uAction="+uAction);
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
		public void run() {
			ThreadContext.put("id", UUID.randomUUID().toString()); // Add the fishtag
			log4j.entry("StatusNotificationWorkerThread.run - siteId, runId", this._statusChange.getSiteId(), this._statusChange.getRunId());
			preserveStatusChange();
			processStatusChange();
			log4j.exit("StatusNotificationWorkerThread.run");
			ThreadContext.remove("id");
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param statusNotification1
	 * @return
	 */

	public void statusNotification(org.tempuri.StatusNotificationE statusNotification1) {
		log4j.entry("ToteLinkUpdateServiceHandler.statusNotification");

		if (statusNotification1.getStatusNotification().getStatusChange().isEventIdSpecified() &&
			!Configurator.eventExists(statusNotification1.getStatusNotification().getStatusChange().getEventId())) {
			log4j.warn("ToteLinkUpdateServiceHandler.statusNotification - Ignoring message for Event Id {}, Track Type is not supported.",statusNotification1.getStatusNotification().getStatusChange().getEventId());
		} else {
			ConfigurationContext confCon = MessageContext.getCurrentMessageContext().getConfigurationContext();
			ThreadFactory threadFactory = confCon.getThreadPool();
			StatusNotificationWorkerThread worker = new StatusNotificationWorkerThread(
					statusNotification1.getStatusNotification().getStatusChange());
			threadFactory.execute(worker);
		}
		
		log4j.exit("ToteLinkUpdateServiceHandler.statusNotification Leaving updateNotification");

	}

}
