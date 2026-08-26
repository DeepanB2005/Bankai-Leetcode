# Write your MySQL query statement below
select DATE_FORMAT(TRANS_DATE,'%Y-%m') AS month,
country,
count(*) as trans_count,
sum(state="approved") as approved_count,
sum(amount) as trans_total_amount,
sum(case when state="approved" then amount else 0 end) as approved_total_amount

from transactions
group by DATE_FORMAT(TRANS_DATE,'%Y-%M'),country;