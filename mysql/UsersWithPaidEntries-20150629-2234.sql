

select uuu.usersid, uuu.usersname, uuu.usersemail, from_unixtime(uuub.usersbalancetimestamp,"%Y-%m-%d")
FROM racetrackwarriors.usersbalance uuub, users uuu
where uuub.usersbalanceid in (select max(usersbalanceid)
from (select u.usersname, u.usersemail, ub.*
from users u
left outer join usersbalance ub on (ub.usersid = u.usersid)
where ((ub.usergamesid <> 0) or (ub.gamesid <> 0))
-- and ub.usersbalancevalue <> 0
and ub.balancemodeid in (4,8,9,17)
and ub.usersbalancecategory = 1
) uub
group by uub.usersname)
and uuu.usersid = uuub.usersid
order by uuub.usersbalancetimestamp desc
;

/*

select max(uub.usersbalanceid)
from (select u.usersname, u.usersemail, ub.*
from users u
left outer join usersbalance ub on (ub.usersid = u.usersid)
where ((ub.usergamesid <> 0) or (ub.gamesid <> 0))
-- and ub.usersbalancevalue <> 0
and ub.balancemodeid in (4,8,9,17)
and ub.usersbalancecategory = 1
) uub
group by uub.usersname
;


select *, from_unixtime(usersbalancetimestamp,"%Y-%m-%d")
FROM racetrackwarriors.usersbalance
where usersbalanceid in (select max(usersbalanceid)
FROM racetrackwarriors.usersbalance
where usergamesid <> 0 
and usersbalancevalue <> 0
and balancemodeid in (4,8,9,17)
-- and (usersbalancetype in ('a','n'))
group by usersid)
order by usersbalancetimestamp desc
;

select *, from_unixtime(usersbalancetimestamp,"%Y-%m-%d")
FROM racetrackwarriors.usersbalance
where usersbalanceid in (select max(usersbalanceid)
FROM racetrackwarriors.usersbalance
where usergamesid <> 0 
and usersbalancevalue <> 0
and balancemodeid in (4,8,9,17)
-- and (usersbalancetype in ('a','n'))
group by usersid)
order by usersbalancetimestamp desc
;

SELECT usersid, max(usergamesid), from_unixtime(usersbalancetimestamp,"%Y-%m-%d"), usersbalancetype, usersbalancevalue
FROM racetrackwarriors.usersbalance
group by usersid
order by usersbalancetimestamp desc
;

*/
