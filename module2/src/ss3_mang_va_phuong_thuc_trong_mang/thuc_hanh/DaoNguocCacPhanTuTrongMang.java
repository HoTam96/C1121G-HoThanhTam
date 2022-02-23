package ss3_mang_va_phuong_thuc_trong_mang.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class DaoNguocCacPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size ;
        do {
            System.out.println("nhập vào mảng tối da 20 phần tử");
            size = Integer.parseInt(sc.nextLine());
        }while (size>20);
        int[] array = new int[size];
        for (int i =0 ; i<array.length;i++){
            System.out.println("nhập vào phân tử thứ "+i);
            array[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(array));
        for (int i =0;i<array.length;i++){
            int item = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1] = item;

        }
        System.out.println("phần tử đảo ngược");
        System.out.println(Arrays.toString(array));

    }
}
