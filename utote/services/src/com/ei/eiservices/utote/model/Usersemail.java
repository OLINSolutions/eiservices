package com.ei.eiservices.utote.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.Table;

import com.ei.eiservices.utote.Configurator;


/**
 * The persistent class for the usersemail database table.
 *
 */
@Entity
@Table(name="usersemail")
@NamedQuery(name="Usersemail.findAll", query="SELECT u FROM Usersemail u")
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery( name="NotifyUserOfChange", procedureName="`NotifyUserOfChange`",
            parameters={ @StoredProcedureParameter(mode=ParameterMode.IN, name="pTracksId", type=Integer.class),
                    @StoredProcedureParameter(mode=ParameterMode.IN, name="pRacesDate", type=Integer.class),
                    @StoredProcedureParameter(mode=ParameterMode.IN, name="pRacesId", type=Integer.class),
                    @StoredProcedureParameter(mode=ParameterMode.IN, name="pRacesNo", type=Integer.class),
                    @StoredProcedureParameter(mode=ParameterMode.IN, name="pEmailMsg", type=String.class),
                    @StoredProcedureParameter(mode=ParameterMode.IN, name="pSmsMsg", type=String.class)
    })
})
public class Usersemail implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`usersemailid`", insertable=true, updatable=false, unique=true, nullable=false)
    private int usersemailid;

    @Column(nullable=false)
    private int gamesid;

    @Column(nullable=false)
    private int racesid;

    @Column(nullable=false, length=50)
    private String racesno;

    @Column(nullable=false)
    private int usersemaildate;

    @Lob
    @Column(nullable=false)
    private String usersemailmessage;

    @Lob
    @Column(nullable=false)
    private String usersemailsmscontain;

    @Column(nullable=false)
    private boolean usersemailstatus;

    @Column(nullable=false)
    private int usersid;

    @Column(nullable=false)
    private boolean userssmsstatus;

    public Usersemail() {
    }

    public Usersemail(int usersid, int racesid, String racesno, int gamesid, String usersemailmessage, String usersemailsmscontain,
            int usersemaildate) {
        super();
        this.usersid = usersid;
        this.racesid = racesid;
        this.racesno = racesno;
        this.gamesid = gamesid;
        this.usersemailmessage = usersemailmessage;
        this.usersemailsmscontain = usersemailsmscontain;
        this.usersemaildate = usersemaildate;
    }

    public int getUsersemailid() {
        return this.usersemailid;
    }

    public void setUsersemailid(int usersemailid) {
        this.usersemailid = usersemailid;
    }

    public int getGamesid() {
        return this.gamesid;
    }

    public void setGamesid(int gamesid) {
        this.gamesid = gamesid;
    }

    public int getRacesid() {
        return this.racesid;
    }

    public void setRacesid(int racesid) {
        this.racesid = racesid;
    }

    public String getRacesno() {
        return this.racesno;
    }

    public void setRacesno(String racesno) {
        this.racesno = racesno;
    }

    public int getUsersemaildate() {
        return this.usersemaildate;
    }

    public void setUsersemaildate(int usersemaildate) {
        this.usersemaildate = usersemaildate;
    }

    public String getUsersemailmessage() {
        return this.usersemailmessage;
    }

    public void setUsersemailmessage(String usersemailmessage) {
        this.usersemailmessage = usersemailmessage;
    }

    public String getUsersemailsmscontain() {
        return this.usersemailsmscontain;
    }

    public void setUsersemailsmscontain(String usersemailsmscontain) {
        this.usersemailsmscontain = usersemailsmscontain;
    }

    public boolean getUsersemailstatus() {
        return this.usersemailstatus;
    }

    public void setUsersemailstatus(boolean usersemailstatus) {
        this.usersemailstatus = usersemailstatus;
    }

    public int getUsersid() {
        return this.usersid;
    }

    public void setUsersid(int usersid) {
        this.usersid = usersid;
    }

    public boolean getUserssmsstatus() {
        return this.userssmsstatus;
    }

    public void setUserssmsstatus(boolean userssmsstatus) {
        this.userssmsstatus = userssmsstatus;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Usersemail [usersemailid=").append(usersemailid).append(", gamesid=").append(gamesid).append(", racesid=").append(racesid)
        .append(", ");
        if (racesno != null) {
            builder.append("racesno=").append(racesno).append(", ");
        }
        builder.append("usersemaildate=").append(usersemaildate).append(", ");
        if (usersemailmessage != null) {
            builder.append("usersemailmessage=").append(usersemailmessage).append(", ");
        }
        if (usersemailsmscontain != null) {
            builder.append("usersemailsmscontain=").append(usersemailsmscontain).append(", ");
        }
        builder.append("usersemailstatus=").append(usersemailstatus).append(", usersid=").append(usersid).append(", userssmsstatus=")
        .append(userssmsstatus).append("]");
        return builder.toString();
    }

    public static void notifyUsersOfChange(int tracksId, int racesid, int racesdate, int racesno, String emailMsg, String smsMsg) {
        // Get Entity Managers
        final EntityManagerFactory rtwEmF = Configurator.getRTWEMF();
        final EntityManager rtwEm = rtwEmF.createEntityManager();

        try {
            rtwEm.getTransaction().begin();
            StoredProcedureQuery q = rtwEm.createNamedStoredProcedureQuery("NotifyUserOfChange");
            q.setParameter("pTracksId", tracksId);
            q.setParameter("pRacesDate", racesdate);
            q.setParameter("pRacesId", racesid);
            q.setParameter("pRacesNo", racesno);
            q.setParameter("pEmailMsg", emailMsg);
            q.setParameter("pSmsMsg", smsMsg);
            q.execute();
            rtwEm.getTransaction().commit();
        } catch (Exception e) {
        }

        // Close down the persistence connections
        rtwEm.close();
        rtwEmF.close();

    }
}