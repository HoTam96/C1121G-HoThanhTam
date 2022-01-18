package ss11_bai_tap_00P_quan_li_phuong_tien.module.service.impl;

import ss11_bai_tap_00P_quan_li_phuong_tien.module.module.HangSanXuat;
import ss11_bai_tap_00P_quan_li_phuong_tien.module.module.OTo;
import ss11_bai_tap_00P_quan_li_phuong_tien.module.service.IOTo;

import java.util.ArrayList;
import java.util.Scanner;

public class OToService implements IOTo {
    private static ArrayList<OTo> oToArrayList = new ArrayList<>();
    private static ArrayList<HangSanXuat> hangSanXuatArrayList = new ArrayList<>();

    static {
        HangSanXuat hangSanXuat1 = new HangSanXuat("HSX-001", "Yamaha", "Nhật Bản");
        HangSanXuat hangSanXuat2 = new HangSanXuat("HSX-002", "Honda", "Nhật Bản");
        HangSanXuat hangSanXuat3 = new HangSanXuat("HSX-003", "Dongfeng", "Trung Quốc");
        HangSanXuat hangSanXuat4 = new HangSanXuat("HSX-004", "Huyndai", "Hàn Quốc");
        HangSanXuat hangSanXuat5 = new HangSanXuat("HSX-005", "Ford", "Mỹ");
        HangSanXuat hangSanXuat6 = new HangSanXuat("HSX-006", "Toyota", "Nhật Bản");
        HangSanXuat hangSanXuat7 = new HangSanXuat("HSX-006", "Hino", "Nhật Bản");
        hangSanXuatArrayList.add(hangSanXuat1);
        hangSanXuatArrayList.add(hangSanXuat2);
        hangSanXuatArrayList.add(hangSanXuat3);
        hangSanXuatArrayList.add(hangSanXuat4);
        hangSanXuatArrayList.add(hangSanXuat5);
        hangSanXuatArrayList.add(hangSanXuat6);
        hangSanXuatArrayList.add(hangSanXuat7);

        OTo oTo1 = new OTo("43c1-24105", hangSanXuat1, 1990, "tam", 24, "du lich");
        OTo oTo2 = new OTo("43c1-24104", hangSanXuat2, 1991, "tam", 45, "khach");

        oToArrayList.add(oTo1);
        oToArrayList.add(oTo2);

    }

    public void addVehicle() {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập biển kiểm soát");
        String bienKiemSoat = sc.nextLine();
        System.out.println("năm sản xuất");
        int namSanXuat = Integer.parseInt(sc.nextLine());
        System.out.println("chủ sở hữu");
        String chuSoHuu = sc.nextLine();
        System.out.println("kiểu xe");
        String kieuXe = sc.nextLine();
        System.out.println("số chổ ngồi");
        int soChoNgoi = Integer.parseInt(sc.nextLine());

        System.out.println("lựa chọn nhà sản xuất trong menu sau");
        System.out.println("1. Yamaha\t\n" +
                "2.Honda\t\n" +
                "3.Dongfeng\n" +
                "4.Huyndai\n" +
                "5.Ford\n" +
                "6.Toyota\n" +
                "7.Hino\n");
        int luaChon = Integer.parseInt(sc.nextLine());
        OTo oTo = new OTo(bienKiemSoat, hangSanXuatArrayList.get(luaChon-1), namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
        oToArrayList.add(oTo);
    }
    @Override
    public void disPlayVehicle() {
        for (OTo oto : oToArrayList) {
            System.out.println(oto);
        }
    }

    @Override
    public void deleteVehicle(OTo data) {
        oToArrayList.remove(data);
    }

    public boolean xacNhanTonTai(OTo bienKiemSoat) {
        return oToArrayList.contains(bienKiemSoat);
    }


}

