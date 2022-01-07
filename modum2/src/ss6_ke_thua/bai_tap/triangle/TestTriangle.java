package ss6_ke_thua.bai_tap.triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập màu sắc của tam giác");
        String color = sc.nextLine();
        System.out.println("nhập vào độ dài cạnh a");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("nhập vào độ dài cạnh b");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("nhập vào độ dài cạnh c");
        double c = Double.parseDouble(sc.nextLine());
        Triangle propertyTriangle = new Triangle(color, a, b, c);
        System.out.println("diện tích tam giác là: " + propertyTriangle.getArea());
        System.out.println("chu vi tam giác là" + propertyTriangle.perimeter());
        System.out.println(propertyTriangle.toString());


    }
}
