package LuyenTapONha.phuong_tien_di_chuyen;

public class HangSanXuat {
    private String tenHangSanXuat;
    private  String tenQuocGia;

    public HangSanXuat(String tenHangSanXuat,String tenQuocGia){
        this.setTenHangSanXuat(tenHangSanXuat);
        this.setTenQuocGia(tenQuocGia);
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
}
