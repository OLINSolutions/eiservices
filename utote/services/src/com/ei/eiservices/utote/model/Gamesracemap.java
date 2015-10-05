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
 * The persistent class for the gamesracemap database table.
 *
 */
@Entity
@Table(name="gamesracemap")
@NamedQuery(name="Gamesracemap.findAll", query="SELECT g FROM Gamesracemap g")
public class Gamesracemap implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`gamesracemapid`", insertable=true, updatable=false, unique=true, nullable=false)
    private int gamesracemapid;

    @Column
    private int gamesdateid;

    @Column
    private int gamesid;

    @Column
    private int gamesracemaptime;

    @Column
    private int racesid;

    @Column(nullable=false)
    private int tracksid;

    public Gamesracemap() {
    }

    public int getGamesracemapid() {
        return this.gamesracemapid;
    }

    public void setGamesracemapid(int gamesracemapid) {
        this.gamesracemapid = gamesracemapid;
    }

    public int getGamesdateid() {
        return this.gamesdateid;
    }

    public void setGamesdateid(int gamesdateid) {
        this.gamesdateid = gamesdateid;
    }

    public int getGamesid() {
        return this.gamesid;
    }

    public void setGamesid(int gamesid) {
        this.gamesid = gamesid;
    }

    public int getGamesracemaptime() {
        return this.gamesracemaptime;
    }

    public void setGamesracemaptime(int gamesracemaptime) {
        this.gamesracemaptime = gamesracemaptime;
    }

    public int getRacesid() {
        return this.racesid;
    }

    public void setRacesid(int racesid) {
        this.racesid = racesid;
    }

    public int getTracksid() {
        return this.tracksid;
    }

    public void setTracksid(int tracksid) {
        this.tracksid = tracksid;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Gamesracemap [gamesracemapid=").append(gamesracemapid).append(", gamesdateid=").append(gamesdateid).append(", gamesid=")
        .append(gamesid).append(", gamesracemaptime=").append(gamesracemaptime).append(", racesid=").append(racesid).append(", tracksid=")
        .append(tracksid).append("]");
        return builder.toString();
    }

}