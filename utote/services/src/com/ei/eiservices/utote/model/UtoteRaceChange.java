package com.ei.eiservices.utote.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import com.ei.eiservices.utote.client.programservice.ProgramServiceStub;


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

    public UtoteRaceChange(UtoteRaceChange source) {
        super();
        this.ageChanged = source.ageChanged;
        this.breedChanged = source.breedChanged;
        this.claimChanged = source.claimChanged;
        this.distanceChanged = source.distanceChanged;
        this.purseChanged = source.purseChanged;
        this.raceTypeChanged = source.raceTypeChanged;
        this.sexChanged = source.sexChanged;
        this.surfaceChanged = source.surfaceChanged;
    }

    public UtoteRaceChange(ProgramServiceStub.RaceChange rChange) {
        super();
        this.updateFromTote(rChange);
    }

    public void updateFromTote(ProgramServiceStub.RaceChange rChange) {
        if (rChange.isRaceTypeSpecified()) {
            this.setRaceTypeChanged(rChange.getRaceType());
        }
        if (rChange.isDistanceSpecified()) {
            this.setDistanceChanged(rChange.getDistance());
        }
        if (rChange.isSexSpecified()) {
            this.setSexChanged(rChange.getSex());
        }
        if (rChange.isAgeSpecified()) {
            this.setAgeChanged(rChange.getAge());
        }
        if (rChange.isPurseSpecified()) {
            this.setPurseChanged(rChange.getPurse());
        }
        if (rChange.isClaimSpecified()) {
            this.setClaimChanged(rChange.getClaim());
        }
        if (rChange.isBreedSpecified()) {
            this.setBreedChanged(rChange.getBreed());
        }
        if (rChange.isSurfaceSpecified()) {
            this.setSurfaceChanged(rChange.getSurface());
        }
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

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + (ageChanged ? 1231 : 1237);
        result = (prime * result) + (breedChanged ? 1231 : 1237);
        result = (prime * result) + (claimChanged ? 1231 : 1237);
        result = (prime * result) + (distanceChanged ? 1231 : 1237);
        result = (prime * result) + (purseChanged ? 1231 : 1237);
        result = (prime * result) + (raceTypeChanged ? 1231 : 1237);
        result = (prime * result) + (sexChanged ? 1231 : 1237);
        result = (prime * result) + (surfaceChanged ? 1231 : 1237);
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
        UtoteRaceChange other = (UtoteRaceChange) obj;
        if (ageChanged != other.ageChanged) {
            return false;
        }
        if (breedChanged != other.breedChanged) {
            return false;
        }
        if (claimChanged != other.claimChanged) {
            return false;
        }
        if (distanceChanged != other.distanceChanged) {
            return false;
        }
        if (purseChanged != other.purseChanged) {
            return false;
        }
        if (raceTypeChanged != other.raceTypeChanged) {
            return false;
        }
        if (sexChanged != other.sexChanged) {
            return false;
        }
        if (surfaceChanged != other.surfaceChanged) {
            return false;
        }
        return true;
    }


}