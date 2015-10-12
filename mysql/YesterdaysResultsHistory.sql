
-- Pool Prices
select
	ueveh.EventInfo 'Date'
  , ueveh.EventId 'Event'
  , ueveh.TrackName 'Track'
  , ueveh.TrackType 'Type'
  , ueveh.rtwTracksId 'tracksid'
  , ueveh.RaceList 'Race List'
  , uresh.RaceId 'Race#'
  , uresh.RTWracesid 'racesid'
  , uresh.Winners
  , uresh.Scratches
  , upph.PoolId
  , upph.PoolName
  , upph.Refund
  , upph.HasPrices
  , uprh.Finish
  , uprh.`Exchange`
  , uprh.Hold
  , uprh.Winnings
  , uprh.Wager
  , uprh.PriceAmount
FROM
	utoteEventsHistory ueveh
    inner join utoteResultsHistory uresh on (uresh.idUtoteEvent = ueveh.idUtoteEvent)
    inner join utotePoolPricesHistory upph on ((upph.idParent = uresh.idUtoteResult) and (upph.PoolId in ('WIN','PLC','SHW')))
    inner join utotePricesHistory uprh on (uprh.idParent = upph.idUtotePoolPrice)
WHERE
	ueveh.EventInfo = date_format(date_sub(curdate(), interval 1 day),'%e %b %y')
ORDER BY
	ueveh.EventId, uresh.RaceId, upph.PoolId desc
;

-- Positions, Finishers
select
	ueveh.EventInfo 'Date'
  , ueveh.EventId 'Event'
  , ueveh.TrackName 'Track'
  , ueveh.TrackType 'Type'
  , ueveh.rtwTracksId 'tracksid'
  , ueveh.RaceList 'Race List'
  , urah.RaceId 'Race#'
  , urah.RaceStatus 'Status'
  , urah.NumberOfRunners '#Runners'
  , urah.Finish
  , urah.Live
  , uresh.RTWracesid 'racesid'
  , uresh.Winners
  , uresh.Scratches
  , uposh.PositionId
  , ufinh.idUtoteFinisher
  , ufinh.RunnerId
  , ufinh.EntryId
  , ufinh.`Name`
  , ufinh.Jockey
  , urunh.idUtoteRunner
  , urunh.Scratch
  , urunh.Odds
  , uenth.idUtoteEntry
  , uenth.EntryId
  , uenth.Scratch
  , uenth.Position
  , uenth.`Name`
  , ho.horsesid
  , ho.horsesscratchindicator 'Ho Scr?'
  , ho.horsesodds 'Ho Odds'
  , ho.horsespostposition 'Ho Pos'
  , ho.horsesprogramnumber 'Ho Pgm#'
  , ho.horsescoupltypeindicator 'Ho POE?'
  , ho.horsescoupltypevalue 'Ho Entry'
FROM
	utoteEventsHistory ueveh
    inner join utoteResultsHistory uresh on (uresh.idUtoteEvent = ueveh.idUtoteEvent)
    inner join utotePositionsHistory uposh on (uposh.idParent = uresh.idUtoteResult)
    inner join utoteFinishersHistory ufinh on (ufinh.idParent = uposh.idUtotePosition)
    inner join utoteRacesHistory urah on (urah.RTWracesid = uresh.RTWracesid)
    inner join utoteRunnersHistory urunh on ((urunh.idParent = urah.idUtoteRace) and (urunh.RunnerId = ufinh.RunnerId))
    inner join utoteEntriesHistory uenth on (uenth.idParent = urunh.idUtoteRunner)
    left outer join horses ho on (ho.horsesid = uenth.RTWhorsesid)
WHERE
	ueveh.EventInfo = date_format(date_sub(curdate(), interval 1 day),'%e %b %y')
    and uposh.PositionId <= 3
ORDER BY
	ueveh.EventId, uresh.RaceId, uposh.PositionId
;

/*

update
	utoteFinishersHistory ufinh
set
	ufinh.Scratch = 0
where
	idUtoteFinisher = 13241
;

*/

