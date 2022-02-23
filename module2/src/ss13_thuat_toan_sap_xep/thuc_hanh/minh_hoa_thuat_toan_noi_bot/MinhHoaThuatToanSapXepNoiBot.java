package ss13_thuat_toan_sap_xep.thuc_hanh.minh_hoa_thuat_toan_noi_bot;

import java.util.Scanner;

public class MinhHoaThuatToanSapXepNoiBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        Service service = new Service();
        service.sapXepNoiBot(list);
    }


    }


