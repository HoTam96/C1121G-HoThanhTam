package case_study_c08.controller;

import case_study_c08.service.Impl.NganHangServiceImpl;

import java.util.Scanner;

public class BankCotrooler {
    public static void main(String[] args) {
        NganHangServiceImpl nganHangService = new NganHangServiceImpl();
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
                nganHangService.themMoi();
                    break;
                case 2:
                    nganHangService.xoa();
                    break;
                case 3:
                    nganHangService.xemDanhSachDienThoai();
                    break;
                case 4:
                    nganHangService.timKiem();
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
