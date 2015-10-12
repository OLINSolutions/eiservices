SELECT 
   time_format(convert_tz(ra.lastupdatetime,'+00:00', 'US/Eastern'), '%l:%i:%s %p') as 'Last Upd ET'
 , ra.tracksid as 'TId'
 , tr.tracksname -- rtwev.eventName
 , if(tr.isharness,concat(tr.tracksuniquecode,' (H)'),tr.tracksuniquecode) as 'EQB'
 , if(tr.isharness,'Y','N') as 'Harn?' -- if(rtwev.HasHarness,'Y','N') as 'Harn?'
 , ra.racesid as 'RId'
 , ra.racesnumber as 'R#'
 , from_unixtime(ra.racesdate,"%Y-%m-%d") as 'Race Date'
 , ra.racesstarttime
	, if (((ra.racesstarttime is not null) and (ra.racesstarttime > 0)), from_unixtime(ra.racesstarttime,"%Y-%m-%d %T"),"") as 'GMT'
 , ra.racesposttime as 'Post'
 , substr(ttzm.trackstimezonemaptimezone,1,6) as 'TZone'
 , concat(stat.statusvalue, '/', stat.statustext) as 'Status'
 , ho.horsesprogramnumber as 'Pgm No'
 , ho.horsesname as 'Name'
 , ho.horsesscratchindicator as 'Scr?'
 , ho.horsesscratchdescription as 'Scr Desc'
 , ho.horsesscratchdescriptiontime as 'Scr Desc Tm'
 , time_format(convert_tz(from_unixtime(ho.horsesscratchdescriptiontime),'+00:00', 'US/Eastern'),'%l:%i:%s %p') 'Scr Desc Tm (ET)'
 , ho.horsesupdatedscratchdescriptiontime as 'Upd Scr Desc Tm'
 , time_format(convert_tz(from_unixtime(ho.horsesupdatedscratchdescriptiontime),'+00:00', 'US/Eastern'),'%l:%i:%s %p') 'Upd Scr Desc Tm (ET)'
 , ho.horsesjockeychangedescription as 'Jock Chg Desc'
 , ho.horsesjockeychangetime as 'Jock Chg Time'
 , ho.*
-- , ra.*
FROM 
    races ra
    inner join horses ho on (ho.racesid = ra.racesid)
    inner join tracks tr on (tr.tracksid = ra.tracksid)
    left outer join trackstimezonemap ttzm on (ttzm.tracksid = tr.tracksid)
    inner join status stat on (stat.statusid = ra.statusid)
where
	ra.racesdate = unix_timestamp(curdate())
ORDER BY ra.lastupdatetime desc, ho.horsesupdatedscratchdescriptiontime desc, ra.racesstarttime desc
-- LIMIT 100
;
