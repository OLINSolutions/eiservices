package com.ei.eiservices.utote.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the utoteUpdates database table.
 * 
 */
@Entity
@Table(name="utoteUpdates")
@NamedQuery(name="UtoteUpdate.findAll", query="SELECT u FROM UtoteUpdate u")
public class UtoteUpdate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="`idUtoteUpdate`",insertable=true, updatable=false, unique=true, nullable=false)
	private int idUtoteUpdate = 0;

	@Column(name="`Data`",length=20,nullable=true)
	private String data = null;

	@Lob
	@Column(name="`EventId`",nullable=true)
	private String eventId = null;

	@Column(name="`Group`",length=3,nullable=true)
	private String group = null;

	@Column(name="`MessageTime`",nullable=false)
	private Timestamp messageTime = null;

	@Column(name="`Post`",nullable=true)
	private boolean post = false;

	@Column(name="`RaceId`",nullable=true)
	private int raceId = 0;

	@Column(name="`RunId`",nullable=false)
	private int runId = 0;

	@Column(name="`Section`",length=20,nullable=true)
	private String section = null;

	@Lob
	@Column(name="`SiteId`",nullable=false)
	private String siteId = null;

	@Column(name="`Source`",length=6,nullable=true)
	private String source = null;

	@Lob
	@Column(name="`SourceIds`",nullable=true)
	private String sourceIds = null;

	@Column(name="`Track`",length=3,nullable=true)
	private String track = null;

	@Lob
	@Column(name="`TrackCode`",nullable=true)
	private String trackCode = null;

	@Column(name="`TransactionTime`",nullable=false)
	private Timestamp transactionTime = null;

	@Column(name="`Type`",nullable=false, length=10)
	private String type = null;

	public UtoteUpdate() {
	}

	public int getIdUtoteUpdate() {
		return this.idUtoteUpdate;
	}

	public void setIdUtoteUpdate(int idUtoteUpdate) {
		this.idUtoteUpdate = idUtoteUpdate;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getEventId() {
		return this.eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getGroup() {
		return this.group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public Timestamp getMessageTime() {
		return this.messageTime;
	}

	public void setMessageTime(Timestamp messageTime) {
		this.messageTime = messageTime;
	}

	public boolean getPost() {
		return this.post;
	}

	public void setPost(boolean post) {
		this.post = post;
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

	public String getSection() {
		return this.section;
	}

	public void setSection(String section) {
		this.section = section;
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

	public String getTrack() {
		return this.track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	public String getTrackCode() {
		return this.trackCode;
	}

	public void setTrackCode(String trackCode) {
		this.trackCode = trackCode;
	}

	public Timestamp getTransactionTime() {
		return this.transactionTime;
	}

	public void setTransactionTime(Timestamp transactionTime) {
		this.transactionTime = transactionTime;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UtoteUpdate [idUtoteUpdate=").append(idUtoteUpdate).append(", ");
		if (data != null)
			builder.append("data=").append(data).append(", ");
		if (eventId != null)
			builder.append("eventId=").append(eventId).append(", ");
		if (group != null)
			builder.append("group=").append(group).append(", ");
		if (messageTime != null)
			builder.append("messageTime=").append(messageTime).append(", ");
		builder.append("post=").append(post).append(", raceId=").append(raceId).append(", runId=").append(runId)
				.append(", ");
		if (section != null)
			builder.append("section=").append(section).append(", ");
		if (siteId != null)
			builder.append("siteId=").append(siteId).append(", ");
		if (source != null)
			builder.append("source=").append(source).append(", ");
		if (sourceIds != null)
			builder.append("sourceIds=").append(sourceIds).append(", ");
		if (track != null)
			builder.append("track=").append(track).append(", ");
		if (trackCode != null)
			builder.append("trackCode=").append(trackCode).append(", ");
		if (transactionTime != null)
			builder.append("transactionTime=").append(transactionTime).append(", ");
		if (type != null)
			builder.append("type=").append(type);
		builder.append("]");
		return builder.toString();
	}

}