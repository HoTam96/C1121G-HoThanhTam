package ss13_thuat_toan_sap_xep.thuc_hanh;

import java.util.Arrays;

public class CaiDatThuatToanSapXepNoiBot {

    public static void bubbleSort(int[] list) {
        boolean flag = true;

//        for (int k = 1; k < list.length && needNextPass; k++) {
//            /* Array may be sorted and next pass not needed */
//            needNextPass = false;
//            for (int i = 0; i < list.length - k; i++) {
//                if (list[i] > list[i + 1]) {
//                    int temp = list[i];
//                    list[i] = list[i + 1];
//                    list[i + 1] = temp;
//
//                    needNextPass = true; /* Next pass still needed */
//                }
//            }
//        }
//        System.out.println(Arrays.toString(list));
        for (int i = 0; i < list.length && flag; i++) {
            flag = false;
            for (int j = list.length - 1; j > i; j--) {
                if (list[j] < list[j - 1]) {
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                    flag = true;
                }
            }
        }

        System.out.println(Arrays.toString(list));


    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 3, 2, 5, 7};
        bubbleSort(arr);
    }

}
