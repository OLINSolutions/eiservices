/*
SELECT 
	res.racesid, count(res.resultshorsesid), res.*
FROM 
	results res
WHERE
	res.resultsracetag like concat('%',date_format(date_sub(curdate(),INTERVAL 1 DAY),'%Y%m%d'),'%')
GROUP BY
	res.racesid, res.resultshorsesid
;

*/

SELECT 
	res.*
  , h.horsesprogramnumber
  , h.*
  , r.*
FROM 
	results res
    inner join horses h on (h.horsesid = res.resultshorsesid)
    inner join races r on (r.racesid = res.racesid)
WHERE
--	res.resultsracetag like concat('%',date_format(date_sub(curdate(),INTERVAL 1 DAY),'%Y%m%d'),'%')
	res.resultsracetag like concat('%',date_format(curdate(),'%Y%m%d'),'%')
/*
HAVING
	(res.resultswinamount <> 0)
    OR (res.resultsplaceamount <> 0)
    OR (res.resultsshowamount <> 0)    
*/
order by res.racesid desc, h.horsespostposition
-- , resultsid desc
-- order by res.resultsracetag, h.horsesprogramnumber desc, resultsid desc
-- order by r.tracksid, r.racesnumber, h.horsesprogramnumber desc, resultsid desc
-- limit 1000
;

-- UTOTEFINAL_DG_20151005_01DAY_USA
-- select concat('%',date_format(curdate(),'%Y%m%d'),'%');

/*
SELECT 
	ures.EventId
  , ures.EventName
  , ures.RaceId
  , ures.RTWracesid
  , ures.Winners
  , upos.PositionId
  , ho.horsesid
  , ho.horsesprogramnumber 'hoPgm#'
  , ho.horsescoupltypeindicator 'hoCpl?'
  , ho.horsescoupltypevalue 'hoCplVal'
  , if(substr(ho.horsesracetag,1,1) = 'H', 'Y', 'N') 'hoHarn?'
  , res.resultswinamount
  , res.resultsplaceamount
  , res.resultsshowamount
  , ufin.*
  , res.*
  , ho.*
FROM 
	utoteFinishers ufin
    inner join utotePositions upos on (upos.idUtotePosition = ufin.idParent)
    inner join utoteResults ures on (ures.idUtoteResult = upos.idParent)
    inner join horses ho on (ho.horsesid = ufin.RTWhorsesid)
    inner join results res on (res.racesid = ho.racesid and res.resultshorsesid = ho.horsesid)
-- WHERE
--	ures.EventId = 'KED'
-- and ures.RaceId = 4

ORDER BY
	ufin.LastUpdateTime desc, upos.PositionId
;
*/


