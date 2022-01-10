package LuyenTapONha.phuong_tien_di_chuyen;

public abstract class PhuongTienDiChuyen {
    protected String loaiPhuongTien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        this.setLoaiPhuongTien(loaiPhuongTien);
        this.setHangSanXuat(hangSanXuat);
    }
    public String getLoaiPhuongTien() {
        return loaiPhuongTien;
    }

    public void setLoaiPhuongTien(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }


    public void layTenHangSanXuat() {
        System.out.println(this.getHangSanXuat().getTenHangSanXuat());
    }

    public void batDau() {
        System.out.println("bắt đầu......");
    }
    public void tangToc(){
        System.out.println("tăng tốc.....");
    }
public void dungLai(){
    System.out.println("dừng lại<<<<");
}
public abstract double layVanToc();


}
