
-- tìm tấc cả customer
DELIMITER //
CREATE PROCEDURE find_all_customer()
BEGIN
SELECT * FROM customers ;
END //
DELIMITER ;
call find_all_customer();



DELIMITER //
create procedure find_all_customers()
begin
explain select * from customers where customers.customerNumber = "175" ;
end //
DELIMITER ;
call find_all_customers() ;




