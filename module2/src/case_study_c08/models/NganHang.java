package case_study_c08.models;

public abstract class NganHang {
    private int id ;
    private String maTaiKhoan;
    private String TenChuTaiKhoan;
    private  String ngayTaoTaiKhoan;

    public NganHang(int id, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan) {
        this.id = id;
        this.maTaiKhoan = maTaiKhoan;
        TenChuTaiKhoan = tenChuTaiKhoan;
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }

    public NganHang() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getTenChuTaiKhoan() {
        return TenChuTaiKhoan;
    }

    public void setTenChuTaiKhoan(String tenChuTaiKhoan) {
        TenChuTaiKhoan = tenChuTaiKhoan;
    }

    public String getNgayTaoTaiKhoan() {
        return ngayTaoTaiKhoan;
    }

    public void setNgayTaoTaiKhoan(String ngayTaoTaiKhoan) {
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }

    @Override
    public String toString() {
        return "NganHang{" +
                "id=" + id +
                ", maTaiKhoan='" + maTaiKhoan + '\'' +
                ", TenChuTaiKhoan='" + TenChuTaiKhoan + '\'' +
                ", ngayTaoTaiKhoan='" + ngayTaoTaiKhoan + '\'' +
                '}';
    }
    public String getInFor(){
        return this.id+","+this.maTaiKhoan+","+this.TenChuTaiKhoan+","+this.ngayTaoTaiKhoan;
    }
}
