/*

-- Given the game id, get the games date (value in gmt)
select gamesdatevalue_gmt
from gamesdate
where gamesid = 7842
;
-- 1430888400


-- Get the track and race id info
select *
from gamesracemap
where gamesdateid = (select gamesdateid from gamesdate where gamesid = 7842)
and gamesid = 7842
order by racesid asc
;


-- Given a user id, game id, and entry number, rethrn the usersgamesid
select usergamesid
FROM `usergames` 
WHERE `usersid` = 1967
and gamesid = 7842
and usergamesentrynumber = 1
;

-- once you have the usergamesid, get the races
SELECT * 
FROM `usergames` 
WHERE `gamesid` = 7842
and userid = 1967
;

select * from games
where gamesid = 7528
;


update games
set gamescurrententries = gamescurrententries + 1,
    gamesmaxentries = gamesmaxentries + 1
where gamesid = 7528
;

select *
from games
where gamesid = 7529
;

SELECT * 
FROM `usergames` 
WHERE `gamesid` = 7529
;

update games
set gamesmaxentries = 288
where gamesid = 7529
;

select count(*)
from usergames
where gamesid = 7529
;

update games
set gamescurrententries = (select count(*) from usergames where gamesid = 7529)
where gamesid = 7529
;
*/

