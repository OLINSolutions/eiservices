package com.ei.eiservices.utote.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the utoteStatusChanges database table.
 * 
 */
@Entity
@Table(name="utoteStatusChanges")
@NamedQuery(name="UtoteStatusChange.findAll", query="SELECT u FROM UtoteStatusChange u")
public class UtoteStatusChange implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="`idUtoteStatusChange`", insertable=true, updatable=false, unique=true, nullable=false)
	private int idUtoteStatusChange = 0;

	@Column(name="`Action`",nullable=false, length=10)
	private String action = null;

	@Lob
	@Column(name="`EventId`",nullable=true)
	private String eventId = null;

	@Column(name="`MessageTime`",nullable=false)
	private Timestamp messageTime = null;

	@Column(name="`MTP`",nullable=true)
	private BigInteger mtp = null;

	@Column(name="`RaceId`",nullable=true)
	private int raceId = 0;

	@Column(name="`RunId`",nullable=false)
	private int runId = 0;

	@Lob
	@Column(name="`SiteId`",nullable=false)
	private String siteId = null;

	@Lob
	@Column(name="`Source`",nullable=true)
	private String source = null;

	@Lob
	@Column(name="`SourceIds`",nullable=true)
	private String sourceIds = null;

	@Lob
	@Column(name="`Status`",nullable=true)
	private String status = null;

	@Column(name="`TransactionTime`",nullable=false)
	private Timestamp transactionTime = null;

	public UtoteStatusChange() {
	}

	public int getIdUtoteStatusChange() {
		return this.idUtoteStatusChange;
	}

	public void setIdUtoteStatusChange(int idUtoteStatusChange) {
		this.idUtoteStatusChange = idUtoteStatusChange;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getEventId() {
		return this.eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public Timestamp getMessageTime() {
		return this.messageTime;
	}

	public void setMessageTime(Timestamp messageTime) {
		this.messageTime = messageTime;
	}

	public BigInteger getMtp() {
		return this.mtp;
	}

	public void setMtp(BigInteger mtp) {
		this.mtp = mtp;
	}

	public int getRaceId() {
		return this.raceId;
	}

	public void setRaceId(int raceId) {
		this.raceId = raceId;
	}

	public int getRunId() {
		return this.runId;
	}

	public void setRunId(int runId) {
		this.runId = runId;
	}

	public String getSiteId() {
		return this.siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSourceIds() {
		return this.sourceIds;
	}

	public void setSourceIds(String sourceIds) {
		this.sourceIds = sourceIds;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getTransactionTime() {
		return this.transactionTime;
	}

	public void setTransactionTime(Timestamp transactionTime) {
		this.transactionTime = transactionTime;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UtoteStatusChange [idUtoteStatusChange=").append(idUtoteStatusChange).append(", ");
		if (action != null)
			builder.append("action=").append(action).append(", ");
		if (eventId != null)
			builder.append("eventId=").append(eventId).append(", ");
		if (messageTime != null)
			builder.append("messageTime=").append(messageTime).append(", ");
		if (mtp != null)
			builder.append("mtp=").append(mtp).append(", ");
		builder.append("raceId=").append(raceId).append(", runId=").append(runId).append(", ");
		if (siteId != null)
			builder.append("siteId=").append(siteId).append(", ");
		if (source != null)
			builder.append("source=").append(source).append(", ");
		if (sourceIds != null)
			builder.append("sourceIds=").append(sourceIds).append(", ");
		if (status != null)
			builder.append("status=").append(status).append(", ");
		if (transactionTime != null)
			builder.append("transactionTime=").append(transactionTime);
		builder.append("]");
		return builder.toString();
	}

}