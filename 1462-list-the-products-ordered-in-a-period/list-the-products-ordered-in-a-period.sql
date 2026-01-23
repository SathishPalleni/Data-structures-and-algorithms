# Write your MySQL query statement below
Select p.product_name, sum(o.unit) AS unit
From Products p Join Orders o
ON p.product_id = o.product_id 
Where  o.order_date like '2020-02-%'
GROUP BY p.product_id having sum(o.unit) >= 100;