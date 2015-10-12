SELECT 
	ures.EventId
  , ures.EventName
  , ures.RaceId
  , ures.RTWracesid
  , ures.Winners
  , upos.PositionId
  , ho.horsesprogramnumber 'hoPgm#'
  , ho.horsesscratchindicator 'Ho Scr?'
  , ho.horsescoupltypeindicator 'hoCpl?'
  , ho.horsescoupltypevalue 'hoCplVal'
  , if(substr(ho.horsesracetag,1,1) = 'H', 'Y', 'N') 'hoHarn?'
  , ufin.*
  , res.*
  , ho.*
FROM 
	utoteFinishers ufin
    inner join utotePositions upos on (upos.idUtotePosition = ufin.idParent)
    inner join utoteResults ures on (ures.idUtoteResult = upos.idParent)
    left outer join horses ho on (ho.horsesid = ufin.RTWhorsesid)
    left outer join results res on (res.racesid = ho.racesid and res.resultshorsesid = ho.horsesid)
ORDER BY
	ufin.LastUpdateTime desc, upos.PositionId
;