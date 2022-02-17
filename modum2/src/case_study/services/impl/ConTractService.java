package case_study.services.impl;

import case_study.data.reader_file.ReaderFile;
import case_study.data.write_file.WriteFileCsv;
import case_study.services.ContractService;
import case_study.models.Booking;
import case_study.models.Contract;
import case_study.until.SortByNameDate;

import java.util.*;

public class ConTractService implements ContractService {
    private static Queue<Contract> contractQueue = new LinkedList<Contract>();
    public static final String PATHFILECONTRACT="src/case_study/until/file_csv/Contract/Contract.csv";

    @Override
    public void addNew() {
        Set<Booking>bookingSet= ReaderFile.readerBooking(BookingServiceImpl.PATHBOOKING);
        List<Booking> bookingList = new ArrayList<>(bookingSet);
        Scanner sc = new Scanner(System.in);
        System.out.println("chọn cách thêm hợp đồng");
        System.out.println("1. thêm mới từng hợp đồng");
        System.out.println("2. thêm mới  tất cả các hợp đồng có trong booking");
        int choice3 = Integer.parseInt(sc.nextLine());
        if (choice3 == 1) {
            Collections.sort(bookingList, new SortByNameDate());
            System.out.println("chọn mã booking và mã khách hàng từ danh sách booking");
            for (Booking list:bookingList) {
                System.out.println(list);
            }
            System.out.println("chọn mã booking và mã khách hàng theo thứ tự ngày bookinng");
            int choice1 = Integer.parseInt(sc.nextLine());
            System.out.println("số tiền đặt cọc");
            double dePosit = Double.parseDouble(sc.nextLine());
            System.out.println("tổng số tiền thanh toán");
            double toTalPayment = Double.parseDouble(sc.nextLine());
            Contract contract = new Contract(bookingList.get(choice1-1),dePosit,toTalPayment,bookingList.get(choice1-1));
            contractQueue = new LinkedList<Contract>();
            contractQueue.offer(contract);
            WriteFileCsv.writeContract(contractQueue,PATHFILECONTRACT,true);


        } else {

            Collections.sort(bookingList, new SortByNameDate());
            for (int i = 0; i < bookingList.size(); i++) {
                if (!bookingList.get(i).getLoaiDichVu().contains("ROOM")) {
                    System.out.println("đang tạo hợp đồng khách hàng có thông tin  "+ bookingList.get(i).getInForBooking());
                    System.out.println("khách hàng thứ: " + (i + 1));
                    System.out.println("số tiền đặt cọc");
                    double dePosit = Double.parseDouble(sc.nextLine());
                    System.out.println("tổng số tiền thanh toán");
                    double toTalPayment = Double.parseDouble(sc.nextLine());
                    Contract contract = new Contract(bookingList.get(i), dePosit, toTalPayment, bookingList.get(i));
                    contractQueue = new LinkedList<Contract>();
                    contractQueue.offer(contract);

                }
                WriteFileCsv.writeContract(contractQueue,PATHFILECONTRACT,true);
                bookingSet= ReaderFile.readerBooking(BookingServiceImpl.PATHBOOKING);
                bookingSet= new TreeSet<>();
                WriteFileCsv.writeBooking(bookingSet,BookingServiceImpl.PATHBOOKING,false);
            }
        }
    }

    @Override
    public void displayList() {
        Queue<Contract>contractQueue=ReaderFile.readerContract(PATHFILECONTRACT);
        for (Contract element : contractQueue) {
            System.out.println(element);
        }

    }
@Override
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
