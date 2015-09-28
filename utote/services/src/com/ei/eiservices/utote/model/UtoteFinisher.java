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
 * The persistent class for the utoteFinishers database table.
 *
 */
@Entity
@Table(name="utoteFinishers")
@NamedQueries({
    @NamedQuery(name="UtoteFinisher.findAll", query="SELECT f FROM UtoteFinisher f"),
    @NamedQuery(name="UtoteFinisher.findByParent", query="SELECT f FROM UtoteFinisher f WHERE f.idParent = :idParent")
})
public class UtoteFinisher implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`idUtoteFinisher`", insertable=true, updatable=false, unique=true, nullable=false)
    private int idUtoteFinisher = 0;

    @Column(name = "`idParent`", unique=true, nullable=false, insertable=true, updatable=true)
    private int idParent = 0;

    @Column(nullable=false)
    private int runnerId = 0;

    @Column(length=1)
    private String entryId = null;

    @Column(length=25)
    private String name = null;

    @Column(length=25)
    private String jockey = null;

    @Transient
    private UtotePosition position = null;

    @Transient
    private BigDecimal rtwWinAmount = new BigDecimal(0);

    @Transient
    private BigDecimal rtwPlaceAmount = new BigDecimal(0);

    @Transient
    private BigDecimal rtwShowAmount = new BigDecimal(0);


    public UtoteFinisher() {
    }


    public int getIdUtoteFinisher() {
        return this.idUtoteFinisher;
    }
    public void setIdUtoteFinisher(int idUtoteFinisher) {
        this.idUtoteFinisher = idUtoteFinisher;
    }


    public int getIdParent() {
        return this.idParent;
    }
    public void setIdParent(int idParent) {
        this.idParent = idParent;
    }


    public int getRunnerId() {
        return this.runnerId;
    }
    public void setRunnerId(int runnerId) {
        this.runnerId = runnerId;
    }


    public String getEntryId() {
        return this.entryId;
    }
    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getJockey() {
        return this.jockey;
    }
    public void setJockey(String jockey) {
        this.jockey = jockey;
    }


    /**
     * @return the position
     */
    public UtotePosition getPosition() {
        return position;
    }
    /**
     * @param position the position to set
     */
    public void setPosition(UtotePosition position) {
        this.position = position;
    }


    public String getRtwHorsesProgramNumber() {
        String pn = String.valueOf(runnerId);
        if (null != entryId) {
            pn += entryId;
        }
        return pn;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UtoteFinisher [idUtoteFinisher=").append(idUtoteFinisher).append(", idParent=").append(idParent).append(", runnerId=")
        .append(runnerId).append(", ");
        if (entryId != null) {
            builder.append("entryId=").append(entryId).append(", ");
        }
        if (name != null) {
            builder.append("name=").append(name).append(", ");
        }
        if (jockey != null) {
            builder.append("jockey=").append(jockey).append(", ");
        }
        builder.append("getRtwHorsesProgramNumber()=").append(getRtwHorsesProgramNumber()).append(", ");
        builder.append("rtwWinAmount=").append(rtwWinAmount).append(", ");
        builder.append("rtwPlaceAmount=").append(rtwPlaceAmount).append(", ");
        builder.append("rtwShowAmount=").append(rtwShowAmount);
        builder.append("]");
        return builder.toString();
    }

    /**
     * @return the rtwWinAmount
     */
    public BigDecimal getRtwWinAmount() {
        return rtwWinAmount;
    }
    /**
     * @param rtwWinAmount the rtwWinAmount to set
     */
    public void setRtwWinAmount(BigDecimal rtwWinAmount) {
        this.rtwWinAmount = rtwWinAmount;
    }
    /**
     * @param rtwWinAmount the rtwWinAmount to add
     */
    public void addToRtwWinAmount(BigDecimal rtwWinAmount) {
        this.rtwWinAmount = this.rtwWinAmount.add(rtwWinAmount);
    }


    /**
     * @return the rtwPlaceAmount
     */
    public BigDecimal getRtwPlaceAmount() {
        return rtwPlaceAmount;
    }
    /**
     * @param rtwPlaceAmount the rtwPlaceAmount to set
     */
    public void setRtwPlaceAmount(BigDecimal rtwPlaceAmount) {
        this.rtwPlaceAmount = rtwPlaceAmount;
    }
    /**
     * @param rtwPlaceAmount the rtwPlaceAmount to set
     */
    public void addToRtwPlaceAmount(BigDecimal rtwPlaceAmount) {
        this.rtwPlaceAmount = this.rtwPlaceAmount.add(rtwPlaceAmount);
    }


    /**
     * @return the rtwShowAmount
     */
    public BigDecimal getRtwShowAmount() {
        return rtwShowAmount;
    }
    /**
     * @param rtwShowAmount the rtwShowAmount to set
     */
    public void setRtwShowAmount(BigDecimal rtwShowAmount) {
        this.rtwShowAmount = rtwShowAmount;
    }
    /**
     * @param rtwPlaceAmount the rtwPlaceAmount to set
     */
    public void addToRtwShowAmount(BigDecimal rtwShowAmount) {
        this.rtwShowAmount = this.rtwShowAmount.add(rtwShowAmount);
    }

}