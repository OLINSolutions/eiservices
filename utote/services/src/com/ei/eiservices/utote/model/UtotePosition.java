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


/**
 * The persistent class for the utotePositions database table.
 *
 */
@Entity
@Table(name="utotePositions")
@NamedQueries({
    @NamedQuery(name="UtotePosition.findAll", query="SELECT r FROM UtotePosition r"),
    @NamedQuery(name="UtotePosition.findByParent", query="SELECT r FROM UtotePosition r WHERE r.idParent = :idParent")
})
public class UtotePosition implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`idUtotePosition`", insertable=true, updatable=false, unique=true, nullable=false)
    private int idUtotePosition = 0;

    @Column(name = "`idParent`", unique=true, nullable=false, insertable=true, updatable=true)
    private int idParent = 0;

    @Column(nullable=false)
    private int positionId = 0;

    // @ManyToOne(optional = false, cascade = CascadeType.REFRESH)
    // @JoinColumn(name = "`idParent`", referencedColumnName = "`idUtoteResult`", insertable=true, updatable=true)
    @Transient
    private UtoteResult result = null;

    // @OneToMany(mappedBy="finishers", cascade = CascadeType.PERSIST)
    @Transient
    private Collection<UtoteFinisher> finishers = null;

    public UtotePosition() {
    }


    public int getIdUtotePosition() {
        return this.idUtotePosition;
    }
    public void setIdUtotePosition(int idUtotePosition) {
        this.idUtotePosition = idUtotePosition;
    }


    public int getIdParent() {
        return this.idParent;
    }
    public void setIdParent(int idParent) {
        this.idParent = idParent;
    }


    public int getPositionId() {
        return this.positionId;
    }
    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }


    /**
     * @return the finisher Collection
     */
    public Collection<UtoteFinisher> getFinishers() {
        return finishers;
    }

    /**
     * @param finishers the finisher Collection to set
     */
    public void setFinishers(Collection<UtoteFinisher> finishers) {
        this.finishers = finishers;
    }

    /**
     * @return the Results
     */
    public UtoteResult getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(UtoteResult result) {
        this.result = result;
    }


    public String toString(boolean deep) {
        StringBuilder builder = new StringBuilder();
        builder.append("UtotePosition [idUtotePosition=").append(idUtotePosition).append(", idParent=").append(idParent).append(", positionId=")
        .append(positionId).append(", ");
        if (deep && (result != null)) {
            builder.append("result=").append(result).append(", ");
        }
        if (finishers != null) {
            builder.append("finishers=").append(finishers);
        }
        builder.append("]");
        return builder.toString();
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return toString(false);
    }

    /**
     * Retrieve any Finishers elements associated with this runner
     *
     * @param em The EntityManager to run against
     */
    public void load(EntityManager em, UtoteResult parent) {
        if (null != parent) {
            this.setResult(parent);
        }
        TypedQuery<UtoteFinisher> eq = em.createNamedQuery("UtoteFinisher.findByParent", UtoteFinisher.class);
        eq.setParameter("idParent", this.idUtotePosition);
        this.finishers = eq.getResultList();
        if (null != this.finishers) {
            for (UtoteFinisher aFinisher : this.finishers) {
                aFinisher.setPosition(this);
            }
        }
    }
    public void load(EntityManager em) {
        load(em, null);
    }

    /**
     * Clear any Finisher elements associated with this position
     *
     */
    public void clear() {
        if (null != this.finishers) {
            for (UtoteFinisher aFinisher : this.finishers) {
                aFinisher.setPosition(null);
            }
            this.finishers.clear();
            this.finishers = null;
        }
    }

    /**
     * Detaches any Finisher elements associated with this position
     *
     * @param em The EntityManager to detach from
     */
    public void detachEntries(EntityManager em) {
        if (null != this.finishers) {
            for (UtoteFinisher aFinisher : this.finishers) {
                em.detach(aFinisher);
            }
        }
    }

    /**
     * Detaches this Position from the em
     *
     * @param em The EntityManager to detach from
     */
    public void detach(EntityManager em) {
        detachEntries(em);
        em.detach(this);
    }

}