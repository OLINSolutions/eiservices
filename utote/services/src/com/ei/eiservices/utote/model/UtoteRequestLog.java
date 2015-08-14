package com.ei.eiservices.utote.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utoteRequestLog database table.
 * 
 */
@Entity
@Table(name="utoteRequestLog")
@NamedQuery(name="UtoteRequestLog.findAll", query="SELECT u FROM UtoteRequestLog u")
public class UtoteRequestLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(insertable=true, updatable=false, unique=true, nullable=false)
	private int idUtoteRequestLog;

	@Column(length=3)
	private String contestId;

	@Column(length=3)
	private String eventId;

	@Column(nullable=false)
	private boolean pools = false;

	@Column(nullable=false)
	private boolean program = false;

	@Column(nullable=true)
	private int raceId = 0;

	@Column(nullable=false)
	private boolean races = false;

	@Lob
	@Column(nullable=false)
	private String requestElementType;

	@Column(nullable=false)
	private boolean runners = false;

	@Lob
	private String sourceId;

	@Lob
	private String systemId;

	@Column(length=3)
	private String tournamentId;

	public UtoteRequestLog() {
	}

	public int getIdUtoteRequestLog() {
		return this.idUtoteRequestLog;
	}

	public void setIdUtoteRequestLog(int idUtoteRequestLog) {
		this.idUtoteRequestLog = idUtoteRequestLog;
	}

	public String getContestId() {
		return this.contestId;
	}

	public void setContestId(String contestId) {
		this.contestId = contestId;
	}

	public String getEventId() {
		return this.eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public boolean getPools() {
		return this.pools;
	}

	public void setPools(boolean pools) {
		this.pools = pools;
	}

	public boolean getProgram() {
		return this.program;
	}

	public void setProgram(boolean program) {
		this.program = program;
	}

	public int getRaceId() {
		return this.raceId;
	}

	public void setRaceId(int raceId) {
		this.raceId = raceId;
	}

	public boolean getRaces() {
		return this.races;
	}

	public void setRaces(boolean races) {
		this.races = races;
	}

	public String getRequestElementType() {
		return this.requestElementType;
	}

	public void setRequestElementType(String requestElementType) {
		this.requestElementType = requestElementType;
	}

	public boolean getRunners() {
		return this.runners;
	}

	public void setRunners(boolean runners) {
		this.runners = runners;
	}

	public String getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSystemId() {
		return this.systemId;
	}

	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

	public String getTournamentId() {
		return this.tournamentId;
	}

	public void setTournamentId(String tournamentId) {
		this.tournamentId = tournamentId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UtoteRequestLog [idUtoteRequestLog=").append(idUtoteRequestLog).append(", ");
		if (contestId != null)
			builder.append("contestId=").append(contestId).append(", ");
		if (eventId != null)
			builder.append("eventId=").append(eventId).append(", ");
		builder.append("pools=").append(pools).append(", program=").append(program).append(", raceId=").append(raceId)
				.append(", races=").append(races).append(", ");
		if (requestElementType != null)
			builder.append("requestElementType=").append(requestElementType).append(", ");
		builder.append("runners=").append(runners).append(", ");
		if (sourceId != null)
			builder.append("sourceId=").append(sourceId).append(", ");
		if (systemId != null)
			builder.append("systemId=").append(systemId).append(", ");
		if (tournamentId != null)
			builder.append("tournamentId=").append(tournamentId);
		builder.append("]");
		return builder.toString();
	}

}