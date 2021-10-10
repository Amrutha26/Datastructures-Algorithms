SELECT * 
FROM Cinema 
WHERE (id%2 <> 0) && (description <> "boring") 
ORDER BY rating DESC;
