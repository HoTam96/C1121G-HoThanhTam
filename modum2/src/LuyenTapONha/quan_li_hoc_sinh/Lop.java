package LuyenTapONha.quan_li_hoc_sinh;

public class Lop {
    private String tenLop;
    private String tenKhoa;
    public Lop(String tenLop, String tenKhoa){
        this.setTenLop(tenLop);
        this.setTenKhoa(tenKhoa);
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }
}

