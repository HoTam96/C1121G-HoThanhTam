use managament_furama;
-- thêm thông tin vào bảng employee  
INSERT INTO `managament_furama`.`employee` (`e_name`, `day_of_birth`, `number_cmnd`, `e_salary`, `phone_number`, `e_email`, `e_address`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`) VALUES ('Nguyễn Văn An', '1970-11-07', '456231786', '10000000', '0901234121', 'annguyen@gmail.com', '295 Nguyễn Tất Thành, Đà Nẵng', '1', '3', '1');
INSERT INTO `managament_furama`.`employee` (`e_name`, `day_of_birth`, `number_cmnd`, `e_salary`, `phone_number`, `e_email`, `e_address`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`) VALUES ('Lê Văn Bình', '1997-04-09', '654231234', '7000000', '0934212314', 'binhlv@gmail.com', '22 Yên Bái, Đà Nẵng', '1', '2', '2');
INSERT INTO `managament_furama`.`employee` (`e_name`, `day_of_birth`, `number_cmnd`, `e_salary`, `phone_number`, `e_email`, `e_address`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`) VALUES ('Hồ Thị Yến', '1995-12-12', '999231723', '14000000', '0412352315', 'thiyen@gmail.com', 'K234/11 Điện Biên Phủ, Gia Lai', '1', '3', '2');
INSERT INTO `managament_furama`.`employee` (`e_name`, `day_of_birth`, `number_cmnd`, `e_salary`, `phone_number`, `e_email`, `e_address`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`) VALUES ('Võ Công Toản', '1980-04-04', '123231365', '17000000', '0374443232', 'toan0404@gmail.com', '77 Hoàng Diệu, Quảng Trị', '1', '4', '4');
INSERT INTO `managament_furama`.`employee` (`e_name`, `day_of_birth`, `number_cmnd`, `e_salary`, `phone_number`, `e_email`, `e_address`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`) VALUES ('Nguyễn Bỉnh Phát', '1999-12-09', '454363232', '6000000', '0902341231', 'phatphat@gmail.com', '43 Yên Bái, Đà Nẵng', '2', '1', '1');
INSERT INTO `managament_furama`.`employee` (`e_name`, `day_of_birth`, `number_cmnd`, `e_salary`, `phone_number`, `e_email`, `e_address`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`) VALUES ('Khúc Nguyễn An Nghi', '2000-11-08', '964542311', '7000000', '0978653213', 'annghi20@gmail.com', '294 Nguyễn Tất Thành, Đà Nẵng', '2', '2', '3');
INSERT INTO `managament_furama`.`employee` (`e_name`, `day_of_birth`, `number_cmnd`, `e_salary`, `phone_number`, `e_email`, `e_address`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`) VALUES ('Nguyễn Hữu Hà', '1993-01-01', '534323231', '8000000', '0941234553', 'nhh0101@gmail.com', '4 Nguyễn Chí Thanh, Huế', '2', '3', '2');
INSERT INTO `managament_furama`.`employee` (`e_name`, `day_of_birth`, `number_cmnd`, `e_salary`, `phone_number`, `e_email`, `e_address`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`) VALUES ('Nguyễn Hà Đông', '1989-09-03', '234414123', '9000000', '0642123111', 'donghanguyen@gmail.com', '111 Hùng Vương, Hà Nội', '2', '4', '4');
INSERT INTO `managament_furama`.`employee` (`e_name`, `day_of_birth`, `number_cmnd`, `e_salary`, `phone_number`, `e_email`, `e_address`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`) VALUES ('Tòng Hoang', '1982-09-03', '256781231', '6000000', '0245144444', 'hoangtong@gmail.com', '213 Hàm Nghi, Đà Nẵng', '2', '4', '4');
INSERT INTO `managament_furama`.`employee` (`e_name`, `day_of_birth`, `number_cmnd`, `e_salary`, `phone_number`, `e_email`, `e_address`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`) VALUES ('Nguyễn Công Đạo', '1994-01-08', '755434343', '8000000', '0988767111', 'nguyencongdao12@gmail.com', '6 Hoà Khánh, Đồng Nai', '2', '3', '2');

-- loai khoach
INSERT INTO `managament_furama`.`type_customer` (`type_customer_id`, `type_name_customer`) VALUES ('1', 'Diamond');
INSERT INTO `managament_furama`.`type_customer` (`type_customer_id`, `type_name_customer`) VALUES ('2', 'Platinium');
INSERT INTO `managament_furama`.`type_customer` (`type_customer_id`, `type_name_customer`) VALUES ('3', 'Gold');
INSERT INTO `managament_furama`.`type_customer` (`type_customer_id`, `type_name_customer`) VALUES ('4', 'Silver');
INSERT INTO `managament_furama`.`type_customer` (`type_customer_id`, `type_name_customer`) VALUES ('5', 'Member');


INSERT INTO managament_furama.customer (type_customer_id, c_name, day_of_birth, sex, number_cmnd, phone_number, c_email, c_address) VALUES ( '5', 'Nguyễn Thị Hào', '1970-11-07', '0', '643431213', '0945423362', 'thihao07@gmail.com', '23 Nguyễn Hoàng, Đà Nẵng');
INSERT INTO managament_furama.customer (type_customer_id, c_name, day_of_birth, sex, number_cmnd, phone_number, c_email, c_address) VALUES ( '3', 'Phạm Xuân Diệu', '1992-08-08', '1', '865342123', '0954333333', 'xuandieu92@gmail.com', 'K77/22 Thái Phiên, Quảng Trị');
INSERT INTO managament_furama.customer (type_customer_id, c_name, day_of_birth, sex, number_cmnd, phone_number, c_email, c_address) VALUES ( '1', 'Trương Đình Nghệ', '1990-02-27', '1', '488645199', '0373213122', 'nghenhan2702@gmail.com', 'K323/12 Ông Ích Khiêm, Vinh');
INSERT INTO managament_furama.customer (type_customer_id, c_name, day_of_birth, sex, number_cmnd, phone_number, c_email, c_address) VALUES ( '1', 'Dương Văn Quan', '1981-07-08', '1', '543432111', '0490039241', 'duongquan@gmail.com', 'K453/12 Lê Lợi, Đà Nẵng');
INSERT INTO managament_furama.customer (type_customer_id, c_name, day_of_birth, sex, number_cmnd, phone_number, c_email, c_address) VALUES ( '4', 'Hoàng Trần Nhi Nhi', '1995-12-09', '0', '795453345', '0312345678', 'nhinhi123@gmail.com', '224 Lý Thái Tổ, Gia Lai');
INSERT INTO managament_furama.customer (type_customer_id, c_name, day_of_birth, sex, number_cmnd, phone_number, c_email, c_address) VALUES ( '4', 'Tôn Nữ Mộc Châu', '2005-12-06', '0', '732434215', '0988888844', 'tonnuchau@gmail.com', '37 Yên Thế, Đà Nẵng');
INSERT INTO managament_furama.customer (type_customer_id, c_name, day_of_birth, sex, number_cmnd, phone_number, c_email, c_address) VALUES ( '1', 'Nguyễn Mỹ Kim', '1984-04-08', '0', '856453123', '0912345698', 'kimcuong84@gmail.com', 'K123/45 Lê Lợi, Hồ Chí Minh');
INSERT INTO managament_furama.customer (type_customer_id, c_name, day_of_birth, sex, number_cmnd, phone_number, c_email, c_address) VALUES ( '3', 'Nguyễn Thị Hào', '1999-04-08', '0', '965656433', '0763212345', 'haohao99@gmail.com', '55 Nguyễn Văn Linh, Kon Tum');
INSERT INTO managament_furama.customer (type_customer_id, c_name, day_of_birth, sex, number_cmnd, phone_number, c_email, c_address) VALUES ( '1', 'Trần Đại Danh', '1994-07-01', '1', '432341235', '0643343433', 'danhhai99@gmail.com', '24 Lý Thường Kiệt, Quảng Ngãi');
INSERT INTO managament_furama.customer (type_customer_id, c_name, day_of_birth, sex, number_cmnd, phone_number, c_email, c_address) VALUES ( '2', 'Nguyễn Tâm Đắc', '1989-07-01', '1', '344343432', '0987654321', 'dactam@gmail.com', '22 Ngô Quyền, Đà Nẵng');

-- dịch vụ 
INSERT INTO `managament_furama`.`service` (`service_id`, `service_name`, `area`, `rental_cost`, `people_max`, `type_rent_id`, `type_service_id`, `standard_room`, `description_other`, `area_pool`, `number_floor`) VALUES ('1', 'Villa Beach Front', '25000', '10000000', '10', '3', '1', 'vip', 'Có hồ bơi', '500', '4');
INSERT INTO `managament_furama`.`service` (`service_id`, `service_name`, `area`, `rental_cost`, `people_max`, `type_rent_id`, `type_service_id`, `standard_room`, `description_other`, `number_floor`) VALUES ('2', 'House Princess 01', '14000', '5000000', '7', '2', '2', 'vip', 'Có thêm bếp nướng', '3');
INSERT INTO `managament_furama`.`service` (`service_id`, `service_name`, `area`, `rental_cost`, `people_max`, `type_rent_id`, `type_service_id`, `standard_room`, `description_other`) VALUES ('3', 'Room Twin 01', '5000', '1000000', '2', '4', '3', 'normal', 'Có tivi');
INSERT INTO `managament_furama`.`service` (`service_id`, `service_name`, `area`, `rental_cost`, `people_max`, `type_rent_id`, `type_service_id`, `standard_room`, `description_other`, `area_pool`, `number_floor`) VALUES ('4', 'Villa No Beach Front', '22000', '9000000', '8', '3', '1', 'normal', 'Có hồ bơi', '300', '3');
INSERT INTO `managament_furama`.`service` (`service_id`, `service_name`, `area`, `rental_cost`, `people_max`, `type_rent_id`, `type_service_id`, `standard_room`, `description_other`, `number_floor`) VALUES ('5', 'House Princess 02', '10000', '4000000', '5', '3', '2', 'normal', 'Có thêm bếp nướng', '2');
INSERT INTO `managament_furama`.`service` (`service_id`, `service_name`, `area`, `rental_cost`, `people_max`, `type_rent_id`, `type_service_id`, `standard_room`, `description_other`) VALUES ('6', 'Room Twin 02', '3000', '900000', '2', '4', '3', 'normal', 'Có tivi');

-- dịch vụ đi kèm

INSERT INTO `managament_furama`.`accompanied_service` (`service_code`, `name_service`, `price`, `unit`, `status_service`) VALUES ('1', 'Karaoke', '10000', 'giờ', 'đầy đủ đồ ăn, tráng miệng');
INSERT INTO `managament_furama`.`accompanied_service` (`service_code`, `name_service`, `price`, `unit`, `status_service`) VALUES ('2', 'Thuê xe máy', '10000', 'chiếc', 'hỏng 1 xe');
INSERT INTO `managament_furama`.`accompanied_service` (`service_code`, `name_service`, `price`, `unit`, `status_service`) VALUES ('3', 'Thuê xe đạp', '20000', 'chiếc', 'tốt');
INSERT INTO `managament_furama`.`accompanied_service` (`service_code`, `name_service`, `price`, `unit`, `status_service`) VALUES ('4', 'Buffet buổi sáng', '15000', 'suất', 'đầy đủ đồ ăn, tráng miệng');
INSERT INTO `managament_furama`.`accompanied_service` (`service_code`, `name_service`, `price`, `unit`, `status_service`) VALUES ('5', 'Buffet buổi trưa', '90000', 'suất', 'đầy đủ đồ ăn, tráng miệng');
INSERT INTO `managament_furama`.`accompanied_service` (`service_code`, `name_service`, `price`, `status_service`) VALUES ('6', 'Buffet buổi tối', '16000', 'tiện nghi, hiện tại');

-- hợp đông
INSERT INTO `managament_furama`.`contract` (`contract_id`, `start_date_contract`, `end_date_contract`, `deposits`, `employee_id`, `customer_id`, `service_id`) VALUES ('1', '2020-12-08', '2020-12-08', '0', '3', '1', '3');
INSERT INTO `managament_furama`.`contract` (`contract_id`, `start_date_contract`, `end_date_contract`, `deposits`, `employee_id`, `customer_id`, `service_id`) VALUES ('2', '2020-07-14', '2020-07-21', '200000', '7', '3', '1');
INSERT INTO `managament_furama`.`contract` (`contract_id`, `start_date_contract`, `end_date_contract`, `deposits`, `employee_id`, `customer_id`, `service_id`) VALUES ('3', '2021-03-15', '2021-03-17', '50000', '3', '4', '2');
INSERT INTO `managament_furama`.`contract` (`contract_id`, `start_date_contract`, `end_date_contract`, `deposits`, `employee_id`, `customer_id`, `service_id`) VALUES ('4', '2021-01-14', '2021-01-18', '100000', '7', '5', '5');
INSERT INTO `managament_furama`.`contract` (`contract_id`, `start_date_contract`, `end_date_contract`, `deposits`, `employee_id`, `customer_id`, `service_id`) VALUES ('5', '2021-07-14', '2021-07-15', '0', '7', '2', '6');
INSERT INTO `managament_furama`.`contract` (`contract_id`, `start_date_contract`, `end_date_contract`, `deposits`, `employee_id`, `customer_id`, `service_id`) VALUES ('6', '2021-06-01', '2021-06-03', '0', '7', '7', '6');
INSERT INTO `managament_furama`.`contract` (`contract_id`, `start_date_contract`, `end_date_contract`, `deposits`, `employee_id`, `customer_id`, `service_id`) VALUES ('7', '2021-09-02', '2021-09-05', '100000', '7', '4', '4');
INSERT INTO `managament_furama`.`contract` (`contract_id`, `start_date_contract`, `end_date_contract`, `deposits`, `employee_id`, `customer_id`, `service_id`) VALUES ('8', '2021-06-17', '2021-06-18', '150000', '3', '4', '1');
INSERT INTO `managament_furama`.`contract` (`contract_id`, `start_date_contract`, `end_date_contract`, `deposits`, `employee_id`, `customer_id`, `service_id`) VALUES ('9', '2020-11-19', '2020-11-19', '0', '3', '4', '3');
INSERT INTO `managament_furama`.`contract` (`contract_id`, `start_date_contract`, `end_date_contract`, `deposits`, `employee_id`, `customer_id`, `service_id`) VALUES ('10', '2021-04-12', '2021-04-14', '0', '10', '3', '5');
INSERT INTO `managament_furama`.`contract` (`contract_id`, `start_date_contract`, `end_date_contract`, `deposits`, `employee_id`, `customer_id`, `service_id`) VALUES ('11', '2021-04-25', '2021-04-25', '0', '2', '2', '1');
INSERT INTO `managament_furama`.`contract` (`contract_id`, `start_date_contract`, `end_date_contract`, `deposits`, `employee_id`, `customer_id`, `service_id`) VALUES ('12', '2021-05-25', '2021-05-27', '0', '7', '10', '1');

-- hợp đồng chi tiết
INSERT INTO `managament_furama`.`detail_contract` (`detail_contract_code`, `contract_id`, `service_code`, `amount`) VALUES ('1', '2', '4', '5');
INSERT INTO `managament_furama`.`detail_contract` (`detail_contract_code`, `contract_id`, `service_code`, `amount`) VALUES ('2', '2', '5', '8');
INSERT INTO `managament_furama`.`detail_contract` (`detail_contract_code`, `contract_id`, `service_code`, `amount`) VALUES ('3', '2', '6', '15');
INSERT INTO `managament_furama`.`detail_contract` (`detail_contract_code`, `contract_id`, `service_code`, `amount`) VALUES ('4', '3', '1', '1');
INSERT INTO `managament_furama`.`detail_contract` (`detail_contract_code`, `contract_id`, `service_code`, `amount`) VALUES ('5', '3', '2', '11');
INSERT INTO `managament_furama`.`detail_contract` (`detail_contract_code`, `contract_id`, `service_code`, `amount`) VALUES ('6', '1', '3', '1');
INSERT INTO `managament_furama`.`detail_contract` (`detail_contract_code`, `contract_id`, `service_code`, `amount`) VALUES ('7', '1', '2', '2');
INSERT INTO `managament_furama`.`detail_contract` (`detail_contract_code`, `contract_id`, `service_code`, `amount`) VALUES ('8', '12', '2', '2');
