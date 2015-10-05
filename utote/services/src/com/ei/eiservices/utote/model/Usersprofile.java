package com.ei.eiservices.utote.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the usersprofile database table.
 *
 */
@Entity
@Table(name="usersprofile")
@NamedQuery(name="Usersprofile.findAll", query="SELECT u FROM Usersprofile u")
public class Usersprofile implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`usersprofileid`", insertable=true, updatable=false, unique=true, nullable=false)
    private int usersprofileid;

    @Column(nullable=false)
    private int citiesid;

    @Column
    private int countriesid;

    @Column(nullable=false)
    private int statesid;

    @Column
    private int usersid;

    @Column(length=45)
    private String usersprofileaddress1;

    @Column(length=45)
    private String usersprofileaddress2;

    @Column(length=255)
    private String usersprofileavatar;

    @Column(length=45)
    private String usersprofiledob;

    @Column(length=45)
    private String usersprofilefirstname;

    @Column(length=45)
    private String usersprofilelastname;

    @Column(length=45)
    private String usersprofilemobile;

    @Column(length=45)
    private String usersprofilesex;

    @Column
    private int usersprofilezipcode;

    public Usersprofile() {
    }

    public int getUsersprofileid() {
        return this.usersprofileid;
    }

    public void setUsersprofileid(int usersprofileid) {
        this.usersprofileid = usersprofileid;
    }

    public int getCitiesid() {
        return this.citiesid;
    }

    public void setCitiesid(int citiesid) {
        this.citiesid = citiesid;
    }

    public int getCountriesid() {
        return this.countriesid;
    }

    public void setCountriesid(int countriesid) {
        this.countriesid = countriesid;
    }

    public int getStatesid() {
        return this.statesid;
    }

    public void setStatesid(int statesid) {
        this.statesid = statesid;
    }

    public int getUsersid() {
        return this.usersid;
    }

    public void setUsersid(int usersid) {
        this.usersid = usersid;
    }

    public String getUsersprofileaddress1() {
        return this.usersprofileaddress1;
    }

    public void setUsersprofileaddress1(String usersprofileaddress1) {
        this.usersprofileaddress1 = usersprofileaddress1;
    }

    public String getUsersprofileaddress2() {
        return this.usersprofileaddress2;
    }

    public void setUsersprofileaddress2(String usersprofileaddress2) {
        this.usersprofileaddress2 = usersprofileaddress2;
    }

    public String getUsersprofileavatar() {
        return this.usersprofileavatar;
    }

    public void setUsersprofileavatar(String usersprofileavatar) {
        this.usersprofileavatar = usersprofileavatar;
    }

    public String getUsersprofiledob() {
        return this.usersprofiledob;
    }

    public void setUsersprofiledob(String usersprofiledob) {
        this.usersprofiledob = usersprofiledob;
    }

    public String getUsersprofilefirstname() {
        return this.usersprofilefirstname;
    }

    public void setUsersprofilefirstname(String usersprofilefirstname) {
        this.usersprofilefirstname = usersprofilefirstname;
    }

    public String getUsersprofilelastname() {
        return this.usersprofilelastname;
    }

    public void setUsersprofilelastname(String usersprofilelastname) {
        this.usersprofilelastname = usersprofilelastname;
    }

    public String getUsersprofilemobile() {
        return this.usersprofilemobile;
    }

    public void setUsersprofilemobile(String usersprofilemobile) {
        this.usersprofilemobile = usersprofilemobile;
    }

    public String getUsersprofilesex() {
        return this.usersprofilesex;
    }

    public void setUsersprofilesex(String usersprofilesex) {
        this.usersprofilesex = usersprofilesex;
    }

    public int getUsersprofilezipcode() {
        return this.usersprofilezipcode;
    }

    public void setUsersprofilezipcode(int usersprofilezipcode) {
        this.usersprofilezipcode = usersprofilezipcode;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Usersprofile [usersprofileid=").append(usersprofileid).append(", citiesid=").append(citiesid).append(", countriesid=")
        .append(countriesid).append(", statesid=").append(statesid).append(", usersid=").append(usersid).append(", ");
        if (usersprofileaddress1 != null) {
            builder.append("usersprofileaddress1=").append(usersprofileaddress1).append(", ");
        }
        if (usersprofileaddress2 != null) {
            builder.append("usersprofileaddress2=").append(usersprofileaddress2).append(", ");
        }
        if (usersprofileavatar != null) {
            builder.append("usersprofileavatar=").append(usersprofileavatar).append(", ");
        }
        if (usersprofiledob != null) {
            builder.append("usersprofiledob=").append(usersprofiledob).append(", ");
        }
        if (usersprofilefirstname != null) {
            builder.append("usersprofilefirstname=").append(usersprofilefirstname).append(", ");
        }
        if (usersprofilelastname != null) {
            builder.append("usersprofilelastname=").append(usersprofilelastname).append(", ");
        }
        if (usersprofilemobile != null) {
            builder.append("usersprofilemobile=").append(usersprofilemobile).append(", ");
        }
        if (usersprofilesex != null) {
            builder.append("usersprofilesex=").append(usersprofilesex).append(", ");
        }
        builder.append("usersprofilezipcode=").append(usersprofilezipcode).append("]");
        return builder.toString();
    }

}