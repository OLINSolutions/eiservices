select gri.*,ug.usergamesid,u.usersid,u.usersname
from
(select grm.gamesracemapid as 'GRMid', from_unixtime(grm.gamesracemaptime,"%Y-%m-%d %H:%i") as 'GRMTime'
, grm.gamesid as 'GamesId', g.gamesname as 'GamesName'
, grm.tracksid as 'TracksId', t.tracksname as 'TracksName'
, grm.gamesdateid as 'GamesDateId', from_unixtime(gd.gamesdatevalue_gmt,"%Y-%m-%d %H:%i") as 'GamesDate'
, grm.racesid as 'RacesId', r.racesnumber as 'RacesNumber', r.racestag as 'RacesTag', r.racesinformation as 'RacesInformation'
from
  gamesracemap grm
, games g
, tracks t
, races r
, gamesdate gd
where
 grm.gamesid = 5674
 and
 g.gamesid = grm.gamesid
 and
 t.tracksid = grm.tracksid
 and
 r.racesid = grm.racesid
 and
 gd.gamesdateid = grm.gamesdateid
order by
  gamesid
, gamesdateid
, racesid
) gri
, usergames ug
, users u
where
 (gri.GamesId = 5674) -- Quest for the Crown - ALL STAKES
-- (gri.GamesId in (select distinct iug.gamesid from usergames iug where iug.usersid = 1160))
 and
 (ug.gamesid = 5674)
 and
 (u.usersid = ug.usersid)
order by
  gri.gamesid
, gri.gamesdateid
, gri.racesid
, u.usersid
, ug.usergamesid
;



select *
from games
where gamesid = 16145;

select *
from usergames
where gamesid = 16145
and usersid = 940
;

select gri.*,ug.usergamesid,u.usersid,u.usersname
from
(select grm.gamesracemapid as 'GRMid', from_unixtime(grm.gamesracemaptime,"%Y-%m-%d %H:%i") as 'GRMTime'
, grm.gamesid as 'GamesId', g.gamesname as 'GamesName'
, grm.tracksid as 'TracksId', t.tracksname as 'TracksName'
, grm.gamesdateid as 'GamesDateId', from_unixtime(gd.gamesdatevalue_gmt,"%Y-%m-%d %H:%i") as 'GamesDate'
, grm.racesid as 'RacesId', r.racesnumber as 'RacesNumber', r.racestag as 'RacesTag', r.racesinformation as 'RacesInformation'
from
  gamesracemap grm
, games g
, tracks t
, races r
, gamesdate gd
where
 grm.gamesid = 16145
 and
 g.gamesid = grm.gamesid
 and
 t.tracksid = grm.tracksid
 and
 r.racesid = grm.racesid
 and
 gd.gamesdateid = grm.gamesdateid
order by
  gamesid
, gamesdateid
, racesid
) gri
, usergames ug
, users u
where
 (gri.GamesId = 16145) -- Quest for the Crown - ALL STAKES
-- (gri.GamesId in (select distinct iug.gamesid from usergames iug where iug.usersid = 1160))
 and
 (ug.gamesid = 16145)
 and
 (u.usersid = ug.usersid)
order by
  gri.gamesid
, gri.gamesdateid
, gri.racesid
, u.usersid
, ug.usergamesid
;
