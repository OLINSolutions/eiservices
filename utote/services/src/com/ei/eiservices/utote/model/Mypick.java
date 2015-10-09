package com.ei.eiservices.utote.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ei.eiservices.utote.Configurator;


/**
 * The persistent class for the mypicks database table.
 *
 */
@Entity
@Table(name="mypicks")
@NamedQueries({
    @NamedQuery(name="MyPick.findAll", query="SELECT m FROM Mypick m"),
    @NamedQuery(name="MyPick.findByHorseAndRace", query="SELECT m FROM Mypick m WHERE (m.mypicksprimaryhorsesid = :horsesid) AND (m.racesid = :racesid)"),
    @NamedQuery(name="MyPick.findByAltHorseAndRace", query="SELECT m FROM Mypick m WHERE (m.mypicksalthorsesid = :horsesid) AND (m.racesid = :racesid)")
})
public class Mypick implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final Logger log4j = LogManager.getLogger(Mypick.class);

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`mypicksid`", insertable=true, updatable=false, unique=true, nullable=false)
    private int mypicksid = 0;

    @Column(nullable=false)
    private int mypicksalthorsesid = 0;

    @Column(nullable=false)
    private int mypicksgameracemapdate = 0;

    @Column(nullable=false)
    private boolean mypicksisresultcalculate = false;

    @Column(nullable=false)
    private float mypicksplaceamount = 0f;

    @Column(nullable=false)
    private int mypicksprimaryhorsesid = 0;

    @Column(nullable=false)
    private float mypicksshowamount = 0f;

    @Column(nullable=false)
    private boolean mypicksstatus = false;

    @Column(nullable=false)
    private int mypickstime = 0;

    @Column(nullable=false)
    private float mypickswinamount = 0f;

    @Column(nullable=false)
    private int racesid = 0;

    @Column(nullable=false)
    private int usergamesid = 0;

    @Column(nullable=false)
    private int usersid = 0;

    @Transient
    private Usergame usergame = null;

    public Mypick() {
    }

    public Mypick(Mypick newPick) {

        super();

        this.mypicksalthorsesid = newPick.getMypicksalthorsesid();
        this.mypicksgameracemapdate = newPick.getMypicksgameracemapdate();
        this.mypicksisresultcalculate = newPick.getMypicksisresultcalculate();
        this.mypicksplaceamount = newPick.getMypicksplaceamount();
        this.mypicksprimaryhorsesid = newPick.getMypicksprimaryhorsesid();
        this.mypicksshowamount = newPick.getMypicksshowamount();
        this.mypicksstatus = newPick.getMypicksstatus();
        this.mypickstime = newPick.getMypickstime();
        this.mypickswinamount = newPick.getMypickswinamount();
        this.racesid = newPick.getRacesid();
        this.usergamesid = newPick.getUsergamesid();
        this.usersid = newPick.getUsersid();
        this.usergame = newPick.getUsergame();

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

    /**
     * @return the usergame
     */
    public Usergame getUsergame() {
        if (null == this.usergame) {
            // Get Entity Managers
            final EntityManagerFactory rtwEmF = Configurator.getRTWEMF();
            final EntityManager rtwEm = rtwEmF.createEntityManager();
            try {
                usergame = rtwEm.find(Usergame.class, this.usergamesid);
            } catch (Exception e) {
                log4j.error(
                        "MyPick.getUsergame - Exception attempting to find the Usergame with usergamesid={} for Mypick with mypicksid={}.\nException={}",
                        usergamesid, mypicksid, e.getMessage(), e);
            }
            if (rtwEm.isOpen()) {
                rtwEm.close();
            }
            if (rtwEmF.isOpen()) {
                rtwEmF.close();
            }
        }
        return usergame;
    }

    /**
     * @param usergames the usergame to set
     */
    public void setUsergames(Usergame usergame) {
        this.usergame = usergame;
    }

    public static Collection<Mypick> getMypicks(EntityManager em, int racesid, int horsesid) {
        assert(0 != racesid) : "Passed zero racesid to getMypicks";
        assert(0 != horsesid) : "Passed zero horses to getMypicks";
        Collection<Mypick> results = null;
        try {
            TypedQuery<Mypick> q = em.createNamedQuery("Mypick.findByHorseAndRace", Mypick.class);
            q.setParameter("racesid", racesid);
            q.setParameter("horsesid", horsesid);
            try {
                results = q.getResultList();
            } catch (javax.persistence.NoResultException e1) {
                log4j.debug(
                        "getMypicks - NoResultException running query for RTW Mypics with racesid={}, horsesid={}",
                        racesid, horsesid);
            } catch (Exception e2) {
                log4j.warn(
                        "getMypicks - Other exception preparing query for RTW primary MyPicks with racesid={}, horsesid={}.ExceptionMsg={}\nException={}",
                        racesid, horsesid, e2.getMessage(), e2);
            }
        } catch (Exception e3) {
            log4j.error(
                    "getMypicks - Exception preparing query for RTW Primary MyPicks with racesid={}, horsesid={}.ExceptionMsg={}\nException={}",
                    racesid, horsesid, e3.getMessage(), e3);
        }
        return results;
    }

    public static Collection<Mypick> getMyAltpicks(EntityManager em, int racesid, int horsesid) {
        assert(0 != racesid) : "Passed zero racesid to getMyAltpicks";
        assert(0 != horsesid) : "Passed zero horses to getMyAltpicks";
        Collection<Mypick> results = null;
        try {
            TypedQuery<Mypick> q = em.createNamedQuery("MyPick.findByAltHorseAndRace", Mypick.class);
            q.setParameter("racesid", racesid);
            q.setParameter("horsesid", horsesid);
            try {
                results = q.getResultList();
            } catch (javax.persistence.NoResultException e1) {
                log4j.debug(
                        "getMyAltpicks - NoResultException running query for RTW Alternate Mypics with racesid={}, horsesid={}",
                        racesid, horsesid);
            } catch (Exception e2) {
                log4j.warn(
                        "getMyAltpicks - Other exception preparing query for RTW Alternate MyPicks with racesid={}, horsesid={}.ExceptionMsg={}\nException={}",
                        racesid, horsesid, e2.getMessage(), e2);
            }
        } catch (Exception e3) {
            log4j.error(
                    "getMyAltpicks - Exception preparing query for RTW Alternate MyPicks with racesid={}, horsesid={}. ExceptionMsg={}\nException={}",
                    racesid, horsesid, e3.getMessage(), e3);
        }
        return results;
    }

    /**
     * @param usergame the usergame to set
     */
    public void setUsergame(Usergame usergame) {
        this.usergame = usergame;
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
        .append(", racesid=").append(racesid).append(", usergamesid=").append(usergamesid).append(", usersid=").append(usersid).append(", ");
        if (usergame != null) {
            builder.append("usergame=").append(usergame);
        }
        builder.append("]");
        return builder.toString();
    }


}