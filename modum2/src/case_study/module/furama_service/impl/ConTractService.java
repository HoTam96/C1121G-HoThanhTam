package case_study.module.furama_service.impl;

import case_study.module.furama_service.ContractService;
import case_study.module.module_Furama.information.Booking;
import case_study.module.module_Furama.information.Contract;
import case_study.until.SortByNameDate;

import java.util.*;

public class ConTractService implements ContractService {
    private static Queue<Contract> contractQueue = new LinkedList<Contract>();
    private static List<Booking> bookingList = new ArrayList<>(BookingServiceImpl.bookingSet);

    @Override
    public void addNew() {
        Scanner sc = new Scanner(System.in);
        System.out.println("chọn cách thêm hợp đồng");
        System.out.println("1. thêm mới từng hợp đồng");
        System.out.println("2. thêm mới  tất cả các hợp đồng có trong booking");
        int choice3 = Integer.parseInt(sc.nextLine());
        if (choice3 == 1) {
            bookingList = new ArrayList<>(BookingServiceImpl.bookingSet);
            Collections.sort(bookingList, new SortByNameDate());
            System.out.println("nhập mã booking và mã khách hàng từ danh sách booking");

            for (Booking list:bookingList) {
                System.out.println(list);
            }
            String bookingCode = sc.nextLine();
            String customerCode = sc.nextLine();

            Booking booking = new Booking(bookingCode);
            Booking booking2 = new Booking(customerCode);

            System.out.println("số tiền đặt cọc");
            double dePosit = Double.parseDouble(sc.nextLine());
            System.out.println("tổng số tiền thanh toán");
            double toTalPayment = Double.parseDouble(sc.nextLine());
            Contract contract = new Contract(booking,dePosit,toTalPayment,booking2);
            contractQueue.offer(contract);
        } else {

            bookingList = new ArrayList<>(BookingServiceImpl.bookingSet);

//        contractQueue = new LinkedList<>();
            Collections.sort(bookingList, new SortByNameDate());
            for (int i = 0; i < bookingList.size(); i++) {
                if (!bookingList.get(i).getLoaiDichVu().contains("ROOM")) {
                    System.out.println("khách hàng thứ: " + (i + 1));
                    System.out.println("số tiền đặt cọc");
                    double dePosit = Double.parseDouble(sc.nextLine());
                    System.out.println("tổng số tiền thanh toán");
                    double toTalPayment = Double.parseDouble(sc.nextLine());
                    Contract contract = new Contract(bookingList.get(i), dePosit, toTalPayment, bookingList.get(i));
                    contractQueue.offer(contract);
                }
                BookingServiceImpl.bookingSet = new TreeSet<>();

            }
        }
    }

    @Override
    public void displayList() {
        for (Contract element : contractQueue) {
            System.out.println(element);

        }

    }

    @Override
    public void Edit(String name) {

    }

    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sô hợp đồng");
        int contract = Integer.parseInt(scanner.nextLine());
        for (Contract element : contractQueue) {
            if (element.getSoHopDong() == contract) {
                System.out.println("số tiền đặt cọc");
                double dePosit = Double.parseDouble(scanner.nextLine());
                element.setTienCoc(dePosit);
                System.out.println("tổng số tiền thanh toán");
                double toTalPayment = Double.parseDouble(scanner.nextLine());
                element.setTongSoTienThanhToan(toTalPayment);
            }

        }
    }

    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sô hợp đồng cần xóa");
        int contract = Integer.parseInt(scanner.nextLine());
        List<Contract> contractList = new ArrayList<>(contractQueue);
        for (Contract element : contractList) {
            if (element.getSoHopDong() == contract) {
                contractList.remove(element);
                break;
            }
        }
        contractQueue = new LinkedList<>(contractList);
    }

}
