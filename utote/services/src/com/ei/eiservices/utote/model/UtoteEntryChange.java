package com.ei.eiservices.utote.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.ei.eiservices.utote.client.programservice.ProgramServiceStub;


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

    @Transient
    private UtoteEntry parent = null;

    public UtoteEntryChange() {
    }

    public UtoteEntryChange(UtoteEntry aParent) {
        super();
        this.parent = aParent;
    }

    public UtoteEntryChange(UtoteEntryChange source) {
        super();
        this.jockeyChanged = source.jockeyChanged;
        this.medicationChanged = source.medicationChanged;
        this.nameChanged = source.nameChanged;
        this.otherChange = source.otherChange;
        this.ownerChanged = source.ownerChanged;
        this.positionChanged = source.positionChanged;
        this.trainerChanged = source.trainerChanged;
        this.weightChanged = source.weightChanged;
        this.parent = source.parent;
    }

    public UtoteEntryChange(UtoteEntry parent, ProgramServiceStub.EntryChange eC) {
        super();
        this.updateFromTote(parent, eC);
    }

    public void updateFromTote(UtoteEntry parent, ProgramServiceStub.EntryChange eC) {
        this.parent = parent;
        if (eC.isWeightSpecified()) {
            this.setWeightChanged(eC.isWeightSpecified());
        }
        if (eC.isTrainerSpecified()) {
            this.setTrainerChanged(eC.getTrainer());
        }
        if (eC.isPositionSpecified()) {
            this.setPositionChanged(eC.getPosition());
        }
        if (eC.isOwnerSpecified()) {
            this.setOwnerChanged(eC.getOwner());
        }
        if (eC.isOtherSpecified()) {
            this.setOtherChange(eC.getOther());
        }
        if (eC.isMedicationSpecified()) {
            this.setMedicationChanged(eC.getMedication());
        }
        if (eC.isJockeySpecified()) {
            this.setJockeyChanged(eC.getJockey());
        }
        if (eC.isNameSpecified()) {
            this.setNameChanged(eC.getName());
        }
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
        if (otherChange != null) {
            builder.append("otherChange=").append(otherChange).append(", ");
        }
        builder.append("ownerChanged=").append(ownerChanged).append(", positionChanged=").append(positionChanged)
        .append(", trainerChanged=").append(trainerChanged).append(", weightChanged=").append(weightChanged)
        .append("]");
        return builder.toString();
    }

    public boolean hasDifferences(UtoteEntryChange newEC) {
        boolean hasDifferences = (
                (!(this.isJockeyChanged() == newEC.isJockeyChanged()))
                || (!(this.isMedicationChanged() == newEC.isMedicationChanged()))
                || (!(this.isNameChanged() == newEC.isNameChanged()))
                || (!(this.isOwnerChanged() == newEC.isOwnerChanged()))
                || (!(this.isPositionChanged() == newEC.isPositionChanged()))
                || (!(this.isTrainerChanged() == newEC.isTrainerChanged()))
                || (!(this.isWeightChanged() == newEC.isWeightChanged()))
                );
        return hasDifferences;
    }

    /**
     * @return the parent
     */
    public UtoteEntry getParent() {
        return parent;
    }

    /**
     * @param parent the parent to set
     */
    public void setParent(UtoteEntry parent) {
        this.parent = parent;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + (jockeyChanged ? 1231 : 1237);
        result = (prime * result) + (medicationChanged ? 1231 : 1237);
        result = (prime * result) + (nameChanged ? 1231 : 1237);
        result = (prime * result) + ((otherChange == null) ? 0 : otherChange.hashCode());
        result = (prime * result) + (ownerChanged ? 1231 : 1237);
        result = (prime * result) + (positionChanged ? 1231 : 1237);
        result = (prime * result) + (trainerChanged ? 1231 : 1237);
        result = (prime * result) + (weightChanged ? 1231 : 1237);
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        UtoteEntryChange other = (UtoteEntryChange) obj;
        if (jockeyChanged != other.jockeyChanged) {
            return false;
        }
        if (medicationChanged != other.medicationChanged) {
            return false;
        }
        if (nameChanged != other.nameChanged) {
            return false;
        }
        if (otherChange == null) {
            if (other.otherChange != null) {
                return false;
            }
        } else if (!otherChange.equals(other.otherChange)) {
            return false;
        }
        if (ownerChanged != other.ownerChanged) {
            return false;
        }
        if (positionChanged != other.positionChanged) {
            return false;
        }
        if (trainerChanged != other.trainerChanged) {
            return false;
        }
        if (weightChanged != other.weightChanged) {
            return false;
        }
        return true;
    }


}