package ss11_thuc_hanh.practice_using_arraylist.controller;

import ss11_thuc_hanh.practice_using_arraylist.module.moduleclass.Product;
import ss11_thuc_hanh.practice_using_arraylist.module.service.impl.ProductServiceImpl;

import java.util.Scanner;

public class ControllerProduct {
    public static void main(String[] args) {
        ProductServiceImpl productService = new ProductServiceImpl();

        Scanner sc = new Scanner(System.in);
        int select;
        do {
            System.out.println("-----------MENU-------------");
            System.out.println(" 1. cập nhật sản phẩm mới\n" +
                    "2 . sửa sản phẩm theo id\n" +
                    "3. xóa sản phẩm theo id\n" +
                    "4. xóa sản phẩm theo tên\n" +
                    "5. tìm kiếm sản phẩm theo tên.\n" +
                    "6. sắp sếp sản phẩm theo giá tăng dần\n" +
                    "7. hiển thị sản phẩm ra màn hình");
            select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    System.out.println("tên sản phẩm");
                    String name = sc.nextLine();
                    System.out.println("id sản phẩm");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("giá sản phẩm");
                    double price = Double.parseDouble(sc.nextLine());
                    Product product = new Product(name, id, price);
                    productService.addProduct(product);
                    break;
                case 2:
                    System.out.println("nhập id cần chỉnh sữa");
                    int id1 = Integer.parseInt(sc.nextLine());
                    System.out.println("tên sản phẩm cần chỉnh sữa");
                    String name1 = sc.nextLine();
                    System.out.println("giá sản phẩm cẩn chỉnh sữa");
                    double price1 = Double.parseDouble(sc.nextLine());
                    Product product1 = new Product(name1, id1, price1);
                    productService.editIdProduct(product1);
                    break;
                case 3:
                    System.out.println("nhập id sản phẩm cần xóa");
                    int id3 = Integer.parseInt(sc.nextLine());
                    Product product3 = new Product(id3);
                    System.out.println(productService.removeProduct(product3));
                    break;

                case 4:
                    System.out.println("nhập tên sản phẩm cần xóa");
                    String name2 = sc.nextLine();
                    Product product2 = new Product(name2);
                    System.out.println(productService.removeProductName(product2));
                    break;
                case 5:
                    System.out.println("nhập tên cần tìm kiếm");
                    String name3= sc.nextLine();
//                    Product product4 = new Product(name3);
                    productService.findNameProduct(name3);
                    break;
                case 6:
                    productService.SortByProductPrice();
                    productService.displayProduct();
                    break;
                case 7:
                    productService.displayProduct();
                    break;
            }

        } while (select != 0);


    }
}
