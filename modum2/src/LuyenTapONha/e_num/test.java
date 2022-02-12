package LuyenTapONha.e_num;

import java.util.Scanner;

public class test {
//    public static void main(String[] args) {
//        System.out.println(Day.December.getSoNgay());
//        System.out.println(  Day.April.getTuan()+","+ Day.April.getSoNgay()+","+Day.April.getThu());
//    }
public static void main(String[] args) {

    int i = 7;
    int j = 6;
    boolean flag =true;
    while (flag){
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        if (j>i){
            flag = false;
        }else {
            flag =true;
        }
        if (flag){
            System.out.println("sai rồi");
            flag = true;

        }else {
            System.out.println("đúng rôuf");
            flag =false;
        }
    }
}





}
