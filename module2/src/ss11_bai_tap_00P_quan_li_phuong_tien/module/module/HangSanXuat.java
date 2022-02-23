package ss11_bai_tap_00P_quan_li_phuong_tien.module.module;

public class HangSanXuat {
    private String maHangSanXuat;
    private String tenHangSanXuat;
    private String tenQuocGia;

    public HangSanXuat(String maHangSanXuat, String tenHangSanXuat, String tenQuocGia) {
        this.maHangSanXuat = maHangSanXuat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.tenQuocGia = tenQuocGia;
    }

    public HangSanXuat() {
    }

    public HangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getMaHangSanXuat() {
        return maHangSanXuat;
    }

    public void setMaHangSanXuat(String maHangSanXuat) {
        this.maHangSanXuat = maHangSanXuat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

//    @Override
//    public String toString() {
//        return this.getTenHangSanXuat();
//    }
}
