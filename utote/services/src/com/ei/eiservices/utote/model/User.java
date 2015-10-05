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
 * The persistent class for the users database table.
 *
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`usersid`", insertable=true, updatable=false, unique=true, nullable=false)
    private int usersid;

    @Column
    private int promotionpointamountid;

    @Column(nullable=false)
    private int siteurlid;

    @Column
    private int usersaccountcreationtime;

    @Column(nullable=false, length=1)
    private String usersastest;

    @Column(length=45)
    private String usersemail;

    @Column(length=45)
    private String usersembeddedcode;

    @Column(nullable=false, length=255)
    private String usersfromurl;

    @Column
    private boolean usersfundingoffer;

    @Column(length=45)
    private String userslanguagepreference;

    @Column(length=45)
    private String usersname;

    @Column(length=45)
    private String userspassword;

    @Column(length=45)
    private String userspasswordsalt;

    @Column(nullable=false)
    private byte usersreferralbonus;

    @Column(nullable=false)
    private byte usersresetpassword;

    @Column
    private byte usersstatus;

    @Column
    private byte userstype;

    @Column(nullable=false)
    private boolean wpAccessAllowed;

    @Column(nullable=false)
    private byte wpRole;

    public User() {
    }

    public int getUsersid() {
        return this.usersid;
    }

    public void setUsersid(int usersid) {
        this.usersid = usersid;
    }

    public int getPromotionpointamountid() {
        return this.promotionpointamountid;
    }

    public void setPromotionpointamountid(int promotionpointamountid) {
        this.promotionpointamountid = promotionpointamountid;
    }

    public int getSiteurlid() {
        return this.siteurlid;
    }

    public void setSiteurlid(int siteurlid) {
        this.siteurlid = siteurlid;
    }

    public int getUsersaccountcreationtime() {
        return this.usersaccountcreationtime;
    }

    public void setUsersaccountcreationtime(int usersaccountcreationtime) {
        this.usersaccountcreationtime = usersaccountcreationtime;
    }

    public String getUsersastest() {
        return this.usersastest;
    }

    public void setUsersastest(String usersastest) {
        this.usersastest = usersastest;
    }

    public String getUsersemail() {
        return this.usersemail;
    }

    public void setUsersemail(String usersemail) {
        this.usersemail = usersemail;
    }

    public String getUsersembeddedcode() {
        return this.usersembeddedcode;
    }

    public void setUsersembeddedcode(String usersembeddedcode) {
        this.usersembeddedcode = usersembeddedcode;
    }

    public String getUsersfromurl() {
        return this.usersfromurl;
    }

    public void setUsersfromurl(String usersfromurl) {
        this.usersfromurl = usersfromurl;
    }

    public boolean getUsersfundingoffer() {
        return this.usersfundingoffer;
    }

    public void setUsersfundingoffer(boolean usersfundingoffer) {
        this.usersfundingoffer = usersfundingoffer;
    }

    public String getUserslanguagepreference() {
        return this.userslanguagepreference;
    }

    public void setUserslanguagepreference(String userslanguagepreference) {
        this.userslanguagepreference = userslanguagepreference;
    }

    public String getUsersname() {
        return this.usersname;
    }

    public void setUsersname(String usersname) {
        this.usersname = usersname;
    }

    public String getUserspassword() {
        return this.userspassword;
    }

    public void setUserspassword(String userspassword) {
        this.userspassword = userspassword;
    }

    public String getUserspasswordsalt() {
        return this.userspasswordsalt;
    }

    public void setUserspasswordsalt(String userspasswordsalt) {
        this.userspasswordsalt = userspasswordsalt;
    }

    public byte getUsersreferralbonus() {
        return this.usersreferralbonus;
    }

    public void setUsersreferralbonus(byte usersreferralbonus) {
        this.usersreferralbonus = usersreferralbonus;
    }

    public byte getUsersresetpassword() {
        return this.usersresetpassword;
    }

    public void setUsersresetpassword(byte usersresetpassword) {
        this.usersresetpassword = usersresetpassword;
    }

    public byte getUsersstatus() {
        return this.usersstatus;
    }

    public void setUsersstatus(byte usersstatus) {
        this.usersstatus = usersstatus;
    }

    public byte getUserstype() {
        return this.userstype;
    }

    public void setUserstype(byte userstype) {
        this.userstype = userstype;
    }

    public boolean getWpAccessAllowed() {
        return this.wpAccessAllowed;
    }

    public void setWpAccessAllowed(boolean wpAccessAllowed) {
        this.wpAccessAllowed = wpAccessAllowed;
    }

    public byte getWpRole() {
        return this.wpRole;
    }

    public void setWpRole(byte wpRole) {
        this.wpRole = wpRole;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("User [usersid=").append(usersid).append(", promotionpointamountid=").append(promotionpointamountid).append(", siteurlid=")
        .append(siteurlid).append(", usersaccountcreationtime=").append(usersaccountcreationtime).append(", ");
        if (usersastest != null) {
            builder.append("usersastest=").append(usersastest).append(", ");
        }
        if (usersemail != null) {
            builder.append("usersemail=").append(usersemail).append(", ");
        }
        if (usersembeddedcode != null) {
            builder.append("usersembeddedcode=").append(usersembeddedcode).append(", ");
        }
        if (usersfromurl != null) {
            builder.append("usersfromurl=").append(usersfromurl).append(", ");
        }
        builder.append("usersfundingoffer=").append(usersfundingoffer).append(", ");
        if (userslanguagepreference != null) {
            builder.append("userslanguagepreference=").append(userslanguagepreference).append(", ");
        }
        if (usersname != null) {
            builder.append("usersname=").append(usersname).append(", ");
        }
        if (userspassword != null) {
            builder.append("userspassword=").append(userspassword).append(", ");
        }
        if (userspasswordsalt != null) {
            builder.append("userspasswordsalt=").append(userspasswordsalt).append(", ");
        }
        builder.append("usersreferralbonus=").append(usersreferralbonus).append(", usersresetpassword=").append(usersresetpassword)
        .append(", usersstatus=").append(usersstatus).append(", userstype=").append(userstype).append(", wpAccessAllowed=")
        .append(wpAccessAllowed).append(", wpRole=").append(wpRole).append("]");
        return builder.toString();
    }

}