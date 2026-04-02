# Write your MySQL query statement below
Select U.user_id AS buyer_id
,u.join_date
,IFNULL(COUNT(o.order_id),0) AS orders_in_2019
From users u 
left join orders o
ON u.user_id = o.buyer_id
AND YEAR(order_date) = '2019'
group by u.user_id, u.join_date