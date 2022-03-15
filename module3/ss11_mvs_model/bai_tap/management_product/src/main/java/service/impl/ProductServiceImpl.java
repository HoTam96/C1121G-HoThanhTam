package service.impl;

import model.Product;
import service.ProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    public static final Map<Integer, Product> productMap;

    static {
        productMap = new HashMap<>();
        Product product1 = new Product(1, "AbLack", "xe thích hợp mọi lứa tuổi", 44.000000, "2022", "nhật bản");
        Product product2 = new Product(2, "SiriUs", "xe giá rẻ", 28.000000, "2022", "nhật bản");
        Product product3 = new Product(3, "winner", "xe tay côn , công xuất 150 mã lực", 40.000000, "2022", "hàn quốc");
        Product product4 = new Product(4, "Grand", "xe dành cho nữ , kiểu dáng sang trọng", 33.000000, "2022", "Anh");
        Product product5 = new Product(5, "Lead ", "xe dành cho những ninja", 38.000000, "2021", "Pháp");
        Product product6 = new Product(6, "ExCenter", "xe quốc dân cho anh em trộm chó", 55.000000, "2020", "Việt Nam");

        Product product7 = new Product(7, "AbLack", "xe thích hợp mọi lứa tuổi", 44.000000, "2022", "nhật bản");
        Product product8 = new Product(8, "SiriUs", "xe giá rẻ", 28.000000, "2022", "nhật bản");
        Product product9 = new Product(9, "winner", "xe tay côn , công xuất 150 mã lực", 40.000000, "2022", "hàn quốc");
        Product product10 = new Product(10, "Grand", "xe dành cho nữ , kiểu dáng sang trọng", 33.000000, "2022", "Anh");
        Product product11 = new Product(11, "Lead ", "xe dành cho những ninja", 38.000000, "2021", "Pháp");
        Product product12 = new Product(12, "ExCenter", "xe quốc dân cho anh em trộm chó", 55.000000, "2020", "Việt Nam");


        productMap.put(product1.getId(), product1);
        productMap.put(product2.getId(), product2);
        productMap.put(product3.getId(), product3);
        productMap.put(product4.getId(), product4);
        productMap.put(product5.getId(), product5);
        productMap.put(product6.getId(), product6);
        productMap.put(product7.getId(), product7);
        productMap.put(product8.getId(), product8);
        productMap.put(product9.getId(), product9);
        productMap.put(product10.getId(), product10);
        productMap.put(product11.getId(), product11);
        productMap.put(product12.getId(), product12);

    }


    @Override
    public List<Product> getAllProduct() {
        List<Product> productList = new ArrayList<>(productMap.values());
        return productList;

    }


    @Override
    public void create(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public void update(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public void delete(int id) {
        productMap.remove(id);
    }

    @Override
    public List<Product> search(String name) {
        List<Product> productList = new ArrayList<>(productMap.values());
        List<Product> products = new ArrayList<>();
        for (Product element : productList) {
            if (element.getName().contains(name)) {
                products.add(element);
            }
        }
        return products;
    }

    @Override
    public Product getProductById(int id) {
        return productMap.get(id);
    }
}
