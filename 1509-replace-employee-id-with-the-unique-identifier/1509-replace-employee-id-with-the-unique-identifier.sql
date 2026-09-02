/* Write your T-SQL query statement below */
SELECT eu.unique_id, name FROM Employees AS e
LEFT JOIN EmployeeUNI AS eu
ON e.id = eu.id