create database customer_product;
use customer_product;
CREATE TABLE customer (
    c_ID INT AUTO_INCREMENT,
    c_name VARCHAR(100),
    c_age INT,
    PRIMARY KEY (c_ID)
);


CREATE TABLE orders (
    o_id INT AUTO_INCREMENT,
    c_ID INT,
    o_date DATE,
    o_totalprice DOUBLE,
    PRIMARY KEY (o_id),
    FOREIGN KEY (c_ID)
        REFERENCES customer (c_ID)
);
CREATE TABLE product (
    p_id INT AUTO_INCREMENT,
    p_name VARCHAR(55),
    p_price DOUBLE,
    PRIMARY KEY (p_id)
);

CREATE TABLE order_detail (
    o_id INT,
    p_id INT,
    od_quality VARCHAR(255),
    PRIMARY KEY (o_id , p_id),
    FOREIGN KEY (o_id)
        REFERENCES orders (o_id),
    FOREIGN KEY (p_id)
        REFERENCES product (p_id)
);