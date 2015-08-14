package com.ei.eiservices.utote.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the horses database table.
 * 
 */
@Entity
@Table(name="horses")
@NamedQueries({
	@NamedQuery(name="Horse.findAll", query="SELECT h FROM Horse h"),
	@NamedQuery(name="Horse.findByName", query="SELECT h from Horse h where h.horsesname = :horsesname"),
	@NamedQuery(name="Horse.findByRaceAndName", query="SELECT h from Horse h where h.racesid = :racesid and h.horsesname = :horsesname"),
	@NamedQuery(name="Horse.findByRaceAndProgramNumber", query="SELECT h from Horse h where h.racesid = :racesid and h.horsesprogramnumber = :horsesprogramnumber"),
	@NamedQuery(name="Horse.findByRaceAndPostPos", query="SELECT h from Horse h where h.racesid = :racesid and h.horsespostposition = :horsespostposition"),
	@NamedQuery(name="Horse.findByParent", query="SELECT h from Horse h where h.racesid = :idParent")
})
public class Horse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="`horsesid`", insertable=true, updatable=false, unique=true, nullable=false)
	private int horsesid;

	private int colorsid;

	@Column(length=45)
	private String horsesbirthyear;

	@Column(length=45)
	private String horsesbreedername;

	@Column(length=45)
	private String horsesbreedtype;

	@Column(nullable=false, length=11)
	private String horsescoupltypeindicator;

	@Column(nullable=false, length=11)
	private String horsescoupltypevalue;

	@Lob
	private String horsesfoalingarea;

	@Column(length=45)
	private String horsesfoalingdate;

	@Lob
	@Column(nullable=false)
	private String horsesjockeychangedescription;

	@Column(nullable=false)
	private int horsesjockeychangetime;

	@Column(length=45)
	private String horsesmedication;

	@Column(length=45)
	private String horsesname;

	private int horsesnumber;

	@Column(length=45)
	private String horsesodds;

	private int horsespostposition;

	@Column(nullable=false, length=11)
	private String horsesprogramnumber;

	@Column(length=45)
	private String horsesracetag;

	@Column(nullable=false, length=255)
	private String horsesscratchdescription;

	@Column(nullable=false)
	private long horsesscratchdescriptiontime;

	@Lob
	private String horsesscratchindicator;

	@Lob
	private String horsessex;

	@Lob
	@Column(nullable=false)
	private String horsestrainerchangedescription;

	@Column(nullable=false)
	private int horsestrainerchangetime;

	@Column(nullable=false)
	private int horsesupdatedscratchdescriptiontime;

	private int horsesweight;

	@Column(nullable=false)
	private int jockeyid;

	private int jockeysid;

	private int ownersid;

	private int racesid;

	private int trainersid;

	@Transient
	private Race race = null;
	
	public Horse() {
	}

	public int getHorsesid() {
		return this.horsesid;
	}

	public void setHorsesid(int horsesid) {
		this.horsesid = horsesid;
	}

	public int getColorsid() {
		return this.colorsid;
	}

	public void setColorsid(int colorsid) {
		this.colorsid = colorsid;
	}

	public String getHorsesbirthyear() {
		return this.horsesbirthyear;
	}

	public void setHorsesbirthyear(String horsesbirthyear) {
		this.horsesbirthyear = horsesbirthyear;
	}

	public String getHorsesbreedername() {
		return this.horsesbreedername;
	}

	public void setHorsesbreedername(String horsesbreedername) {
		this.horsesbreedername = horsesbreedername;
	}

	public String getHorsesbreedtype() {
		return this.horsesbreedtype;
	}

	public void setHorsesbreedtype(String horsesbreedtype) {
		this.horsesbreedtype = horsesbreedtype;
	}

	public String getHorsescoupltypeindicator() {
		return this.horsescoupltypeindicator;
	}

	public void setHorsescoupltypeindicator(String horsescoupltypeindicator) {
		this.horsescoupltypeindicator = horsescoupltypeindicator;
	}

	public String getHorsescoupltypevalue() {
		return this.horsescoupltypevalue;
	}

	public void setHorsescoupltypevalue(String horsescoupltypevalue) {
		this.horsescoupltypevalue = horsescoupltypevalue;
	}

	public String getHorsesfoalingarea() {
		return this.horsesfoalingarea;
	}

	public void setHorsesfoalingarea(String horsesfoalingarea) {
		this.horsesfoalingarea = horsesfoalingarea;
	}

	public String getHorsesfoalingdate() {
		return this.horsesfoalingdate;
	}

	public void setHorsesfoalingdate(String horsesfoalingdate) {
		this.horsesfoalingdate = horsesfoalingdate;
	}

	public String getHorsesjockeychangedescription() {
		return this.horsesjockeychangedescription;
	}

	public void setHorsesjockeychangedescription(String horsesjockeychangedescription) {
		this.horsesjockeychangedescription = horsesjockeychangedescription;
	}

	public int getHorsesjockeychangetime() {
		return this.horsesjockeychangetime;
	}

	public void setHorsesjockeychangetime(int horsesjockeychangetime) {
		this.horsesjockeychangetime = horsesjockeychangetime;
	}

	public String getHorsesmedication() {
		return this.horsesmedication;
	}

	public void setHorsesmedication(String horsesmedication) {
		this.horsesmedication = horsesmedication;
	}

	public String getHorsesname() {
		return this.horsesname;
	}

	public void setHorsesname(String horsesname) {
		this.horsesname = horsesname;
	}

	public int getHorsesnumber() {
		return this.horsesnumber;
	}

	public void setHorsesnumber(int horsesnumber) {
		this.horsesnumber = horsesnumber;
	}

	public String getHorsesodds() {
		return this.horsesodds;
	}

	public void setHorsesodds(String horsesodds) {
		this.horsesodds = horsesodds;
	}

	public int getHorsespostposition() {
		return this.horsespostposition;
	}

	public void setHorsespostposition(int horsespostposition) {
		this.horsespostposition = horsespostposition;
	}

	public String getHorsesprogramnumber() {
		return this.horsesprogramnumber;
	}

	public void setHorsesprogramnumber(String horsesprogramnumber) {
		this.horsesprogramnumber = horsesprogramnumber;
	}

	public String getHorsesracetag() {
		return this.horsesracetag;
	}

	public void setHorsesracetag(String horsesracetag) {
		this.horsesracetag = horsesracetag;
	}

	public String getHorsesscratchdescription() {
		return this.horsesscratchdescription;
	}

	public void setHorsesscratchdescription(String horsesscratchdescription) {
		this.horsesscratchdescription = horsesscratchdescription;
	}

	public long getHorsesscratchdescriptiontime() {
		return this.horsesscratchdescriptiontime;
	}

	public void setHorsesscratchdescriptiontime(long horsesscratchdescriptiontime) {
		this.horsesscratchdescriptiontime = horsesscratchdescriptiontime;
	}

	public String getHorsesscratchindicator() {
		return this.horsesscratchindicator;
	}

	public void setHorsesscratchindicator(String horsesscratchindicator) {
		this.horsesscratchindicator = horsesscratchindicator;
	}

	public String getHorsessex() {
		return this.horsessex;
	}

	public void setHorsessex(String horsessex) {
		this.horsessex = horsessex;
	}

	public String getHorsestrainerchangedescription() {
		return this.horsestrainerchangedescription;
	}

	public void setHorsestrainerchangedescription(String horsestrainerchangedescription) {
		this.horsestrainerchangedescription = horsestrainerchangedescription;
	}

	public int getHorsestrainerchangetime() {
		return this.horsestrainerchangetime;
	}

	public void setHorsestrainerchangetime(int horsestrainerchangetime) {
		this.horsestrainerchangetime = horsestrainerchangetime;
	}

	public int getHorsesupdatedscratchdescriptiontime() {
		return this.horsesupdatedscratchdescriptiontime;
	}

	public void setHorsesupdatedscratchdescriptiontime(int horsesupdatedscratchdescriptiontime) {
		this.horsesupdatedscratchdescriptiontime = horsesupdatedscratchdescriptiontime;
	}

	public int getHorsesweight() {
		return this.horsesweight;
	}

	public void setHorsesweight(int horsesweight) {
		this.horsesweight = horsesweight;
	}

	public int getJockeyid() {
		return this.jockeyid;
	}

	public void setJockeyid(int jockeyid) {
		this.jockeyid = jockeyid;
	}

	public int getJockeysid() {
		return this.jockeysid;
	}

	public void setJockeysid(int jockeysid) {
		this.jockeysid = jockeysid;
	}

	public int getOwnersid() {
		return this.ownersid;
	}

	public void setOwnersid(int ownersid) {
		this.ownersid = ownersid;
	}

	public int getRacesid() {
		return this.racesid;
	}

	public void setRacesid(int racesid) {
		this.racesid = racesid;
	}

	public int getTrainersid() {
		return this.trainersid;
	}

	public void setTrainersid(int trainersid) {
		this.trainersid = trainersid;
	}

	/**
	 * @return the race
	 */
	public Race getRace() {
		return race;
	}

	/**
	 * @param race the race to set
	 */
	public void setRace(Race race) {
		this.race = race;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Horse [horsesid=").append(horsesid).append(", colorsid=").append(colorsid).append(", ");
		if (horsesbirthyear != null)
			builder.append("horsesbirthyear=").append(horsesbirthyear).append(", ");
		if (horsesbreedername != null)
			builder.append("horsesbreedername=").append(horsesbreedername).append(", ");
		if (horsesbreedtype != null)
			builder.append("horsesbreedtype=").append(horsesbreedtype).append(", ");
		if (horsescoupltypeindicator != null)
			builder.append("horsescoupltypeindicator=").append(horsescoupltypeindicator).append(", ");
		if (horsescoupltypevalue != null)
			builder.append("horsescoupltypevalue=").append(horsescoupltypevalue).append(", ");
		if (horsesfoalingarea != null)
			builder.append("horsesfoalingarea=").append(horsesfoalingarea).append(", ");
		if (horsesfoalingdate != null)
			builder.append("horsesfoalingdate=").append(horsesfoalingdate).append(", ");
		if (horsesjockeychangedescription != null)
			builder.append("horsesjockeychangedescription=").append(horsesjockeychangedescription).append(", ");
		builder.append("horsesjockeychangetime=").append(horsesjockeychangetime).append(", ");
		if (horsesmedication != null)
			builder.append("horsesmedication=").append(horsesmedication).append(", ");
		if (horsesname != null)
			builder.append("horsesname=").append(horsesname).append(", ");
		builder.append("horsesnumber=").append(horsesnumber).append(", ");
		if (horsesodds != null)
			builder.append("horsesodds=").append(horsesodds).append(", ");
		builder.append("horsespostposition=").append(horsespostposition).append(", ");
		if (horsesprogramnumber != null)
			builder.append("horsesprogramnumber=").append(horsesprogramnumber).append(", ");
		if (horsesracetag != null)
			builder.append("horsesracetag=").append(horsesracetag).append(", ");
		if (horsesscratchdescription != null)
			builder.append("horsesscratchdescription=").append(horsesscratchdescription).append(", ");
		builder.append("horsesscratchdescriptiontime=").append(horsesscratchdescriptiontime).append(", ");
		if (horsesscratchindicator != null)
			builder.append("horsesscratchindicator=").append(horsesscratchindicator).append(", ");
		if (horsessex != null)
			builder.append("horsessex=").append(horsessex).append(", ");
		if (horsestrainerchangedescription != null)
			builder.append("horsestrainerchangedescription=").append(horsestrainerchangedescription).append(", ");
		builder.append("horsestrainerchangetime=").append(horsestrainerchangetime)
				.append(", horsesupdatedscratchdescriptiontime=").append(horsesupdatedscratchdescriptiontime)
				.append(", horsesweight=").append(horsesweight).append(", jockeyid=").append(jockeyid)
				.append(", jockeysid=").append(jockeysid).append(", ownersid=").append(ownersid).append(", racesid=")
				.append(racesid).append(", trainersid=").append(trainersid).append(", ");
		if (race != null)
			builder.append("race=").append(race);
		builder.append("]");
		return builder.toString();
	}

}