create database managament_furama;
use managament_furama;

-- --tạo bang vi_tri-- 
create table vitri(
ma_vi_tri int auto_increment ,
ten_vi_tri varchar(45),
primary key(ma_vi_tri));

-- tạo bảng trình độa
create table trinh_do(
ma_trinh_do int auto_increment,
ten_trinh_do varchar(45),
primary key (ma_trinh_do));

-- tạo bảng bộ phận--
create table bo_phan(
ma_bo_phan int auto_increment,
ten_bo_phan varchar(45),
primary key(ma_bo_phan)
);
-- tạo bảng nhân viên

create table employee(
employee_id int auto_increment,
e_name varchar(55),
day_of_birth date,
number_cmnd varchar(45),
e_salary double,
phone_number varchar(45),
e_email varchar(45),
e_address varchar(45),
ma_vi_tri int,
ma_trinh_do int,
ma_bo_phan int,
primary key (employee_id),
foreign key(ma_vi_tri)references vitri(ma_vi_tri),
foreign key (ma_trinh_do)references trinh_do(ma_trinh_do),
foreign key(ma_bo_phan)references bo_phan(ma_bo_phan)
);
-- tạo bang loai khach-- 
create table type_customer(
type_customer_id int auto_increment,
type_name_customer varchar(55),
primary key(type_customer_id)
);

    -- tạo bảng khách hàng-- 
    create table customer(
    customer_id int auto_increment,
    type_customer_id int,
    c_name varchar(45),
    day_of_birth date,
    sex bit(1),
number_cmnd varchar(45),
phone_number varchar(45),
c_email varchar(45),
c_address varchar(45),
primary key (customer_id),
foreign key(type_customer_id)references type_customer(type_customer_id)
    );
    
   -- tạo bảng laoi dịch vụ--
   
   create table type_service(
   type_service_id int auto_increment,
   type_name_service varchar(55),
   primary key (type_service_id));
   
   -- tạo bảng kiểu thuê--
   create table type_rent(
   type_rent_id int auto_increment,
   type_rent_name varchar(55),
   primary key(type_rent_id));
   
   
   create table service(
   service_id int auto_increment,
   service_name varchar(55),
   area int,
   rental_cost double,
   people_max int ,
   type_rent_id int,
   type_service_id int,
   standard_room varchar(55),
   description_other varchar(155),
   area_pool double,
   number_floor int,
   primary key(service_id),
   foreign key(type_rent_id)references type_rent(type_rent_id),
   foreign key (type_service_id)references type_service(type_service_id)
   );

	-- tao bangr hop ddoong -- 
   create table contract(
   contract_id int auto_increment,
   start_date_contract datetime,
   end_date_contract datetime,
   deposits double,
   employee_id int,
   customer_id int,
    service_id int,
   primary key (contract_id),
   foreign key (employee_id)references employee(employee_id),
   foreign key(customer_id)references  customer(customer_id ),
   foreign key ( service_id)references service( service_id)
   );
   
   -- taoj bangr dichj vu ddi kem-- 
create table accompanied_service(
service_code int auto_increment,
name_service varchar(45),
price double,
unit varchar(10),
status_service varchar(45),
primary key (service_code)
);


create table detail_contract(
detail_contract_code int  auto_increment,
contract_id int ,
service_code int,
amount int,
primary key (detail_contract_code),
foreign key (contract_id)references contract(contract_id),
foreign key (service_code)references accompanied_service(service_code)
);

    

