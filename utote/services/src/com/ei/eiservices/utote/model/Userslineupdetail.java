package com.ei.eiservices.utote.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the userslineupdetails database table.
 * 
 */
@Entity
@Table(name="userslineupdetails")
@NamedQuery(name="Userslineupdetail.findAll", query="SELECT u FROM Userslineupdetail u")
public class Userslineupdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int userslineupdetailsid;

	@Column(nullable=false)
	private int horsesid;

	@Column(nullable=false)
	private int jockeyid;

	@Column(nullable=false)
	private int racesid;

	@Column(nullable=false)
	private int usergamesid;

	@Column(nullable=false)
	private int userslineupdetailsgameracemapdate;

	@Column(nullable=false)
	private byte userslineupdetailsstatus;

	@Column(nullable=false)
	private int userslineupdetailstime;

	@Column(nullable=false)
	private int userslineupid;

	public Userslineupdetail() {
	}

	public int getUserslineupdetailsid() {
		return this.userslineupdetailsid;
	}

	public void setUserslineupdetailsid(int userslineupdetailsid) {
		this.userslineupdetailsid = userslineupdetailsid;
	}

	public int getHorsesid() {
		return this.horsesid;
	}

	public void setHorsesid(int horsesid) {
		this.horsesid = horsesid;
	}

	public int getJockeyid() {
		return this.jockeyid;
	}

	public void setJockeyid(int jockeyid) {
		this.jockeyid = jockeyid;
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

	public int getUserslineupdetailsgameracemapdate() {
		return this.userslineupdetailsgameracemapdate;
	}

	public void setUserslineupdetailsgameracemapdate(int userslineupdetailsgameracemapdate) {
		this.userslineupdetailsgameracemapdate = userslineupdetailsgameracemapdate;
	}

	public byte getUserslineupdetailsstatus() {
		return this.userslineupdetailsstatus;
	}

	public void setUserslineupdetailsstatus(byte userslineupdetailsstatus) {
		this.userslineupdetailsstatus = userslineupdetailsstatus;
	}

	public int getUserslineupdetailstime() {
		return this.userslineupdetailstime;
	}

	public void setUserslineupdetailstime(int userslineupdetailstime) {
		this.userslineupdetailstime = userslineupdetailstime;
	}

	public int getUserslineupid() {
		return this.userslineupid;
	}

	public void setUserslineupid(int userslineupid) {
		this.userslineupid = userslineupid;
	}

}