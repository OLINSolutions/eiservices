CREATE VIEW `V_GamesReport20150101_Built_20150902_inner` AS
SELECT 
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
order by gmd.gamesdatevalue_gmt asc, g.gamesid asc
;