package LuyenTapONha.QuanLiRapPhim;

import LuyenTapONha.QuanLiThuVien.TacGia;

public class BoPhim {
    private String tenPhim;
    private int namSanXuat;
    private HangSanXuat hangSanXuat10;
    private double giaVe;
    private NgayChieu ngayChieu;
    public BoPhim (String tenPhim,int namSanXuat,HangSanXuat hangSanXuat1,double giaVe,NgayChieu ngayChieu){
        this.setTenPhim(tenPhim);
        this.setNamSanXuat(namSanXuat);
        this.setHangSanXuat(hangSanXuat1);
        this.setGiaVe(giaVe);
        this.setNgayChieu(ngayChieu);
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public HangSanXuat getHangSanXuat10() {
        return hangSanXuat10;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat1) {
        this.hangSanXuat10 = hangSanXuat1;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public NgayChieu getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(NgayChieu ngayChieu) {
        this.ngayChieu = ngayChieu;
    }
    public boolean checkGiaVe(BoPhim phimkhac){
        return this.giaVe< phimkhac.giaVe;
    }

    public String hienThiTenHangPhim(){
        return this.hangSanXuat10.getTenHangPhimm();
    }
}
