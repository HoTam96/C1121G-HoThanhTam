create database demo;
use demo;
create table products(
id int auto_increment,
product_code int  ,
product_name varchar(100),
product_price double, 
product_amount int ,
product_description varchar(255),
product_status bit ,
primary key (id)
);


INSERT INTO demo.products (product_code, product_name, product_price, product_amount, product_description, product_status) VALUES ('123', 'keo', '1000', '5', 'keo deo', 0);
INSERT INTO demo.products (product_code, product_name, product_price, product_amount, product_description, product_status) VALUES ('456', 'banh', '1000', '5', 'banh bia', 1);
INSERT INTO demo.products (product_code, product_name, product_price, product_amount, product_description, product_status) VALUES ('345', 'nuoc', '1000', '5', 'coca', 1);
INSERT INTO demo.products (product_code, product_name, product_price, product_amount, product_description, product_status) VALUES ('742', 'bia', '1000', '5', 'bia laru', 0);

create unique index idx_pr_code on products(product_code);
create index idex_produc_name_price on products(product_name, product_code);
explain select product_code, product_name from products ;

-- tao view
create view product_view as select products.product_code,products.product_name,products.product_price,
products.product_status from products;
select * from product_view;

-- sữa đổi view 
INSERT INTO demo.products (product_code, product_name, product_price, product_amount, product_description, product_status) VALUES ('123', 'thuoc la', '23000', '5', 'price', 0);

-- xóa view
 drop view product_view ;
 
 -- tạo procedure lấy tất cẩ thông tin sản phẩm
 DELIMITER //
 create procedure get_products()
 begin
 select * from products;
END //
 DELIMITER ;
 call get_products();
 
 
 -- them 1 sản phẩm mới
  DELIMITER //
 create procedure get_addnew_products()
 begin
INSERT INTO demo.products (product_code, product_name, product_price, product_amount, product_description, product_status) VALUES ('123', 'thuoc la', '23000', '5', 'price', 0);

END //
 DELIMITER ;
 call get_addnew_products();
 
 
 
 
 











