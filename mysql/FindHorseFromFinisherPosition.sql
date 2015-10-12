    SET @lRTWracesid = 0;
    SET @lIdParent = 5947;
--     SET @lIdParent = 5949;
    
    -- Get the related RTW races id and runner id
	SELECT 
		ures.RTWracesid
	FROM
        utotePositions upos
        inner join utoteResults ures on (ures.idUtoteResult = upos.idParent)
	WHERE 
		upos.idUtotePosition = @lIdParent
	LIMIT 1
	INTO
		@lRTWracesid
	;
    
    -- Get the presumptive finisher

    SET @lEntryId = NULL;
    SET @lRunnerId = 1;
    SET @lRTWhorsesid = 0;
    SET @lHoProgramNumber = '0';
    SET @lHoScratched = 'N';
    SET @lHoIsPOE = 'N';
    SET @lHoPOEValue = '';
	SET @lName = 'Smoke the Hunt';
-- 	SET @lName = 'Shooting Doves';

	SELECT
		ho.horsesid
	  , ho.horsesprogramnumber
	  , ho.horsesscratchindicator
	  , ho.horsescoupltypeindicator
	  , ho.horsescoupltypevalue
	FROM 
		horses ho
	WHERE
		 ho.racesid = @lRTWracesid
     AND upper(ho.horsesname) = upper(@lName)
	INTO
		@lRTWhorsesid
	  , @lHoProgramNumber
	  , @lHoScratched
      , @lHoIsPOE
      , @lHoPOEValue
	;

	SET @lScratchedAndPOE = (('Y' = @lHoScratched) AND ('Y' = @lHoIsPOE));
    
    SELECT 
		IF((@lHoProgramNumber = concat(@lRunnerId,@lHoPOEValue)),CAST(@lRunnerId AS CHAR), concat(@lRunnerId,@lHoPOEValue)) 
	INTO 
		@lHoProgramNumberNew;
        
		SELECT
			ho.horsesid
		  , ho.horsesname
          , concat(
			trim(jo.jockeysfirstname), 
            if((jo.jockeysmiddlename = NULL) or (trim(jo.jockeysmiddlename) = ''), ' ', concat(' ', trim(jo.jockeysmiddlename),' ')),
            trim(jo.jockeyslastname))
		FROM 
			horses ho
            inner join jockeys jo on  (jo.jockeysid = ho.jockeysid)
		WHERE
			 ho.racesid = @lRTWracesid
		 AND ho.horsesprogramnumber = @lHoProgramNumberNew
		INTO
			@lRTWhorsesidNew
		  , @lHorsesnameNew
          , @lJockeyNameNew
		;

	SELECT
		@lRTWracesid
	  , @lRTWhorsesid
      , @lName
	  , @lHoProgramNumber
	  , @lHoScratched
      , @lHoIsPOE
      , @lHoPOEValue
      , @lScratchedAndPOE
      , @lHoProgramNumberNew
      , @lRTWhorsesidNew
      , @lHorsesnameNew
      , @lJockeyNameNew
      ;
    
    -- If scratched, and Part Of Entry (e.g. coupled), then find and use corresponding partner

    IF (('Y' = @lHoScratched) AND ('Y' = @lHoIsPOE)) THEN
    
		-- Determine the program number to use in the select
		IF (@lHoProgramNumber = concat(@lRunnerId,@lHoPOEValue)) THEN
			SET @lHoProgramNumber = CAST(@lRunnerId AS CHAR);
		ELSE
			SET @lHoProgramNumber = concat(@lRunnerId,@lHoPOEValue);
        END IF;
        
		-- Get the other entry as finisher

		SELECT
			ho.horsesid
		FROM 
			horses ho
		WHERE
			 ho.racesid = @lRTWracesid
		 AND ho.horsesprogramnumber = @lHoProgramNumber
		INTO
			@lRTWhorsesid
		;
    
    END IF;
    
    SET NEW.RTWhorsesid = @lRTWhorsesid;
    
/*

    SET @lRTWracesid = 0;
    SET @lIdParent = 5348;
    
    -- Get the related RTW races id and runner id
	SELECT 
		ures.RTWracesid
	FROM
        utotePositionsHistory upos
        inner join utoteResultsHistory ures on (ures.idUtoteResult = upos.idParent)
	WHERE 
		upos.idUtotePosition = @lIdParent
	LIMIT 1
	INTO
		@lRTWracesid
	;
    
    -- Get the presumptive finisher

    SET @lEntryId = NULL;
    SET @lRunnerId = 1;
    SET @lRTWhorsesid = 0;
    SET @lHoProgramNumber = '0';
    SET @lHoScratched = 'N';
    SET @lHoIsPOE = 'N';
    SET @lHoPOEValue = '';

	SELECT
		ho.horsesid
	  , ho.horsesprogramnumber
	  , ho.horsesscratchindicator
	  , ho.horsescoupltypeindicator
	  , ho.horsescoupltypevalue
	FROM 
		horses ho
	WHERE
		 ho.racesid = @lRTWracesid
     AND ho.horsesprogramnumber = concat(@lRunnerId,ifnull(@lEntryId,''))
	INTO
		@lRTWhorsesid
	  , @lHoProgramNumber
	  , @lHoScratched
      , @lHoIsPOE
      , @lHoPOEValue
	;

	SET @lScratchedAndPOE = (('Y' = @lHoScratched) AND ('Y' = @lHoIsPOE));
    
    SELECT 
		IF((@lHoProgramNumber = concat(@lRunnerId,@lHoPOEValue)),CAST(@lRunnerId AS CHAR), concat(@lRunnerId,@lHoPOEValue)) 
	INTO 
		@lHoProgramNumberNew;
        
		SELECT
			ho.horsesid
		  , ho.horsesname
          , jo.jockeyName
		FROM 
			horses ho
            inner join jockeys jo on (jo.jockeysid = ho.jockeysid)
		WHERE
			 ho.racesid = @lRTWracesid
		 AND ho.horsesprogramnumber = @lHoProgramNumberNew
		INTO
			@lRTWhorsesidNew
		  , @lHorsesnameNew
          , @lJockeyNameNew
		;

	SELECT
		@lRTWracesid
	  , @lRTWhorsesid
	  , @lHoProgramNumber
	  , @lHoScratched
      , @lHoIsPOE
      , @lHoPOEValue
      , @lScratchedAndPOE
      , @lHoProgramNumberNew
      , @lRTWhorsesidNew
      , @lHorsesnameNew
      , @lJockeyNameNew
      ;
    
    -- If scratched, and Part Of Entry (e.g. coupled), then find and use corresponding partner

    IF (('Y' = @lHoScratched) AND ('Y' = @lHoIsPOE)) THEN
    
		-- Determine the program number to use in the select
		IF (@lHoProgramNumber = concat(@lRunnerId,@lHoPOEValue)) THEN
			SET @lHoProgramNumber = CAST(@lRunnerId AS CHAR);
		ELSE
			SET @lHoProgramNumber = concat(@lRunnerId,@lHoPOEValue);
        END IF;
        
		-- Get the other entry as finisher

		SELECT
			ho.horsesid
		FROM 
			horses ho
		WHERE
			 ho.racesid = @lRTWracesid
		 AND ho.horsesprogramnumber = @lHoProgramNumber
		INTO
			@lRTWhorsesid
		;
    
    END IF;
    
    SET NEW.RTWhorsesid = @lRTWhorsesid;
    


*/
