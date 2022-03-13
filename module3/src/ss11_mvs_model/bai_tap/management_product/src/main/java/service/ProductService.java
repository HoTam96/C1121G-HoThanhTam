package service;

import models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    void create(Product product);
    void update(Product product);
    void delete(int id);
    List<Product>search(String name);
    Product getProductById(int id);
}
