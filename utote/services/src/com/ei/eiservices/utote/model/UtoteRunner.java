package com.ei.eiservices.utote.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.TypedQuery;

import com.ei.eiservices.utote.client.programservice.ProgramServiceStub;


/**
 * The persistent class for the utoteRunners database table.
 *
 */
@Entity
@Table(name="utoteRunners")
@NamedQueries({
    @NamedQuery(name="UtoteRunner.findAll", query="SELECT r FROM UtoteRunner r"),
    @NamedQuery(name="UtoteRunner.findByParent", query="SELECT r FROM UtoteRunner r WHERE r.idParent = :idParent")
})
public class UtoteRunner implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`idUtoteRunner`", insertable=true, updatable=false, unique=true, nullable=false)
    private int idUtoteRunner = 0;

    @Column(nullable=false)
    private boolean hasEntries = false;

    @Column(name = "`idParent`", unique=true, nullable=false, insertable=true, updatable=true)
    private int idParent = 0;

    @Column(length=255)
    private String odds = null;

    @Column(nullable=false)
    private int runnerId = 0;

    @Column(name="`Scratch`")
    private boolean scratch = false;

    // @ManyToOne(optional = false, cascade = CascadeType.REFRESH)
    // @JoinColumn(name = "`idParent`", referencedColumnName = "`idUtoteRace`", insertable=true, updatable=true)
    @Transient
    private UtoteRace race = null;

    // @OneToMany(mappedBy="runner", cascade = CascadeType.PERSIST)
    @Transient
    private Collection<UtoteEntry> entries = null;

    public UtoteRunner() {
    }

    public UtoteRunner(ProgramServiceStub.Runner runner) {
        super();
        updateFromTote(runner);
    }

    public UtoteRunner(int idParent, ProgramServiceStub.Runner runner) {
        super();
        updateFromTote(idParent, runner);
    }

    public void updateFromTote(int idParent, ProgramServiceStub.Runner runner) {
        this.idParent = idParent;
        updateFromTote(runner);
    }

    public void updateFromTote(ProgramServiceStub.Runner runner) {
        this.setRunnerId(runner.getRunnerId());
        if (runner.isScratchSpecified()) {
            this.setScratch(runner.getScratch());
        }
        if (runner.isOddsSpecified()) {
            this.setOdds(runner.getOdds());
        }
        if (runner.isEntriesSpecified()) {
            this.setHasEntries(runner.getEntries().isEntrySpecified());
        }

    }

    public int getIdUtoteRunner() {
        return this.idUtoteRunner;
    }

    public void setIdUtoteRunner(int idUtoteRunners) {
        this.idUtoteRunner = idUtoteRunners;
    }

    public boolean getHasEntries() {
        return this.hasEntries;
    }

    public void setHasEntries(boolean hasEntries) {
        this.hasEntries = hasEntries;
    }

    public String getOdds() {
        return this.odds;
    }

    public float getOddsValue() {
        if (null != this.odds) {
            return Float.MAX_VALUE;
        } else {
            String[] oddParts = this.odds.split("/");
            if (oddParts.length == 1) {
                return Float.parseFloat(this.odds);
            } else {
                return Float.parseFloat(oddParts[0]) / Float.parseFloat(oddParts[1]);
            }
        }
    }

    public void setOdds(String odds) {
        this.odds = odds;
    }

    public int getRunnerId() {
        return this.runnerId;
    }

    public void setRunnerId(int runnerId) {
        this.runnerId = runnerId;
    }

    public boolean isScratched() {
        return this.scratch;
    }

    public void setScratch(boolean scratch) {
        this.scratch = scratch;
    }

    /**
     * @return the entryCollection
     */
    public Collection<UtoteEntry> getEntries() {
        return entries;
    }

    /**
     * @param entryCollection the entryCollection to set
     */
    public void setEntries(Collection<UtoteEntry> entries) {
        this.entries = entries;
    }

    /**
     * @return the race
     */
    public UtoteRace getRace() {
        return race;
    }

    /**
     * @param race the race to set
     */
    public void setRace(UtoteRace race) {
        this.race = race;
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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UtoteRunner [idUtoteRunner=").append(idUtoteRunner).append(", hasEntries=").append(hasEntries)
        .append(", idParent=").append(idParent).append(", ");
        if (odds != null) {
            builder.append("odds=").append(odds).append(", ");
        }
        builder.append("runnerId=").append(runnerId).append(", scratch=").append(scratch).append(", ");
        if (entries != null) {
            builder.append("entries=").append(entries);
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * Retrieve any Entries elements associated with this runner
     *
     * @param em The EntityManager to run against
     */
    public void load(EntityManager em, UtoteRace parent) {
        if (null != parent) {
            this.setRace(parent);
        }
        TypedQuery<UtoteEntry> eq = em.createNamedQuery("UtoteEntry.findByParent", UtoteEntry.class);
        eq.setParameter("idParent", this.idUtoteRunner);
        this.entries = eq.getResultList();
        if (null != this.entries) {
            for (UtoteEntry anEntry : this.entries) {
                anEntry.setRunner(this);
            }
        }
    }
    public void load(EntityManager em) {
        load(em, null);
    }

    /**
     * Clear any Entries elements associated with this runner
     *
     */
    public void clear() {
        if (null != this.entries) {
            for (UtoteEntry anEntry : this.entries) {
                anEntry.setRunner(null);
            }
            this.entries.clear();
            this.entries = null;
        }
    }

    /**
     * Detaches any Entries elements associated with this runner
     *
     * @param em The EntityManager to detach from
     */
    public void detachEntries(EntityManager em) {
        if (null != this.entries) {
            for (UtoteEntry anEntry : this.entries) {
                em.detach(anEntry);
            }
        }
    }

    /**
     * Detaches this race from the em
     *
     * @param em The EntityManager to detach from
     */
    public void detach(EntityManager em) {
        detachEntries(em);
        em.detach(this);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + (hasEntries ? 1231 : 1237);
        result = (prime * result) + ((odds == null) ? 0 : odds.hashCode());
        result = (prime * result) + runnerId;
        result = (prime * result) + (scratch ? 1231 : 1237);
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        UtoteRunner other = (UtoteRunner) obj;
        if (hasEntries != other.hasEntries) {
            return false;
        }
        if (odds == null) {
            if (other.odds != null) {
                return false;
            }
        } else if (!odds.equals(other.odds)) {
            return false;
        }
        if (runnerId != other.runnerId) {
            return false;
        }
        if (scratch != other.scratch) {
            return false;
        }
        return true;
    }

}