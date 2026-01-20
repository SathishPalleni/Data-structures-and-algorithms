# Write your MySQL query statement below
SELECT distinct author_id AS id 
FROM Views 
where author_id = viewer_id 
Order by author_id asc;