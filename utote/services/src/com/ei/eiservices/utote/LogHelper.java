package com.ei.eiservices.utote;

import java.math.BigDecimal;
import java.util.Calendar;

import org.apache.logging.log4j.Logger;

import com.ei.eiservices.utote.client.configurationservice.ConfigurationServiceStub;
import com.ei.eiservices.utote.client.programservice.ProgramServiceStub;
import com.ei.eiservices.utote.client.resultservice.ResultServiceStub;
import com.ei.eiservices.utote.client.totestatusservice.ToteStatusServiceStub;

public class LogHelper {

    public static void debugOut(Logger log4j, boolean dataExists, String prefix, ConfigurationServiceStub.Error err) {
        String msg = prefix + "Error (Number/Message/Params)(*): ";
        if (dataExists) {
            msg += (err.isNumberSpecified()?err.getNumber():"<Not Specified>") + "/";
            msg += (err.isMessageSpecified()?err.getMessage():"<Not Specified>") + "/";
            msg += (err.isParamsSpecified()?err.getParams().toString():"<Not Specified>");
        }
        log4j.debug(msg);
    }

    public static void debugOut(Logger log4j, boolean dataExists, String prefix, ToteStatusServiceStub.Error err) {
        String msg = prefix + "Error (Number/Message/Params)(*): ";
        if (dataExists) {
            msg += (err.isNumberSpecified()?err.getNumber():"<Not Specified>") + "/";
            msg += (err.isMessageSpecified()?err.getMessage():"<Not Specified>") + "/";
            msg += (err.isParamsSpecified()?err.getParams().toString():"<Not Specified>");
        }
        log4j.debug(msg);
    }

    public static void debugOut(Logger log4j, boolean dataExists, String prefix, ProgramServiceStub.Error err) {
        String msg = prefix + "Error (Number/Message/Params)(*): ";
        if (dataExists) {
            msg += (err.isNumberSpecified()?err.getNumber():"<Not Specified>") + "/";
            msg += (err.isMessageSpecified()?err.getMessage():"<Not Specified>") + "/";
            msg += (err.isParamsSpecified()?err.getParams().toString():"<Not Specified>");
        }
        log4j.debug(msg);
    }

    public static void debugOut(Logger log4j, boolean dataExists, String prefix, ResultServiceStub.Error err) {
        String msg = prefix + "Error (Number/Message/Params)(*): ";
        if (dataExists) {
            msg += (err.isNumberSpecified()?err.getNumber():"<Not Specified>") + "/";
            msg += (err.isMessageSpecified()?err.getMessage():"<Not Specified>") + "/";
            msg += (err.isParamsSpecified()?err.getParams().toString():"<Not Specified>");
        }
        log4j.debug(msg);
    }

    public static void debugOut(Logger log4j, String prefix, boolean exists, int value) {
        if (exists) {
            log4j.debug(prefix + value);
        } else {
            // log4j.debug("");
        }
    }

    public static void debugOut(Logger log4j, String prefix, boolean exists, String value) {
        if (exists) {
            log4j.debug(prefix + value);
        } else {
            // log4j.debug("");
        }
    }

    public static void debugOut(Logger log4j, String prefix, boolean exists, boolean value) {
        if (exists) {
            log4j.debug(prefix + (value?"true":"false"));
        } else {
            // log4j.debug("");
        }
    }

    public static void debugOut(Logger log4j, String prefix, boolean exists, BigDecimal value) {
        if (exists) {
            log4j.debug(prefix + value.toString());
        } else {
            // log4j.debug("");
        }
    }

    public static void debugOut(Logger log4j, String prefix, boolean exists, Calendar value) {
        if (exists) {
            log4j.debug(prefix + value.getTime().toString());
        } else {
            // log4j.debug("");
        }
    }

    public static void debugOut(Logger log4j, String prefix, boolean exists, ProgramServiceStub.CompressedList value) {
        if (exists) {
            log4j.debug(prefix + value.getCompressedList());
        } else {
            // log4j.debug("");
        }
    }

    public static void debugOut(Logger log4j, String prefix, boolean exists, ProgramServiceStub.ExchangeWagers value) {
        if (exists) {
            log4j.debug(prefix + value.getValue());
        } else {
            // log4j.debug("");
        }
    }

    public static void debugPool(Logger log4j, String prefix, ProgramServiceStub.Pool p) {
        log4j.debug(prefix + "===== Pool Start =====");
        debugOut(log4j, prefix + "Pool Id: ", true, p.getPoolId());
        debugOut(log4j, prefix + "Pool Number: ", true, p.getPoolNumber());
        debugOut(log4j, prefix + "Pool Name(*): ", p.isPoolNameSpecified(), p.getPoolName());
        debugOut(log4j, prefix + "Pool Races(*): ", p.isPoolRacesSpecified(), p.getPoolRaces());
        debugOut(log4j, prefix + "Race List(*): ", p.isRaceListSpecified(), p.getRaceList());
        debugOut(log4j, prefix + "Legs(*): ", p.isLegsSpecified(), p.getLegs());
        debugOut(log4j, prefix + "Unordered?(*): ", p.isUnorderedSpecified(), p.getUnordered());
        debugOut(log4j, prefix + "Combine(*): ", p.isCombineSpecified(), p.getCombine());
        debugOut(log4j, prefix + "Quick?(*): ", p.isQuickSpecified(), p.getQuick());
        debugOut(log4j, prefix + "String?(*): ", p.isStringSpecified(), p.getString());
        debugOut(log4j, prefix + "Straight?(*): ", p.isStraightSpecified(), p.getStraight());
        debugOut(log4j, prefix + "Wheel?(*): ", p.isWheelSpecified(), p.getWheel());
        debugOut(log4j, prefix + "Box?(*): ", p.isBoxSpecified(), p.getBox());
        debugOut(log4j, prefix + "Power Box?(*): ", p.isPowerBoxSpecified(), p.getPowerBox());
        debugOut(log4j, prefix + "Leading?(*): ", p.isLeadingSpecified(), p.getLeading());
        debugOut(log4j, prefix + "Multiple?(*): ", p.isMultipleSpecified(), p.getMultiple());
        debugOut(log4j, prefix + "Auto?(*): ", p.isAutoSpecified(), p.getAuto());
        debugOut(log4j, prefix + "Frational?(*): ", p.isFractionalSpecified(), p.getFractional());
        debugOut(log4j, prefix + "Segmented?(*): ", p.isSegmentedSpecified(), p.getSegmented());
        debugOut(log4j, prefix + "Key Box?(*): ", p.isKeyBoxSpecified(), p.getKeyBox());
        debugOut(log4j, prefix + "Key Wheel?(*): ", p.isKeyWheelSpecified(), p.getKeyWheel());
        debugOut(log4j, prefix + "Single Bet Minimum(*): ", p.isSingleBetMinimumSpecified(), p.getSingleBetMinimum());
        debugOut(log4j, prefix + "Multiple Bet Minimum(*): ", p.isMultipleBetMinimumSpecified(), p.getMultipleBetMinimum());
        debugOut(log4j, prefix + "Wager Minimum(*): ", p.isWagerMinimumSpecified(), p.getWagerMinimum());
        debugOut(log4j, prefix + "Maximum(*): ", p.isMaximumSpecified(), p.getMaximum());
        debugOut(log4j, prefix + "Fractional Minimum(*): ", p.isFractionalMinimumSpecified(), p.getFractionalMinimum());
        debugOut(log4j, prefix + "Wheel Based Maximum(*): ", p.isWBMaximumSpecified(), p.getWBMaximum());
        debugOut(log4j, prefix + "Parlay?(*): ", p.isParlaySpecified(), p.getParlay());
        debugOut(log4j, prefix + "Probables?(*): ", p.isProbablesSpecified(), p.getProbables());
        debugOut(log4j, prefix + "Exchange(*): ", p.isExchangeSpecified(), p.getExchange());
        log4j.debug(prefix + "===== Pool End =====");
    }

    public static void debugPools(Logger log4j, boolean dataExists, String prefix, ProgramServiceStub.Pools pools) {
        if (dataExists) {
            log4j.debug(prefix + "Pools(*): ");
            for (ProgramServiceStub.Pool p : pools.getPool()) {
                debugPool(log4j, prefix + "\t", p);
            }
        } else {
            log4j.debug(prefix + "Pools(*): <Not Specified>");
        }
    }

    public static void debugEntryChange(Logger log4j, String prefix, ProgramServiceStub.EntryChange ec) {
        log4j.debug(prefix + "===== Entry Change Start =====");
        debugOut(log4j, prefix + "Name Changed?(*): ", ec.isNameSpecified(), ec.getName());
        debugOut(log4j, prefix + "Position Changed?(*): ", ec.isPositionSpecified(), ec.getPosition());
        debugOut(log4j, prefix + "Weight Changed?(*): ", ec.isWeightSpecified(), ec.getWeight());
        debugOut(log4j, prefix + "Medication Changed?(*): ", ec.isMedicationSpecified(), ec.getMedication());
        debugOut(log4j, prefix + "Jockey Changed?(*): ", ec.isJockeySpecified(), ec.getJockey());
        debugOut(log4j, prefix + "Trainer Changed?(*): ", ec.isTrainerSpecified(), ec.getTrainer());
        debugOut(log4j, prefix + "Owner Changed?(*): ", ec.isOwnerSpecified(), ec.getOwner());
        debugOut(log4j, prefix + "Other Change?(*): ", ec.isOtherSpecified(), ec.getOther());
        log4j.debug(prefix + "===== Entry Change End =====");
    }

    public static void debugEntryChanges(Logger log4j, boolean dataExists, String prefix, ProgramServiceStub.EntryChanges ecs) {
        if (dataExists) {
            log4j.debug(prefix + "Entry Changes(*): ");
            for (ProgramServiceStub.EntryChange ec : ecs.getChange()) {
                debugEntryChange(log4j, prefix + "\t", ec);
            }
        } else {
            log4j.debug(prefix + "Entry Changes(*): <Not Specified>");
        }
    }

    public static void debugEntry(Logger log4j, String prefix, ProgramServiceStub.Entry en) {
        log4j.debug(prefix + "===== Entry Start =====");
        debugOut(log4j, prefix + "Entry ID(*): ", en.isEntryIdSpecified(), en.getEntryId());
        debugOut(log4j, prefix + "Name(*): ", en.isNameSpecified(), en.getName());
        debugOut(log4j, prefix + "Scratch?(*): ", en.isScratchSpecified(), en.getScratch());
        debugOut(log4j, prefix + "Jockey(*): ", en.isJockeySpecified(), en.getJockey());
        debugOut(log4j, prefix + "Weight(*): ", en.isWeightSpecified(), en.getWeight());
        debugOut(log4j, prefix + "Trainer(*): ", en.isTrainerSpecified(), en.getTrainer());
        debugOut(log4j, prefix + "Owner(*): ", en.isOwnerSpecified(), en.getOwner());
        debugOut(log4j, prefix + "Position(*): ", en.isPositionSpecified(), en.getPosition());
        debugOut(log4j, prefix + "Medication(*): ", en.isMedicationSpecified(), en.getMedication());
        debugEntryChanges(log4j, en.isEntryChangesSpecified(), prefix, en.getEntryChanges());
        log4j.debug(prefix + "===== Entry End =====");
    }

    public static void debugEntries(Logger log4j, boolean dataExists, String prefix, ProgramServiceStub.Entries entries) {
        if (dataExists) {
            log4j.debug(prefix + "Entries(*): ");
            for (ProgramServiceStub.Entry en : entries.getEntry()) {
                debugEntry(log4j, prefix + "\t", en);
            }
        } else {
            log4j.debug(prefix + "Entries(*): <Not Specified>");
        }
    }

    public static void debugRaceChange(Logger log4j, String prefix, ProgramServiceStub.RaceChange rc) {
        log4j.debug(prefix + "===== Race Changes Start =====");
        debugOut(log4j, prefix + "Race Type Changed?(*): ", rc.isRaceTypeSpecified(), rc.getRaceType());
        debugOut(log4j, prefix + "Distance Changed?(*): ", rc.isDistanceSpecified(), rc.getDistance());
        debugOut(log4j, prefix + "Sex Changed?(*): ", rc.isSexSpecified(), rc.getSex());
        debugOut(log4j, prefix + "Age Changed?(*): ", rc.isAgeSpecified(), rc.getAge());
        debugOut(log4j, prefix + "Purse Changed?(*): ", rc.isPurseSpecified(), rc.getPurse());
        debugOut(log4j, prefix + "Claim Changed?(*): ", rc.isClaimSpecified(), rc.getClaim());
        debugOut(log4j, prefix + "Breed Changed?(*): ", rc.isBreedSpecified(), rc.getBreed());
        debugOut(log4j, prefix + "Surface Changed?(*): ", rc.isSurfaceSpecified(), rc.getSurface());
        log4j.debug(prefix + "===== Race Changes End =====");
    }

    public static void debugRaceChanges(Logger log4j, boolean dataExists, String prefix, ProgramServiceStub.RaceChanges raceChanges) {
        if (dataExists) {
            log4j.debug(prefix + "Race Changes(*): ");
            for (ProgramServiceStub.RaceChange rc : raceChanges.getChange()) {
                debugRaceChange(log4j, prefix + "\t", rc);
            }
        } else {
            log4j.debug(prefix + "Race Changes(*): <Not Specified>");
        }
    }

    public static void debugRunner(Logger log4j, String prefix, ProgramServiceStub.Runner ru) {
        log4j.debug(prefix + "===== Runner Start =====");
        debugOut(log4j, prefix + "Runner Id: ", true, ru.getRunnerId());
        debugOut(log4j, prefix + "Scratch?(*): ", ru.isScratchSpecified(), ru.getScratch());
        debugOut(log4j, prefix + "Odds(*): ", ru.isOddsSpecified(), ru.getOdds());
        debugEntries(log4j, ru.isEntriesSpecified(), "\t\t\t\t", ru.getEntries());
        log4j.debug(prefix + "===== Runner End =====");
    }

    public static void debugRunners(Logger log4j, boolean dataExists, String prefix, ProgramServiceStub.Runners runners) {
        if (dataExists) {
            log4j.debug(prefix + "Runners(*): ");
            for (ProgramServiceStub.Runner ru : runners.getRunner()) {
                debugRunner(log4j, prefix + "\t", ru);
            }
        } else {
            log4j.debug(prefix + "Runners(*): <Not Specified>");
        }
    }

    public static void debugRace(Logger log4j, String prefix, ProgramServiceStub.Race r) {
        log4j.debug(prefix + "===== Race Start =====");
        debugOut(log4j, prefix + "Race Id: ", true, r.getRaceId());
        debugOut(log4j, prefix + "Race Status: ", true, r.getRaceStatus().toString());
        debugOut(log4j, prefix + "Track Type: ", true, r.getTrackType().getValue());
        debugOut(log4j, prefix + "Current?(*): ", r.isCurrentSpecified(), r.getCurrent());
        debugOut(log4j, prefix + "Post Time(*): ", r.isPostTimeSpecified(), r.getPostTime());
        debugOut(log4j, prefix + "Number Of Runners: ", true, r.getNumberOfRunners());
        debugOut(log4j, prefix + "Finish(*): ", r.isFinishSpecified(), r.getFinish());
        debugOut(log4j, prefix + "Program?(*): ", r.isProgramSpecified(), r.getProgram());
        debugOut(log4j, prefix + "Odds?(*): ", r.isOddsSpecified(), r.getOdds());
        debugPools(log4j, r.isPoolsSpecified(), "\t\t\t", r.getPools());
        debugRunners(log4j, r.isRunnersSpecified(), "\t\t\t", r.getRunners());
        debugRaceChanges(log4j, r.isRaceChangesSpecified(), "\t\t\t", r.getRaceChanges());
        debugOut(log4j, prefix + "Live: ", true, r.getLive());
        debugOut(log4j, prefix + "Pool List: ", true, r.getPoolList());
        debugOut(log4j, prefix + "Conditions(*): ", r.isConditionsSpecified(), r.getConditions());
        debugOut(log4j, prefix + "Race Type(*): ", r.isRaceTypeSpecified(), r.getRaceType());
        debugOut(log4j, prefix + "Surface(*): ", r.isSurfaceSpecified(), r.getSurface());
        debugOut(log4j, prefix + "Distance(*): ", r.isDistanceSpecified(), r.getDistance());
        debugOut(log4j, prefix + "Purse(*): ", r.isPurseSpecified(), r.getPurse());
        debugOut(log4j, prefix + "Sex(*): ", r.isSexSpecified(), r.getSex());
        debugOut(log4j, prefix + "Age(*): ", r.isAgeSpecified(), r.getAge());
        debugOut(log4j, prefix + "Claim(*): ", r.isClaimSpecified(), r.getClaim());
        log4j.debug(prefix + "===== Race End =====");
    }

    public static void debugRaces(Logger log4j, boolean dataExists, String prefix, ProgramServiceStub.Races races) {
        if (dataExists) {
            log4j.debug(prefix + "Races(*): ");
            for (ProgramServiceStub.Race r : races.getRace()) {
                debugRace(log4j, prefix + "\t", r);
            }
        } else {
            log4j.debug(prefix + "Races(*): <Not Specified>");
        }
    }

    public static void debugEvent(Logger log4j, String prefix, ProgramServiceStub.Event e) {
        log4j.debug(prefix + "===== Event Start =====");
        debugOut(log4j, prefix + "Event Id: ", true, e.getEventId());
        debugOut(log4j, prefix + "Run Id: ", true, e.getRunId());
        debugOut(log4j, prefix + "Event Name: ", true, e.getEventName());
        debugOut(log4j, prefix + "Track Id(*): ", e.isTrackIdSpecified(), e.getTrackId());
        debugOut(log4j, prefix + "Track Name(*): ", e.isTrackNameSpecified(), e.getTrackName());
        debugOut(log4j, prefix + "Track Condition(*): ", e.isTrackConditionSpecified(), e.getTrackCondition());
        debugOut(log4j, prefix + "Turf Track(*): ", e.isTurfTrackSpecified(), e.getTurfTrack());
        debugOut(log4j, prefix + "Event Time: ", true, e.getEventTime());
        debugOut(log4j, prefix + "Event Info(*): ", e.isEventInfoSpecified(), e.getEventInfo());
        debugOut(log4j, prefix + "Event Type: ", true, e.getEventType().getValue());
        debugOut(log4j, prefix + "Track Type: ", true, e.getTrackType().getValue());
        debugOut(log4j, prefix + "Event Class(*): ", e.isEventClassSpecified(), e.getEventClass());
        debugOut(log4j, prefix + "Currency Id: ", true, e.getCurrencyId());
        debugOut(log4j, prefix + "Parlay?(*): ", e.isParlaySpecified(), e.getParlay());
        debugOut(log4j, prefix + "BreakTo(*): ", e.isBreakToSpecified(), e.getBreakTo());
        debugOut(log4j, prefix + "Channel(*): ", e.isChannelSpecified(), e.getChannel());
        debugOut(log4j, prefix + "Event Status(*): ", e.isEventStatusSpecified(), e.getEventStatus());
        debugOut(log4j, prefix + "Race List: ", true, e.getRaceList());
        debugRaces(log4j, e.isRacesSpecified(), "\t\t", e.getRaces());
        log4j.debug(prefix + "===== Event End =====");
    }

    public static void debugEvents(Logger log4j, boolean dataExists, String prefix, ProgramServiceStub.Events events) {
        if (dataExists) {
            log4j.debug(prefix + "Events(*): ");
            for (ProgramServiceStub.Event e : events.getEvent()) {
                debugEvent(log4j, prefix + "\t", e);
            }
        } else {
            log4j.debug(prefix + "Events(*): <Not Specified>");
        }
    }

}
