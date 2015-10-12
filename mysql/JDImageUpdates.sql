update eqb_jockeys ej
set image = 'https://static.racetrackwarriors.com/assets/jockey-images/JockeySilhouette-01.jpg',
thumb = 'https://static.racetrackwarriors.com/assets/jockey-images/t.JockeySilhouette-01.jpg'
where ej.jockeysexternalpartyid in (137, 100175, 108199, 150151, 153296, 113773, 150645, 52700, 179, 149938, 146273, 200, 7978, 120310, 107209, 152730, 151433, 108685, 313, 19105, 92793, 124656, 1099, 149805, 132226, 136123, 17763, 122956, 81840, 12044, 1813, 129141, 152733, 150156, 104106, 104796, 53631, 135108, 118219, 109298, 120034, 135063, 16667, 137160, 83310, 124, 133412, 141432, 153819, 144545, 153406, 155088, 139466, 149078, 154180, 152521, 1944, 124362, 126149, 155333, 147900)
;

select count(*)
from eqb_jockeys ej
where image like '%JockeySilhouette%'
;

select count(*) from eqb_jockeys;

select count(*) from eqb_jockeys ej
where ej.jockeysexternalpartyid in (57935, 2089, 142725, 109183, 147108, 16787, 1770, 117931, 102032, 2695, 127153, 108912, 122644, 150157, 125057, 135658, 124456, 74725, 117753, 119101, 502, 109379, 2579, 107418, 98784, 82464, 149772, 152588, 58000, 2331, 108148, 214, 1339, 126902, 136048, 150158, 153319, 109036, 123498, 133402, 2147, 1883, 124006, 110011, 116545, 1811, 368, 2439, 101167, 1452, 58145, 95630, 1240, 1521, 111679, 83365, 102369, 101763, 70746, 1432, 121307, 136853, 140260, 120381, 117079, 4065, 139703, 124652, 6055, 124197, 151861, 2215, 150648, 118293, 86192, 330, 145776, 134095, 122587, 35, 17747, 106737, 126441, 85035, 6549, 147792, 147082, 108268, 114441, 101988, 560, 2387, 86004, 1419, 153889, 1740, 86001, 307, 113484, 1438, 11823, 109417, 903, 81995, 109405, 137266, 150833, 1484, 121108, 141890, 149157, 113491, 154538, 1239, 135581, 1782, 152622, 1175, 1387, 101470, 101158, 420, 20115, 143555, 137099, 15722, 602, 112887, 148128, 150154, 782, 152630, 151690, 51790, 68547, 143666, 59401, 151536, 108812, 147111, 147110, 113722, 133417, 110586, 57433, 957, 126829, 126609, 563, 72715, 111515, 100755, 152688, 134511, 86196, 852, 144056, 151342, 74227, 118620, 2184, 136837, 155328, 141732, 154563, 153637, 133645, 1292, 154782)
;

select count(*) as 'Found JG Member Picks' from eqb_jockeys ej
where ej.jockeysexternalpartyid in (57935, 2089, 142725, 109183, 147108, 1770, 117931, 102032, 2695, 127153, 108912, 122644, 150157, 125057, 135658, 124456, 74725, 117753, 119101, 502, 109379, 2579, 107418, 98784, 82464, 149772, 152588, 58000, 2331, 108148, 214, 1339, 126902, 136048, 150158, 153319, 109036, 123498, 133402, 2147, 1883, 124006, 110011, 1811, 368, 2439, 101167, 1452, 58145, 95630, 1240, 1521, 111679, 83365, 101763, 70746, 1432, 121307, 136853, 140260, 120381, 4065, 124652, 6055, 151861, 2215, 150648, 118293, 86192, 330, 145776, 134095, 122587, 17747, 106737, 126441, 85035, 6549, 147082, 108268, 101988, 560, 2387, 86004, 1740, 86001, 113484, 1438, 11823, 109417, 903, 81995, 109405, 137266, 150833, 1484, 121108, 141890, 149157, 154538, 135581, 1782, 152622, 1175, 1387, 420, 20115, 143555, 137099, 602, 112887, 148128, 150154, 782, 152630, 151690, 51790, 68547, 143666, 59401, 151536, 108812, 147111, 147110, 113722, 133417, 110586, 957, 126829, 126609, 563, 72715, 111515, 100755, 134511, 86196, 151342, 74227, 118620, 2184, 136837, 155328, 141732, 154563, 133645, 1292, 154782)
;

select count(*) as 'Missing JG Member Picks' from eqb_jockeys ej
where ej.jockeysexternalpartyid in (137, 100175, 108199, 150151, 153296, 113773, 150645, 52700, 179, 149938, 146273, 200, 7978, 120310, 107209, 152730, 151433, 108685, 313, 19105, 92793, 124656, 1099, 149805, 132226, 136123, 17763, 122956, 81840, 12044, 1813, 129141, 152733, 150156, 104106, 104796, 53631, 135108, 118219, 109298, 120034, 135063, 16667, 137160, 83310, 124, 133412, 141432, 153819, 146590, 144545, 153406, 155088, 139466, 149078, 154180, 152521, 1944, 124362, 126149, 155333, 147900)
; 

select ej.id as 'No.', ej.jockeyname as 'Jockey Name', ej.jockeysexternalpartyid as 'Jockey ID' from eqb_jockeys ej
where ej.jockeysexternalpartyid in (137, 100175, 108199, 150151, 153296, 113773, 150645, 52700, 179, 149938, 146273, 200, 7978, 120310, 107209, 152730, 151433, 108685, 313, 19105, 92793, 124656, 1099, 149805, 132226, 136123, 17763, 122956, 81840, 12044, 1813, 129141, 152733, 150156, 104106, 104796, 53631, 135108, 118219, 109298, 120034, 135063, 16667, 137160, 83310, 124, 133412, 141432, 153819, 146590, 144545, 153406, 155088, 139466, 149078, 154180, 152521, 1944, 124362, 126149, 155333, 147900)
order by ej.jockeyslastname
; 

update eqb_jockeys ej
set image = concat('https://static.racetrackwarriors.com/assets/jockey-images/',ej.jockeysexternalpartyid,'.jpg'),
thumb = concat('https://static.racetrackwarriors.com/assets/jockey-images/t.',ej.jockeysexternalpartyid,'.jpg')
where ej.jockeysexternalpartyid in (109298, 146273, 146590, 150151, 155333)
;

select * from eqb_jockeys ej
where ej.jockeysexternalpartyid in (109298, 146273, 146590, 150151, 155333)
;

update eqb_jockeys ej
set image = concat('https://static.racetrackwarriors.com/assets/jockey-images/',ej.jockeysexternalpartyid,'.jpg'),
thumb = concat('https://static.racetrackwarriors.com/assets/jockey-images/t.',ej.jockeysexternalpartyid,'.jpg')
where ej.jockeysexternalpartyid in (200, 100175)
;

select * from eqb_jockeys ej
where ej.jockeysexternalpartyid in (200, 100175)
;

update eqb_jockeys ej
set image = concat('https://static.racetrackwarriors.com/assets/jockey-images/',ej.jockeysexternalpartyid,'.jpg'),
thumb = concat('https://static.racetrackwarriors.com/assets/jockey-images/t.',ej.jockeysexternalpartyid,'.jpg')
where ej.jockeysexternalpartyid in (132226, 150156, 151433, 152521, 152730, 154180)
;

select * from eqb_jockeys ej
where ej.jockeysexternalpartyid in (132226, 150156, 151433, 152521, 152730, 154180)
;

update eqb_jockeys ej
set image = concat('https://static.racetrackwarriors.com/assets/jockey-images/',ej.jockeysexternalpartyid,'.jpg'),
thumb = concat('https://static.racetrackwarriors.com/assets/jockey-images/t.',ej.jockeysexternalpartyid,'.jpg')
where ej.jockeysexternalpartyid in (1099, 1813, 12044, 104796, 107209, 120034, 129141)
;

select * from eqb_jockeys ej
where ej.jockeysexternalpartyid in (1099, 1813, 12044, 104796, 107209, 120034, 129141)
;

update eqb_jockeys ej
set image = concat('https://static.racetrackwarriors.com/assets/jockey-images/',ej.jockeysexternalpartyid,'.jpg'),
thumb = concat('https://static.racetrackwarriors.com/assets/jockey-images/t.',ej.jockeysexternalpartyid,'.jpg')
where ej.jockeysexternalpartyid in (124, 12044, 17763, 83310, 149078)
;

select * from eqb_jockeys ej
where ej.jockeysexternalpartyid in (124, 12044, 17763, 83310, 149078)
;

update eqb_jockeys ej
set image = concat('https://static.racetrackwarriors.com/assets/jockey-images/',ej.jockeysexternalpartyid,'.jpg'),
thumb = concat('https://static.racetrackwarriors.com/assets/jockey-images/t.',ej.jockeysexternalpartyid,'.jpg')
where ej.jockeysexternalpartyid in (19105 ,92793 ,108199 ,141432 ,153296 ,155333
,52700 ,81840 ,113773 ,122956 ,126149 ,133412
,16667 ,104106 ,118219,135108 ,144545,152733)
;

select * from eqb_jockeys ej
where ej.jockeysexternalpartyid in (19105 ,92793 ,108199 ,141432 ,153296 ,155333
,52700 ,81840 ,113773 ,122956 ,126149 ,133412
,16667 ,104106 ,118219,135108 ,144545,152733)
;

