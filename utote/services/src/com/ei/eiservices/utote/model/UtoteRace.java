package com.ei.eiservices.utote.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.Collection;


/**
 * The persistent class for the utoteRaces database table.
 * 
 */
@Entity
@Table(name="utoteRaces")
@NamedQueries({
	@NamedQuery(name="UtoteRace.findAll", query="SELECT u FROM UtoteRace u"),
	@NamedQuery(name="UtoteRace.findSpecific", query="SELECT c from UtoteRace c where c.idParent = (SELECT e.idUtoteEvent from UtoteEvent e where e.eventId = :eventId) and c.raceId = :raceId"),
	@NamedQuery(name="UtoteRace.findSpecificWithValidTrackType", query="SELECT c from UtoteRace c where c.trackType IN :validTrackTypes and c.idParent = (SELECT e.idUtoteEvent from UtoteEvent e where e.eventId = :eventId) and c.raceId = :raceId"),
	@NamedQuery(name="UtoteRace.findByParent", query="SELECT r FROM UtoteRace r WHERE r.idParent = :idParent")
})
public class UtoteRace implements Serializable {
	private static final long serialVersionUID = 1L;
	
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

	public UtoteRace() {
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
	public boolean isHasChanges() {
		return hasChanges;
	}

	/**
	 * @param hasChanges the hasChanges to set
	 */
	public void setHasChanges(boolean hasChanges) {
		this.hasChanges = hasChanges;
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
		if (age != null)
			builder.append("age=").append(age).append(", ");
		if (claim != null)
			builder.append("claim=").append(claim).append(", ");
		if (conditions != null)
			builder.append("conditions=").append(conditions).append(", ");
		builder.append("current=").append(current).append(", ");
		if (distance != null)
			builder.append("distance=").append(distance).append(", ");
		if (finish != null)
			builder.append("finish=").append(finish).append(", ");
		builder.append("hasPools=").append(hasPools).append(", hasRunners=").append(hasRunners).append(", ");
		if (idParent != null)
			builder.append("idParent=").append(idParent).append(", ");
		if (live != null)
			builder.append("live=").append(live).append(", ");
		builder.append("numberOfRunners=").append(numberOfRunners).append(", odds=").append(odds).append(", ");
		if (poolList != null)
			builder.append("poolList=").append(poolList).append(", ");
		if (postTime != null)
			builder.append("postTime=").append(postTime).append(", ");
		builder.append("program=").append(program).append(", ");
		if (purse != null)
			builder.append("purse=").append(purse).append(", ");
		builder.append("raceId=").append(raceId).append(", ");
		if (raceStatus != null)
			builder.append("raceStatus=").append(raceStatus).append(", ");
		if (racetype != null)
			builder.append("racetype=").append(racetype).append(", ");
		if (sex != null)
			builder.append("sex=").append(sex).append(", ");
		if (surface != null)
			builder.append("surface=").append(surface).append(", ");
		if (trackType != null)
			builder.append("trackType=").append(trackType).append(", ");
		builder.append("hasChanges=").append(hasChanges).append(", ");
		if (raceChange != null)
			builder.append("raceChange=").append(raceChange).append(", ");
		if (deep && pools != null)
			builder.append("pools=").append(pools).append(", ");
		if (deep && runners != null)
			builder.append("runners=").append(runners).append(", ");
		if (deep && event != null)
			builder.append("event=").append(event);
		builder.append("]");
		return builder.toString();
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
		if (null != parent) this.setEvent(parent);
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
		if (null != parent) this.setEvent(parent);
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
		}
		return this.event;
	}

	/**
	 * Loads this races associated objects
	 * 
	 * @param em The EntityManager to load from
	 */
	@Transient
	boolean weSet = false;
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
		if ((null != this.event) && weSet) this.event.detach(em, false /* just the event, not races */);
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

}