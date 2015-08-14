package com.ei.eiservices.utote.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utoteRaceChanges database table.
 * 
 */
@Embeddable
public class UtoteRaceChange implements Serializable {
	private static final long serialVersionUID = 1L;

	private boolean ageChanged = false;

	private boolean breedChanged = false;

	private boolean claimChanged = false;

	private boolean distanceChanged = false;

	private boolean purseChanged = false;

	private boolean raceTypeChanged = false;

	private boolean sexChanged = false;

	private boolean surfaceChanged = false;

	public UtoteRaceChange() {
	}

	/**
	 * @return the ageChanged
	 */
	public boolean isAgeChanged() {
		return ageChanged;
	}

	/**
	 * @param ageChanged the ageChanged to set
	 */
	public void setAgeChanged(boolean ageChanged) {
		this.ageChanged = ageChanged;
	}

	/**
	 * @return the breedChanged
	 */
	public boolean isBreedChanged() {
		return breedChanged;
	}

	/**
	 * @param breedChanged the breedChanged to set
	 */
	public void setBreedChanged(boolean breedChanged) {
		this.breedChanged = breedChanged;
	}

	/**
	 * @return the claimChanged
	 */
	public boolean isClaimChanged() {
		return claimChanged;
	}

	/**
	 * @param claimChanged the claimChanged to set
	 */
	public void setClaimChanged(boolean claimChanged) {
		this.claimChanged = claimChanged;
	}

	/**
	 * @return the distanceChanged
	 */
	public boolean isDistanceChanged() {
		return distanceChanged;
	}

	/**
	 * @param distanceChanged the distanceChanged to set
	 */
	public void setDistanceChanged(boolean distanceChanged) {
		this.distanceChanged = distanceChanged;
	}

	/**
	 * @return the purseChanged
	 */
	public boolean isPurseChanged() {
		return purseChanged;
	}

	/**
	 * @param purseChanged the purseChanged to set
	 */
	public void setPurseChanged(boolean purseChanged) {
		this.purseChanged = purseChanged;
	}

	/**
	 * @return the raceTypeChanged
	 */
	public boolean isRaceTypeChanged() {
		return raceTypeChanged;
	}

	/**
	 * @param raceTypeChanged the raceTypeChanged to set
	 */
	public void setRaceTypeChanged(boolean raceTypeChanged) {
		this.raceTypeChanged = raceTypeChanged;
	}

	/**
	 * @return the sexChanged
	 */
	public boolean isSexChanged() {
		return sexChanged;
	}

	/**
	 * @param sexChanged the sexChanged to set
	 */
	public void setSexChanged(boolean sexChanged) {
		this.sexChanged = sexChanged;
	}

	/**
	 * @return the surfaceChanged
	 */
	public boolean isSurfaceChanged() {
		return surfaceChanged;
	}

	/**
	 * @param surfaceChanged the surfaceChanged to set
	 */
	public void setSurfaceChanged(boolean surfaceChanged) {
		this.surfaceChanged = surfaceChanged;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UtoteRaceChange [ageChanged=").append(ageChanged).append(", breedChanged=").append(breedChanged)
				.append(", claimChanged=").append(claimChanged).append(", distanceChanged=").append(distanceChanged)
				.append(", purseChanged=").append(purseChanged).append(", raceTypeChanged=").append(raceTypeChanged)
				.append(", sexChanged=").append(sexChanged).append(", surfaceChanged=").append(surfaceChanged)
				.append("]");
		return builder.toString();
	}


}