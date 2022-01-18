package case_study.module.module_Furama.information;

public class Employee extends Person {
    private String maNhanVien;
    private TrinhDo trinhDo;
    private ViTri viTri;
    private  String luobg;

    public Employee(String hoTen, String ngaySinh, String gioiTinh, String cMND, double soDienThoai, String email, String maNhanVien, TrinhDo trinhDo, ViTri viTri, String luobg) {
        super(hoTen, ngaySinh, gioiTinh, cMND, soDienThoai, email);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luobg = luobg;
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

    public String getLuobg() {
        return luobg;
    }

    public void setLuobg(String luobg) {
        this.luobg = luobg;
    }

}
