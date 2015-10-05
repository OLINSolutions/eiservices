package com.ei.eiservices.utote.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
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

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ei.eiservices.utote.Configurator;

/**
 * The persistent class for the utoteEntries database table.
 *
 */
@Entity
@Table(name="utoteEntries")
@NamedQueries({
    @NamedQuery(name="UtoteEntry.findAll", query="SELECT u FROM UtoteEntry u"),
    @NamedQuery(name="UtoteEntry.findByParent", query="SELECT e FROM UtoteEntry e WHERE e.idParent = :idParent")
})
public class UtoteEntry implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final Logger log4j = LogManager.getLogger(UtoteEntry.class);

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "`idUtoteEntry`", unique=true, nullable=false, insertable=true, updatable=false)
    private int idUtoteEntry = 0;

    @Column(name = "`idParent`", unique=true, nullable=false, insertable=true, updatable=true)
    private int idParent = 0;

    @Column(name = "`EntryId`", length=1)
    private String entryId = null;

    @Column(name = "`Jockey`", length=25)
    private String jockey = null;

    @Column(name = "`Medication`", length=255)
    private String medication = null;

    @Column(name = "`Name`", length=18)
    private String name = null;

    @Column(name = "`Owner`", length=50)
    private String owner = null;

    @Column(name = "`Position`", length=255)
    private String position = null;

    @Column(name = "`Scratch`")
    private boolean scratch = false;

    @Column(name = "`Trainer`", length=25)
    private String trainer = null;

    @Column(name = "`Weight`", length=25)
    private String weight = null;

    @Column(name = "`HasChanges`")
    private boolean hasChanges = false;

    @Column(name = "`RTWhorsesid`")
    private int RTWhorsesid = 0;

    @Embedded
    private UtoteEntryChange entryChange = null;

    /*
	@ManyToOne(optional = false, cascade = CascadeType.REFRESH)
	@JoinColumn(name = "`idParent`", referencedColumnName = "`idUtoteRunner`", insertable=false, updatable=false)
     */
    @Transient
    private UtoteRunner runner = null;

    @Transient
    private Horse RTWhorse = null;

    public UtoteEntry() {
    }

    /**
     * @return the idUtoteEntry
     */
    public int getIdUtoteEntry() {
        return idUtoteEntry;
    }

    /**
     * @param idUtoteEntry the idUtoteEntry to set
     */
    public void setIdUtoteEntry(int idUtoteEntry) {
        this.idUtoteEntry = idUtoteEntry;
    }

    /**
     * @return the idParent
     */
    public Integer getIdParent() {
        return idParent;
    }

    /**
     * @param idParent the idParent to set
     */
    public void setIdParent(Integer idParent) {
        this.idParent = idParent;
    }

    /**
     * @return the entryId
     */
    public String getEntryId() {
        return entryId;
    }

    /**
     * @param entryId the entryId to set
     */
    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    /**
     * @return the jockey
     */
    public String getJockey() {
        return jockey;
    }

    /**
     * @param jockey the jockey to set
     */
    public void setJockey(String jockey) {
        this.jockey = jockey;
    }

    /**
     * @return the medication
     */
    public String getMedication() {
        return medication;
    }

    /**
     * @param medication the medication to set
     */
    public void setMedication(String medication) {
        this.medication = medication;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the scratch
     */
    public boolean isScratch() {
        return scratch;
    }

    /**
     * @param scratch the scratch to set
     */
    public void setScratch(boolean scratch) {
        this.scratch = scratch;
    }

    /**
     * @return the trainer
     */
    public String getTrainer() {
        return trainer;
    }

    /**
     * @param trainer the trainer to set
     */
    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    /**
     * @return the weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * @return true if has an entryChange
     */
    public boolean hasChanges() {
        return hasChanges;
    }

    /**
     * @param hasChanges the hasChanges to set
     */
    public void setHasChanges(boolean hasChanges) {
        this.hasChanges = hasChanges;
    }

    /**
     * @return the entryChange
     */
    public UtoteEntryChange getEntryChange() {
        return entryChange;
    }

    /**
     * @param entryChange the entryChange to set
     */
    public void setEntryChange(UtoteEntryChange entryChange) {
        this.entryChange = entryChange;
    }

    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * @return the runner
     */
    public UtoteRunner getRunner() {
        return runner;
    }

    /**
     * @param runner the runner to set
     */
    public void setRunner(UtoteRunner runner) {
        this.runner = runner;
    }

    /**
     * @param idParent the idParent to set
     */
    public void setIdParent(int idParent) {
        this.idParent = idParent;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UtoteEntry [idUtoteEntry=").append(idUtoteEntry).append(", idParent=").append(idParent)
        .append(", ");
        if (entryId != null) {
            builder.append("entryId=").append(entryId).append(", ");
        }
        if (jockey != null) {
            builder.append("jockey=").append(jockey).append(", ");
        }
        if (medication != null) {
            builder.append("medication=").append(medication).append(", ");
        }
        if (name != null) {
            builder.append("name=").append(name).append(", ");
        }
        if (owner != null) {
            builder.append("owner=").append(owner).append(", ");
        }
        if (position != null) {
            builder.append("position=").append(position).append(", ");
        }
        builder.append("scratch=").append(scratch).append(", ");
        if (trainer != null) {
            builder.append("trainer=").append(trainer).append(", ");
        }
        if (weight != null) {
            builder.append("weight=").append(weight).append(", ");
        }
        builder.append("RTWhorsesid=").append(RTWhorsesid).append(", ");
        builder.append("hasChanges=").append(hasChanges).append(", ");
        if (entryChange != null) {
            builder.append("entryChange=").append(entryChange).append(", ");
        }
        if (runner != null) {
            builder.append("runner=").append(runner);
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * @return the rTWhorsesid
     */
    public int getRTWhorsesid() {
        return RTWhorsesid;
    }

    /**
     * @param RTWhorsesid the rTWhorsesid to set
     */
    public void setRTWhorsesid(int RTWhorsesid) {
        this.RTWhorsesid = RTWhorsesid;
    }

    public Horse RTWhorse() {
        if (null == this.RTWhorse) {
            loadRTWHorse();
        }
        return this.RTWhorse;
    }

    public Horse loadRTWHorse() {

        Horse h = null;

        // Get Entity Managers
        final EntityManagerFactory rtwEmF = Configurator.getRTWEMF();
        final EntityManager rtwEm = rtwEmF.createEntityManager();

        h = loadRTWHorse(rtwEm);

        rtwEm.close();
        rtwEmF.close();

        return h;
    }

    public Horse loadRTWHorse(EntityManager rtwEm) {

        Horse h = null;

        try {
            h = rtwEm.find(Horse.class, this.RTWhorsesid);
            this.RTWhorse = h;
        } catch (javax.persistence.NoResultException e) {
            log4j.debug(
                    "loadRTWHorse - NoResultException running query for RTW Horse with RTWhorsesid={}.\nException={}",
                    this.RTWhorsesid, e);
        } catch (Exception e2) {
            log4j.debug(
                    "loadRTWHorse - Unexpected Exception running query for RTW Horse with RTWhorsesid={}.\nException={}",
                    this.RTWhorsesid, e2);
        }

        // Was a corresponding RTW Horse object found
        if (null == h) {
            log4j.error("loadRTWHorse - Could not find RTW Horse row with horsesid={} for UtoteEntry={}", this.RTWhorsesid, this.toString());
        } else {
            this.RTWhorse = h;
        }

        return h;
    }



}