package ss16_io_binary_file_and_amp_serialization.thuc_hanh.danh_sach_sinh_vien;

import java.util.Scanner;

public class controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudenService studenService = new StudenService();

        int choice =0;
        do {

            System.out.println("--------chọn chức năng---------");
            System.out.println("1. them ");
            System.out.println("2. hiển thị ");
            System.out.println("3. thoát ");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice==1){
                studenService.Add();
            }
            else if (choice==2){
                studenService.display();
            }
        }while (choice!=3);


    }
}
