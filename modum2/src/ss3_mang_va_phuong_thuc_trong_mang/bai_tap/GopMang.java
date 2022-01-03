package ss3_mang_va_phuong_thuc_trong_mang.bai_tap;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,10};
        int[] array3 = new int[10];
        for (int i =0;i< array1.length;i++){
            array3[i]=array1[i];

        }
        for (int j =1;j<=array2.length;j++){
            int n = array1.length-1;
            array3[n+j]=array2[j-1];
        }

        System.out.println(Arrays.toString(array3));
    }


}
