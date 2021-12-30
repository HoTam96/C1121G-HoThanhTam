package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width ;
        float height;

        Scanner data = new Scanner(System.in);

        System.out.println("enter width: ");
        width=data.nextFloat();

        System.out.println("enter height: ");
        height = data.nextFloat();
        float are = width*height;
        System.out.println("diện tích là :"+are);
    }

    }
    

