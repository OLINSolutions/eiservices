package com.ei.eiservices.utote.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the utotePools database table.
 * 
 */
@Entity
@Table(name="utotePools")
@NamedQueries({
	@NamedQuery(name="UtotePool.findAll", query="SELECT u FROM UtotePool u"),
	@NamedQuery(name="UtotePool.findByParent", query="SELECT p FROM UtotePool p WHERE p.idParent = :idParent")
})
public class UtotePool implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="`idUtotePool`", insertable=true, updatable=false, unique=true, nullable=false)
	private int idUtotePool = 0;

	@Column(name="`idParent`", unique=true, nullable=false, updatable=true, insertable=true)
	private int idParent = 0;

	@Column(name="`Auto`")
	private boolean auto = false;

	@Column(name="`Box`")
	private boolean box = false;

	@Column(name="`Combine`")
	private int combine = 0;

	@Column(name="`Exchange`", length=45)
	private String exchange = null;

	@Column(name="`Fractional`")
	private boolean fractional = false;

	@Column(name="`FractionalMinimum`", precision=10)
	private BigDecimal fractionalMinimum = null;

	@Column(name="`KeyBox`")
	private boolean keyBox = false;

	@Column(name="`Leading`")
	private boolean leading = false;

	@Column(name="`Legs`")
	private int legs = 0;

	@Column(name="`Maximum`", precision=10)
	private BigDecimal maximum = null;

	@Column(name="`Multiple`")
	private boolean multiple = false;

	@Column(name="`MultipleBetMinimum`", precision=10)
	private BigDecimal multipleBetMinimum = null;

	@Column(name="`Parlay`")
	private boolean parlay = false;

	@Column(name="`PoolId`", nullable=false, length=3)
	private String poolId = null;

	@Column(name="`PoolName`", length=12)
	private String poolName = null;

	@Column(name="`PoolNumber`", nullable=false)
	private int poolNumber = 0;

	@Column(name="`PoolRaces`")
	private int poolRaces = 0;

	@Column(name="`PowerBox`")
	private boolean powerBox = false;

	@Column(name="`Probables`")
	private boolean probables = false;

	@Column(name="`Quick`")
	private boolean quick = false;

	@Column(name="`RaceList`", length=45)
	private String raceList = null;

	@Column(name="`Segmented`")
	private boolean segmented = false;

	@Column(name="`SingleBetMinimum`", precision=10)
	private BigDecimal singleBetMinimum = null;

	@Column(name="`Straight`")
	private boolean straight = false;

	@Column(name="`String`")
	private boolean string = false;

	@Column(name="`Unordered`")
	private boolean unordered = false;

	@Column(name="`WagerMinimum`", precision=10)
	private BigDecimal wagerMinimum = null;

	@Column(name="`WBMaximum`", precision=10)
	private BigDecimal WBMaximum = null;

	@Column(name="`Wheel`")
	private boolean wheel = false;

	// @ManyToOne(optional = false, cascade = CascadeType.REFRESH)
	// @JoinColumn(name = "idParent", referencedColumnName = "`idUtoteRace`", insertable=true, updatable=true)
	@Transient
	private UtoteRace race;

	public UtotePool() {
	}

	public int getIdUtotePool() {
		return this.idUtotePool;
	}

	public void setIdUtotePool(int idUtotePool) {
		this.idUtotePool = idUtotePool;
	}

	public int getIdParent() {
		return this.idParent;
	}

	public void setIdParent(int idParent) {
		this.idParent = idParent;
	}

	public boolean getAuto() {
		return this.auto;
	}

	public void setAuto(boolean auto) {
		this.auto = auto;
	}

	public boolean getBox() {
		return this.box;
	}

	public void setBox(boolean box) {
		this.box = box;
	}

	public int getCombine() {
		return this.combine;
	}

	public void setCombine(int combine) {
		this.combine = combine;
	}

	public String getExchange() {
		return this.exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public boolean getFractional() {
		return this.fractional;
	}

	public void setFractional(boolean fractional) {
		this.fractional = fractional;
	}

	public BigDecimal getFractionalMinimum() {
		return this.fractionalMinimum;
	}

	public void setFractionalMinimum(BigDecimal fractionalMinimum) {
		this.fractionalMinimum = fractionalMinimum;
	}

	public boolean getKeyBox() {
		return this.keyBox;
	}

	public void setKeyBox(boolean keyBox) {
		this.keyBox = keyBox;
	}

	public boolean getLeading() {
		return this.leading;
	}

	public void setLeading(boolean leading) {
		this.leading = leading;
	}

	public int getLegs() {
		return this.legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public BigDecimal getMaximum() {
		return this.maximum;
	}

	public void setMaximum(BigDecimal maximum) {
		this.maximum = maximum;
	}

	public boolean getMultiple() {
		return this.multiple;
	}

	public void setMultiple(boolean multiple) {
		this.multiple = multiple;
	}

	public BigDecimal getMultipleBetMinimum() {
		return this.multipleBetMinimum;
	}

	public void setMultipleBetMinimum(BigDecimal multipleBetMinimum) {
		this.multipleBetMinimum = multipleBetMinimum;
	}

	public boolean getParlay() {
		return this.parlay;
	}

	public void setParlay(boolean parlay) {
		this.parlay = parlay;
	}

	public String getPoolId() {
		return this.poolId;
	}

	public void setPoolId(String poolId) {
		this.poolId = poolId;
	}

	public String getPoolName() {
		return this.poolName;
	}

	public void setPoolName(String poolName) {
		this.poolName = poolName;
	}

	public int getPoolNumber() {
		return this.poolNumber;
	}

	public void setPoolNumber(int poolNumber) {
		this.poolNumber = poolNumber;
	}

	public int getPoolRaces() {
		return this.poolRaces;
	}

	public void setPoolRaces(int poolRaces) {
		this.poolRaces = poolRaces;
	}

	public boolean getPowerBox() {
		return this.powerBox;
	}

	public void setPowerBox(boolean powerBox) {
		this.powerBox = powerBox;
	}

	public boolean getProbables() {
		return this.probables;
	}

	public void setProbables(boolean probables) {
		this.probables = probables;
	}

	public boolean getQuick() {
		return this.quick;
	}

	public void setQuick(boolean quick) {
		this.quick = quick;
	}

	public String getRaceList() {
		return this.raceList;
	}

	public void setRaceList(String raceList) {
		this.raceList = raceList;
	}

	public boolean getSegmented() {
		return this.segmented;
	}

	public void setSegmented(boolean segmented) {
		this.segmented = segmented;
	}

	public BigDecimal getSingleBetMinimum() {
		return this.singleBetMinimum;
	}

	public void setSingleBetMinimum(BigDecimal singleBetMinimum) {
		this.singleBetMinimum = singleBetMinimum;
	}

	public boolean getStraight() {
		return this.straight;
	}

	public void setStraight(boolean straight) {
		this.straight = straight;
	}

	public boolean getString() {
		return this.string;
	}

	public void setString(boolean string) {
		this.string = string;
	}

	public boolean getUnordered() {
		return this.unordered;
	}

	public void setUnordered(boolean unordered) {
		this.unordered = unordered;
	}

	public BigDecimal getWagerMinimum() {
		return this.wagerMinimum;
	}

	public void setWagerMinimum(BigDecimal wagerMinimum) {
		this.wagerMinimum = wagerMinimum;
	}

	public BigDecimal getWBMaximum() {
		return this.WBMaximum;
	}

	public void setWBMaximum(BigDecimal WBMaximum) {
		this.WBMaximum = WBMaximum;
	}

	public boolean getWheel() {
		return this.wheel;
	}

	public void setWheel(boolean wheel) {
		this.wheel = wheel;
	}

	/**
	 * @return the race
	 */
	public UtoteRace getRace() {
		return race;
	}

	/**
	 * @param race the race to set
	 */
	public void setRace(UtoteRace race) {
		this.race = race;
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
		builder.append("UtotePool [idUtotePool=").append(idUtotePool).append(", idParent=").append(idParent)
				.append(", auto=").append(auto).append(", box=").append(box).append(", combine=").append(combine)
				.append(", ");
		if (exchange != null)
			builder.append("exchange=").append(exchange).append(", ");
		builder.append("fractional=").append(fractional).append(", ");
		if (fractionalMinimum != null)
			builder.append("fractionalMinimum=").append(fractionalMinimum).append(", ");
		builder.append("keyBox=").append(keyBox).append(", leading=").append(leading).append(", legs=").append(legs)
				.append(", ");
		if (maximum != null)
			builder.append("maximum=").append(maximum).append(", ");
		builder.append("multiple=").append(multiple).append(", ");
		if (multipleBetMinimum != null)
			builder.append("multipleBetMinimum=").append(multipleBetMinimum).append(", ");
		builder.append("parlay=").append(parlay).append(", ");
		if (poolId != null)
			builder.append("poolId=").append(poolId).append(", ");
		if (poolName != null)
			builder.append("poolName=").append(poolName).append(", ");
		builder.append("poolNumber=").append(poolNumber).append(", poolRaces=").append(poolRaces).append(", powerBox=")
				.append(powerBox).append(", probables=").append(probables).append(", quick=").append(quick)
				.append(", ");
		if (raceList != null)
			builder.append("raceList=").append(raceList).append(", ");
		builder.append("segmented=").append(segmented).append(", ");
		if (singleBetMinimum != null)
			builder.append("singleBetMinimum=").append(singleBetMinimum).append(", ");
		builder.append("straight=").append(straight).append(", string=").append(string).append(", unordered=")
				.append(unordered).append(", ");
		if (wagerMinimum != null)
			builder.append("wagerMinimum=").append(wagerMinimum).append(", ");
		if (WBMaximum != null)
			builder.append("WBMaximum=").append(WBMaximum).append(", ");
		builder.append("wheel=").append(wheel).append(", ");
		if (deep && race != null)
			builder.append("race=").append(race);
		builder.append("]");
		return builder.toString();
	}


}