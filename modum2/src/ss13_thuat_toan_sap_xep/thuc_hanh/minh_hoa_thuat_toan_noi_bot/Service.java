package ss13_thuat_toan_sap_xep.thuc_hanh.minh_hoa_thuat_toan_noi_bot;

import java.util.Arrays;

public class Service {
    public void sapXepNoiBot(int [] arr){

        for (int i =0; i<arr.length;i++){
            for (int j =arr.length-1;j>i;j--){
                if (arr[j]<arr[j-1]){
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
