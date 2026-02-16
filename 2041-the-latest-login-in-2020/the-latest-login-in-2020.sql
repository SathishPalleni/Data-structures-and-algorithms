# Write your MySQL query statement below
Select user_id, MAX(time_stamp)  As last_stamp from Logins
where year (time_stamp) = 2020
group by user_id
order by user_id;
