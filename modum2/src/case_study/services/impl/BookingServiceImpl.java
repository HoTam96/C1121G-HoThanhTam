package case_study.services.impl;

import case_study.data.reader_file.ReaderFile;
import case_study.data.write_file.WriteFileCsv;
import case_study.models.Facility;
import case_study.models.Booking;
import case_study.models.Customer;
import case_study.services.BookingService;
import case_study.until.SortByNameDate;

import java.util.*;

public class BookingServiceImpl implements BookingService {


    public static Set<Booking> bookingSet = new TreeSet<>();
    public static Set<Booking> bookingSet1 = new TreeSet<>();

    private static List<String> stringList = new ArrayList<>();


    public static List<Booking> bookingList;

    public static String PATHBOOKING = "src/case_study/until/file_csv/Booking/Booking.csv";
    public static String PATHBOOKING1 = "src/case_study/until/file_csv/Booking/Booking1.csv";
    public static String PATHLOAIDICHVU = "src/case_study/until/file_csv/Booking/LoaiDichVu.csv";


    //    static {
//        List<Facility> facilityList = ReaderFile.readerFacilityArraylist("src/case_study/until/file_csv/Facility/FacilityArrayList.csv");
//        stringList.add("VILLA");
//        stringList.add("HOUSE");
//        stringList.add("ROOM");
//
////        WriteFileCsv.writeLoaiDichVu(stringList,PATHLOAIDICHVU,true);
//
//        Booking booking1 = new Booking("BK001", "12/02/2022", "16/01/2022", "ms01", facilityList.get(1), stringList.get(0));
//        Booking booking2 = new Booking("BK002", "13/02/2022", "14/03/2022", "ms02", facilityList.get(4), stringList.get(1));
//        Booking booking3 = new Booking("BK003", "11/01/2022", "20/01/2022", "ms03", facilityList.get(7), stringList.get(2));
//        bookingSet.add(booking1);
//        bookingSet.add(booking2);
//        bookingSet.add(booking3);
////        WriteFileCsv.writeBooking(bookingSet,PATHBOOKING,true);
//
//
//    }
    @Override
    public void addNew() {

        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        Scanner sc = new Scanner(System.in);
        String customerCode = "";
        int choice;
        boolean flag = true;
        do {
            System.out.println("1. chọn từ danh sách khách hàng  đã booking\n" +
                    "2. thêm mới 1 booking\n" +
                    "0. thoát ");

            choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                int luaChon = 1;

                System.out.println("nhập id  để hiển thị thông tin khách hàng");
                int id = Integer.parseInt(sc.nextLine());
                List<Customer> customerList = ReaderFile.readerCustomer("src/case_study/until/file_csv/customer/Customer.csv");
                for (Customer element : customerList) {
                    if (element.getId() == id) {
                        System.out.println(element);
                        flag = true;
                        break;
                    } else {
                        flag = false;
                    }
                }
                if (!flag) {
                    System.out.println("id nhập chưa chính xác");
                    addNew();
                }
                do {

                    System.out.println("bạn có muốn thêm khách hàng này vào booking không");
                    System.out.println("1. yes\n" +
                            "2. No");

                    luaChon = Integer.parseInt(sc.nextLine());
                    if (luaChon == 1) {
                        System.out.println("nhập mã booking");
                        String bookingCode = sc.nextLine();
                        System.out.println("ngày bắt đầu booking");
                        String bookingStart = sc.nextLine();
                        System.out.println("ngày kết thúc booking");
                        String bookingEnd = sc.nextLine();

                        Facility facility = chooseFacility();

                        System.out.println("loại dịch vụ");
                        System.out.println("1.VILLA" +
                                "\t2.HOUSE" +
                                "\t3.ROOM");
                        //                        chọn từ danh sách có sẵn
                        List<String> stringList = ReaderFile.readerTypeService(PATHLOAIDICHVU);
                        int choice2 = Integer.parseInt(sc.nextLine());
                        //đọc file customer
                        List<Customer> customerList1 = ReaderFile.readerCustomer(CustomerSerViceImpl.PATHFILECUSTOMER);
                        for (Customer element : customerList1) {
                            if (element.getId() == id) {
                                customerCode = element.getMakhachHang().getMaKhachHang();
                            }
                        }
                        List<Facility> facilityArraylist = ReaderFile.readerFacilityArraylist(FacilityServiceImpl.PATHFACILITYLIST);
                        Booking booking = new Booking(bookingCode, bookingStart, bookingEnd, customerCode, facility, stringList.get(choice2 - 1));
                        bookingSet.add(booking);
                        bookingSet1.add(booking);
                    } else {
                        if (luaChon == 2) {
                            System.out.println("bạn chọn No");

                        } else {
                            System.out.println("nhập chưa đúng");

                        }

                    }
                } while (luaChon != 2);

            } else if (choice == 2) {
                System.out.println("nhập mã booking");
                String bookingCode = sc.nextLine();
                System.out.println("ngày bắt đầu booking");
                String bookingStart = sc.nextLine();
                System.out.println("ngày kết thúc booking");
                String bookingEnd = sc.nextLine();
//gọi function để kiểm tra dịch vụ booking
                Facility facility = chooseFacility();

                System.out.println("loại dịch vụ");
                System.out.println("1.VILLA" +
                        "\t2.HOUSE" +
                        "\t3.ROOM");
                int choice2 = Integer.parseInt(sc.nextLine());
//                đọc file loại khoách
                List<String> stringList = ReaderFile.readerTypeService(PATHLOAIDICHVU);

                System.out.println("nhập mã khách hàng");
                String customerCode1 = sc.nextLine();

                List<Facility> facilityArraylist1 = ReaderFile.readerFacilityArraylist(FacilityServiceImpl.PATHFACILITYLIST);
                Booking booking = new Booking(bookingCode, bookingStart, bookingEnd, customerCode1, facility, stringList.get(choice2 - 1));
                bookingSet.add(booking);
                bookingSet1.add(booking);
                WriteFileCsv.writeBooking(bookingSet, PATHBOOKING, true);
                WriteFileCsv.writeBooking(bookingSet1, PATHBOOKING1, true);
            } else {
                if (choice == 0) {
                    System.out.println("đã thoát");
                } else {
                    System.out.println("nhập chưa đúng");
                }

            }
        } while (choice != 0);

    }

    @Override
    public void displayList() {
        Set<Booking> bookingSet = ReaderFile.readerBooking(PATHBOOKING1);
        List<Booking> bookingList = new ArrayList<>(bookingSet);
        Collections.sort(bookingList, new SortByNameDate());
        for (Booking element : bookingList) {
            System.out.println(element);
        }
    }

    public static Facility chooseFacility() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("danh sách dịch vụ");
        Map<Facility, Integer> facilityLinkedMap = ReaderFile.readerFileFacilityMap
                (FacilityServiceImpl.PATHFACILITYMAP);
        for (Map.Entry<Facility, Integer> keyList : facilityLinkedMap.entrySet()) {
            System.out.println(keyList.getKey().toString() + "số lần sử dụng " + keyList.getValue());
        }
        System.out.println("nhập id dịch vu");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        while (check) {
            for (Map.Entry<Facility, Integer> entry : facilityLinkedMap.entrySet()) {
                if (id == (entry.getKey().getId())) {

                    if (entry.getValue() < 6) {

                        facilityLinkedMap.put(entry.getKey(), entry.getValue() + 1);
                        WriteFileCsv.writeFacilityMap(facilityLinkedMap, FacilityServiceImpl.PATHFACILITYMAP, false);
                    } else {
                        facilityService.maintenance(entry.getValue() - 1);
                    }
                    check = false;
                    return entry.getKey();

                }
            }
            if (check) {
                System.out.println("bạn đã nhập sai, vui lòng nhập lại");
                id = Integer.parseInt(scanner.nextLine());
            }


        }
        return null;

    }

}



