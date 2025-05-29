# Write your MySQL query statement below
Select C.name As Customers
From Customers C
Left Join Orders O on c.id= O.customerId
where O.customerId Is NULL;