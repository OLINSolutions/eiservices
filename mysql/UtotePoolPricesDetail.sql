SELECT 
    ures.*
  , pp.* 
  , pr.*
FROM 
    utoteResults ures
	inner join utotePoolPrices pp on (pp.idParent = ures.idUtoteResult)
    inner join utotePrices pr on (pr.idParent = pp.idUtotePoolPrice)
ORDER BY
	ures.idUtoteResult desc, pp.idUtotePoolPrice asc
;