package case_study.module.furama_service.impl;

import case_study.module.furama_service.BookingService;
import case_study.module.furama_service.InterfaceFuramaService;
import case_study.module.module_Furama.Facility;
import case_study.module.module_Furama.House;
import case_study.module.module_Furama.Room;
import case_study.module.module_Furama.Villa;
import case_study.module.module_Furama.information.Booking;
import case_study.module.module_Furama.information.Customer;
import case_study.until.SortByNameDate;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    public static Set<Booking> bookingSet = new TreeSet<>();
    //    private List<Booking>bookingList= new ArrayList<>();
    private static List<String> stringList = new ArrayList<>();


    public static List<Booking> bookingList;

    static {
        stringList.add("VILLA");
        stringList.add("HOUSE");
        stringList.add("ROOM");
        Booking booking1 = new Booking("BK001", "12/02/2022", "16/01/2022", "ms01", "theVilla", stringList.get(0));
        Booking booking2 = new Booking("BK002", "13/02/2022", "14/03/2022", "ms02", "Room", stringList.get(2));
        Booking booking3 = new Booking("BK003", "11/01/2022", "20/01/2022", "ms03", "theVilla", stringList.get(0));
        bookingSet.add(booking1);
        bookingSet.add(booking2);
        bookingSet.add(booking3);


    }

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
                for (Customer element : CustomerSerViceImpl.customerLinkedList) {
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

                        System.out.println(" danh sách các dịch vụ cho thê ở furama");
                        for (Facility element1 : FacilityServiceImpl.facilityArrayList) {
                            System.out.println(element1);
                        }
                        int choice1 = 0;
                        do {

                            System.out.println("chọn tên dịch vụ để thuê theo thứ tự id ");
                            choice1 = Integer.parseInt(sc.nextLine());
                            switch (choice1) {
                                case 1:
                                    if (FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.villa1) < 6) {

                                        FacilityServiceImpl.facilityLinkedMap.put(FacilityServiceImpl.villa1,
                                                FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.villa1) + 1);
                                    } else {
                                        facilityService.maintenance(FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.villa1));
                                    }
                                    break;
                                case 2:
                                    if (FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.villa2) < 6) {

                                        FacilityServiceImpl.facilityLinkedMap.put(FacilityServiceImpl.villa2,
                                                FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.villa2) + 1);
                                    } else {
                                        facilityService.maintenance(FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.villa2));
                                    }
                                    break;
                                case 3:
                                    if (FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.villa3) < 6) {

                                        FacilityServiceImpl.facilityLinkedMap.put(FacilityServiceImpl.villa3,
                                                FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.villa3) + 1);
                                    } else {
                                        facilityService.maintenance(FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.villa3));
                                    }
                                    break;
                                case 4:
                                    if (FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.house1) < 6) {

                                        FacilityServiceImpl.facilityLinkedMap.put(FacilityServiceImpl.house1,
                                                FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.house1) + 1);
                                    } else {
                                        facilityService.maintenance(FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.house1));
                                    }
                                    break;
                                case 5:
                                    if (FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.house2) < 6) {

                                        FacilityServiceImpl.facilityLinkedMap.put(FacilityServiceImpl.house2,
                                                FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.house2) + 1);
                                    } else {
                                        facilityService.maintenance(FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.house2));
                                    }
                                    break;
                                case 6:
                                    if (FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.house3) < 6) {

                                        FacilityServiceImpl.facilityLinkedMap.put(FacilityServiceImpl.house3,
                                                FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.house3) + 1);
                                    } else {
                                        facilityService.maintenance(FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.house3));
                                    }
                                    break;
                                case 7:
                                    if (FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room1) < 6) {

                                        FacilityServiceImpl.facilityLinkedMap.put(FacilityServiceImpl.room1,
                                                FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room1) + 1);
                                    } else {
                                        facilityService.maintenance(FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room1));
                                    }
                                    break;
                                case 8:
                                    if (FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room2) < 6) {

                                        FacilityServiceImpl.facilityLinkedMap.put(FacilityServiceImpl.room2,
                                                FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room2) + 1);
                                    } else {
                                        facilityService.maintenance(FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room2));
                                    }
                                    break;
                                case 9:
                                    if (FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room3) < 6) {

                                        FacilityServiceImpl.facilityLinkedMap.put(FacilityServiceImpl.room3,
                                                FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room3) + 1);
                                    } else {
                                        facilityService.maintenance(FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room3));
                                    }
                                    break;
                                case 10:
                                    if (FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room4) < 6) {

                                        FacilityServiceImpl.facilityLinkedMap.put(FacilityServiceImpl.room4,
                                                FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room4) + 1);
                                    } else {
                                        facilityService.maintenance(FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room1));
                                    }
                                    break;
                                case 11:
                                    if (FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room5) < 6) {

                                        FacilityServiceImpl.facilityLinkedMap.put(FacilityServiceImpl.room5,
                                                FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room5) + 1);
                                    } else {
                                        facilityService.maintenance(FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room5));
                                    }
                                default:
                                    System.out.println("nhập chưa đúng mời nhập lại");

                            }

                        } while (1 < choice1 || choice1 > 11);


                        System.out.println("loại dịch vụ");
                        System.out.println("1.VILLA" +
                                "\t2.HOUSE" +
                                "\t3.ROOM");
                        int choice2 = Integer.parseInt(sc.nextLine());

                        for (Customer element : CustomerSerViceImpl.customerLinkedList) {
                            if (element.getId() == id) {
                                customerCode = element.getMakhachHang().getMaKhachHang();
                            }
                        }
                        Booking booking = new Booking(bookingCode, bookingStart, bookingEnd, customerCode, FacilityServiceImpl.facilityArrayList.get(choice1 - 1).getServiceName(), stringList.get(choice2 - 1));
                        bookingSet.add(booking);
                        addNew();
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
                System.out.println(" danh sách các dịch vụ cho thê ở furama");
                for (Facility element1 : FacilityServiceImpl.facilityArrayList) {
                    System.out.println(element1);
                }
                System.out.println("chọn tên dịch vụ để thuê theo thứ tự id ");
                int choice1 = 0;
                do {

                    System.out.println("chọn tên dịch vụ để thuê theo thứ tự id ");
                    choice1 = Integer.parseInt(sc.nextLine());
                    switch (choice1) {
                        case 1:
                            if (FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.villa1) < 6) {

                                FacilityServiceImpl.facilityLinkedMap.put(FacilityServiceImpl.villa1,
                                        FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.villa1) + 1);
                            } else {
                                facilityService.maintenance(FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.villa1));
                            }
                            break;
                        case 2:
                            if (FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.villa2) < 6) {

                                FacilityServiceImpl.facilityLinkedMap.put(FacilityServiceImpl.villa2,
                                        FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.villa2) + 1);
                            } else {
                                facilityService.maintenance(FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.villa2));
                            }
                            break;
                        case 3:
                            if (FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.villa3) < 6) {

                                FacilityServiceImpl.facilityLinkedMap.put(FacilityServiceImpl.villa3,
                                        FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.villa3) + 1);
                            } else {
                                facilityService.maintenance(FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.villa3));
                            }
                            break;
                        case 4:
                            if (FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.house1) < 6) {

                                FacilityServiceImpl.facilityLinkedMap.put(FacilityServiceImpl.house1,
                                        FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.house1) + 1);
                            } else {
                                facilityService.maintenance(FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.house1));
                            }
                            break;
                        case 5:
                            if (FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.house2) < 6) {

                                FacilityServiceImpl.facilityLinkedMap.put(FacilityServiceImpl.house2,
                                        FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.house2) + 1);
                            } else {
                                facilityService.maintenance(FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.house2));
                            }
                            break;
                        case 6:
                            if (FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.house3) < 6) {

                                FacilityServiceImpl.facilityLinkedMap.put(FacilityServiceImpl.house3,
                                        FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.house3) + 1);
                            } else {
                                facilityService.maintenance(FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.house3));
                            }
                            break;
                        case 7:
                            if (FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room1) < 6) {

                                FacilityServiceImpl.facilityLinkedMap.put(FacilityServiceImpl.room1,
                                        FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room1) + 1);
                            } else {
                                facilityService.maintenance(FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room1));
                            }
                            break;
                        case 8:
                            if (FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room2) < 6) {

                                FacilityServiceImpl.facilityLinkedMap.put(FacilityServiceImpl.room2,
                                        FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room2) + 1);
                            } else {
                                facilityService.maintenance(FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room2));
                            }
                            break;
                        case 9:
                            if (FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room3) < 6) {

                                FacilityServiceImpl.facilityLinkedMap.put(FacilityServiceImpl.room3,
                                        FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room3) + 1);
                            } else {
                                facilityService.maintenance(FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room3));
                            }
                            break;
                        case 10:
                            if (FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room4) < 6) {

                                FacilityServiceImpl.facilityLinkedMap.put(FacilityServiceImpl.room4,
                                        FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room4) + 1);
                            } else {
                                facilityService.maintenance(FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room1));
                            }
                            break;
                        case 11:
                            if (FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room5) < 6) {

                                FacilityServiceImpl.facilityLinkedMap.put(FacilityServiceImpl.room5,
                                        FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room5) + 1);
                            } else {
                                facilityService.maintenance(FacilityServiceImpl.facilityLinkedMap.get(FacilityServiceImpl.room5));
                            }
                        default:
                            System.out.println("nhập chưa đúng mời nhập lại");

                    }

                } while (1 < choice1 || choice1 > 11);


                System.out.println("loại dịch vụ");
                System.out.println("1.VILLA" +
                        "\t2.HOUSE" +
                        "\t3.ROOM");
                int choice2 = Integer.parseInt(sc.nextLine());
                System.out.println("nhập mã khách hàng");
                String customerCode1 = sc.nextLine();

                Booking booking = new Booking(bookingCode, bookingStart, bookingEnd, customerCode1, FacilityServiceImpl.facilityArrayList.get(choice1 - 1).getServiceName(), stringList.get(choice2 - 1));
                bookingSet.add(booking);
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

        List<Booking> bookingList = new ArrayList<>(bookingSet);
        Collections.sort(bookingList, new SortByNameDate());
        for (Booking element : bookingList) {
            System.out.println(element);
        }

    }

    @Override
    public void Edit(String name) {

    }


}

//                        System.out.println("-----thuê VILLA------\n" +
//                                "\t1.VILLA" +
//                                "\t2.VILLA PLUS" +
//                                "\t3.VILLA ULTRA" +
//                                "\t4.HOUSE " +
//                                "\t4.HOUSE PLUS" +
//                                "\t5.HOUSE ULTRA" +
//                                "\t6.ROOM" +
//                                "\t7.ROOM PLUS" +
//                                "\t8.ROOM ULTRA ULTRA" +
//                                "\t9.ROOM VIP" +
//                                "\t10.ROOM VIP PRO");

