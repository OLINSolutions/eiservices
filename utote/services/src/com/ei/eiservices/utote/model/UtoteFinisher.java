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
import javax.persistence.Transient;


/**
 * The persistent class for the utoteFinishers database table.
 *
 */
@Entity
@Table(name="utoteFinishers")
@NamedQueries({
    @NamedQuery(name="UtoteFinisher.findAll", query="SELECT f FROM UtoteFinisher f"),
    @NamedQuery(name="UtoteFinisher.findByParent", query="SELECT f FROM UtoteFinisher f WHERE f.idParent = :idParent")
})
public class UtoteFinisher implements Serializable {

    private static final long serialVersionUID = 1L;

    private int idUtoteFinisher = 0;
    private int idParent = 0;
    private int runnerId = 0;
    private String entryId = null;
    private String name = null;
    private String jockey = null;

    @Transient
    private UtotePosition position = null;

    public UtoteFinisher() {
    }


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`idUtoteFinisher`", insertable=true, updatable=false, unique=true, nullable=false)
    public int getIdUtoteFinisher() {
        return this.idUtoteFinisher;
    }
    public void setIdUtoteFinisher(int idUtoteFinisher) {
        this.idUtoteFinisher = idUtoteFinisher;
    }


    @Column(name = "`idParent`", unique=true, nullable=false, insertable=true, updatable=true)
    public int getIdParent() {
        return this.idParent;
    }
    public void setIdParent(int idParent) {
        this.idParent = idParent;
    }


    @Column(nullable=false)
    public int getRunnerId() {
        return this.runnerId;
    }
    public void setRunnerId(int runnerId) {
        this.runnerId = runnerId;
    }


    @Column(length=1)
    public String getEntryId() {
        return this.entryId;
    }
    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    @Column(length=25)
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(length=25)
    public String getJockey() {
        return this.jockey;
    }
    public void setJockey(String jockey) {
        this.jockey = jockey;
    }


    /**
     * @return the position
     */
    public UtotePosition getPosition() {
        return position;
    }
    /**
     * @param position the position to set
     */
    public void setPosition(UtotePosition position) {
        this.position = position;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UtoteFinisher [idUtoteFinisher=").append(idUtoteFinisher).append(", idParent=").append(idParent).append(", runnerId=")
        .append(runnerId).append(", ");
        if (entryId != null) {
            builder.append("entryId=").append(entryId).append(", ");
        }
        if (name != null) {
            builder.append("name=").append(name).append(", ");
        }
        if (jockey != null) {
            builder.append("jockey=").append(jockey).append(", ");
        }
        if (position != null) {
            builder.append("position=").append(position);
        }
        builder.append("]");
        return builder.toString();
    }

}