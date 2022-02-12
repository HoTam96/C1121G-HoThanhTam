package case_study.module.furama_service.impl;

import case_study.module.furama_service.CustomerService;
import case_study.module.module_Furama.information.Booking;
import case_study.module.module_Furama.information.Customer;
import case_study.module.module_Furama.information.Employee;
import case_study.module.module_Furama.information.LoaiKhach;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerSerViceImpl implements CustomerService {
    public static List<Customer> customerLinkedList = new LinkedList<>();
    private static List<Booking> bookingLinkedList = new LinkedList<>(BookingServiceImpl.bookingSet);
    private static List<LoaiKhach> typeLinkedList = new LinkedList<>();


    static {


        LoaiKhach diamon = new LoaiKhach("diamon");
        LoaiKhach platinium = new LoaiKhach("platinium");
        LoaiKhach gold = new LoaiKhach("gold");
        LoaiKhach silver = new LoaiKhach("silver");
        LoaiKhach member = new LoaiKhach("member");
        typeLinkedList.add(diamon);
        typeLinkedList.add(platinium);
        typeLinkedList.add(gold);
        typeLinkedList.add(silver);
        typeLinkedList.add(member);

        Customer customer1 = new Customer("hồ thanh tâm", "12/11/1998", "nam", "2069876552", 08627385d, "hotam196@gmail.com",bookingLinkedList.get(0) , platinium, "quảng nam");
        Customer customer2 = new Customer("lê quang đại", "12/11/1999", "nam", "2069876552", 08627385d, "hotam196@gmail.com", bookingLinkedList.get(1), silver, "đà nẵng");
        Customer customer3 = new Customer("trần việt hùng", "12/11/1938", "nam", "2069876552", 08627385d, "hotam196@gmail.com", bookingLinkedList.get(2), member, "huế");
        customerLinkedList.add(customer1);
        customerLinkedList.add(customer2);
        customerLinkedList.add(customer3);

    }


    @Override
    public void addNew() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào họ và tên");
        String name = sc.nextLine();
        System.out.println("nhập vào ngày sinh");
        String birthDay = sc.nextLine();
        System.out.println("nhập vào giới tính");
        String male = sc.nextLine();
        System.out.println("nhập vào CMND");
        String cMND = sc.nextLine();
        System.out.println("nhập vào số điện thoai");
        double sDT = Double.parseDouble(sc.nextLine());
        System.out.println("nhập vào email");
        String email = sc.nextLine();

        Booking booking = null;
        boolean flag = false;
        while (!flag) {
            System.out.println("nhập mã booking để lấy thông tin mã khách hàng");
            String mabooking = sc.nextLine();

            for (Booking element : BookingServiceImpl.bookingSet) {
                if (element.getMaBooking().equals(mabooking)) {
                    System.out.println(element);
                    booking = element;
                    flag = true;
                    break;
                } else if (!element.getMaBooking().equals(mabooking)) {
                    flag = false;
                }
            }
            if (flag) {
                flag = true;
            } else {
                System.out.println(" mã booking ko tồn tài");
                flag = false;
            }
        }

        System.out.println(" chọn loại khách hàng");
        System.out.println("1. diamon\n" +
                "2. platinium\n" +
                "3. gold\n" +
                "4. silver\n" +
                "5. member ");
        int choice = Integer.parseInt(sc.nextLine());
        System.out.println("nhập địa chỉ");
        String address = sc.nextLine();

        Customer customer = new Customer(name, birthDay, male, cMND, sDT, email, booking, typeLinkedList.get(choice - 1), address);
        customerLinkedList.add(customer);

    }

    @Override
    public void displayList() {
        for (Customer element : customerLinkedList) {
            System.out.println(element);
        }

    }

    @Override
    public void Edit(String id) {

    }

    public void edit(int id) {
        boolean flag = true;
        for (Customer element : customerLinkedList) {
            if (element.getId() == id) {
                Scanner sc = new Scanner(System.in);
                System.out.println("chọn thông tin cần edit");
                int choice;
                do {
                    System.out.println("1. tên khách hàng\n" +
                            "2. ngày sinh\n" +
                            "3. giới tính\n" +
                            "4. chứng minh nhân dân\n" +
                            "5. số điện thoai\n" +
                            "6. email\n" +
                            "7. mã khách hàng\n" +
                            "8. loại khách hàng\n" +
                            "9. đại chỉ " +
                            "0. thoát");
                    choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            System.out.println("nhập vào họ và tên");
                            String name1 = sc.nextLine();
                            element.setHoTen(name1);
                            break;
                        case 2:
                            System.out.println("nhập vào ngày sinh");
                            String birthDay = sc.nextLine();
                            element.setNgaySinh(birthDay);
                            break;
                        case 3:
                            System.out.println("nhập vào giới tính");
                            String male = sc.nextLine();
                            element.setGioiTinh(male);
                            break;
                        case 4:
                            System.out.println("nhập vào CMND");
                            String cMND = sc.nextLine();
                            element.setcMND(cMND);
                            break;
                        case 5:
                            System.out.println("nhập vào số điện thoai");
                            double sDT = Double.parseDouble(sc.nextLine());
                            element.setSoDienThoai(sDT);
                            break;
                        case 6:
                            System.out.println("nhập vào email");
                            String email = sc.nextLine();
                            element.setEmail(email);
                            break;
                        case 7:

                            Booking booking1 = null;
                            boolean flag1 = false;
                            while (!flag1) {
                                System.out.println("nhập vào mã booking dể edit lại  mã khách hàng");
                                String booking = sc.nextLine();
                                for (Booking element1 : BookingServiceImpl.bookingSet) {
                                    if (element1.getMaBooking().equals(booking)) {
                                        booking1 = element1;
                                        element.setMakhachHang(booking1);
                                        flag1 = true;
                                        break;
                                    } else if (!element1.getMaBooking().equals(booking)) {
                                        flag1 = false;
                                    }
                                }
                                if (!flag1) {
                                    System.out.println(" booking ko tồn tại mời nhập lại");
                                    flag1 = false;
                                } else {
                                    flag1 = true;
                                }

                            }
                            break;
                        case 8:
                            System.out.println(" chọn loại khách hàng");
                            System.out.println("1. diamon\n" +
                                    "2. platinium\n" +
                                    "3. gold\n" +
                                    "4. silver\n" +
                                    "5. member ");
                            int choice1 = Integer.parseInt(sc.nextLine());
                            element.setLoaiKhach(typeLinkedList.get(choice1 - 1));
                            break;
                        case 9:
                            System.out.println("nhập địa chỉ");
                            String address = sc.nextLine();
                            element.setDiaChi(address);
                            break;
                        default:
                            if (choice != 0) {
                                System.err.println("mời nhập lại");
                            }
                    }

                } while (choice != 0);
            }

        }

    }


}
