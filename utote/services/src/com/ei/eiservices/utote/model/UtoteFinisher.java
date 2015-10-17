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

    @Column
    private int RTWhorsesid = 0;

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

    public void updateFromTote(ResultServiceStub.Finisher finisher) {

        this.setRunnerId(finisher.getRunnerId());
        if (finisher.isEntryIdSpecified()) {
            this.setEntryId(finisher.getEntryId());
        }
        if (finisher.isJockeySpecified()) {
            this.setJockey(finisher.getJockey());
        }
        if (finisher.isNameSpecified()) {
            this.setName(finisher.getName());
        }

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
        return String.valueOf(runnerId).concat((null != entryId)?entryId:"");
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
        builder.append("RTWHorsesid=").append(RTWhorsesid).append(", ");
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


    /**
     * @return the rTWhorsesid
     */
    public int getRTWhorsesid() {
        return RTWhorsesid;
    }


    /**
     * @param rTWhorsesid the rTWhorsesid to set
     */
    public void setRTWhorsesid(int rTWhorsesid) {
        RTWhorsesid = rTWhorsesid;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + RTWhorsesid;
        result = (prime * result) + ((entryId == null) ? 0 : entryId.hashCode());
        result = (prime * result) + ((jockey == null) ? 0 : jockey.hashCode());
        result = (prime * result) + ((name == null) ? 0 : name.hashCode());
        result = (prime * result) + ((rtwPlaceAmount == null) ? 0 : rtwPlaceAmount.hashCode());
        result = (prime * result) + ((rtwShowAmount == null) ? 0 : rtwShowAmount.hashCode());
        result = (prime * result) + ((rtwWinAmount == null) ? 0 : rtwWinAmount.hashCode());
        result = (prime * result) + runnerId;
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
        UtoteFinisher other = (UtoteFinisher) obj;
        if (RTWhorsesid != other.RTWhorsesid) {
            return false;
        }
        if (entryId == null) {
            if (other.entryId != null) {
                return false;
            }
        } else if (!entryId.equals(other.entryId)) {
            return false;
        }
        if (jockey == null) {
            if (other.jockey != null) {
                return false;
            }
        } else if (!jockey.equals(other.jockey)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (rtwPlaceAmount == null) {
            if (other.rtwPlaceAmount != null) {
                return false;
            }
        } else if (0 != rtwPlaceAmount.compareTo(other.rtwPlaceAmount)) {
            return false;
        }
        if (rtwShowAmount == null) {
            if (other.rtwShowAmount != null) {
                return false;
            }
        } else if (0 != rtwShowAmount.compareTo(other.rtwShowAmount)) {
            return false;
        }
        if (rtwWinAmount == null) {
            if (other.rtwWinAmount != null) {
                return false;
            }
        } else if (0 != rtwWinAmount.compareTo(other.rtwWinAmount)) {
            return false;
        }
        if (runnerId != other.runnerId) {
            return false;
        }
        return true;
    }

}