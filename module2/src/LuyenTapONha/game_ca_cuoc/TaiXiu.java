package LuyenTapONha.game_ca_cuoc;

import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
/*    thể lệ chuuowng trình:
    tài khoản cá cược được cấp
    có quyền đặt cược số tiền ít hơn hoặc bằng số tuền họ đang có ;
    thể lệ trò chơi
    có 3 viên xúc xắc. 3 viên xúc xắc cùng random  có giá trị từ 1 đến sáu

    result: tổng 3 viên cộng lại
   - nếu tổng = 3 hoặc bằng 18 cái ăn hết, tài khoản đặt cược - cá cược
   - nếu tổng bằng 4 đến 11 thì đặt xủi thắng , ngược lại thua
   - nếu tông từ 11--> 17 thì là tài . đặt tài thắng , xỉu thua.

      */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double taiKhoanNguoiChoi = 5000000;
        int luaChon = 1;
        do {
            System.out.println("\t------------Mời Bạn Đặt Cược--------------\n" +
                    "\t chọn phím bất kì : tiệp tục chơi\n" +
                    "\t  chọn phím 0 để thoát");
            luaChon = Integer.parseInt(sc.nextLine());
            if (luaChon != 0) {
                System.out.println("mời bạn đặt cượi");
                System.out.println("tài khoảng của bạn hiện có là: " + taiKhoanNguoiChoi);
                System.out.println("\tchọn 1 là tài\n " +
                        "\tchọn 2: xỉu");
                double luaChonDatCuoc;
                double soTienCaCuoc;
                //tung xúc xắc
                Random xucxac1 = new Random();
                Random xucxac2 = new Random();
                Random xucxac3 = new Random();

                //kiểm tra nhập liệu đặt cược
                do {
                    luaChonDatCuoc = Double.parseDouble(sc.nextLine());
                    if (luaChonDatCuoc == 1 || luaChonDatCuoc == 2) {
                        do {
                            System.out.println("nhập số tiền muốn cược");
                            soTienCaCuoc = Integer.parseInt(sc.nextLine());
                            if (soTienCaCuoc > 0 && soTienCaCuoc <= taiKhoanNguoiChoi) {
                                int giaTri1 = xucxac1.nextInt(5) + 1;
                                int giaTri2 = xucxac1.nextInt(5) + 1;
                                int giaTri3 = xucxac1.nextInt(5) + 1;
                                int tong = giaTri1 + giaTri2 + giaTri3;

                                if (luaChonDatCuoc == 1) {
                                    System.out.println("kết quả là: " + giaTri1 + "--" + giaTri2 + "--" + giaTri3);
                                    if (tong == 3 && tong == 18) {
                                        System.out.println("nhà cái thắng");
                                        taiKhoanNguoiChoi -= soTienCaCuoc;
                                    } else if (tong > 11) {
                                        System.out.println("chúc mừng bạn đã thắng");
                                        taiKhoanNguoiChoi += soTienCaCuoc;
                                    } else {
                                        System.out.println("bạn đã thua");
                                        taiKhoanNguoiChoi -= soTienCaCuoc;
                                    }
                                    System.out.println("tài khoản hiện có là: " + taiKhoanNguoiChoi);
                                } else {
                                    System.out.println("kết quả là: " + giaTri1 + "--" + giaTri2 + "--" + giaTri3);
                                    if (tong == 3 && tong == 18) {
                                        System.out.println("nhà cái thắng");
                                        taiKhoanNguoiChoi -= soTienCaCuoc;
                                    } else if (tong > 11) {
                                        System.out.println("bạn đã thua");
                                        taiKhoanNguoiChoi -= soTienCaCuoc;
                                    } else {
                                        System.out.println("chúc mừng bạn đã thắng");
                                        taiKhoanNguoiChoi += soTienCaCuoc;
                                    }
                                    System.out.println("tài khoản hiện có là: " + taiKhoanNguoiChoi);
                                }

                            } else {
                                System.out.println("số tiền cược không đúng");
                            }
                        } while (soTienCaCuoc < 0 || soTienCaCuoc > taiKhoanNguoiChoi);

                    } else {
                        System.out.println("mời bạn chọn phím 1 để đạt tài\n" +
                                "phím 2 để đạ xỉu");
                    }

                } while (luaChonDatCuoc != 1 || luaChonDatCuoc != 2);

            }
        } while (luaChon != 0);
    }

}
