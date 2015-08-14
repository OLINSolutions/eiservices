package com.ei.eiservices.utote.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the events database table.
 * 
 */
@Entity
@Table(name="events")
@NamedQueries({
	@NamedQuery(name="Event.findAll", query="SELECT e FROM Event e"),
	@NamedQuery(name="Event.findByCHRIMS", query="SELECT e FROM Event e where e.CHRIMSCode = :code"),
	@NamedQuery(name="Event.findByCHRIMS2", query="SELECT e FROM Event e where e.CHRIMS2Code = :code"),
})
public class Event implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="`idEvents`", insertable=true, updatable=false, unique=true, nullable=false)
	private int idEvents = 0;

	@Column(length=2)
	private String CHRIMS2Code = null;

	@Column(length=3)
	private String CHRIMSCode = null;

	@Column(nullable=false, length=2)
	private String country = null;

	@Column(length=10)
	private String EQBCode = null;

	@Column(length=10)
	private String EQBHCode = null;

	@Column(length=50)
	private String eventName = null;

	@Column(nullable=false)
	private boolean hasHarness = false;

	@Temporal(TemporalType.DATE)
	private Date inceptionDate = null;

	@Temporal(TemporalType.DATE)
	private Date retireDate = null;

	@Column(length=100)
	private String sourceCHRIMSEventCodes = null;

	@Column(nullable=false, length=2)
	private String state = null;

	@Column(length=40)
	private String timezone = null;

	@Column(length=40)
	private String timezoneName = null;

	@Column(length=10)
	private String TMHCode = null;

	@Column(length=2)
	private String TMHSelector = null;

	@Column(length=45)
	private String toteCo = null;

	@Column(nullable=false, length=50)
	private String trackName = null;

	private int tracksid = 0;

	@Column(length=10)
	private String USTAHCode = null;

	public Event() {
	}

	public int getIdEvents() {
		return this.idEvents;
	}

	public void setIdEvents(int idEvents) {
		this.idEvents = idEvents;
	}

	public String getCHRIMS2Code() {
		return this.CHRIMS2Code;
	}

	public void setCHRIMS2Code(String CHRIMS2Code) {
		this.CHRIMS2Code = CHRIMS2Code;
	}

	public String getCHRIMSCode() {
		return this.CHRIMSCode;
	}

	public void setCHRIMSCode(String CHRIMSCode) {
		this.CHRIMSCode = CHRIMSCode;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEQBCode() {
		return this.EQBCode;
	}

	public void setEQBCode(String EQBCode) {
		this.EQBCode = EQBCode;
	}

	public String getEQBHCode() {
		return this.EQBHCode;
	}

	public void setEQBHCode(String EQBHCode) {
		this.EQBHCode = EQBHCode;
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public boolean getHasHarness() {
		return this.hasHarness;
	}

	public void setHasHarness(boolean hasHarness) {
		this.hasHarness = hasHarness;
	}

	public Date getInceptionDate() {
		return this.inceptionDate;
	}

	public void setInceptionDate(Date inceptionDate) {
		this.inceptionDate = inceptionDate;
	}

	public Date getRetireDate() {
		return this.retireDate;
	}

	public void setRetireDate(Date retireDate) {
		this.retireDate = retireDate;
	}

	public String getSourceCHRIMSEventCodes() {
		return this.sourceCHRIMSEventCodes;
	}

	public void setSourceCHRIMSEventCodes(String sourceCHRIMSEventCodes) {
		this.sourceCHRIMSEventCodes = sourceCHRIMSEventCodes;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTimezone() {
		return this.timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getTimezoneName() {
		return this.timezoneName;
	}

	public void setTimezoneName(String timezoneName) {
		this.timezoneName = timezoneName;
	}

	public String getTMHCode() {
		return this.TMHCode;
	}

	public void setTMHCode(String TMHCode) {
		this.TMHCode = TMHCode;
	}

	public String getTMHSelector() {
		return this.TMHSelector;
	}

	public void setTMHSelector(String TMHSelector) {
		this.TMHSelector = TMHSelector;
	}

	public String getToteCo() {
		return this.toteCo;
	}

	public void setToteCo(String toteCo) {
		this.toteCo = toteCo;
	}

	public String getTrackName() {
		return this.trackName;
	}

	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}

	public int getTracksid() {
		return this.tracksid;
	}

	public void setTracksid(int tracksid) {
		this.tracksid = tracksid;
	}

	public String getUSTAHCode() {
		return this.USTAHCode;
	}

	public void setUSTAHCode(String USTAHCode) {
		this.USTAHCode = USTAHCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Event [idEvents=").append(idEvents).append(", ");
		if (CHRIMS2Code != null)
			builder.append("CHRIMS2Code=").append(CHRIMS2Code).append(", ");
		if (CHRIMSCode != null)
			builder.append("CHRIMSCode=").append(CHRIMSCode).append(", ");
		if (country != null)
			builder.append("country=").append(country).append(", ");
		if (EQBCode != null)
			builder.append("EQBCode=").append(EQBCode).append(", ");
		if (EQBHCode != null)
			builder.append("EQBHCode=").append(EQBHCode).append(", ");
		if (eventName != null)
			builder.append("eventName=").append(eventName).append(", ");
		builder.append("hasHarness=").append(hasHarness).append(", ");
		if (inceptionDate != null)
			builder.append("inceptionDate=").append(inceptionDate).append(", ");
		if (retireDate != null)
			builder.append("retireDate=").append(retireDate).append(", ");
		if (sourceCHRIMSEventCodes != null)
			builder.append("sourceCHRIMSEventCodes=").append(sourceCHRIMSEventCodes).append(", ");
		if (state != null)
			builder.append("state=").append(state).append(", ");
		if (timezone != null)
			builder.append("timezone=").append(timezone).append(", ");
		if (timezoneName != null)
			builder.append("timezoneName=").append(timezoneName).append(", ");
		if (TMHCode != null)
			builder.append("TMHCode=").append(TMHCode).append(", ");
		if (TMHSelector != null)
			builder.append("TMHSelector=").append(TMHSelector).append(", ");
		if (toteCo != null)
			builder.append("toteCo=").append(toteCo).append(", ");
		if (trackName != null)
			builder.append("trackName=").append(trackName).append(", ");
		builder.append("tracksid=").append(tracksid).append(", ");
		if (USTAHCode != null)
			builder.append("USTAHCode=").append(USTAHCode);
		builder.append("]");
		return builder.toString();
	}

}