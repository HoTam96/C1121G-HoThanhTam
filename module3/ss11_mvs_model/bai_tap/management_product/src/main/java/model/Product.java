package model;

public class Product {
    private  int id;
    private String name;
    private String description;
    private double price;
    private String yearOfManufacture;
    private String country;

    public Product(int id, String name, String description, double price, String yearOfManufacture, String country) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.country = country;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", YearOfManufacture='" + yearOfManufacture + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

}
