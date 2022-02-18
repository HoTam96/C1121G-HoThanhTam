package case_study_c08.service.Impl;

import case_study.data.validate.TotalValidate;
import case_study_c08.models.NganHang;
import case_study_c08.models.TaiKhoanThanhToan;
import case_study_c08.models.TaiKhoanTietKiem;
import case_study_c08.service.NganHangService;
import case_study_c08.ultill.ReaderWriteFileC08;
import casetudy_c09.model.DienThoai;
import casetudy_c09.model.DienThoaiChinhHang;
import casetudy_c09.model.DienThoaiXachTay;
import casetudy_c09.view.ultill.RederWriteFileC09csv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NganHangServiceImpl implements NganHangService {
    public static final String PATHFILE_BANK = "src/case_study_c08/data/TaiKhoanNganHang.csv";

    @Override
    public void themMoi() {

        List<NganHang> nganHangList = new ArrayList<>();
        List<NganHang> nganHangs = ReaderWriteFileC08.readerFile(PATHFILE_BANK);
        Scanner scanner = new Scanner(System.in);
        System.out.println("chọn dịch vụ cần thêm mới");
        System.out.println("1. tài khoản thanh toán");
        System.out.println("2. tài khoản tiết kiệm");
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1) {
                    System.out.println("bạn đã chọn thêm mới  tài khoản thanh toán ");
                    int id = 1;
                    if (!nganHangs.isEmpty()) {
                        id = nganHangs.get(nganHangs.size() - 1).getId() + 1;
                    }
                    System.out.println("nhập mã tài khoản");
                    String maTaiKhoan = scanner.nextLine();
                    while (true) {
                        if (maTaiKhoan.equals("")) {
                            System.out.println("bạn chưa nhập producer yêu cầu nhập lại");
                            maTaiKhoan = scanner.nextLine();
                        } else {
                            break;
                        }
                    }
                    System.out.println(" nhập tên chủ tài khoản");
                    String tenChuTaiKhoan = TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_TEN, "tên ko dấu và có định dạng X.. Y .. Z..");
                    System.out.println("nhập vào ngày tạo tài khoản");
                    String ngayTaoTaiKhoan = TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_DAY, "sai định dạng. định dạng phải dd/MM/yyyy");

                    System.out.println("nhập vào số thẻ");
                    String soThe = TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_so_nguyen_duong, "số thẻ là số dương");

                    System.out.println("số tiền trong tài khoản");
                    double soTienTrongThec = Double.parseDouble(TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_SO_THUC_DUONG, "số tiền phải là số dương"));

                    nganHangList = new ArrayList<>();
                    NganHang taiKhoanThanhToan = new TaiKhoanThanhToan(id, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan, soThe, soTienTrongThec);
                    nganHangList.add(taiKhoanThanhToan);
                    ReaderWriteFileC08.writeFileCsv(nganHangList, PATHFILE_BANK, true);
                    break;
                } else if (choice == 2) {
                    System.out.println("bạn đã chọn thêm mới  tài khoản thanh toán ");
                    int id = 1;
                    if (!nganHangs.isEmpty()) {
                        id = nganHangs.get(nganHangs.size() - 1).getId() + 1;
                    }
                    System.out.println("nhập mã tài khoản");
                    String maTaiKhoan = scanner.nextLine();
                    while (true) {
                        if (maTaiKhoan.equals("")) {
                            System.out.println("bạn chưa nhập producer yêu cầu nhập lại");
                            maTaiKhoan = scanner.nextLine();
                        } else {
                            break;
                        }
                    }
                    System.out.println(" nhập tên chủ tài khoản");
                    String tenChuTaiKhoan = TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_TEN, "tên ko dấu và có định dạng X.. Y .. Z..");

                    System.out.println("nhập vào ngày tạo tài khoản");
                    String ngayTaoTaiKhoan = TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_DAY, "sai định dạng. định dạng phải dd/MM/yyyy");

                    System.out.println("số tiền tiết kiệm");
                    double soTienTietKiem = Double.parseDouble(TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_TIEN, "định dạng là số phaai là số thực dương"));

                    System.out.println("ngày gửi tiết kiệm");
                    String ngayGuiTietKiem = TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_DAY, "ngày phải có định dạng dd/MM/yyyy");

                    System.out.println("nhập lãi xuất");
                    double laiXuat = Double.parseDouble(TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_SO_THUC_DUONG, "lãi xuất là số dương"));
                    System.out.println("nhập vào kì hạn (tháng)");
                    int kiHan = Integer.parseInt(TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_so_nguyen_duong, "kì hạn là số nguyên x tháng"));

                    nganHangList = new ArrayList<>();
                    NganHang nganHang = new TaiKhoanTietKiem(id, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan, soTienTietKiem, ngayGuiTietKiem, laiXuat, kiHan);
                    nganHangList.add(nganHang);
                    ReaderWriteFileC08.writeFileCsv(nganHangList, PATHFILE_BANK, true);
                    break;
                } else {
                    System.out.println("nhập chưa đúng mời nhập lại");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();

            }
        }


    }

    @Override
    public void xoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào mã tài khoản ngân hàng");
        String maTaiKhoan = scanner.nextLine();
        List<NganHang> nganHangList = ReaderWriteFileC08.readerFile(PATHFILE_BANK);
        boolean check = true;
        for (NganHang element : nganHangList) {
            if (element.getMaTaiKhoan().equals(maTaiKhoan)) {
                System.out.println("bạn có muốn xóa sản phẩm này ra khỏi danh sách không");
                System.out.println("1. yes");
                System.out.println("phím bất kì. No");
                check = true;
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1) {
                    nganHangList.remove(element);
                    System.out.println("sản phẩm đã được xóa");
                    ReaderWriteFileC08.writeFileCsv(nganHangList,PATHFILE_BANK,false);
                    xemDanhSachDienThoai();

                    break;
                } else {
                    System.out.println("bạn đã chọn không xóa sản phẩm");
                }

            } else {
                check = false;
            }
        }
        if (!check) {
            System.out.println("sản phẩm không tồn tại trong danh sách");
        }

    }

    @Override
    public void xemDanhSachDienThoai() {
        List<NganHang> nganHangList = ReaderWriteFileC08.readerFile(PATHFILE_BANK);
        for (NganHang element : nganHangList) {
            System.out.println(element);
        }

    }

    @Override
    public void timKiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập mã tài khoản cần tìm kiếm");
        String maTaiKhoan = scanner.nextLine();
        List<NganHang> nganHangList = ReaderWriteFileC08.readerFile(PATHFILE_BANK);
        boolean flag = true;
        for (NganHang element : nganHangList) {
            if (element.getMaTaiKhoan().contains(maTaiKhoan)) {
                System.out.println(element);
            } else {
                flag = false;
            }
        }
        if (!flag) {
            System.out.println("không tìm thấy mã sản phẩm cần tìm");
        }
    }
}
