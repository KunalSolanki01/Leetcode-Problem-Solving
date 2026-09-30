# Write your MySQL query statement below
SELECT 
    E1.name 
FROM 
    Employee E1
LEFT JOIN 
    Employee E2
ON E1.ID = E2.managerId  
GROUP BY E1.ID,E1.NAME
HAVING COUNT(E1.ID)>=5;