SELECT MAX(Salary) AS SecondHighestSalary  
FROM Employee
WHERE Salary NOT IN(SELECT MAX(Salary) FROM Employee)
ORDER BY Salary DESC
LIMIT 1
