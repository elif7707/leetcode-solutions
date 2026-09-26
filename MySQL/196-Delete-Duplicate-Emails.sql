DELETE p 
FROM Person p
JOIN Person i
ON p.email = i.email  -- Self join: match rows that have the same email
WHERE p.id > i.id     -- Delete the row if another row with the same email has a smaller id
