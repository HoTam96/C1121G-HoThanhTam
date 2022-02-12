package case_study.controller;

import case_study.module.furama_service.EmployeeService;
import case_study.module.furama_service.impl.*;
import case_study.module.module_Furama.information.Employee;

import java.io.IOException;
import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FuramaController furamaController = new FuramaController();
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        CustomerSerViceImpl customerSerVice = new CustomerSerViceImpl();
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        BookingServiceImpl bookingService = new BookingServiceImpl();
        ConTractService conTractService = new ConTractService();
        PromotionManagementImpl promotionManagement = new PromotionManagementImpl();

        int choice = 1;
        boolean flag = true;
        try {
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
                        System.out.println("1\tDisplay list employees\n" +
                                "2\tAdd new employee\n" +
                                "3\tEdit employee\n" +
                                "4\tReturn main menu");
                        choice = Integer.parseInt(sc.nextLine());
                        if (choice == 1) {
                            employeeService.displayList();
                        } else if (choice == 2) {
                            employeeService.addNew();
                        } else if (choice == 3) {
                            System.out.println("nhập tên nhân viên cần sữa");
                            String name = sc.nextLine();
                            employeeService.Edit(name);
                        } else {
                            break;
                        }

                    case 2:

                        System.out.println("---------chọn chức năng-------------");
                        System.out.println("1.\tDisplay list customers\n" +
                                "2.\tAdd new customer\n" +
                                "3.\tEdit customer\n" +
                                "4.\tReturn main menu\n");
                        choice = Integer.parseInt(sc.nextLine());
                        if (choice == 1) {
                            customerSerVice.displayList();
                        } else if (choice == 2) {
                            customerSerVice.addNew();
                        } else if (choice == 3) {
                            System.out.println("nhập id khách hàng cần sửa cần edit");
                            try {
                                int id = Integer.parseInt(sc.nextLine());
                                customerSerVice.edit(id);
                            } catch (Exception e) {
                                System.out.println("lỗi định dạng");
                            }

                        }

                        break;
                    case 3:
                        System.out.println("-----------chọn chức năng------------");
                        System.out.println("1\tDisplay list facility\n" +
                                "2\tAdd new facility\n" +
                                "3\tDisplay list facility maintenance\n" +
                                "4\tReturn main menu\n");
                        choice = Integer.parseInt(sc.nextLine());
                        if (choice == 1) {
                            facilityService.displayList();
                        } else if (choice == 2) {
                            do {
                                System.out.println("--------chọn chức năng--------");
                                System.out.println("1.\tAdd New Villa\n" +
                                        "2.\tAdd New House\n" +
                                        "3.\tAdd New Room\n" +
                                        "4.\tBack to menu\n");

                                choice = Integer.parseInt(sc.nextLine());
                                if (choice == 1) {
                                    facilityService.addVilla();
                                } else if (choice == 2) {
                                    facilityService.addHouse();
                                } else if (choice == 3) {
                                    facilityService.addRoom();
                                } else {
                                    if (choice != 4) {
                                        System.out.println("mời nhập lại");
                                    } else {
                                        System.out.println("đã thoát");
                                    }
                                }


                            } while (choice != 4);


                        } else if (choice == 3) {
                            System.out.println("nhập id khách hàng cần sửa cần bảo trì");
                            try {
                                int id = Integer.parseInt(sc.nextLine());
                                facilityService.maintenance(id);
                            } catch (Exception e) {
                                System.out.println("lỗi định dạng");
                            }

                        }

                        break;

                    case 4:
                        int luaChon ;

                        do {
                            System.out.println("---------chọn chức năng--------------");
                            System.out.println("1.\tAdd new booking\n" +
                                    "2.\tDisplay list booking\n" +
                                    "3.\tCreate new constracts\n" +
                                    "4.\tDisplay list contracts\n" +
                                    "5.\tEdit contracts\n" +
                                    "6.\tdelete contracts\n" +
                                    "7.\tReturn main menu\n");
                           luaChon = Integer.parseInt(sc.nextLine());
                            switch (luaChon) {
                                case 1:
//                                    int luaChon1;
                                    do {
                                        System.out.println(" 1. hiển thị danh sách khách hàng đã từng sử dụng dịch vụ\n" +
                                                "2. hiển thị danh sách dịch vụ\n" +
                                                "3. thêm mới booking\n" +
                                                "0. thoát");
                                      luaChon = Integer.parseInt(sc.nextLine());
                                        if (luaChon == 1) {
                                            customerSerVice.displayList();
                                        } else if (luaChon == 2) {
                                            facilityService.displayList();
                                        } else if (luaChon == 3) {
                                            bookingService.addNew();
                                        }else {
                                            if (luaChon==0){
                                                System.out.println("đã thoát");
                                            }else {
                                                System.out.println("mời nhập lại");
                                            }
                                        }

                                    } while (luaChon != 0);
                                    break;
                                case 2:
                                    bookingService.displayList();
                                    break;
                                case 3:
                                    conTractService.addNew();
                                    break;
                                case 4:
                                    conTractService.displayList();
                                    break;
                                case 5:
                                    conTractService.edit();
                                    break;
                                case 6:
                                    conTractService.delete();
                                    break;
                                default:
                                    if (luaChon==7){
                                        System.out.println("đã thoát");
                                    }else {
                                        System.out.println("mời nhập lại ");
                                    }
                            }

                        } while (luaChon != 7);
                        break;
                    case 5:
                        int choice2=1;
                        do {
                            System.out.println("---------chọn chức năng--------------");
                            System.out.println("1.\tDisplay list customers use service\n" +
                                    "2.\tDisplay list customers get voucher\n" +
                                    "3.\tReturn main menu\n");
                          choice2 = Integer.parseInt(sc.nextLine());
                          switch (choice2){
                              case 1:
                                  promotionManagement.displayListCustomerUserService();
                                  break;
                              case 2:
                                  promotionManagement.displayListCustomerGetVoucher();
                                  break;
                              default:

                          }


                        }while (choice2!=3);



                    case 6:
                        flag = false;
                        break;
                    default:
                        System.err.println("nhập chưa đúng mời nhập lại");
                }
            } while (choice != 6);

        } catch (Exception e) {
            System.out.println("lỗi biên dịch");
            main(args);

        }
    }

}
