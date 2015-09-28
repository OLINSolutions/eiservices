package com.ei.eiservices.utote.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * The persistent class for the utotePoolPrices database table.
 *
 */
@Entity
@Table(name="utotePoolPrices")
@NamedQueries({
    @NamedQuery(name="UtotePoolPrice.findAll", query="SELECT p FROM UtotePoolPrice p"),
    @NamedQuery(name="UtotePoolPrice.findByParent", query="SELECT p FROM UtotePoolPrice p WHERE p.idParent = :idParent")
})
public class UtotePoolPrice implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`idUtotePoolPrice`", insertable=true, updatable=false, unique=true, nullable=false)
    private int idUtotePoolPrice = 0;

    @Column(name = "`idParent`", unique=true, nullable=false, insertable=true, updatable=true)
    private int idParent = 0;

    @Column(nullable=false, length=3)
    private String poolId = null;

    @Column(length=12)
    private String poolName = null;

    @Column
    private boolean refund = false;

    @Column(precision=10, scale=3)
    private BigDecimal carryOver = null;

    @Column
    private boolean hasPrices = false;

    // @ManyToOne(optional = false, cascade = CascadeType.REFRESH)
    // @JoinColumn(name = "`idParent`", referencedColumnName = "`idUtoteResult`", insertable=true, updatable=true)
    @Transient
    private UtoteResult result = null;

    // @OneToMany(mappedBy="prices", cascade = CascadeType.PERSIST)
    @Transient
    private Collection<UtotePrice> prices = null;

    public UtotePoolPrice() {
    }


    public int getIdUtotePoolPrice() {
        return this.idUtotePoolPrice;
    }
    public void setIdUtotePoolPrice(int idUtotePoolPrice) {
        this.idUtotePoolPrice = idUtotePoolPrice;
    }


    public int getIdParent() {
        return this.idParent;
    }
    public void setIdParent(int idParent) {
        this.idParent = idParent;
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


    public boolean getRefund() {
        return this.refund;
    }
    public void setRefund(boolean refund) {
        this.refund = refund;
    }


    public BigDecimal getCarryOver() {
        return this.carryOver;
    }
    public void setCarryOver(BigDecimal carryOver) {
        this.carryOver = carryOver;
    }


    public boolean hasPrices() {
        return this.hasPrices;
    }
    public void setHasPrices(boolean hasPrices) {
        this.hasPrices = hasPrices;
    }


    /**
     * @return the result
     */
    public UtoteResult getResult() {
        return result;
    }


    /**
     * @param result the result to set
     */
    public void setResult(UtoteResult result) {
        this.result = result;
    }


    /**
     * @return the prices
     */
    public Collection<UtotePrice> getPrices() {
        return prices;
    }


    /**
     * @param prices the prices to set
     */
    public void setPrices(Collection<UtotePrice> prices) {
        this.prices = prices;
    }


    public String toString(boolean deep) {
        StringBuilder builder = new StringBuilder();
        builder.append("UtotePoolPrice [idUtotePoolPrice=").append(idUtotePoolPrice).append(", idParent=").append(idParent).append(", ");
        if (poolId != null) {
            builder.append("poolId=").append(poolId).append(", ");
        }
        if (poolName != null) {
            builder.append("poolName=").append(poolName).append(", ");
        }
        builder.append("refund=").append(refund).append(", ");
        if (carryOver != null) {
            builder.append("carryOver=").append(carryOver).append(", ");
        }
        builder.append("hasPrices=").append(hasPrices).append(", ");
        if (deep && (result != null)) {
            builder.append("result=").append(result).append(", ");
        }
        if (prices != null) {
            builder.append("prices=").append(prices);
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
     * Retrieve any Price elements associated with this Pool Price
     *
     * @param em The EntityManager to run against
     */
    public void load(EntityManager em, UtoteResult parent) {
        if (null != parent) {
            this.setResult(parent);
        }
        TypedQuery<UtotePrice> eq = em.createNamedQuery("UtotePrice.findByParent", UtotePrice.class);
        eq.setParameter("idParent", this.idUtotePoolPrice);
        this.prices = eq.getResultList();
        if (null != this.prices) {
            for (UtotePrice aPrice : this.prices) {
                aPrice.setPoolPrice(this);
            }
        }
    }
    public void load(EntityManager em) {
        load(em, null);
    }

    /**
     * Clear any Finisher elements associated with this position
     *
     */
    public void clear() {
        if (null != this.prices) {
            for (UtotePrice aPrice : this.prices) {
                aPrice.setPoolPrice(null);
            }
            this.prices.clear();
            this.prices = null;
        }
    }

    /**
     * Detaches any Finisher elements associated with this position
     *
     * @param em The EntityManager to detach from
     */
    public void detachEntries(EntityManager em) {
        if (null != this.prices) {
            for (UtotePrice aPrice : this.prices) {
                em.detach(aPrice);
            }
        }
    }

    /**
     * Detaches this Position from the em
     *
     * @param em The EntityManager to detach from
     */
    public void detach(EntityManager em) {
        detachEntries(em);
        em.detach(this);
    }

}