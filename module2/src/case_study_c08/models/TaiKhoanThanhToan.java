package case_study_c08.models;

public class TaiKhoanThanhToan extends NganHang {
    private String soThe;
    private double soTienTrongTaiKhoan;

    public TaiKhoanThanhToan(int id, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan, String soThe, double soTienTrongTaiKhoan) {
        super(id, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public TaiKhoanThanhToan() {
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public double getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(double soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    @Override
    public String toString() {
        return "TaiKhoanThanhToan{" +
                super.toString()+
                "soThe='" + soThe + '\'' +
                ", soTienTrongTaiKhoan=" + soTienTrongTaiKhoan +
                '}';
    }

    @Override
    public String getInFor() {
        return super.getInFor()+","+this.soThe+","+this.soTienTrongTaiKhoan;
    }
}
