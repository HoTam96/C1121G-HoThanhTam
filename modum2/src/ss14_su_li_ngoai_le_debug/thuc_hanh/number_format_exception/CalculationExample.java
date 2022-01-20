package ss14_su_li_ngoai_le_debug.thuc_hanh.number_format_exception;

import java.util.Scanner;

public class CalculationExample {
    public static void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (NumberFormatException e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập x");
        int x = sc.nextInt();
        System.out.println("nhập y");
        int y = sc.nextInt();
        calculate(x, y);

    }
}
