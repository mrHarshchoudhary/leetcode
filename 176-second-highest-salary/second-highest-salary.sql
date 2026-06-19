# Write your MySQL query statement belo


-- select MAX(salary) as secondHighestSalary from employee where salary<(select MAX(salary) as secondHighestSalary from employee);
select MAX(salary) as secondHighestSalary from employee where salary=(
select distinct salary from employee order by salary desc  limit 1 offset 1)