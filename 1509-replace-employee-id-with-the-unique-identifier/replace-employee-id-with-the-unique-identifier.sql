# Write your MySQL query statement below
Select emp.unique_id , e.name 
From Employees e LEFT join EmployeeUNI emp
ON e.id = emp.id;
