# Write your MySQL query statement below
Select 
d.name AS Department,
e.name AS Employee,
e.salary AS Salary
FROM 
   Employee e 
   JOIN Department d ON e.departmentId = d.id
   where 
        (
            Select COUNT(Distinct salary)
            from  Employee e2
            where e2.departmentId = e.departmentId AND e2.salary >= e.salary
        ) <= 3
        order by 
        Department, Salary Desc;