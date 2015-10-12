SELECT 
    ueve.EventInfo
  , ueve.EventId
  , concat(ueve.EventName, if(substr(ho.horsesracetag,1,1) = 'H', ' (H)', '')) 'Event Name'
  , ures.RTWTracksid
  , ures.RaceId
  , ures.RTWracesid
  , ures.Winners
  , ures.Scratches
  , upos.PositionId
  , ufin.RunnerId
  , ho.horsesprogramnumber 'hoPgm#'
  , ufin.EntryId
  , ho.horsescoupltypeindicator 'hoCpl?'
  , ho.horsescoupltypevalue 'hoCplVal'
  , ufin.RTWhorsesid
  , ufin.Name
  , ufin.Jockey
  , ufin.CreateTime
  , ufin.LastUpdateTime
  , res.*
  , ho.*
FROM 
    utoteEventsHistory ueve
    inner join utoteResultsHistory ures on (ures.EventId = ueve.EventId)
    inner join utotePositionsHistory upos on (upos.idParent = ures.idUtoteResult)
	inner join utoteFinishersHistory ufin on (ufin.idParent = upos.idUtotePosition)
    left outer join horses ho on (ho.horsesid = ufin.RTWhorsesid)
    left outer join results res on (res.racesid = ho.racesid and res.resultshorsesid = ho.horsesid)
WHERE
    ueve.EventInfo = date_format(date_sub(curdate(),interval 1 day),'%e %b %y')
    and ((ures.CreateTime < curdate()) and (ures.CreateTime >= date_sub(curdate(),interval 1 day)))
--	ures.EventId = 'KED'
-- and ures.RaceId = 4
ORDER BY
	ures.EventName, ures.RaceId, upos.PositionId
--	ufin.LastUpdateTime desc, upos.PositionId
;