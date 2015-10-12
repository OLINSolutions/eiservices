SELECT 
    date(from_unixtime(ra.racesdate)) as 'Race Date'
  , ura.PostTime
  , time(from_unixtime(ura.PostTime/1000)) as 'Post Time (GMT)'
  , tr.tracksuniquecode as 'EQB'
  , tr.tracksname as 'Track'
  , time(from_unixtime(ra.racesdate))
  , ra.*
FROM 
	races ra
    left outer join tracks tr ON (tr.tracksid = ra.tracksid)
    left outer join utoteRaces ura on (ura.RTWracesid = ra.racesid)
WHERE
	ra.racestag like concat('%',date_format(curdate(),'%Y%m%d'),'%')
ORDER BY 
--	ura.PostTime desc
	ura.LastUpdateTime desc
;

/*

select from_unixtime(1444088700);

SELECT 
    from_unixtime(ra.racesdate)
  , ra.*
  , ho.*
FROM 
	races ra
    inner join horses ho on (ho.racesid = ra.racesid)
WHERE
	ra.tracksid = 136
    and ra.racesdate = 1443916800
	ra.racestag like '%20150930GP%'
;

*/

/*

select * from races where racesdate = 1443571200;

select * from races where racestag like '%20150930%' and racesdate = 1443571200;

select * from races where racestag like '%20150930%' and racesdate <> 1443571200;

select * from races where racestag like '%20150929%' and racesdate <> 1443484800;

select racesid from races where racestag like '%20150929%' and racesdate <> 1443484800;

update races
set racesdate = 1443484800, racesendtime = null, raceshorseselectionlocktime = null, statusid = 1
where (racesid >= 46306 and racesid <= 46314)
or (racesid >= 46700 and racesid <= 46702)
or (racesid >= 47252 and racesid <= 47260)
;

update races
set raceshorseselectionlocktime = null, statusid = 1
where racesid = 47284
;

update races
set racesdate = 1443484800, raceshorseselectionlocktime = null, statusid = 1
where racesid >= 47261 and racesid <= 47270
;
update races
set racesendtime = null, statusid=1
where racesid >= 46763 and racesid <= 46764
;
where racestag ='FINALD20150929MNR_USA'

*/
