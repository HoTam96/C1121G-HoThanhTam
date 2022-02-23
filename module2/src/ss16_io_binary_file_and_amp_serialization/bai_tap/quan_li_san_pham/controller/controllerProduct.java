package ss16_io_binary_file_and_amp_serialization.bai_tap.quan_li_san_pham.controller;

import ss16_io_binary_file_and_amp_serialization.bai_tap.quan_li_san_pham.module.service.ProductService;

import java.util.Scanner;

public class controllerProduct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        ProductService productService = new ProductService();
        do {
            System.out.println("--------chọn chức năng");
            System.out.println("1. add");
            System.out.println("2. display");
            System.out.println("3. find");
            System.out.println("4. exit");
            choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                productService.add();
            } else if (choice == 2) {
                productService.display();
            } else if (choice == 3) {
                System.out.println(" nhập tên cần tìm");
                String name = sc.nextLine();
                productService.find(name);
            }
        } while (choice != 4);


    }
}
