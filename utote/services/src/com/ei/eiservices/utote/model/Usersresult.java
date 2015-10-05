package com.ei.eiservices.utote.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the usersresult database table.
 *
 */
@Entity
@Table(name="usersresult")
@NamedQuery(name="Usersresult.findAll", query="SELECT u FROM Usersresult u")
public class Usersresult implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`usersresultid`", insertable=true, updatable=false, unique=true, nullable=false)
    private int usersresultid;

    @Column(nullable=false)
    private int mypicksid;

    @Column(nullable=false)
    private int racesid;

    @Column(nullable=false)
    private int usersid;

    @Column(nullable=false)
    private int usersresultcalculatedtime;

    @Column(nullable=false)
    private float usersresultplaceamount;

    @Column(nullable=false)
    private float usersresultshowamount;

    @Column(nullable=false)
    private float usersresulttotalamount;

    @Column(nullable=false)
    private float usersresultwinamount;

    public Usersresult() {
    }

    public int getUsersresultid() {
        return this.usersresultid;
    }

    public void setUsersresultid(int usersresultid) {
        this.usersresultid = usersresultid;
    }

    public int getMypicksid() {
        return this.mypicksid;
    }

    public void setMypicksid(int mypicksid) {
        this.mypicksid = mypicksid;
    }

    public int getRacesid() {
        return this.racesid;
    }

    public void setRacesid(int racesid) {
        this.racesid = racesid;
    }

    public int getUsersid() {
        return this.usersid;
    }

    public void setUsersid(int usersid) {
        this.usersid = usersid;
    }

    public int getUsersresultcalculatedtime() {
        return this.usersresultcalculatedtime;
    }

    public void setUsersresultcalculatedtime(int usersresultcalculatedtime) {
        this.usersresultcalculatedtime = usersresultcalculatedtime;
    }

    public float getUsersresultplaceamount() {
        return this.usersresultplaceamount;
    }

    public void setUsersresultplaceamount(float usersresultplaceamount) {
        this.usersresultplaceamount = usersresultplaceamount;
    }

    public float getUsersresultshowamount() {
        return this.usersresultshowamount;
    }

    public void setUsersresultshowamount(float usersresultshowamount) {
        this.usersresultshowamount = usersresultshowamount;
    }

    public float getUsersresulttotalamount() {
        return this.usersresulttotalamount;
    }

    public void setUsersresulttotalamount(float usersresulttotalamount) {
        this.usersresulttotalamount = usersresulttotalamount;
    }

    public float getUsersresultwinamount() {
        return this.usersresultwinamount;
    }

    public void setUsersresultwinamount(float usersresultwinamount) {
        this.usersresultwinamount = usersresultwinamount;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Usersresult [usersresultid=").append(usersresultid).append(", mypicksid=").append(mypicksid).append(", racesid=")
        .append(racesid).append(", usersid=").append(usersid).append(", usersresultcalculatedtime=").append(usersresultcalculatedtime)
        .append(", usersresultplaceamount=").append(usersresultplaceamount).append(", usersresultshowamount=").append(usersresultshowamount)
        .append(", usersresulttotalamount=").append(usersresulttotalamount).append(", usersresultwinamount=").append(usersresultwinamount)
        .append("]");
        return builder.toString();
    }

}