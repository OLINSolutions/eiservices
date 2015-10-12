CREATE VIEW `V_GamesReport20150101_Built_20150902` AS
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
from `V_GamesReport20150101_Built_20150902_inner` gd
LEFT JOIN gamestype gt ON gt.gamestypeid = gd.GameTypeId
LEFT JOIN gamesfeetype gft ON gft.gamesfeetypeid = gd.FeeTypeId
LEFT JOIN gamesprizetype gpt ON gpt.gamesprizetypeid = gd.PrizeTypeId
LEFT JOIN categoriestype ct ON ct.categoriestypeid = gd.CategoryTypeId
LEFT JOIN users u ON u.usersid = gd.CreatingUserId
LEFT JOIN status s ON s.statusid = gd.StatusId
having gd.FeeTypeId = 2 -- 'a' -- amount
   and gd.PrizeTypeId = 2 -- dollars
order by gd.GameDate, gd.GameId, gd.GameMode, gd.PrizeAmount Desc
;