# Write your MySQL query statement below
Select teacher_id, COUNT( distinct subject_id) AS cnt 
from Teacher 
group by  teacher_id
order by teacher_id;