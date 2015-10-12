SELECT
    time(upth.LastUpdateTime) 'Last Upd'
  , tr.tracksuniquecode 'EQBCode'
   , tr.tracksname 'Track Name'
  , ra.racesnumber 'R#'
  , upth.* 
FROM 
	UpdatePostTimeHistory upth
    inner join races ra on (ra.racesid = upth.pRacesId)
    inner join tracks tr on (tr.tracksid = ra.tracksid)
WHERE
	upth.LastUpdateTime >= curdate()
ORDER BY 
--	tr.tracksuniquecode asc, 
--  ra.racesnumber asc, 
  upth.LastUpdateTime desc
;

/*

Delete from UpdatePostTimeHistory
where idUpdatePostTimeHistory <= 4212
;

*/

