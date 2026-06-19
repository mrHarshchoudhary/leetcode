# Write your MySQL query statement belo


select MAX(salary) as secondHighestSalary from employee where salary<(select MAX(salary) as secondHighestSalary from employee);
