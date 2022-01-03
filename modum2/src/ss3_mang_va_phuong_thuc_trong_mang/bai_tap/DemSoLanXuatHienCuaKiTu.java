package ss3_mang_va_phuong_thuc_trong_mang.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "anhlacuaem";
        System.out.println("nhập kí tự muốn kiểm tra");
//        String data = sc.nextLine();

        char data = 'a';

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==data) {
                count++;
            }
        }


        System.out.println("số lần xuất hiện là: " + count);
    }

}

