package ss11_thuc_hanh.practice_using_arraylist.module.service.impl;

import ss11_thuc_hanh.practice_using_arraylist.module.moduleclass.Product;
import ss11_thuc_hanh.practice_using_arraylist.module.service.IProduct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ProductServiceImpl implements IProduct {
    public static ArrayList<Product> productArrayList = new ArrayList<>();

    static {
        Product product = new Product("bánh quy", 1, 20);
        productArrayList.add(product);
        Product product1 = new Product("bánh ken", 2, 22);
        productArrayList.add(product1);
    }


    @Override
    public void addProduct(Product product) {
        productArrayList.add(product);
    }

    @Override
    public void editIdProduct(Product id) {
        for (Product product : productArrayList) {
            if (product.getId() == id.getId()) {
                product.setId(id.getId());
                product.setName(id.getName());
                product.setPrice(id.getPrice());
                System.out.println("thêm mới thành công");
            }

        }

    }

    @Override
    public void removeProduct(int id) {
        for (Product element: productArrayList) {
            if (element.getId()==id){
                productArrayList.remove(element);
                System.out.println("đã xóa thành công");
            }
        }

    }


    @Override
    public boolean removeProductName(Product name) {
        return productArrayList.remove(name);

    }

    @Override
    public void displayProduct() {
        for (Product product:productArrayList) {
            System.out.println(product);
        }

    }

    @Override
    public void findNameProduct(String name) {
        for (Product product : productArrayList) {
            if (product.getName().equals(name)) {
                System.out.println("id là: " + product.getId() + " tên sản phẩm: " + product.getName() + " giá: " + product.getPrice());
            }
        }
    }

    @Override
    public void SortByProductPrice() {
        Collections.sort(productArrayList, new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        if (o1.getPrice() < o2.getPrice()) {
                            return -1;
                        } else if (o1.getPrice() > o2.getPrice()) {
                            return 1;
                        } else {
                            return 0;
                        }
                    }
                }
        );


    }
}
