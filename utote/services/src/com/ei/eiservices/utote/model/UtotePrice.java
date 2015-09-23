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


/**
 * The persistent class for the utotePrices database table.
 *
 */
@Entity
@Table(name="utotePrices")
@NamedQuery(name="UtotePrice.findAll", query="SELECT p FROM UtotePrice p")
@NamedQueries({
    @NamedQuery(name="UtotePrice.findAll", query="SELECT p FROM UtotePrice p"),
    @NamedQuery(name="UtotePrice.findByParent", query="SELECT p FROM UtotePrice p WHERE p.idParent = :idParent")
})
public class UtotePrice implements Serializable {

    private static final long serialVersionUID = 1L;

    private int idUtotePrice = 0;
    private int idParent = 0;
    private boolean exchange = false;
    private String finish = null;
    private boolean hold = false;
    private BigDecimal payoff = null;
    private BigDecimal priceAmount = null;
    private int required = 0;
    private BigDecimal wager = null;
    private BigDecimal winnings = null;

    @Transient
    private UtotePoolPrice poolPrice = null;

    public UtotePrice() {
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`idUtotePrice`", insertable=true, updatable=false, unique=true, nullable=false)
    public int getIdUtotePrice() {
        return this.idUtotePrice;
    }
    public void setIdUtotePrice(int idUtotePrice) {
        this.idUtotePrice = idUtotePrice;
    }


    public boolean getExchange() {
        return this.exchange;
    }
    public void setExchange(boolean exchange) {
        this.exchange = exchange;
    }


    @Column(nullable=false, length=80)
    public String getFinish() {
        return this.finish;
    }
    public void setFinish(String finish) {
        this.finish = finish;
    }


    public boolean getHold() {
        return this.hold;
    }
    public void setHold(boolean hold) {
        this.hold = hold;
    }


    @Column(name = "`idParent`", unique=true, nullable=false, insertable=true, updatable=true)
    public int getIdParent() {
        return this.idParent;
    }
    public void setIdParent(int idParent) {
        this.idParent = idParent;
    }


    @Column(precision=10)
    public BigDecimal getPayoff() {
        return this.payoff;
    }
    public void setPayoff(BigDecimal payoff) {
        this.payoff = payoff;
    }


    @Column(precision=10)
    public BigDecimal getPriceAmount() {
        return this.priceAmount;
    }
    public void setPriceAmount(BigDecimal priceAmount) {
        this.priceAmount = priceAmount;
    }


    public int getRequired() {
        return this.required;
    }
    public void setRequired(int required) {
        this.required = required;
    }


    @Column(precision=10)
    public BigDecimal getWager() {
        return this.wager;
    }
    public void setWager(BigDecimal wager) {
        this.wager = wager;
    }


    @Column(precision=10)
    public BigDecimal getWinnings() {
        return this.winnings;
    }
    public void setWinnings(BigDecimal winnings) {
        this.winnings = winnings;
    }

    /**
     * @return the poolPrice
     */
    public UtotePoolPrice getPoolPrice() {
        return poolPrice;
    }

    /**
     * @param poolPrice the poolPrice to set
     */
    public void setPoolPrice(UtotePoolPrice poolPrice) {
        this.poolPrice = poolPrice;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UtotePrice [idUtotePrice=").append(idUtotePrice).append(", idParent=").append(idParent).append(", exchange=").append(exchange)
        .append(", ");
        if (finish != null) {
            builder.append("finish=").append(finish).append(", ");
        }
        builder.append("hold=").append(hold).append(", ");
        if (payoff != null) {
            builder.append("payoff=").append(payoff).append(", ");
        }
        if (priceAmount != null) {
            builder.append("priceAmount=").append(priceAmount).append(", ");
        }
        builder.append("required=").append(required).append(", ");
        if (wager != null) {
            builder.append("wager=").append(wager).append(", ");
        }
        if (winnings != null) {
            builder.append("winnings=").append(winnings).append(", ");
        }
        if (poolPrice != null) {
            builder.append("poolPrice=").append(poolPrice);
        }
        builder.append("]");
        return builder.toString();
    }


}