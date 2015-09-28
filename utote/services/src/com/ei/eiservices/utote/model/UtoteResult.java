package com.ei.eiservices.utote.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.TypedQuery;


/**
 * The persistent class for the utoteResults database table.
 *
 */
@Entity
@Table(name="utoteResults")
@NamedQueries({
    @NamedQuery(name="UtoteResult.findAll", query="SELECT u FROM UtoteResult u"),
    @NamedQuery(name="UtoteResult.findByEventId", query="SELECT e from UtoteResult e where e.eventId = :eventId"),
    @NamedQuery(name="UtoteResult.findByRaceId", query="SELECT e from UtoteResult e where e.raceId = :raceId"),
    @NamedQuery(name="UtoteResult.findSpecific", query="SELECT e from UtoteResult e where e.eventId = :eventId and e.raceId = :raceId")
})
public class UtoteResult implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`idUtoteResult`", insertable=true, updatable=false, unique=true, nullable=false)
    private int idUtoteResult = 0;

    @Column(nullable=false, length=3)
    private String eventId = null;

    @Column(length=16)
    private String eventName = null;

    @Column(nullable=false)
    private int raceId = 0;

    @Column(nullable=false, length=3)
    private String currencyId = null;

    @Column
    private boolean hasRaceResults = false;

    @Column
    private boolean hasPoolPrices = false;

    @Column
    private boolean hasPositions = false;

    @Column(length=80)
    private String winners = null;

    @Column(length=80)
    private String scratches = null;

    // @OneToMany(mappedBy="poolPrices", cascade = CascadeType.PERSIST)
    @Transient
    private Collection<UtotePoolPrice> poolPrices = null;

    // @OneToMany(mappedBy="positions", cascade = CascadeType.PERSIST)
    @Transient
    private Collection<UtotePosition> positions = null;

    public UtoteResult() {
    }


    public int getIdUtoteResult() {
        return this.idUtoteResult;
    }
    public void setIdUtoteResult(int idUtoteResultResponse) {
        this.idUtoteResult = idUtoteResultResponse;
    }


    public String getEventId() {
        return this.eventId;
    }
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }


    public String getEventName() {
        return this.eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }


    public int getRaceId() {
        return this.raceId;
    }
    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }


    public String getCurrencyId() {
        return this.currencyId;
    }
    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }


    public boolean hasRaceResults() {
        return this.hasRaceResults;
    }
    public void setHasRaceResults(boolean hasRaceResults) {
        this.hasRaceResults = hasRaceResults;
    }


    public boolean hasPoolPrices() {
        return this.hasPoolPrices;
    }
    public void setHasPoolPrices(boolean hasPoolPrices) {
        this.hasPoolPrices = hasPoolPrices;
    }


    public boolean hasPositions() {
        return this.hasPositions;
    }
    public void setHasPositions(boolean hasPositions) {
        this.hasPositions = hasPositions;
    }


    public String getWinners() {
        return this.winners;
    }
    public void setWinners(String winners) {
        this.winners = winners;
    }


    public String getScratches() {
        return this.scratches;
    }
    public void setScratches(String scratches) {
        this.scratches = scratches;
    }


    /**
     * @return the poolPrices
     */
    public Collection<UtotePoolPrice> getPoolPrices() {
        return poolPrices;
    }


    /**
     * @param poolPrices the poolPrices to set
     */
    public void setPoolPrices(Collection<UtotePoolPrice> poolPrices) {
        this.poolPrices = poolPrices;
    }


    /**
     * @return the positions
     */
    public Collection<UtotePosition> getPositions() {
        return positions;
    }


    /**
     * @param positions the positions to set
     */
    public void setPositions(Collection<UtotePosition> positions) {
        this.positions = positions;
    }


    public String toString(boolean deep) {
        StringBuilder builder = new StringBuilder();
        builder.append("UtoteResult [idUtoteResult=").append(idUtoteResult).append(", ");
        if (eventId != null) {
            builder.append("eventId=").append(eventId).append(", ");
        }
        if (eventName != null) {
            builder.append("eventName=").append(eventName).append(", ");
        }
        builder.append("raceId=").append(raceId).append(", ");
        if (currencyId != null) {
            builder.append("currencyId=").append(currencyId).append(", ");
        }
        builder.append("hasRaceResults=").append(hasRaceResults).append(", hasPoolPrices=").append(hasPoolPrices).append(", hasPositions=")
        .append(hasPositions).append(", ");
        if (winners != null) {
            builder.append("winners=").append(winners).append(", ");
        }
        if (scratches != null) {
            builder.append("scratches=").append(scratches).append(", ");
        }
        if (deep && (poolPrices != null)) {
            builder.append("poolPrices=").append(poolPrices).append(", ");
        }
        if (deep && (positions != null)) {
            builder.append("positions=").append(positions);
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
     * Retrieve any PoolPrice and Position elements associated with this Race Result
     *
     * @param em The EntityManager to run against
     */
    public void load(EntityManager em, boolean deep) {
        // First load the pool prices
        TypedQuery<UtotePoolPrice> pp = em.createNamedQuery("UtotePoolPrice.findByParent", UtotePoolPrice.class);
        pp.setParameter("idParent", this.idUtoteResult);
        this.poolPrices = pp.getResultList();
        if (null != this.poolPrices) {
            this.hasPoolPrices = true;
            // For each PoolPrice, set us as the parent
            for (UtotePoolPrice aPoolPrice : this.poolPrices) {
                if (deep) {
                    aPoolPrice.load(em, this);
                } else {
                    aPoolPrice.setResult(this);
                }
            }
        }
        // Next load the Positions
        TypedQuery<UtotePosition> p = em.createNamedQuery("UtotePosition.findByParent", UtotePosition.class);
        p.setParameter("idParent", this.idUtoteResult);
        this.positions = p.getResultList();
        if (null != this.positions) {
            this.hasPositions = true;
            // For each Position, set us as the parent
            for (UtotePosition aPosition : this.positions) {
                if (deep) {
                    aPosition.load(em, this);
                } else {
                    aPosition.setResult(this);
                }
            }
        }
    }
    public void load(EntityManager em) {
        load(em, false);
    }

    /**
     * Clear any Pool Price and Position elements associated with this race Result
     *
     */
    public void clear() {
        if (null != this.positions) {
            for (UtotePosition aPosition : this.positions) {
                aPosition.clear();
            }
            this.positions.clear();
            this.positions = null;
        }
        if (null != this.poolPrices) {
            for (UtotePoolPrice aPoolPrice : this.poolPrices) {
                aPoolPrice.clear();
            }
            this.poolPrices.clear();
            this.poolPrices = null;
        }
    }

    /**
     * Detaches any Pool Price and Position elements associated with this race Result
     *
     * @param em The EntityManager to detach from
     */
    public void detach(EntityManager em, boolean deep) {
        if (deep) {
            if (null != this.positions) {
                for (UtotePosition aPosition : this.positions) {
                    aPosition.detach(em);
                }
            }
            if (null != this.poolPrices) {
                for (UtotePoolPrice aPoolPrice : this.poolPrices) {
                    aPoolPrice.detach(em);
                }
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


}