use customer_product;
insert into customer
values(1,'minh quan',10),
(2,'Ngoc Oanh',20),
(3,'Hong Ha',50);
insert into order_detail
values(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);

insert into product
values (1, 'may giac',3),
(2,'tu lanh', 5),
(3, 'dieu hoa', 7),
(4, 'quat',1),
(5,'bep dien', 	2);


drop table orders;

insert into orders(o_id,c_ID,o_date)
values(1,1,2006/3/21),
(2,2,2006/3/23),
(3,1,2006/3/16);

-- update orders set o_date =  '2006/3/16' where orders.o_id =3;

select * from orders;

select customer.c_ID,customer.c_name,product.p_name,product.p_price from customer
join orders on customer.c_ID = orders.c_ID
join order_detail on orders.o_id = order_detail.o_id
join product on order_detail.p_id=product.p_id;

select customer.c_ID,customer.c_name from customer
where  customer.c_ID not in (select orders.c_ID from orders);
-- cách 2-- 
 select customer.c_ID,customer.c_name from customer
where customer.c_name not in (select customer.c_ID,customer.c_name from customer
join orders on customer.c_ID = orders.c_ID);

select orders.c_ID, orders.o_date,sum(product.p_price*order_detail.od_quality)as'totalprice' from orders
join order_detail on orders.o_id = order_detail.o_id
join product on order_detail.p_id = product.p_id group by c_ID;




