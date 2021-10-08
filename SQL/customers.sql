SELECT
    c.name AS customers
FROM
    customers AS c
LEFT JOIN 
    orders AS o
ON o.customerid = c.id
WHERE
    o.customerid IS NULL
