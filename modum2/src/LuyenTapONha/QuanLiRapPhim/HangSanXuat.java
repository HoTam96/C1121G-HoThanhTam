package LuyenTapONha.QuanLiRapPhim;

public class HangSanXuat {
    private String tenHangPhimm;
    private String quocGia;
    public HangSanXuat(String name,String quocGia){
        this.setTenHangPhim(name);
        this.setQuocGia(quocGia);
    }

    public String getTenHangPhimm() {
        return this.tenHangPhimm;
    }

    public void setTenHangPhim(String tenHangPhim) {
        this.tenHangPhimm = tenHangPhim;
    }

    public String getQuocGia() {
        return this.quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }
}
