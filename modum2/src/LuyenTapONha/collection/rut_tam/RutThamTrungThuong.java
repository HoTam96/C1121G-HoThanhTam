package LuyenTapONha.collection.rut_tam;

import java.util.*;
import java.util.Set;

public class RutThamTrungThuong  {
    Set<String> thungRutThamTrungThuong = new HashSet<String>();

    public RutThamTrungThuong() {
        this.thungRutThamTrungThuong = new HashSet<String>();
    }
    public boolean themMaDuThuong(String giaTri){
       return this.thungRutThamTrungThuong.add(giaTri);
    }
    public boolean xoaPhieu(String giaTri){
        return this.thungRutThamTrungThuong.remove(giaTri);
    }
    public boolean kiemTraPhieuTonTai(String giaTri){
        return this.thungRutThamTrungThuong.contains(giaTri);
    }
    public void xoaTacCaPhieu(){
        this.thungRutThamTrungThuong.clear();
    }
    public int soLuongPhieu(){
        return  this.thungRutThamTrungThuong.size();
    }
    public  void display(){
        System.out.println(Arrays.toString(thungRutThamTrungThuong.toArray()));
    }
    public String rutThamTrungThuong(){
        String ketQua="";
        Random rd = new Random();
        int viTri = rd.nextInt(this.thungRutThamTrungThuong.size());
       ketQua+=   this.thungRutThamTrungThuong.toArray()[viTri];
       return ketQua;
    }
    public void inMaDuThuong(){
//        for (String phieuDuThuong:thungRutThamTrungThuong) {
//            System.out.println(phieuDuThuong);
//        }
        System.out.println(Arrays.toString(this.thungRutThamTrungThuong.toArray()));
        for (String e:thungRutThamTrungThuong) {
            System.out.println(hashCode());
        }
    }



}
