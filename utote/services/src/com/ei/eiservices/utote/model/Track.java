package com.ei.eiservices.utote.model;

import java.io.Serializable;
import javax.persistence.*;

import com.ei.eiservices.utote.client.programservice.ProgramServiceStub.Event;

import java.util.List;


/**
 * The persistent class for the tracks database table.
 * 
 */
@Entity
@Table(name="tracks")
@NamedQueries({
	@NamedQuery(name="Track.findAll", query="SELECT t FROM Track t"),
	@NamedQuery(name="Track.findByCode", query="SELECT t from Track t where t.tracksuniquecode = :trackId")
})
public class Track implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="`tracksid`", insertable=true, updatable=false, unique=true, nullable=false)
	private int tracksid;

	private int countriesid;

	@Column(length=45)
	private String tracksname;

	@Column(length=45)
	private String tracksuniquecode;

	@Lob
	@Column(nullable=false)
	private String twittercode;

	//bi-directional many-to-one association to Race
//	@OneToMany(mappedBy="track")
	@Transient
	private List<Race> races = null;
	
	@Transient
	private Event event = null;

	public Track() {
	}

	public int getTracksid() {
		return this.tracksid;
	}

	public void setTracksid(int tracksid) {
		this.tracksid = tracksid;
	}

	public int getCountriesid() {
		return this.countriesid;
	}

	public void setCountriesid(int countriesid) {
		this.countriesid = countriesid;
	}

	public String getTracksname() {
		return this.tracksname;
	}

	public void setTracksname(String tracksname) {
		this.tracksname = tracksname;
	}

	public String getTracksuniquecode() {
		return this.tracksuniquecode;
	}

	public void setTracksuniquecode(String tracksuniquecode) {
		this.tracksuniquecode = tracksuniquecode;
	}

	public String getTwittercode() {
		return this.twittercode;
	}

	public void setTwittercode(String twittercode) {
		this.twittercode = twittercode;
	}

	public List<Race> getRaces() {
		return this.races;
	}

	public void setRaces(List<Race> races) {
		this.races = races;
	}

	public Race addRace(Race race) {
		getRaces().add(race);
		race.setTrack(this);

		return race;
	}

	public Race removeRace(Race race) {
		getRaces().remove(race);
		race.setTrack(null);

		return race;
	}

	/**
	 * @return the event
	 */
	public Event getEvent() {
		return event;
	}

	/**
	 * @param event the event to set
	 */
	public void setEvent(Event event) {
		this.event = event;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Track [tracksid=").append(tracksid).append(", countriesid=").append(countriesid).append(", ");
		if (tracksname != null)
			builder.append("tracksname=").append(tracksname).append(", ");
		if (tracksuniquecode != null)
			builder.append("tracksuniquecode=").append(tracksuniquecode).append(", ");
		if (twittercode != null)
			builder.append("twittercode=").append(twittercode).append(", ");
		if (races != null)
			builder.append("races=").append(races).append(", ");
		if (event != null)
			builder.append("event=").append(event);
		builder.append("]");
		return builder.toString();
	}


}