package case_study_c10.models;

public abstract class Product {
    private int id ;
    private String productCode;
    private String productName;
    private double price;
    private int amount;
    private String Producer;

    public Product(int id, String productCode, String productName, double price, int amount, String producer) {
        this.id = id;
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.amount = amount;
        Producer = producer;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getProducer() {
        return Producer;
    }

    public void setProducer(String producer) {
        Producer = producer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", Producer='" + Producer + '\'' +
                '}';
    }
    public String  getInForProduct(){
        return (id+","+productCode+","+productName+","+price+","+amount+","+Producer);
    }

}

