package ss14_su_li_ngoai_le_debug.thuc_hanh.array_index_out_of_bounds_exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static Integer[] createRanDom() {
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("danh sách các phần tử trong mảng");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.println(arr[i] + "");

        }
        return arr;
    }


    public static void main(String[] args) {
        Random rd = new Random();
        Integer[] array = createRanDom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("vui lòng nhập vào chỉ số phần tử bất kì");
        int index = scanner.nextInt();
        try {
            System.out.println("giá trị của vị trí thứ " + index + "là: " + array[index]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("chỉ số vượt quá giới hạn");
        }


    }

}
