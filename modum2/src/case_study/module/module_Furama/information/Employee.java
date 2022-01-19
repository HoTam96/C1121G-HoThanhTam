package case_study.module.module_Furama.information;

public class Employee extends Person {
    private String maNhanVien;
    private TrinhDo trinhDo;
    private ViTri viTri;
    private  double luong;

    public Employee(String hoTen, String ngaySinh, String gioiTinh, String cMND, double soDienThoai, String email, String maNhanVien, TrinhDo trinhDo, ViTri viTri, double luobg) {
        super(hoTen, ngaySinh, gioiTinh, cMND, soDienThoai, email);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luobg;
    }

    public Employee() {
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public TrinhDo getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(TrinhDo trinhDo) {
        this.trinhDo = trinhDo;
    }

    public ViTri getViTri() {
        return viTri;
    }

    public void setViTri(ViTri viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString()+
                "maNhanVien='" + maNhanVien + '\'' +
                ", trinhDo=" + trinhDo.getBangCap() +
                ", viTri=" + viTri.getViTri() +
                ", luong=" + luong +
                '}';
    }
}
