SELECT * FROM racetrackwarriors.usersbalance;

select 
	ub.usersbalanceid
  , ub.usersid
  , ub.gamesid
  , ub.usergamesid
  , if (lower(ub.usersbalancetype) = 'p', 'Point', if (lower(ub.usersbalancetype) = 'a', 'Amount', 'Credit Card')) 'Type'
  , ub.usersbalancevalue 'Balance'
  , if (lower(ub.usersbalancesource) = 'c', 'Credit', 'Debit') 'Source'
  , bm.balancemodedescription 'Balance Mode'
  , from_unixtime(ub.usersbalancetimestamp) 'Timestamp'
  , if (lower(ub.usersbalancecategory) = 1, 'Normal', 'Promotional') 'Category'
  , if (lower(ub.usersbalanceupdatefrom) = 'c', 'Cron', 'Admin Panel') 'Update From'
from usersbalance ub
left outer join balancemode bm on (bm.balancemodeid = ub.balancemodeid)
where usersid=2696
order by usersbalanceid desc

