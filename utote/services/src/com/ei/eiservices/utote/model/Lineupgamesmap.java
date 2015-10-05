package com.ei.eiservices.utote.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the lineupgamesmap database table.
 * 
 */
@Entity
@Table(name="lineupgamesmap")
@NamedQuery(name="Lineupgamesmap.findAll", query="SELECT l FROM Lineupgamesmap l")
public class Lineupgamesmap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int lineupgamesmapid;

	@Column(nullable=false)
	private int gamesdateid;

	@Column(nullable=false)
	private int gamesid;

	@Column(nullable=false)
	private int lineupgamesmaptime;

	@Column(nullable=false)
	private int usergamesid;

	@Column(nullable=false)
	private int userslineupid;

	public Lineupgamesmap() {
	}

	public int getLineupgamesmapid() {
		return this.lineupgamesmapid;
	}

	public void setLineupgamesmapid(int lineupgamesmapid) {
		this.lineupgamesmapid = lineupgamesmapid;
	}

	public int getGamesdateid() {
		return this.gamesdateid;
	}

	public void setGamesdateid(int gamesdateid) {
		this.gamesdateid = gamesdateid;
	}

	public int getGamesid() {
		return this.gamesid;
	}

	public void setGamesid(int gamesid) {
		this.gamesid = gamesid;
	}

	public int getLineupgamesmaptime() {
		return this.lineupgamesmaptime;
	}

	public void setLineupgamesmaptime(int lineupgamesmaptime) {
		this.lineupgamesmaptime = lineupgamesmaptime;
	}

	public int getUsergamesid() {
		return this.usergamesid;
	}

	public void setUsergamesid(int usergamesid) {
		this.usergamesid = usergamesid;
	}

	public int getUserslineupid() {
		return this.userslineupid;
	}

	public void setUserslineupid(int userslineupid) {
		this.userslineupid = userslineupid;
	}

}