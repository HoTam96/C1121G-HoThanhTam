package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static Boolean checkSoNguyenTo(int number) {
        boolean flag = true;
//       String str ="";
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                flag=false;
                break;

            } else {
                flag = true;
            }

        }
        if (flag){
            return true ;
    }
        else {
            return false ;
        }

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số nguyên tố cần kiểm tra");
        int data = Integer.parseInt(sc.nextLine());
       if (data<2){
           System.out.println(data+"không phải là số nguyên tố");
       }
       else {
           boolean soNguyenTo = checkSoNguyenTo(data);
           if (soNguyenTo==true){
               System.out.println(data +" là số nguyên tố");
           }
           else {
               System.out.println(data+" không phải số nguyên tố");
           }
       }

    }
}
