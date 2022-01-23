package ss14_su_li_ngoai_le_debug.bai_tap;

import java.util.Random;
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
        Random random = new Random();
        int x = 0;
        while (x < 6) {
            int a = random.nextInt(55);
            System.out.println(a);
            x++;
        }
    }
}