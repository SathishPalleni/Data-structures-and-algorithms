# Write your MySQL query statement below
Select date_id, make_name, 
count(distinct lead_id) As unique_leads, Count(distinct partner_id) As unique_partners
from DailySales 
group by date_id, make_name
Order by date_id, make_name;