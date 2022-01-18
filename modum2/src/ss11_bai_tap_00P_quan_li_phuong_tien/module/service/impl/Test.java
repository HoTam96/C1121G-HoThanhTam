package ss11_bai_tap_00P_quan_li_phuong_tien.module.service.impl;

import ss11_bai_tap_00P_quan_li_phuong_tien.module.module.HangSanXuat;
import ss11_bai_tap_00P_quan_li_phuong_tien.module.module.OTo;

import java.util.ArrayList;

public class Test {
    private static ArrayList<OTo> oToArrayList = new ArrayList<>();
   private static ArrayList<HangSanXuat> hangSanXuatArrayList = new ArrayList<>();

    public  void removed(String bienKiemSoat){
//    for ( int i =0;i<oToArrayList.size();i++){
//        if (oToArrayList.get(i).getBienKiemSoat().contains(bienKiemSoat)){
//           oToArrayList.remove(i);
//        }
//
//    }
        }





    public static void main(String[] args) {

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

        Test test = new Test();
        test.removed("43c1-24104");

    }


}
