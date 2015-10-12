SELECT 
	jdres.*
  , h.*
  , r.*
FROM 
	jockeysresults jdres
    inner join horses h on (h.horsesid = jdres.horsesid)
    inner join races r on (r.racesid = h.racesid)
WHERE
	jdres.jockeysresultsracetag like concat('%',date_format(curdate(),'%Y%m%d'),'%')
order by jdres.jockeysresultsracetag, h.horsesprogramnumber desc, jdres.jockeysresultsid desc
-- order by r.tracksid, r.racesnumber, h.horsesprogramnumber desc, resultsid desc
limit 1000;