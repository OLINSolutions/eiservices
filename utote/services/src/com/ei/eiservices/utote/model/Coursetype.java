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
 * The persistent class for the coursetypes database table.
 *
 */
@Entity
@Table(name="coursetypes")
@NamedQuery(name="Coursetype.findAll", query="SELECT c FROM Coursetype c")
public class Coursetype implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`coursetypesid`", insertable=true, updatable=false, unique=true, nullable=false)
    private int coursetypesid;

    @Column(length=100)
    private String coursetypesdescription;

    @Lob
    private String coursetypesvalue;

    public Coursetype() {
    }

    public int getCoursetypesid() {
        return this.coursetypesid;
    }

    public void setCoursetypesid(int coursetypesid) {
        this.coursetypesid = coursetypesid;
    }

    public String getCoursetypesdescription() {
        return this.coursetypesdescription;
    }

    public void setCoursetypesdescription(String coursetypesdescription) {
        this.coursetypesdescription = coursetypesdescription;
    }

    public String getCoursetypesvalue() {
        return this.coursetypesvalue;
    }

    public void setCoursetypesvalue(String coursetypesvalue) {
        this.coursetypesvalue = coursetypesvalue;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Coursetype [coursetypesid=").append(coursetypesid).append(", ");
        if (coursetypesdescription != null) {
            builder.append("coursetypesdescription=").append(coursetypesdescription).append(", ");
        }
        if (coursetypesvalue != null) {
            builder.append("coursetypesvalue=").append(coursetypesvalue);
        }
        builder.append("]");
        return builder.toString();
    }

}