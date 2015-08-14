package com.ei.eiservices.utote.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utoteEntryChanges database table.
 * 
 */
@Embeddable
public class UtoteEntryChange implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "`JockeyChanged`")
	private boolean jockeyChanged = false;

	@Column(name = "`MedicationChanged`")
	private boolean medicationChanged = false;

	@Column(name = "`NameChanged`")
	private boolean nameChanged = false;

	@Column(name = "`OtherChange`", length=20)
	private String otherChange = null;

	@Column(name = "`OwnerChanged`")
	private boolean ownerChanged = false;

	@Column(name = "`PositionChanged`")
	private boolean positionChanged = false;

	@Column(name = "`TrainerChanged`")
	private boolean trainerChanged = false;

	@Column(name = "`WeightChanged`")
	private boolean weightChanged = false;

	public UtoteEntryChange() {
	}

	/**
	 * @return the jockeyChanged
	 */
	public boolean isJockeyChanged() {
		return jockeyChanged;
	}

	/**
	 * @param jockeyChanged the jockeyChanged to set
	 */
	public void setJockeyChanged(boolean jockeyChanged) {
		this.jockeyChanged = jockeyChanged;
	}

	/**
	 * @return the medicationChanged
	 */
	public boolean isMedicationChanged() {
		return medicationChanged;
	}

	/**
	 * @param medicationChanged the medicationChanged to set
	 */
	public void setMedicationChanged(boolean medicationChanged) {
		this.medicationChanged = medicationChanged;
	}

	/**
	 * @return the nameChanged
	 */
	public boolean isNameChanged() {
		return nameChanged;
	}

	/**
	 * @param nameChanged the nameChanged to set
	 */
	public void setNameChanged(boolean nameChanged) {
		this.nameChanged = nameChanged;
	}

	/**
	 * @return the otherChange
	 */
	public String getOtherChange() {
		return otherChange;
	}

	/**
	 * @param otherChange the otherChange to set
	 */
	public void setOtherChange(String otherChange) {
		this.otherChange = otherChange;
	}

	/**
	 * @return the ownerChanged
	 */
	public boolean isOwnerChanged() {
		return ownerChanged;
	}

	/**
	 * @param ownerChanged the ownerChanged to set
	 */
	public void setOwnerChanged(boolean ownerChanged) {
		this.ownerChanged = ownerChanged;
	}

	/**
	 * @return the positionChanged
	 */
	public boolean isPositionChanged() {
		return positionChanged;
	}

	/**
	 * @param positionChanged the positionChanged to set
	 */
	public void setPositionChanged(boolean positionChanged) {
		this.positionChanged = positionChanged;
	}

	/**
	 * @return the trainerChanged
	 */
	public boolean isTrainerChanged() {
		return trainerChanged;
	}

	/**
	 * @param trainerChanged the trainerChanged to set
	 */
	public void setTrainerChanged(boolean trainerChanged) {
		this.trainerChanged = trainerChanged;
	}

	/**
	 * @return the weightChanged
	 */
	public boolean isWeightChanged() {
		return weightChanged;
	}

	/**
	 * @param weightChanged the weightChanged to set
	 */
	public void setWeightChanged(boolean weightChanged) {
		this.weightChanged = weightChanged;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UtoteEntryChange [jockeyChanged=").append(jockeyChanged).append(", medicationChanged=")
				.append(medicationChanged).append(", nameChanged=").append(nameChanged).append(", ");
		if (otherChange != null)
			builder.append("otherChange=").append(otherChange).append(", ");
		builder.append("ownerChanged=").append(ownerChanged).append(", positionChanged=").append(positionChanged)
				.append(", trainerChanged=").append(trainerChanged).append(", weightChanged=").append(weightChanged)
				.append("]");
		return builder.toString();
	}

}