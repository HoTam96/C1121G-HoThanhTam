package case_study.controller;

import case_study.module.furama_service.EmployeeService;
import case_study.module.furama_service.impl.EmployeeServiceImpl;
import case_study.module.module_Furama.information.Employee;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FuramaController furama  = new FuramaController();
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        int choice = 1;
        do {

            System.out.println("------------Chọn chức năng--------------");
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management\n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("-----------chọn chức năng----------");
                    System.out.println(" 1\tDisplay list employees\n" +
                            "                    2\tAdd new employee\n" +
                            "                    3\tEdit employee\n" +
                            "                    4\tReturn main menu");
                    choice = Integer.parseInt(sc.nextLine());
                    if (choice==1){
                        employeeService.displayList();
                    }
                    else if (choice ==2){
                        employeeService.addNew();
                    }
                    else {
                        System.out.println("nhập tên nhân viên cần sữa");
                        String name = sc.nextLine();
                        employeeService.Edit(name);
                    }



                    break;
                case 2:
                    System.out.println("---------chọn chức năng-------------");
                    System.out.println("1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");

                    choice = Integer.parseInt(sc.nextLine());
                    if (choice==1){
                        employeeService.displayList();
                    }
                    else if (choice ==2){
                        employeeService.addNew();
                    }




                    break;
                case 3:
                    System.out.println("-----------chọn chức năng------------");
                    System.out.println("1\tDisplay list facility\n" +
                            "2\tAdd new facility\n" +
                            "3\tDisplay list facility maintenance\n" +
                            "4\tReturn main menu\n");
                    choice = Integer.parseInt(sc.nextLine());
                    if (choice==1){
                        employeeService.displayList();
                    }
                    else if (choice ==2){
                        employeeService.addNew();
                    }
                    break;
                case 4:
                    System.out.println("---------chọn chức năng--------------");
                    System.out.println("1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new constracts\n" +
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
                    break;
                case 5:
                    System.out.println("---------chọn chức năng--------------");
                    System.out.println("1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                default:
                    System.err.println("nhập chưa đúng mời nhập lại");
            }
        } while (choice != 6);

    }
}
