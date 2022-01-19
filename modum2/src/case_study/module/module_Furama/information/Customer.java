package case_study.module.module_Furama.information;

public class Customer extends Person {
    private Booking makhachHang;
    private LoaiKhach loaiKhach;
    private String diaChi;

    public Customer(String hoTen, String ngaySinh, String gioiTinh, String cMND, double soDienThoai, String email, Booking makhachHang, LoaiKhach loaiKhach, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, cMND, soDienThoai, email);
        this.makhachHang = makhachHang;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public Customer() {
    }

    public Booking getMakhachHang() {
        return makhachHang;
    }

    public void setMakhachHang(Booking makhachHang) {
        this.makhachHang = makhachHang;
    }

    public LoaiKhach getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(LoaiKhach loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
