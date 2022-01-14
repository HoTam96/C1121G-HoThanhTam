package ss11_thuc_hanh.practice_using_arraylist.module.service;

import ss11_thuc_hanh.practice_using_arraylist.module.moduleclass.Product;

public interface IProduct {
    void addProduct(Product product);

    void editIdProduct(Product id);

    boolean removeProduct(Product id);
    boolean removeProductName(Product name);

    void displayProduct();

    void findNameProduct(String name);

    void SortByProductPrice();

}
