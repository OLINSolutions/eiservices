package com.ei.eiservices.utote.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ei.eiservices.utote.Configurator;


/**
 * The persistent class for the utoteEvents database table.
 *
 */
@Entity
@Table(name="utoteEvents")
@NamedQueries({
    @NamedQuery(name="UtoteEvent.findAll", query="SELECT u FROM UtoteEvent u"),
    @NamedQuery(name="UtoteEvent.findByEventId", query="SELECT e from UtoteEvent e where e.eventId = :eventId"),
    @NamedQuery(name="UtoteEvent.findSpecific", query="SELECT e from UtoteEvent e where e.runId = :runId and e.eventId = :eventId and e.eventTime = :eventTime")
})
public class UtoteEvent implements Serializable {

    private static final Logger log4j = LogManager.getLogger(UtoteEvent.class);

    private static final long serialVersionUID = 1L;

    public static final String EVENT_STATUS_CLOSED		= "Closed";
    public static final String EVENT_STATUS_OPEN		= "Open";
    public static final String EVENT_STATUS_FINISHED	= "Finished";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`idUtoteEvent`", insertable=true, updatable=false, unique=true, nullable=false)
    private int idUtoteEvent = 0;

    @Column(nullable=false)
    private int runId = 0;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable=false)
    private Date eventTime;

    @Column(nullable=false, length=3)
    private String eventId;

    @Column(precision=10, scale=2)
    private BigDecimal breakTo;

    @Column(length=4)
    private String channel;

    @Column(nullable=false, length=3)
    private String currencyId;

    @Column(length=1)
    private String eventClass;

    @Column(length=11)
    private String eventInfo;

    @Column(nullable=false, length=16)
    private String eventName;

    @Column(length=255)
    private String eventStatus;

    @Column(nullable=false, length=45)
    private String eventType;

    @Column(nullable=false)
    private boolean hasRaces = false;

    @Column(nullable=false)
    private boolean parlay = false;

    @Column(length=255, nullable=false)
    private String raceList;

    @Column(length=8)
    private String trackCondition;

    @Column(length=4)
    private String trackId;

    @Column(length=40)
    private String trackName;

    @Column(nullable=false, length=45)
    private String trackType;

    @Column(length=8)
    private String turfTrack;

    @Column()
    private int rtwTracksid = 0;

    @Column(length=45)
    private String rtwTracksuniquecode = null;

    @Column(length=40)
    private String rtwTimezone = null;

    @Column(length=40)
    private String rtwTimezoneName = null;

    @Transient
    private Event rtwEvent = null;

    @Transient
    boolean supportedTrackType = false;

    @Transient
    private Long eventDate = null;

    // @OneToMany(mappedBy="event", cascade = CascadeType.PERSIST)
    @Transient
    private Collection<UtoteRace> races = null; // Opt - Runners in race

    public UtoteEvent() {
    }

    public int getIdUtoteEvent() {
        return this.idUtoteEvent;
    }

    public void setIdUtoteEvent(int idUtoteEvent) {
        this.idUtoteEvent = idUtoteEvent;
    }

    public BigDecimal getBreakTo() {
        return this.breakTo;
    }

    public void setBreakTo(BigDecimal breakTo) {
        this.breakTo = breakTo;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getCurrencyId() {
        return this.currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getEventClass() {
        return this.eventClass;
    }

    public void setEventClass(String eventClass) {
        this.eventClass = eventClass;
    }

    public String getEventId() {
        return this.eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventInfo() {
        return this.eventInfo;
    }

    public void setEventInfo(String eventInfo) {
        this.eventInfo = eventInfo;
    }

    public String getEventName() {
        return this.eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventStatus() {
        return this.eventStatus;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    public long getEventDate() {
        if (null == this.eventDate) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM uu HH:mm X");
            LocalDateTime dateTime = LocalDateTime.parse(eventInfo + " 00:00 Z", formatter);
            this.eventDate = dateTime.toEpochSecond(ZoneOffset.UTC);
            /*
            long millisInDay = 60 * 60 * 24 * 1000;
            long currentTime = new Date().getTime();
            this.eventDate = (currentTime / millisInDay) * millisInDay;
            this.eventDate /= 1000l;
             */
        }
        Date d = new Date();
        d.setTime(this.eventDate);
        log4j.debug("getEventDate - this.eventDate={}/{}, this.eventInfo={}", this.eventDate, d.toString(), this.eventInfo);
        //        log4j.debug("getEventDate - this.eventDate={}/{}, this.eventTime.getTime()={}", this.eventDate, d.toString(), this.eventTime.getTime()/1000);
        return this.eventDate;
    }

    public Date getEventTime() {
        return this.eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventType() {
        return this.eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public boolean getHasRaces() {
        return this.hasRaces;
    }

    public void setHasRaces(boolean hasRaces) {
        this.hasRaces = hasRaces;
    }

    public boolean getParlay() {
        return this.parlay;
    }

    public void setParlay(boolean parlay) {
        this.parlay = parlay;
    }

    public String getRaceList() {
        return this.raceList;
    }

    public void setRaceList(String raceList) {
        this.raceList = raceList;
    }

    public int getRunId() {
        return this.runId;
    }

    public void setRunId(int runId) {
        this.runId = runId;
    }

    public String getTrackCondition() {
        return this.trackCondition;
    }

    public void setTrackCondition(String trackCondition) {
        this.trackCondition = trackCondition;
    }

    public String getTrackId() {
        return this.trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return this.trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackType() {
        return this.trackType;
    }

    public void setTrackType(String trackType) {
        this.trackType = trackType;
    }

    public String getTurfTrack() {
        return this.turfTrack;
    }

    public void setTurfTrack(String turfTrack) {
        this.turfTrack = turfTrack;
    }

    /**
     * @return the races
     */
    public Collection<UtoteRace> getRaces() {
        return races;
    }

    /**
     * @param races the races to set
     */
    public void setRaces(Collection<UtoteRace> races) {
        this.races = races;
    }

    /**
     * @param Event to set as rtw events object
     */
    public void setRtwEvent(Event rtwEvent) {
        this.rtwEvent = rtwEvent;
    }

    public Event getRtwEvent() {
        Event ev = this.rtwEvent;
        if (null == ev) {

            // Get Entity Managers
            final EntityManagerFactory rtwEmF = Configurator.getRTWEMF();
            final EntityManager rtwEm = rtwEmF.createEntityManager();

            // Find the supporting RTW event object based on incoming CHRIMS code
            TypedQuery<Event> qe = rtwEm.createNamedQuery("Event.findByCHRIMS", Event.class);
            qe.setParameter("code",  this.eventId);
            try { ev = qe.getSingleResult(); }
            catch (javax.persistence.NoResultException e) {

                // Could not find standard CHRIMS code, look again by CHRIMS2
                if (2 == this.eventId.length()) {
                    qe = rtwEm.createNamedQuery("Event.findByCHRIMS2", Event.class);
                    qe.setParameter("code",  this.eventId);
                    try { ev = qe.getSingleResult(); }
                    catch (javax.persistence.NoResultException e2) {}
                }
            }

            rtwEm.close();
            rtwEmF.close();

            // Was a corresponding RTW event object found
            if (null == ev) {
                log4j.error("getRtwEvent - Could not find corresponding RTW Event/Track by either CHRIMS or CHRIMS2.  UtoteEvent={}", this.toString(false));
            } else {
                this.rtwEvent = ev;
            }
        }
        return ev;
    }

    /**
     * @return the rtwTracksid
     */
    public int getRtwTracksid() {
        return rtwTracksid;
    }

    /**
     * @param rtwTracksid the rtwTracksid to set
     */
    public void setRtwTracksid(int rtwTracksid) {
        this.rtwTracksid = rtwTracksid;
    }

    /**
     * @return the rtwTracksuniquecode
     */
    public String getRtwTracksuniquecode() {
        return rtwTracksuniquecode;
    }

    /**
     * @param rtwTracksuniquecode the rtwTracksuniquecode to set
     */
    public void setRtwTracksuniquecode(String rtwTracksuniquecode) {
        this.rtwTracksuniquecode = rtwTracksuniquecode;
    }

    /**
     * @return the rtwTimezone
     */
    public String getRtwTimezone() {
        return rtwTimezone;
    }

    /**
     * @param rtwTimezone the rtwTimezone to set
     */
    public void setRtwTimezone(String rtwTimezone) {
        this.rtwTimezone = rtwTimezone;
    }

    /**
     * @param eventDate the eventDate to set
     */
    public void setEventDate(Long eventDate) {
        this.eventDate = eventDate;
    }

    public String toString(boolean deep) {
        StringBuilder builder = new StringBuilder();
        builder.append("UtoteEvent [idUtoteEvent=").append(idUtoteEvent).append(", runId=").append(runId).append(", ");
        if (eventTime != null) {
            builder.append("eventTime=").append(eventTime).append(", ");
        }
        if (eventId != null) {
            builder.append("eventId=").append(eventId).append(", ");
        }
        if (breakTo != null) {
            builder.append("breakTo=").append(breakTo).append(", ");
        }
        if (channel != null) {
            builder.append("channel=").append(channel).append(", ");
        }
        if (currencyId != null) {
            builder.append("currencyId=").append(currencyId).append(", ");
        }
        if (eventClass != null) {
            builder.append("eventClass=").append(eventClass).append(", ");
        }
        if (eventInfo != null) {
            builder.append("eventInfo=").append(eventInfo).append(", ");
        }
        if (eventName != null) {
            builder.append("eventName=").append(eventName).append(", ");
        }
        if (eventStatus != null) {
            builder.append("eventStatus=").append(eventStatus).append(", ");
        }
        if (eventType != null) {
            builder.append("eventType=").append(eventType).append(", ");
        }
        builder.append("hasRaces=").append(hasRaces).append(", parlay=").append(parlay).append(", ");
        if (raceList != null) {
            builder.append("raceList=").append(raceList).append(", ");
        }
        if (trackCondition != null) {
            builder.append("trackCondition=").append(trackCondition).append(", ");
        }
        if (trackId != null) {
            builder.append("trackId=").append(trackId).append(", ");
        }
        if (trackName != null) {
            builder.append("trackName=").append(trackName).append(", ");
        }
        if (trackType != null) {
            builder.append("trackType=").append(trackType).append(", ");
        }
        builder.append("supportedTrackType=").append(this.supportedTrackType).append(", ");
        if (turfTrack != null) {
            builder.append("turfTrack=").append(turfTrack).append(", ");
        }
        builder.append("eventDate=").append(getEventDate()).append(", ");
        builder.append("rtwTracksid=").append(rtwTracksid).append(", ");
        if (rtwTracksuniquecode != null) {
            builder.append("rtwTracksuniquecode=").append(rtwTracksuniquecode).append(", ");
        }
        if (rtwTimezone != null) {
            builder.append("rtwTimezone=").append(rtwTimezone).append(", ");
        }
        if (rtwTimezoneName != null) {
            builder.append("rtwTimezoneName=").append(rtwTimezoneName).append(", ");
        }
        if (deep && (races != null)) {
            builder.append("races=").append(races).append(", ");
        }
        if (deep && (rtwEvent != null)) {
            builder.append("rtwEvent=").append(rtwEvent);
        }
        builder.append("]");
        return builder.toString();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return toString(false);
    }

    /**
     * Retrieve any Race elements associated with this event
     *
     * @param em The EntityManager to run against
     */
    public void load(EntityManager em, boolean deep) {
        TypedQuery<UtoteRace> rq = em.createNamedQuery("UtoteRace.findByParent", UtoteRace.class);
        rq.setParameter("idParent", this.idUtoteEvent);
        this.races = rq.getResultList();
        if (null != this.races) {
            this.hasRaces = true;
            // For each race, set us as the parent
            for (UtoteRace aRace : this.races) {
                if (deep) {
                    aRace.load(em, this);
                } else {
                    aRace.setEvent(this);
                }
            }
        }
    }
    public void load(EntityManager em) {
        load(em, false);
    }

    /**
     * Clear any Race elements associated with this event
     *
     */
    public void clear() {
        if (null != this.races) {
            for (UtoteRace aRace : this.races) {
                aRace.clear();
            }
            this.races.clear();
            this.races = null;
        }
    }

    /**
     * Detaches any Pool elements associated with this race
     *
     * @param em The EntityManager to detach from
     */
    public void detach(EntityManager em, boolean deep) {
        if (deep && (null != this.races)) {
            for (UtoteRace aRace : this.races) {
                aRace.detach(em);
            }
        }
        em.detach(this);
    }

    /**
     * Detaches any Pool elements associated with this race
     *
     * @param em The EntityManager to detach from
     */
    public void detach(EntityManager em) {
        detach(em, false);
    }

    /**
     * Loads the RTW-related event information if not already done.
     *
     * @return true if the event is a supported type and the information was loaded
     */
    public boolean loadRTWEventInfo() {

        boolean valid = false;

        // Check if supported track/event type
        this.supportedTrackType = Configurator.isSupportedTrackType(this.trackType);
        if (this.supportedTrackType) {

            // Get Entity Managers
            Event ev = this.getRtwEvent();
            // Was a corresponding RTW event object found
            if (null == ev) {
                log4j.error("loadRtwEvent - Could not find corresponding RTW Event/Track for a supported type.  UtoteEvent={}", this.toString(false));

            } else {

                // Fill in the required fields
                this.rtwTracksid = ev.getTracksid();
                if (null != ev.getEQBCode()) {
                    this.rtwTracksuniquecode = ev.getEQBCode();
                    log4j.debug("loadRtwEvent - Setting rtwTracksuniquecode to {} from EQBCode for RTW Event/Track type.  EventId={}, TrackType={}", this.rtwTracksuniquecode, this.eventId, this.trackType);
                } else if (null != ev.getTMHCode()) {
                    this.rtwTracksuniquecode = ev.getTMHCode();
                    log4j.debug("loadRtwEvent - Setting rtwTracksuniquecode to {} from TMHCode for RTW Event/Track type.  EventId={}, TrackType={}", this.rtwTracksuniquecode, this.eventId, this.trackType);
                } else if (null != ev.getEQBHCode()) {
                    this.rtwTracksuniquecode = ev.getEQBHCode();
                    log4j.debug("loadRtwEvent - Setting rtwTracksuniquecode to {} from EQBHCode for RTW Event/Track type.  EventId={}, TrackType={}", this.rtwTracksuniquecode, this.eventId, this.trackType);
                } else {
                    log4j.warn("loadRtwEvent - Could not find a value to put into rtwTracksuniquecode for RTW Event/Track type.  EventId={}, TrackType={}", this.rtwTracksuniquecode, this.eventId, this.trackType);
                }
                this.rtwTimezone = ev.getTimezone().substring(4, 10);
                this.rtwTimezoneName = ev.getTimezoneName();
                valid = true;

            }

        } else {
            log4j.debug("loadRtwEvent - Non-supported RTW Event/Track type.  EventId={}, TrackType={}", this.eventId, this.trackType);
        }

        return valid;
    }

    /**
     * @return the supportedTrackType
     */
    public boolean isSupportedTrackType() {
        return supportedTrackType;
    }

    /**
     * @param supportedTrackType the supportedTrackType to set
     */
    public void setSupportedTrackType(boolean supportedTrackType) {
        this.supportedTrackType = supportedTrackType;
    }

    /**
     */
    public void setTransients() {
        this.supportedTrackType = Configurator.isSupportedTrackType(this.trackType);
    }

    /**
     * @return the rtwTimezoneName
     */
    public String getRtwTimezoneName() {
        return rtwTimezoneName;
    }

    /**
     * @param rtwTimezoneName the rtwTimezoneName to set
     */
    public void setRtwTimezoneName(String rtwTimezoneName) {
        this.rtwTimezoneName = rtwTimezoneName;
    }

}