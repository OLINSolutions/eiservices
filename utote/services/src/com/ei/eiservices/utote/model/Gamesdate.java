package com.ei.eiservices.utote.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the gamesdate database table.
 *
 */
@Entity
@Table(name="gamesdate")
@NamedQuery(name="Gamesdate.findAll", query="SELECT g FROM Gamesdate g")
public class Gamesdate implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`gamesdateid`", insertable=true, updatable=false, unique=true, nullable=false)
    private int gamesdateid;

    @Column(nullable=false, length=10)
    private String gamesdatepickaltstatus;

    @Column(nullable=false)
    private boolean gamesdateuserspicksemail;

    @Column(length=45)
    private String gamesdatevalue;

    @Column(name="gamesdatevalue_gmt", nullable=false)
    private int gamesdatevalueGmt;

    @Column(nullable=false)
    private int gamesdateweeknumber;

    @Column
    private int gamesid;

    @Lob
    @Column(nullable=false)
    private String timezone;

    public Gamesdate() {
    }

    public int getGamesdateid() {
        return this.gamesdateid;
    }

    public void setGamesdateid(int gamesdateid) {
        this.gamesdateid = gamesdateid;
    }

    public String getGamesdatepickaltstatus() {
        return this.gamesdatepickaltstatus;
    }

    public void setGamesdatepickaltstatus(String gamesdatepickaltstatus) {
        this.gamesdatepickaltstatus = gamesdatepickaltstatus;
    }

    public boolean getGamesdateuserspicksemail() {
        return this.gamesdateuserspicksemail;
    }

    public void setGamesdateuserspicksemail(boolean gamesdateuserspicksemail) {
        this.gamesdateuserspicksemail = gamesdateuserspicksemail;
    }

    public String getGamesdatevalue() {
        return this.gamesdatevalue;
    }

    public void setGamesdatevalue(String gamesdatevalue) {
        this.gamesdatevalue = gamesdatevalue;
    }

    public int getGamesdatevalueGmt() {
        return this.gamesdatevalueGmt;
    }

    public void setGamesdatevalueGmt(int gamesdatevalueGmt) {
        this.gamesdatevalueGmt = gamesdatevalueGmt;
    }

    public int getGamesdateweeknumber() {
        return this.gamesdateweeknumber;
    }

    public void setGamesdateweeknumber(int gamesdateweeknumber) {
        this.gamesdateweeknumber = gamesdateweeknumber;
    }

    public int getGamesid() {
        return this.gamesid;
    }

    public void setGamesid(int gamesid) {
        this.gamesid = gamesid;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Gamesdate [gamesdateid=").append(gamesdateid).append(", ");
        if (gamesdatepickaltstatus != null) {
            builder.append("gamesdatepickaltstatus=").append(gamesdatepickaltstatus).append(", ");
        }
        builder.append("gamesdateuserspicksemail=").append(gamesdateuserspicksemail).append(", ");
        if (gamesdatevalue != null) {
            builder.append("gamesdatevalue=").append(gamesdatevalue).append(", ");
        }
        builder.append("gamesdatevalueGmt=").append(gamesdatevalueGmt).append(", gamesdateweeknumber=").append(gamesdateweeknumber)
        .append(", gamesid=").append(gamesid).append(", ");
        if (timezone != null) {
            builder.append("timezone=").append(timezone);
        }
        builder.append("]");
        return builder.toString();
    }

}