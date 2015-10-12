SELECT 
   unix_timestamp(EventTime) 'Event timestamp'
 , date_format(convert_tz(EventTime,'UTC','America/New_York'),"%l:%i %p") 'Event Start (ET)'
 , from_unixtime(ue.rtwEventDate) 'RTW Event Date'
 , ue.* 
FROM 
	utoteEvents ue
ORDER BY EventTime asc
;

/*

update utoteEvents
set rtwTracksid = 114
where idUtoteEvent = 1182;

update utoteEvents
set rtwTracksid = 150
where idUtoteEvent = 1188;

SELECT 
   unix_timestamp(EventTime)
 , ue.* 
FROM 
	utoteEvents ue
HAVING
	ue.rtwTracksid is null
ORDER BY EventTime desc
;

update utoteEvents
set rtwTracksid = 153
where idUtoteEvent = 612
;


*/
