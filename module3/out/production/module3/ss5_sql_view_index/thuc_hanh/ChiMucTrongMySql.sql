use classicmodels;
select * from customers where customerName ="Land Of Toys Inc.";

create index idx_customerName on customers(customerName);

create index idx_full_name on customers(contactFirstName, contactLastName);

explain select * from customers where customerName ="Land Of Toys Inc.";

EXPLAIN SELECT * FROM customers WHERE contactFirstName = 'Jean' or contactFirstName = 'King';