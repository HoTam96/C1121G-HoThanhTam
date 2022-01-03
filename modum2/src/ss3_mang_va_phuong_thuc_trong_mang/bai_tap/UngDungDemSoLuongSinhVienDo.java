package ss3_mang_va_phuong_thuc_trong_mang.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class UngDungDemSoLuongSinhVienDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số lượng danh sách ");
        int size;
        do {
            size = Integer.parseInt(sc.nextLine());
            if (size>30){
                System.out.println("nhập tối đa số lượng 30");
            }

        }while (size>30);
        float[] array = new float[size];
        for (int i =0; i<array.length;i++){
            System.out.println("nhập điểm học sinh thứ "+(i+1));
            array[i]=Float.parseFloat(sc.nextLine());
        }
        System.out.println(Arrays.toString(array));
        int amount =0;
        for (int i =0;i<array.length;i++){
            if (array[i]>=5&&array[i]<=10){
                amount++;
            }
        }
        System.out.println("số lượng sinh viên đã đổ là: "+ amount);

    }
}
