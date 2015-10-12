SELECT 
	uev.EventId, uev.EventName,
    ura.RaceId,
    ur.RunnerId, ur.Scratch, ur.Odds,
    ho.horsesscratchindicator 'hoScr?', ho.horsesprogramnumber 'hoPgm#', ho.horsescoupltypeindicator 'hoCpl?', ho.horsescoupltypevalue 'hoCplVal',
	ue.*,
    ho.*
FROM 
	utoteEntriesHistory ue
    inner join horses ho on (ho.horsesid = ue.RTWhorsesid)
    inner join utoteRunnersHistory ur on (ur.idUtoteRunner = ue.idParent)
    inner join utoteRacesHistory ura on (ura.idUtoteRace = ur.idParent)
    inner join utoteEventsHistory uev on (uev.idUtoteEvent = ura.idParent)
HAVING
	ue.CreateTime < curdate()
    and ue.CreateTime >= (curdate() - interval 2 day)
-- 	ue.RTWhorsesid = 0
ORDER BY
	ue.lastUpdateTime desc
limit 4000
;

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
-- SELECT * FROM rtwbeta.utoteEntriesHistory;