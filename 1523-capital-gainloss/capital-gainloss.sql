# Write your MySQL query statement below
Select stock_name, SUM(
    case when operation = 'sell' Then price else -price 
    END 
) AS capital_gain_loss
from Stocks
group by stock_name
order by stock_name;