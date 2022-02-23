package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số nguyên a");
        int numberA = Integer.parseInt(sc.nextLine());
        System.out.println("nhập vào số nguyên b");
        int numberB = Integer.parseInt(sc.nextLine());

if (numberA==0&&numberB==0){
    System.out.println("không có ước chung lớn nhât");
}
else if(numberA==0||numberB==0){
    if (numberA>numberB){
        System.out.println("ước chung lớn nhất là: "+ numberA);
    }else {
        System.out.println("ước chung lớn nhất là: "+numberB);
    }
}
else {
    while (numberA!=numberB){
        if (numberA>numberB){
            numberA-=numberB;
        }
        else {
            numberB=numberB-numberA;
        }
    }
    System.out.println("ước chungc lớn nhất là: "+numberA);
}


    }
}
