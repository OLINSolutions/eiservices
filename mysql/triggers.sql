/*
FindRTWRace - Determine the RTW racesid for a given United Tote Race

Known at this point:
1. UtoteEvent PK

Logic
1. Get the RTW tracksid from the UtoteEvent
2. Conver the UtoteEvent's EventInfo 


delimiter //
create trigger NewEvent
before insert
on UtoteEvent
for each row
BEGIN
	set @pRtwTracksid = 0;
	set @pRtwTracksuniquecode = '0';
	set @pRtwTimezone = '0';
	set @pRtwTimezoneName = '0';
	call rtwbeta.GetRTWEventInfoForUtoteEvent(NEW.EventId, @pRtwTracksid, @pRtwTracksuniquecode, @pRtwTimezone, @pRtwTimezoneName);
	SET NEW.rtwTracksid = @pRtwTracksid;
	SET NEW.rtwTracksuniquecode = @pRtwTracksuniquecode;
	SET NEW.rtwTimezone = @pRtwTimezone;
	SET NEW.rtwTimezoneName = pRtwTimezoneName;
END;//
delimiter ;
select substr('(UTC-08:00) Pacific Time Zone', 5, 6)
;

select 
	IF(LENGTH(NEW.EventInfo) = 9
      , str_to_date(NEW.EventInfo,"%e %b %yT00:00:00TZ")

select str_to_date("4 Oct 15","%e %b %yT00:00:00TZ");

select str_to_date(pNewPostTime, "%Y-%m-%dT%TZ")
into newPostTime;
select convert_tz(newPostTime,'UTC', pTzOffset)
INTO newPostTimeTZ;
select convert_tz(newPostTime,'UTC', pTzName)
INTO newPostTimeTZName;

UPDATE
 races r
SET r.racesstartTime = unix_timestamp(newPostTime),
	r.racesdate = unix_timestamp(date(newPostTimeTZName)),
*/
/*
delimiter //
CREATE TRIGGER NewEvent BEFORE INSERT ON utoteEvents
FOR EACH ROW
BEGIN
	SET @pRtwTracksid = 0;
	SET @pRtwTracksuniquecode = '0';
	SET @pRtwTimezone = '0';
	SET @pRtwTimezoneName = '0';
	CALL GetRTWEventInfoForUtoteEvent(NEW.EventId, @pRtwTracksid, @pRtwTracksuniquecode, @pRtwTimezone, @pRtwTimezoneName);
	SET NEW.rtwTracksid = @pRtwTracksid;
	SET NEW.rtwTracksuniquecode = @pRtwTracksuniquecode;
	SET NEW.rtwTimezone = @pRtwTimezone;
	SET NEW.rtwTimezoneName = pRtwTimezoneName;
END;//
delimiter ;
*/
/*
delimiter //
CREATE TRIGGER NewRace BEFORE INSERT ON utoteRaces
FOR EACH ROW
BEGIN
	SET @lRtwTracksId = 0;
	SET @lRtwEventDate = 0;
    SET @lRTWracesid = 0;
    SET @lIdParent = NEW.idParent;
    
	SELECT 
		ue.rtwTracksid
	  , ue.rtwEventDate 
	FROM
		utoteEvents ue 
	WHERE 
		ue.idUtoteEvent = @lIdParent
	INTO
		@lRtwTracksId
	  , @lRtwEventDate
	;

	SELECT
		ra.racesid
	FROM 
		races ra
	WHERE
		 ra.tracksid = @lRtwTracksId
	 AND ra.racesdate = @lRtwEventDate
	 AND ra.racesnumber = NEW.RaceId
	INTO
		@lRTWracesid
	;
    
    SET NEW.RTWracesid = @lRTWracesid
    ;
END;//
delimiter ;
*/

/*
delimiter //
CREATE TRIGGER NewEntry BEFORE INSERT ON utoteEntries
FOR EACH ROW
BEGIN
    SET @lRTWracesid = 0;
    set @lRunnerId = 0;
    SET @lIdParent = NEW.idParent;
    SET @lPosition = NEW.Position;
    SET @lEntryId = NEW.EntryId;
    SET @lRTWhorsesid = 0;
    
    -- Get the related RTW races id and runner id
	SELECT 
		urace.RTWracesid
      , urun.RunnerId
	FROM
        utoteRunners urun
        inner join utoteRaces urace on (uRace.idUtoteRace = urun.idParent)
	WHERE 
		urun.idUtoteRunner = @lIdParent
	LIMIT 1
	INTO
		@lRTWracesid
	  , @lRunnerId
	;

	SELECT
		ho.horsesid
	FROM 
		horses ho
	WHERE
		 ho.racesid = @lRTWracesid
     AND ho.horsesprogramnumber = if(isnull(@lEntryId),@lRunnerId,concat(@lRunnerId,@lEntryId))
     AND ho.horsespostposition = @lPosition
	INTO
		@lRTWhorsesid
	;
    
    SET NEW.RTWhorsesid = @lRTWhorsesid
    ;
END;//
delimiter ;
*/


delimiter //
CREATE TRIGGER NewFinisher BEFORE INSERT ON utoteFinishers
FOR EACH ROW
BEGIN
    SET @lRTWracesid = 0;
    SET @lIdParent = NEW.idParent;
    SET @lEntryId = NEW.EntryId;
    SET @lRunnerId = NEW.RunnerId;
    SET @lRTWhorsesid = 0;
    
    -- Get the related RTW races id and runner id
	SELECT 
		ures.RTWracesid
	FROM
        utotePositions upos
        inner join utoteResults ures on (ures.idUtoteRsult = upos.idParent)
	WHERE 
		upos.idUtotePosition = @lIdParent
	LIMIT 1
	INTO
		@lRTWracesid
	;

	SELECT
		ho.horsesid
	FROM 
		horses ho
	WHERE
		 ho.racesid = @lRTWracesid
     AND ho.horsesprogramnumber = if(isnull(@lEntryId),@lRunnerId,concat(@lRunnerId,@lEntryId))
     AND ho.horsespostposition = @lPosition
	INTO
		@lRTWhorsesid
	;
    
    SET NEW.RTWhorsesid = @lRTWhorsesid
    ;
END;//
delimiter ;


/*
delimiter //
CREATE TRIGGER NewResult BEFORE INSERT ON utoteResults
FOR EACH ROW
BEGIN
    SET @lRTWtracksid = 0;
    SET @lRTWracesid = 0;
    SET @lEventId = NEW.EventId;
    SET @lRaceId = NEW.RaceId;
    
    -- Get the related RTW races id and runner id
	SELECT 
		uev.RTWtracksid
	  , urace.RTWracesid
	FROM
        utoteEvents uev
        inner join utoteRaces urace on ((uRace.RaceId = @lRaceId) and (urace.idParent = uev.idEvent))
	WHERE 
		uev.EventId = @lEventId
	LIMIT 1
	INTO
        @lRTWtracksid
	  , @lRTWracesid
	;

    SET NEW.RTWtracksid = @lRTWtracksid;
    SET NEW.RTWracesid = @lRTWracesid;
    
END;//
delimiter ;
*/
