SELECT 
  count(distinct(GameDate)) as 'NumGameDays' 
, count(distinct(GameDateId)) as 'NumGamesPlayed'
, count(distinct(GameId)) as 'NumDistinctGamesPlayed'
, sum(NumEntrants) as 'TotalEntries'
, sum(NumEntrants) / count(distinct(GameDate)) as 'AvgEntiesPerDay'
, avg(EntryFee) as 'AvgEntryFee'
FROM 
  racetrackwarriors.V_GamesReport20150101_Built_20150902_inner
;

SELECT 
  monthname(GameDate) as 'Month'
, count(distinct(GameDate)) as 'NumGameDays' 
, count(distinct(GameDateId)) as 'NumGamesPlayed'
, count(distinct(GameId)) as 'NumDistinctGamesPlayed'
, sum(NumEntrants) as 'TotalEntries'
, sum(NumEntrants) / dayofmonth(last_day(GameDate)) as 'AvgEntriesPerDay'
, avg(EntryFee) as 'AvgEntryFee'
FROM 
  racetrackwarriors.V_GamesReport20150101_Built_20150902_inner
group by month(GameDate)
;

SELECT
count(ug.usersid) as 'NumUsersPerGameDay'
, iv.*
FROM 
  racetrackwarriors.V_GamesReport20150101_Built_20150902_inner iv
  inner join usergames ug on (ug.gamesid = iv.GameId)
group by GameDateId
order by GameDateId, usersid
;

SELECT
MonthName(GameDate)
, count(Distinct GameDateId) as 'NumUniqueGameDaysPerMonth'
, count(Distinct ug.gamesid) as 'NumUniqueGamesPerMonth'
, count(Distinct ug.usersid) as 'NumUniqueUsersPerGameMonth'
FROM 
  racetrackwarriors.V_GamesReport20150101_Built_20150902_inner iv
  inner join usergames ug on (ug.gamesid = iv.GameId)
group by month(GameDate)
order by GMT, usersid
;

SELECT
GameDate
, count(Distinct ug.gamesid) as 'NumUniqueGamesPerDay'
, count(Distinct ug.usersid) as 'NumUniqueUsersPerGameDay'
FROM 
  racetrackwarriors.V_GamesReport20150101_Built_20150902_inner iv
  inner join usergames ug on (ug.gamesid = iv.GameId)
group by dayofyear(GameDate)
order by GMT, usersid
;

SELECT
  *
FROM 
  racetrackwarriors.V_GamesReport20150101_Built_20150902
;

/*
select 
  gd.GameDate
, gd.GameDateId
, gd.GameMode
, concat(gd.GameName,' (',gd.GameId,')') as Game
, gd.MinEntries
, gd.MaxEntries
, gd.NumEntrants
, gd.ReachedMin
, gd.Filled
, gd.EntryFee
, gd.PrizeAmount
, gd.TotalPoolCalculated
, gd.TakeoutPercent
, gd.TakeoutValue
, gd.TakeoutValueCalculated
, gd.WinningsCalculated
, gd.PrivacyMode
, gd.CreatedBy
, if(gd.CreationMode = 2,concat(u.usersname,' (',u.usersid,')'),'Admin') as 'CreatedByUser'
, concat(s.statusvalue, ' (',gd.StatusId,')') as 'Status'
, concat(gt.gamestypevalue, ' (',gd.GameTypeId,')') as 'GameType'
, concat(gft.gamesfeetypedescription, ' (',gd.FeeTypeId,')') as 'FeeType'
, gft.gamesfeetypevalue as 'FeeTypeValue'
, concat(gpt.gamesprizetypedescription, ' (',gd.PrizeTypeId,')') as 'PrizeType'
, concat(ct.categoriestypename, ' (',gd.CategoryTypeId,')') as 'CategoryType'
, gd.PrizeTypeId
from
(SELECT 
  from_unixtime(gmd.gamesdatevalue_gmt,"%Y-%m-%d") as 'GameDate'
, gmd.gamesdateid as 'GameDateId'
, g.gamesid as 'GameId'
, if(g.gamesmode = 1,'RTW',if(g.gamesmode=2,'JD','Other')) as 'GameMode'
, g.gamesname as 'GameName'
, g.gamesminentries as 'MinEntries'
, g.gamesmaxentries as 'MaxEntries'
, g.gamescurrententries as 'NumEntrants'
, if (g.gamescurrententries >= g.gamesminentries,1,0) as 'ReachedMin'
, if (g.gamescurrententries >= g.gamesmaxentries,1,0) as 'Filled'
, truncate(g.gamesentrypointfee,2) as 'EntryFee'
, truncate(g.gamesprizeamount,2) as 'PrizeAmount'
, truncate((g.gamesentrypointfee * g.gamesmaxentries),2) as 'TotalPoolCalculated'
, g.gamestakeoutpercentage as 'TakeoutPercent'
, g.gamestakeoutvalue as 'TakeoutValue'
, truncate(((g.gamesentrypointfee * g.gamesmaxentries) * (g.gamestakeoutpercentage/100)),2) as 'TakeoutValueCalculated'
, truncate(((g.gamesentrypointfee * g.gamesmaxentries) - ((g.gamesentrypointfee * g.gamesmaxentries) * (g.gamestakeoutpercentage/100))),2) as 'WinningsCalculated'
, g.gamescategoriestypeid as 'CategoryTypeId'
, g.gamesprizetypeid as 'PrizeTypeId'
, g.gamestypeid as 'GameTypeId'
, g.gamesfeetypeid as 'FeeTypeId'
, g.usersid as 'CreatingUserId'
, g.statusid as 'StatusId'
, if(g.gamescreationmode = 1,'Admin',if(g.gamescreationmode = 2, 'User','Unknown')) as 'CreatedBy'
, g.gamescreationmode as 'CreationMode'
, if(g.gamesprivacymode = 0, 'Admin', if(g.gamesprivacymode = 1, 'Public', if(g.gamesprivacymode = 2, 'Private', 'Unknown'))) as 'PrivacyMode'
, from_unixtime(g.gamescreationdate,"%Y-%m-%d") as 'GameCreationDate'
-- , g.* 
FROM gamesdate gmd 
	LEFT JOIN games g ON g.gamesid = gmd.gamesid
where (gmd.gamesdatevalue_gmt >= UNIX_TIMESTAMP('2015-01-01 00:00:00'))
and (g.gamesastest = '0')
and lower(g.gamesname) not like "%test%"
order by gmd.gamesdatevalue_gmt asc, g.gamesid asc) gd
LEFT JOIN gamestype gt ON gt.gamestypeid = gd.GameTypeId
LEFT JOIN gamesfeetype gft ON gft.gamesfeetypeid = gd.FeeTypeId
LEFT JOIN gamesprizetype gpt ON gpt.gamesprizetypeid = gd.PrizeTypeId
LEFT JOIN categoriestype ct ON ct.categoriestypeid = gd.CategoryTypeId
LEFT JOIN users u ON u.usersid = gd.CreatingUserId
LEFT JOIN status s ON s.statusid = gd.StatusId
having FeeTypeValue = 'a' -- amount
   and gd.PrizeTypeId = 2 -- dollars
order by gd.GameDate, gd.GameId, gd.GameMode, gd.PrizeAmount Desc
;
*/

/**
-- select gd.GameType, gd.GameDate, count(GameType) as 'NumGames', sum(gd.PrizeAmount) as 'DaysPrizeAmount', sum(ReachedMin) as ReachedMin, sum(Filled) as 'NumFilled', sum(Filled) * gd.PrizeAmount as 'FilledPrizeTotal'
-- select gd.GameType, gd.GameDate, count(GameType) as 'NumGames', sum(gd.PrizeAmount) as 'DaysPrizeAmount', sum(ReachedMin) as ReachedMin, sum(Filled) as 'NumFilled', sum(FilledPrizeAmount) as 'FilledPrizeTotal'
select gd.GameType, gd.GameCreationDate, gd.gamesname as 'GameName', gd.PrizeAmount as 'PrizeAmount', gd.gamesminentries as 'MinEntries', gd.gamesmaxentries as 'MaxEntries', gd.gamescurrententries as 'NumEntrants', ReachedMin, Filled, FilledPrizeAmount
from
(SELECT from_unixtime(g.gamescreationdate,"%Y-%m-%d") as 'GameCreationDate', 
-- gt.gamestypevalue, 
-- gft.gamesfeetypedescription, 
-- gpt.gamesprizetypedescription,
-- ct.categoriestypename, 
if(g.gamesmode = 1,'RTW',if(g.gamesmode=2,'JD','Other')) as 'GameType',
if (g.gamescurrententries >= g.gamesmaxentries,1,0) as 'Filled',
if (g.gamescurrententries >= g.gamesminentries,1,0) as 'ReachedMin',
g.gamesentrypointfee as 'EntryFee',
g.gamesprizeamount as 'PrizeAmount',
if (g.gamescurrententries >= g.gamesmaxentries,g.gamesprizeamount,0) as 'FilledPrizeAmount',
g.* 
FROM racetrackwarriors.games g
-- ,racetrackwarriors.gamestype gt
-- ,racetrackwarriors.gamesfeetype gft
-- ,racetrackwarriors.gamesprizetype gpt
-- ,racetrackwarriors.categoriestype ct
where (g.gamescreationdate >= UNIX_TIMESTAMP('2015-01-01 00:00:00'))
and (g.gamesastest = '0')
-- and g.gamesmode = 2
and lower(g.gamesname) not like "%test%"
-- and gt.gamestypeid = g.gamestypeid
-- and gft.gamesfeetypeid = g.gamesfeetypeid
-- and gpt.gamesprizetypeid = g.gamesprizetypeid
-- and ct.categoriestypeid = g.gamescategoriestypeid
-- group by g.gamescreationdate
order by g.gamescreationdate asc, g.gamesid asc) gd
-- group by gd.GameType, gd.GameDate, gd.PrizeAmount
-- order by gd.GameType, gd.GameDate, gd.PrizeAmount desc
-- group by gd.GameType, gd.GameDate
order by gd.GameType, gd.GameCreationDate, gd.PrizeAmount Desc
;
**/
