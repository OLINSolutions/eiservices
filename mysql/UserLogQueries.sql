select * from games where gamesentrypointfee = 75;

select gamesentrypointfee, gamesid, gamesname, gamesfeetypeid, gamesprizeamount, gamesprizetypeid, from_unixtime(gamescreationdate,"%Y-%m-%d")
from games
where gamesentrypointfee > (select max(costmodelid) from costmodel)
order by gamesid desc
;

select * from games
order by gamesid desc
;

SELECT concat(u.usersname, " (", ul.UsersId, ")") as 'Username', ul.UserLogPageName as 'Page', max(ul.UserLogTimestamp) as 'When'
FROM users u, UserLog ul
where u.usersid = ul.UsersId
and ul.UserLogPageName = 'register'
and ul.UserLogTimestamp > '2014-06-30'
group by u.usersname
order by ul.UserLogTimestamp desc, u.usersname
;

