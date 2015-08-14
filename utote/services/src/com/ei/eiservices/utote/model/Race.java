package com.ei.eiservices.utote.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
	
/**
 * The persistent class for the races database table.
 * 
 */
@Entity
@Table(name="races")
@NamedQueries({
	@NamedQuery(name="Race.findAll", query="SELECT r FROM Race r"),
	@NamedQuery(name="Race.findSpecific", query="SELECT r from Race r where r.tracksid = :idParent and r.racesdate = :raceDate and r.racesnumber = :raceNumber")
})
@NamedStoredProcedureQueries({ 
	@NamedStoredProcedureQuery( name="Race.updatePostTime", procedureName="`Race.UpdatePostTime`", 
	parameters={ @StoredProcedureParameter(mode=ParameterMode.IN, name="pRacesId", type=Integer.class), 
		         @StoredProcedureParameter(mode=ParameterMode.IN, name="pTzOffset", type=String.class),
			     @StoredProcedureParameter(mode=ParameterMode.IN, name="pNewPostTime", type=String.class)
	})
})
public class Race implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="`racesid`", insertable=true, updatable=false, unique=true, nullable=false)
	private int racesid = 0;

	@Column(nullable=true)
	private int coursetypesid = 0;

	@Column(nullable=false)
	private int distanceid = 0;

	@Column(nullable=true)
	private int racescreationtime = 0;

	@Column(nullable=false)
	private int racesdate = 0;

	@Column(nullable=false, length=100)
	private String racesdistance = null;

	@Column(nullable=true)
	private long racesendtime = 0;

	@Column(nullable=true)
	private long raceshorseselectionlocktime = 0;

	@Lob
	@Column(nullable=true)
	private String racesinformation = null;

	@Column(nullable=false)
	private boolean racesjdresultstatus = false;

	@Column(length=45)
	private String racesname = null;

	@Column(nullable=true)
	private int racesnumber = 0;

	@Column(nullable=false)
	private boolean racespickpercentagestatus = false;

	@Column(nullable=false, length=10)
	private String racesposttime = null;

	@Column(nullable=false)
	private boolean racesprocessresult = false;

	@Column(nullable=false, length=11)
	private String racespurseusa = null;

	@Column(nullable=false)
	private boolean racesresultstatus = false;

	private int racesstarttime = 0;

	@Column(length=45)
	private String racestag = null;

	@Column(nullable=false)
	private int racestypeid = 0;

	@Column(nullable=false, length=100)
	private String racesupdateddistance = null;

	@Column(nullable=false)
	private int racesupdateddistancetime = 0;

	@Lob
	@Column(nullable=false)
	private String racesupdatedtrackcondition = null;

	@Column(nullable=false)
	private int racesupdatedtrackconditiontime = 0;

	@Column(nullable=true)
	private int statusid = 0;

	@Column(nullable=true)
	private int surfaceid = 0;

	@Column(nullable=true)
	private int tracksid = 0;
	
	@Column(nullable=false)
	private int updatedcoursetypesid = 0;

	@Column(nullable=false)
	private int updatedcoursetypestime = 0;

	@Transient
	private Track track = null;
	
	@Transient
	private List<Horse> horses = null;

	public Race() {
	}

	public int getRacesid() {
		return this.racesid;
	}

	public void setRacesid(int racesid) {
		this.racesid = racesid;
	}

	public int getCoursetypesid() {
		return this.coursetypesid;
	}

	public void setCoursetypesid(int coursetypesid) {
		this.coursetypesid = coursetypesid;
	}

	public int getDistanceid() {
		return this.distanceid;
	}

	public void setDistanceid(int distanceid) {
		this.distanceid = distanceid;
	}

	public int getRacescreationtime() {
		return this.racescreationtime;
	}

	public void setRacescreationtime(int racescreationtime) {
		this.racescreationtime = racescreationtime;
	}

	public int getRacesdate() {
		return this.racesdate;
	}

	public void setRacesdate(int racesdate) {
		this.racesdate = racesdate;
	}

	public String getRacesdistance() {
		return this.racesdistance;
	}

	public void setRacesdistance(String racesdistance) {
		this.racesdistance = racesdistance;
	}

	public long getRacesendtime() {
		return this.racesendtime;
	}

	public void setRacesendtime(long racesendtime) {
		this.racesendtime = racesendtime;
	}

	public long getRaceshorseselectionlocktime() {
		return this.raceshorseselectionlocktime;
	}

	public void setRaceshorseselectionlocktime(long raceshorseselectionlocktime) {
		this.raceshorseselectionlocktime = raceshorseselectionlocktime;
	}

	public String getRacesinformation() {
		return this.racesinformation;
	}

	public void setRacesinformation(String racesinformation) {
		this.racesinformation = racesinformation;
	}

	public boolean getRacesjdresultstatus() {
		return this.racesjdresultstatus;
	}

	public void setRacesjdresultstatus(boolean racesjdresultstatus) {
		this.racesjdresultstatus = racesjdresultstatus;
	}

	public String getRacesname() {
		return this.racesname;
	}

	public void setRacesname(String racesname) {
		this.racesname = racesname;
	}

	public int getRacesnumber() {
		return this.racesnumber;
	}

	public void setRacesnumber(int racesnumber) {
		this.racesnumber = racesnumber;
	}

	public boolean getRacespickpercentagestatus() {
		return this.racespickpercentagestatus;
	}

	public void setRacespickpercentagestatus(boolean racespickpercentagestatus) {
		this.racespickpercentagestatus = racespickpercentagestatus;
	}

	public String getRacesposttime() {
		return this.racesposttime;
	}

	public void setRacesposttime(String racesposttime) {
		this.racesposttime = racesposttime;
	}

	public boolean getRacesprocessresult() {
		return this.racesprocessresult;
	}

	public void setRacesprocessresult(boolean racesprocessresult) {
		this.racesprocessresult = racesprocessresult;
	}

	public String getRacespurseusa() {
		return this.racespurseusa;
	}

	public void setRacespurseusa(String racespurseusa) {
		this.racespurseusa = racespurseusa;
	}

	public boolean getRacesresultstatus() {
		return this.racesresultstatus;
	}

	public void setRacesresultstatus(boolean racesresultstatus) {
		this.racesresultstatus = racesresultstatus;
	}

	public int getRacesstarttime() {
		return this.racesstarttime;
	}

	public void setRacesstarttime(int racesstarttime) {
		this.racesstarttime = racesstarttime;
	}

	public String getRacestag() {
		return this.racestag;
	}

	public void setRacestag(String racestag) {
		this.racestag = racestag;
	}

	public int getRacestypeid() {
		return this.racestypeid;
	}

	public void setRacestypeid(int racestypeid) {
		this.racestypeid = racestypeid;
	}

	public String getRacesupdateddistance() {
		return this.racesupdateddistance;
	}

	public void setRacesupdateddistance(String racesupdateddistance) {
		this.racesupdateddistance = racesupdateddistance;
	}

	public int getRacesupdateddistancetime() {
		return this.racesupdateddistancetime;
	}

	public void setRacesupdateddistancetime(int racesupdateddistancetime) {
		this.racesupdateddistancetime = racesupdateddistancetime;
	}

	public String getRacesupdatedtrackcondition() {
		return this.racesupdatedtrackcondition;
	}

	public void setRacesupdatedtrackcondition(String racesupdatedtrackcondition) {
		this.racesupdatedtrackcondition = racesupdatedtrackcondition;
	}

	public int getRacesupdatedtrackconditiontime() {
		return this.racesupdatedtrackconditiontime;
	}

	public void setRacesupdatedtrackconditiontime(int racesupdatedtrackconditiontime) {
		this.racesupdatedtrackconditiontime = racesupdatedtrackconditiontime;
	}

	public int getStatusid() {
		return this.statusid;
	}

	public void setStatusid(int statusid) {
		this.statusid = statusid;
	}

	public int getSurfaceid() {
		return this.surfaceid;
	}

	public void setSurfaceid(int surfaceid) {
		this.surfaceid = surfaceid;
	}

	public int getUpdatedcoursetypesid() {
		return this.updatedcoursetypesid;
	}

	public void setUpdatedcoursetypesid(int updatedcoursetypesid) {
		this.updatedcoursetypesid = updatedcoursetypesid;
	}

	public int getUpdatedcoursetypestime() {
		return this.updatedcoursetypestime;
	}

	public void setUpdatedcoursetypestime(int updatedcoursetypestime) {
		this.updatedcoursetypestime = updatedcoursetypestime;
	}

	public Track getTrack() {
		return this.track;
	}

	public void setTrack(Track track) {
		this.track = track;
	}

	/**
	 * @return the tracksid
	 */
	public int getTracksid() {
		return tracksid;
	}

	/**
	 * @param tracksid the tracksid to set
	 */
	public void setTracksid(int tracksid) {
		this.tracksid = tracksid;
	}

	/**
	 * @return the horses
	 */
	public List<Horse> getHorses() {
		return horses;
	}

	/**
	 * @param horses the horses to set
	 */
	public void setHorses(List<Horse> horses) {
		this.horses = horses;
	}

	public Horse addHorse(Horse horse) {
		getHorses().add(horse);
		horse.setRace(this);
		return horse;
	}

	public Horse removeHorse(Horse horse) {
		getHorses().remove(horse);
		horse.setRace(null);
		return horse;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Race [racesid=").append(racesid).append(", coursetypesid=").append(coursetypesid)
				.append(", distanceid=").append(distanceid).append(", racescreationtime=").append(racescreationtime)
				.append(", racesdate=").append(racesdate).append(", ");
		if (racesdistance != null)
			builder.append("racesdistance=").append(racesdistance).append(", ");
		builder.append("racesendtime=").append(racesendtime).append(", raceshorseselectionlocktime=")
				.append(raceshorseselectionlocktime).append(", ");
		if (racesinformation != null)
			builder.append("racesinformation=").append(racesinformation).append(", ");
		builder.append("racesjdresultstatus=").append(racesjdresultstatus).append(", ");
		if (racesname != null)
			builder.append("racesname=").append(racesname).append(", ");
		builder.append("racesnumber=").append(racesnumber).append(", racespickpercentagestatus=")
				.append(racespickpercentagestatus).append(", ");
		if (racesposttime != null)
			builder.append("racesposttime=").append(racesposttime).append(", ");
		builder.append("racesprocessresult=").append(racesprocessresult).append(", ");
		if (racespurseusa != null)
			builder.append("racespurseusa=").append(racespurseusa).append(", ");
		builder.append("racesresultstatus=").append(racesresultstatus).append(", racesstarttime=")
				.append(racesstarttime).append(", ");
		if (racestag != null)
			builder.append("racestag=").append(racestag).append(", ");
		builder.append("racestypeid=").append(racestypeid).append(", ");
		if (racesupdateddistance != null)
			builder.append("racesupdateddistance=").append(racesupdateddistance).append(", ");
		builder.append("racesupdateddistancetime=").append(racesupdateddistancetime).append(", ");
		if (racesupdatedtrackcondition != null)
			builder.append("racesupdatedtrackcondition=").append(racesupdatedtrackcondition).append(", ");
		builder.append("racesupdatedtrackconditiontime=").append(racesupdatedtrackconditiontime).append(", statusid=")
				.append(statusid).append(", surfaceid=").append(surfaceid).append(", tracksid=").append(tracksid)
				.append(", updatedcoursetypesid=").append(updatedcoursetypesid).append(", updatedcoursetypestime=")
				.append(updatedcoursetypestime).append(", ");
		if (track != null)
			builder.append("track=").append(track).append(", ");
		if (horses != null)
			builder.append("horses=").append(horses);
		builder.append("]");
		return builder.toString();
	}

}