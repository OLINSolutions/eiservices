/*

SET @lWin = 0;
SET @lPlace = 0;
SET @lShow = 0;

update usersresult usre
set
	usre.usersresultwinamount = @lWin
  , usre.usersresultshowamount = @lPlace
  , usre.usersresultplaceamount = @lShow
  , usre.usersresulttotalamount = ( @lWin + @lPlace + @lShow )
where
	usre.usersresultid in (161340,161345)
;

update usergames usga
set
	usga.standingamount = usga.standingamount - 8.1
where
	usga.usergamesid in (25417, 25561)
;

update usergames usga
set
	usga.standingamount = usga.standingamount = ( @lWin + @lPlace + @lShow )
where
	usga.usergamesid in (25604, 25609, 25615, 25623, 25629, 25637, 25666, 25671, 25672, 25678, 25684, 25702, 25712, 25714, 25728, 25736, 25737)
;

*/


SELECT
	mp.mypicksid, mp.usersid, mp.racesid, mp.mypicksprimaryhorsesid 'MP Pri', mp.mypicksalthorsesid 'MP Alt', mp.usergamesid, mp.mypicksstatus 'MP status', mp.mypicksisresultcalculate 'MP Res Calc?'
  , date(from_unixtime(mp.mypicksgameracemapdate)) 'mp date'
  , hop.horsesname 'Pri Name', hop.horsesscratchindicator 'Pri Scr?'
  , resp.resultswinamount 'Pri Win', resp.resultsplaceamount 'Pri Plc', resp.resultsshowamount 'Pri Shw'
  , hoa.horsesname 'Alt Name', hoa.horsesscratchindicator 'Alt Scr?'
  , resa.resultswinamount 'Alt Win', resa.resultsplaceamount 'Alt Plc', resa.resultsshowamount 'Alt Shw'
  , ur.*
  , ug.*
-- , grm.*
--   , date(from_unixtime(grm.gamesracemaptime)) 'grm date'
FROM 
	mypicks mp
    left outer join results resp on ((resp.racesid = mp.racesid) and (resp.resultshorsesid = mp.mypicksprimaryhorsesid))
    left outer join horses hop on (hop.horsesid = resp.resultshorsesid)
    left outer join results resa on ((resa.racesid = mp.racesid) and (resa.resultshorsesid = mp.mypicksalthorsesid))
    left outer join horses hoa on (hoa.horsesid = resa.resultshorsesid)
    inner join usersresult ur on (ur.mypicksid = mp.mypicksid)
    inner join usergames ug on (ug.usergamesid = mp.usergamesid)
--     inner join gamesracemap grm on ((grm.gamesid = ug.gamesid) and (grm.racesid = ur.racesid))
--   inner join gamesracemap grm on ((date(from_unixtime(grm.gamesracemaptime)) = date(from_unixtime(mp.mypicksgameracemapdate))) and (grm.gamesid = ug.gamesid) and (grm.racesid = ur.racesid))
where 
	mp.racesid = 48401
-- and ((mp.mypicksprimaryhorsesid in (417868)) OR ((hop.horsesscratchindicator = 'Y') AND (mp.mypicksALThorsesid in (417868))))
--  and (ur.usersresultwinamount = 0 and ur.usersresultshowamount = 0 and ur.usersresultplaceamount = 0)
;

/*
racesid:
48401
48419
48791
 and ((mp.mypicksprimaryhorsesid in (420974, 420968, 420971)) OR ((hop.horsesscratchindicator = 'Y') AND (mp.mypicksALThorsesid in (420974, 420968, 420971))))
48582
 and ((mp.mypicksprimaryhorsesid in (419169, 419170, 419174)) OR ((hop.horsesscratchindicator = 'Y') AND (mp.mypicksALThorsesid in (419169, 419170, 419174))))

SELECT 
	mp.* 
FROM 
	mypicks mp
where 
	mp.racesid = 48791

;

select
	res.*
from
	results res
where
	res.racesid = 48791
;

select
	ra.*
from
	races ra
where
	ra.racesid = 48791
;
*/

/*

select
	count(*)
from
	mypicks mp
where
	mp.mypickswinamount = 0 and mp.mypicksplaceamount = 0 and mp.mypicksshowamount = 0
;

update
	utoteRunnersHistory urunh
set
	urunh.Scratch = 0
where
	idUtoteRunner = 111575
;

update
	utoteEntriesHistory uenth
set
	uenth.Scratch = 0
where
	idUtoteEntry = 109958
;

update
	horses ho
set
	ho.horsesscratchindicator = 'N'
where
	ho.horsesid = 417698
;

*/


