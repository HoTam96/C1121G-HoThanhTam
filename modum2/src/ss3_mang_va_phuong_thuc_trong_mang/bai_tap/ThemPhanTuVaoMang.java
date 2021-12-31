package ss3_mang_va_phuong_thuc_trong_mang.bai_tap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
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

        System.out.println("nhập phần tử cần thêm");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("nhập vị trí cần chèn");
        int index = Integer.parseInt(sc.nextLine());


        if (number<0){
            System.out.println("cần nhập lại ");
        }
        else {
            boolean flag = true;
            int[] newarray = new int[array.length + 1];
            for (int i = 0; i < array.length + 1; i++) {
                if (i != index) {
                    newarray[i]=array[i];

                }
                else {
                    flag=false;
                    
                }
            }
            if (!flag){
                newarray[]=number

            }


        }
    }
}
