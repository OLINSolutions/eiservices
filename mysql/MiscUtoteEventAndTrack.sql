select
    r.* 
  , ug.*
  , grm.*
  , gd.*
from 
	usergames ug
	inner join gamesracemap grm on (grm.gamesid = ug.gamesid)
	inner join gamesdate gd on (gd.gamesdateid = grm.gamesdateid)
    inner join races r on (r.racesid = grm.racesid)
where 
	ug.usersid = 1849
;
SELECT 
    ug.usersid,
    16947,
    CONVERT(1, CHAR(50)),
	ug.gamesid,
    '<br>test1',
    'test1',
    UNIX_TIMESTAMP()
FROM 
	usergames ug
	INNER JOIN gamesracemap grm on (grm.gamesid = ug.gamesid)
	INNER JOIN gamesdate gd on (gd.gamesdateid = grm.gamesdateid)
WHERE
	(grm.racesid = 16947) 
    AND (grm.tracksid = 39)
	AND (gd.gamesdatevalue_gmt = 1429938000)
; 

/*
call NotifyUserOfChange(39, 1429938000, 16947, 1, '<BR>This is a test', 'This is a test');

*/

/*
set @pRtwTracksid = 0;
set @pRtwTracksuniquecode = '0';
set @pRtwTimezone = '0';
set @pRtwTimezoneName = '0';
call rtwbeta.GetRTWEventInfoForUtoteEvent('SAD', @pRtwTracksid, @pRtwTracksuniquecode, @pRtwTimezone, @pRtwTimezoneName);
select @pRtwTracksid, @pRtwTracksuniquecode, @pRtwTimezone, @pRtwTimezoneName;
call rtwbeta.GetRTWEventInfoForUtoteEvent('GD', @pRtwTracksid, @pRtwTracksuniquecode, @pRtwTimezone, @pRtwTimezoneName);
select @pRtwTracksid, @pRtwTracksuniquecode, @pRtwTimezone, @pRtwTimezoneName;
*/

/*
set @pRtwEventDate = '0';
call rtwbeta.GetRTWEventInfoForUtoteEvent('SAD', '4 Oct 15', @pRtwTracksid, @pRtwTracksuniquecode, @pRtwTimezone, @pRtwTimezoneName, @pRtwEventDate);
select @pRtwTracksid, @pRtwTracksuniquecode, @pRtwTimezone, @pRtwTimezoneName, @pRtwEventDate, from_unixtime(@pRtwEventDate);
call rtwbeta.GetRTWEventInfoForUtoteEvent('GD', '14 Oct 15', @pRtwTracksid, @pRtwTracksuniquecode, @pRtwTimezone, @pRtwTimezoneName, @pRtwEventDate);
select @pRtwTracksid, @pRtwTracksuniquecode, @pRtwTimezone, @pRtwTimezoneName, @pRtwEventDate, from_unixtime(@pRtwEventDate);
*/



/*
select 
   a.racesid, a.mypicksid, a.usergamesid , a.mypickswinamount , a.mypicksplaceamount , a.mypicksshowamount
 , b.usergamesmythicalbankroll,b.gamesid 
 , c.usersid, c.usersemail 
 , d.usersprofilefirstname, d.usersprofilemobile
from 
	mypicks a 
    left join usergames b on a.usergamesid = b.usergamesid 
	left join users c on b.usersid = c.usersid 
    left join usersprofile d on c.usersid = d.usersid 
where 
	a.racesid = 46210
order by a.racesid desc, a.mypicksid asc
;
*/

/*
SELECT 
	c.racesid 
FROM 
	gamesdate a
	INNER JOIN gamesracemap b ON a.gamesdateid = b.gamesdateid
	INNER JOIN races c ON b.racesid = c.racesid
	INNER JOIN  tracks d ON c.tracksid = d.tracksid
WHERE 
	d.tracksname = 'BELMONT PARK'
	AND c.racesnumber = 1
	AND a.gamesdatevalue = '09/30/2015'
;
*/

/*
SELECT 
  CONCAT(SUBSTR(a.gamesdatevalue,7,4),SUBSTR(a.gamesdatevalue,1,2),SUBSTR(a.gamesdatevalue,4,2))
  , curdate()
  , substr(REPLACE(CURDATE(),'-',''),1,8)
  , b.gamesid
  , b.gamesname
  , b.statusid
  , b.gamesminentries
  , b.gamescurrententries
  , (SELECT gamesdatevalue 
     FROM gamesdate 
     WHERE gamesid=a.gamesid 
     ORDER BY gamesdatevalue_gmt ASC LIMIT 1) AS gamesdatevalue
  , c.categoriesname
  , d.categoriestypename 
FROM gamesdate a 
	INNER JOIN games b ON a.gamesid=b.gamesid 
	INNER JOIN categories c ON b.categoriesid=c.categoriesid
	LEFT JOIN categoriestype d ON b.gamescategoriestypeid=d.categoriestypeid 
WHERE a.gamesdateid=(SELECT gamesdateid 
					 FROM gamesdate 
                     WHERE gamesid =a.gamesid 
                     ORDER BY gamesdatevalue_gmt DESC LIMIT 1) 
  AND b.gamesmode=1 
  AND a.gamesdatevalue!=-99 
  AND a.gamesdateid!=-99 
  AND CONCAT(SUBSTR(a.gamesdatevalue,7,4),SUBSTR(a.gamesdatevalue,1,2),SUBSTR(a.gamesdatevalue,4,2)) >= substr(REPLACE(CURDATE(),'-',''),1,8)
  GROUP BY a.gamesid
;
*/

/* 
select distinct(ra.tracksid), tr.*
from races ra
  inner join tracks tr on (tr.tracksid = ra.tracksid)
where (1 = 1)
and racesDate=1439337600
-- and tracksid=60
-- and racesNumber=4
;


-- select distinct(ra.tracksid), count(ra.tracksid), tr.tracksuniquecode, tr.tracksname, from_unixtime(ra.racesdate), ra.*
select tr.tracksuniquecode, tr.tracksname, from_unixtime(ra.racesdate)
from races ra
inner join tracks tr on (tr.tracksid = ra.tracksid)
where 
-- tracksid=19
racesDate=1439337600
-- and racesNumber=2 
group by ra.tracksid
order by tr.tracksname asc, racesnumber asc
;

select * from races
where racesdate=1439424000
and tracksid=56
;

select * from races
where racesdate=1439424000
and tracksid=19
;

select * from races
where racesdate=1439424000
and tracksid=49
;

select * from races
where racesdate=1439424000
and tracksid=36
;

select * from races
where racesdate=1439424000
and tracksid=20
;

select distinct racesdate, from_unixtime(racesdate) from races order by racesdate desc limit 100
;

select distinct evi.CHRIMSCode from events evi where evi.EQBCode = 'DMR' limit 1
;

select 
   time_format(convert_tz(from_unixtime(1439521620),'GMT', 'US/Eastern'),'%l:%i%p')
 , time_format(convert_tz(from_unixtime(1439521620),'US/Eastern', 'UTC'),'%l:%i%p')
 , str_to_date("Aug 14, 2015 12:16:19 AM", "%b %e, %Y %h:%i:%s %p")
 , time_format(convert_tz(str_to_date("Aug 14, 2015 12:16:19 AM", "%b %e, %Y %h:%i:%s %p"), 'GMT', 'US/Eastern'), '%l:%i%p')
 , str_to_date("2015-08-14 00:36:35", "%Y-%m-%d %T")
 , time_format(convert_tz(str_to_date("2015-08-14 00:36:35", "%Y-%m-%d %T"), 'GMT', 'US/Eastern'), '%l:%i%p')
 , str_to_date("2015-08-13T22:20:43Z", "%Y-%m-%dT%TZ")
 , time_format(convert_tz(str_to_date("2015-08-13T22:20:43Z", "%Y-%m-%dT%TZ"), 'GMT', 'US/Eastern'), '%l:%i%p')
;

SELECT
  ev.RunId, ev.EventId, ev.EventTime, ev.EventName, ev.TrackId, ev.EventStatus, ev.RaceList
, ra.RaceId, ra.RaceStatus, ra.TrackType, ra.PostTime, ra.NumberOfRunners, ra.Finish
, sum(if(r.scratch = 1,0,1)) as 'NumFinishers'
-- , count(e.idUtoteEntry) as 'NumEntries'
FROM
rtwbeta.utoteEvents ev
inner join rtwbeta.utoteRaces ra on (ra.idParent = ev.idUtoteEvent)
inner join rtwbeta.utoteRunners r on (r.idParent = ra.idUtoteRace)
left outer join rtwbeta.utoteEntries e on (e.idParent = r.idUtoteRunner)
group by ev.RunId, ev.EventId, ev.EventTime, ra.RaceId
order by 
  ev.idUtoteEvent desc
, ra.idParent desc
, ra.raceId desc
, r.idParent desc
, r.RunnerId desc
;


select
  *
from
  utoteRaces ra
  inner join utoteEvents ev on ((ev.eventId = "XX1") and (ra.idParent = ev.idUtoteEvent))
where
  ra.raceId = 8;

*/

  