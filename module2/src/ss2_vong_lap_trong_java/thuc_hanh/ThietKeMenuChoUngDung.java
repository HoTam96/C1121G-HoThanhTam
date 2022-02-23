package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class ThietKeMenuChoUngDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice= 1;
        while (choice != 0) {
            System.out.println("menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the  rectangle");
            System.out.println("3. Draw the  rectangle");
            System.out.println("0. exit");
            System.out.println("enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("no choice!");

            }
        }
    }
}