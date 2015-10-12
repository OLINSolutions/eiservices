SELECT 
   time_format(convert_tz(ra.lastupdatetime, '+00:00', 'US/Eastern'), "%T") as 'Last Update'
 , ra.tracksid as 'TId'
 , tr.tracksname -- rtwev.eventName
 , if(tr.isharness,concat(tr.tracksuniquecode,' (H)'),tr.tracksuniquecode) as 'EQB'
 , if(tr.isharness,'Y','N') as 'Harn?' -- if(rtwev.HasHarness,'Y','N') as 'Harn?'
 , ra.racesid as 'RaId'
 , ra.racesnumber as 'Ra#'
 , concat(stat.statusvalue, '/', stat.statustext) as 'Status'
 , ttzm.trackstimezonemaptimezone as 'TZName'
 , from_unixtime(ra.racesdate,"%Y-%m-%d") as 'racesdate'
 , ra.racesstarttime
 , if (((ra.racesstarttime is not null) and (ra.racesstarttime > 0)), from_unixtime(ra.racesstarttime,"%Y-%m-%d %T"),"") as 'racesstarttime (UTC)'
 , ra.racesposttime as 'racesposttime'
 , time_format(convert_tz(from_unixtime(ra.racesstarttime),'+00:00', ttzm.trackstimezonemaptimezone),'%l:%i:%s%p') 'Post S/B (TZName)'
 , from_unixtime(ra.raceshorseselectionlocktime,"%Y-%m-%d %T") as 'raceshorseselectionlocktime'
 , time_format(convert_tz(from_unixtime(ra.raceshorseselectionlocktime,"%Y-%m-%d %T"), 'UTC', ttzm.trackstimezonemaptimezone), '%l:%i:%s %p') as 'Lock Time (TZName)'
 , ra.raceshorseselectionlocktime as 'Lock Time (UTC Raw)'
 , time_format(convert_tz(from_unixtime(ra.racesendtime,"%Y-%m-%d %T"), 'UTC', ttzm.trackstimezonemaptimezone), '%l:%i:%s%p') as 'End Time (TZName)'
 , ra.racesendtime as 'End Time (Raw)'
 , (select distinct res.resultshorsesid from results res where res.racesid = ho.racesid limit 0,1) as 'Win Ho#'
 , ho.horsesprogramnumber as 'Pgm No'
 , ho.horsesname as 'Name'
 , ho.horsesscratchindicator as 'Scr?'
 , ho.horsesscratchdescription as 'Scr Desc'
 , ho.horsesscratchdescriptiontime as 'Scr Desc Tm'
 , ho.horsesupdatedscratchdescriptiontime as 'Upd Scr Desc Tm'
 , ho.horsesjockeychangedescription as 'Jock Chg Desc'
 , ho.horsesjockeychangetime as 'Jock Chg Time'
 , ho.*
 , ra.*
FROM 
    races ra
    inner join horses ho on (ho.racesid = ra.racesid)
	inner join tracks tr on (tr.tracksid = ra.tracksid)
    left outer join trackstimezonemap ttzm on (ttzm.tracksid = tr.tracksid)
    inner join status stat on (stat.statusid = ra.statusid)
where
	(ra.racesdate = unix_timestamp(curdate()	)
)
ORDER BY ra.lastupdatetime desc, ho.horsesupdatedscratchdescriptiontime desc, ra.racesid desc, ra.racesstarttime desc, ho.horsesprogramnumber asc
-- LIMIT 100
;

/*
SELECT
	unix_timestamp(curdate()),
	ra.*
FROM 
    races ra
where
	(ra.racesdate >= (unix_timestamp(curdate()) - 86400))


*/