package ss11_thuc_hanh.practice_using_arraylist.module.moduleclass;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private String name;
    private int id;
    private double price;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(int id) {
        this.id = id;
    }

    public Product(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getId() == product.getId() ||  Objects.equals(getName(), product.getName());
    }


}
