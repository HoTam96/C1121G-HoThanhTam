package LuyenTapONha.xay_dung_chuong_trinh_tra_cuu_karaok;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("chaod mừng bạn đến với thế giới KARAOK");
        System.out.println("mời bạn lựa chọn");
        Scanner sc = new Scanner(System.in);
        DanhSachKaRaOk danhSachKaRaOk = new DanhSachKaRaOk();
        int luaChon = 1;
        do {
            System.out.println("-----------------------------");
            System.out.println("Menu");
            System.out.println("1. thêm bài hát\n" +
                    "2. in ra bài hát\n" +
                    "3. xóa bài hát đã chọn dựa vào mã bài hát\n" +
                    "4. xóa tât cả các bài hát đã chọn\n" +
                    "5. tim kiếm bài hát theo tên ca sĩ\n" +
                    "6. tìm kiếm bài hát theo tên bài hát\n" +
                    "7. tìm kiếm bài hát theo mã bài hát\n" +
                    "0. để thoát");
            luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon) {
                case 1:

                    System.out.println("nhập mã bài hát");
                    String maBaiHat = sc.nextLine();
                    System.out.println("nhập tên bài hát");
                    String tenbaiHat = sc.nextLine();
                    System.out.println("nhập tên ca sĩ");
                    String tenCaSi = sc.nextLine();
                    System.out.println("nhập thể loại");
                    String theLoai = sc.nextLine();
                    Karaok karaok = new Karaok(maBaiHat, tenCaSi, tenbaiHat, theLoai);

                    danhSachKaRaOk.themBaiHat(karaok);
                    break;
                case 2:
                    danhSachKaRaOk.display();
                    break;
                case 3:
                    System.out.println("nhập mã bài hát để xóa");
                    String maXoa = sc.nextLine();
                    System.out.println("đã xóa bài hát" + danhSachKaRaOk.remove(maXoa));
                    break;
                case 4:
                    danhSachKaRaOk.removeall();
                    break;

                case 5:
                    System.out.println("nhập tên ca sĩ cần tìm");
                    String timTenCaSi = sc.nextLine();
                    danhSachKaRaOk.tenCaSi(timTenCaSi);
                    break;
                case 6:
                    System.out.println("nhập tên bài hát cần tìm");
                    String timTenBaiHat = sc.nextLine();
                    danhSachKaRaOk.tenBaiHat(timTenBaiHat);
                    break;
                case 7:
                    System.out.println("nhập mã bài hát ");
                    String timMaBaiHat = sc.nextLine();
                    danhSachKaRaOk.maBaiHat(timMaBaiHat);
                    break;

            }

        } while (luaChon != 0);
    }
}
