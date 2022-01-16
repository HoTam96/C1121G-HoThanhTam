package ss11_bai_tap_00P_quan_li_phuong_tien.controller;

import ss11_bai_tap_00P_quan_li_phuong_tien.module.module.OTo;
import ss11_bai_tap_00P_quan_li_phuong_tien.module.module.XeTai;
import ss11_bai_tap_00P_quan_li_phuong_tien.module.module.XeMay;
import ss11_bai_tap_00P_quan_li_phuong_tien.module.service.impl.OToService;
import ss11_bai_tap_00P_quan_li_phuong_tien.module.service.impl.XeMayService;
import ss11_bai_tap_00P_quan_li_phuong_tien.module.service.impl.XeTaiService;

import java.util.Scanner;

public class ViheicleController {

    public static void main(String[] args) {
        ViheicleController viheicleController = new ViheicleController();
        OToService oToService = new OToService();
        XeMayService xeMayService = new XeMayService();
        XeTaiService xeTaiService = new XeTaiService();
        Scanner sc = new Scanner(System.in);
        System.out.println("-------chọn chức năng-------------");
        int luaChon;
        do {
            System.out.println("1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Thoát\n");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    System.out.println("1. Thêm mới xe ô tô.\n" +
                            "2. thêm mới xe tải\n" +
                            "3. thêm mới xe máy\n");
                    int luaChon1 = Integer.parseInt(sc.nextLine());
                    if (luaChon1 == 1) {
                        oToService.addVehicle();
                    } else if (luaChon1 == 2) {
                        xeTaiService.addVehicle();
                    } else {
                        xeMayService.addVehicle();
                    }
                    break;

                case 2:
                    System.out.println("1. hiển thị xe ô tô.\n" +
                            "2. hiện thị xe tải\n" +
                            "3. hiển thị xe máy\n");
                    int luaChon2 = Integer.parseInt(sc.nextLine());
                    if (luaChon2 == 1) {
                        oToService.disPlayVehicle();
                    } else if (luaChon2 == 2) {
                        xeTaiService.disPlayVehicle();
                    } else {
                        xeMayService.disPlayVehicle();
                    }
                    break;

                case 3:
                    System.out.println("nhập vào biển kiểm soát");
                    String bienKiemSoat = sc.nextLine();
                    OTo oTo = new OTo(bienKiemSoat);
                    XeTai xeTai = new XeTai(bienKiemSoat);
                    XeMay xeMay = new XeMay(bienKiemSoat);

                    System.out.println(oToService.xacNhanTonTai(oTo));
                    System.out.println(xeMayService.xacNhanTonTai(xeMay));
                    System.out.println(xeTaiService.xacNhanTonTai(xeTai));
                    if (oToService.xacNhanTonTai(oTo)) {
                        System.out.println("xác nhận");
                        System.out.println("\t 1, yes\n" +
                                "\t phím bất kì. No");
                        int luachon3 = Integer.parseInt(sc.nextLine());
                        if (luachon3 == 1) {
                            oToService.deleteVehicle(oTo);
                            System.out.println("đã xóa thành công");

                        } else {
                            break;
                        }

                    } else if (xeMayService.xacNhanTonTai(xeMay)) {
                        System.out.println("xác nhận");
                        System.out.println("\t 1, yes\n" +
                                "\t phím bất kì. No");
                        int luachon4 = Integer.parseInt(sc.nextLine());
                        if (luachon4 == 1) {
                            xeMayService.deleteVehicle(xeMay);
                            System.out.println("đã xóa thành công");


                        } else {
                            break;
                        }
                    } else if (xeTaiService.xacNhanTonTai(xeTai)) {
                        System.out.println("xác nhận");
                        System.out.println("\t 1, yes\n" +
                                "\t phím bất kì. No");
                        int luachon5 = Integer.parseInt(sc.nextLine());
                        if (luachon5 == 1) {
                            xeTaiService.deleteVehicle(xeTai);
                            System.out.println("đã xóa thành công");


                        }
                        else {
                            break;
                        }

                    }
                    else {
                        System.out.println("biển số xe không tồn tại");
                    }

                    break;

                default:
                    System.out.println("đã thoát");
            }
        } while (luaChon != 4);

    }
}
