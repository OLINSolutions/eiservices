package com.ei.eiservices.utote.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
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
import com.ei.eiservices.utote.client.programservice.ProgramServiceStub;


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

    @Column
    private long rtwEventDate = 0l;

    @Transient
    private Event rtwEvent = null;

    @Transient
    boolean supportedTrackType = false;

    // @OneToMany(mappedBy="event", cascade = CascadeType.PERSIST)
    @Transient
    private Collection<UtoteRace> races = null; // Opt - Runners in race

    public UtoteEvent() {
    }

    public UtoteEvent(UtoteEvent source) {
        super();
        this.runId = source.runId;
        this.eventTime = source.eventTime;
        this.eventId = source.eventId;
        this.breakTo = source.breakTo;
        this.channel = source.channel;
        this.currencyId = source.currencyId;
        this.eventClass = source.eventClass;
        this.eventInfo = source.eventInfo;
        this.eventName = source.eventName;
        this.eventStatus = source.eventStatus;
        this.eventType = source.eventType;
        this.hasRaces = source.hasRaces;
        this.parlay = source.parlay;
        this.raceList = source.raceList;
        this.trackCondition = source.trackCondition;
        this.trackId = source.trackId;
        this.trackName = source.trackName;
        this.trackType = source.trackType;
        this.turfTrack = source.turfTrack;
        this.rtwTracksid = source.rtwTracksid;
        this.rtwTracksuniquecode = source.rtwTracksuniquecode;
        this.rtwTimezone = source.rtwTimezone;
        this.rtwTimezoneName = source.rtwTimezoneName;
        this.rtwEventDate = source.rtwEventDate;
        this.rtwEvent = source.rtwEvent;
        this.supportedTrackType = source.supportedTrackType;
        this.races = source.races;
    }

    public UtoteEvent(ProgramServiceStub.Event event) {
        super();
        updateFromTote(event);
    }

    public void updateFromTote(ProgramServiceStub.Event event) {
        if (event.isBreakToSpecified()) {
            this.setBreakTo(event.getBreakTo());
        }
        if (event.isChannelSpecified()) {
            this.setChannel(event.getChannel());
        }
        if (event.isCurrencyIdSpecified()) {
            this.setCurrencyId(event.getCurrencyId());
        }
        if (event.isEventClassSpecified()) {
            this.setEventClass(event.getEventClass());
        }
        if (event.isEventInfoSpecified()) {
            this.setEventInfo(event.getEventInfo());
            /*
            // Now should be done from within the database during the insert
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM uu HH:mm X");
            LocalDateTime dateTime = LocalDateTime.parse(event.getEventInfo() + " 00:00 Z", formatter);
            utoteEvent.setRtwEventDate(dateTime.toEpochSecond(ZoneOffset.UTC));
             */
        }
        if (event.isEventNameSpecified()) {
            this.setEventName(event.getEventName());
        }
        if (event.isEventStatusSpecified()) {
            this.setEventStatus(event.getEventStatus());
        }
        if (event.isEventTimeSpecified()) {
            this.setEventTime(event.getEventTime().getTime());
        }
        if (event.isEventTypeSpecified()) {
            this.setEventType(event.getEventType().getValue());
        }
        if (event.isParlaySpecified()) {
            this.setParlay(event.getParlay());
        }
        if (event.isRaceListSpecified()) {
            this.setRaceList(event.getRaceList().getCompressedList());
        }
        if (event.isTrackConditionSpecified()) {
            this.setTrackCondition(event.getTrackCondition());
        }
        if (event.isTrackIdSpecified()) {
            this.setTrackId(event.getTrackId());
        }
        if (event.isTrackNameSpecified()) {
            this.setTrackName(event.getTrackName());
        }
        if (event.isTrackTypeSpecified()) {
            this.setTrackType(event.getTrackType().getValue());
        }
        if (event.isTurfTrackSpecified()) {
            this.setTurfTrack(event.getTurfTrack());
        }
        if (event.isRacesSpecified() ||
                (event.isRaceListSpecified() &&
                        (null != event.getRaceList()) &&
                        (null != event.getRaceList().getCompressedList()) &&
                        (event.getRaceList().getCompressedList().length() > 0)
                        )
                ) {
            this.setHasRaces(true);
        }
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

    public boolean hasRaces() {
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
        builder.append("rtwEventDate=").append(getRtwEventDate()).append(", ");
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

    /**
     * @return the rtwEventDate
     */
    public long getRtwEventDate() {
        if (log4j.isDebugEnabled()) {
            Date d = new Date();
            d.setTime(this.rtwEventDate);
            log4j.debug("getEventDate - this.eventDate={}/{}, this.eventInfo={}", this.rtwEventDate, d.toString(), this.eventInfo);
        }
        return rtwEventDate;
    }

    /**
     * @param rtwEventDate the rtwEventDate to set
     */
    public void setRtwEventDate(long rtwEventDate) {
        this.rtwEventDate = rtwEventDate;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((breakTo == null) ? 0 : breakTo.hashCode());
        result = (prime * result) + ((channel == null) ? 0 : channel.hashCode());
        result = (prime * result) + ((currencyId == null) ? 0 : currencyId.hashCode());
        result = (prime * result) + ((eventClass == null) ? 0 : eventClass.hashCode());
        result = (prime * result) + ((eventId == null) ? 0 : eventId.hashCode());
        result = (prime * result) + ((eventInfo == null) ? 0 : eventInfo.hashCode());
        result = (prime * result) + ((eventName == null) ? 0 : eventName.hashCode());
        result = (prime * result) + ((eventStatus == null) ? 0 : eventStatus.hashCode());
        result = (prime * result) + ((eventTime == null) ? 0 : eventTime.hashCode());
        result = (prime * result) + ((eventType == null) ? 0 : eventType.hashCode());
        result = (prime * result) + (hasRaces ? 1231 : 1237);
        result = (prime * result) + (parlay ? 1231 : 1237);
        result = (prime * result) + ((raceList == null) ? 0 : raceList.hashCode());
        result = (prime * result) + runId;
        result = (prime * result) + ((trackCondition == null) ? 0 : trackCondition.hashCode());
        result = (prime * result) + ((trackId == null) ? 0 : trackId.hashCode());
        result = (prime * result) + ((trackName == null) ? 0 : trackName.hashCode());
        result = (prime * result) + ((trackType == null) ? 0 : trackType.hashCode());
        result = (prime * result) + ((turfTrack == null) ? 0 : turfTrack.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        UtoteEvent other = (UtoteEvent) obj;
        if (breakTo == null) {
            if (other.breakTo != null) {
                return false;
            }
        } else if (!breakTo.equals(other.breakTo)) {
            return false;
        }
        if (channel == null) {
            if (other.channel != null) {
                return false;
            }
        } else if (!channel.equals(other.channel)) {
            return false;
        }
        if (currencyId == null) {
            if (other.currencyId != null) {
                return false;
            }
        } else if (!currencyId.equals(other.currencyId)) {
            return false;
        }
        if (eventClass == null) {
            if (other.eventClass != null) {
                return false;
            }
        } else if (!eventClass.equals(other.eventClass)) {
            return false;
        }
        if (eventId == null) {
            if (other.eventId != null) {
                return false;
            }
        } else if (!eventId.equals(other.eventId)) {
            return false;
        }
        if (eventInfo == null) {
            if (other.eventInfo != null) {
                return false;
            }
        } else if (!eventInfo.equals(other.eventInfo)) {
            return false;
        }
        if (eventName == null) {
            if (other.eventName != null) {
                return false;
            }
        } else if (!eventName.equals(other.eventName)) {
            return false;
        }
        if (eventStatus == null) {
            if (other.eventStatus != null) {
                return false;
            }
        } else if (!eventStatus.equals(other.eventStatus)) {
            return false;
        }
        if (eventTime == null) {
            if (other.eventTime != null) {
                return false;
            }
        } else if (!eventTime.equals(other.eventTime)) {
            return false;
        }
        if (eventType == null) {
            if (other.eventType != null) {
                return false;
            }
        } else if (!eventType.equals(other.eventType)) {
            return false;
        }
        if (hasRaces != other.hasRaces) {
            return false;
        }
        if (parlay != other.parlay) {
            return false;
        }
        if (raceList == null) {
            if (other.raceList != null) {
                return false;
            }
        } else if (!raceList.equals(other.raceList)) {
            return false;
        }
        if (runId != other.runId) {
            return false;
        }
        if (trackCondition == null) {
            if (other.trackCondition != null) {
                return false;
            }
        } else if (!trackCondition.equals(other.trackCondition)) {
            return false;
        }
        if (trackId == null) {
            if (other.trackId != null) {
                return false;
            }
        } else if (!trackId.equals(other.trackId)) {
            return false;
        }
        if (trackName == null) {
            if (other.trackName != null) {
                return false;
            }
        } else if (!trackName.equals(other.trackName)) {
            return false;
        }
        if (trackType == null) {
            if (other.trackType != null) {
                return false;
            }
        } else if (!trackType.equals(other.trackType)) {
            return false;
        }
        if (turfTrack == null) {
            if (other.turfTrack != null) {
                return false;
            }
        } else if (!turfTrack.equals(other.turfTrack)) {
            return false;
        }
        return true;
    }

}