SELECT m.Name AS Employee
FROM Employee e
JOIN Employee m ON m.ManagerId = e.id
WHERE m.Salary>e.Salary
