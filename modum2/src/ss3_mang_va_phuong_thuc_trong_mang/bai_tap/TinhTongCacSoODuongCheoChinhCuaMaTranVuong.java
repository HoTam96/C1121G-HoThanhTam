package ss3_mang_va_phuong_thuc_trong_mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongCacSoODuongCheoChinhCuaMaTranVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhâp kích thước m của ma trận");
        int m = Integer.parseInt(sc.nextLine());
        System.out.println("nhâp kích thước n của ma trận");
        int n = Integer.parseInt(sc.nextLine());
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("nhập vào phần tử thú " + i + "-" + j);
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
            System.out.println();
        }
//        System.out.println(Arrays.toString(array));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }

        System.out.println("tổng của các số có hàng dọc và ngang bằng nhau là: " + sum);


    }
}
