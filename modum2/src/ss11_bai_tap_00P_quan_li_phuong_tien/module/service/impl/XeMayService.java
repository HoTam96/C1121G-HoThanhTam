package ss11_bai_tap_00P_quan_li_phuong_tien.module.service.impl;

import ss11_bai_tap_00P_quan_li_phuong_tien.module.module.HangSanXuat;
import ss11_bai_tap_00P_quan_li_phuong_tien.module.module.XeMay;
import ss11_bai_tap_00P_quan_li_phuong_tien.module.service.IXeMay;

import java.util.ArrayList;
import java.util.Scanner;

public class XeMayService implements IXeMay {
    private static ArrayList<XeMay> xeMayArrayList = new ArrayList<>();
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

        XeMay xeMay1 = new XeMay("92d1-24104", hangSanXuat1, 1996, "tam", 110);
        XeMay xeMay2 = new XeMay("92d1-24107", hangSanXuat2, 2000, "quang", 150);

        xeMayArrayList.add(xeMay1);
        xeMayArrayList.add(xeMay2);


    }


    @Override
    public void addVehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập biển kiểm soát");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("năm sản xuất");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("chủ sở hữu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("công suất máy");
        float congSuat = Float.parseFloat(scanner.nextLine());


        System.out.println("lựa chọn nhà sản xuất trong menu sau");
        System.out.println("1. Yamaha\t\n" +
                "2.Honda\t\n" +
                "3.Dongfeng\n" +
                "4.Huyndai\n" +
                "5.Ford\n" +
                "6.Toyota\n" +
                "7.Hino\n");
        int luaChon = Integer.parseInt(scanner.nextLine());

        XeMay xeMay = new XeMay(bienKiemSoat, hangSanXuatArrayList.get(luaChon-1), namSanXuat, chuSoHuu, congSuat);
        xeMayArrayList.add(xeMay);
    }

    @Override
    public void disPlayVehicle() {
        for (XeMay element : xeMayArrayList) {
            System.out.println(element);
        }
    }

    @Override
    public void deleteVehicle(XeMay bienKiemSoat) {
//        for (XeMay element : xeMayArrayList) {
//            if (element.getBienKiemSoat().equals(bienKiemSoat)) {
//                xeMayArrayList.remove(bienKiemSoat);
//                System.out.println("đã xóa thành công");
//            } else {
//                System.out.println("biển kiểm soát không tồn tại");
//            }
//        }
        xeMayArrayList.remove(bienKiemSoat);

    }

    public boolean xacNhanTonTai(XeMay bienKiemSoat) {
        return xeMayArrayList.contains(bienKiemSoat);
    }
}
