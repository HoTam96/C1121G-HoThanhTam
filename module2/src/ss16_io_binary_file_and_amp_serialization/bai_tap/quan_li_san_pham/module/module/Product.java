package ss16_io_binary_file_and_amp_serialization.bai_tap.quan_li_san_pham.module.module;

import java.io.Serializable;

public  class Product implements Serializable {
    private String code;
    private int id;
    private String productName;
    private String hangSanXuat;
    private double price;
    private String otherDescription;

    public Product(String code, int id, String productName, String hangSanXuat, double price, String otherDescription) {
        this.code = code;
        this.id = id;
        this.productName = productName;
        this.hangSanXuat = hangSanXuat;
        this.price = price;
        this.otherDescription = otherDescription;
    }

    public Product() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }

    @Override
    public String toString() {
        return "ProductInformation{" +
                "code='" + code + '\'' +
                ", id=" + id +
                ", productName='" + productName + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", price=" + price +
                ", otherDescription='" + otherDescription + '\'' +
                '}';
    }
}
