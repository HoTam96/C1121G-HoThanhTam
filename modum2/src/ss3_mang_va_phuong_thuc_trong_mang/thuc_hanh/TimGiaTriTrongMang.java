package ss3_mang_va_phuong_thuc_trong_mang.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
//    Ứng dụng có sẵn một danh sách tên của sinh viên, cho phép người dùng nhập
//    vào một tên sinh viên, sau đó hiển thị vị trí của sinh viên đó trong
//    danh sách (nếu tìm thấy) hoặc là thông báo không tìm thấy.

    public static void main(String[] args) {
        String[] array = {"tai", "tu", "tien", "tinh"};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào tên sinh viên");
        String ten = sc.nextLine();
        boolean flag =true;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(ten)) {
                System.out.println("vị trí của tên: " + ten + " trong danh sách là thứ " + i);
                flag=true;
                break;
            }
            else {
                flag = false;
            }
        }
        if (!flag) {
            System.out.println("không tìm thấy tên trong danh sách");
        }
    }
}
