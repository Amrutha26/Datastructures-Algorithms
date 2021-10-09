
SELECT
    W1.id
FROM
    Weather W1
INNER JOIN
    Weather W2
ON W1.Temperature > W2.Temperature AND DATE(W1.RecordDate) = DATE(W2.RecordDate + INTERVAL 1 DAY)
