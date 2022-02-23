package case_study_c08.models;

public class TaiKhoanTietKiem extends NganHang {
    private double soTienTietKiem;
    private String ngayGuiTietKiem;
    private double laiXuat;
    private int kiHan;

    public TaiKhoanTietKiem(int id, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan, double soTienTietKiem, String ngayGuiTietKiem, double laiXuat, int kiHan) {
        super(id, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soTienTietKiem = soTienTietKiem;
        this.ngayGuiTietKiem = ngayGuiTietKiem;
        this.laiXuat = laiXuat;
        this.kiHan = kiHan;
    }
    public TaiKhoanTietKiem() {
    }

    public double getSoTienTietKiem() {
        return soTienTietKiem;
    }

    public void setSoTienTietKiem(double soTienTietKiem) {
        this.soTienTietKiem = soTienTietKiem;
    }

    public String getNgayGuiTietKiem() {
        return ngayGuiTietKiem;
    }

    public void setNgayGuiTietKiem(String ngayGuiTietKiem) {
        this.ngayGuiTietKiem = ngayGuiTietKiem;
    }

    public double getLaiXuat() {
        return laiXuat;
    }

    public void setLaiXuat(double laiXuat) {
        this.laiXuat = laiXuat;
    }

    public int getKiHan() {
        return kiHan;
    }

    public void setKiHan(int kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return "TaiKhoanTietKiem{" +
                super.toString()+
                "soTienTietKiem=" + soTienTietKiem +
                ", ngayGuiTietKiem='" + ngayGuiTietKiem + '\'' +
                ", laiXuat=" + laiXuat +
                ", kiHan=" + kiHan +
                '}';
    }

    @Override
    public String getInFor() {
        return super.getInFor()+","+this.soTienTietKiem+","+this.ngayGuiTietKiem+","+this.laiXuat+","+this.kiHan;
    }
}
