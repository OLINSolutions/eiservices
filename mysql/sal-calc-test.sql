select length(totWinningsValues)
from 
	(select group_concat(
		distinct totalWinnings
        order by totalWinnings desc
        ) as totWinningsValues
	from eqb_jockeys) as twv
;

show global variables like 'group_concat_max_len';

show global variables like 'max_allowed_packet';

set @@group_concat_max_len := @@max_allowed_packet;

show variables like 'group_concat_max_len';

