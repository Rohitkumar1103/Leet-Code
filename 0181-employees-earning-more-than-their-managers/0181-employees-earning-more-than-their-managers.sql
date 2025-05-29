# Write your MySQL query statement below
Select E.name AS Employee
From Employee E
Join Employee M on E.managerId = M.id
where E.salary >M.salary;