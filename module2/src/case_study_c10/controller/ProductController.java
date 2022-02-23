package case_study_c10.controller;

import case_study_c10.product.impl.ExportProductImpl;
import case_study_c10.product.impl.ImportProductImpl;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        ExportProductImpl exportProduct = new ExportProductImpl();
        ImportProductImpl importProduct = new ImportProductImpl();
        Scanner scanner = new Scanner(System.in);


        int choice = 0;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÍ SẢN PHẨM");
            System.out.println("1. addNew");
            System.out.println("2. delete");
            System.out.println("3. disPlay");
            System.out.println("4. search");
            System.out.println("5. exit");
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    System.out.println("nhập sai định dạng mời nhập lại");
                }
            }
            switch (choice) {
                case 1:
                    boolean check = true;
                    while (check) {
                        System.out.println("chọn sản phẩm cần thêm mới");
                        System.out.println("1. sản phẩm xuất khẩu");
                        System.out.println("2. sản phẩm nhập khẩu");
                        try {
                        choice = Integer.parseInt(scanner.nextLine());
                            if (choice == 1) {
                                exportProduct.addNew();
                                check=false;
                            } else if (choice == 2) {
                                importProduct.addNew();
                                check=false;

                            } else {
                                System.out.println("nhập chưa đúng cần nhập lai");
                            }
                        }catch (NumberFormatException e){
                            e.printStackTrace();
                        }

                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("chọn sản phẩm cần xóa");
                        System.out.println("1. sản phẩm xuất khẩu");
                        System.out.println("2. sản phẩm nhập khẩu");
                        try {
                            choice = Integer.parseInt(scanner.nextLine());
                            if (choice == 1) {
                                exportProduct.delete();
                                break;
                            } else if (choice == 2) {
                                importProduct.delete();
                                break;
                            } else {
                                System.out.println("nhập chưa đúng cần nhập lai");
                            }
                        }catch (NumberFormatException e){
                            e.printStackTrace();
                            System.out.println("sai định dạng mời nhập lại");
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        System.out.println("chọn sản phẩm cần xem ");
                        System.out.println("1. sản phẩm xuất khẩu");
                        System.out.println("2. sản phẩm nhập khẩu");
                        try {
                            choice = Integer.parseInt(scanner.nextLine());
                            if (choice == 1) {
                                exportProduct.disPlay();
                                break;
                            } else if (choice == 2) {
                                importProduct.disPlay();
                                break;
                            } else {
                                System.out.println("nhập chưa đúng cần nhập lai");
                            }
                        }catch (NumberFormatException e){
                            e.printStackTrace();
                            System.out.println("sai định dạng mời nhập lại");
                        }

                    }
                    break;
                case 4:
                    while (true) {
                        System.out.println("chọn sản phẩm cần tìm kiếm");
                        System.out.println("1. sản phẩm xuất khẩu");
                        System.out.println("1. sản phẩm nhập khẩu");
                        try {
                            choice = Integer.parseInt(scanner.nextLine());
                            if (choice==1){
                                exportProduct.search();
                                break;
                            }else if (choice==2){
                                exportProduct.search();
                                break;
                            }else {
                                System.out.println("sai định dạng mời nhập lại");
                            }
                        } catch (NumberFormatException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                default:
                    if (choice == 5) {
                        System.out.println("đã thoát");
                    } else {
                        System.out.println("nhập chưa đúng mới nhập lại");
                    }
            }
        } while (choice != 5);

    }

}
