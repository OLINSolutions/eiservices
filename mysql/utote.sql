-- MySQL Workbench Synchronization
-- Generated: 2015-07-31 18:38
-- Model: New Model
-- Version: 1.0
-- Project: Name of the project
-- Author: Jordan Olin

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteAccountContests` (
  `idUtoteAccountContest` INT(11) NOT NULL AUTO_INCREMENT,
  `Age` INT(11) NULL DEFAULT NULL COMMENT 'Optional minimum age permitted for account creation.\n',
  `Create` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Optional Boolean attribute indicating that tote allocated accounts may be created',
  `idUtoteRequired` INT(11) NULL DEFAULT NULL COMMENT 'Not null if has Optional element indicating required account fields for account creation, if any and account creation is permitted indicated by Create attribute.',
  `idUtoteRequiredEdit` INT(11) NULL DEFAULT NULL COMMENT 'Not null if has Optional element indicating account fields allowed to be changed, if any.',
  `idUtoteRequiredView` INT(11) NULL DEFAULT NULL COMMENT 'Not null if has Optional element indicating account fields allowed to be viewed, if any.',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteAccountContest`),
  INDEX `fk_utoteAccountContests_utoteRequired1_idx` (`idUtoteRequired` ASC),
  INDEX `fk_utoteAccountContests_utoteRequired2_idx` (`idUtoteRequiredEdit` ASC),
  INDEX `fk_utoteAccountContests_utoteRequired3_idx` (`idUtoteRequiredView` ASC),
  CONSTRAINT `fk_utoteAccountContests_utoteRequired1`
    FOREIGN KEY (`idUtoteRequired`)
    REFERENCES `racetrackwarriors`.`utoteRequired` (`idUtoteRequired`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_utoteAccountContests_utoteRequired2`
    FOREIGN KEY (`idUtoteRequiredEdit`)
    REFERENCES `racetrackwarriors`.`utoteRequired` (`idUtoteRequired`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_utoteAccountContests_utoteRequired3`
    FOREIGN KEY (`idUtoteRequiredView`)
    REFERENCES `racetrackwarriors`.`utoteRequired` (`idUtoteRequired`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteAdvertisements` (
  `idUtoteAdvertisement` INT(11) NOT NULL AUTO_INCREMENT,
  `Picture` VARCHAR(30) NULL DEFAULT NULL COMMENT 'Contains the name of a graphic to be displayed in the user interface. The client is responsible for locating and loading the actual image.\n',
  `Message` VARCHAR(50) NULL DEFAULT NULL COMMENT 'An advertising or announcement message to be displayed prominently in the user interface.',
  `Disclaimer` VARCHAR(50) NULL DEFAULT NULL COMMENT 'An announcement or disclaimer message to be displayed less prominently in the user interface.',
  `Text` VARCHAR(36) NULL DEFAULT NULL COMMENT 'Optional Advertisement text.',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteAdvertisement`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteChannels` (
  `idUtoteChannel` INT(11) NOT NULL AUTO_INCREMENT,
  `idUtoteConfiguration` INT(11) NOT NULL,
  `Number` TINYTEXT NOT NULL COMMENT 'Channel Number (Major number for digital channels)',
  `Minor` TINYTEXT NULL DEFAULT NULL COMMENT 'Optional Boolean attribute to indicate the channel Number and Minor are digital.',
  `Digital` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Optional Boolean attribute to indicate the channel Number and Minor are digital.',
  `Analog` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Optional Boolean attribute to indicate the channel Number is analog.',
  `Cable` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Optional Boolean attribute to indicate the source of the digital is from cable.',
  `Broadcast` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Optional Boolean attribute to indicate the source of the signal is from broadcast.',
  `Id` VARCHAR(4) NOT NULL,
  `Description` VARCHAR(40) NULL DEFAULT NULL,
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteChannel`),
  INDEX `fk_utoteChannel_utoteConfigurationResponses1_idx` (`idUtoteConfiguration` ASC),
  CONSTRAINT `fk_utoteChannels_utoteConfigurations`
    FOREIGN KEY (`idUtoteConfiguration`)
    REFERENCES `racetrackwarriors`.`utoteConfigurations` (`idUtoteConfiguration`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteConfigurations` (
  `idUtoteConfiguration` INT(11) NOT NULL AUTO_INCREMENT,
  `ToteVersion` TINYTEXT NOT NULL,
  `Location` TINYTEXT NULL DEFAULT NULL COMMENT 'Location, as specified in the tote.',
  `TimeZoneIndex` TINYTEXT NULL DEFAULT NULL COMMENT 'Windows time zone index\n',
  `DateFormat` INT(11) NOT NULL DEFAULT '0' COMMENT 'Number value for formatting the date.\n  0= \"dd mmm yy\",    \n  1= \"dd mmm yyyy\"\n  2= \"mmm dd yy\"\n  3= \"mmm dd yyyy\"\n  4= \"mm/dd/yy\"\n  5= \"mm/dd/yyyy\"\n  6= \"dd/mm/yy\"\n  7= \"dd/mm/yyyy\"\n  8= \"yy/mm/dd\"\n  9= \"yyyy/mm/dd\"\n 10= \"dd-mmm-yy\"\n 11= \"dd-mmm-yyyy\"\n 12= \"mmm-dd-yy\"\n 13= \"mmm-dd-yyyy\"\n 14= \"mm-dd-yy\"\n 15= \"mm-dd-yyyy\"\n 16= \"dd-mm-yy\"\n 17= \"dd-mm-yyyy\"\n 18= \"yy-mm-dd\"\n 19= \"yyyy-mm-dd”\n 20= \"yymmdd\"\n 21= \"yyyymmdd\"\n 22= ”mmddyyyy”',
  `DatePicture` TINYTEXT NOT NULL COMMENT 'String representing the picture of the date format.\ndd=Numeric day\nmm=Numeric month\nyy=Numeric year (last two digits)\nyyyy=Numeric year\nAny character not represented here must be translated as represented without change.',
  `CurrentTime` DATETIME NOT NULL,
  `CustomerLogo` VARCHAR(4) NULL DEFAULT NULL COMMENT 'Optional Logo Name. Standardized TRA Event Code used for loading Logos.',
  `Cancels` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Optional Boolean attribute to indicate if cancellations are permitted. If Cancels is not specified, then no cancels are permitted.',
  `ToteLinkVersion` TINYTEXT NOT NULL,
  `DefaultEvent` VARCHAR(5) NULL DEFAULT NULL COMMENT 'Default event for source',
  `TicketLogo` VARCHAR(60) NULL DEFAULT NULL COMMENT 'Optional string designated a local logo file used for printing tickets.',
  `Terminal` VARCHAR(6) NOT NULL COMMENT 'Terminal Name',
  `Redact` INT(11) NULL DEFAULT NULL COMMENT 'Optional number representing the number of clear digits for sensitive information. If Redact not specified, then no redacting is necessary.',
  `Mode` ENUM('Cash','Account') NULL DEFAULT NULL COMMENT 'The default operating mode of the terminal. If Mixed is not set, this is only mode permitted, Cash or Account.',
  `Mixed` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'If it is set, both cash and account wagering is permitted.',
  `ManualLogOn` TINYINT(1) NOT NULL DEFAULT '0',
  `Parlay` TINYINT(1) NOT NULL DEFAULT '0',
  `Video` TINYINT(1) NOT NULL DEFAULT '0',
  `AccountTimeout` INT(11) NULL DEFAULT NULL COMMENT 'Optional Patron timeout in seconds for account – only present if timeouts are being used.  If there is no patron activity for this period of time an EndPatron request should be forced',
  `FundedTimeout` INT(11) NULL DEFAULT NULL COMMENT 'Patron timeout in seconds for cash- Only present if timeouts are being used . If there is no patron activity for this period of time and EndPatron request should be forced. ( This is intended for a physical, interactive wagering device. It is generally useful for other types of clients.)',
  `UnfundedTimeout` INT(11) NULL DEFAULT NULL COMMENT 'Timeout for non-patron activity – only present if timeouts are being used',
  `CashReceipts` INT(11) NULL DEFAULT NULL COMMENT 'Optional number of receipts to print for account cash transactions, e.g. deposit or withdraw.  If no CashReceipts is specified, then no cash receipts are printed.',
  `TransactionReceipts` INT(11) NULL DEFAULT NULL COMMENT 'Optional number of receipts to print for terminal transactions, e.g. return or draw. If no TransactionReceipts is specified, then no transaction receipts are printed.',
  `BAM` ENUM('ENABLED','DISABLED') NULL DEFAULT NULL COMMENT 'Optional attribute indicating BAM availability. If the BAM attribute is not specified, then the terminal is not configured for BAM usage. Value is:\nEnabled\nDisabled',
  `Quick` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'If it is set quick is enabled.',
  `Fractional` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Optional Boolean attribute indicating fractional wagering is permitted.',
  `AccountCard` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Optional Boolean attribute indicating a card swipe is considered an account card when in account mode, otherwise the card is a player card',
  `LongTicket` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Optional Boolean attribute indicating that tickets with bar codes should be printed with a minimum length of 3.25 inches.',
  `FunBets` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Optional Boolean attribute set if Fun Bets are to be displayed',
  `PatronOffset` INT(11) NULL DEFAULT NULL COMMENT 'Optional number indicating the number of characters offset on card swipe for patron beginning of patron number.',
  `PatronSize` INT(11) NULL DEFAULT NULL COMMENT 'Optional number indicating the number of digits used in the patron number.',
  `AccountOffset` INT(11) NULL DEFAULT NULL COMMENT 'Optional number indicating the number of characters offset on card swipe for beginning of account number.',
  `AccountSize` INT(11) NULL DEFAULT NULL COMMENT 'Optional number indicating the number of digits used in the account number.',
  `Assistance` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Optional Boolean attribute set if the “assistance” key is to be displayed.',
  `Inquiry` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Optional Boolean attribute indicating account transaction inquiries are permitted.',
  `ScrambleKeyPad` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Optional Boolean attribute indicating numeric key pad is to be scrambled on each use',
  `SwipeRequired` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Optional Boolean attribute indicating an account card swipe is required for account cash transactions',
  `BrandTime` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Optional Boolean attribute indicating time takes precedence over date when both date and time won’t fit when branding a ticket.',
  `HasCurrencies` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Has list of Currencies',
  `idUtoteAccount` INT(11) NULL DEFAULT NULL COMMENT 'There will be one Account element for tote allocated account parameters',
  `idUtoteDemand` INT(11) NULL DEFAULT NULL COMMENT 'There will be one Demand element for tote allocated Demand account parameters',
  `idUtoteContest` INT(11) NULL DEFAULT NULL COMMENT 'There will be one Contest element for Contest account parameters.',
  `idUtoteAdvertisement` INT(11) NULL DEFAULT NULL COMMENT 'Contains advertising and graphics information configured for this device in the backroom',
  `idUtoteLimit` INT(11) NULL DEFAULT NULL COMMENT 'Contains transaction limit data. ',
  `HasChannels` TINYINT(1) NOT NULL DEFAULT '0',
  `HasLanguages` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'There will be one Language element for each language supported by source.',
  `Token` TINYTEXT NULL DEFAULT NULL,
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteConfiguration`),
  INDEX `fk_utoteConfigurationResponses_utoteAccountContests1_idx` (`idUtoteAccount` ASC),
  INDEX `fk_utoteConfigurationResponses_utoteDemands1_idx` (`idUtoteDemand` ASC),
  INDEX `fk_utoteConfigurationResponses_utoteAdvertisements1_idx` (`idUtoteAdvertisement` ASC),
  INDEX `fk_utoteConfigurationResponses_utoteLimits1_idx` (`idUtoteLimit` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 143
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteCurrencies` (
  `idUtoteCurrency` INT(11) NOT NULL AUTO_INCREMENT,
  `idUtoteConfiguration` INT(11) NOT NULL,
  `CurrencyId` VARCHAR(3) NOT NULL COMMENT 'ISO Currency Code\n',
  `Symbol` CHAR(1) NULL DEFAULT NULL COMMENT 'Currency Symbol',
  `WagerScale` INT(11) NULL DEFAULT NULL COMMENT 'Default Scale (number of digits) used for base wagers.',
  `Decimals` INT(11) NULL DEFAULT NULL COMMENT 'Number decimals (implied) in currency (USD would be 2).',
  `Period` CHAR(1) NULL DEFAULT NULL COMMENT 'Character used for fractional separator (USD would be ‘.’)',
  `Comma` CHAR(1) NULL DEFAULT NULL COMMENT 'Character used for number separator (USD would be ‘,’).',
  `UnitValue` INT(11) NULL DEFAULT NULL COMMENT 'Value for the lowest whole unit (USD would be 100).',
  `Format` TINYTEXT NULL DEFAULT NULL COMMENT 'Pictorial format of Currency (e.g $,$$$.cc).',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteCurrency`),
  INDEX `fk_utoteChannel_utoteConfigurationResponses1_idx` (`idUtoteConfiguration` ASC),
  CONSTRAINT `fk_utoteCurrencies_utoteConfigurations`
    FOREIGN KEY (`idUtoteConfiguration`)
    REFERENCES `racetrackwarriors`.`utoteConfigurations` (`idUtoteConfiguration`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteDemands` (
  `idUtoteDemand` INT(11) NOT NULL AUTO_INCREMENT,
  `idUtoteConfiguration` INT(11) NOT NULL,
  `Age` INT(11) NULL DEFAULT NULL COMMENT 'Optional minimum age permitted for account creation.\n',
  `Create` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Optional Boolean attribute indicating that tote allocated accounts may be created',
  `idUtoteRequired` INT(11) NULL DEFAULT NULL COMMENT 'If not null, Optional element indicating required account fields for account creation, if any and account creation is permitted indicated by Create attribute.',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteDemand`),
  INDEX `fk_utoteChannel_utoteConfigurationResponses1_idx` (`idUtoteConfiguration` ASC),
  INDEX `fk_utoteDemands_utoteRequired1_idx` (`idUtoteRequired` ASC),
  CONSTRAINT `fk_utoteDemands_utoteConfigurations`
    FOREIGN KEY (`idUtoteConfiguration`)
    REFERENCES `racetrackwarriors`.`utoteConfigurations` (`idUtoteConfiguration`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_utoteDemands_utoteRequired1`
    FOREIGN KEY (`idUtoteRequired`)
    REFERENCES `racetrackwarriors`.`utoteRequired` (`idUtoteRequired`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteEntries` (
  `idUtoteEntry` INT(11) NOT NULL AUTO_INCREMENT,
  `idParent` INT(11) NOT NULL,
  `EntryId` CHAR(1) NULL DEFAULT NULL COMMENT 'Identifier for this entry. The main entry for a runner typically has a null value.',
  `Name` VARCHAR(18) NULL DEFAULT NULL COMMENT 'Entries name',
  `Scratch` TINYINT(1) NULL DEFAULT '0' COMMENT 'This entry has been scratched.',
  `Jockey` VARCHAR(25) NULL DEFAULT NULL COMMENT 'Jockey name from program data',
  `Weight` VARCHAR(25) NULL DEFAULT NULL COMMENT 'Weight from program data',
  `Trainer` VARCHAR(25) NULL DEFAULT NULL COMMENT 'Trainer from program data',
  `Owner` VARCHAR(50) NULL DEFAULT NULL COMMENT 'Owner from program data',
  `Position` VARCHAR(255) NULL DEFAULT NULL COMMENT 'Post position',
  `Medication` VARCHAR(255) NULL DEFAULT NULL COMMENT 'Medication used',
  `HasChanges` TINYINT(1) NOT NULL DEFAULT '0',
  `PositionChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Post position changed\n',
  `WeightChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Weight changed',
  `MedicationChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Medication changed',
  `JockeyChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Jockey changed',
  `OwnerChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Owner changed',
  `TrainerChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Trainer changed',
  `OtherChange` VARCHAR(20) NULL DEFAULT NULL COMMENT 'User defined changes',
  `NameChanged` TINYINT(1) NOT NULL DEFAULT '0',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteEntry`),
  UNIQUE INDEX `fk_idParent_idUtoteEntry_idx` (`idParent` ASC, `idUtoteEntry` ASC),
  CONSTRAINT `fk_utoteEntries_utoteRunners`
    FOREIGN KEY (`idParent`)
    REFERENCES `racetrackwarriors`.`utoteRunners` (`idUtoteRunner`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 7762
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteEntriesHistory` (
  `idUtoteEntry` INT(11) NOT NULL,
  `idParent` INT(11) NOT NULL,
  `EntryId` CHAR(1) NULL DEFAULT NULL COMMENT 'Identifier for this entry. The main entry for a runner typically has a null value.',
  `Name` VARCHAR(18) NULL DEFAULT NULL COMMENT 'Entries name',
  `Scratch` TINYINT(1) NULL DEFAULT '0' COMMENT 'This entry has been scratched.',
  `Jockey` VARCHAR(25) NULL DEFAULT NULL COMMENT 'Jockey name from program data',
  `Weight` VARCHAR(25) NULL DEFAULT NULL COMMENT 'Weight from program data',
  `Trainer` VARCHAR(25) NULL DEFAULT NULL COMMENT 'Trainer from program data',
  `Owner` VARCHAR(50) NULL DEFAULT NULL COMMENT 'Owner from program data',
  `Position` VARCHAR(255) NULL DEFAULT NULL COMMENT 'Post position',
  `Medication` VARCHAR(255) NULL DEFAULT NULL COMMENT 'Medication used',
  `HasChanges` TINYINT(1) NOT NULL DEFAULT '0',
  `PositionChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Post position changed\n',
  `WeightChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Weight changed',
  `MedicationChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Medication changed',
  `JockeyChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Jockey changed',
  `OwnerChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Owner changed',
  `TrainerChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Trainer changed',
  `OtherChange` VARCHAR(20) NULL DEFAULT NULL COMMENT 'User defined changes',
  `NameChanged` TINYINT(1) NOT NULL DEFAULT '0',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteEntry`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteErrors` (
  `ErrorNumber` INT(11) NOT NULL,
  `ErrorString` TINYTEXT NULL DEFAULT NULL,
  `Parameter1` TINYTEXT NULL DEFAULT NULL,
  `Parameter2` TINYTEXT NULL DEFAULT NULL,
  `Parameter3` TINYTEXT NULL DEFAULT NULL,
  `Parameter4` TINYTEXT NULL DEFAULT NULL,
  `NoOfParameters` TINYINT(1) NOT NULL DEFAULT '0',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`ErrorNumber`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteEvents` (
  `idUtoteEvent` INT(11) NOT NULL AUTO_INCREMENT,
  `RunId` INT(11) NOT NULL DEFAULT '0' COMMENT 'Run during which the event was created.  For future events, this may not be the current RunId.',
  `EventTime` DATETIME NOT NULL COMMENT 'Scheduled date and time for the event to start. Typically this is the scheduled post time of the first race.',
  `EventId` VARCHAR(3) NOT NULL,
  `HasRaces` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'True if has List of Race elements describing each race in the event. ',
  `EventName` VARCHAR(16) NOT NULL,
  `TrackId` VARCHAR(4) NULL DEFAULT NULL,
  `TrackName` VARCHAR(40) NULL DEFAULT NULL,
  `TrackCondition` VARCHAR(8) NULL DEFAULT NULL,
  `TurfTrack` VARCHAR(8) NULL DEFAULT NULL COMMENT 'Condition of Turf Track',
  `EventInfo` VARCHAR(11) NULL DEFAULT NULL COMMENT 'Ticket information string user defined content. ',
  `EventType` VARCHAR(45) NOT NULL COMMENT 'ENUM(\'Current\',\'Future\')',
  `TrackType` VARCHAR(45) NOT NULL COMMENT 'Indicates the type of track at which the event takes place.ENUM(\'JaiAlai\',\'Thoroughbred\',\'Greyhound\',\'Quarterhorse\',\'Harness\',\'Arabian\',\'Mixed\',\'Cycle\',\'Boat\',\'Vehicle\',\'Sports\',\'Other\',\'Unknown\') ',
  `EventClass` CHAR(1) NULL DEFAULT NULL COMMENT 'Optional event display class. If specified, allows grouping of events by class if desired.',
  `CurrencyId` VARCHAR(3) NOT NULL COMMENT 'Currency Id associated for the event.',
  `Parlay` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Indicates whether parlay wagering is permitted for this event.',
  `BreakTo` DECIMAL(10,2) NULL DEFAULT NULL COMMENT 'Optional break to amount for all fractional wager amounts.  All fractional wager amounts must be multiples of this value',
  `Channel` VARCHAR(4) NULL DEFAULT NULL COMMENT 'The TV channel Id on which the event video can be found. Channel information is provided by the Channels in the ConfigurationResponse',
  `EventStatus` VARCHAR(255) NULL DEFAULT NULL COMMENT 'Closed, Open, Finished',
  `RaceList` VARCHAR(255) NOT NULL COMMENT 'A compressed list of available races.',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteEvent`),
  INDEX `RunId_EventTime_EventId` (`RunId` ASC, `EventTime` ASC, `EventId` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 207
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteEventsHistory` (
  `idUtoteEvent` INT(11) NOT NULL,
  `RunId` INT(11) NOT NULL DEFAULT '0' COMMENT 'Run during which the event was created.  For future events, this may not be the current RunId.',
  `EventTime` DATETIME NOT NULL COMMENT 'Scheduled date and time for the event to start. Typically this is the scheduled post time of the first race.',
  `EventId` VARCHAR(3) NOT NULL,
  `HasRaces` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'True if has List of Race elements describing each race in the event. ',
  `EventName` VARCHAR(16) NOT NULL,
  `TrackId` VARCHAR(4) NULL DEFAULT NULL,
  `TrackName` VARCHAR(40) NULL DEFAULT NULL,
  `TrackCondition` VARCHAR(8) NULL DEFAULT NULL,
  `TurfTrack` VARCHAR(8) NULL DEFAULT NULL COMMENT 'Condition of Turf Track',
  `EventInfo` VARCHAR(11) NULL DEFAULT NULL COMMENT 'Ticket information string user defined content. ',
  `EventType` VARCHAR(45) NOT NULL COMMENT 'ENUM(\'Current\',\'Future\')',
  `TrackType` VARCHAR(45) NOT NULL COMMENT 'Indicates the type of track at which the event takes place.ENUM(\'JaiAlai\',\'Thoroughbred\',\'Greyhound\',\'Quarterhorse\',\'Harness\',\'Arabian\',\'Mixed\',\'Cycle\',\'Boat\',\'Vehicle\',\'Sports\',\'Other\',\'Unknown\') ',
  `EventClass` CHAR(1) NULL DEFAULT NULL COMMENT 'Optional event display class. If specified, allows grouping of events by class if desired.',
  `CurrencyId` VARCHAR(3) NOT NULL COMMENT 'Currency Id associated for the event.',
  `Parlay` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Indicates whether parlay wagering is permitted for this event.',
  `BreakTo` DECIMAL(10,2) NULL DEFAULT NULL COMMENT 'Optional break to amount for all fractional wager amounts.  All fractional wager amounts must be multiples of this value',
  `Channel` VARCHAR(4) NULL DEFAULT NULL COMMENT 'The TV channel Id on which the event video can be found. Channel information is provided by the Channels in the ConfigurationResponse',
  `EventStatus` VARCHAR(255) NULL DEFAULT NULL COMMENT 'Closed, Open, Finished',
  `RaceList` VARCHAR(255) NOT NULL COMMENT 'A compressed list of available races.',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteEvent`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteFinishers` (
  `idUtoteFinisher` INT(11) NOT NULL,
  `idUtotePosition` INT(11) NOT NULL,
  `RunnerId` INT(11) NOT NULL COMMENT 'Runner ID for this finisher',
  `EntryId` CHAR(1) NULL DEFAULT NULL COMMENT 'Entry ID for this finisher; null for default entry.',
  `Name` VARCHAR(25) NULL DEFAULT NULL COMMENT 'Entry name, if available',
  `Jockey` VARCHAR(25) NULL DEFAULT NULL COMMENT 'Jockey name, if available',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteFinisher`),
  INDEX `fk_utoteFinishers_utotePositions1_idx` (`idUtotePosition` ASC),
  CONSTRAINT `fk_utoteFinishers_utotePositions1`
    FOREIGN KEY (`idUtotePosition`)
    REFERENCES `racetrackwarriors`.`utotePositions` (`idUtotePosition`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteLanguages` (
  `idUtoteLanguage` INT(11) NOT NULL AUTO_INCREMENT,
  `idUtoteConfiguration` INT(11) NOT NULL,
  `Id` VARCHAR(3) NOT NULL COMMENT 'ISO Language code identifying the supported language.',
  `Default` TINYINT(1) NULL DEFAULT NULL COMMENT 'If it is set, then this is source’s default language.',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteLanguage`),
  INDEX `fk_utoteChannel_utoteConfigurationResponses1_idx` (`idUtoteConfiguration` ASC),
  CONSTRAINT `fk_utoteLanguages_utoteConfigurations`
    FOREIGN KEY (`idUtoteConfiguration`)
    REFERENCES `racetrackwarriors`.`utoteConfigurations` (`idUtoteConfiguration`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteLimits` (
  `idUtoteLimit` INT(11) NOT NULL AUTO_INCREMENT,
  `MaxWagerTotal` DECIMAL(10,0) NOT NULL COMMENT 'Maximum wager total for a single wager line on this device.\n',
  `MaxTicketTotal` DECIMAL(10,0) NOT NULL COMMENT 'Maximum combined total for a single ticket.',
  `MaxDeposit` DECIMAL(10,0) NOT NULL COMMENT 'Maximum amount that can be deposited to an account via this device.',
  `MaxWithdrawal` DECIMAL(10,0) NOT NULL COMMENT 'Maximum amount that can be withdrawn from an account via this device. ',
  `MaxVoucher` DECIMAL(10,0) NOT NULL COMMENT 'The maximum amount that a voucher may be issued.  Zero indicates no limit to the voucher amount.',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteLimit`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utotePoolPrices` (
  `idUtotePoolPrice` INT(11) NOT NULL,
  `idUtoteResultResponse` INT(11) NOT NULL,
  `HasPrices` TINYINT(1) NULL DEFAULT '0' COMMENT 'True if has A Price element for each price paid for the current pool.',
  `PoolId` VARCHAR(3) NOT NULL COMMENT 'Pool ID for this pool',
  `PoolName` VARCHAR(12) NULL DEFAULT NULL COMMENT 'Pool name for this pool',
  `Refund` TINYINT(1) NULL DEFAULT NULL COMMENT 'Indicates if the pool is being refunded',
  `CarryOver` DECIMAL(10,0) NULL DEFAULT NULL COMMENT 'Amount of the pool carried over to the next pool',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtotePoolPrice`),
  INDEX `fk_utotePoolPrices_utoteResultResponses1_idx` (`idUtoteResultResponse` ASC),
  CONSTRAINT `fk_utotePoolPrices_utoteResultResponses1`
    FOREIGN KEY (`idUtoteResultResponse`)
    REFERENCES `racetrackwarriors`.`utoteResultResponses` (`idUtoteResultResponse`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utotePools` (
  `idUtotePool` INT(11) NOT NULL AUTO_INCREMENT,
  `idParent` INT(11) NOT NULL,
  `PoolId` VARCHAR(3) NOT NULL COMMENT 'The pool ID for this pool. Note that pool IDs are group/customer specific, and may differ depending on identification provided when making the call.',
  `PoolNumber` INT(11) NOT NULL COMMENT 'Tote Pool Number\n',
  `PoolName` VARCHAR(12) NULL DEFAULT NULL COMMENT 'Customer-specific name for this pool.',
  `PoolRaces` INT(11) NULL DEFAULT NULL COMMENT 'Number of races in the pool',
  `RaceList` VARCHAR(45) NULL DEFAULT NULL COMMENT 'List of races in this pool, formatted as a compressed list. Only is available when the pool is multi-race pool and the races are non-consecutive.',
  `Legs` INT(11) NULL DEFAULT NULL COMMENT 'Number of legs in the pool',
  `Unordered` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Indicates the pool is unordered, and selected runners may finish in any order. (e.g. QU)',
  `Combine` INT(11) NULL DEFAULT NULL COMMENT 'Combine multiplier for this pool. (Multiply this by the number of legs and the base wager amount to determine the total wager.)',
  `Quick` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Boolean attribute set if quick runner selection is available for this pool.',
  `String` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'String betting is enabled for this pool (Hint for UI design. Compliance is not required.)',
  `Straight` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Boolean attribute set if a straight wager is available for the pool.',
  `Wheel` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Pool can be wheeled',
  `Box` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Pool can be boxed',
  `PowerBox` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'True if PowerBox is available.',
  `Leading` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'If Leading is available.',
  `Multiple` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'If set base wager must be multiples of minimum.',
  `Auto` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Runners can be automatically selected by host.',
  `Fractional` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Boolean attribute set if wager amount can be a fractional value of minimum.',
  `Segmented` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Set if the pool wagers are segmented.',
  `KeyBox` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'If KeyBox is available.',
  `SingleBetMinimum` DECIMAL(10,0) NULL DEFAULT NULL COMMENT 'Minimum amount for a single straight wager in this pool.',
  `MultipleBetMinimum` DECIMAL(10,0) NULL DEFAULT NULL COMMENT 'Minimum base amount for a multiple-combination wager in this pool.',
  `WagerMinimum` DECIMAL(10,0) NULL DEFAULT NULL COMMENT 'Minimum total amount for any wager in this pool.',
  `Maximum` DECIMAL(10,0) NULL DEFAULT NULL COMMENT 'Maximum straight base wager for this pool. May be less than maximum wager for the device ID in use.',
  `FractionalMinimum` DECIMAL(10,0) NULL DEFAULT NULL COMMENT 'Optional minimum total value of a wager required for fractional wagers to be valid if Fractional is specified.',
  `WBMaximum` DECIMAL(10,0) NULL DEFAULT NULL COMMENT 'Maximum wheeled base wager amount.',
  `Parlay` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Is Parlay Pool',
  `Probables` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'If Probables are available.',
  `Exchange` VARCHAR(45) NULL DEFAULT NULL COMMENT 'Exchange wagers, Cash or Exchange.ENUM(\'Cash\',\'Exchange\')',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtotePool`),
  UNIQUE INDEX `idParent_idUtotePool_idx` (`idParent` ASC, `idUtotePool` ASC),
  CONSTRAINT `idUtoteRaceParent`
    FOREIGN KEY (`idParent`)
    REFERENCES `racetrackwarriors`.`utoteRaces` (`idUtoteRace`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 1051
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utotePoolsHistory` (
  `idUtotePool` INT(11) NOT NULL,
  `idParent` INT(11) NOT NULL,
  `PoolId` VARCHAR(3) NOT NULL COMMENT 'The pool ID for this pool. Note that pool IDs are group/customer specific, and may differ depending on identification provided when making the call.',
  `PoolNumber` INT(11) NOT NULL COMMENT 'Tote Pool Number\n',
  `PoolName` VARCHAR(12) NULL DEFAULT NULL COMMENT 'Customer-specific name for this pool.',
  `PoolRaces` INT(11) NULL DEFAULT NULL COMMENT 'Number of races in the pool',
  `RaceList` VARCHAR(45) NULL DEFAULT NULL COMMENT 'List of races in this pool, formatted as a compressed list. Only is available when the pool is multi-race pool and the races are non-consecutive.',
  `Legs` INT(11) NULL DEFAULT NULL COMMENT 'Number of legs in the pool',
  `Unordered` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Indicates the pool is unordered, and selected runners may finish in any order. (e.g. QU)',
  `Combine` INT(11) NULL DEFAULT NULL COMMENT 'Combine multiplier for this pool. (Multiply this by the number of legs and the base wager amount to determine the total wager.)',
  `Quick` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Boolean attribute set if quick runner selection is available for this pool.',
  `String` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'String betting is enabled for this pool (Hint for UI design. Compliance is not required.)',
  `Straight` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Boolean attribute set if a straight wager is available for the pool.',
  `Wheel` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Pool can be wheeled',
  `Box` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Pool can be boxed',
  `PowerBox` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'True if PowerBox is available.',
  `Leading` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'If Leading is available.',
  `Multiple` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'If set base wager must be multiples of minimum.',
  `Auto` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Runners can be automatically selected by host.',
  `Fractional` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Boolean attribute set if wager amount can be a fractional value of minimum.',
  `Segmented` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Set if the pool wagers are segmented.',
  `KeyBox` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'If KeyBox is available.',
  `SingleBetMinimum` DECIMAL(10,0) NULL DEFAULT NULL COMMENT 'Minimum amount for a single straight wager in this pool.',
  `MultipleBetMinimum` DECIMAL(10,0) NULL DEFAULT NULL COMMENT 'Minimum base amount for a multiple-combination wager in this pool.',
  `WagerMinimum` DECIMAL(10,0) NULL DEFAULT NULL COMMENT 'Minimum total amount for any wager in this pool.',
  `Maximum` DECIMAL(10,0) NULL DEFAULT NULL COMMENT 'Maximum straight base wager for this pool. May be less than maximum wager for the device ID in use.',
  `FractionalMinimum` DECIMAL(10,0) NULL DEFAULT NULL COMMENT 'Optional minimum total value of a wager required for fractional wagers to be valid if Fractional is specified.',
  `WBMaximum` DECIMAL(10,0) NULL DEFAULT NULL COMMENT 'Maximum wheeled base wager amount.',
  `Parlay` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Is Parlay Pool',
  `Probables` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'If Probables are available.',
  `Exchange` VARCHAR(45) NULL DEFAULT NULL COMMENT 'Exchange wagers, Cash or Exchange.ENUM(\'Cash\',\'Exchange\')',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtotePool`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utotePositions` (
  `idUtotePosition` INT(11) NOT NULL,
  `idUtoteRaceResult` INT(11) NOT NULL,
  `PositionId` INT(11) NOT NULL COMMENT 'Indicates the location of this position in the sequence',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtotePosition`),
  INDEX `fk_utotePositions_utoteRaceResults1_idx` (`idUtoteRaceResult` ASC),
  CONSTRAINT `fk_utotePositions_utoteRaceResults1`
    FOREIGN KEY (`idUtoteRaceResult`)
    REFERENCES `racetrackwarriors`.`utoteRaceResults` (`idUtoteRaceResult`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utotePrices` (
  `idUtotePrice` INT(11) NOT NULL,
  `idUtotePoolPrice` INT(11) NOT NULL,
  `Finish` VARCHAR(80) NOT NULL COMMENT 'Order of finish for which this price is valid',
  `Exchange` TINYINT(1) NULL DEFAULT '0' COMMENT 'Indicates the price is an exchange',
  `Hold` TINYINT(1) NULL DEFAULT '0' COMMENT 'Indicates payment of tickets on this price is held',
  `Winnings` DECIMAL(10,0) NULL DEFAULT NULL COMMENT 'Total winnings paid on this price',
  `Wager` DECIMAL(10,0) NULL DEFAULT NULL COMMENT 'Wager required to receive this price',
  `PriceAmount` DECIMAL(10,0) NULL DEFAULT NULL COMMENT 'The price paid for the indicated wager amount',
  `Required` INT(11) NULL DEFAULT NULL COMMENT 'Indicates the number of correct selections required to receive this price. ',
  `Payoff` DECIMAL(10,0) NULL DEFAULT NULL COMMENT 'Total payoff for this price.',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtotePrice`),
  INDEX `fk_utotePrices_utotePoolPrices1_idx` (`idUtotePoolPrice` ASC),
  CONSTRAINT `fk_utotePrices_utotePoolPrices1`
    FOREIGN KEY (`idUtotePoolPrice`)
    REFERENCES `racetrackwarriors`.`utotePoolPrices` (`idUtotePoolPrice`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteRaceResults` (
  `idUtoteRaceResult` INT(11) NOT NULL,
  `idUtoteResultResponse` INT(11) NOT NULL,
  `HasPositions` TINYINT(1) NULL DEFAULT '0' COMMENT 'True if has One element per finish position.',
  `Winners` VARCHAR(80) NULL DEFAULT NULL COMMENT 'Formatted order of finish',
  `Scratches` VARCHAR(80) NULL DEFAULT NULL COMMENT 'Compressed list of scratched runners in this race',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteRaceResult`),
  INDEX `fk_utoteRaceResults_utoteResultResponses1_idx` (`idUtoteResultResponse` ASC),
  CONSTRAINT `fk_utoteRaceResults_utoteResultResponses1`
    FOREIGN KEY (`idUtoteResultResponse`)
    REFERENCES `racetrackwarriors`.`utoteResultResponses` (`idUtoteResultResponse`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteRaces` (
  `idUtoteRace` INT(11) NOT NULL AUTO_INCREMENT,
  `idParent` INT(11) NOT NULL COMMENT 'ITSP Event ID for the event.  Note that this is the ITSP ID, not the system Event Id. If there are multiple system events with the same ITSP ID, the system will automatically select the correct event based on group event configuration. If multiple events in the same group have the same ITSP ID, attempting to wager on any of them will fail',
  `RaceId` INT(11) NOT NULL COMMENT 'Race Number\n',
  `RaceStatus` VARCHAR(45) NOT NULL COMMENT 'The status of the race. The race must be open in order to place a wager on any pool starting in that race. ENUM(\'Open\',\'Closed\',\'Post\',\'Final\',\'Canceled\')',
  `TrackType` VARCHAR(45) NOT NULL COMMENT 'Indicates the type of race.\nENUM(\'JaiAlai\',\'Thoroughbred\',\'Greyhound\',\'Quarterhorse\',\'Harness\',\'Arabian\',\'Mixed\',\'Cycle\',\'Boat\',\'Vehicle\',\'Sports\',\'Other\',\'Unknown\')',
  `Current` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Indicates the race is the current race.\n',
  `PostTime` DATETIME NULL DEFAULT NULL COMMENT 'Date and time of scheduled or actual (depending on race status) post time.',
  `NumberOfRunners` INT(11) NOT NULL COMMENT 'Number of runners in the race',
  `Finish` VARCHAR(20) NULL DEFAULT NULL COMMENT 'For races which are Official, indicates the order of finish.',
  `Program` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Program information is available in this race.',
  `Odds` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Odds are available for this race. ',
  `HasPools` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'True if has List of pools available for wagering in this race. Multi-race pools are listed in the first race of the pool.',
  `HasRunners` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'True if has List of runners in this race.',
  `Live` VARCHAR(255) NOT NULL COMMENT 'Compressed List of Live runners in the race.\n',
  `PoolList` VARCHAR(255) NOT NULL COMMENT 'Comma separate list of all available pools in the race, including combine pools.',
  `Conditions` VARCHAR(50) NULL DEFAULT NULL COMMENT 'Condition\n information from the program.',
  `Racetype` VARCHAR(30) NULL DEFAULT NULL COMMENT 'Race type information from the program.',
  `Surface` VARCHAR(10) NULL DEFAULT NULL COMMENT 'Surface information from the program.',
  `Distance` VARCHAR(20) NULL DEFAULT NULL COMMENT 'Race distance',
  `Purse` VARCHAR(255) NULL DEFAULT NULL COMMENT 'Purse amount from the program. (Note: this is a string pass-thru, and will not be adjusted for formatting or currency)',
  `Sex` VARCHAR(30) NULL DEFAULT NULL COMMENT 'Sex restrictions from the race program.',
  `Age` VARCHAR(40) NULL DEFAULT NULL COMMENT 'Age restrictions from the race program',
  `Claim` VARCHAR(255) NULL DEFAULT NULL COMMENT 'Base claiming price from the program (Note: This is a string and will not be adjusted for format/currency)',
  `HasChanges` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'List of late changes to this race’s program.',
  `RaceTypeChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Type of race changed.',
  `DistanceChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Distance of race changed',
  `SexChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Sex requirements of the race changed',
  `AgeChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Age  requirements of the race changed',
  `ClaimChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Claiming amount changed',
  `PurseChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Race Purse changed',
  `BreedChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Breed of Race changed\n',
  `SurfaceChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Surface of race changed',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteRace`),
  UNIQUE INDEX `idParent_idUtoteRace` (`idParent` ASC, `idUtoteRace` ASC),
  INDEX `fk_utoteRaces_utoteEvents_idx` (`idParent` ASC),
  CONSTRAINT `fk_utoteRaces_utoteEvents`
    FOREIGN KEY (`idParent`)
    REFERENCES `racetrackwarriors`.`utoteEvents` (`idUtoteEvent`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 1950
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteRacesHistory` (
  `idUtoteRace` INT(11) NOT NULL,
  `idParent` INT(11) NOT NULL COMMENT 'ITSP Event ID for the event.  Note that this is the ITSP ID, not the system Event Id. If there are multiple system events with the same ITSP ID, the system will automatically select the correct event based on group event configuration. If multiple events in the same group have the same ITSP ID, attempting to wager on any of them will fail',
  `RaceId` INT(11) NOT NULL COMMENT 'Race Number\n',
  `RaceStatus` VARCHAR(45) NOT NULL COMMENT 'The status of the race. The race must be open in order to place a wager on any pool starting in that race. ENUM(\'Open\',\'Closed\',\'Post\',\'Final\',\'Canceled\')',
  `TrackType` VARCHAR(45) NOT NULL COMMENT 'Indicates the type of race.\nENUM(\'JaiAlai\',\'Thoroughbred\',\'Greyhound\',\'Quarterhorse\',\'Harness\',\'Arabian\',\'Mixed\',\'Cycle\',\'Boat\',\'Vehicle\',\'Sports\',\'Other\',\'Unknown\')',
  `Current` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Indicates the race is the current race.\n',
  `PostTime` DATETIME NULL DEFAULT NULL COMMENT 'Date and time of scheduled or actual (depending on race status) post time.',
  `NumberOfRunners` INT(11) NOT NULL COMMENT 'Number of runners in the race',
  `Finish` VARCHAR(20) NULL DEFAULT NULL COMMENT 'For races which are Official, indicates the order of finish.',
  `Program` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Program information is available in this race.',
  `Odds` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Odds are available for this race. ',
  `HasPools` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'True if has List of pools available for wagering in this race. Multi-race pools are listed in the first race of the pool.',
  `HasRunners` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'True if has List of runners in this race.',
  `Live` VARCHAR(255) NOT NULL COMMENT 'Compressed List of Live runners in the race.\n',
  `PoolList` VARCHAR(255) NOT NULL COMMENT 'Comma separate list of all available pools in the race, including combine pools.',
  `Conditions` VARCHAR(50) NULL DEFAULT NULL COMMENT 'Condition\n information from the program.',
  `Racetype` VARCHAR(30) NULL DEFAULT NULL COMMENT 'Race type information from the program.',
  `Surface` VARCHAR(10) NULL DEFAULT NULL COMMENT 'Surface information from the program.',
  `Distance` VARCHAR(20) NULL DEFAULT NULL COMMENT 'Race distance',
  `Purse` VARCHAR(255) NULL DEFAULT NULL COMMENT 'Purse amount from the program. (Note: this is a string pass-thru, and will not be adjusted for formatting or currency)',
  `Sex` VARCHAR(30) NULL DEFAULT NULL COMMENT 'Sex restrictions from the race program.',
  `Age` VARCHAR(40) NULL DEFAULT NULL COMMENT 'Age restrictions from the race program',
  `Claim` VARCHAR(255) NULL DEFAULT NULL COMMENT 'Base claiming price from the program (Note: This is a string and will not be adjusted for format/currency)',
  `HasChanges` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'List of late changes to this race’s program.',
  `RaceTypeChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Type of race changed.',
  `DistanceChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Distance of race changed',
  `SexChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Sex requirements of the race changed',
  `AgeChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Age  requirements of the race changed',
  `ClaimChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Claiming amount changed',
  `PurseChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Race Purse changed',
  `BreedChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Breed of Race changed\n',
  `SurfaceChanged` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Surface of race changed',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteRace`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteRequestLog` (
  `idUtoteRequestLog` INT(11) NOT NULL AUTO_INCREMENT,
  `RequestElementType` TINYTEXT NOT NULL COMMENT 'United Tote’s XML Element that was used for this request.',
  `SystemId` TINYTEXT NULL DEFAULT NULL,
  `SourceId` TINYTEXT NULL DEFAULT NULL,
  `EventId` VARCHAR(3) NULL DEFAULT NULL COMMENT 'ITSP Event ID for the Event.',
  `RaceId` INT(11) NULL DEFAULT '0',
  `TournamentId` VARCHAR(3) NULL DEFAULT NULL COMMENT 'If it is given then contest id must be presented.',
  `ContestId` VARCHAR(3) NULL DEFAULT NULL COMMENT 'If it is given then Tournament id must be presented.',
  `Program` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Whether or not to include program information for requested races and/or runners.',
  `Races` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Boolean attribute set to request all available races for events.',
  `Pools` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Optional Boolean attribute set to request pool details for all requested races.',
  `Runners` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Boolean attribute set to request runner details for all requested races',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteRequestLog`))
ENGINE = InnoDB
AUTO_INCREMENT = 3976
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteRequestLogHistory` (
  `idUtoteRequestLog` INT(11) NOT NULL,
  `RequestElementType` TINYTEXT NOT NULL COMMENT 'United Tote’s XML Element that was used for this request.',
  `SystemId` TINYTEXT NULL DEFAULT NULL,
  `SourceId` TINYTEXT NULL DEFAULT NULL,
  `EventId` VARCHAR(3) NULL DEFAULT NULL COMMENT 'ITSP Event ID for the Event.',
  `RaceId` INT(11) NULL DEFAULT '0',
  `TournamentId` VARCHAR(3) NULL DEFAULT NULL COMMENT 'If it is given then contest id must be presented.',
  `ContestId` VARCHAR(3) NULL DEFAULT NULL COMMENT 'If it is given then Tournament id must be presented.',
  `Program` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Whether or not to include program information for requested races and/or runners.',
  `Races` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Boolean attribute set to request all available races for events.',
  `Pools` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Optional Boolean attribute set to request pool details for all requested races.',
  `Runners` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Boolean attribute set to request runner details for all requested races',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteRequestLog`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteRequired` (
  `idUtoteRequired` INT(11) NOT NULL AUTO_INCREMENT,
  `LastName` TINYINT(1) NOT NULL DEFAULT '0',
  `FirstName` TINYINT(1) NOT NULL DEFAULT '0',
  `Password` TINYINT(1) NOT NULL DEFAULT '0',
  `Address` TINYINT(1) NOT NULL DEFAULT '0' COMMENT '\n',
  `City` TINYINT(1) NOT NULL DEFAULT '0',
  `State` TINYINT(1) NOT NULL DEFAULT '0',
  `Zip` TINYINT(1) NOT NULL DEFAULT '0',
  `Country` TINYINT(1) NOT NULL DEFAULT '0',
  `Telephone` TINYINT(1) NOT NULL DEFAULT '0',
  `Area` TINYINT(1) NOT NULL DEFAULT '0',
  `Email` TINYINT(1) NOT NULL DEFAULT '0',
  `Id` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Optional Boolean attribute indicating account field for second Id.',
  `Expiration` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Optional Boolean attribute indicating account field for second id expiration.',
  `TaxId` TINYINT(1) NOT NULL DEFAULT '0',
  `DateOfBirth` TINYINT(1) NOT NULL DEFAULT '0',
  `Phrase` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Optional Boolean attribute indicating account field for security phrase.',
  `Patron` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Optional Boolean attribute indicating account field for patron number.',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteRequired`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteResponseLog` (
  `idUtoteResponseLog` INT(11) NOT NULL AUTO_INCREMENT,
  `idUtoteRequestLog` INT(11) NOT NULL,
  `ResponseElementType` TINYTEXT NOT NULL,
  `idUtoteResponse` INT(11) NULL DEFAULT NULL,
  `RunId` INT(11) NULL DEFAULT '0',
  `GroupId` TINYTEXT NULL DEFAULT NULL,
  `SystemId` TINYTEXT NULL DEFAULT NULL,
  `SourceId` TINYTEXT NULL DEFAULT NULL,
  `EventId` VARCHAR(3) NULL DEFAULT NULL,
  `RaceId` INT(11) NULL DEFAULT NULL,
  `TournamentId` VARCHAR(3) NULL DEFAULT NULL COMMENT 'Tournament Id of the events',
  `ContestId` VARCHAR(3) NULL DEFAULT NULL COMMENT 'Contest Id of the events',
  `HasEvents` TINYINT(1) NULL DEFAULT '0' COMMENT 'If true, then has associated Event elements',
  `IsError` TINYINT(1) NOT NULL DEFAULT '0',
  `ErrorNumber` INT(11) NOT NULL DEFAULT '0',
  `ErrorMessage` TINYTEXT NULL DEFAULT NULL,
  `ErrorParameter1` TINYTEXT NULL DEFAULT NULL,
  `ErrorParameter2` TINYTEXT NULL DEFAULT NULL,
  `ErrorParameter3` TINYTEXT NULL DEFAULT NULL,
  `ErrorParameter4` TINYTEXT NULL DEFAULT NULL,
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteResponseLog`, `idUtoteRequestLog`),
  INDEX `fk_utoteResponseLog_utoteRequestLog_idx` (`idUtoteRequestLog` ASC),
  INDEX `fk_utoteResponseLog_utoteErrors1_idx` (`ErrorNumber` ASC),
  INDEX `fk_utoteResponseLog_utoteConfigurationResponses1_idx` (`idUtoteResponse` ASC),
  CONSTRAINT `fk_utoteResponseLog_utoteErrors1`
    FOREIGN KEY (`ErrorNumber`)
    REFERENCES `racetrackwarriors`.`utoteErrors` (`ErrorNumber`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_utoteResponseLog_utoteRequestLog`
    FOREIGN KEY (`idUtoteRequestLog`)
    REFERENCES `racetrackwarriors`.`utoteRequestLog` (`idUtoteRequestLog`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 438
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteResponseLogHistory` (
  `idUtoteResponseLog` INT(11) NOT NULL,
  `idUtoteRequestLog` INT(11) NOT NULL,
  `ResponseElementType` TINYTEXT NOT NULL,
  `idUtoteResponse` INT(11) NULL DEFAULT NULL,
  `RunId` INT(11) NULL DEFAULT '0',
  `GroupId` TINYTEXT NULL DEFAULT NULL,
  `SystemId` TINYTEXT NULL DEFAULT NULL,
  `SourceId` TINYTEXT NULL DEFAULT NULL,
  `EventId` VARCHAR(3) NULL DEFAULT NULL,
  `RaceId` INT(11) NULL DEFAULT NULL,
  `TournamentId` VARCHAR(3) NULL DEFAULT NULL COMMENT 'Tournament Id of the events',
  `ContestId` VARCHAR(3) NULL DEFAULT NULL COMMENT 'Contest Id of the events',
  `HasEvents` TINYINT(1) NULL DEFAULT '0' COMMENT 'If true, then has associated Event elements',
  `IsError` TINYINT(1) NOT NULL DEFAULT '0',
  `ErrorNumber` INT(11) NOT NULL DEFAULT '0',
  `ErrorMessage` TINYTEXT NULL DEFAULT NULL,
  `ErrorParameter1` TINYTEXT NULL DEFAULT NULL,
  `ErrorParameter2` TINYTEXT NULL DEFAULT NULL,
  `ErrorParameter3` TINYTEXT NULL DEFAULT NULL,
  `ErrorParameter4` TINYTEXT NULL DEFAULT NULL,
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteResponseLog`, `idUtoteRequestLog`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteResultResponses` (
  `idUtoteResultResponse` INT(11) NOT NULL,
  `EventId` VARCHAR(3) NOT NULL COMMENT 'Event from which the results were retrieved',
  `EventName` VARCHAR(16) NULL DEFAULT NULL COMMENT 'Event Name\n',
  `RaceId` INT(11) NOT NULL COMMENT 'Race from which the results were retrieved',
  `CurrencyId` VARCHAR(3) NOT NULL COMMENT 'This event’s currency id',
  `HasRaceResults` TINYINT(1) NULL DEFAULT '0' COMMENT 'Final race results',
  `HasPoolPrices` TINYINT(1) NULL DEFAULT '0' COMMENT 'List of PoolPrice elements, one for each pool priced in the race.',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteResultResponse`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteRunners` (
  `idUtoteRunner` INT(11) NOT NULL AUTO_INCREMENT,
  `idParent` INT(11) NOT NULL COMMENT 'Parent race\n',
  `RunnerId` INT(11) NOT NULL COMMENT 'Runner number of identifier\n',
  `HasEntries` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'True if has List of entries running together under the associated runner number',
  `Scratch` TINYINT(1) NULL DEFAULT '0' COMMENT 'Indicates that all entries for this runner ID have been scratched.',
  `Odds` VARCHAR(255) NULL DEFAULT NULL COMMENT 'Optional morning line odds, if available',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteRunner`),
  UNIQUE INDEX `fk_idParent_idUtoteRunner_idx` (`idParent` ASC, `idUtoteRunner` ASC),
  CONSTRAINT `fk_utoteRunners_utoteRaces1`
    FOREIGN KEY (`idParent`)
    REFERENCES `racetrackwarriors`.`utoteRaces` (`idUtoteRace`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 12461
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteRunnersHistory` (
  `idUtoteRunner` INT(11) NOT NULL,
  `idParent` INT(11) NOT NULL COMMENT 'Parent race\n',
  `RunnerId` INT(11) NOT NULL COMMENT 'Runner number of identifier\n',
  `HasEntries` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'True if has List of entries running together under the associated runner number',
  `Scratch` TINYINT(1) NULL DEFAULT '0' COMMENT 'Indicates that all entries for this runner ID have been scratched.',
  `Odds` VARCHAR(255) NULL DEFAULT NULL COMMENT 'Optional morning line odds, if available',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteRunner`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteStatusChanges` (
  `idUtoteStatusChange` INT(11) NOT NULL AUTO_INCREMENT,
  `SiteId` TINYTEXT NOT NULL COMMENT 'Site Id\n',
  `RunId` INT(11) NOT NULL DEFAULT '0' COMMENT 'Run Number',
  `MessageTime` TIMESTAMP NOT NULL COMMENT 'Time message was generated',
  `TransactionTime` TIMESTAMP NOT NULL COMMENT 'Time of transaction',
  `EventId` TINYTEXT NULL DEFAULT NULL COMMENT 'IITSP Event Id for current events, otherwise system Id In case of keepalive this is empty',
  `RaceId` INT(10) UNSIGNED NULL DEFAULT '0' COMMENT 'Event Race Number',
  `Source` TINYTEXT NULL DEFAULT NULL COMMENT 'Source (Terminal) name. In Case of keepalive this indicates of update availability for each given site which defined in SiteId. This is comma separator. The value is “up” and “down”. Down means the update is not push from the site (Tote) to the Update Service Application and up means the update information is being pushed to the application from the site (Tote). (eg. up,down)',
  `Action` ENUM('open','closed','final','post','cancelled','locked','uncancel','unofficial','begin','end','done','start','stop','reset','deactivate','add','initialize','keepalive') NOT NULL,
  `Status` TINYTEXT NULL DEFAULT NULL,
  `MTP` BIGINT(20) NULL DEFAULT '0' COMMENT 'Indicates race is at post for Data “Race”',
  `SourceIds` TINYTEXT NULL DEFAULT NULL COMMENT 'Comma separator of all ToteLink’s Customer sources for this update.',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteStatusChange`))
ENGINE = InnoDB
AUTO_INCREMENT = 426
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteStatusChangesHistory` (
  `idUtoteStatusChange` INT(11) NOT NULL,
  `SiteId` TINYTEXT NOT NULL COMMENT 'Site Id\n',
  `RunId` INT(11) NOT NULL DEFAULT '0' COMMENT 'Run Number',
  `MessageTime` TIMESTAMP NOT NULL COMMENT 'Time message was generated',
  `TransactionTime` TIMESTAMP NOT NULL COMMENT 'Time of transaction',
  `EventId` TINYTEXT NULL DEFAULT NULL COMMENT 'IITSP Event Id for current events, otherwise system Id In case of keepalive this is empty',
  `RaceId` INT(10) UNSIGNED NULL DEFAULT '0' COMMENT 'Event Race Number',
  `Source` TINYTEXT NULL DEFAULT NULL COMMENT 'Source (Terminal) name. In Case of keepalive this indicates of update availability for each given site which defined in SiteId. This is comma separator. The value is “up” and “down”. Down means the update is not push from the site (Tote) to the Update Service Application and up means the update information is being pushed to the application from the site (Tote). (eg. up,down)',
  `Action` ENUM('open','closed','final','post','cancelled','locked','uncancel','unofficial','begin','end','done','start','stop','reset','deactivate','add','initialize','keepalive') NOT NULL,
  `Status` TINYTEXT NULL DEFAULT NULL,
  `MTP` BIGINT(20) NULL DEFAULT '0' COMMENT 'Indicates race is at post for Data “Race”',
  `SourceIds` TINYTEXT NULL DEFAULT NULL COMMENT 'Comma separator of all ToteLink’s Customer sources for this update.',
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteStatusChange`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteUpdates` (
  `idUtoteUpdate` INT(11) NOT NULL AUTO_INCREMENT,
  `SiteId` TINYTEXT NOT NULL COMMENT 'Site Id\n',
  `RunId` INT(11) NOT NULL DEFAULT '0' COMMENT 'Run Number',
  `MessageTime` TIMESTAMP NOT NULL COMMENT 'Time message was generated',
  `TransactionTime` TIMESTAMP NOT NULL COMMENT 'Time of transaction',
  `Type` ENUM('Event','Race','Odds','Source','Broadcast') NOT NULL COMMENT '“Event”\r“Race”\r“Odds”\r“Source” (Terminal)\r“Broadcast”\n[10]',
  `Data` ENUM('Track','Group','Surcharge','System','Program','Guide') NULL DEFAULT NULL COMMENT '“Track”* Describes Broadcasted data\r“Group”* indicates data has multiple components\r“Surcharge”\r“System”\r“Program”\r“Guide”\n[20]',
  `Section` ENUM('Message','Minimum','Maximum','Restriction','Terminal','Facility','Pools','Tax','Key','Exclustion','Surcharge') NULL DEFAULT NULL COMMENT '“Message” Describe Data,\r“Minimum” If Data has multiple components\r“Maximum”\r“Restriction”\n“Terminal”\r“Facility”\r“Pools”\r“Tax”\r“Key”\r“Exclusion”\r“Surcharge”',
  `Group` VARCHAR(3) NULL DEFAULT NULL COMMENT 'Group Id for Data “Group”',
  `Track` VARCHAR(3) NULL DEFAULT NULL COMMENT 'Track Id for Data “Track” or “Event”',
  `Post` TINYINT(3) UNSIGNED NULL DEFAULT '0' COMMENT 'Indicates race is at post for Data “Race”',
  `EventId` TINYTEXT NULL DEFAULT NULL COMMENT 'ITSP Event Id for current events, otherwise system Id',
  `RaceId` INT(10) UNSIGNED NULL DEFAULT '0' COMMENT 'Event Race Number',
  `Source` VARCHAR(6) NULL DEFAULT NULL COMMENT 'Source (Terminal) name',
  `SourceIds` TINYTEXT NULL DEFAULT NULL COMMENT 'Comma separator of all ToteLink’s Customer sources for this update.',
  `TrackCode` TINYTEXT NULL DEFAULT NULL,
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteUpdate`))
ENGINE = InnoDB
AUTO_INCREMENT = 42433
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;

CREATE TABLE IF NOT EXISTS `racetrackwarriors`.`utoteUpdatesHistory` (
  `idUtoteUpdate` INT(11) NOT NULL,
  `SiteId` TINYTEXT NOT NULL COMMENT 'Site Id\n',
  `RunId` INT(11) NOT NULL DEFAULT '0' COMMENT 'Run Number',
  `MessageTime` TIMESTAMP NOT NULL COMMENT 'Time message was generated',
  `TransactionTime` TIMESTAMP NOT NULL COMMENT 'Time of transaction',
  `Type` ENUM('Event','Race','Odds','Source','Broadcast') NOT NULL COMMENT '“Event”\r“Race”\r“Odds”\r“Source” (Terminal)\r“Broadcast”\n[10]',
  `Data` ENUM('Track','Group','Surcharge','System','Program','Guide') NULL DEFAULT NULL COMMENT '“Track”* Describes Broadcasted data\r“Group”* indicates data has multiple components\r“Surcharge”\r“System”\r“Program”\r“Guide”\n[20]',
  `Section` ENUM('Message','Minimum','Maximum','Restriction','Terminal','Facility','Pools','Tax','Key','Exclustion','Surcharge') NULL DEFAULT NULL COMMENT '“Message” Describe Data,\r“Minimum” If Data has multiple components\r“Maximum”\r“Restriction”\n“Terminal”\r“Facility”\r“Pools”\r“Tax”\r“Key”\r“Exclusion”\r“Surcharge”',
  `Group` VARCHAR(3) NULL DEFAULT NULL COMMENT 'Group Id for Data “Group”',
  `Track` VARCHAR(3) NULL DEFAULT NULL COMMENT 'Track Id for Data “Track” or “Event”',
  `Post` TINYINT(3) UNSIGNED NULL DEFAULT '0' COMMENT 'Indicates race is at post for Data “Race”',
  `EventId` TINYTEXT NULL DEFAULT NULL COMMENT 'ITSP Event Id for current events, otherwise system Id',
  `RaceId` INT(10) UNSIGNED NULL DEFAULT '0' COMMENT 'Event Race Number',
  `Source` VARCHAR(6) NULL DEFAULT NULL COMMENT 'Source (Terminal) name',
  `SourceIds` TINYTEXT NULL DEFAULT NULL COMMENT 'Comma separator of all ToteLink’s Customer sources for this update.',
  `TrackCode` TINYTEXT NULL DEFAULT NULL,
  `CreateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idUtoteUpdate`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_swedish_ci;


DELIMITER $$
USE `racetrackwarriors`$$
CREATE DEFINER=`etg_mysql1_admin`@`%` PROCEDURE `PrepareUtoteForNewDay`()
BEGIN
-- Preserve Entries
insert into utoteEntriesHistory
select * from utoteEntries;
commit;
-- Remove preserved Entries from daily dable
delete from utoteEntries;
commit;
-- Preserve Runners
insert into utoteRunnersHistory
select * from utoteRunners;
commit;
-- Remove preserved Runners from daily table
delete from utoteRunners;
commit;
-- Preserve Pools
insert into utotePoolsHistory
select * from utotePools;
commit;
-- Remove preserved Pools from daily table
delete from utotePools;
commit;
-- Preserve Races
insert into utoteRacesHistory
select * from utoteRaces;
commit;
-- Remove preserved Races from daily table
delete from utoteRaces;
commit;
-- Preserve Events
insert into utoteEventsHistory
select * from utoteEvents;
commit;
-- Remove preserved Events from daily table
delete from utoteEvents;
commit;
-- Preserve Response Log
insert into utoteResponseLogHistory
select * from utoteResponseLog url where url.CreateTime < date(now());
commit;
-- Remove preserved Response Log entries from daily table
delete from utoteResponseLog where CreateTime < date(now());
commit;
-- Preserve Request Log
insert into utoteRequestLogHistory
select * from utoteRequestLog url where url.CreateTime < date(now());
commit;
-- Remove preserved Request Log entries from daily table
delete from utoteRequestLog where CreateTime < date(now());
commit;
-- Preserve Update Notifications
insert into utoteUpdatesHistory
select * from utoteUpdates uu where uu.MessageTime < date(now());
commit;
-- Remove preserved Update Notifications from daily table
delete from utoteUpdates where MessageTime < date(now());
commit;
-- Preserve Status Change Notifications
insert into utoteStatusChangesHistory
select * from utoteStatusChanges usc where usc.MessageTime < date(now());
commit;
-- Remove preserved Status Change Notifications from daily table
delete from utoteStatusChanges where MessageTime < date(now());
commit;
END$$

DELIMITER ;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
