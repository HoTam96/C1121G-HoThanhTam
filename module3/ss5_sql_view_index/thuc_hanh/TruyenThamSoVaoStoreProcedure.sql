-- tham so in
DELIMITER //
create procedure get_cus_by_id (in cusnum  int(11) )
begin
select * from customers where customers.customerNumber = cusnum;
end //
DELIMITER ;
call get_cus_by_id (175) ;

 drop procedure get_cus_by_id;
 
 -- tham số out
 
 DELIMITER //
create procedure get_cus_city ( in in_city varchar(55), out total int )
begin 
select count(customerNumber) as total from  customers where customers.city = in_city;
end //
delimiter ; 

call   get_cus_city ('lyon', @total );
select total ; 

drop procedure get_cus_city;


 DELIMITER //
create procedure get_customer (out total int )
begin 
 set total =   (select count(customers.customerNumber)from  customers);
end //
delimiter ; 

call   get_customer (@total );
select @total ; 

drop procedure get_customer;

-- inout

delimiter //
create procedure set_counter(inout counter int, in inc int  )
 begin
  set counter  = counter + inc ;
  end //
delimiter ;

set @counter = 1;
call set_counter(@counter, 1);
call set_counter(@counter, 1);
call set_counter(@counter, 7);
select @counter ;
  drop procedure set_counter;
  
  