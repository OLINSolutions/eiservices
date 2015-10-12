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

import com.ei.eiservices.utote.client.resultservice.ResultServiceStub;


/**
 * The persistent class for the utotePrices database table.
 *
 */
@Entity
@Table(name="utotePrices")
@NamedQueries({
    @NamedQuery(name="UtotePrice.findAll", query="SELECT p FROM UtotePrice p"),
    @NamedQuery(name="UtotePrice.findByParent", query="SELECT p FROM UtotePrice p WHERE p.idParent = :idParent")
})
public class UtotePrice implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`idUtotePrice`", insertable=true, updatable=false, unique=true, nullable=false)
    private int idUtotePrice = 0;

    @Column(name = "`idParent`", unique=true, nullable=false, insertable=true, updatable=true)
    private int idParent = 0;

    @Column
    private boolean exchange = false;

    @Column(nullable=false, length=80)
    private String finish = null;

    private boolean hold = false;

    @Column(precision=10, scale=3)
    private BigDecimal payoff = null;

    @Column(precision=10, scale=3)
    private BigDecimal priceAmount = null;

    @Column(length=10)
    private String required = null;

    @Column(precision=10, scale=3)
    private BigDecimal wager = null;

    @Column(precision=10, scale=3)
    private BigDecimal winnings = null;

    @Transient
    private UtotePoolPrice poolPrice = null;

    public UtotePrice() {
    }

    public void updateFromTote(ResultServiceStub.PriceEntity price) {
        this.setFinish(price.getFinish());
        if (price.isExchangeSpecified()) {
            this.setExchange(price.getExchange());
        }
        if (price.isHoldSpecified()) {
            this.setHold(price.getHold());
        }
        if (price.isPayoffSpecified()) {
            this.setPayoff(price.getPayoff());
        }
        if (price.isPriceAmountSpecified()) {
            this.setPriceAmount(price.getPriceAmount());
        }
        if (price.isRequiredSpecified()) {
            this.setRequired(price.getRequired());
        }
        if (price.isWagerSpecified()) {
            this.setWager(price.getWager());
        }
        if (price.isWinningsSpecified()) {
            this.setWinnings(price.getWinnings());
        }

    }

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


    public int getIdParent() {
        return this.idParent;
    }
    public void setIdParent(int idParent) {
        this.idParent = idParent;
    }


    public BigDecimal getPayoff() {
        return this.payoff;
    }
    public void setPayoff(BigDecimal payoff) {
        this.payoff = payoff;
    }


    public BigDecimal getPriceAmount() {
        return this.priceAmount;
    }
    public void setPriceAmount(BigDecimal priceAmount) {
        this.priceAmount = priceAmount;
    }


    public String getRequired() {
        return this.required;
    }
    public void setRequired(String required) {
        this.required = required;
    }


    public BigDecimal getWager() {
        return this.wager;
    }
    public void setWager(BigDecimal wager) {
        this.wager = wager;
    }


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

    public boolean containsFinisher(int runnerId) {
        String finishers[] = this.finish.split("/");
        String runner = Integer.toString(runnerId);
        for (String finisher : finishers) {
            if (finisher.equalsIgnoreCase(runner)) {
                return true;
            }
        }
        return false;
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
        if (required != null) {
            builder.append("required=").append(required).append(", ");
        }
        if (wager != null) {
            builder.append("wager=").append(wager).append(", ");
        }
        if (winnings != null) {
            builder.append("winnings=").append(winnings);
        }
        builder.append("]");
        return builder.toString();
    }
}