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
 * The persistent class for the mypicks database table.
 *
 */
@Entity
@Table(name="mypicks")
@NamedQuery(name="Mypick.findAll", query="SELECT m FROM Mypick m")
public class Mypick implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`mypicksid`", insertable=true, updatable=false, unique=true, nullable=false)
    private int mypicksid;

    @Column(nullable=false)
    private int mypicksalthorsesid;

    @Column(nullable=false)
    private int mypicksgameracemapdate;

    @Column(nullable=false)
    private boolean mypicksisresultcalculate;

    @Column(nullable=false)
    private float mypicksplaceamount;

    @Column(nullable=false)
    private int mypicksprimaryhorsesid;

    @Column(nullable=false)
    private float mypicksshowamount;

    @Column(nullable=false)
    private boolean mypicksstatus;

    @Column(nullable=false)
    private int mypickstime;

    @Column(nullable=false)
    private float mypickswinamount;

    @Column(nullable=false)
    private int racesid;

    @Column(nullable=false)
    private int usergamesid;

    @Column(nullable=false)
    private int usersid;

    public Mypick() {
    }

    public int getMypicksid() {
        return this.mypicksid;
    }

    public void setMypicksid(int mypicksid) {
        this.mypicksid = mypicksid;
    }

    public int getMypicksalthorsesid() {
        return this.mypicksalthorsesid;
    }

    public void setMypicksalthorsesid(int mypicksalthorsesid) {
        this.mypicksalthorsesid = mypicksalthorsesid;
    }

    public int getMypicksgameracemapdate() {
        return this.mypicksgameracemapdate;
    }

    public void setMypicksgameracemapdate(int mypicksgameracemapdate) {
        this.mypicksgameracemapdate = mypicksgameracemapdate;
    }

    public boolean getMypicksisresultcalculate() {
        return this.mypicksisresultcalculate;
    }

    public void setMypicksisresultcalculate(boolean mypicksisresultcalculate) {
        this.mypicksisresultcalculate = mypicksisresultcalculate;
    }

    public float getMypicksplaceamount() {
        return this.mypicksplaceamount;
    }

    public void setMypicksplaceamount(float mypicksplaceamount) {
        this.mypicksplaceamount = mypicksplaceamount;
    }

    public int getMypicksprimaryhorsesid() {
        return this.mypicksprimaryhorsesid;
    }

    public void setMypicksprimaryhorsesid(int mypicksprimaryhorsesid) {
        this.mypicksprimaryhorsesid = mypicksprimaryhorsesid;
    }

    public float getMypicksshowamount() {
        return this.mypicksshowamount;
    }

    public void setMypicksshowamount(float mypicksshowamount) {
        this.mypicksshowamount = mypicksshowamount;
    }

    public boolean getMypicksstatus() {
        return this.mypicksstatus;
    }

    public void setMypicksstatus(boolean mypicksstatus) {
        this.mypicksstatus = mypicksstatus;
    }

    public int getMypickstime() {
        return this.mypickstime;
    }

    public void setMypickstime(int mypickstime) {
        this.mypickstime = mypickstime;
    }

    public float getMypickswinamount() {
        return this.mypickswinamount;
    }

    public void setMypickswinamount(float mypickswinamount) {
        this.mypickswinamount = mypickswinamount;
    }

    public int getRacesid() {
        return this.racesid;
    }

    public void setRacesid(int racesid) {
        this.racesid = racesid;
    }

    public int getUsergamesid() {
        return this.usergamesid;
    }

    public void setUsergamesid(int usergamesid) {
        this.usergamesid = usergamesid;
    }

    public int getUsersid() {
        return this.usersid;
    }

    public void setUsersid(int usersid) {
        this.usersid = usersid;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Mypick [mypicksid=").append(mypicksid).append(", mypicksalthorsesid=").append(mypicksalthorsesid)
        .append(", mypicksgameracemapdate=").append(mypicksgameracemapdate).append(", mypicksisresultcalculate=")
        .append(mypicksisresultcalculate).append(", mypicksplaceamount=").append(mypicksplaceamount).append(", mypicksprimaryhorsesid=")
        .append(mypicksprimaryhorsesid).append(", mypicksshowamount=").append(mypicksshowamount).append(", mypicksstatus=")
        .append(mypicksstatus).append(", mypickstime=").append(mypickstime).append(", mypickswinamount=").append(mypickswinamount)
        .append(", racesid=").append(racesid).append(", usergamesid=").append(usergamesid).append(", usersid=").append(usersid).append("]");
        return builder.toString();
    }

}