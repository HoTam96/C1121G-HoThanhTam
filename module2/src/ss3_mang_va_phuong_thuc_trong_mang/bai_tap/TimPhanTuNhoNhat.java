package ss3_mang_va_phuong_thuc_trong_mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào chiều dài của mảng");
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];

        for (int i =0 ; i<array.length;i++){
            System.out.println("nhập vào phần tử thứ "+(i+1));
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("mảng vừa nhập là: "+ Arrays.toString(array));
        int min = array[0];
        int index =0;
        for (int i =0; i<array.length;i++){
            if (array[i]<min){
                min = array[i];
                index=i;
            }
        }
        System.out.println("số nhỏ nhất trong mảng là: "+min+" vị trí "+ index);

        }
}
