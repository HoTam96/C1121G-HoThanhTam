package LuyenTapONha.quan_li_sinh_vien;

import java.util.Scanner;

public class TestQuanLiSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien danhSachSinhVien = new DanhSachSinhVien();
        int luaChon;
        do {
            System.out.println("MENU------------------------");
            System.out.println("vui long lựa chọn chức năng");
            System.out.println("1. thêm sinh viên vào danh sách\n" +
                    "2. in danh sách sinh viên ra màn hình\n" +
                    "3. kiểm tra danh sách có rỗng hay không\n" +
                    "4. lấy ra số lượng sinh viên trong danh sách\n" +
                    "5. làm rỗng danh sách sinh viên\n" +
                    "6. kiểm tra sinh viên có tồn tại trong danh sách hay không\n" +
                    "7. xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên\n" +
                    "8. tìm kiếm tấc cả sinh viên dựa trên tên được nhập từ bàn phím\n" +
                    "9. xuất ra danh sách sinh viên có điểm từ cao đến thấp\n" +
                    "\t 0.  để thoát");
            luaChon = sc.nextInt();

            switch (luaChon) {
                case 1:
//                    thêm sinh viên vào danh sách
                    System.out.println("nhập mã sinh viên");
                    sc.nextLine();
                    String maSinhVien = sc.nextLine();
                    System.out.println("nhập họ và tên sinh viên");
                    String hoVaTen = sc.nextLine();
                    System.out.println("nhập năm sinh");
                    int namSinh = sc.nextInt();
                    System.out.println("nhập điểm trung binh ");
                    float diemTrungBinh = sc.nextFloat();
                    SinhVien sinhVien = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                    danhSachSinhVien.themSinhVien(sinhVien);
                    break;
                case 2:
//                    in danh sách  sinh viên
                    danhSachSinhVien.indanhSachSinhVien();
                    break;
                case 3:
                    System.out.println("danh sách là rỗng: " + danhSachSinhVien.kiemTraRongHayKhong());
                    break;
                case 4:
                    System.out.println("số lượng danh sách là: " + danhSachSinhVien.soLuongSinhVien());
                    break;
                case 5:
                    danhSachSinhVien.remove();
                    break;
                case 6:
                    System.out.println("nhập mã sinh viên càn check");
                    sc.nextLine();
                    String maSinhVienCheck = sc.nextLine();
                    SinhVien sinhVien4 = new SinhVien(maSinhVienCheck);
                    System.out.println("kiểm tra tồn tại "+danhSachSinhVien.kiemTraTonTai(sinhVien4));
                    break;

                case 7:
                    sc.nextLine();
                    String xoaSinhVien = sc.nextLine();
                    SinhVien sinhVien5 = new SinhVien(xoaSinhVien);
                    System.out.println("xóa sinh viên trong danh dách "+danhSachSinhVien.xoaSinhVienKhoiDanhSach(sinhVien5));
                    break;
                case 8:

                    System.out.println("nhập họ và tên");
                    sc.nextLine();
                    String hoVaTen1 = sc.nextLine();
                    System.out.println("kết quả tìm kiểm");
                    danhSachSinhVien.timKiemSinhVien(hoVaTen1);
                    break;


                case 9:
                    danhSachSinhVien.sapXepDiemGiamDan();
                    danhSachSinhVien.indanhSachSinhVien();
                    break;

            }

        } while (luaChon != 0);
    }
}

