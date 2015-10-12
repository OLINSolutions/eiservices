-- select GameId, GameName, GameDate, Username, Phase, count(LifelineID) 'Num Purchased', sum(Paid) 'Total Paid', UserID, Email, Name
select GameId, GameName, GameDate, Username, Phase, PurchaseDate, Paid, Mode, BalanceCategory, UserID, Email, Name
from
(SELECT ul.gamesid as 'GameId', g.gamesname as 'GameName', from_unixtime(g.gamescreationdate,"%Y-%m-%d") as 'GameDate', u.usersid as 'UserID', u.usersname as 'Username', u.usersemail as 'Email',
concat(trim(up.usersprofilefirstname), ' ', trim(up.usersprofilelastname)) as 'Name', 
ul.userslifelinephase as 'Phase', ul.userslifelineid as 'LifelineID', from_unixtime(ub.usersbalancetimestamp,"%Y-%m-%d") as 'PurchaseDate', ub.usersbalancevalue as 'Paid', if(ub.usersbalancecategory = 1,'Normal','Promotional') as 'BalanceCategory', ul.userslifelinevalue as 'Value', ul.userslifelinestatus as 'Status', from_unixtime(ul.userslifelinepurchasedate,"%Y-%m-%d") as 'Purchased', from_unixtime(ul.userslifelineuseddate,"%Y-%m-%d") as 'Used', if(ul.userslifelinemode = 1,'Purchased','Free') as 'Mode'
FROM 
	racetrackwarriors.userslifeline ul, 
	racetrackwarriors.users u, 
    racetrackwarriors.usersprofile up, 
    racetrackwarriors.usersbalance ub,
    racetrackwarriors.games g
where 
	u.usersid = ul.usersid
and up.usersid = ul.usersid
and ub.usersbalanceid = ul.usersbalanceid
and ub.usersbalancevalue > 0
and g.gamesid = ul.gamesid
and g.gamesastest = '0'
and lower(g.gamesname) not like '%test%'
and lower(u.usersname) not like '%heffy%'
and lower(u.usersname) not like '%gypsy11%'
and lower(u.usersname) not like '%rupert%'
and lower(u.usersemail) not like '%test%'
and lower(u.usersemail) not like '%equusinteractive%'
and lower(concat(trim(up.usersprofilefirstname), ' ', trim(up.usersprofilelastname))) not like '%prabal%'
and lower(concat(trim(up.usersprofilefirstname), ' ', trim(up.usersprofilelastname))) not like '%nathan hyland%'
and lower(concat(trim(up.usersprofilefirstname), ' ', trim(up.usersprofilelastname))) not like '%test%'
and lower(concat(trim(up.usersprofilefirstname), ' ', trim(up.usersprofilelastname))) not like '%viens%'
and (g.gamescreationdate >= UNIX_TIMESTAMP('2015-01-01 00:00:00'))
order by 
	ul.gamesid, 
    up.usersprofilelastname asc, 
    ul.userslifelinephase) ll
-- group by GameId, Username, Phase
order by GameId, Username, Phase
;
