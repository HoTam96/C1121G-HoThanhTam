package ss3_mang_va_phuong_thuc_trong_mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class xoaPhanTuKhoiMang {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập độ dài của mảng");
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhập phần tử thứ " + (i + 1));
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(array));
        System.out.println("nhập phần tử cần xóa");
        int number = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j]=array[j+1];
                }
                i--;
                array[array.length - 1] = 0;
            }
        }
        System.out.println("mảng sau khí xóa phần tử " + number + " là: " + Arrays.toString(array));
    }
}
