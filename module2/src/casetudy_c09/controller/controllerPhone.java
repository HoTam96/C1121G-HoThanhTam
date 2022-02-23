package casetudy_c09.controller;

import casetudy_c09.service.impl.DichVuDienThoaiImpl;

import java.util.Scanner;

public class controllerPhone {
    public static void main(String[] args) {
        DichVuDienThoaiImpl dichVuDienThoai = new DichVuDienThoaiImpl();
        Scanner scanner = new Scanner(System.in);


        int choice = 0;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÍ SẢN PHẨM");
            System.out.println("1. themMoi");
            System.out.println("2. xóa");
            System.out.println("3. hiển Thị");
            System.out.println("4. tìm kiếm");
            System.out.println("5. thoát");
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
                    dichVuDienThoai.themMoi();
                    break;
                case 2:
                    dichVuDienThoai.xoa();
                    break;
                case 3:
                    dichVuDienThoai.xemDanhSachDienThoai();
                    break;
                case 4:
                    dichVuDienThoai.timKiem();
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
