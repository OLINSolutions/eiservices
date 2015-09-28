package com.ei.eiservices.utote.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the jockeys database table.
 * 
 */
@Entity
@Table(name="jockeys")
@NamedQuery(name="Jockey.findAll", query="SELECT j FROM Jockey j")
public class Jockey implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int jockeysid;

	@Column(nullable=false)
	private byte isdriver;

	@Column(nullable=false)
	private int jockeyid;

	@Column(nullable=false, length=255)
	private String jockeyName;

	private int jockeysexternalpartyid;

	@Column(length=45)
	private String jockeysfirstname;

	@Column(length=45)
	private String jockeyslastname;

	@Column(length=45)
	private String jockeysmiddlename;

	@Column(length=45)
	private String jockeystypesource;

	public Jockey() {
	}

	public int getJockeysid() {
		return this.jockeysid;
	}

	public void setJockeysid(int jockeysid) {
		this.jockeysid = jockeysid;
	}

	public byte getIsdriver() {
		return this.isdriver;
	}

	public void setIsdriver(byte isdriver) {
		this.isdriver = isdriver;
	}

	public int getJockeyid() {
		return this.jockeyid;
	}

	public void setJockeyid(int jockeyid) {
		this.jockeyid = jockeyid;
	}

	public String getJockeyName() {
		return this.jockeyName;
	}

	public void setJockeyName(String jockeyName) {
		this.jockeyName = jockeyName;
	}

	public int getJockeysexternalpartyid() {
		return this.jockeysexternalpartyid;
	}

	public void setJockeysexternalpartyid(int jockeysexternalpartyid) {
		this.jockeysexternalpartyid = jockeysexternalpartyid;
	}

	public String getJockeysfirstname() {
		return this.jockeysfirstname;
	}

	public void setJockeysfirstname(String jockeysfirstname) {
		this.jockeysfirstname = jockeysfirstname;
	}

	public String getJockeyslastname() {
		return this.jockeyslastname;
	}

	public void setJockeyslastname(String jockeyslastname) {
		this.jockeyslastname = jockeyslastname;
	}

	public String getJockeysmiddlename() {
		return this.jockeysmiddlename;
	}

	public void setJockeysmiddlename(String jockeysmiddlename) {
		this.jockeysmiddlename = jockeysmiddlename;
	}

	public String getJockeystypesource() {
		return this.jockeystypesource;
	}

	public void setJockeystypesource(String jockeystypesource) {
		this.jockeystypesource = jockeystypesource;
	}

}