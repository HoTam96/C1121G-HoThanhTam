package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacSoNguyenToNhoHon100 {
    public static boolean check(int number) {
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            flag = true;
            if (number % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int n = 2;
        String str = "";
        while (n < 100) {
            if (check(n)) {
                str += n + ",";
            }
            n++;
        }
        System.out.println(str);
    }
}
