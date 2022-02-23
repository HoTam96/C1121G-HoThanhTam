package ss13_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class CaiDatThuatToanSapXepChen {
    public static void insertSort(int arr[]){
     for (int i =1;i<arr.length;i++){
         int x = arr[i];
         int pos = i;
      while (pos>0 && x< arr[pos-1]){
          arr[pos] =arr[pos-1];
          pos--;
      }
         arr[pos]=x;
     }
        System.out.println(Arrays.toString(arr));


    }

    public static void main(String[] args) {
        int [] arr = {3,6,8,4,2,2,1,3,5,6};
        insertSort(arr);
    }
}

