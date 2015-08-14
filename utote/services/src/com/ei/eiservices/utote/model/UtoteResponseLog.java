package com.ei.eiservices.utote.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utoteResponseLog database table.
 * 
 */
@Entity
@Table(name="utoteResponseLog")
@NamedQuery(name="UtoteResponseLog.findAll", query="SELECT u FROM UtoteResponseLog u")
public class UtoteResponseLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(insertable=true, updatable=false, unique=true, nullable=false)
	private int idUtoteResponseLog;

	private int idUtoteRequestLog;

	@Column(length=3)
	private String contestId;

	@Lob
	private String errorMessage;

	@Column(nullable=false)
	private int errorNumber;

	@Lob
	private String errorParameter1;

	@Lob
	private String errorParameter2;

	@Lob
	private String errorParameter3;

	@Lob
	private String errorParameter4;

	@Column(length=3,nullable=true)
	private String eventId;

	@Lob
	private String groupId;

	private boolean hasEvents = false;

	private int idUtoteResponse;

	@Column(nullable=false)
	private boolean isError = false;

	@Lob
	@Column(nullable=false)
	private String responseElementType;

	@Column(nullable=true)
	private int raceId;

	@Column(nullable=false)
	private int runId = 0;

	@Lob
	private String sourceId;

	@Lob
	private String systemId;

	@Column(length=3)
	private String tournamentId;

	public UtoteResponseLog() {
	}

	public String getContestId() {
		return this.contestId;
	}

	public void setContestId(String contestId) {
		this.contestId = contestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getErrorNumber() {
		return this.errorNumber;
	}

	public void setErrorNumber(int errorNumber) {
		this.errorNumber = errorNumber;
	}

	public String getErrorParameter1() {
		return this.errorParameter1;
	}

	public void setErrorParameter1(String errorParameter1) {
		this.errorParameter1 = errorParameter1;
	}

	public String getErrorParameter2() {
		return this.errorParameter2;
	}

	public void setErrorParameter2(String errorParameter2) {
		this.errorParameter2 = errorParameter2;
	}

	public String getErrorParameter3() {
		return this.errorParameter3;
	}

	public void setErrorParameter3(String errorParameter3) {
		this.errorParameter3 = errorParameter3;
	}

	public String getErrorParameter4() {
		return this.errorParameter4;
	}

	public void setErrorParameter4(String errorParameter4) {
		this.errorParameter4 = errorParameter4;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public boolean getHasEvents() {
		return this.hasEvents;
	}

	public void setHasEvents(boolean hasEvents) {
		this.hasEvents = hasEvents;
	}

	public int getIdUtoteResponse() {
		return this.idUtoteResponse;
	}

	public void setIdUtoteResponse(int idUtoteResponse) {
		this.idUtoteResponse = idUtoteResponse;
	}

	public int getIdUtoteRequestLog() {
		return this.idUtoteRequestLog;
	}

	public void setIdUtoteRequestLog(int idUtoteRequestLog) {
		this.idUtoteRequestLog = idUtoteRequestLog;
	}

	public boolean getIsError() {
		return this.isError;
	}

	public void setIsError(boolean isError) {
		this.isError = isError;
	}

	public String getResponseElementType() {
		return this.responseElementType;
	}

	public void setResponseElementType(String responseElementType) {
		this.responseElementType = responseElementType;
	}

	public int getRunId() {
		return this.runId;
	}

	public void setRunId(int runId) {
		this.runId = runId;
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

	/**
	 * @return the idUtoteResponseLog
	 */
	public int getIdUtoteResponseLog() {
		return idUtoteResponseLog;
	}

	/**
	 * @param idUtoteResponseLog the idUtoteResponseLog to set
	 */
	public void setIdUtoteResponseLog(int idUtoteResponseLog) {
		this.idUtoteResponseLog = idUtoteResponseLog;
	}

	/**
	 * @return the eventId
	 */
	public String getEventId() {
		return eventId;
	}

	/**
	 * @param eventId the eventId to set
	 */
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	/**
	 * @return the raceId
	 */
	public int getRaceId() {
		return raceId;
	}

	/**
	 * @param raceId the raceId to set
	 */
	public void setRaceId(int raceId) {
		this.raceId = raceId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UtoteResponseLog [idUtoteResponseLog=").append(idUtoteResponseLog)
				.append(", idUtoteRequestLog=").append(idUtoteRequestLog).append(", ");
		if (contestId != null)
			builder.append("contestId=").append(contestId).append(", ");
		if (errorMessage != null)
			builder.append("errorMessage=").append(errorMessage).append(", ");
		builder.append("errorNumber=").append(errorNumber).append(", ");
		if (errorParameter1 != null)
			builder.append("errorParameter1=").append(errorParameter1).append(", ");
		if (errorParameter2 != null)
			builder.append("errorParameter2=").append(errorParameter2).append(", ");
		if (errorParameter3 != null)
			builder.append("errorParameter3=").append(errorParameter3).append(", ");
		if (errorParameter4 != null)
			builder.append("errorParameter4=").append(errorParameter4).append(", ");
		if (eventId != null)
			builder.append("eventId=").append(eventId).append(", ");
		if (groupId != null)
			builder.append("groupId=").append(groupId).append(", ");
		builder.append("hasEvents=").append(hasEvents).append(", idUtoteResponse=").append(idUtoteResponse)
				.append(", isError=").append(isError).append(", ");
		if (responseElementType != null)
			builder.append("responseElementType=").append(responseElementType).append(", ");
		builder.append("raceId=").append(raceId).append(", runId=").append(runId).append(", ");
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