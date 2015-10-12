select Username, Phase, count(LifelineID) 'Num Purchased', sum(Paid) 'Total Paid', UserID, Email, Name
from
(SELECT ul.gamesid as 'GameId', u.usersid as 'UserID', u.usersname as 'Username', u.usersemail as 'Email',
concat(up.usersprofilefirstname, ' ', up.usersprofilelastname) as 'Name', 
ul.userslifelinephase as 'Phase', ul.userslifelineid as 'LifelineID', ub.usersbalancevalue as 'Paid', ul.userslifelinevalue as 'Value', ul.userslifelinestatus as 'Status', from_unixtime(ul.userslifelinepurchasedate,"%Y-%m-%d") as 'Purchased', from_unixtime(ul.userslifelineuseddate,"%Y-%m-%d") as 'Used', ul.userslifelinemode as 'Mode'
FROM racetrackwarriors.userslifeline ul, users u, usersprofile up, usersbalance ub
where ul.gamesid = 1311
and u.usersid = ul.usersid
and up.usersid = ul.usersid
and ub.usersbalanceid = ul.usersbalanceid
order by ul.gamesid, up.usersprofilelastname asc, ul.userslifelinephase) ll
group by Username, Phase
order by Username, Phase
;
