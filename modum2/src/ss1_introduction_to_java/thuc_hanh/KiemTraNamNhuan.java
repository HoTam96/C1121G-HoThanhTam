package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("nhập vào năm muốn kiểm tra");
        int year = data.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(" năm " + year + " là năm nhuận");
        } else {
            System.out.println("năm " + year + " là năm không nhuận");
        }
    }
}
