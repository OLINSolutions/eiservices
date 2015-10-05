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
 * The persistent class for the usergames database table.
 *
 */
@Entity
@Table(name="usergames")
@NamedQuery(name="Usergame.findAll", query="SELECT u FROM Usergame u")
public class Usergame implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`usergamesid`", insertable=true, updatable=false, unique=true, nullable=false)
    private int usergamesid;

    @Column
    private int gamesid;

    @Column(nullable=false)
    private int gamespostactionid;

    @Column(nullable=false)
    private float standingamount;

    @Column
    private byte usergamesentrynumber;

    @Column(nullable=false)
    private boolean usergamesisactive;

    @Column
    private float usergamesmythicalbankroll;

    @Column
    private int usergamesnumberoflifeline;

    @Column
    private byte usergamesstatus;

    @Column
    private int usersid;

    public Usergame() {
    }

    public int getUsergamesid() {
        return this.usergamesid;
    }

    public void setUsergamesid(int usergamesid) {
        this.usergamesid = usergamesid;
    }

    public int getGamesid() {
        return this.gamesid;
    }

    public void setGamesid(int gamesid) {
        this.gamesid = gamesid;
    }

    public int getGamespostactionid() {
        return this.gamespostactionid;
    }

    public void setGamespostactionid(int gamespostactionid) {
        this.gamespostactionid = gamespostactionid;
    }

    public float getStandingamount() {
        return this.standingamount;
    }

    public void setStandingamount(float standingamount) {
        this.standingamount = standingamount;
    }

    public byte getUsergamesentrynumber() {
        return this.usergamesentrynumber;
    }

    public void setUsergamesentrynumber(byte usergamesentrynumber) {
        this.usergamesentrynumber = usergamesentrynumber;
    }

    public boolean getUsergamesisactive() {
        return this.usergamesisactive;
    }

    public void setUsergamesisactive(boolean usergamesisactive) {
        this.usergamesisactive = usergamesisactive;
    }

    public float getUsergamesmythicalbankroll() {
        return this.usergamesmythicalbankroll;
    }

    public void setUsergamesmythicalbankroll(float usergamesmythicalbankroll) {
        this.usergamesmythicalbankroll = usergamesmythicalbankroll;
    }

    public int getUsergamesnumberoflifeline() {
        return this.usergamesnumberoflifeline;
    }

    public void setUsergamesnumberoflifeline(int usergamesnumberoflifeline) {
        this.usergamesnumberoflifeline = usergamesnumberoflifeline;
    }

    public byte getUsergamesstatus() {
        return this.usergamesstatus;
    }

    public void setUsergamesstatus(byte usergamesstatus) {
        this.usergamesstatus = usergamesstatus;
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
        builder.append("Usergame [usergamesid=").append(usergamesid).append(", gamesid=").append(gamesid).append(", gamespostactionid=")
        .append(gamespostactionid).append(", standingamount=").append(standingamount).append(", usergamesentrynumber=")
        .append(usergamesentrynumber).append(", usergamesisactive=").append(usergamesisactive).append(", usergamesmythicalbankroll=")
        .append(usergamesmythicalbankroll).append(", usergamesnumberoflifeline=").append(usergamesnumberoflifeline)
        .append(", usergamesstatus=").append(usergamesstatus).append(", usersid=").append(usersid).append("]");
        return builder.toString();
    }

}