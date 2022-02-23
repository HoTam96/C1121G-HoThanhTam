package tthi_modum2.model;

public class BenhAnThuong extends BenhAn{
    private double phiNamVien;

    public BenhAnThuong(int soThuTu, String maBenhAn, String tenBenhNhan, String maBenhNhan, String ngayNhapVien, String ngayRaVien, String liDoNhapVien, double phiNamVien) {
        super(soThuTu, maBenhAn, tenBenhNhan, maBenhNhan, ngayNhapVien, ngayRaVien, liDoNhapVien);
        this.phiNamVien = phiNamVien;
    }


    public BenhAnThuong() {
    }

    public double getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(double phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhAnThuong{" +
                super.toString()+
                "phiNamVien=" + phiNamVien +
                '}';
    }

    @Override
    public String getThongTin() {
        return super.getThongTin()+","+this.phiNamVien;
    }
}
