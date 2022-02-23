package ss3_mang_va_phuong_thuc_trong_mang.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoOMotCotXacDinh {
    public static void main(String[] args) {
        int[][] array = {
                {11,12,13},
                {14,15,16},
                {17,18,19}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào cột muốn tính");
        int number= Integer.parseInt(sc.nextLine());
        int sum =0;
        for (int i =0;i<array.length;i++){
            for (int j =0;j<array[i].length;j++) {
                if (j == number) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("tông là: "+sum);
    }
}
