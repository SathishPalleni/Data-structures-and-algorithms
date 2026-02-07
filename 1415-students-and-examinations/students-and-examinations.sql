# Write your MySQL query statement below
Select stu.student_id, stu.student_name, sub.subject_name, 
COUNT(exam.student_id) As attended_exams 
FROM Students stu CROSS JOIN Subjects sub LEFT JOIN Examinations exam ON 
stu.student_id = exam.student_id AND  sub.subject_name = exam.Subject_name
Group by stu.student_id, stu.student_name, sub.subject_name
order by stu.student_id, sub.subject_name;