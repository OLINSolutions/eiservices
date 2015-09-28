package com.ei.eiservices.utote.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the results database table.
 *
 */
@Entity
@Table(name="results")
@NamedQueries({
    @NamedQuery(name="Result.findAll", query="SELECT r FROM Result r"),
    @NamedQuery(name="Result.findByRace", query="SELECT r from Result r where r.racesid = :racesid"),
    @NamedQuery(name="Result.countByRace", query="SELECT count(r) from Result r where r.racesid = :racesid")
})
public class Result implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`resultsid`", insertable=true, updatable=false, unique=true, nullable=false)
    private int resultsid = 0;

    @Column
    private int racesid = 0;

    @Column
    private int resultshorsesid = 0;

    @Column
    private float resultsplaceamount = 0;

    @Column(nullable=false, length=50)
    private String resultsracetag = null;

    @Column
    private float resultsshowamount = 0;

    @Column
    private float resultswinamount = 0;

    public Result() {
    }

    public int getResultsid() {
        return this.resultsid;
    }

    public void setResultsid(int resultsid) {
        this.resultsid = resultsid;
    }

    public int getRacesid() {
        return this.racesid;
    }

    public void setRacesid(int racesid) {
        this.racesid = racesid;
    }

    public int getResultshorsesid() {
        return this.resultshorsesid;
    }

    public void setResultshorsesid(int resultshorsesid) {
        this.resultshorsesid = resultshorsesid;
    }

    public float getResultsplaceamount() {
        return this.resultsplaceamount;
    }

    public void setResultsplaceamount(float resultsplaceamount) {
        this.resultsplaceamount = resultsplaceamount;
    }

    public String getResultsracetag() {
        return this.resultsracetag;
    }

    public void setResultsracetag(String resultsracetag) {
        this.resultsracetag = resultsracetag;
    }

    public float getResultsshowamount() {
        return this.resultsshowamount;
    }

    public void setResultsshowamount(float resultsshowamount) {
        this.resultsshowamount = resultsshowamount;
    }

    public float getResultswinamount() {
        return this.resultswinamount;
    }

    public void setResultswinamount(float resultswinamount) {
        this.resultswinamount = resultswinamount;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Result [resultsid=").append(resultsid).append(", racesid=").append(racesid).append(", resultshorsesid=")
        .append(resultshorsesid).append(", resultsplaceamount=").append(resultsplaceamount).append(", ");
        if (resultsracetag != null) {
            builder.append("resultsracetag=").append(resultsracetag).append(", ");
        }
        builder.append("resultsshowamount=").append(resultsshowamount).append(", resultswinamount=").append(resultswinamount).append("]");
        return builder.toString();
    }

}