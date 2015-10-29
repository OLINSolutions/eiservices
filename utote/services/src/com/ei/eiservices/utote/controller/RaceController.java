package com.ei.eiservices.utote.controller;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.concurrent.locks.ReentrantLock;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ei.eiservices.utote.Configurator;
import com.ei.eiservices.utote.client.processor.ResultRequestProcessor;
import com.ei.eiservices.utote.model.Category;
import com.ei.eiservices.utote.model.Game;
import com.ei.eiservices.utote.model.Horse;
import com.ei.eiservices.utote.model.Jockeysresult;
import com.ei.eiservices.utote.model.Mypick;
import com.ei.eiservices.utote.model.Race;
import com.ei.eiservices.utote.model.Result;
import com.ei.eiservices.utote.model.Usergame;
import com.ei.eiservices.utote.model.Usersemail;
import com.ei.eiservices.utote.model.UtoteEntry;
import com.ei.eiservices.utote.model.UtoteEntryChange;
import com.ei.eiservices.utote.model.UtoteEvent;
import com.ei.eiservices.utote.model.UtoteRace;
import com.ei.eiservices.utote.model.UtoteResult;
import com.ei.eiservices.utote.model.UtoteRunner;


public class RaceController implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final Logger log4j = LogManager.getLogger(RaceController.class);

    public static final String RACE_STATUS_OPEN			= "Open";
    public static final String RACE_STATUS_CLOSED		= "Closed";
    public static final String RACE_STATUS_POST			= "Post";
    public static final String RACE_STATUS_FINAL		= "Final";
    public static final String RACE_STATUS_CANCELED		= "Canceled";
    public static final String RACE_STATUS_UNCANCELED	= "Uncanceled";
    public static final String RACE_STATUS_LOCKED		= "Locked";



    public RaceController() {
    }

    public static Collection<UtoteRace> findByParent(EntityManager em, int idParent) {
        String method = "UtoteRace.findRacesByParent";
        log4j.entry(method);

        Collection<UtoteRace> raceList = null;
        try {
            TypedQuery<UtoteRace> q = em.createNamedQuery("UtoteRace.findByParent", UtoteRace.class);
            q.setParameter("idParent", idParent);
            raceList = q.getResultList();
        } catch (javax.persistence.NoResultException nre) {
            log4j.debug("{} - Received NoResultException looking for races with parentId(idUtoteEvent)={}",
                    method, idParent);
        } catch (Exception e) {
            log4j.error("{} - Received Exception looking for races with parentId(idUtoteEvent)={}, ExceptionMsg={}, Exception={}",
                    method, idParent, e.getMessage(), e);
        }
        log4j.exit(method+" - " + ((null == raceList) ? "NOT FOUND" : "FOUND"));
        return raceList;
    }

    // Find and deeply retrieve the requested race, but detach it from
    // the associated EM.
    public static UtoteRace findSpecific(EntityManager em, String eventId, int raceId) {
        String method = "UtoteRace.findSpecificRace";
        log4j.entry(method);
        UtoteRace utoteRace = null;
        TypedQuery<UtoteRace> q = em.createNamedQuery("UtoteRace.findSpecific", UtoteRace.class);
        q.setParameter("eventId", eventId);
        q.setParameter("raceId", raceId);
        try {
            utoteRace = q.getSingleResult();
            utoteRace.loadParent(em);
            utoteRace.load(em, null);
            utoteRace.detach(em);
            assert(null != utoteRace.getEvent()) : method + " - curRace.getEvent() returned null after call to curRace.loadParent.";
            log4j.debug("{} - Loaded parent for newRace is new for eventId={}, raceId={}, utoteRace.idUtoteRace={}",
                    method, eventId, raceId, utoteRace.getIdUtoteRace());
        } catch (javax.persistence.NoResultException e) {
            log4j.debug("{} - Received NoResultException looking for race with eventId={} and raceId={}",
                    method, eventId, raceId);
        }
        log4j.exit(method+" - " + ((null == utoteRace) ? "NOT FOUND" : "FOUND"));
        return utoteRace;
    }

    // Get race list based on parent id
    private static Result newResult(UtoteEvent parentEvent, Race r, Horse h) {
        // Create and initialize the result object for the current horse
        Result res = new Result();
        res.setRacesid(r.getRacesid());
        res.setResultshorsesid(h.getHorsesid());
        //Format: FINALD + YYYYMMDD + _ + R# + TRK + _ + CTR, e.g. FINALD20150925_02GP_USA
        //Format: UTOTEFINAL_DG_ + YYYYMMDD + _ + R# + TRK + _ + CTR, e.g. UTOTEFINALDG_20150925_02GP_USA
        LocalDateTime ldt = LocalDateTime.ofEpochSecond(parentEvent.getRtwEventDate(), 0, ZoneOffset.UTC);
        char country = parentEvent.getRtwTimezoneName().charAt(0);
        res.setResultsracetag(
                "UTOTEFINAL_DG_"
                        + ldt.format(DateTimeFormatter.BASIC_ISO_DATE)
                        + "_"
                        + String.format("%02d", r.getRacesnumber())
                        + parentEvent.getRtwTracksuniquecode()
                        + "_"
                        + ((country == 'U')?"USA":(country == 'C')?"CAN":(country == 'P')?"PR":"UNK")
                );
        res.setResultswinamount(0);
        res.setResultsplaceamount(0);
        res.setResultsshowamount(0);
        return res;
    }

    private static Jockeysresult newJockeysresult(UtoteEvent parentEvent, Race r, Horse h) {
        // Create and initialize the result object for the current Jockey
        Jockeysresult res = new Jockeysresult();
        res.setRacesid(r.getRacesid());
        res.setHorsesid(h.getHorsesid());
        res.setJockeyid(h.getJockeyid());
        //Format: FINALD + YYYYMMDD + _ + R# + TRK + _ + CTR, e.g. FINALD20150925_02GP_USA
        //Format: UTOTEFINAL_JD_ + YYYYMMDD + _ + R# + TRK + _ + CTR, e.g. UTOTEFINAL_JD_20150925_02GP_USA
        LocalDateTime ldt = LocalDateTime.ofEpochSecond(parentEvent.getRtwEventDate(), 0, ZoneOffset.UTC);
        char country = parentEvent.getRtwTimezoneName().charAt(0);
        res.setJockeysresultsracetag(
                "UTOTEFINALJD_"
                        + ldt.format(DateTimeFormatter.BASIC_ISO_DATE)
                        + "_"
                        + String.format("%02d", r.getRacesnumber())
                        + parentEvent.getRtwTracksuniquecode()
                        + "_"
                        + ((country == 'U')?"USA":(country == 'C')?"CAN":(country == 'P')?"PR":"UNK")
                );
        res.setJockeysresultswinamounts(0);
        res.setJockeysresultsplaceamounts(0);
        res.setJockeysresultsshowamounts(0);
        res.setJockeysresultstotalamounts(0);
        return res;
    }

    private static final ReentrantLock synchronousFinalProcessingLock = new ReentrantLock(true); // Fair threading model to prevent barging

    public static void processRaceFinal(UtoteRace theRace) {
        String method = "RaceController.processRaceFinal";
        log4j.entry(method + " - eventId, raceId", theRace.getEventId(), theRace.getRaceId());

        // Always lock the thread to force synchronous execution
        log4j.info("{} - About to process a Final status for Event={} and Race={}.",
                method, theRace.getEventId(), theRace.getRaceId());
        synchronousFinalProcessingLock.lock();
        log4j.info("{} - Lock aquired to process a Final status for Event={} and Race={}.",
                method, theRace.getEventId(), theRace.getRaceId());

        try {

            // Look for the parent event(Track) for this race
            //   and make sure our RTW event info was loaded; could be an unsupported track
            UtoteEvent parentEvent = theRace.getOrLoadParent(method);
            if ((null != parentEvent) &&
                    (parentEvent.getRtwTracksid() != 0)) {

                log4j.debug(
                        "{} - Found RTW Event matching eventId={}, tracksid={}, trackId={}",
                        method, theRace.getEventId(), parentEvent.getRtwTracksid(), parentEvent.getTrackId());

                // Get Entity Managers
                final EntityManagerFactory rtwEmF = Configurator.getRTWEMF();
                final EntityManager rtwEm = rtwEmF.createEntityManager();

                // Find the matching race in our system
                Race r = theRace.loadRTWrace(rtwEm);
                if (null != r) {

                    log4j.debug(
                            "{} - Found RTW Race matching eventId={}, trackId={}, Race={}",
                            method, parentEvent.getEventId(), parentEvent.getTrackId(), r.toString());

                    // Verify that the race has not already been marked as Final
                    if (!r.getRacesprocessresult() || !r.getRacesjdresultstatus()) {

                        // Open the transaction
                        rtwEm.getTransaction().begin();

                        // Update the flags for both RTW and JockeyDraft status to closed
                        r.setRacesresultstatus(true);
                        r.setRacesjdresultstatus(true);
                        log4j.debug(
                                "{} - Updated racesresultstatus and racesjdresultstatus to true for RTW Race matching trackId={}, tracksid={}, racesdate={}, racesid={}, and eventId={}",
                                method, parentEvent.getTrackId(), r.getTracksid(), r.getRacesdate(), r.getRacesid(),
                                parentEvent.getEventId());

                        // Get the final results for the race from the Tote provider
                        UtoteResult utoteResult = ResultRequestProcessor.getResults(theRace.getEventId(), theRace.getRaceId());
                        log4j.debug("{} - Found Tote Results for eventId={}, raceId={}, utoteResult={}", method, theRace.getEventId(), theRace.getRaceId(), utoteResult.toString(true));

                        // Get the RTW Horses related to this race
                        Collection<Horse> horses = Horse.getActiveRaceHorses(rtwEm, r.getRacesid());
                        log4j.debug("{} - Found {} horses for eventId={}, raceId={}", method, horses.size(), theRace.getEventId(), theRace.getRaceId());

                        // Iterate through the RTW horses and create corresponding
                        // rows in the RTW results table based on the standings returned by the Tote provider
                        horses.stream()
                        .forEach(h -> {

                            // Create and initialize the result objects for the current horse
                            Result res = newResult(parentEvent, r, h);
                            Jockeysresult jres = newJockeysresult(parentEvent, r, h);

                            // Look for a matching finisher in the Tote results
                            log4j.debug("{} - About to iterate positions for horse with eventId={}, raceId={}, horsename={}, horsesprogramnumber={}", method, theRace.getEventId(), theRace.getRaceId(), h.getHorsesname(), h.getHorsesprogramnumber());
                            utoteResult.getPositions().stream()
                            .filter(p -> (p.getPositionId() <= 3))
                            .sorted((p1, p2) -> Integer.compare(p1.getPositionId(),p2.getPositionId()))
                            .forEach(p -> {

                                log4j.debug("{} - About to look for finishers at p.positionId={} for horse with eventId={}, raceId={}, horsesid={}, horsename={}, horsesprogramnumber={}", method, p.getPositionId(), theRace.getEventId(), theRace.getRaceId(), h.getHorsesid(), h.getHorsesname(), h.getHorsesprogramnumber());

                                //Get the finishers that ran at this position
                                //  The filter expression will match against any horse, coupled or not, that has the same runner number
                                p.getFinishers().stream()
                                .filter(f -> (f.getRTWhorsesid() == h.getHorsesid()))
                                .forEach(f -> {

                                    log4j.debug("{} - Matched a finisher for p.getPositionId={} eventId={}, raceId={}, f.name={}, f.runnerId={}, f.getRtwHorsesProgramNumber()={}, f.getRTWhorsesid()={}, h.getHorsesid()={}", method, p.getPositionId(), theRace.getEventId(), theRace.getRaceId(), f.getName(), f.getRunnerId(), f.getRtwHorsesProgramNumber(), f.getRTWhorsesid(), h.getHorsesid());

                                    // Put the Daily win/place/show values into the result object
                                    res.setResultswinamount(f.getRtwWinAmount().floatValue());
                                    res.setResultsplaceamount(f.getRtwPlaceAmount().floatValue());
                                    res.setResultsshowamount(f.getRtwShowAmount().floatValue());

                                    // Display the RTW winning amounts for this finisher
                                    log4j.debug("{} - Updated RTW Daily finisher results for eventId={}, raceId={}, horsename={}, horsesprogramnumber={}, p.getPositionId={}, f.getRunnerId={}, res={}", method, theRace.getEventId(), theRace.getRaceId(), h.getHorsesname(), h.getHorsesprogramnumber(), p.getPositionId(), f.getRunnerId(), (null==res)?"NULL":res.toString());

                                    // Put the JockeyDriaft win/place/show values into the JD result object
                                    jres.setJockeysresultswinamounts(f.getRtwWinAmount().floatValue());
                                    jres.setJockeysresultsplaceamounts(f.getRtwPlaceAmount().floatValue());
                                    jres.setJockeysresultsshowamounts(f.getRtwShowAmount().floatValue());
                                    jres.setJockeysresultstotalamounts(
                                            (f.getRtwWinAmount()
                                                    .add(f.getRtwPlaceAmount()
                                                            .add(f.getRtwShowAmount())))
                                            .floatValue());

                                    // Display the JD winning amounts for this finisher
                                    log4j.debug("{} - Updated JockeyDraft finisher results for eventId={}, raceId={}, horsename={}, horsesprogramnumber={}, p.getPositionId={}, f.getRunnerId={}, res={}", method, theRace.getEventId(), theRace.getRaceId(), h.getHorsesname(), h.getHorsesprogramnumber(), p.getPositionId(), f.getRunnerId(), (null==jres)?"NULL":jres.toString());


                                }); // End of forEach Finisher
                                log4j.debug("{} - Finished looking for finishers at p.positionId={} for horse with eventId={}, raceId={}, horsename={}, horsesprogramnumber={}", method, p.getPositionId(), theRace.getEventId(), theRace.getRaceId(), h.getHorsesname(), h.getHorsesprogramnumber());

                            }); // End of forEach Position
                            log4j.debug("{} - Finished iterating positions for horse with eventId={}, raceId={}, horsename={}, horsesprogramnumber={}", method, theRace.getEventId(), theRace.getRaceId(), h.getHorsesname(), h.getHorsesprogramnumber());

                            // Persist the result objects for the current horse
                            try {
                                log4j.debug("{} - About to persisted RTW and JD Daily finisher results for eventId={}, raceId={}, horsename={}, horsesprogramnumber={}, res={}, jres={}", method, theRace.getEventId(), theRace.getRaceId(), h.getHorsesname(), h.getHorsesprogramnumber(), (null==res)?"NULL":res.toString(), (null==jres)?"NULL":jres.toString());
                                rtwEm.persist(res);
                                rtwEm.persist(jres);
                                log4j.debug("{} - Persisted RTW and JD Daily finisher results for eventId={}, raceId={}, horsename={}, horsesprogramnumber={}", method, theRace.getEventId(), theRace.getRaceId(), h.getHorsesname(), h.getHorsesprogramnumber());
                            } catch (Exception e1) {
                                log4j.error("{} -Could not persist RTW and JD finisher results for eventId={}, raceId={}, horsename={}, horsesprogramnumber={}, res={}, jres={}, exceptionMsg={}, exception={}", method, theRace.getEventId(), theRace.getRaceId(), h.getHorsesname(), h.getHorsesprogramnumber(), (null==res)?"NULL":res.toString(), (null==jres)?"NULL":jres.toString(), e1.getMessage(), e1);
                            }

                        }); // End of forEach Horse
                        log4j.debug("{} - Finished looking through horses for eventId={}, raceId={}", method, horses.size(), theRace.getEventId(), theRace.getRaceId());

                        // Commit the transaction
                        try {
                            log4j.debug("{} - Calling commit on Race, RTW and JD Result objects for Race with eventId={}, raceId={}, RTWRace={}", method, theRace.getEventId(), theRace.getRaceId(), r.toString());
                            rtwEm.getTransaction().commit();
                            log4j.debug("{} - Race, RTW and JD Results comitted for Race with eventId={}, raceId={}, RTWRace={}", method, theRace.getEventId(), theRace.getRaceId(), r.toString());
                        } catch (Exception e) {
                            log4j.error("{} - Exception while trying to commit Race, RTW, and JD Results for Race with eventId={}, raceId={}, RTWRace={}, exceptionMsg={}, exception={}", method, theRace.getEventId(), theRace.getRaceId(), r.toString(), e.getMessage(), e);
                        } finally {
                            if (rtwEm.getTransaction().isActive()) {
                                rtwEm.getTransaction().rollback();
                            }
                        }

                    } else {
                        // Race has already been processed, so skip
                        log4j.info(
                                "{} - Found RTW Race matching eventId={}, trackId={}, Race={} to process final results, but it has already been marked as done.",
                                method, parentEvent.getEventId(), parentEvent.getTrackId(), r.toString());
                    }

                }

                // Close down the persistence connections
                if (rtwEm.isOpen()) {
                    rtwEm.close();
                }
                if (rtwEmF.isOpen()) {
                    rtwEmF.close();
                }

            }

        } finally {

            // Release the lock allowing the next waiting final status to be processed
            // if any have been enqueued.
            synchronousFinalProcessingLock.unlock();
            log4j.info("{} - Lock release, finished processing Final status for Event={} and Race={}.",
                    method, theRace.getEventId(), theRace.getRaceId());

        }

        log4j.exit(method);

    }

    private static int mapUtoteRaceStatusToRTWStatusId(String raceStatus) {
        int statusId = 0;
        switch (raceStatus) {
        case UtoteRace.RACE_STATUS_OPEN:
        case UtoteRace.RACE_STATUS_UNCANCELED:
            statusId = Race.RTW_RACE_STATUS_OPEN;
            break;
        case UtoteRace.RACE_STATUS_CLOSED:
        case UtoteRace.RACE_STATUS_POST:
        case UtoteRace.RACE_STATUS_LOCKED:
            statusId = Race.RTW_RACE_STATUS_CLOSED;
            break;
        case UtoteRace.RACE_STATUS_CANCELED:
            statusId = Race.RTW_RACE_STATUS_CANCELLED;
            break;
        case UtoteRace.RACE_STATUS_FINAL:
            statusId = Race.RTW_RACE_STATUS_OVER;
            break;
        default:
            assert false : "mapUtoteRaceStatusToRTWStatusId invalid raceStatus=" + raceStatus;
        }
        return statusId;
    }

    public static boolean updateStatusAndPostTime(UtoteRace theRace, boolean statusUpdated, boolean isCancelled,
            boolean postTimeUpdated) {
        boolean performedUpdate = false;
        String method = "RaceController.updateStatusAndPostTime";
        log4j.entry(method);

        // Get the parent event
        UtoteEvent parentEvent = theRace.getOrLoadParent(method);
        if (null != parentEvent) {

            // Get Entity Managers
            final EntityManagerFactory rtwEmF = Configurator.getRTWEMF();
            final EntityManager rtwEm = rtwEmF.createEntityManager();

            // Make sure our RTW event info was loaded; could be an unsupported
            // track
            if (parentEvent.getRtwTracksid() != 0) {
                log4j.debug(
                        "{} - Found RTW Event matching tracksid={}, trackId={}, parentEvent.getEventDate={} and eventId={}",
                        method, parentEvent.getRtwTracksid(), parentEvent.getTrackId(), parentEvent.getRtwEventDate(),
                        theRace.getEventId());

                // Find the matching race in our system
                Race r = theRace.loadRTWrace(rtwEm);
                if (null != r) {
                    log4j.debug(
                            "{} - Found RTW Race matching trackId={}, tracksid={}, racesdate={}, racesid={}, and eventId={}",
                            method, parentEvent.getTrackId(), r.getTracksid(), r.getRacesdate(), r.getRacesid(),
                            parentEvent.getEventId());

                    // Update the status, if needed
                    if (statusUpdated
                            && (r.getStatusid() != mapUtoteRaceStatusToRTWStatusId(theRace.getRaceStatus()))) {
                        try {
                            rtwEm.getTransaction().begin();
                            log4j.debug("{} - before: r.getStatusid={}, after r.getStatusid={}", method,
                                    r.getStatusid(), mapUtoteRaceStatusToRTWStatusId(theRace.getRaceStatus()));
                            r.setStatusid(mapUtoteRaceStatusToRTWStatusId(theRace.getRaceStatus()));
                            r.updateRaceTimesBasedOnStatus(theRace.getRaceStatus());
                            r = rtwEm.merge(r);
                            rtwEm.getTransaction().commit();
                            // Re-read and display for debugging
                            rtwEm.refresh(r);
                            performedUpdate = true;
                            log4j.debug(
                                    "{} - Updated race statusid to {} ({}) for RTW Race matching trackId={}, raceId={}, and eventId={}",
                                    method, r.getStatusid(), theRace.getRaceStatus(), r.getStatusid(),
                                    parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId());
                        } catch (Exception e) {
                            log4j.error(
                                    "{} - Error trying to update the status on the RTW Race matching trackId={}, raceId={}, and eventId={}\nException={}",
                                    method, parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId(), e);
                        }
                    }

                    // If not cancelled, and the postTime has been changed
                    log4j.debug(
                            "{} - Checking for post time update. theRace.getPostTime()={}, r.getRacesstarttime()={}, r.getRacesposttime()={}",
                            method, theRace.getPostTime(), r.getRacesstarttime(), r.getRacesposttime());
                    if (!isCancelled && postTimeUpdated && ((theRace.getPostTime() / 1000l) != r.getRacesstarttime())) {
                        // Convert the post time to string format for stored
                        // procedure call
                        // Note: MySQL provides ambiguous results if passing in
                        // an epoch value
                        Instant inst3 = Instant.ofEpochMilli(theRace.getPostTime());
                        String gmtString = inst3.toString();
                        try {
                            log4j.debug(
                                    "{} - About to Updated race Post Time to {} for RTW Race matching racesid={}, r.pTzOffset={}, r.pTzName={}, current r.racesstarttime={}, current r.racesposttime={}, pNewPostTIme={}, trackId={}, raceId={}, and eventId={}",
                                    method, theRace.getPostTime(), r.getRacesid(), parentEvent.getRtwTimezone(), parentEvent.getRtwTimezoneName(),
                                    r.getRacesstarttime(), r.getRacesposttime(), gmtString/* lPostTime */,
                                    parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId());
                            rtwEm.getTransaction().begin();
                            StoredProcedureQuery q = rtwEm.createNamedStoredProcedureQuery("Race.updatePostTime");
                            q.setParameter("pRacesId", r.getRacesid());
                            q.setParameter("pTzOffset", parentEvent.getRtwTimezone());
                            q.setParameter("pTzName", parentEvent.getRtwTimezoneName());
                            q.setParameter("pNewPostTime", gmtString);
                            q.execute();
                            rtwEm.getTransaction().commit();
                            log4j.debug("{} - About to refresh the RTW race object after calling Race.updatePostTime",
                                    method);
                            rtwEm.refresh(r);
                            performedUpdate = true;
                            log4j.debug(
                                    "{} - Updated race Post Time to {} for RTW Race matching racesid={}, pTzOffset={}, pTzName={}, r.racesstarttime={}, r.racesposttime={}, trackId={}, raceId={}, and eventId={}",
                                    method, theRace.getPostTime(), r.getRacesid(), parentEvent.getRtwTimezone(), parentEvent.getRtwTimezoneName(),
                                    r.getRacesstarttime(), r.getRacesposttime(), parentEvent.getTrackId(),
                                    theRace.getRaceId(), theRace.getEventId());
                        } catch (Exception e) {
                            log4j.error(
                                    "{} - Error trying to call Race.updatePostTime for the RTW Race matching racesid={}, pTzOffset={}, pNewPostTIme={}, trackId={}, raceId={}, and eventId={}\nException={}",
                                    method, r.getRacesid(), parentEvent.getRtwTimezone(), gmtString/* lPostTime */,
                                    parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId(), e);
                        }
                    }
                } else {
                    log4j.warn("{} - Did not find RTW Race matching eventId={}, eventName={} EventDate={}, trackId={}, trackName={}, RtwTracksid={}, raceId={}, raceType={}, raceStatus={}", method,
                            theRace.getEventId(), parentEvent.getEventName(), parentEvent.getRtwEventDate(), parentEvent.getTrackId(), parentEvent.getTrackName(), parentEvent.getRtwTracksid(), theRace.getRaceId(), theRace.getRacetype(), theRace.getRaceStatus());
                }
            } else {
                log4j.warn("{} - Did not find RTW Track matching eventId={}, eventName={} trackId={}, trackName={}, RtwTracksUniquecode={}", method,
                        theRace.getEventId(), parentEvent.getEventName(), parentEvent.getTrackId(), parentEvent.getTrackName(), parentEvent.getRtwTracksuniquecode());
            }

            // Close down the persistence connections
            rtwEm.close();
            rtwEmF.close();

        }

        log4j.exit(performedUpdate);

        return performedUpdate;
    }

    public static void updateStatus(UtoteRace theRace, boolean isCancelled) {
        updateStatusAndPostTime(theRace, true/* status is updated */, isCancelled, false /* No need to update the post time*/);
    }

    private static String getMsgTimestamp() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        currentDateTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
        return currentDateTime.format(DateTimeFormatter.ISO_LOCAL_TIME) + " GMT";
    }

    private static StringBuilder getEmailMsg(String changeDescription, String oldValue, String newValue) {
        StringBuilder emailMsgs = new StringBuilder();
        boolean hasOldValue = ((null == oldValue) || oldValue.trim().isEmpty());
        boolean hasNewValue = ((null == newValue) || newValue.trim().isEmpty());
        emailMsgs.append("<BR/>").append(changeDescription);

        // Are both old and new values specified?
        if (hasOldValue && hasNewValue) {
            return emailMsgs
                    .append(" from ").append(oldValue)
                    .append(" to ").append(newValue)
                    .append(" as of ").append(getMsgTimestamp());
            // Is only the old value specified?
        } else if (hasOldValue) {
            return emailMsgs
                    .append(" from ").append(oldValue)
                    .append(" as of ").append(getMsgTimestamp());
            // Only the new value is specified
        } else {
            return emailMsgs
                    .append(" is now ").append(newValue)
                    .append(" as of ").append(getMsgTimestamp());
        }

    }

    private static StringBuilder getSmsMsg(String changeDescription, String oldValue, String newValue) {
        StringBuilder smsMsgs = new StringBuilder();
        boolean hasOldValue = ((null == oldValue) || oldValue.trim().isEmpty());
        boolean hasNewValue = ((null == newValue) || newValue.trim().isEmpty());
        smsMsgs.append(" | ").append(changeDescription);

        // Are both old and new values specified?
        if (hasOldValue && hasNewValue) {
            return smsMsgs
                    .append(" to ").append(newValue)
                    .append(" at ").append(getMsgTimestamp());

            // Is only the old value specified?
        } else if (hasOldValue) {
            return smsMsgs
                    .append(" from ").append(oldValue)
                    .append(" at ").append(getMsgTimestamp());

            // Only the new value is specified
        } else {
            return smsMsgs
                    .append(" to ").append(newValue)
                    .append(" at ").append(getMsgTimestamp());
        }

    }

    // Find the matching race in our system
    // Find the matching runner
    // Update the status
    public static boolean processEntryChanges(UtoteEntryChange curEC, UtoteEntryChange newEC) {
        String method = "RaceController.processEntryChanges";
        log4j.entry(method);

        boolean performedUpdate = false;
        StringBuilder emailMsgs = new StringBuilder();
        StringBuilder smsMsgs = new StringBuilder();

        // Get the related parent objects
        UtoteEntry theEntry = newEC.getParent();
        UtoteRunner theRunner = theEntry.getRunner();
        UtoteRace theRace = theRunner.getRace();
        UtoteEvent parentEvent = theRace.getOrLoadParent(method);

        if (null != parentEvent) {

            // Get an Entity Manager
            final EntityManagerFactory rtwEmF = Configurator.getRTWEMF();
            final EntityManager rtwEm = rtwEmF.createEntityManager();

            // Make sure our RTW event info was loaded; could be an unsupported
            // track
            if (parentEvent.getRtwTracksid() != 0) {
                log4j.debug(
                        "{} - Found RTW Event matching tracksid={}, trackId={}, parentEvent.getEventDate={} and eventId={}",
                        method, parentEvent.getRtwTracksid(), parentEvent.getTrackId(), parentEvent.getRtwEventDate(),
                        theRace.getEventId());

                // Find the matching race in our system
                Race r = theRace.loadRTWrace(rtwEm);
                if (null != r) {
                    log4j.debug(
                            "{} - Found RTW Race matching trackId={}, tracksid={}, racesdate={}, racesid={}, and eventId={}",
                            method, parentEvent.getTrackId(), r.getTracksid(), r.getRacesdate(), r.getRacesid(),
                            parentEvent.getEventId());

                    // Now find the matching runner (by number)
                    Horse h = theEntry.loadRTWHorse(rtwEm);
                    if (null != h) {
                        log4j.debug("{} - Found RTW Race matching trackId={}, raceId={}, and eventId={}", method,
                                parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId());

                        // Update the horses scratch flag
                        try {
                            boolean hasChanges = false;
                            rtwEm.getTransaction().begin();

                            // Jockey changed?
                            if (((null == curEC) && newEC.isJockeyChanged()) ||
                                    (!(curEC.isJockeyChanged() == newEC.isJockeyChanged()))) {
                                log4j.debug("{} - existing h.jockeysid={}, new h.jockeysid={}", h.getJockeysid(), theEntry.getJockey());
                                // TODO: Process jockey change
                                log4j.info("{} - TODO: Process Jockey Change", method);
                                emailMsgs.append(getEmailMsg("Jockey has changed", curEC.getParent().getJockey(), theEntry.getJockey()));
                                smsMsgs.append(getSmsMsg("Jockey changed", curEC.getParent().getJockey(), theEntry.getJockey()));
                            }

                            // Medication changed?
                            if (((null == curEC) && newEC.isMedicationChanged())
                                    || (!(curEC.isMedicationChanged() == newEC.isMedicationChanged()))) {
                                log4j.debug("{} - existing h.horsesmedication={}, new h.horsesmedication={}",
                                        h.getHorsesmedication(), theEntry.getMedication());
                                emailMsgs.append(getEmailMsg("Medication has changed", h.getHorsesmedication(), theEntry.getMedication()));
                                smsMsgs.append(getSmsMsg("Medication changed", h.getHorsesmedication(), theEntry.getMedication()));
                                h.setHorsesmedication(theEntry.getMedication());
                                hasChanges = true;
                            }

                            // Name changed?
                            if (((null == curEC) && newEC.isNameChanged())
                                    || (!(curEC.isNameChanged() == newEC.isNameChanged()))) {
                                log4j.debug("{} - existing h.horsesname={}, new h.horsesname={}", h.getHorsesname(),
                                        theEntry.getName());
                                emailMsgs.append(getEmailMsg("Horse name has changed", h.getHorsesname(), theEntry.getName()));
                                smsMsgs.append(getSmsMsg("Horse name changed", h.getHorsesname(),  theEntry.getName()));
                                h.setHorsesname(theEntry.getName());
                                hasChanges = true;
                            }

                            // Owner changed?
                            if (((null == curEC) && newEC.isOwnerChanged())
                                    || (!(curEC.isOwnerChanged() == newEC.isOwnerChanged()))) {
                                log4j.debug("{} - existing h.ownersid={}, new h.ownersid={}", h.getOwnersid(),
                                        theEntry.getOwner());
                                emailMsgs.append(getEmailMsg("Owner has changed", newEC.getParent().getOwner(), theEntry.getName()));
                                smsMsgs.append(getSmsMsg("Owner changed", newEC.getParent().getOwner(),  theEntry.getName()));
                                // TODO: Process owner change
                                log4j.info("{} - TODO: Process Owner Change", method);
                            }

                            // Position changed?
                            if (((null == curEC) && newEC.isPositionChanged())
                                    || (!(curEC.isPositionChanged() == newEC.isPositionChanged()))) {
                                try {
                                    log4j.debug("{} - existing h.horsespostposition={}, new h.horsespostposition={}",
                                            h.getHorsespostposition(), theEntry.getPosition());
                                    emailMsgs.append(getEmailMsg("Post position has changed", String.valueOf(h.getHorsespostposition()), theEntry.getPosition()));
                                    smsMsgs.append(getSmsMsg("Post pos changed", String.valueOf(h.getHorsespostposition()), theEntry.getPosition()));
                                    h.setHorsespostposition(Integer.parseInt(theEntry.getPosition()));
                                    hasChanges = true;
                                } catch (NumberFormatException e) {
                                    log4j.error(
                                            "{} - Error converting new post position ({}) to an integer while trying to update the status on the RTW Race matching horseName={}, runnerNumber={}, raceId={}, trackId={}, and eventId={}",
                                            method, theEntry.getPosition(), h.getHorsesname(), theRunner.getRunnerId(),
                                            theRace.getRaceId(), parentEvent.getTrackId(), theRace.getEventId());
                                }
                            }

                            // Trainer changed?
                            if (((null == curEC) && newEC.isTrainerChanged())
                                    || (!(curEC.isTrainerChanged() == newEC.isTrainerChanged()))) {
                                log4j.debug("{} - existing h.trainersid={}, new h.trainersid={}", h.getTrainersid(),
                                        theEntry.getTrainer());
                                emailMsgs.append(getEmailMsg("Trainer has changed", newEC.getParent().getTrainer(), theEntry.getTrainer()));
                                smsMsgs.append(getSmsMsg("Trainer changed", newEC.getParent().getTrainer(), theEntry.getTrainer()));
                                // TODO: Process trainer change
                                log4j.info("{} - TODO: Process Trainer Change", method);
                            }

                            // Weight changed?
                            if (((null == curEC) && newEC.isWeightChanged())
                                    || (!(curEC.isWeightChanged() == newEC.isWeightChanged()))) {
                                try {
                                    log4j.debug("{} - existing h.horsesweight={}, new h.horsesweight={}",
                                            h.getHorsesweight(), theEntry.getWeight());
                                    emailMsgs.append(getEmailMsg("Horses weight has changed", String.valueOf(h.getHorsesweight()), theEntry.getWeight()));
                                    smsMsgs.append(getSmsMsg("Weight changed", String.valueOf(h.getHorsesweight()), theEntry.getWeight()));
                                    h.setHorsesweight(Integer.parseInt(theEntry.getWeight()));
                                    hasChanges = true;
                                } catch (NumberFormatException e) {
                                    log4j.error(
                                            "{} - Error converting new weight ({}) to an integer while trying to update the status on the RTW Race matching horseName={}, runnerNumber={}, raceId={}, trackId={}, and eventId={}",
                                            method, theEntry.getWeight(), h.getHorsesname(), theRunner.getRunnerId(),
                                            theRace.getRaceId(), parentEvent.getTrackId(), theRace.getEventId());
                                }
                            }

                            // If anything changed, then update the database
                            if (hasChanges) {
                                h = rtwEm.merge(h);
                                rtwEm.getTransaction().commit();
                                performedUpdate = true;
                                log4j.info(
                                        "{} - Updated Horse with entry changes for RTW Horse matching horseName={}, runnerNumber={}, raceId={}, trackId={}, and eventId={}",
                                        method, h.getHorsesname(), theRunner.getRunnerId(), theRace.getRaceId(),
                                        parentEvent.getTrackId(), theRace.getEventId());
                                // Send users email and/or sms notification of the changes
                                Usersemail.notifyUsersOfChange(parentEvent.getRtwTracksid(), r.getRacesid(), r.getRacesdate(), r.getRacesnumber(), emailMsgs.toString(), smsMsgs.toString());
                                log4j.debug("{} - Called Usersemail.notifyUsersOfChange with tracsksid={}, racesid={}, racesdate={}, racesnumber={}, emailMsgs={}, and smsMsgs={}",
                                        method, parentEvent.getRtwTracksid(), r.getRacesid(), r.getRacesdate(), r.getRacesnumber(), emailMsgs.toString(), smsMsgs.toString());
                            } else {
                                rtwEm.getTransaction().rollback();
                            }

                        } catch (Exception e) {
                            log4j.error(
                                    "{} - Error trying to update the status on the RTW Race matching horseName={}, runnerNumber={}, raceId={}, trackId={}, and eventId={}",
                                    method, h.getHorsesname(), theRunner.getRunnerId(), theRace.getRaceId(),
                                    parentEvent.getTrackId(), theRace.getEventId());
                        }

                        // Re-read and display for debugging
                        rtwEm.refresh(r);
                        if (log4j.isTraceEnabled()) {
                            log4j.trace(
                                    "{} - Updated horse scratch indicator status to Y for RTW Horse matching horseName={}, runnerNumber={}, raceId={}, trackId={}, and eventId={}\nResulting Horse object={}",
                                    method, h.getHorsesname(), theRunner.getRunnerId(), theRace.getRaceId(),
                                    parentEvent.getTrackId(), theRace.getEventId(), h);
                        }
                    } else {
                        log4j.error(
                                "{} - Did not find RTW Horse matching runnerNumber={}, raceId={}, trackId={}, and eventId={}",
                                method, theRunner.getRunnerId(), theRace.getRaceId(), parentEvent.getTrackId(),
                                theRace.getEventId());
                    }
                } else {
                    log4j.error("{} - Did not find RTW Race matching trackId={}, raceId={}, and eventId={}", method,
                            parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId());
                }
            } else {
                log4j.debug("{} - Did not find RTW Track matching trackId={} and eventId={}", method,
                        parentEvent.getTrackId(), theRace.getEventId());
            }

            // Close down the persistence connections
            rtwEm.close();
            rtwEmF.close();

        }

        log4j.exit(performedUpdate);
        return performedUpdate;
    }

    private static UtoteRunner getPostTimeFavorite(UtoteRace theRace) {
        return theRace.getRunners().stream().filter(aRunner -> (!aRunner.isScratched()))
                .sorted((r1, r2) -> Float.compare(r1.getOddsValue(), r2.getOddsValue()))
                .findFirst()
                .orElse(null);
    }

    private static StringBuilder[] addMypickMsgs(StringBuilder[] inArray, String emailMsg, String smsMsg) {
        StringBuilder[] msgArray = (null == inArray)?new StringBuilder[]{new StringBuilder(),new StringBuilder()}:inArray;
        msgArray[0] = msgArray[0].append(emailMsg);
        msgArray[1] = msgArray[1].append(smsMsg);
        return msgArray;
    }

    private static boolean gamesdatePickAltEnabled(EntityManager rtwEm, int racesid, int gamesid) {
        String method = "RaceController.gamesdatePickAltEnabled";
        boolean result = true; // Default to enabled
        String query = "SELECT b.gamesdatepickaltstatus FROM gamesracemap a INNER JOIN gamesdate b ON a.gamesdateid = b.gamesdateid  WHERE a.racesid = :racesid AND a.gamesid = :gamesid";

        try {
            Query q = rtwEm.createNativeQuery(query);
            q.setParameter("racesid", racesid);
            q.setParameter("gamesid", gamesid);
            String gamesdatePickAltStatus = (String)q.getSingleResult();
            log4j.debug("{} - Found gamesdatePickAltStatus={} for racesid={} and gamesid={}.", method, gamesdatePickAltStatus, racesid, gamesid);

            // Split the result, which is in format n_n, where n=0 or n=1
            String[] flags = gamesdatePickAltStatus.split("_");
            result = flags[1].equals("1");
            log4j.debug("{} - Setting return value to {} for racesid={} and gamesid={}.", method, result, racesid, gamesid);

        } catch (Exception map1) {
            log4j.error("{} - Exception while attempting to run query={} for racesid={} and gamesid={}. ExceptionMsg={}\nException={}", method, query, racesid, gamesid, map1.getMessage(), map1);
        }

        return result;
    }

    private static boolean isWeekendGame(EntityManager rtwEm, int gamesid) {
        String method = "RaceController.isWeekendGame";
        boolean result = false; // Default to no
        String query = "SELECT b.gamesdateid FROM games a INNER JOIN gamesdate b ON a.gamesid = b.gamesid WHERE b.gamesdateweeknumber > 0 AND a.gamesmode = 1 AND a.gamesid = :gamesid";

        try {
            Query q = rtwEm.createNativeQuery(query);
            q.setParameter("gamesid", gamesid);
            result = !q.getResultList().isEmpty();
            log4j.debug("{} - Found {} results, so isWeekendGame={} gamesid={}.", method, result?q.getResultList().size():0, result, gamesid);

        } catch (Exception map1) {
            log4j.error("{} - Exception while attempting to run query={} for gamesid={}. ExceptionMsg={}\nException={}", method, query, gamesid, map1.getMessage(), map1);
        }

        return result;
    }

    private static int getGameWeekNumber(EntityManager rtwEm, int racesid, int gamesid) {
        String method = "RaceController.getGameWeekNumber";
        int result = 1; // Default to 1
        String query = "SELECT b.gamesdateweeknumber FROM gamesracemap a INNER JOIN gamesdate b ON a.gamesdateid = b.gamesdateid WHERE a.racesid = :racesid AND a.gamesid = :gamesid";

        try {
            Query q = rtwEm.createNativeQuery(query);
            q.setParameter("racesid", racesid);
            q.setParameter("gamesid", gamesid);
            Integer gamesdateWeekNumber = (Integer)q.getSingleResult();
            log4j.debug("{} - Found gamesdateWeekNumber={} for racesid={} and gamesid={}.", method, gamesdateWeekNumber, racesid, gamesid);

            // Convert to int
            result = gamesdateWeekNumber.intValue();
            log4j.debug("{} - Setting return value to {} for racesid={} and gamesid={}.", method, result, racesid, gamesid);

        } catch (Exception map1) {
            log4j.error("{} - Exception while attempting to run query={} for racesid={} and gamesid={}. ExceptionMsg={}\nException={}", method, query, racesid, gamesid, map1.getMessage(), map1);
        }

        return result;
    }

    private static int countTotalPicks(EntityManager rtwEm, int gamesid, int gamesdateweeknumber, int usergamesid, int usersid) {
        String method = "RaceController.countTotalPicks";
        int result = 0; // Default to none
        String racesIdSubQuery = "SELECT a.racesid FROM gamesracemap a INNER JOIN gamesdate b ON a.gamesdateid = b.gamesdateid WHERE a.gamesid = :gamesid AND b.gamesdateweeknumber = :gamesdateweeknumber";
        String query = "SELECT COUNT(mypicksid) AS countpickweekwise FROM mypicks WHERE racesid IN(" +
                racesIdSubQuery +
                ") AND usergamesid = :usergamesid AND mypicksstatus = 1 AND usersid = :usersid GROUP BY racesid";

        try {
            Query q = rtwEm.createNativeQuery(query);
            q.setParameter("gamesid", gamesid);
            q.setParameter("gamesdateweeknumber", gamesdateweeknumber);
            q.setParameter("usergamesid", usergamesid);
            q.setParameter("usersid", usersid);
            Integer numPicks = (Integer)q.getSingleResult();
            log4j.debug("{} - Found numPicks={} for gamesid={}, gamesdateweeknumber={}, usergamesid={}, usersid={}", method, numPicks, gamesid, gamesdateweeknumber, usergamesid, usersid);

            // Convert to int
            result = numPicks.intValue();
            log4j.debug("{} - Setting return value to {} for gamesid={}, gamesdateweeknumber={}, usergamesid={}, usersid={}", method, result, gamesid, gamesdateweeknumber, usergamesid, usersid);

        } catch (Exception map1) {
            log4j.error("{} - Exception while attempting to run query={} for gamesid={}, gamesdateweeknumber={}, usergamesid={}, usersid={}. ExceptionMsg={}\nException={}", method, query, gamesid, gamesdateweeknumber, usergamesid, usersid, map1.getMessage(), map1);
        }

        return result;
    }

    private static void changePickToPostTimeFavorite(EntityManager rtwEm, Horse h, Collection<Mypick> myPicks, Mypick mypick, UtoteRunner ptf, boolean removePick) {
        String method = "RaceController.changePickToPostTimeFavorite";

        try {

            // Start transaction
            rtwEm.getTransaction().begin();

            // If requested, remove pick first
            if (removePick) {
                rtwEm.remove(mypick);
                log4j.debug("{} - Deleted mypickid={} alternate picks for scratched horsesid={} as the primary pick is already scratched.", method, mypick.getMypicksid(), h.getHorsesid());
            }

            // Go through the Entries and add a pick for each one that is not scratched
            ptf.getEntries().stream()
            .filter(anEntry->(!anEntry.isScratch()))
            .forEach(anEntry->{

                log4j.debug("{} - Found non-scratched entry as part of Runner that is the Post-Time-Favorite.", method);

                // Make sure the entry is not already a pick
                if (myPicks.stream()
                        .anyMatch(aPick -> (
                                (anEntry.getRTWhorsesid() != aPick.getMypicksprimaryhorsesid()) &&
                                (anEntry.getRTWhorsesid() != aPick.getMypicksalthorsesid())
                                ))) {

                    log4j.debug("{} - Adding new pick for PTF entry with RunnerId={}, EntryId={}, RTWhorsesid={} for scratched horsesid={} as the primary pick is already scratched.", method, anEntry.getRunner().getRunnerId(), (null==anEntry.getEntryId())?"NULL":anEntry.getEntryId(), anEntry.getRTWhorsesid(), h.getHorsesid());

                    // Add the new pick
                    Mypick newPick = new Mypick(mypick);
                    newPick.setMypicksprimaryhorsesid(anEntry.getRTWhorsesid());
                    newPick.setMypicksalthorsesid(0);
                    newPick.setMypickstime((int)LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));
                    rtwEm.persist(newPick);

                } else {
                    log4j.debug("{} - PTF alread a pick with RunnerId={}, EntryId={}, RTWhorsesid={} for scratched horsesid={} as the primary pick is already scratched.", method, anEntry.getRunner().getRunnerId(), (null==anEntry.getEntryId())?"NULL":anEntry.getEntryId(), anEntry.getRTWhorsesid(), h.getHorsesid());
                }

            });

            // Commit the transaction
            log4j.debug("{} - About to commit transaction to add Post-Time-Favorite picks for scratched horsesid={} as the primary pick is already scratched.", method, h.getHorsesid());
            rtwEm.getTransaction().commit();
            log4j.debug("{} - Alternate picks removed and Post-Time-Favorite added for scratched horsesid={} as the primary pick is already scratched.", method, h.getHorsesid());

        } catch (Exception map1) {
            log4j.error("{} - Exception while attempting to delete and add post-time-favorite for mypickid={} for scratched horsesid={}. ExceptionMsg={}\nException={}", method, mypick.getMypicksid(), h.getHorsesid(), map1.getMessage(), map1);
            if (rtwEm.getTransaction().isActive()) {
                rtwEm.getTransaction().rollback();
            }
        }
    }

    private static Mypick deselectPick(EntityManager rtwEm, Horse h, Mypick mypick, boolean primary) {
        String method = "RaceController.deselectPick";

        try {
            rtwEm.getTransaction().begin();
            if (primary) {
                mypick.setMypicksprimaryhorsesid(0);
            } else {
                mypick.setMypicksalthorsesid(0);
            }
            rtwEm.merge(mypick);
            log4j.debug("{} - Updated mypickid={} for scratched horsesid={} as the primary pick is already scratched.", method, mypick.getMypicksid(), h.getHorsesid());

            // Commit the transaction
            log4j.debug("{} - About to commit transaction to remove alternate picks for scratched horsesid={} as the primary pick is already scratched.", method, h.getHorsesid());
            rtwEm.getTransaction().commit();
            log4j.debug("{} - Alternate picks removed for scratched horsesid={} as the primary pick is already scratched.", method, h.getHorsesid());

        } catch (Exception map1) {
            log4j.error("{} - Exception while attempting to update mypickid={} for scratched horsesid={} as the primary pick is already scratched. ExceptionMsg={}\nException={}", method, mypick.getMypicksid(), h.getHorsesid(), map1.getMessage(), map1);
            if (rtwEm.getTransaction().isActive()) {
                rtwEm.getTransaction().rollback();
            }
        }

        return mypick;
    }

    private static void deletePick(EntityManager rtwEm, Horse h, Mypick mypick) {
        String method = "RaceController.deselectPick";

        try {
            rtwEm.getTransaction().begin();
            rtwEm.remove(mypick);
            log4j.debug("{} - Updated mypickid={} for scratched horsesid={} as the primary pick is already scratched.", method, mypick.getMypicksid(), h.getHorsesid());

            // Commit the transaction
            log4j.debug("{} - About to commit transaction to remove alternate picks for scratched horsesid={} as the primary pick is already scratched.", method, h.getHorsesid());
            rtwEm.getTransaction().commit();
            log4j.debug("{} - Alternate picks removed for scratched horsesid={} as the primary pick is already scratched.", method, h.getHorsesid());

            mypick.setMypicksprimaryhorsesid(0);
            mypick.setMypicksalthorsesid(0);

        } catch (Exception map1) {
            log4j.error("{} - Exception while attempting to update mypickid={} for scratched horsesid={} as the primary pick is already scratched. ExceptionMsg={}\nException={}", method, mypick.getMypicksid(), h.getHorsesid(), map1.getMessage(), map1);
            if (rtwEm.getTransaction().isActive()) {
                rtwEm.getTransaction().rollback();
            }
        }

    }

    private static void processAltPicks(EntityManager rtwEm, UtoteRace theRace, Race r, Horse h, UtoteRunner ptf) {
        String method = "RaceController.processAltPicks";

        // Attempt to get mypicks when the scratched horse is chosen as the alternate horse
        Collection<Mypick> myAltPicks = Mypick.getMyAltpicks(rtwEm, r.getRacesid(), h.getHorsesid());
        log4j.debug(
                "{} - Retrieved {} alternate picks for scratched Runner.  horsesprogramnumber={}, tracksid={}, racesid={}, horsesid={}",
                method, (null == myAltPicks)?"NULL":myAltPicks.size(), h.getHorsesprogramnumber(), r.getTracksid(), r.getRacesid(), h.getHorsesid());

        // Remove the entries from mypicks where the the primary pick has already been scratched
        if ((null != myAltPicks) && myAltPicks.stream().anyMatch(aPick -> (0 == aPick.getMypicksprimaryhorsesid())))  {

            // Remove from the database
            log4j.debug("{} - Removing alternate picks for scratched horsesid={} as the primary pick is already scratched.", method, h.getHorsesid());
            myAltPicks.stream()
            .filter(mypick -> (0 == mypick.getMypicksprimaryhorsesid()))
            .forEach(mypick -> {

                // Replace the picks with the post time favorite
                log4j.debug("{} - Changing pick to Post-Time-Favorite for scratched horsesid={} as the primary pick is already scratched.", method, h.getHorsesid());
                mypick.setMypicksalthorsesid(0);
                changePickToPostTimeFavorite(rtwEm, h, myAltPicks, mypick, ptf, true);

            });

        } // End of alt processing when if primary is also scratched.

    }


    private static float doFestivusProcessing(EntityManager rtwEm, Race r, Horse h, Mypick mypick, Game aGame) {
        String method = "RaceController.doFestivusProcessing";

        // Determine the refund amount
        float refundedUsergamesMythicalBankroll =
                mypick.getMypickswinamount() +
                mypick.getMypicksplaceamount() +
                mypick.getMypicksshowamount() +
                mypick.getUsergame().getUsergamesmythicalbankroll();
        log4j.debug(
                "{} - Calcualted a {} refund of {} for game={} for scratched Runner.  horsesprogramnumber={}, tracksid={}, racesid={}, horsesid={}",
                method, Category.FESTIVUS_SHORT_NAME, refundedUsergamesMythicalBankroll, aGame.getGamesname(), h.getHorsesprogramnumber(), r.getTracksid(), r.getRacesid(), h.getHorsesid());

        // Update the usergame's mythicalbankroll
        rtwEm.getTransaction().begin();
        Usergame ug = mypick.getUsergame();
        ug.setUsergamesmythicalbankroll(refundedUsergamesMythicalBankroll);
        ug = rtwEm.merge(ug);
        rtwEm.getTransaction().commit();
        // Commit the transaction
        log4j.debug("{} - About to commit transaction to update Usergames for scratched Runner.", method);
        rtwEm.getTransaction().commit();
        log4j.debug("{} - Updated Usergames={}.", method, ug.toString());
        mypick.setUsergames(ug);
        log4j.debug(
                "{} - Calcualted a {} refund of {} for game={} for scratched Runner.  horsesprogramnumber={}, tracksid={}, racesid={}, horsesid={}",
                method, Category.FESTIVUS_SHORT_NAME, refundedUsergamesMythicalBankroll, aGame.getGamesname(), h.getHorsesprogramnumber(), r.getTracksid(), r.getRacesid(), h.getHorsesid());

        return refundedUsergamesMythicalBankroll;

    }

    private static void processNormalGame(EntityManager rtwEm, Race r, Horse h, Collection<Mypick> myPicks, Mypick mypick, Game aGame, UtoteRunner ptf) {
        String method = "RaceController.processNormalGame";

        int altHorseId = mypick.getMypicksalthorsesid();
        log4j.debug("{} - Found alternate horsesid={} for scratched horsesid={} as the primary pick is already scratched.", method, altHorseId, h.getHorsesid());

        // If an alternate horse was specified
        if (0 != altHorseId) {

            // Get alternate horse
            Horse altHorse = rtwEm.find(Horse.class, altHorseId);
            log4j.debug("{} - Found alternate horse={} for scratched horsesid={} as the primary pick is already scratched.", method, altHorse.toString(), h.getHorsesid());

            // If alternate is scratched too
            if (altHorse.getHorsesscratchindicator().equalsIgnoreCase("Y")) {

                // Replace the picks with the post time favorite
                log4j.debug("{} - Changing pick to Post-Time-Favorite as alternate horsesid={} for scratched horsesid={} is already scratched.", method, h.getHorsesid());
                changePickToPostTimeFavorite(rtwEm, h, myPicks, mypick, ptf, true);

                // Alternate is not scratched
            } else {

                // Deselect the current primary hose selection in mypicks
                log4j.debug("{} - Deselecting the primary pick for scratched horsesid={} is already scratched.", method, h.getHorsesid());
                deselectPick(rtwEm, h, mypick, true /* zero out the primary pick */);

            }

        }
        // The primary was scratched and there is no secondary select
        else {

            // Delete the pick
            log4j.debug("{} - Deleting the pick as both primary and alternate are scratched, for scratched horsesid={}.", method, h.getHorsesid());
            deletePick(rtwEm, h, mypick);

            // If it's a Huddie game, determine the day of week that the racesdate is set to
            LocalDateTime ldt = LocalDateTime.ofEpochSecond(r.getRacesdate(), 0, ZoneOffset.UTC);
            ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("America/New_York"));

            // If not Huddie, and the gamesdatePickAltEnabled flag is false
            if ((aGame.getGamesid() != Game.SPECIAL_GAMESID_HUDDIE1) && !gamesdatePickAltEnabled(rtwEm, r.getRacesid(), aGame.getGamesid())) {

                // Replace the picks with the post time favorite
                log4j.debug("{} - Changing pick to Post-Time-Favorite for scratched horsesid={}.", method, h.getHorsesid());
                changePickToPostTimeFavorite(rtwEm, h, myPicks, mypick, ptf, false /* already deleted */);


            }
            // If Huddie, and it's Monday
            else if ((aGame.getGamesid() == Game.SPECIAL_GAMESID_HUDDIE1) && zdt.getDayOfWeek().equals(DayOfWeek.MONDAY)) {

                // If it's a weekend game
                log4j.debug("{} - It's a special huddie game ({}) and a Monday, so see if the related game is a weekend game for scratched horsesid={}.", method, aGame.getGamesid(), h.getHorsesid());
                if (isWeekendGame(rtwEm, aGame.getGamesid())) {

                    // Get the week number
                    log4j.debug("{} - It's a weekend huddie game ({}) and a Monday, so get the week numberof of the related racesid={} and gamesid={} for scratched horsesid={}.", method, aGame.getGamesid(), r.getRacesid(), aGame.getGamesid(), h.getHorsesid());
                    int weekNumber = getGameWeekNumber(rtwEm, r.getRacesid(), aGame.getGamesid());

                    // Use the week number to find out how many picks the user has made for this week
                    log4j.debug("{} - Count the number of picks for a weekend huddie game ({}) and a Monday with weekNumber={}, usergamesid={}, and usersid={}", method, aGame.getGamesid(), weekNumber, mypick.getUsergamesid(), mypick.getUsersid());
                    int numPicksForWeek =  countTotalPicks(rtwEm, aGame.getGamesid(), weekNumber, mypick.getUsergamesid(), mypick.getUsersid());
                    log4j.debug("{} - Counted {} picks for a weekend huddie game ({}) and a Monday with weekNumber={}, usergamesid={}, and usersid={}", method, numPicksForWeek, aGame.getGamesid(), weekNumber, mypick.getUsergamesid(), mypick.getUsersid());

                    // There are a maximum of 8 picks, so if the user has less than that, we can add the post-time favorite back in.
                    if (8 > numPicksForWeek) {

                        // Add the pick for the post time favorite
                        log4j.debug("{} - Adding pick for Post-Time-Favorite as for scratched horsesid={}.", method, h.getHorsesid());
                        changePickToPostTimeFavorite(rtwEm, h, myPicks, mypick, ptf, false /* already deleted */);
                    }

                }
            }

        }
    }


    // Update mypicks after scratching an entry (runner)
    private static StringBuilder[] updateMypicksForScratchedHorse(EntityManager rtwEm, UtoteRace theRace, Race r, Horse h, UtoteRunner ptf) {
        String method = "RaceController.updateMypicksForScratchedHorse";

        // Attempt to get mypicks when the scratched horse is chosen as the primary horse
        Collection<Mypick> myPicks = Mypick.getMypicks(rtwEm, r.getRacesid(), h.getHorsesid());
        log4j.debug(
                "{} - Retrieved {} primary picks for scratched Runner.  horsesprogramnumber={}, tracksid={}, racesid={}, horsesid={}",
                method, (null == myPicks)?"NULL":myPicks.size(), h.getHorsesprogramnumber(), r.getTracksid(), r.getRacesid(), h.getHorsesid());

        // If no picks, then just return null
        if (null == myPicks) {
            return null;
        }

        // Process the picks
        StringBuilder[] msgs1 = new StringBuilder[]{new StringBuilder(),new StringBuilder()};
        myPicks.stream()
        .forEach(mypick -> {

            // Get the related game
            int gamesid = mypick.getUsergame().getGamesid();
            log4j.debug(
                    "{} - Looking up category for gamesid={} processing primary picks for scratched Runner.  horsesprogramnumber={}, tracksid={}, racesid={}, horsesid={}",
                    method, gamesid, h.getHorsesprogramnumber(), r.getTracksid(), r.getRacesid(), h.getHorsesid());
            Game aGame = rtwEm.find(Game.class, gamesid);
            assert (null != aGame) : method + "Could not find Game instance for gamesid=" + gamesid;
            log4j.debug(
                    "{} - Found game={} for scratched Runner.  horsesprogramnumber={}, tracksid={}, racesid={}, horsesid={}",
                    method, aGame.toString(), h.getHorsesprogramnumber(), r.getTracksid(), r.getRacesid(), h.getHorsesid());

            // Get the category for the related game
            String catName = aGame.getCategory().getCategoriesnameshort();
            catName = (null == catName)?"":catName;
            log4j.debug(
                    "{} - Found category={} for game={} for scratched Runner.  horsesprogramnumber={}, tracksid={}, racesid={}, horsesid={}",
                    method, (null == catName)?"NULL":catName, aGame.getGamesname(), h.getHorsesprogramnumber(), r.getTracksid(), r.getRacesid(), h.getHorsesid());

            // Do "normal" game processing
            if (!Category.FESTIVUS_SHORT_NAME.equalsIgnoreCase(catName)) {

                // Process the normal game
                log4j.debug(
                        "{} - About to process normal game with gamesid={} processing primary picks for scratched Runner.  horsesprogramnumber={}, tracksid={}, racesid={}, horsesid={}",
                        method, gamesid, h.getHorsesprogramnumber(), r.getTracksid(), r.getRacesid(), h.getHorsesid());
                processNormalGame(rtwEm, r, h, myPicks, mypick, aGame, ptf);

            }

            // Do Festivus specific processing
            else {

                // Determine the refund amount
                log4j.debug(
                        "{} - This is a Festivus game, about to determine the refund on gamesid={} processing primary picks for scratched Runner.  horsesprogramnumber={}, tracksid={}, racesid={}, horsesid={}",
                        method, gamesid, h.getHorsesprogramnumber(), r.getTracksid(), r.getRacesid(), h.getHorsesid());
                float refundedUsergamesMythicalBankroll = doFestivusProcessing(rtwEm, r, h, mypick, aGame);

                // Add the note to the message
                StringBuilder[] msgs2 = addMypickMsgs(msgs1,
                        "<BR>Current Festivus wallet ballance = $"+String.format("%+10.4f", refundedUsergamesMythicalBankroll),
                        "|New Festivus Bal=$"+String.format("%+10.4f", refundedUsergamesMythicalBankroll));
                msgs1[0] = msgs1[0].append(msgs2[0]);
                msgs1[1] = msgs1[1].append(msgs2[1]);

            }

        });

        return msgs1;
    }

    // Update mypicks after scratching an entry (runner)
    private static StringBuilder[] updateMypicksForScratchedCoupledHorse(EntityManager rtwEm, UtoteRace theRace, Race r, Horse h, UtoteRunner ptf) {
        String method = "RaceController.updateMypicksForScratchedCoupledHorse";
        StringBuilder[] msgs = null;

        String couplehorseProgramNumber = null;
        // Is this primary (without letter) or secondary (with letter) coupled horse
        if (h.getHorsesprogramnumber().toUpperCase().endsWith(h.getHorsescoupltypevalue().toUpperCase())) {
            couplehorseProgramNumber = String.valueOf(h.getHorsesprogramnumberValue());
        } else {
            couplehorseProgramNumber = h.getHorsesprogramnumber() + h.getHorsescoupltypevalue();
        }
        log4j.debug(
                "{} - Scratching one of a coupled Runner.  horsesprogramnumber={}, couplehorseProgramNumber={} tracksid={}, racesid={}",
                method, h.getHorsesprogramnumber(), couplehorseProgramNumber, r.getTracksid(), r.getRacesid());

        // Get other horse
        Horse couplehorse = Horse.findByRaceAndProgramNumber(rtwEm, r.getRacesid(), couplehorseProgramNumber);
        if (null == couplehorse) {
            log4j.error(
                    "{} - Could not find coupled Runner.  horsesprogramnumber={}, couplehorseProgramNumber={} tracksid={}, racesid={}",
                    method, h.getHorsesprogramnumber(), couplehorseProgramNumber, r.getTracksid(), r.getRacesid());
            return msgs;
        }

        // Load the picks and related usergames entities for this race and horse
        Collection<Mypick> myPicks = Mypick.getMypicks(rtwEm, r.getRacesid(), h.getHorsesid());
        log4j.debug(
                "{} - Retrieved {} picks for coupled Runner.  horsesprogramnumber={}, couplehorseProgramNumber={} tracksid={}, racesid={}, horsesid={}",
                method, (null == myPicks)?"NULL":myPicks.size(), h.getHorsesprogramnumber(), couplehorseProgramNumber, r.getTracksid(), r.getRacesid(), h.getHorsesid());
        if (null == myPicks) {
            log4j.error(
                    "{} - NULL returned from request for mypicks. horsesprogramnumber={}, couplehorseProgramNumber={} tracksid={}, racesid={}, horsesid={}",
                    method, h.getHorsesprogramnumber(), couplehorseProgramNumber, r.getTracksid(), r.getRacesid(), h.getHorsesid());
            return msgs;
        }

        // Determine it's scratch state
        boolean bothScratched = couplehorse.getHorsesscratchindicator().equalsIgnoreCase("Y");
        log4j.debug(
                "{} - bothScratched={},  horsesprogramnumber={}, couplehorseProgramNumber={} tracksid={}, racesid={}, horsesid",
                method, bothScratched, h.getHorsesprogramnumber(), couplehorseProgramNumber, r.getTracksid(), r.getRacesid(), h.getHorsesid());

        // If both horses are scratched, delete picks as appropriate
        if (bothScratched) {

            log4j.debug(
                    "{} - Scratched horse is coupled and both are scratched, process picks accordingly for horsesprogramnumber={}, tracksid={}, racesid={}, horsesid={}",
                    method, h.getHorsesprogramnumber(), r.getTracksid(), r.getRacesid(), h.getHorsesid());
            msgs = updateMypicksForScratchedHorse(rtwEm, theRace, r, h, ptf);

        }

        // Otherwise, just remove the pick for the scratched member of the couple
        else {

            // Delete the pick
            log4j.debug("{} - Just delete the picks for the scratched member of the couple as only one was scratched, for scratched horsesid={}.", method, h.getHorsesid());
            myPicks.stream()
            .forEach(mypick -> {
                deletePick(rtwEm, h, mypick);
            });

        }

        return msgs;
    }

    // Update mypicks after scratching an entry (runner)
    private static StringBuilder[] updateMypicks(EntityManager rtwEm, UtoteRace theRace, Race r, Horse h) {
        String method = "RaceController.updateMypicks";
        StringBuilder[] msgs = null;

        // Determine the Post Time Favorite
        UtoteRunner ptf = getPostTimeFavorite(theRace);
        assert (null != ptf) : method + "RaceController.getPostTimeFavorite returned null for EventId=" + theRace.getEventId() + ", RaceId=" + theRace.getRaceId();
        log4j.debug("{} - Found RunnerId={} with Odds={} to use as the Post Time Favorite.", method, ptf.getRunnerId(), ptf.getOdds());

        // If the horse is a coupled entry, handle accordingly
        if (h.getHorsescoupltypeindicator().equalsIgnoreCase("Y")) {

            log4j.debug(
                    "{} - Scratched horse is coupled, process picks accordingly for horsesprogramnumber={}, tracksid={}, racesid={}, horsesid={}",
                    method, h.getHorsesprogramnumber(), r.getTracksid(), r.getRacesid(), h.getHorsesid());
            msgs = updateMypicksForScratchedCoupledHorse(rtwEm, theRace, r, h, ptf);

        } else { // Horse is not a coupled entry

            // Process the alt-picks
            log4j.debug(
                    "{} - Not a coupled entry, process alternate picks for scratched Runner.  horsesprogramnumber={}, tracksid={}, racesid={}, horsesid={}",
                    method, h.getHorsesprogramnumber(), r.getTracksid(), r.getRacesid(), h.getHorsesid());
            processAltPicks(rtwEm, theRace, r, h, ptf);

            log4j.debug(
                    "{} - Scratched horse is NOT coupled, process picks accordingly for horsesprogramnumber={}, tracksid={}, racesid={}, horsesid={}",
                    method, h.getHorsesprogramnumber(), r.getTracksid(), r.getRacesid(), h.getHorsesid());
            msgs = updateMypicksForScratchedHorse(rtwEm, theRace, r, h, ptf);

        }

        return msgs;

    }

    // Find the matching race in our system
    // Find the matching runner
    // Update the status
    public static boolean scratchRTWRunner(UtoteRace theRace, UtoteRunner theRunner, UtoteEntry theEntry) {
        String method = "RaceController.scratchRTWRunner";
        log4j.entry(method);

        boolean performedUpdate = false;
        StringBuilder[] msgs = null;

        // Get the parent event
        UtoteEvent parentEvent = theRace.getOrLoadParent(method);
        if (null != parentEvent) {

            log4j.debug(
                    "{} - About to scratch entry for RTW horseid={} at tracksid={}, trackId={}, parentEvent.getEventDate={} and eventId={}",
                    method, theEntry.getRTWhorsesid(), parentEvent.getRtwTracksid(), parentEvent.getTrackId(), parentEvent.getRtwEventDate(),
                    theRace.getEventId());

            // Get an Entity Manager
            final EntityManagerFactory rtwEmF = Configurator.getRTWEMF();
            final EntityManager rtwEm = rtwEmF.createEntityManager();

            // Make sure our RTW event info was loaded; could be an unsupported
            // track
            if (parentEvent.getRtwTracksid() != 0) {
                log4j.debug(
                        "{} - Found RTW Event matching tracksid={}, trackId={}, parentEvent.getEventDate={} and eventId={}",
                        method, parentEvent.getRtwTracksid(), parentEvent.getTrackId(), parentEvent.getRtwEventDate(),
                        theRace.getEventId());

                // Find the matching race in our system
                Race r = theRace.loadRTWrace(rtwEm);
                if (null != r) {
                    log4j.debug(
                            "{} - Found RTW Race matching trackId={}, tracksid={}, racesdate={}, racesid={}, and eventId={}",
                            method, parentEvent.getTrackId(), r.getTracksid(), r.getRacesdate(), r.getRacesid(),
                            parentEvent.getEventId());

                    // Try to retrieve the matching horse (by number, from the database, not memory)
                    Horse h = theEntry.loadRTWHorse(rtwEm);

                    // If found, and not already scratched
                    if ((null != h) && (!h.getHorsesscratchindicator().equalsIgnoreCase("Y"))) {

                        log4j.debug(
                                "{} - Found RTW Horse matching horsesprogramnumber={} trackId={}, raceId={}, and eventId={}",
                                method, h.getHorsesprogramnumber(), parentEvent.getTrackId(), theRace.getRaceId(),
                                theRace.getEventId());

                        // Update the horses scratch flag
                        try {
                            rtwEm.getTransaction().begin();
                            h.setHorsesscratchindicator("Y");
                            h.setHorsesscratchdescription("Via Tote Notification.");
                            // Convert the time to string format for update
                            // Note: MySQL provides ambiguous results when creating an epoch value
                            long lTime = Instant.now().getEpochSecond();
                            h.setHorsesscratchdescriptiontime(lTime);
                            h.setHorsesupdatedscratchdescriptiontime(lTime);
                            h = rtwEm.merge(h);
                            rtwEm.getTransaction().commit();
                            msgs = new StringBuilder[]{new StringBuilder(),new StringBuilder()};
                            msgs[0] = msgs[0].append("<br>Horse Number ").append(h.getHorsesprogramnumber()).append(",").append(h.getHorsesname()).append(", was scratched at ").append(getMsgTimestamp());
                            msgs[1] = msgs[1].append("|| Horse ").append(h.getHorsesprogramnumber()).append(", ").append(h.getHorsesname()).append(", scratched @").append(getMsgTimestamp());
                            log4j.info(
                                    "{} - Updated HorsesScratchIndicator to 'Y' for RTW Horse matching horseName={}, runnerNumber={}, raceId={}, trackId={}, and eventId={}",
                                    method, h.getHorsesname(), theRunner.getRunnerId(), theRace.getRaceId(),
                                    parentEvent.getTrackId(), theRace.getEventId());

                            // Update any user picks
                            try {
                                StringBuilder[] pickMsgs = updateMypicks(rtwEm, theRace, r, h);
                                if (null != pickMsgs) {
                                    msgs[0] = msgs[0].append(pickMsgs[0]);
                                    msgs[1] = msgs[1].append(pickMsgs[1]);
                                } else {
                                    log4j.debug("{} - No messages generated after call to updateMyPicks with tracsksid={}, racesid={}, racesdate={}, racesnumber={}",
                                            method, parentEvent.getRtwTracksid(), r.getRacesid(), r.getRacesdate(), r.getRacesnumber());
                                }
                            } catch (Exception e) {
                                log4j.error("{} - Exception generated during call to updateMyPicks with tracsksid={}, racesid={}, racesdate={}, racesnumber={}, horsesid={}, ExceptionMsg={}\nException={}",
                                        method, parentEvent.getRtwTracksid(), r.getRacesid(), r.getRacesdate(), r.getRacesnumber(), h.getHorsesid(), e.getMessage(), e);
                            }

                            // If an update was performed, notify the users via email and/or sms of changes
                            Usersemail.notifyUsersOfChange(parentEvent.getRtwTracksid(), r.getRacesid(), r.getRacesdate(), r.getRacesnumber(),
                                    msgs[0].toString(),
                                    msgs[1].toString());
                            log4j.debug("{} - Called Usersemail.notifyUsersOfChange with tracsksid={}, racesid={}, racesdate={}, racesnumber={}, emailMsgs={}, and smsMsgs={}",
                                    method, parentEvent.getRtwTracksid(), r.getRacesid(), r.getRacesdate(), r.getRacesnumber(), msgs[0].toString(), msgs[1].toString());


                        } catch (Exception e) {
                            log4j.error(
                                    "{} - Error trying to update the status on the RTW Horse matching horseName={}, runnerNumber={}, raceId={}, trackId={}, and eventId={}, ExceptionMsg={}\nException={}",
                                    method, h.getHorsesname(), theRunner.getRunnerId(), theRace.getRaceId(),
                                    parentEvent.getTrackId(), theRace.getEventId(), e.getMessage(), e);
                            if (rtwEm.getTransaction().isActive()) {
                                rtwEm.getTransaction().rollback();
                            }
                        }

                    } else if (null == h) {
                        log4j.error(
                                "{} - Did not find RTW Horse matching runnerNumber={}, raceId={}, trackId={}, and eventId={}",
                                method, theRunner.getRunnerId(), theRace.getRaceId(), parentEvent.getTrackId(),
                                theRace.getEventId());
                    } else  {
                        log4j.debug(
                                "{} - Found RTW Horse ALREADY SCRATCHED for matching runnerNumber={}, raceId={}, trackId={}, and eventId={}",
                                method, theRunner.getRunnerId(), theRace.getRaceId(), parentEvent.getTrackId(),
                                theRace.getEventId());
                    }

                } else {
                    log4j.error("{} - Did not find RTW Race matching trackId={}, raceId={}, and eventId={}", method,
                            parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId());
                }

            } else {
                log4j.debug("{} - Did not find RTW Track matching trackId={} and eventId={}", method,
                        parentEvent.getTrackId(), theRace.getEventId());
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
    public static boolean unscratchRTWRunner(UtoteRace theRace, UtoteRunner theRunner, UtoteEntry theEntry) {
        boolean performedUpdate = false;
        String method = "RaceController.unscratchRTWRunner";
        log4j.entry(method);

        // Get the parent event
        UtoteEvent parentEvent = theRace.getOrLoadParent(method);
        if (null != parentEvent) {

            // Get an Entity Manager
            final EntityManagerFactory rtwEmF = Configurator.getRTWEMF();
            final EntityManager rtwEm = rtwEmF.createEntityManager();

            // Make sure our RTW event info was loaded; could be an unsupported
            // track
            if (parentEvent.getRtwTracksid() != 0) {
                log4j.debug(
                        "{} - Found RTW Event matching tracksid={}, trackId={}, parentEvent.getEventDate={} and eventId={}",
                        method, parentEvent.getRtwTracksid(), parentEvent.getTrackId(), parentEvent.getRtwEventDate(),
                        theRace.getEventId());

                // Find the matching race in our system
                Race r = theRace.loadRTWrace(rtwEm);
                if (null != r) {
                    log4j.debug(
                            "{} - Found RTW Race matching trackId={}, tracksid={}, racesdate={}, racesid={}, and eventId={}",
                            method, parentEvent.getTrackId(), r.getTracksid(), r.getRacesdate(), r.getRacesid(),
                            parentEvent.getEventId());

                    // Now find the matching runner (by number)
                    Horse h = theEntry.loadRTWHorse(rtwEm);
                    if ((null != h)  && h.getHorsesscratchindicator().equalsIgnoreCase("Y")) {
                        log4j.debug("{} - Found RTW Race matching trackId={}, raceId={}, and eventId={}", method,
                                parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId());

                        // Update the horses scratch flag
                        try {
                            log4j.debug(
                                    "{} - existing horsesscratchindicator={}, existing horsesscratchdescriptiontime={}",
                                    method, h.getHorsesscratchindicator(), h.getHorsesscratchdescriptiontime());
                            rtwEm.getTransaction().begin();
                            h.setHorsesscratchindicator("N");
                            // Convert the time to string format for update
                            // Note: MySQL provides ambiguous results when
                            // creating an epoch value
                            long lTime = Instant.now().getEpochSecond();
                            h.setHorsesscratchdescriptiontime(lTime);
                            h = rtwEm.merge(h);
                            rtwEm.getTransaction().commit();
                            performedUpdate = true;
                            log4j.info(
                                    "{} - Updated HorsesScratchIndicator to N for RTW Horse matching horseName={}, runnerNumber={}, raceId={}, trackId={}, and eventId={}",
                                    method, h.getHorsesname(), theRunner.getRunnerId(), theRace.getRaceId(),
                                    parentEvent.getTrackId(), theRace.getEventId());
                        } catch (Exception e) {
                            log4j.error(
                                    "{} - Error trying to update the status on the RTW Race matching horseName={}, runnerNumber={}, raceId={}, trackId={}, and eventId={}",
                                    method, h.getHorsesname(), theRunner.getRunnerId(), theRace.getRaceId(),
                                    parentEvent.getTrackId(), theRace.getEventId());
                        }
                        // Re-read and display for debugging
                        rtwEm.refresh(r);
                        log4j.debug(
                                "{} - Post update horsesscratchindicator={}, post update horsesscratchdescriptiontime={}",
                                method, h.getHorsesscratchindicator(), h.getHorsesscratchdescriptiontime());
                        if (log4j.isTraceEnabled()) {
                            log4j.trace(
                                    "{} - Updated horse scratch indicator status to N for RTW Horse matching horseName={}, runnerNumber={}, raceId={}, trackId={}, and eventId={}\nResulting Horse object={}",
                                    method, h.getHorsesname(), theRunner.getRunnerId(), theRace.getRaceId(),
                                    parentEvent.getTrackId(), theRace.getEventId(), h);
                        }
                    } else if (null == h) {
                        log4j.error(
                                "{} - Did not find RTW Horse matching runnerNumber={}, raceId={}, trackId={}, and eventId={}",
                                method, theRunner.getRunnerId(), theRace.getRaceId(), parentEvent.getTrackId(),
                                theRace.getEventId());
                    } else {
                        log4j.debug(
                                "{} - Found RTW Horse ALREADY SCRATCHED for matching runnerNumber={}, raceId={}, trackId={}, and eventId={}",
                                method, theRunner.getRunnerId(), theRace.getRaceId(), parentEvent.getTrackId(),
                                theRace.getEventId());
                    }
                } else {
                    log4j.error("{} - Did not find RTW Race matching trackId={}, raceId={}, and eventId={}", method,
                            parentEvent.getTrackId(), theRace.getRaceId(), theRace.getEventId());
                }
            } else {
                log4j.debug("{} - Did not find RTW Track matching trackId={} and eventId={}", method,
                        parentEvent.getTrackId(), theRace.getEventId());
            }

            // Close down the persistence connections
            rtwEm.close();
            rtwEmF.close();

        }

        log4j.exit(performedUpdate);
        return performedUpdate;
    }


}