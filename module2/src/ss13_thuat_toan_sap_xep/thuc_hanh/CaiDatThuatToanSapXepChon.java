package ss13_thuat_toan_sap_xep.thuc_hanh;

import java.util.Arrays;

public class CaiDatThuatToanSapXepChon {

public static void selectionSort(int [] arr){
    for (int i =0;i<arr.length;i++){
        int min = i;

        for (int j =i+1;j<arr.length;j++){
            if (arr[j]<arr[min]){
                min = j;
            }
        }
        if (min!=i){
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    System.out.println(Arrays.toString(arr));

}

    public static void main(String[] args) {
        int [] arr = {6,5,8,4,1,2,3,1,5};
        selectionSort(arr);
    }

}
