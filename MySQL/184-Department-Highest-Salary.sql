SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary
FROM Employee e                              -- Start with all employees
LEFT JOIN Department d                       -- Add department information to each employee
ON e.departmentId = d.id                     -- Match each employee with their own department
WHERE (e.salary, d.id) IN                    -- Keep the employee only if their (department, salary) pair is in the list below
    (SELECT MAX(salary), departmentId        -- For each department, find the highest salary
    FROM Employee                            -- Look at all employees
    GROUP BY departmentId)                   -- Group them by department so MAX works per department
