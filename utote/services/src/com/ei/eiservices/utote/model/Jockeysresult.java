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
 * The persistent class for the jockeysresults database table.
 *
 */
@Entity
@Table(name="jockeysresults")
@NamedQueries({
    @NamedQuery(name="Jockeysresult.findAll", query="SELECT j FROM Jockeysresult j"),
    @NamedQuery(name="Jockeysresult.findByRace", query="SELECT j FROM Jockeysresult j where j.racesid = :racesid"),
    @NamedQuery(name="Jockeysresult.countByRace", query="SELECT count(j) FROM Jockeysresult j where j.racesid = :racesid")
})
public class Jockeysresult implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`horsesid`", insertable=true, updatable=false, unique=true, nullable=false)
    private int jockeysresultsid = 0;

    @Column(nullable=false)
    private int horsesid = 0;

    @Column(nullable=false)
    private int jockeyid = 0;

    @Column(nullable=false)
    private float jockeysresultsplaceamounts = 0;

    @Column(nullable=false, length=100)
    private String jockeysresultsracetag = null;

    @Column(nullable=false)
    private float jockeysresultsshowamounts = 0;

    @Column(nullable=false)
    private float jockeysresultstotalamounts = 0;

    @Column(nullable=false)
    private float jockeysresultswinamounts = 0;

    @Column(nullable=false)
    private int racesid = 0;

    public Jockeysresult() {
    }

    public int getJockeysresultsid() {
        return this.jockeysresultsid;
    }

    public void setJockeysresultsid(int jockeysresultsid) {
        this.jockeysresultsid = jockeysresultsid;
    }

    public int getHorsesid() {
        return this.horsesid;
    }

    public void setHorsesid(int horsesid) {
        this.horsesid = horsesid;
    }

    public int getJockeyid() {
        return this.jockeyid;
    }

    public void setJockeyid(int jockeyid) {
        this.jockeyid = jockeyid;
    }

    public float getJockeysresultsplaceamounts() {
        return this.jockeysresultsplaceamounts;
    }

    public void setJockeysresultsplaceamounts(float jockeysresultsplaceamounts) {
        this.jockeysresultsplaceamounts = jockeysresultsplaceamounts;
    }

    public String getJockeysresultsracetag() {
        return this.jockeysresultsracetag;
    }

    public void setJockeysresultsracetag(String jockeysresultsracetag) {
        this.jockeysresultsracetag = jockeysresultsracetag;
    }

    public float getJockeysresultsshowamounts() {
        return this.jockeysresultsshowamounts;
    }

    public void setJockeysresultsshowamounts(float jockeysresultsshowamounts) {
        this.jockeysresultsshowamounts = jockeysresultsshowamounts;
    }

    public float getJockeysresultstotalamounts() {
        return this.jockeysresultstotalamounts;
    }

    public void setJockeysresultstotalamounts(float jockeysresultstotalamounts) {
        this.jockeysresultstotalamounts = jockeysresultstotalamounts;
    }

    public float getJockeysresultswinamounts() {
        return this.jockeysresultswinamounts;
    }

    public void setJockeysresultswinamounts(float jockeysresultswinamounts) {
        this.jockeysresultswinamounts = jockeysresultswinamounts;
    }

    public int getRacesid() {
        return this.racesid;
    }

    public void setRacesid(int racesid) {
        this.racesid = racesid;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Jockeysresult [jockeysresultsid=").append(jockeysresultsid).append(", horsesid=").append(horsesid).append(", jockeyid=")
        .append(jockeyid).append(", jockeysresultsplaceamounts=").append(jockeysresultsplaceamounts).append(", ");
        if (jockeysresultsracetag != null) {
            builder.append("jockeysresultsracetag=").append(jockeysresultsracetag).append(", ");
        }
        builder.append("jockeysresultsshowamounts=").append(jockeysresultsshowamounts).append(", jockeysresultstotalamounts=")
        .append(jockeysresultstotalamounts).append(", jockeysresultswinamounts=").append(jockeysresultswinamounts).append(", racesid=")
        .append(racesid).append("]");
        return builder.toString();
    }

}