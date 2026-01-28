# Write your MySQL query statement below
Select Sell_date, COUNT(distinct product) AS num_sold,  group_concat(distinct product) AS products 
FROM Activities Group by sell_date  order by sell_date ;