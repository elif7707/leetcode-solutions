# Write your MySQL query statement below
SELECT a.id AS Id
FROM Weather a  -- today
JOIN Weather b  -- yesterday
ON DATEDIFF(a.recordDate, b.recordDate) = 1
WHERE a.temperature > b.temperature

