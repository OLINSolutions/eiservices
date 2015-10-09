package com.ei.eiservices.utote.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ei.eiservices.utote.Configurator;
import com.ei.eiservices.utote.client.programservice.ProgramServiceStub;


/**
 * The persistent class for the utoteRaces database table.
 *
 */
@Entity
@Table(name="utoteRaces")
@NamedQueries({
    @NamedQuery(name="UtoteRace.findAll", query="SELECT u FROM UtoteRace u"),
    @NamedQuery(name="UtoteRace.findByParent", query="SELECT r FROM UtoteRace r WHERE r.idParent = :idParent"),
    @NamedQuery(name="UtoteRace.findSpecific", query="SELECT c from UtoteRace c where c.idParent = (SELECT e.idUtoteEvent from UtoteEvent e where e.eventId = :eventId) and c.raceId = :raceId"),
    @NamedQuery(name="UtoteRace.findFinal", query="SELECT r FROM UtoteRace r WHERE r.raceStatus = 'Final'"),
    @NamedQuery(name="UtoteRace.findSpecificWithValidTrackType", query="SELECT c from UtoteRace c where c.trackType IN :validTrackTypes and c.idParent = (SELECT e.idUtoteEvent from UtoteEvent e where e.eventId = :eventId) and c.raceId = :raceId")
})
public class UtoteRace implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final Logger log4j = LogManager.getLogger(UtoteRace.class);

    public static final String RACE_STATUS_OPEN			= "Open";
    public static final String RACE_STATUS_CLOSED		= "Closed";
    public static final String RACE_STATUS_POST			= "Post";
    public static final String RACE_STATUS_FINAL		= "Final";
    public static final String RACE_STATUS_CANCELED		= "Canceled";
    public static final String RACE_STATUS_UNCANCELED	= "Uncanceled";
    public static final String RACE_STATUS_LOCKED		= "Locked";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`idUtoteRace`", insertable=true, updatable=false, unique=true, nullable=false)
    private int idUtoteRace = 0;

    @Column(length=40)
    private String age = null;

    @Column(length=255)
    private String claim = null;

    @Column(length=50)
    private String conditions = null;

    @Column(nullable=false)
    private boolean current = false;

    @Column(length=20)
    private String distance = null;

    @Column(length=20)
    private String finish = null;

    @Column(nullable=false)
    private boolean hasPools = false;

    @Column(nullable=false)
    private boolean hasRunners = false;

    @Column(nullable=true)
    private Integer idParent = null;

    @Column(length=255, nullable=false)
    private String live = null;

    @Column(nullable=false)
    private int numberOfRunners = 0;

    @Column(nullable=false)
    private boolean odds = false;

    @Column(length=255, nullable=false)
    private String poolList = null;

    @Column
    private Long postTime = null;

    @Column(nullable=false)
    private boolean program = false;

    @Column(length=255)
    private String purse = null;

    @Column(nullable=false)
    private int raceId = 0;

    @Column(nullable=false, length=45)
    private String raceStatus = null;

    @Column(length=30)
    private String racetype = null;

    @Column(length=30)
    private String sex = null;

    @Column(length=10)
    private String surface = null;

    @Column(nullable=false, length=45)
    private String trackType = null;

    @Column
    private boolean hasChanges = false;

    @Column
    private int RTWracesid = 0;

    @Embedded
    private UtoteRaceChange raceChange = null; // Opt - List of late changes to

    // @OneToMany(mappedBy="race", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @Transient
    private Collection<UtotePool> pools = null;	// Opt - List of pools available for wagering in this race.
    // Multi-­‐race pools are listed in the first race of the pool.

    // @OneToMany(mappedBy="race", cascade = CascadeType.PERSIST)
    @Transient
    private Collection<UtoteRunner> runners = null; // Opt - Runners in race

    // @ManyToOne(optional = false, cascade = CascadeType.REFRESH)
    // @JoinColumn(name = "idParent", referencedColumnName = "`idUtoteEvent`", insertable=false, updatable=false)
    @Transient
    private UtoteEvent event = null;

    @Transient
    private Race RTWrace = null;

    @Transient
    boolean weSet = false;

    public UtoteRace() {
    }

    public UtoteRace(UtoteRace source) {
        super();
        this.age = source.age;
        this.claim = source.claim;
        this.conditions = source.conditions;
        this.current = source.current;
        this.distance = source.distance;
        this.finish = source.finish;
        this.hasPools = source.hasPools;
        this.hasRunners = source.hasRunners;
        this.idParent = source.idParent;
        this.live = source.live;
        this.numberOfRunners = source.numberOfRunners;
        this.odds = source.odds;
        this.poolList = source.poolList;
        this.postTime = source.postTime;
        this.program = source.program;
        this.purse = source.purse;
        this.raceId = source.raceId;
        this.raceStatus = source.raceStatus;
        this.racetype = source.racetype;
        this.sex = source.sex;
        this.surface = source.surface;
        this.trackType = source.trackType;
        this.hasChanges = source.hasChanges;
        this.RTWracesid = source.RTWracesid;
        this.raceChange = source.raceChange;
        this.pools = source.pools;
        this.runners = source.runners;
        this.event = source.event;
        this.RTWrace = source.RTWrace;
    }

    public UtoteRace(ProgramServiceStub.Race rRace) {
        super();
        updateFromTote(rRace);
    }

    public UtoteRace(int idParent, ProgramServiceStub.Race rRace) {
        super();
        updateFromTote(idParent, rRace);
    }

    public void updateFromTote(int idParent, ProgramServiceStub.Race rRace) {
        this.idParent = idParent;
        updateFromTote(rRace);
    }

    public void updateFromTote(ProgramServiceStub.Race rRace) {

        if (rRace.isPoolsSpecified()) {
            this.setHasPools(rRace.isPoolsSpecified());
        }
        if (rRace.isRunnersSpecified()) {
            this.setHasRunners(rRace.isRunnersSpecified());
        }
        if (rRace.isRaceStatusSpecified()) {
            this.setRaceStatus(rRace.getRaceStatus().getValue());
        }
        if (rRace.isTrackTypeSpecified()) {
            this.setTrackType(rRace.getTrackType().getValue());
        }
        if (rRace.isCurrentSpecified()) {
            this.setCurrent(rRace.getCurrent());
        }
        if (rRace.isPostTimeSpecified()) {
            String postTimeStr = rRace.getPostTimeStr() + "Z";
            Instant inst = Instant.parse(postTimeStr);
            long lTime = inst.toEpochMilli();
            log4j.debug("{} - postTimeStr={}, PostTime(cal.getTimeInMillis())={}, PostTime(cal.toString)={}", "UtoteRace.updateFromTote", postTimeStr, lTime, inst.toString());
            this.setPostTime(lTime);
        }
        if (rRace.isNumberOfRunnersSpecified()) {
            this.setNumberOfRunners(rRace.getNumberOfRunners());
        }
        if (rRace.isFinishSpecified()) {
            this.setFinish(rRace.getFinish());
        }
        if (rRace.isProgramSpecified()) {
            this.setProgram(rRace.getProgram());
        }
        if (rRace.isOddsSpecified()) {
            this.setOdds(rRace.getOdds());
        }
        if (rRace.isLiveSpecified()) {
            this.setLive(rRace.getLive().getCompressedList());
        }
        if (rRace.isPoolListSpecified()) {
            this.setPoolList(rRace.getPoolList());
        }
        if (rRace.isConditionsSpecified()) {
            this.setConditions(rRace.getConditions());
        }
        if (rRace.isRaceTypeSpecified()) {
            this.setRacetype(rRace.getRaceType());
        }
        if (rRace.isSurfaceSpecified()) {
            this.setSurface(rRace.getSurface());
        }
        if (rRace.isDistanceSpecified()) {
            this.setDistance(rRace.getDistance());
        }
        if (rRace.isPurseSpecified()) {
            this.setPurse(rRace.getPurse().toString());
        }
        if (rRace.isSexSpecified()) {
            this.setSex(rRace.getSex());
        }
        if (rRace.isAgeSpecified()) {
            this.setAge(rRace.getAge());
        }
        if (rRace.isClaimSpecified()) {
            this.setClaim(rRace.getClaim().toString());
        }

        if (rRace.isRaceChangesSpecified()) {
            this.setHasChanges(rRace.getRaceChanges().isChangeSpecified());
            if (this.hasChanges()) {
                ProgramServiceStub.RaceChange rChange = rRace.getRaceChanges().getChange()[0];
                if (null == raceChange) {
                    this.raceChange = new UtoteRaceChange(rChange);
                } else {
                    this.raceChange.updateFromTote(rChange);
                }

            }
        } else {
            // Must have an empty (all false) Race Change
            this.setRaceChange(new UtoteRaceChange());
        }

    }

    public static Collection<UtoteRace> findByParent(EntityManager em, int idParent) {
        String method = "UtoteRace.findByParent";
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
            log4j.debug("{} - Received Exception looking for races with parentId(idUtoteEvent)={}, ExceptionMsg={}, Exception={}",
                    method, idParent, e.getMessage(), e);
        }
        log4j.exit(method+" - " + ((null == raceList) ? "NOT FOUND" : "FOUND"));
        return raceList;
    }

    // Find and deeply retrieve the requested race, but detach it from
    // the associated EM.
    public static UtoteRace findSpecific(EntityManager em, String eventId, int raceId) {
        String method = "UtoteRace.findSpecific";
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
        } catch (Exception e) {
            log4j.debug("{} - Received Exception looking for race with eventId={} and raceId={}, ExceptionMsg={}, Exception={}",
                    method, eventId, raceId, e.getMessage(), e);
        }
        log4j.exit(method+" - " + ((null == utoteRace) ? "NOT FOUND" : "FOUND"));
        return utoteRace;
    }

    public int getIdUtoteRace() {
        return this.idUtoteRace;
    }

    public void setIdUtoteRace(int idUtoteRace) {
        this.idUtoteRace = idUtoteRace;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getClaim() {
        return this.claim;
    }

    public void setClaim(String claim) {
        this.claim = claim;
    }

    public String getConditions() {
        return this.conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public boolean getCurrent() {
        return this.current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }

    public String getDistance() {
        return this.distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getEventId() {
        return (null == this.event)?null:this.event.getEventId();
    }

    public void setEventId(String eventId) {
        if (null == this.event) {
            this.event = new UtoteEvent();
        }
        this.event.setEventId(eventId);
    }

    public String getFinish() {
        return this.finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public boolean getHasPools() {
        return this.hasPools;
    }

    public void setHasPools(boolean hasPools) {
        this.hasPools = hasPools;
    }

    public boolean getHasRunners() {
        return this.hasRunners;
    }

    public void setHasRunners(boolean hasRunners) {
        this.hasRunners = hasRunners;
    }

    public int getIdUtoteEvent() {
        return this.idParent;
    }

    public void setIdUtoteEvent(int idUtoteEvent) {
        this.idParent = idUtoteEvent;
    }

    public String getLive() {
        return this.live;
    }

    public void setLive(String live) {
        this.live = live;
    }

    public int getNumberOfRunners() {
        return this.numberOfRunners;
    }

    public void setNumberOfRunners(int numberOfRunners) {
        this.numberOfRunners = numberOfRunners;
    }

    public boolean getOdds() {
        return this.odds;
    }

    public void setOdds(boolean odds) {
        this.odds = odds;
    }

    public String getPoolList() {
        return this.poolList;
    }

    public void setPoolList(String poolList) {
        this.poolList = poolList;
    }

    public Long getPostTime() {
        return this.postTime;
    }

    public void setPostTime(Long postTime) {
        this.postTime = postTime;
    }

    public boolean getProgram() {
        return this.program;
    }

    public void setProgram(boolean program) {
        this.program = program;
    }

    public String getPurse() {
        return this.purse;
    }

    public void setPurse(String purse) {
        this.purse = purse;
    }

    public int getRaceId() {
        return this.raceId;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }

    public String getRaceStatus() {
        return this.raceStatus;
    }

    public void setRaceStatus(String raceStatus) {
        this.raceStatus = raceStatus;
    }

    public String getRacetype() {
        return this.racetype;
    }

    public void setRacetype(String racetype) {
        this.racetype = racetype;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSurface() {
        return this.surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public String getTrackType() {
        return this.trackType;
    }

    public void setTrackType(String trackType) {
        this.trackType = trackType;
    }

    /**
     * @return the pools
     */
    public Collection<UtotePool> getPools() {
        return pools;
    }

    /**
     * @param pools the pools to set
     */
    public void setPools(Collection<UtotePool> pools) {
        this.pools = pools;
    }

    /**
     * @return the runners
     */
    public Collection<UtoteRunner> getRunners() {
        return runners;
    }

    /**
     * @param runners the runners to set
     */
    public void setRunners(Collection<UtoteRunner> runners) {
        this.runners = runners;
    }

    /**
     * @return the raceChange
     */
    public UtoteRaceChange getRaceChange() {
        return raceChange;
    }

    /**
     * @param raceChange the raceChange to set
     */
    public void setRaceChange(UtoteRaceChange raceChange) {
        this.raceChange = raceChange;
    }

    /**
     * @return the event
     */
    public UtoteEvent getEvent() {
        return event;
    }

    /**
     * @return true if the event object exists
     */
    public boolean hasEvent() {
        return (null != this.event);
    }

    /**
     * @param event the event to set
     */
    public void setEvent(UtoteEvent event) {
        this.event = event;
    }

    /**
     * @return the idParent
     */
    public Integer getIdParent() {
        return idParent;
    }

    /**
     * @param idParent the idParent to set
     */
    public void setIdParent(Integer idParent) {
        this.idParent = idParent;
    }

    /**
     * @return the hasChanges
     */
    public boolean hasChanges() {
        return hasChanges;
    }

    /**
     * @param hasChanges the hasChanges to set
     */
    public void setHasChanges(boolean hasChanges) {
        this.hasChanges = hasChanges;
    }


    /**
     * Utility Methods
     */

    /**
     * Retrieve any runner elements associated with this race
     *
     * @param em The EntityManager to run against
     */
    public void loadRunners(EntityManager em, UtoteEvent parent) {
        if (null != parent) {
            this.setEvent(parent);
        }
        TypedQuery<UtoteRunner> rq = em.createNamedQuery("UtoteRunner.findByParent", UtoteRunner.class);
        rq.setParameter("idParent", this.idUtoteRace);
        this.runners = rq.getResultList();
        if (null != this.runners) {
            // For each runner, retrieve it's entrants
            for (UtoteRunner aRunner : runners) {
                aRunner.load(em, this);
            }
        }
    }
    public void loadRunners(EntityManager em) {
        loadRunners(em, null);
    }

    /**
     * Clear any runner elements associated with this race
     *
     */
    public void clearRunners() {
        if (null != this.runners) {
            // For each runner, retrieve it's entrants
            for (UtoteRunner aRunner : runners) {
                aRunner.clear();
                aRunner.setRace(null);
            }
            this.runners.clear();
            this.runners = null;
        }
    }

    /**
     * Detaches any Runner elements associated with this race
     *
     * @param em The EntityManager to detach from
     */
    public void detachRunners(EntityManager em) {
        if (null != this.runners) {
            for (UtoteRunner aRunner : runners) {
                // For each runner, detach it's entrants
                aRunner.detachEntries(em);
                em.detach(aRunner);
            }
        }
    }

    /**
     * Retrieve any pool elements associated with this race
     *
     * @param em The EntityManager to run against
     */
    public void loadPools(EntityManager em, UtoteEvent parent) {
        if (null != parent) {
            this.setEvent(parent);
        }
        TypedQuery<UtotePool> rq = em.createNamedQuery("UtotePool.findByParent", UtotePool.class);
        rq.setParameter("idParent", this.idUtoteRace);
        this.pools = rq.getResultList();
        if (null != this.pools) {
            // For each pool, set us as the parent
            for (UtotePool aPool : pools) {
                aPool.setRace(this);
            }
        }
    }
    public void loadPools(EntityManager em) {
        loadPools(em, null);
    }

    /**
     * Clear any pool elements associated with this race
     *
     * @param em The EntityManager to run against
     */
    public void clearPools() {
        if (null != this.pools) {
            // For each pool, set us as the parent
            for (UtotePool aPool : pools) {
                aPool.setRace(null);
            }
            this.pools.clear();
            this.pools = null;
        }
    }

    /**
     * Detaches any Pool elements associated with this race
     *
     * @param em The EntityManager to detach from
     */
    public void detachPools(EntityManager em) {
        if (null != this.pools) {
            for (UtotePool aPool : this.pools) {
                em.detach(aPool);
            }
        }
    }

    /**
     * Retrieve the parent Event that owns this race
     *
     * @param em The EntityManager to run against
     */
    public UtoteEvent loadParent(EntityManager em) {
        this.event = em.find(UtoteEvent.class, this.idParent);
        if (null != this.event) {
            this.event.setTransients();
            this.event.setHasRaces(true);
            Collection<UtoteRace> races = new ArrayList<UtoteRace>();
            races.add(this);
            this.event.setRaces(races);
        } else {
            log4j.debug("UtoteRace.loadParent - Could not find parent UtoteEvent for this UtoteRace entity with idParent={}", this.idParent);
        }
        return this.event;
    }

    public UtoteEvent getOrLoadParent(String callingMethod) {
        String method = "ToteLinkUpdateServiceHandler.getParentEvent on behalf of " + callingMethod;
        // If the provided UtoteRace's event is empty, load it
        UtoteEvent parentEvent = this.getEvent();
        if (null == parentEvent) {
            // Get Entity Managers
            final EntityManagerFactory roEmF = Configurator.getROEMF();
            final EntityManager roEm = roEmF.createEntityManager();
            try {
                log4j.debug(
                        "{} - Parent UtoteEvent was not loaded, attempting to load for Race matching raceId={}, and eventId={}",
                        method, this.getRaceId(), this.getEventId());
                parentEvent = this.loadParent(roEm);
                if (null != parentEvent) {
                    roEm.detach(parentEvent);
                } else {
                    log4j.error("{} - Parent UtoteEvent not found for Race matching raceId={}, and eventId={}", method,
                            this.getRaceId(), this.getEventId());
                }
            } catch (Exception e) {
                log4j.error(
                        "{} - Error trying to retrieve parent UtoteEvent for Race matching raceId={}, and eventId={}\nException={}",
                        method, this.getRaceId(), this.getEventId(), e);
            } finally {
                roEm.close();
                roEmF.close();
            }
        }
        return parentEvent;
    }

    /**
     * Loads this races associated objects
     *
     * @param em The EntityManager to load from
     */
    public void load(EntityManager em, UtoteEvent parent) {
        if (null != parent) {
            this.setEvent(parent);
            weSet = true;
        }
        loadPools(em);
        loadRunners(em);
    }
    public void load(EntityManager em) {
        load(em, null);
    }

    /**
     * Detaches this race from the em
     *
     * @param em The EntityManager to detach from
     */
    public void detach(EntityManager em) {
        detachPools(em);
        detachRunners(em);
        if ((null != this.event) && weSet) {
            this.event.detach(em);
        }
        em.detach(this);
    }

    /**
     * Clears this races embedded objects
     *
     */
    public void clear() {
        clearPools();
        clearRunners();
        this.event = null;
    }

    public Race getRTWrace() {
        if (null == this.RTWrace) {
            loadRTWrace();
        }
        return this.RTWrace;
    }

    public Race loadRTWrace() {

        Race r = null;

        // Get Entity Managers
        final EntityManagerFactory rtwEmF = Configurator.getRTWEMF();
        final EntityManager rtwEm = rtwEmF.createEntityManager();

        r = loadRTWrace(rtwEm);

        rtwEm.close();
        rtwEmF.close();

        return r;
    }

    public Race loadRTWrace(EntityManager rtwEm) {

        Race r = null;

        try {
            r = rtwEm.find(Race.class, this.RTWracesid);
            this.RTWrace = r;
        } catch (javax.persistence.NoResultException e) {
            log4j.debug(
                    "loadRTWRace - NoResultException running query for RTW Race with RTWracesid={}.\nException={}",
                    this.RTWracesid, e);
        } catch (Exception e2) {
            log4j.debug(
                    "loadRTWRace - Unexpected Exception running query for RTW Race with RTWracesid={}.\nException={}",
                    this.RTWracesid, e2);
        }

        // Was a corresponding RTW Race object found
        if (null == r) {
            log4j.debug("loadRTWRace - Could not find RTW Race row with racesid={} for UtoteRace={}", this.RTWracesid, this.toString(false));
        } else {
            this.RTWrace = r;
        }

        return r;
    }

    /**
     * @return the rTWracesid
     */
    public int getRTWracesid() {
        return RTWracesid;
    }

    /**
     * @param rTWracesid the rTWracesid to set
     */
    public void setRTWracesid(int rTWracesid) {
        RTWracesid = rTWracesid;
    }

    /**
     * @param rTWrace the rTWrace to set
     */
    public void setRTWrace(Race rTWrace) {
        RTWrace = rTWrace;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return this.toString(false);
    }

    public String toString(boolean deep) {
        StringBuilder builder = new StringBuilder();
        builder.append("UtoteRace [idUtoteRace=").append(idUtoteRace).append(", ");
        if (age != null) {
            builder.append("age=").append(age).append(", ");
        }
        if (claim != null) {
            builder.append("claim=").append(claim).append(", ");
        }
        if (conditions != null) {
            builder.append("conditions=").append(conditions).append(", ");
        }
        builder.append("current=").append(current).append(", ");
        if (distance != null) {
            builder.append("distance=").append(distance).append(", ");
        }
        if (finish != null) {
            builder.append("finish=").append(finish).append(", ");
        }
        builder.append("hasPools=").append(hasPools).append(", hasRunners=").append(hasRunners).append(", ");
        if (idParent != null) {
            builder.append("idParent=").append(idParent).append(", ");
        }
        if (live != null) {
            builder.append("live=").append(live).append(", ");
        }
        builder.append("numberOfRunners=").append(numberOfRunners).append(", odds=").append(odds).append(", ");
        if (poolList != null) {
            builder.append("poolList=").append(poolList).append(", ");
        }
        if (postTime != null) {
            builder.append("postTime=").append(postTime).append(", ");
        }
        builder.append("program=").append(program).append(", ");
        if (purse != null) {
            builder.append("purse=").append(purse).append(", ");
        }
        builder.append("raceId=").append(raceId).append(", ");
        if (raceStatus != null) {
            builder.append("raceStatus=").append(raceStatus).append(", ");
        }
        if (racetype != null) {
            builder.append("racetype=").append(racetype).append(", ");
        }
        if (sex != null) {
            builder.append("sex=").append(sex).append(", ");
        }
        if (surface != null) {
            builder.append("surface=").append(surface).append(", ");
        }
        if (trackType != null) {
            builder.append("trackType=").append(trackType).append(", ");
        }
        builder.append("hasChanges=").append(hasChanges).append(", ");
        if (raceChange != null) {
            builder.append("raceChange=").append(raceChange).append(", ");
        }
        builder.append("RTWracesid=").append(RTWracesid).append(",");
        if (deep && (pools != null)) {
            builder.append("pools=").append(pools).append(", ");
        }
        if (deep && (runners != null)) {
            builder.append("runners=").append(runners).append(", ");
        }
        if (deep && (RTWrace != null)) {
            builder.append("RTWrace=").append(RTWrace);
        }

        builder.append("]");
        return builder.toString();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((age == null) ? 0 : age.hashCode());
        result = (prime * result) + ((claim == null) ? 0 : claim.hashCode());
        result = (prime * result) + ((conditions == null) ? 0 : conditions.hashCode());
        result = (prime * result) + (current ? 1231 : 1237);
        result = (prime * result) + ((distance == null) ? 0 : distance.hashCode());
        result = (prime * result) + ((event == null) ? 0 : event.hashCode());
        result = (prime * result) + ((finish == null) ? 0 : finish.hashCode());
        result = (prime * result) + (hasChanges ? 1231 : 1237);
        result = (prime * result) + (hasPools ? 1231 : 1237);
        result = (prime * result) + (hasRunners ? 1231 : 1237);
        result = (prime * result) + ((live == null) ? 0 : live.hashCode());
        result = (prime * result) + numberOfRunners;
        result = (prime * result) + (odds ? 1231 : 1237);
        result = (prime * result) + ((poolList == null) ? 0 : poolList.hashCode());
        result = (prime * result) + ((postTime == null) ? 0 : postTime.hashCode());
        result = (prime * result) + (program ? 1231 : 1237);
        result = (prime * result) + ((purse == null) ? 0 : purse.hashCode());
        result = (prime * result) + ((raceChange == null) ? 0 : raceChange.hashCode());
        result = (prime * result) + raceId;
        result = (prime * result) + ((raceStatus == null) ? 0 : raceStatus.hashCode());
        result = (prime * result) + ((racetype == null) ? 0 : racetype.hashCode());
        result = (prime * result) + ((sex == null) ? 0 : sex.hashCode());
        result = (prime * result) + ((surface == null) ? 0 : surface.hashCode());
        result = (prime * result) + ((trackType == null) ? 0 : trackType.hashCode());
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
        UtoteRace other = (UtoteRace) obj;
        if (age == null) {
            if (other.age != null) {
                return false;
            }
        } else if (!age.equals(other.age)) {
            return false;
        }
        if (claim == null) {
            if (other.claim != null) {
                return false;
            }
        } else if (!claim.equals(other.claim)) {
            return false;
        }
        if (conditions == null) {
            if (other.conditions != null) {
                return false;
            }
        } else if (!conditions.equals(other.conditions)) {
            return false;
        }
        if (current != other.current) {
            return false;
        }
        if (distance == null) {
            if (other.distance != null) {
                return false;
            }
        } else if (!distance.equals(other.distance)) {
            return false;
        }
        if (event == null) {
            if (other.event != null) {
                return false;
            }
        } else if (!event.equals(other.event)) {
            return false;
        }
        if (finish == null) {
            if (other.finish != null) {
                return false;
            }
        } else if (!finish.equals(other.finish)) {
            return false;
        }
        if (hasChanges != other.hasChanges) {
            return false;
        }
        if (hasPools != other.hasPools) {
            return false;
        }
        if (hasRunners != other.hasRunners) {
            return false;
        }
        if (live == null) {
            if (other.live != null) {
                return false;
            }
        } else if (!live.equals(other.live)) {
            return false;
        }
        if (numberOfRunners != other.numberOfRunners) {
            return false;
        }
        if (odds != other.odds) {
            return false;
        }
        if (poolList == null) {
            if (other.poolList != null) {
                return false;
            }
        } else if (!poolList.equals(other.poolList)) {
            return false;
        }
        if (postTime == null) {
            if (other.postTime != null) {
                return false;
            }
        } else if (!postTime.equals(other.postTime)) {
            return false;
        }
        if (program != other.program) {
            return false;
        }
        if (purse == null) {
            if (other.purse != null) {
                return false;
            }
        } else if (!purse.equals(other.purse)) {
            return false;
        }
        if (raceChange == null) {
            if (other.raceChange != null) {
                return false;
            }
        } else if (!raceChange.equals(other.raceChange)) {
            return false;
        }
        if (raceId != other.raceId) {
            return false;
        }
        if (raceStatus == null) {
            if (other.raceStatus != null) {
                return false;
            }
        } else if (!raceStatus.equals(other.raceStatus)) {
            return false;
        }
        if (racetype == null) {
            if (other.racetype != null) {
                return false;
            }
        } else if (!racetype.equals(other.racetype)) {
            return false;
        }
        if (sex == null) {
            if (other.sex != null) {
                return false;
            }
        } else if (!sex.equals(other.sex)) {
            return false;
        }
        if (surface == null) {
            if (other.surface != null) {
                return false;
            }
        } else if (!surface.equals(other.surface)) {
            return false;
        }
        if (trackType == null) {
            if (other.trackType != null) {
                return false;
            }
        } else if (!trackType.equals(other.trackType)) {
            return false;
        }
        return true;
    }

}