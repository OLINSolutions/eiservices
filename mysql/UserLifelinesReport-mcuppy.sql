select GameId, g.gamesname, Username, Phase, count(LifelineID) 'Num Purchased', sum(Paid) 'Total Paid', UserID, Email, Name
from
(SELECT ul.gamesid as 'GameId', u.usersid as 'UserID', u.usersname as 'Username', u.usersemail as 'Email',
concat(up.usersprofilefirstname, ' ', up.usersprofilelastname) as 'Name', 
ul.userslifelinephase as 'Phase', ul.userslifelineid as 'LifelineID', ub.usersbalancevalue as 'Paid', ul.userslifelinevalue as 'Value', ul.userslifelinestatus as 'Status', from_unixtime(ul.userslifelinepurchasedate,"%Y-%m-%d") as 'Purchased', from_unixtime(ul.userslifelineuseddate,"%Y-%m-%d") as 'Used', ul.userslifelinemode as 'Mode'
FROM 
racetrackwarriors.userslifeline ul
, users u
, usersprofile up
, usersbalance ub
where 
-- ul.gamesid = 1311 and
ul.usersid in (1160) and
u.usersid = ul.usersid and
up.usersid = ul.usersid and 
ub.usersbalanceid = ul.usersbalanceid
order by ul.gamesid, up.usersprofilelastname asc, ul.userslifelinephase) ll
, racetrackwarriors.games g
where
g.gamesid = ll.GameId
group by Username, GameId, Phase
order by Username, GameId, Phase
;

select GameId, g.gamesname, Username, LifelineID, Phase, Purchased, Paid, Used, UserID, Email, Name
from
(SELECT ul.gamesid as 'GameId', u.usersid as 'UserID', u.usersname as 'Username', u.usersemail as 'Email'
, concat(up.usersprofilefirstname, ' ', up.usersprofilelastname) as 'Name'
, ul.userslifelinephase as 'Phase', ul.userslifelineid as 'LifelineID'
, ul.userslifelinevalue as 'Value', ul.userslifelinestatus as 'Status', from_unixtime(ul.userslifelinepurchasedate,"%Y-%m-%d") as 'Purchased', from_unixtime(ul.userslifelineuseddate,"%Y-%m-%d") as 'Used', ul.userslifelinemode as 'Mode'
, ub.usersbalancevalue as 'Paid'
FROM 
  racetrackwarriors.userslifeline ul
, users u
, usersprofile up
, usersbalance ub
where 
-- ul.gamesid = 1311 and
ul.usersid in (1160) and
u.usersid = ul.usersid and
up.usersid = ul.usersid and 
ub.usersbalanceid = ul.usersbalanceid
order by ul.gamesid, up.usersprofilelastname asc, ul.userslifelinephase) ll,
racetrackwarriors.games g
where 
g.gamesid = ll.GameId
order by GameId asc, Phase asc, Purchased asc
;

select u.usersname
, g.gamesid, g.gamesname, from_unixtime(g.gamescreationdate,"%Y-%m-%d") as 'GameCreated'
, ug.usergamesid, ug.usergamesentrynumber as 'UGEntryNumber', ug.usergamesisactive as 'UGIsActive', ug.standingamount as 'UGStandingAmount'
, gd.gamesdateid, from_unixtime(gd.gamesdatevalue_gmt,"%Y-%m-%d %H:%i") as 'GameDate'
, mp.*
from
  usergames ug
, users u
, games g
, gamesdate gd
, mypicks mp
where 
ug.usersid = 1160 and
u.usersid = ug.usersid and
mp.usergamesid = ug.usergamesid and
g.gamesid = ug.gamesid and
gd.gamesid = g.gamesid
order by g.gamesid, ug.usergamesid, gd.gamesdateid
;
