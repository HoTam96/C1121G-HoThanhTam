package ss3_mang_va_phuong_thuc_trong_mang.thuc_hanh;

import java.util.Scanner;

public class ChuongTrinhChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t 1. Fahrenheit to Celsius \n" +
                "\t 2. Celsius to Fahrenheit\n" +
                "\t 0. Exit ");
        int number = Integer.parseInt(sc.nextLine());
            switch (number) {
                case 1:
                    System.out.println("nhập vào độ F");
                    double fahrenheit = Double.parseDouble(sc.nextLine());
                    double celsius = (5.0 / 9) * (fahrenheit - 32);
                    System.out.println("kết quả là: " + celsius);
                    break;
                case 2:
                    System.out.println("nhập vào độ c");
                    celsius = Double.parseDouble(sc.nextLine());
                    fahrenheit = celsius / (5.0 / 9) + 32;
                    System.out.println("kết quả là: " + fahrenheit);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("nhập lại số");
            }
        }
    }

