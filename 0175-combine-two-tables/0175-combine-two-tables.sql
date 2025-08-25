# Write your MySQL query statement below
SELECT p.firstName, p.lastName, a.city, a.state
FROM Person AS p
Left JOIN Address AS a
ON p.personID = a.personID;
