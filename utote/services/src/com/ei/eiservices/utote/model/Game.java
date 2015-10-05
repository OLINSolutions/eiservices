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
 * The persistent class for the games database table.
 *
 */
@Entity
@Table(name="games")
@NamedQuery(name="Game.findAll", query="SELECT g FROM Game g")
public class Game implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`gamesid`", insertable=true, updatable=false, unique=true, nullable=false)
    private int gamesid;

    @Column
    private int categoriesid;

    @Column(nullable=false, length=1)
    private String gamesastest;

    @Column(nullable=false)
    private boolean gamesautomaticallyover;

    @Column(length=45)
    private String gamescategoriestypeid;

    @Column
    private int gamescosttoplay;

    @Column
    private int gamescreationdate;

    @Column(nullable=false)
    private int gamescreationmode;

    @Column(nullable=false)
    private int gamescsvpickreportstatus;

    @Column
    private int gamescurrententries;

    @Column(nullable=false)
    private int gamescurrententrybypointseat;

    @Lob
    @Column(nullable=false)
    private String gamescustomprize;

    @Column(nullable=false)
    private int gamesdonationstatus;

    @Column
    private int gamesentrypointfee;

    @Column(nullable=false)
    private int gamesentrypointseatnumber;

    @Column
    private int gamesentrypointsforpointseat;

    @Column
    private int gamesfeetypeid;

    @Column(nullable=false)
    private boolean gamesisover;

    @Column(nullable=false)
    private int gamesispartnergame;

    @Column
    private int gamesjoiningtimefreepoints;

    @Column(nullable=false)
    private int gameslockdowntime;

    @Column
    private int gamesmaxentries;

    @Column
    private int gamesminentries;

    @Column(nullable=false)
    private int gamesmode;

    @Column(length=255)
    private String gamesname;

    @Column(length=45)
    private String gamesnumberofraces;

    @Column(nullable=false, length=255)
    private String gamespaymenttype;

    @Column(nullable=false)
    private int gamespointentryavailablepos;

    @Column(nullable=false)
    private int gamespointentryseatstatus;

    @Column(nullable=false)
    private int gamesprivacymode;

    @Column(length=255)
    private String gamesprizeamount;

    @Lob
    @Column(nullable=false)
    private String gamesprizedisplayforinfotab;

    @Column(nullable=false, length=255)
    private String gamesprizedisplayforsite;

    @Column
    private int gamesprizedistributionid;

    @Column(nullable=false)
    private int gamesprizedistributionusercreategame;

    @Column
    private int gamesprizetypeid;

    @Column(nullable=false)
    private int gamespurchaseentry;

    @Column(nullable=false)
    private boolean gamespurchaselifeline;

    @Column(nullable=false)
    private int gamesrefundallusers;

    @Lob
    @Column(nullable=false)
    private String gamesrules;

    @Column(nullable=false)
    private float gamessalary;

    @Column(length=255)
    private String gamesshowintab;

    @Column
    private int gamestakeout;

    @Column(nullable=false)
    private float gamestakeoutpercentage;

    @Column(nullable=false)
    private float gamestakeoutvalue;

    @Column(nullable=false)
    private int gamestwitterfeedeviewstatus;

    @Lob
    @Column(nullable=false)
    private String gamestypedescription;

    @Column(nullable=false)
    private byte gamestypeid;

    @Column(nullable=false, length=100)
    private String gamestypeimage;

    @Column(length=45)
    private String gamesusermaxentries;

    @Column(nullable=false)
    private boolean gameswinnercalculationstatus;

    @Column(nullable=false, length=1)
    private String gameswinnerpayby;

    @Column(nullable=false)
    private boolean gameswinnerstatus;

    @Column
    private int statusid;

    @Column(nullable=false)
    private int usersid;

    public Game() {
    }

    public int getGamesid() {
        return this.gamesid;
    }

    public void setGamesid(int gamesid) {
        this.gamesid = gamesid;
    }

    public int getCategoriesid() {
        return this.categoriesid;
    }

    public void setCategoriesid(int categoriesid) {
        this.categoriesid = categoriesid;
    }

    public String getGamesastest() {
        return this.gamesastest;
    }

    public void setGamesastest(String gamesastest) {
        this.gamesastest = gamesastest;
    }

    public boolean getGamesautomaticallyover() {
        return this.gamesautomaticallyover;
    }

    public void setGamesautomaticallyover(boolean gamesautomaticallyover) {
        this.gamesautomaticallyover = gamesautomaticallyover;
    }

    public String getGamescategoriestypeid() {
        return this.gamescategoriestypeid;
    }

    public void setGamescategoriestypeid(String gamescategoriestypeid) {
        this.gamescategoriestypeid = gamescategoriestypeid;
    }

    public int getGamescosttoplay() {
        return this.gamescosttoplay;
    }

    public void setGamescosttoplay(int gamescosttoplay) {
        this.gamescosttoplay = gamescosttoplay;
    }

    public int getGamescreationdate() {
        return this.gamescreationdate;
    }

    public void setGamescreationdate(int gamescreationdate) {
        this.gamescreationdate = gamescreationdate;
    }

    public int getGamescreationmode() {
        return this.gamescreationmode;
    }

    public void setGamescreationmode(int gamescreationmode) {
        this.gamescreationmode = gamescreationmode;
    }

    public int getGamescsvpickreportstatus() {
        return this.gamescsvpickreportstatus;
    }

    public void setGamescsvpickreportstatus(int gamescsvpickreportstatus) {
        this.gamescsvpickreportstatus = gamescsvpickreportstatus;
    }

    public int getGamescurrententries() {
        return this.gamescurrententries;
    }

    public void setGamescurrententries(int gamescurrententries) {
        this.gamescurrententries = gamescurrententries;
    }

    public int getGamescurrententrybypointseat() {
        return this.gamescurrententrybypointseat;
    }

    public void setGamescurrententrybypointseat(int gamescurrententrybypointseat) {
        this.gamescurrententrybypointseat = gamescurrententrybypointseat;
    }

    public String getGamescustomprize() {
        return this.gamescustomprize;
    }

    public void setGamescustomprize(String gamescustomprize) {
        this.gamescustomprize = gamescustomprize;
    }

    public int getGamesdonationstatus() {
        return this.gamesdonationstatus;
    }

    public void setGamesdonationstatus(int gamesdonationstatus) {
        this.gamesdonationstatus = gamesdonationstatus;
    }

    public int getGamesentrypointfee() {
        return this.gamesentrypointfee;
    }

    public void setGamesentrypointfee(int gamesentrypointfee) {
        this.gamesentrypointfee = gamesentrypointfee;
    }

    public int getGamesentrypointseatnumber() {
        return this.gamesentrypointseatnumber;
    }

    public void setGamesentrypointseatnumber(int gamesentrypointseatnumber) {
        this.gamesentrypointseatnumber = gamesentrypointseatnumber;
    }

    public int getGamesentrypointsforpointseat() {
        return this.gamesentrypointsforpointseat;
    }

    public void setGamesentrypointsforpointseat(int gamesentrypointsforpointseat) {
        this.gamesentrypointsforpointseat = gamesentrypointsforpointseat;
    }

    public int getGamesfeetypeid() {
        return this.gamesfeetypeid;
    }

    public void setGamesfeetypeid(int gamesfeetypeid) {
        this.gamesfeetypeid = gamesfeetypeid;
    }

    public boolean getGamesisover() {
        return this.gamesisover;
    }

    public void setGamesisover(boolean gamesisover) {
        this.gamesisover = gamesisover;
    }

    public int getGamesispartnergame() {
        return this.gamesispartnergame;
    }

    public void setGamesispartnergame(int gamesispartnergame) {
        this.gamesispartnergame = gamesispartnergame;
    }

    public int getGamesjoiningtimefreepoints() {
        return this.gamesjoiningtimefreepoints;
    }

    public void setGamesjoiningtimefreepoints(int gamesjoiningtimefreepoints) {
        this.gamesjoiningtimefreepoints = gamesjoiningtimefreepoints;
    }

    public int getGameslockdowntime() {
        return this.gameslockdowntime;
    }

    public void setGameslockdowntime(int gameslockdowntime) {
        this.gameslockdowntime = gameslockdowntime;
    }

    public int getGamesmaxentries() {
        return this.gamesmaxentries;
    }

    public void setGamesmaxentries(int gamesmaxentries) {
        this.gamesmaxentries = gamesmaxentries;
    }

    public int getGamesminentries() {
        return this.gamesminentries;
    }

    public void setGamesminentries(int gamesminentries) {
        this.gamesminentries = gamesminentries;
    }

    public int getGamesmode() {
        return this.gamesmode;
    }

    public void setGamesmode(int gamesmode) {
        this.gamesmode = gamesmode;
    }

    public String getGamesname() {
        return this.gamesname;
    }

    public void setGamesname(String gamesname) {
        this.gamesname = gamesname;
    }

    public String getGamesnumberofraces() {
        return this.gamesnumberofraces;
    }

    public void setGamesnumberofraces(String gamesnumberofraces) {
        this.gamesnumberofraces = gamesnumberofraces;
    }

    public String getGamespaymenttype() {
        return this.gamespaymenttype;
    }

    public void setGamespaymenttype(String gamespaymenttype) {
        this.gamespaymenttype = gamespaymenttype;
    }

    public int getGamespointentryavailablepos() {
        return this.gamespointentryavailablepos;
    }

    public void setGamespointentryavailablepos(int gamespointentryavailablepos) {
        this.gamespointentryavailablepos = gamespointentryavailablepos;
    }

    public int getGamespointentryseatstatus() {
        return this.gamespointentryseatstatus;
    }

    public void setGamespointentryseatstatus(int gamespointentryseatstatus) {
        this.gamespointentryseatstatus = gamespointentryseatstatus;
    }

    public int getGamesprivacymode() {
        return this.gamesprivacymode;
    }

    public void setGamesprivacymode(int gamesprivacymode) {
        this.gamesprivacymode = gamesprivacymode;
    }

    public String getGamesprizeamount() {
        return this.gamesprizeamount;
    }

    public void setGamesprizeamount(String gamesprizeamount) {
        this.gamesprizeamount = gamesprizeamount;
    }

    public String getGamesprizedisplayforinfotab() {
        return this.gamesprizedisplayforinfotab;
    }

    public void setGamesprizedisplayforinfotab(String gamesprizedisplayforinfotab) {
        this.gamesprizedisplayforinfotab = gamesprizedisplayforinfotab;
    }

    public String getGamesprizedisplayforsite() {
        return this.gamesprizedisplayforsite;
    }

    public void setGamesprizedisplayforsite(String gamesprizedisplayforsite) {
        this.gamesprizedisplayforsite = gamesprizedisplayforsite;
    }

    public int getGamesprizedistributionid() {
        return this.gamesprizedistributionid;
    }

    public void setGamesprizedistributionid(int gamesprizedistributionid) {
        this.gamesprizedistributionid = gamesprizedistributionid;
    }

    public int getGamesprizedistributionusercreategame() {
        return this.gamesprizedistributionusercreategame;
    }

    public void setGamesprizedistributionusercreategame(int gamesprizedistributionusercreategame) {
        this.gamesprizedistributionusercreategame = gamesprizedistributionusercreategame;
    }

    public int getGamesprizetypeid() {
        return this.gamesprizetypeid;
    }

    public void setGamesprizetypeid(int gamesprizetypeid) {
        this.gamesprizetypeid = gamesprizetypeid;
    }

    public int getGamespurchaseentry() {
        return this.gamespurchaseentry;
    }

    public void setGamespurchaseentry(int gamespurchaseentry) {
        this.gamespurchaseentry = gamespurchaseentry;
    }

    public boolean getGamespurchaselifeline() {
        return this.gamespurchaselifeline;
    }

    public void setGamespurchaselifeline(boolean gamespurchaselifeline) {
        this.gamespurchaselifeline = gamespurchaselifeline;
    }

    public int getGamesrefundallusers() {
        return this.gamesrefundallusers;
    }

    public void setGamesrefundallusers(int gamesrefundallusers) {
        this.gamesrefundallusers = gamesrefundallusers;
    }

    public String getGamesrules() {
        return this.gamesrules;
    }

    public void setGamesrules(String gamesrules) {
        this.gamesrules = gamesrules;
    }

    public float getGamessalary() {
        return this.gamessalary;
    }

    public void setGamessalary(float gamessalary) {
        this.gamessalary = gamessalary;
    }

    public String getGamesshowintab() {
        return this.gamesshowintab;
    }

    public void setGamesshowintab(String gamesshowintab) {
        this.gamesshowintab = gamesshowintab;
    }

    public int getGamestakeout() {
        return this.gamestakeout;
    }

    public void setGamestakeout(int gamestakeout) {
        this.gamestakeout = gamestakeout;
    }

    public float getGamestakeoutpercentage() {
        return this.gamestakeoutpercentage;
    }

    public void setGamestakeoutpercentage(float gamestakeoutpercentage) {
        this.gamestakeoutpercentage = gamestakeoutpercentage;
    }

    public float getGamestakeoutvalue() {
        return this.gamestakeoutvalue;
    }

    public void setGamestakeoutvalue(float gamestakeoutvalue) {
        this.gamestakeoutvalue = gamestakeoutvalue;
    }

    public int getGamestwitterfeedeviewstatus() {
        return this.gamestwitterfeedeviewstatus;
    }

    public void setGamestwitterfeedeviewstatus(int gamestwitterfeedeviewstatus) {
        this.gamestwitterfeedeviewstatus = gamestwitterfeedeviewstatus;
    }

    public String getGamestypedescription() {
        return this.gamestypedescription;
    }

    public void setGamestypedescription(String gamestypedescription) {
        this.gamestypedescription = gamestypedescription;
    }

    public byte getGamestypeid() {
        return this.gamestypeid;
    }

    public void setGamestypeid(byte gamestypeid) {
        this.gamestypeid = gamestypeid;
    }

    public String getGamestypeimage() {
        return this.gamestypeimage;
    }

    public void setGamestypeimage(String gamestypeimage) {
        this.gamestypeimage = gamestypeimage;
    }

    public String getGamesusermaxentries() {
        return this.gamesusermaxentries;
    }

    public void setGamesusermaxentries(String gamesusermaxentries) {
        this.gamesusermaxentries = gamesusermaxentries;
    }

    public boolean getGameswinnercalculationstatus() {
        return this.gameswinnercalculationstatus;
    }

    public void setGameswinnercalculationstatus(boolean gameswinnercalculationstatus) {
        this.gameswinnercalculationstatus = gameswinnercalculationstatus;
    }

    public String getGameswinnerpayby() {
        return this.gameswinnerpayby;
    }

    public void setGameswinnerpayby(String gameswinnerpayby) {
        this.gameswinnerpayby = gameswinnerpayby;
    }

    public boolean getGameswinnerstatus() {
        return this.gameswinnerstatus;
    }

    public void setGameswinnerstatus(boolean gameswinnerstatus) {
        this.gameswinnerstatus = gameswinnerstatus;
    }

    public int getStatusid() {
        return this.statusid;
    }

    public void setStatusid(int statusid) {
        this.statusid = statusid;
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
        builder.append("Game [gamesid=").append(gamesid).append(", categoriesid=").append(categoriesid).append(", ");
        if (gamesastest != null) {
            builder.append("gamesastest=").append(gamesastest).append(", ");
        }
        builder.append("gamesautomaticallyover=").append(gamesautomaticallyover).append(", ");
        if (gamescategoriestypeid != null) {
            builder.append("gamescategoriestypeid=").append(gamescategoriestypeid).append(", ");
        }
        builder.append("gamescosttoplay=").append(gamescosttoplay).append(", gamescreationdate=").append(gamescreationdate)
        .append(", gamescreationmode=").append(gamescreationmode).append(", gamescsvpickreportstatus=").append(gamescsvpickreportstatus)
        .append(", gamescurrententries=").append(gamescurrententries).append(", gamescurrententrybypointseat=")
        .append(gamescurrententrybypointseat).append(", ");
        if (gamescustomprize != null) {
            builder.append("gamescustomprize=").append(gamescustomprize).append(", ");
        }
        builder.append("gamesdonationstatus=").append(gamesdonationstatus).append(", gamesentrypointfee=").append(gamesentrypointfee)
        .append(", gamesentrypointseatnumber=").append(gamesentrypointseatnumber).append(", gamesentrypointsforpointseat=")
        .append(gamesentrypointsforpointseat).append(", gamesfeetypeid=").append(gamesfeetypeid).append(", gamesisover=").append(gamesisover)
        .append(", gamesispartnergame=").append(gamesispartnergame).append(", gamesjoiningtimefreepoints=").append(gamesjoiningtimefreepoints)
        .append(", gameslockdowntime=").append(gameslockdowntime).append(", gamesmaxentries=").append(gamesmaxentries)
        .append(", gamesminentries=").append(gamesminentries).append(", gamesmode=").append(gamesmode).append(", ");
        if (gamesname != null) {
            builder.append("gamesname=").append(gamesname).append(", ");
        }
        if (gamesnumberofraces != null) {
            builder.append("gamesnumberofraces=").append(gamesnumberofraces).append(", ");
        }
        if (gamespaymenttype != null) {
            builder.append("gamespaymenttype=").append(gamespaymenttype).append(", ");
        }
        builder.append("gamespointentryavailablepos=").append(gamespointentryavailablepos).append(", gamespointentryseatstatus=")
        .append(gamespointentryseatstatus).append(", gamesprivacymode=").append(gamesprivacymode).append(", ");
        if (gamesprizeamount != null) {
            builder.append("gamesprizeamount=").append(gamesprizeamount).append(", ");
        }
        if (gamesprizedisplayforinfotab != null) {
            builder.append("gamesprizedisplayforinfotab=").append(gamesprizedisplayforinfotab).append(", ");
        }
        if (gamesprizedisplayforsite != null) {
            builder.append("gamesprizedisplayforsite=").append(gamesprizedisplayforsite).append(", ");
        }
        builder.append("gamesprizedistributionid=").append(gamesprizedistributionid).append(", gamesprizedistributionusercreategame=")
        .append(gamesprizedistributionusercreategame).append(", gamesprizetypeid=").append(gamesprizetypeid).append(", gamespurchaseentry=")
        .append(gamespurchaseentry).append(", gamespurchaselifeline=").append(gamespurchaselifeline).append(", gamesrefundallusers=")
        .append(gamesrefundallusers).append(", ");
        if (gamesrules != null) {
            builder.append("gamesrules=").append(gamesrules).append(", ");
        }
        builder.append("gamessalary=").append(gamessalary).append(", ");
        if (gamesshowintab != null) {
            builder.append("gamesshowintab=").append(gamesshowintab).append(", ");
        }
        builder.append("gamestakeout=").append(gamestakeout).append(", gamestakeoutpercentage=").append(gamestakeoutpercentage)
        .append(", gamestakeoutvalue=").append(gamestakeoutvalue).append(", gamestwitterfeedeviewstatus=").append(gamestwitterfeedeviewstatus)
        .append(", ");
        if (gamestypedescription != null) {
            builder.append("gamestypedescription=").append(gamestypedescription).append(", ");
        }
        builder.append("gamestypeid=").append(gamestypeid).append(", ");
        if (gamestypeimage != null) {
            builder.append("gamestypeimage=").append(gamestypeimage).append(", ");
        }
        if (gamesusermaxentries != null) {
            builder.append("gamesusermaxentries=").append(gamesusermaxentries).append(", ");
        }
        builder.append("gameswinnercalculationstatus=").append(gameswinnercalculationstatus).append(", ");
        if (gameswinnerpayby != null) {
            builder.append("gameswinnerpayby=").append(gameswinnerpayby).append(", ");
        }
        builder.append("gameswinnerstatus=").append(gameswinnerstatus).append(", statusid=").append(statusid).append(", usersid=").append(usersid)
        .append("]");
        return builder.toString();
    }

}