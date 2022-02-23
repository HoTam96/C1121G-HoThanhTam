package case_study.models;

public abstract class Person {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String cMND;
    private double soDienThoai;
    private String email;

    public Person(String hoTen, String ngaySinh, String gioiTinh, String cMND, double soDienThoai, String email) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cMND = cMND;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }

    public Person() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getcMND() {
        return cMND;
    }

    public void setcMND(String cMND) {
        this.cMND = cMND;
    }

    public double getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(double soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "HoTen='" + hoTen + '\'' +
                        ", NgaySinh='" + ngaySinh + '\'' +
                        ", GioiTinh='" + gioiTinh + '\'' +
                        ", CMND='" + cMND + '\'' +
                        ", SoDienThoai=" + soDienThoai +
                        ", Email='" + email+", ";
    }
}
