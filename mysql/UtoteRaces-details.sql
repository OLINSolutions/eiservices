SELECT 
   uev.EventId
 , uev.RTWtracksuniquecode 'EQB'
 , uev.EventName
 , uev.TrackName
 , date_format(from_unixtime(ura.PostTime/1000), '%m/%d  %l:%i:%s %p') as 'Post Time (GMT)'
 , date_format(convert_tz(from_unixtime(ura.PostTime/1000), '+00:00', 'US/Eastern'), '%m/%d  %l:%i:%s %p') as 'Post Time (ET)'
 , ra.racesposttime
 , ura.RTWracesid
 , ura.*
FROM 
	utoteRaces ura
    left outer join races ra on (ra.racesid = ura.RTWracesid)
    left outer join utoteEvents uev on (uev.idUtoteEvent = ura.idParent)
-- WHERE idParent=1177
-- HAVING
-- 	ura.RTWracesid = 0
ORDER BY
-- ura.posttime desc
 ura.lastupdatetime desc
;

/*

update utoteRaces
set PostTime =
where idUtoteRace = 7803	
;

*/
