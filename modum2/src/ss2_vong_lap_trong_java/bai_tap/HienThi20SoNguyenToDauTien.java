package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {

    public static Boolean checkSoNguyenTo(int number) {
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }

        }
        if (flag) {
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số lượng nguyên tố cần in");
        int numbe = Integer.parseInt(sc.nextLine());
        int count = 0;
        int n = 2;
        String result = "";
        while (count < numbe) {
            if (checkSoNguyenTo(n)) {
                result += n + ",";
                count++;
            }
            n++;
        }
        System.out.println(  " số nguyên tố cần in là: " + result);
    }

}