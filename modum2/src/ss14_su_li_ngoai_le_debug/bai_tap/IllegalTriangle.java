package ss14_su_li_ngoai_le_debug.bai_tap;

import java.util.Scanner;

public class IllegalTriangle {
    public static int[] triTangcle() throws IllegalTriangleException {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào độ dài cạnh a");
        int a = sc.nextInt();
        System.out.println("nhập vào độ dài cạnh b");
        int b = sc.nextInt();
        System.out.println("nhập vào độ dài cạnh c");
        int c = sc.nextInt();
        if ((a + b) < c || (a + c) < b || (b + c) < a) {
            throw new IllegalTriangleException("tổng 2 cạnh phải lớn hơn cạnh còn lại");

        } else if (a < 1 || b < 1 || c < 1) {
            throw new IllegalTriangleException("a , b , c phải lớn hơn 0");

        }
        int[] arr = {a, b, c};
        return arr;


    }

    public static void display() {
        boolean flag = true;
        while (flag) {
            flag = false;
            try {
                int[] array = triTangcle();
                for (Integer element : array) {
                    System.out.println(element);
                }

            } catch (IllegalTriangleException e) {
                e.printStackTrace();
                flag = true;
            }

        }


    }

    public static void main(String[] args) {
        display();

    }
}
