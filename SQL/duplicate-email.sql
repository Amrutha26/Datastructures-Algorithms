SELECT DISTINCT p.Email  
FROM Person p JOIN Person q
ON p.Id != q.Id AND p.Email = q.Email;
