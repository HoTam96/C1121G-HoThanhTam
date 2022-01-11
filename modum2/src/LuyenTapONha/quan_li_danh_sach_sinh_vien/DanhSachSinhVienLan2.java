package LuyenTapONha.quan_li_danh_sach_sinh_vien;

import LuyenTapONha.quan_li_sinh_vien.SinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVienLan2  {
    private ArrayList<SinhVienONha>listDanhSach;
    public DanhSachSinhVienLan2(){
        this.listDanhSach = new ArrayList<SinhVienONha>();
    }

    public DanhSachSinhVienLan2(ArrayList<SinhVienONha>listDanhSach) {
        this.listDanhSach = listDanhSach;
    }

    public ArrayList<SinhVienONha> getListDanhSach() {
        return listDanhSach;
    }

    public void setListDanhSach(ArrayList<SinhVienONha> listDanhSach) {
        this.listDanhSach = listDanhSach;
    }
//    thêm sinh viên
    public void add(SinhVienONha sinhVien){
        this.listDanhSach.add(sinhVien);
    }

//    in danh sách sinh viên
    public void in(){
        for (SinhVienONha sinhVien:listDanhSach) {
            System.out.println(sinhVien);

        }
    }
//kiểm tra danh sách có rỗng hay không
    public boolean kiemTraDanhSach(){
        return this.listDanhSach.isEmpty();
    }
//lấy số lượng sinh viên trong danh sách
public int laysoluongsinhvientrongdanhsach(){
        return this.listDanhSach.size();
}
//làm rỗng danh sách sinh viên
    public void remove(){
        this.listDanhSach.removeAll(listDanhSach);
    }
//    xóa sinh viên khỏi danh sách dựa vào mã sinh viên
    public boolean xoaDuaVaoMaSinhVien(SinhVienONha sinhVienONha){
        return this.listDanhSach.remove(sinhVienONha);

    }
    public boolean kiemTraSinhViencoTonTai(SinhVienONha sinhVienONha){
        return listDanhSach.contains(sinhVienONha);
    }
//    8. Tìm kiếm sinh viên dựa theo tên
    public void timKiemTheoTen(String ten){
        for (SinhVienONha sinhVien:listDanhSach) {
if (sinhVien.getHoVaTen().indexOf(ten)>=0){
    System.out.println(sinhVien.getHoVaTen());
}
        }
    }
//xuất ra màn hình sinh viên có điểm từ cao đến thâp
    public void sapXepDiemGiamDantangdan(){
        Collections.sort(this.listDanhSach, new Comparator<SinhVienONha>() {
            @Override
            public int compare(SinhVienONha o1, SinhVienONha o2) {
                if (o1.getDiemTrungBinh()>o2.getDiemTrungBinh()){
                    return -1;
                }else if (o1.getDiemTrungBinh()<o2.getDiemTrungBinh()){
                    return 1;

                }
                else {
                    return 0;
                }
            }
        }
        );
    }


}
