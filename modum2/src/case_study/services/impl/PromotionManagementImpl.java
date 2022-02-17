package case_study.services.impl;

import case_study.services.PromotionService;

import case_study.models.Booking;
import case_study.models.Customer;
import case_study.until.SortByNameDate;

import java.time.LocalDate;
import java.util.*;

public class PromotionManagementImpl implements PromotionService {
    private static Map<String, Integer> voucherMap = new LinkedHashMap<>();
    private static List<Booking> bookingList = new ArrayList<>(BookingServiceImpl.bookingSet);
    private static Stack<Booking> bookingStack = new Stack<>();


    @Override
    public void displayListCustomerUserService() {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhập vào năm sử dụng dịch vụ");
            int year = Integer.parseInt(sc.nextLine());

            String str = Integer.toString(year);

            for (Customer element : CustomerSerViceImpl.customerLinkedList) {
                if (element.getMakhachHang().getNgayBatDau().indexOf(str) > 0) {
                    System.out.println(element);
                    flag = true;
                } else {
                    flag = false;
                }
            }
            if (flag) {
                break;
            } else {
                System.out.println("năm sử dụng dịch vụ không tồn tại");
                flag = false;
            }

        } while (!flag);


    }

    @Override
    public void displayListCustomerGetVoucher() {

        Scanner sc = new Scanner(System.in);

        System.out.println("nhập vào số lượng voucher 10%");
        int tenPercent = Integer.parseInt(sc.nextLine());
        System.out.println("nhập vào số lượng voucher 20%");
        int twentyPercent = Integer.parseInt(sc.nextLine());
        System.out.println("nhập vào số lượng voucher 50%");
        int fiftyPercent = Integer.parseInt(sc.nextLine());


        voucherMap.put("TenPercent", tenPercent);
        voucherMap.put("TwentyPercent", twentyPercent);
        voucherMap.put("FiftyPercent", fiftyPercent);

//        lấy thời gian từ hệ thống .
        String str = java.time.LocalDate.now() + "";
        System.out.println("thời gian hiện tại " + str);
//        cắt chuổi để lấy tháng.
        str.trim();
        str = str.replaceAll("-", "/");

        str = str.substring(5, 8) + str.substring(0, 4);


        Collections.sort(bookingList, new SortByNameDate());
        bookingStack = new Stack<>();
        String date;
        String date1;
        System.out.println("-------danh sách khách hàng đã booking trong tháng " + str + " ----------");
        for (Booking element : bookingList) {
            date = element.getNgayBatDau().substring(3);

            if (date.equals(str)) {
                bookingStack.push(element);
            }
        }
        for (Booking e : bookingStack) {
            if (voucherMap.get("TenPercent") > 0) {
                voucherMap.put("TenPercent", voucherMap.get("TenPercent") - 1);
                System.out.println(e + "," + "TenPercent");

            } else if (voucherMap.get("TwentyPercent") > 0) {
                System.out.println(e + "," + "TwentyPercent");
                voucherMap.put("TwentyPercent", voucherMap.get("TwentyPercent") - 1);

            } else if (voucherMap.get("FiftyPercent") > 0) {
                System.out.println(e + "," + "FiftyPercent");
                voucherMap.put("FiftyPercent", voucherMap.get("FiftyPercent") - 1);
            } else {
                System.out.println(e);
                System.out.println("đã hết voucher");

            }
        }

    }


}
