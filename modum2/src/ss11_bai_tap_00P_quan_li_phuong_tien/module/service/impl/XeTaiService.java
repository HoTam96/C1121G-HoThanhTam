package ss11_bai_tap_00P_quan_li_phuong_tien.module.service.impl;

import ss11_bai_tap_00P_quan_li_phuong_tien.module.module.HangSanXuat;
import ss11_bai_tap_00P_quan_li_phuong_tien.module.module.XeTai;
import ss11_bai_tap_00P_quan_li_phuong_tien.module.service.IXeTai;

import java.util.ArrayList;
import java.util.Scanner;

public class XeTaiService implements IXeTai {
    private static ArrayList<XeTai> xeTaiArrayList = new ArrayList<>();
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

        XeTai xeTai1 = new XeTai("93d1-24104", "yamaha", 1998, "tam", 4.5f);
        XeTai xeTai2 = new XeTai("94d1-24105", "honda", 2000, "tú", 5.5f);


        xeTaiArrayList.add(xeTai1);
        xeTaiArrayList.add(xeTai2);
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
        System.out.println("trọng tải ");
        float trongTai = Float.parseFloat(scanner.nextLine());

        System.out.println("lựa chọn nhà sản xuất trong menu sau");
        System.out.println("1. Yamaha\t\n" +
                "2.Honda\t\n" +
                "3.Dongfeng\n" +
                "4.Huyndai\n" +
                "5.Ford\n" +
                "6.Toyota\n" +
                "7.Hino\n");
        int luaChon = Integer.parseInt(scanner.nextLine());
        String nhaSanXuat = "";
        switch (luaChon) {
            case 1:
                nhaSanXuat = hangSanXuatArrayList.get(0).getTenHangSanXuat();
                break;
            case 2:
                nhaSanXuat = hangSanXuatArrayList.get(1).getTenHangSanXuat();
                break;
            case 3:
                nhaSanXuat = hangSanXuatArrayList.get(2).getTenHangSanXuat();
                break;
            case 4:
                nhaSanXuat = hangSanXuatArrayList.get(3).getTenHangSanXuat();
                break;
            case 5:
                nhaSanXuat = hangSanXuatArrayList.get(4).getTenHangSanXuat();
                break;
            case 6:
                nhaSanXuat = hangSanXuatArrayList.get(5).getTenHangSanXuat();
                break;
            case 7:
                nhaSanXuat = hangSanXuatArrayList.get(6).getTenHangSanXuat();
                break;
            default:
                System.out.println("chọn chưa đúng");
        }

        XeTai xeTai = new XeTai(bienKiemSoat, nhaSanXuat, namSanXuat, chuSoHuu, trongTai);
        xeTaiArrayList.add(xeTai);

    }

    @Override
    public void disPlayVehicle() {
        for (XeTai element : xeTaiArrayList) {
            System.out.println(element);
        }
    }

    @Override
    public void deleteVehicle(XeTai bienKiemSoat) {
//        for (XeTai element :xeTaiArrayList) {
//            if (element.getBienKiemSoat().equals(bienKiemSoat)){
//                xeTaiArrayList.remove(bienKiemSoat);
//                System.out.println("đã xóa thành công");
//            }
//            else {
//                System.out.println("biển kiểm soát không tồn tại");
//            }
//        }
        xeTaiArrayList.remove(bienKiemSoat);

    }
    public boolean xacNhanTonTai(XeTai bienKiemSoat){
        return xeTaiArrayList.contains(bienKiemSoat);
    }
}
