package casetudy_c09.service.impl;

import case_study.data.validate.TotalValidate;
import casetudy_c09.model.DienThoai;
import casetudy_c09.model.DienThoaiChinhHang;
import casetudy_c09.model.DienThoaiXachTay;
import casetudy_c09.service.DichVuDienThoai;
import casetudy_c09.view.ultill.RederWriteFileC09csv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DichVuDienThoaiImpl implements DichVuDienThoai {
    public static final String PATHFILE = "src/casetudy_c09/data/phone.csv";

    @Override
    public void themMoi() {
        List<DienThoai> dienThoaiList = new ArrayList<>();
        List<DienThoai> dienThoais = RederWriteFileC09csv.readerFile(PATHFILE);
        Scanner scanner = new Scanner(System.in);
        System.out.println("chọn dịch vụ cần thêm mới");
        System.out.println("1. sản phẩm chính hãnng");
        System.out.println("2. sản phẩm xách tay");
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1) {
                    System.out.println("bạn đã chọn thêm mới sản phẩm chính hãng ");
                    int id = 1;
                    if (!dienThoais.isEmpty()) {
                        id = dienThoais.get(dienThoais.size() - 1).getId() + 1;
                    }
                    System.out.println("nhập tên sản phẩm");
                    String tenDienThoai = scanner.nextLine();
                    while (true) {
                        if (tenDienThoai.equals("")) {
                            System.out.println("bạn chưa nhập producer yêu cầu nhập lại");
                            tenDienThoai = scanner.nextLine();
                        } else {
                            break;
                        }
                    }
                    System.out.println(" nhập gái bán điện thoại");
                    Double giaBan = Double.parseDouble(TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_SO_THUC_DUONG, "nhập chưa đúng định dạng. số tiền phải là sô lớn hơn 0"));
                    System.out.println("nhập số lượng sản phẩm");
                    int soLuong = Integer.parseInt(TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_so_nguyen_duong, "nhập sai định dạng. số nguyên dương và lớn hơn 0"));
                    System.out.println("nhập nhà sản xuất");
                    String nhaSanXuat = scanner.nextLine();
                    while (true) {
                        if (nhaSanXuat.equals("")) {
                            System.out.println("bạn chưa nhập producer yêu cầu nhập lại");
                            nhaSanXuat = scanner.nextLine();
                        } else {
                            break;
                        }
                    }

                    System.out.println("thời gian bảo hành theo năm");
                    int thoiGianBaoHanh = Integer.parseInt(TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_SO_THUC_DUONG, "nhập chưa đúng định dạng"));
                    while (true) {
                        if (thoiGianBaoHanh > 0 && thoiGianBaoHanh <= 2) {
                            break;
                        }else {
                            System.out.println("thời gian nhập chưa đúng. thời gian bảo hành nhỏ hơn 2 năm");
                            System.out.println("nhập lại thời gian bảo hành");
                             thoiGianBaoHanh = Integer.parseInt(TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_SO_THUC_DUONG, "nhập chưa đúng định dạng"));
                        }
                    }

                    List<String> phamViBaoHanh = new ArrayList<>();
                    phamViBaoHanh.add("Trong Nươc");
                    phamViBaoHanh.add("Quốc Tế");
                    System.out.println("chọn phạm vi bảo hành");
                    System.out.println("1. trong nước");
                    System.out.println("2. quốc tế");
                    int luaChon;
                    while (true) {
                        try {
                            luaChon = Integer.parseInt(scanner.nextLine());
                            if (luaChon == 1) {
                                break;
                            } else if (luaChon == 2) {
                                break;
                            } else {
                                System.out.println("nhập lại lựa chọn");
                            }

                        } catch (NumberFormatException e) {
                            e.printStackTrace();
                        }
                    }
                    dienThoaiList = new ArrayList<>();
                    DienThoai dienThoaiChinhHang = new DienThoaiChinhHang(id, tenDienThoai, giaBan, soLuong, nhaSanXuat, thoiGianBaoHanh, phamViBaoHanh.get(luaChon - 1));
                    dienThoaiList.add(dienThoaiChinhHang);
                    RederWriteFileC09csv.writeFileCsv(dienThoaiList, PATHFILE, true);
                    break;
                } else if (choice == 2) {
                    int id = 1;
                    if (!dienThoais.isEmpty()) {
                        id = dienThoais.get(dienThoais.size() - 1).getId() + 1;
                    }
                    System.out.println("nhập tên sản phẩm chính hảng");
                    String tenDienThoai = scanner.nextLine();
                    while (true) {
                        if (tenDienThoai.equals("")) {
                            System.out.println("bạn chưa nhập producer yêu cầu nhập lại");
                            tenDienThoai = scanner.nextLine();
                        } else {
                            break;
                        }
                    }
                    System.out.println(" nhập giá bán điện thoại");
                    Double giaBan = Double.parseDouble(TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_SO_THUC_DUONG, "nhập lại"));
                    System.out.println("nhập số lượng sản phẩm chính hãng");
                    int soLuong = Integer.parseInt(TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_so_nguyen_duong, "nhập sai định dạng. số nguyên dương và lớn hơn 0"));
                    System.out.println("nhập nhà sản xuất");
                    String nhaSanXuat = scanner.nextLine();
                    while (true) {
                        if (nhaSanXuat.equals("")) {
                            System.out.println("bạn chưa nhập producer yêu cầu nhập lại");
                            nhaSanXuat = scanner.nextLine();
                        } else {
                            break;
                        }
                    }

                    System.out.println("nhậ quốc gia xách tay");
                    String quocGiaXachTay = scanner.nextLine();
                    while (true) {
                        if (quocGiaXachTay.equals("")) {
                            System.out.println("bạn chưa nhập producer yêu cầu nhập lại");
                            quocGiaXachTay = scanner.nextLine();
                        } else {
                            break;
                        }
                    }
                    System.out.println("trạng thái sản phẩm");
                    String trangThai = TotalValidate.regexString(scanner.nextLine(), TotalValidate.REGEX_TRANG_THAI_09, "trạng thái phải là Da sua chua”, và “Chua sua chua");
                    while (true) {
                        if (trangThai.equals("")) {
                            System.out.println("bạn chưa nhập producer yêu cầu nhập lại");
                            trangThai = scanner.nextLine();
                        } else {
                            break;
                        }
                    }
                    DienThoai dienThoaiXachTay = new DienThoaiXachTay(id, tenDienThoai, giaBan, soLuong, nhaSanXuat, quocGiaXachTay, trangThai);
                    dienThoaiList.add(dienThoaiXachTay);
                    RederWriteFileC09csv.writeFileCsv(dienThoaiList, PATHFILE, true);
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
        List<DienThoai> dienThoaiList = RederWriteFileC09csv.readerFile(PATHFILE);

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào id sản phẩm để xóa");
        int productId = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (DienThoai element : dienThoaiList) {
            if (element.getId() == productId) {
                System.out.println("bạn có muốn xóa sản phẩm này ra khỏi danh sách không");
                System.out.println("1. yes");
                System.out.println("phím bất kì. No");
                check = true;
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1) {
                    dienThoaiList.remove(element);
                    System.out.println("sản phẩm đã được xóa");
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
        RederWriteFileC09csv.writeFileCsv(dienThoaiList, PATHFILE, false);

    }

    @Override
    public void xemDanhSachDienThoai() {
        List<DienThoai> dienThoaiList = RederWriteFileC09csv.readerFile(PATHFILE);
        for (DienThoai element : dienThoaiList) {
            System.out.println(element);
        }
    }

    @Override
    public void timKiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên sản phẩm cần tìm kiếm");
        String tenSanPham = scanner.nextLine();
        List<DienThoai> dienThoaiList = RederWriteFileC09csv.readerFile(PATHFILE);
        for (DienThoai element : dienThoaiList) {
            if (element.getTenSanPham().contains(tenSanPham)) {
                System.out.println(element);
            }
        }

    }
}
