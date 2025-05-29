# Write your MySQL query statement below
Select email
From person
Group by email
Having COUNT(email)>1;