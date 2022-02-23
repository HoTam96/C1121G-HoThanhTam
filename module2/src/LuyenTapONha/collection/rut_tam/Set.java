package LuyenTapONha.collection.rut_tam;

import java.util.Scanner;

public class Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RutThamTrungThuong rutThamTrungThuong = new RutThamTrungThuong();
        int luaChọn = 1;

        do {
            System.out.println("-----------------------------");
            System.out.println("------------menu ------------");
            System.out.println("1. thêm mã số dự thưởng.\n" +
                    "            2. xóa mã số dự thưởng.\n" +
                    "            3. kiểm tra mã số dự thưởng có tồn tại hay không\n" +
                    "            4.  xóa tất cả các phiếu dự thương.\n" +
                    "            5. số lượng phiếu  dự thưởng.\n" +
                    "            6. rút thăm trúng thưởng.");
            luaChọn = Integer.parseInt(sc.nextLine());
            switch (luaChọn){
                case 1:
                    System.out.println("nhập mã dự thưởng cần thêm");
                    String maDuThuong = sc.nextLine();
                    rutThamTrungThuong.themMaDuThuong(maDuThuong);
                    break;
                case 2:
                    System.out.println("nhập mã dự thưởng cần xóa");
                    String xoaMa = sc.nextLine();
                    System.out.println( "đã xóa: "+ rutThamTrungThuong.xoaPhieu(xoaMa));
                    break;
                case 3:
                    System.out.println("nhập mã dự thưởng cần kiểm tra");
                    String kiemTraMa = sc.nextLine();
                    System.out.println("mã tồn tại: "+ rutThamTrungThuong.kiemTraPhieuTonTai(kiemTraMa));
                    break;

                case 4:
                    rutThamTrungThuong.xoaTacCaPhieu();
                    break;
                case 5:
                    System.out.println("số lượng phiếu là: "+  rutThamTrungThuong.soLuongPhieu());
                    rutThamTrungThuong.display();
                    break;

                case 6:
                    System.out.println( rutThamTrungThuong.rutThamTrungThuong());
                    break;
                case 7:
                    rutThamTrungThuong.inMaDuThuong();
                    break;
                default:
                    System.out.println("nhập chưa đúng. mới nhập lại");
            }

        }while (luaChọn!=0);



    }




}
