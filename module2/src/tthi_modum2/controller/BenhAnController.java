package tthi_modum2.controller;

import tthi_modum2.service.impl.BenhAnServiceImpl;

import java.util.Scanner;

public class BenhAnController {


    public static void main(String[] args) {
BenhAnServiceImpl benhAnService = new BenhAnServiceImpl();

        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÍ SẢN PHẨM");
            System.out.println("1. Thêm Mới");
            System.out.println("2. Xóa");
            System.out.println("3. Hiển Thị");
            System.out.println("4. Thoát");
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
                    benhAnService.ThemMoi();
                    break;
                case 2:
                    benhAnService.xoa();
                    break;
                case 3:
                    benhAnService.xemDanhSachBenhAn();
                    break;
                default:
                    if (choice == 4) {
                        System.out.println("đã thoát");
                    } else {
                        System.out.println("nhập chưa đúng mới nhập lại");

                    }
            }
        } while (choice != 4);


    }

}
