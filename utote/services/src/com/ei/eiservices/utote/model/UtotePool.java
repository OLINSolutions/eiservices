package com.ei.eiservices.utote.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.ei.eiservices.utote.client.programservice.ProgramServiceStub;


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
    private UtoteRace race = null;

    public UtotePool() {
    }

    public UtotePool(UtotePool source) {
        super();
        this.idParent = source.idParent;
        this.auto = source.auto;
        this.box = source.box;
        this.combine = source.combine;
        this.exchange = source.exchange;
        this.fractional = source.fractional;
        this.fractionalMinimum = source.fractionalMinimum;
        this.keyBox = source.keyBox;
        this.leading = source.leading;
        this.legs = source.legs;
        this.maximum = source.maximum;
        this.multiple = source.multiple;
        this.multipleBetMinimum = source.multipleBetMinimum;
        this.parlay = source.parlay;
        this.poolId = source.poolId;
        this.poolName = source.poolName;
        this.poolNumber = source.poolNumber;
        this.poolRaces = source.poolRaces;
        this.powerBox = source.powerBox;
        this.probables = source.probables;
        this.quick = source.quick;
        this.raceList = source.raceList;
        this.segmented = source.segmented;
        this.singleBetMinimum = source.singleBetMinimum;
        this.straight = source.straight;
        this.string = source.string;
        this.unordered = source.unordered;
        this.wagerMinimum = source.wagerMinimum;
        this.WBMaximum =source.WBMaximum;
        this.wheel = source.wheel;
        this.race = source.race;
    }

    public UtotePool(ProgramServiceStub.Pool pool) {
        super();
        updateFromTote(pool);
    }

    public UtotePool(int idParent, ProgramServiceStub.Pool pool) {
        super();
        updateFromTote(pool);
        this.idParent = idParent;
    }

    public void updateFromTote(ProgramServiceStub.Pool pool) {
        setPoolId(pool.getPoolId());
        setPoolNumber(pool.getPoolNumber());
        // Set the values that have been specified
        if (pool.isPoolNameSpecified()) {
            this.setPoolName(pool.getPoolName());
        }
        if (pool.isPoolRacesSpecified()) {
            this.setPoolRaces(pool.getPoolRaces());
        }
        if (pool.isRaceListSpecified()) {
            this.setRaceList(pool.getRaceList().getCompressedList());
        }
        if (pool.isLegsSpecified()) {
            this.setLegs(pool.getLegs());
        }
        if (pool.isUnorderedSpecified()) {
            this.setUnordered(pool.getUnordered());
        }
        if (pool.isCombineSpecified()) {
            this.setCombine(pool.getCombine());
        }
        if (pool.isQuickSpecified()) {
            this.setQuick(pool.getQuick());
        }
        if (pool.isStringSpecified()) {
            this.setString(pool.getString());
        }
        if (pool.isStraightSpecified()) {
            this.setStraight(pool.getStraight());
        }
        if (pool.isWheelSpecified()) {
            this.setWheel(pool.getWheel());
        }
        if (pool.isBoxSpecified()) {
            this.setBox(pool.getBox());
        }
        if (pool.isPowerBoxSpecified()) {
            this.setPowerBox(pool.getPowerBox());
        }
        if (pool.isLeadingSpecified()) {
            this.setLeading(pool.getLeading());
        }
        if (pool.isMultipleSpecified()) {
            this.setMultiple(pool.getMultiple());
        }
        if (pool.isAutoSpecified()) {
            this.setAuto(pool.getAuto());
        }
        if (pool.isFractionalSpecified()) {
            this.setFractional(pool.getFractional());
        }
        if (pool.isSegmentedSpecified()) {
            this.setSegmented(pool.getSegmented());
        }
        if (pool.isKeyBoxSpecified()) {
            this.setKeyBox(pool.getKeyBox());
        }
        if (pool.isSingleBetMinimumSpecified()) {
            this.setSingleBetMinimum(pool.getSingleBetMinimum());
        }
        if (pool.isMultipleBetMinimumSpecified()) {
            this.setMultipleBetMinimum(pool.getMultipleBetMinimum());
        }
        if (pool.isWagerMinimumSpecified()) {
            this.setWagerMinimum(pool.getWagerMinimum());
        }
        if (pool.isMaximumSpecified()) {
            this.setMaximum(pool.getMaximum());
        }
        if (pool.isFractionalMinimumSpecified()) {
            this.setFractionalMinimum(pool.getFractionalMinimum());
        }
        if (pool.isWBMaximumSpecified()) {
            this.setWBMaximum(pool.getWBMaximum());
        }
        if (pool.isParlaySpecified()) {
            this.setParlay(pool.getParlay());
        }
        if (pool.isProbablesSpecified()) {
            this.setProbables(pool.getProbables());
        }
        if (pool.isExchangeSpecified()) {
            this.setExchange(pool.getExchange().getValue());
        }
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
        if (exchange != null) {
            builder.append("exchange=").append(exchange).append(", ");
        }
        builder.append("fractional=").append(fractional).append(", ");
        if (fractionalMinimum != null) {
            builder.append("fractionalMinimum=").append(fractionalMinimum).append(", ");
        }
        builder.append("keyBox=").append(keyBox).append(", leading=").append(leading).append(", legs=").append(legs)
        .append(", ");
        if (maximum != null) {
            builder.append("maximum=").append(maximum).append(", ");
        }
        builder.append("multiple=").append(multiple).append(", ");
        if (multipleBetMinimum != null) {
            builder.append("multipleBetMinimum=").append(multipleBetMinimum).append(", ");
        }
        builder.append("parlay=").append(parlay).append(", ");
        if (poolId != null) {
            builder.append("poolId=").append(poolId).append(", ");
        }
        if (poolName != null) {
            builder.append("poolName=").append(poolName).append(", ");
        }
        builder.append("poolNumber=").append(poolNumber).append(", poolRaces=").append(poolRaces).append(", powerBox=")
        .append(powerBox).append(", probables=").append(probables).append(", quick=").append(quick)
        .append(", ");
        if (raceList != null) {
            builder.append("raceList=").append(raceList).append(", ");
        }
        builder.append("segmented=").append(segmented).append(", ");
        if (singleBetMinimum != null) {
            builder.append("singleBetMinimum=").append(singleBetMinimum).append(", ");
        }
        builder.append("straight=").append(straight).append(", string=").append(string).append(", unordered=")
        .append(unordered).append(", ");
        if (wagerMinimum != null) {
            builder.append("wagerMinimum=").append(wagerMinimum).append(", ");
        }
        if (WBMaximum != null) {
            builder.append("WBMaximum=").append(WBMaximum).append(", ");
        }
        builder.append("wheel=").append(wheel).append(", ");
        if (deep && (race != null)) {
            builder.append("race=").append(race);
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
        result = (prime * result) + ((WBMaximum == null) ? 0 : WBMaximum.hashCode());
        result = (prime * result) + (auto ? 1231 : 1237);
        result = (prime * result) + (box ? 1231 : 1237);
        result = (prime * result) + combine;
        result = (prime * result) + ((exchange == null) ? 0 : exchange.hashCode());
        result = (prime * result) + (fractional ? 1231 : 1237);
        result = (prime * result) + ((fractionalMinimum == null) ? 0 : fractionalMinimum.hashCode());
        result = (prime * result) + (keyBox ? 1231 : 1237);
        result = (prime * result) + (leading ? 1231 : 1237);
        result = (prime * result) + legs;
        result = (prime * result) + ((maximum == null) ? 0 : maximum.hashCode());
        result = (prime * result) + (multiple ? 1231 : 1237);
        result = (prime * result) + ((multipleBetMinimum == null) ? 0 : multipleBetMinimum.hashCode());
        result = (prime * result) + (parlay ? 1231 : 1237);
        result = (prime * result) + ((poolId == null) ? 0 : poolId.hashCode());
        result = (prime * result) + ((poolName == null) ? 0 : poolName.hashCode());
        result = (prime * result) + poolNumber;
        result = (prime * result) + poolRaces;
        result = (prime * result) + (powerBox ? 1231 : 1237);
        result = (prime * result) + (probables ? 1231 : 1237);
        result = (prime * result) + (quick ? 1231 : 1237);
        result = (prime * result) + ((raceList == null) ? 0 : raceList.hashCode());
        result = (prime * result) + (segmented ? 1231 : 1237);
        result = (prime * result) + ((singleBetMinimum == null) ? 0 : singleBetMinimum.hashCode());
        result = (prime * result) + (straight ? 1231 : 1237);
        result = (prime * result) + (string ? 1231 : 1237);
        result = (prime * result) + (unordered ? 1231 : 1237);
        result = (prime * result) + ((wagerMinimum == null) ? 0 : wagerMinimum.hashCode());
        result = (prime * result) + (wheel ? 1231 : 1237);
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
        UtotePool other = (UtotePool) obj;
        if (WBMaximum == null) {
            if (other.WBMaximum != null) {
                return false;
            }
        } else if (!WBMaximum.equals(other.WBMaximum)) {
            return false;
        }
        if (auto != other.auto) {
            return false;
        }
        if (box != other.box) {
            return false;
        }
        if (combine != other.combine) {
            return false;
        }
        if (exchange == null) {
            if (other.exchange != null) {
                return false;
            }
        } else if (!exchange.equals(other.exchange)) {
            return false;
        }
        if (fractional != other.fractional) {
            return false;
        }
        if (fractionalMinimum == null) {
            if (other.fractionalMinimum != null) {
                return false;
            }
        } else if (!fractionalMinimum.equals(other.fractionalMinimum)) {
            return false;
        }
        if (keyBox != other.keyBox) {
            return false;
        }
        if (leading != other.leading) {
            return false;
        }
        if (legs != other.legs) {
            return false;
        }
        if (maximum == null) {
            if (other.maximum != null) {
                return false;
            }
        } else if (!maximum.equals(other.maximum)) {
            return false;
        }
        if (multiple != other.multiple) {
            return false;
        }
        if (multipleBetMinimum == null) {
            if (other.multipleBetMinimum != null) {
                return false;
            }
        } else if (!multipleBetMinimum.equals(other.multipleBetMinimum)) {
            return false;
        }
        if (parlay != other.parlay) {
            return false;
        }
        if (poolId == null) {
            if (other.poolId != null) {
                return false;
            }
        } else if (!poolId.equals(other.poolId)) {
            return false;
        }
        if (poolName == null) {
            if (other.poolName != null) {
                return false;
            }
        } else if (!poolName.equals(other.poolName)) {
            return false;
        }
        if (poolNumber != other.poolNumber) {
            return false;
        }
        if (poolRaces != other.poolRaces) {
            return false;
        }
        if (powerBox != other.powerBox) {
            return false;
        }
        if (probables != other.probables) {
            return false;
        }
        if (quick != other.quick) {
            return false;
        }
        if (raceList == null) {
            if (other.raceList != null) {
                return false;
            }
        } else if (!raceList.equals(other.raceList)) {
            return false;
        }
        if (segmented != other.segmented) {
            return false;
        }
        if (singleBetMinimum == null) {
            if (other.singleBetMinimum != null) {
                return false;
            }
        } else if (!singleBetMinimum.equals(other.singleBetMinimum)) {
            return false;
        }
        if (straight != other.straight) {
            return false;
        }
        if (string != other.string) {
            return false;
        }
        if (unordered != other.unordered) {
            return false;
        }
        if (wagerMinimum == null) {
            if (other.wagerMinimum != null) {
                return false;
            }
        } else if (!wagerMinimum.equals(other.wagerMinimum)) {
            return false;
        }
        if (wheel != other.wheel) {
            return false;
        }
        return true;
    }


}