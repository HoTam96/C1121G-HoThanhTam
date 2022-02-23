package LuyenTapONha.quan_li_sinh_vien;

import java.util.*;

public class DanhSachSinhVien {
    private ArrayList<SinhVien>danhSach;

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }
    public DanhSachSinhVien(){
        this.danhSach = new ArrayList<SinhVien>();
    }
    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);

    }
//in danh sách sinh viên

    public void indanhSachSinhVien(){
    for (SinhVien sinhVien: danhSach) {
        System.out.println(sinhVien);
    }
}
//3. kiểm tra danh sách có rỗng hay không
    public boolean kiemTraRongHayKhong(){
        return this.danhSach.isEmpty();
    }
//    4. lấy ra số lượng sinh viên trong danh sách
    public int soLuongSinhVien(){
        return this.danhSach.size();
    }
//    5. làm rỗng danh sách sinh viên
    public void remove(){
        this.danhSach.removeAll(danhSach);
    }
//    6. kiểm tra sinh viên có tồn tại trong danh sách hay  dựa trên mã sinh viên.
    public boolean kiemTraTonTai(SinhVien sv){
        return this.danhSach.contains(sv);

    }
//    7. xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên
    public boolean xoaSinhVienKhoiDanhSach(SinhVien sv){
        return this.danhSach.remove(sv);
    }

//8. tìm kiếm tấc cả sinh viên dựa trên tên được nhập từ bàn phím
    public void timKiemSinhVien(String ten){
        for (SinhVien sinhVien:danhSach) {
          if ( sinhVien.getHoVaTen().indexOf(ten)>=0){
              System.out.println(sinhVien.getHoVaTen());
          }

        }
    }
//    9. xuất ra danh sách sinh viên có điểm từ cao đến thấp
    public void sapXepDiemGiamDan(){
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (sv1.getDiemTrungBinh()<sv2.getDiemTrungBinh()){
                    return 1;
                }
                else if (sv1.getDiemTrungBinh()>sv2.getDiemTrungBinh()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }

}

