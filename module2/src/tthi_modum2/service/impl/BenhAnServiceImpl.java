package tthi_modum2.service.impl;

import case_study.data.validate.TotalValidate;
import tthi_modum2.model.BenhAn;
import tthi_modum2.model.BenhAnThuong;
import tthi_modum2.model.BenhAnVip;
import tthi_modum2.service.IBenhAnService;
import tthi_modum2.ultill.NotFoundMedicalRecordException;
import tthi_modum2.ultill.ReadandWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnServiceImpl implements IBenhAnService {
    public static final String PATH_FILE = "src/thi_modum2/data/BenhAn.csv";

    @Override
    public void ThemMoi() {
        List<BenhAn> benhAnList = new ArrayList<>();
        List<BenhAn> benhAns = ReadandWriteFile.readerFile(PATH_FILE);
        Scanner scanner = new Scanner(System.in);
        System.out.println("chọn bệnh án cần thêm mới");
        System.out.println("1. Bệnh án thường");
        System.out.println("2. Bệnh án víp");
        while (true) {
            try {
                int luaChon = Integer.parseInt(scanner.nextLine());
                if (luaChon == 1) {
                    System.out.println("bạn đã chọn thêm mới bệnh án thường ");
                    int soThuTu = 1;
                    if (!benhAns.isEmpty()) {
                        soThuTu = benhAns.get(benhAns.size() - 1).getSoThuTu() + 1;
                    }
                    System.out.println("thêm mới mã bệnh án");
                    String maBenhAn = TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_MaBenhAn, "sai định dạng, VD : BA-123");

                    System.out.println(" tên bệnh nhân");
                    String tenBenhNhan = TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_TEN, "sai định dạng. tên ko dấu và viết hoa chữ cái đầu VD: Le Thanh Phong");
                    System.out.println(" mã bệnh nhân");
                    String maBenhNhan = TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_MaBenhNhan, "sai định dạng, VD: BN-1234");

                    System.out.println(" Ngày nhập viên");
                    String ngayNhapVien = TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_DAY, "sai định dạng, VD: dd/MM/yyyy");
                    String ngayRaVien;
                    System.out.println(" Ngày ra viên");
                    while (true) {
                        ngayRaVien = TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_DAY, "sai định dạng, VD: dd/MM/yyyy");
                        if (ngayNhapVien.compareTo(ngayRaVien) > 0) {
                            System.out.println("ngày ra viên không đúng, yêu cầu nhập lại");
                        } else {
                            break;
                        }
                    }
                    System.out.println(" Lí Do Nhập Viện");
                    String liDo = scanner.nextLine();
                    while (true) {
                        if (liDo.equals("")) {
                            System.out.println("bạn chưa nhập lí do nhập viện ");
                            liDo = scanner.nextLine();
                        } else {
                            break;
                        }
                    }
                    System.out.println(" phí nhập viên");
                    double chiPhi;
                    while (true) {
                        try {
                            chiPhi = Double.parseDouble(scanner.nextLine());
                            break;
                        } catch (Exception e) {
                            e.printStackTrace();
                            System.out.println("nhập sai định dạng");
                        }
                    }

                    BenhAn benhAnThuong = new BenhAnThuong(soThuTu, maBenhAn, tenBenhNhan, maBenhNhan, ngayNhapVien, ngayRaVien, liDo, chiPhi);
                    benhAnList = new ArrayList<>();
                    benhAnList.add(benhAnThuong);
                    ReadandWriteFile.writeFileCsv(benhAnList, PATH_FILE, true);
                    break;
                } else if (luaChon == 2) {
                    List<String> stringList = new ArrayList<>();
                    stringList.add("VIP I");
                    stringList.add("VIP II");
                    stringList.add("VIP III");
                    System.out.println("bạn đã chọn thêm mới bệnh án víp ");
                    int soThuTu = 1;
                    if (!benhAns.isEmpty()) {
                        soThuTu = benhAns.get(benhAns.size() - 1).getSoThuTu() + 1;
                    }
                    System.out.println("thêm mới mã bệnh án");
                    String maBenhAn = TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_MaBenhAn, "sai định dạng, VD : BA-123");

                    System.out.println(" tên bệnh nhân");
                    String tenBenhNhan = TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_TEN, "sai định dạng. tên ko dấu và viết hoa chữ cái đầu VD: Le Thanh Phong");
                    System.out.println(" mã bệnh nhân");
                    String maBenhNhan = TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_MaBenhNhan, "sai định dạng, VD: BN-1234");

                    System.out.println(" Ngày nhập viên");
                    String ngayNhapVien = TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_DAY, "sai định dạng, VD: dd/MM/yyyy");
                    String ngayRaVien;
                    System.out.println(" Ngày ra viên");
                    while (true) {
                        ngayRaVien = TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_DAY, "sai định dạng, VD: dd/MM/yyyy");
                        if (ngayNhapVien.compareTo(ngayRaVien) > 0) {
                            System.out.println("ngày ra viên không đúng, yêu cầu nhập lại");
                        } else {
                            break;
                        }
                    }
                    System.out.println(" Lí Do Nhập Viện");
                    String liDo = scanner.nextLine();
                    while (true) {
                        if (liDo.equals("")) {
                            System.out.println("bạn chưa nhập lí do nhập viện ");
                            liDo = scanner.nextLine();
                        } else {
                            break;
                        }
                    }

                    System.out.println("chọn gói víp");
                    System.out.println("1. VIP I");
                    System.out.println("2. VIP II");
                    System.out.println("3. VIP III");
                    int luaChon1;
                    while (true) {
                        try {
                            luaChon1 = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            e.printStackTrace();
                            System.out.println("nhập lại");
                        }
                    }
                    System.out.println("thời hạn víp / năm");
                    String thoiHanVip = TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_SO_THUC_DUONG, "sai định dạng, thời hạn phải lớn hơn 0");

                    benhAnList = new ArrayList<>();
                    BenhAn benhAnVip = new BenhAnVip(soThuTu, maBenhAn, tenBenhNhan, maBenhNhan, ngayNhapVien, ngayRaVien, liDo, stringList.get(luaChon1 - 1), thoiHanVip);
                    benhAnList.add(benhAnVip);
                    ReadandWriteFile.writeFileCsv(benhAnList, PATH_FILE, true);
                    break;
                } else {
                    System.out.println("nhập chưa đúng. mời nhập lại");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void xoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào mã bệnh án");
        try {
            String maBenhAn = scanner.nextLine();
            List<BenhAn> benhAnList = ReadandWriteFile.readerFile(PATH_FILE);
            boolean check = true;
            for (BenhAn element : benhAnList) {
                if (element.getMaBenhAn().equals(maBenhAn)) {
                    System.out.println("bạn có muốn xóa sản phẩm này ra khỏi danh sách không");
                    System.out.println("1. yes");
                    System.out.println("phím bất kì. No");
                    check = true;
                    int choice;
                    while (true) {
                        try {
                            choice = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            e.printStackTrace();
                            System.err.println("mời nhập lại");
                        }
                    }
                    if (choice == 1) {
                        benhAnList.remove(element);
                        System.out.println("thông tin bệnh án đã được xóa");
                        ReadandWriteFile.writeFileCsv(benhAnList, PATH_FILE, false);
                        xemDanhSachBenhAn();
                        break;
                    } else {
                        System.out.println("bệnh án chưa được xóa");
                        break;
                    }
                } else {
                    check = false;
                }
            }
            if (!check) {
                throw new NotFoundMedicalRecordException("mã bệnh án không tồn tại");
            }
        } catch (NotFoundMedicalRecordException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void xemDanhSachBenhAn() {
        List<BenhAn> benhAnList = ReadandWriteFile.readerFile(PATH_FILE);
        for (BenhAn element : benhAnList) {
            System.out.println(element);
        }
    }
}
