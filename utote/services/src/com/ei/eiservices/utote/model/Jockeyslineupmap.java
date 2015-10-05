package com.ei.eiservices.utote.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the jockeyslineupmap database table.
 * 
 */
@Entity
@Table(name="jockeyslineupmap")
@NamedQuery(name="Jockeyslineupmap.findAll", query="SELECT j FROM Jockeyslineupmap j")
public class Jockeyslineupmap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int jockeyslineupmapid;

	@Column(name="gamesdatevalue_gmt", nullable=false)
	private int gamesdatevalueGmt;

	@Column(nullable=false)
	private int jockeyid;

	@Column(nullable=false)
	private int jockeyslineupmaptime;

	@Column(nullable=false)
	private int tracksid;

	@Column(nullable=false)
	private int userslineupid;

	public Jockeyslineupmap() {
	}

	public int getJockeyslineupmapid() {
		return this.jockeyslineupmapid;
	}

	public void setJockeyslineupmapid(int jockeyslineupmapid) {
		this.jockeyslineupmapid = jockeyslineupmapid;
	}

	public int getGamesdatevalueGmt() {
		return this.gamesdatevalueGmt;
	}

	public void setGamesdatevalueGmt(int gamesdatevalueGmt) {
		this.gamesdatevalueGmt = gamesdatevalueGmt;
	}

	public int getJockeyid() {
		return this.jockeyid;
	}

	public void setJockeyid(int jockeyid) {
		this.jockeyid = jockeyid;
	}

	public int getJockeyslineupmaptime() {
		return this.jockeyslineupmaptime;
	}

	public void setJockeyslineupmaptime(int jockeyslineupmaptime) {
		this.jockeyslineupmaptime = jockeyslineupmaptime;
	}

	public int getTracksid() {
		return this.tracksid;
	}

	public void setTracksid(int tracksid) {
		this.tracksid = tracksid;
	}

	public int getUserslineupid() {
		return this.userslineupid;
	}

	public void setUserslineupid(int userslineupid) {
		this.userslineupid = userslineupid;
	}

}