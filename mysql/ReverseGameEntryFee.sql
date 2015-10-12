select * from games
where gamesid = 7946
;

select usersid, usergamesid from usergames
where gamesid = 7946
;

select * from users
where usersid in (select usersid from usergames where gamesid = 7946)
;

select * from usersbalance
where usergamesid in (select usergamesid from usergames where gamesid = 7946)
order by usersbalancetimestamp asc
;

insert into usersbalance (usersid, usergamesid, usersbalancetype, usersbalancevalue, usersbalancesource, balancemodeid, usersbalancetimestamp, userstransactionid, usersbalancecategory, usersbalanceupdatefrom)
values
 ( 210, 13386, 'a', 0, 'c', '6', UNIX_TIMESTAMP(NOW()), -99, 1, 'c'),
 ( 210, 13386, 'a', 1, 'c', '6', UNIX_TIMESTAMP(NOW()), -99, 2, 'c'),
 (1713, 13396, 'a', 1, 'c', '6', UNIX_TIMESTAMP(NOW()), -99, 1, 'c'),
 (1713, 13396, 'a', 0, 'c', '6', UNIX_TIMESTAMP(NOW()), -99, 2, 'c'),
 ( 147, 13419, 'a', 1, 'c', '6', UNIX_TIMESTAMP(NOW()), -99, 1, 'c'),
 ( 147, 13419, 'a', 0, 'c', '6', UNIX_TIMESTAMP(NOW()), -99, 2, 'c'),
 (2066, 13422, 'a', 1, 'c', '6', UNIX_TIMESTAMP(NOW()), -99, 1, 'c'),
 (2066, 13422, 'a', 0, 'c', '6', UNIX_TIMESTAMP(NOW()), -99, 2, 'c'),
 ( 997, 13448, 'a', 1, 'c', '6', UNIX_TIMESTAMP(NOW()), -99, 1, 'c'),
 ( 997, 13448, 'a', 0, 'c', '6', UNIX_TIMESTAMP(NOW()), -99, 2, 'c')
;


