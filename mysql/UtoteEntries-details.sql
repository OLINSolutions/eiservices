SELECT 
	uev.EventId
  , uev.EventName
  , ura.idUtoteRace
  , ura.RaceId
  , ura.RaceStatus
  , ura.Finish
  , if(instr(ur.Odds,'/') = 0, cast(ur.Odds as decimal), cast(SUBSTRING_INDEX(ur.Odds, '/', 1) / SUBSTRING_INDEX(ur.Odds, '/', -1) as decimal)) as 'runnerOdds'
  , ur.RunnerId
  , ur.Scratch
  , ura.RTWracesid
  , ue.RTWhorsesid
  , ue.Position
  , ho.horsesscratchindicator 'hoScr?'
  , ho.horsesprogramnumber 'hoPgm#'
  , ho.horsescoupltypeindicator 'hoCpl?'
  , ho.horsescoupltypevalue 'hoCplVal',
	ue.*,
    ho.*
FROM 
	utoteEntries ue
    inner join horses ho on (ho.horsesid = ue.RTWhorsesid)
    inner join utoteRunners ur on (ur.idUtoteRunner = ue.idParent)
    inner join utoteRaces ura on (ura.idUtoteRace = ur.idParent)
    inner join utoteEvents uev on (uev.idUtoteEvent = ura.idParent)
-- HAVING
--	ur.Scratch = 1 or 
--    ue.Scratch = 1 or 
--    ho.horsesscratchindicator = 'Y'
-- 	ue.RTWhorsesid = 0

ORDER BY
--	uev.EventId, ura.RaceId, runnerOdds asc, ur.RunnerId,
	uev.EventId, ura.RaceId, ue.Position
--	ue.lastUpdateTime desc
;

/*
SELECT
	ue.RTWhorsesid
FROM 
	utoteEntries ue
    inner join utoteRunners ur on (ur.idUtoteRunner = ue.idParent)
    inner join utoteRaces ura on (ura.idUtoteRace = ur.idParent)
WHERE
	ura.idUtoteRace = 8192 and
    ur.Scratch <> 1 and
	ue.Scratch <> 1
ORDER BY
    if(instr(ur.Odds,'/') = 0, cast(ur.Odds as decimal), cast(SUBSTRING_INDEX(ur.Odds, '/', 1) / SUBSTRING_INDEX(ur.Odds, '/', -1) as decimal)) ASC
LIMIT 0,1
;
*/

/*
SELECT 
	uev.*
  , ura.*
  , ur.*
  , ue.* 
FROM 
	utoteEntries ue
    inner join utoteRunners ur on (ur.idUtoteRunner = ue.idParent)
    inner join utoteRaces ura on (ura.idUtoteRace = ur.idParent)
    inner join utoteEvents uev on (uev.idUtoteEvent = ura.idParent)
where 
	ue.RTWhorsesid = 0
;

*/
