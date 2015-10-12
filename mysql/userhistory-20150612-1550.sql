-- select Username, DateCreated, PurchaseDate, Paid, BalanceCategory, UserID, Email, Name
-- select distinct(uh.GameDate) as 'DateLastPlayed', count(distinct uh.GamesId) 'GamesEntered'
-- select Username, max(GameDate), count(distinct GamesId)
-- from 
-- (
select Username, DateCreated, UserID, Email, SourceURL
, ProfileId, FirstName, LastName, FullName
, ug.gamesid as 'GamesId', ug.usergamesentrynumber as 'EntryNumber', ug.usergamesnumberoflifeline as 'NumLifelines'
, g.gamesname as 'GameName'
, from_unixtime(gd.gamesdatevalue_gmt,"%Y-%m-%d") as 'GameDate'
, grm.tracksid as 'TrackId'
, t.tracksuniquecode as 'TrackCode'
, grm.racesid as 'RaceId'
, r.racestag as 'RaceTag', r.racesnumber as 'RaceNumber'
, mp.mypicksid as 'MyPicksId', mp.mypicksprimaryhorsesid as 'MPPrimaryHorseId', mp.mypicksalthorsesid as 'MPAltHorseId'
-- , GamesName, PurchaseDate, Paid, BalanceCategory
-- select Username, DateCreated, UserID, Email, Name, SourceURL, URLName, count(distinct GamesId) as 'GamesEntered'
-- select URLName, count(URLName) as 'NumAcquiredUsers'
from
(SELECT from_unixtime(u.usersaccountcreationtime,"%Y-%m-%d") as 'DateCreated', u.usersid as 'UserID', u.usersname as 'Username', u.usersemail as 'Email',u.usersfromurl as 'SourceURL'
, su.siteurlname as 'URLName'
, up.usersprofileid as 'ProfileId', trim(up.usersprofilefirstname) as 'FirstName', trim(up.usersprofilelastname) as 'LastName', concat(trim(up.usersprofilefirstname), ' ', trim(up.usersprofilelastname)) as 'FullName'
from
	racetrackwarriors.users u
		left join (racetrackwarriors.usersprofile up
				  ,racetrackwarriors.siteurl su)
			on (up.usersid = u.usersid
			and su.siteurlid = u.siteurlid)
where 
    u.usersastest = '0'
and u.usersname not in ('prabal6dey6','Zoeybeans','testprabalptc1', 'test3ptc1', 'buyer', 'dedfsdfd', 'gfhhgdhh', 'jen','Nathan1','msluci','gypsy11','Rupert','BarneyRubble','FredFlintstone','LaurenD','Jackson5','RTWJames','jen_player','Lu','littlezoey','Wavesolo10','Sophie','JockeyBoy')
and (u.usersaccountcreationtime >= UNIX_TIMESTAMP('2015-01-01 00:00:00'))
order by 
    up.usersprofilelastname asc
) UI
	left outer join (
		racetrackwarriors.usergames ug
	   ,racetrackwarriors.games g
       ,racetrackwarriors.gamesdate gd
       ,racetrackwarriors.gamesracemap grm
       ,racetrackwarriors.mypicks mp
       ,racetrackwarriors.tracks t
       ,racetrackwarriors.races r
              ) 
	  on (ug.usersid = UI.UserID
	  and g.gamesid = ug.gamesid
      and gd.gamesid = ug.gamesid
      and grm.gamesdateid = gd.gamesdateid
      and mp.usergamesid = ug.usergamesid
      and t.tracksid = grm.tracksid
      and r.racesid = grm.racesid
         )
order by
	Username, GameDate
-- ) uh
-- group by UserId
-- order by Username
/*
group by GameDate
order by GameDate Desc, GamesId
*/
/*
(Select 
-- , g.gamesname as 'GamesName'
-- ,su.siteurlname as 'URLName'
-- , from_unixtime(ub.usersbalancetimestamp,"%Y-%m-%d") as 'PurchaseDate', ub.usersbalancevalue as 'Paid', if(ub.usersbalancecategory = 1,'Normal','Promotional') as 'BalanceCategory'
from
	racetrackwarriors.users u
    left join (
    racetrackwarriors.usersprofile up
    ,racetrackwarriors.usergames ug
--    ,racetrackwarriors.games g
--    ,racetrackwarriors.siteurl su
--   ,racetrackwarriors.usersbalance ub
    ) on (up.usersid = u.usersid
	  and ug.usersid = u.usersid
-- 	  and g.gamesid = ug.gamesid
-- 	  and ub.usersid = u.usersid
-- 	  and ub.gamesid = ug.gamesid
        )
where 
-- up.usersid = u.usersid
-- and ug.usersid = u.usersid
-- and su.siteurlid = u.siteurlid
-- and g.gamesid = ug.gamesid
-- and g.gamesastest = '0'
-- and ub.usergamesid = ug.usergamesid
   u.usersastest = '0'
and u.usersname not in ('testprabalptc1', 'test3ptc1', 'buyer', 'dedfsdfd', 'gfhhgdhh', 'jen','Nathan1','msluci','gypsy11','Rupert','BarneyRubble','FredFlintstone','LaurenD','Jackson5','RTWJames','jen_player','Lu','littlezoey','Wavesolo10','Sophie','JockeyBoy')
-- and ub.usersbalancevalue > 0
and (u.usersaccountcreationtime >= UNIX_TIMESTAMP('2015-01-01 00:00:00'))
order by 
    up.usersprofilelastname asc
-- group by Username
-- order by DateCreated asc
-- su.siteurlname asc
) ll
-- group by URLName
-- order by URLName asc
**/
;


/**
-- select Username, DateCreated, PurchaseDate, Paid, BalanceCategory, UserID, Email, Name
-- select Username, DateCreated, UserID, Email, Name, GamesId, GamesName, PurchaseDate, Paid, BalanceCategory
-- select Username, DateCreated, UserID, Email, Name, SourceURL, URLName, count(distinct GamesId) as 'GamesEntered'
select URLName, count(URLName) as 'NumAcquiredUsers'
from
(SELECT from_unixtime(u.usersaccountcreationtime,"%Y-%m-%d") as 'DateCreated', u.usersid as 'UserID', u.usersname as 'Username', u.usersemail as 'Email',u.usersfromurl as 'SourceURL',
concat(trim(up.usersprofilefirstname), ' ', trim(up.usersprofilelastname)) as 'Name'
-- ,ug.usergamesid as 'GamesId', g.gamesname as 'GamesName'
,su.siteurlname as 'URLName'
-- , from_unixtime(ub.usersbalancetimestamp,"%Y-%m-%d") as 'PurchaseDate', ub.usersbalancevalue as 'Paid', if(ub.usersbalancecategory = 1,'Normal','Promotional') as 'BalanceCategory'
from
	racetrackwarriors.users u
    ,racetrackwarriors.usersprofile up
--    ,racetrackwarriors.usergames ug
--    ,racetrackwarriors.games g
    ,racetrackwarriors.siteurl su
--    ,racetrackwarriors.usersbalance ub
where 
	up.usersid = u.usersid
-- and ug.usersid = u.usersid
and su.siteurlid = u.siteurlid
-- and g.gamesid = ug.gamesid
-- and g.gamesastest = '0'
-- and ub.usergamesid = ug.usergamesid
and u.usersastest = '0'
and u.usersname not in ('testprabalptc1', 'test3ptc1', 'buyer', 'dedfsdfd', 'gfhhgdhh', 'jen','Nathan1','msluci','gypsy11','Rupert','BarneyRubble','FredFlintstone','LaurenD','Jackson5','RTWJames','jen_player','Lu','littlezoey','Wavesolo10','Sophie','JockeyBoy')
-- and ub.usersbalancevalue > 0
and (u.usersaccountcreationtime >= UNIX_TIMESTAMP('2015-01-01 00:00:00'))
order by 
--    up.usersprofilelastname asc) ll
-- group by Username
-- order by DateCreated asc
    su.siteurlname asc) ll
group by URLName
order by URLName asc
;
**/