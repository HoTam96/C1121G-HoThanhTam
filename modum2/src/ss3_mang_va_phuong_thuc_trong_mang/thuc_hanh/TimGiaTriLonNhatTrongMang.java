package ss3_mang_va_phuong_thuc_trong_mang.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào độ dài của mảng");
        int size;
        do {
            size = Integer.parseInt(sc.nextLine());
            if (size > 20) {
                System.out.println("nhập lại");
            }
        } while (size > 20);
        double[] array = new double[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("nhập vào phần tử thứ " + (i + 1));
            array[i] = Double.parseDouble(sc.nextLine());

        }
        System.out.println(Arrays.toString(array));
        double max = array[0];
        int index=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("số lớn nhất trong mảng là: "+max +" ở vị trí thứ " + index);

    }
}
