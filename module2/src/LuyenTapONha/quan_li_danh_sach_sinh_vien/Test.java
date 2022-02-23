package LuyenTapONha.quan_li_danh_sach_sinh_vien;


import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVienLan2 danhSachSinhVienLan2 = new DanhSachSinhVienLan2();
        int luaChon = 10;

        do {
            System.out.println("MENU---------------------");
            System.out.println("1.thêm danh sách sinh viên\n" +
                    " 2.in danh sách sinh viên\n" +
                    " 3.kiểm tra danh sách có rỗng hay không\n" +
                    "4.lấy số lượng sinh viên trong danh sách\n" +
                    "5.làm rỗng danh sách sinh viên\n" +
                    "6.xóa sinh viên ra khỏi danh sách dựa vào mã sinh viên\n" +
                    "7. kiểm tra sinh viên có tồn tại hay không dựa vào mã sinh viên\n" +
                    "8. Tìm kiếm sinh viên dựa theo tên\n" +
                    "9. xuất ra danh sách sinh viên từ thấp đến cao\n" +
                    "0. để thoát");
            luaChon = Integer.parseInt(sc.nextLine());

            switch (luaChon) {
                case 1:
                    System.out.println("thêm mã sinh viên");
                    String maSinhVien = sc.nextLine();
                    System.out.println("thêm họ tên sinh viên");
                    String hoVaTen = sc.nextLine();
                    System.out.println("thêm năm sinh viên");
                    int namSinh = Integer.parseInt(sc.nextLine());
                    System.out.println("thêm điểm trung bình sinh viên");
                    double diemTrungBinh = Double.parseDouble(sc.nextLine());
                    SinhVienONha sinhVien11 = new SinhVienONha(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                    danhSachSinhVienLan2.add(sinhVien11);
                    break;

                case 2:
                    danhSachSinhVienLan2.in();
                    break;

                case 3:
                    System.out.println("danh sách là rỗng: " + danhSachSinhVienLan2.kiemTraDanhSach());
                    break;

                case 4:
//                    lấy số lượng danh sách
                    System.out.println(danhSachSinhVienLan2.laysoluongsinhvientrongdanhsach());
                    break;

                case 5:
                    danhSachSinhVienLan2.remove();
                    break;

                case 6:
//                    xóa sinh viên ra khỏi danh sách dưa vào mã sinh viên
                    System.out.println("nhập vào mã sinh viên cần xóa");
                    String data = sc.nextLine();
                    SinhVienONha sinhVienONha1 = new SinhVienONha(data);
                    System.out.println( danhSachSinhVienLan2.xoaDuaVaoMaSinhVien(sinhVienONha1));
                    break;


                case 7:
//                    7. kiểm tra sinh viên có tồn tại hay không dựa vào mã sinh viên
                    System.out.println("nhập vào mã sinh viên cần kiểm tra");
                    String data1 = sc.nextLine();
                    SinhVienONha sinhVienONha2 = new SinhVienONha(data1);
                    System.out.println(danhSachSinhVienLan2.kiemTraSinhViencoTonTai (sinhVienONha2));
break;

                case 8:
//                    tìm kiếm dựa theo tên.
                    String ten = sc.nextLine();
                  danhSachSinhVienLan2.timKiemTheoTen(ten);
                  break;

                case 9:
                    danhSachSinhVienLan2.sapXepDiemGiamDantangdan();
                    danhSachSinhVienLan2.in();
            }


        } while (luaChon != 0);


    }
}


