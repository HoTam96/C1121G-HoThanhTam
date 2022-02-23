package tthi_modum2.model;

public abstract  class BenhAn {
    private int soThuTu;
    private String maBenhAn;
    private String tenBenhNhan;
    private String MaBenhNhan;
    private String ngayNhapVien;
    private String ngayRaVien;
    private String liDoNhapVien;

    public BenhAn(int soThuTu, String maBenhAn, String tenBenhNhan, String maBenhNhan, String ngayNhapVien, String ngayRaVien, String liDoNhapVien) {
        this.soThuTu = soThuTu;
        this.maBenhAn = maBenhAn;
        this.tenBenhNhan = tenBenhNhan;
        MaBenhNhan = maBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.liDoNhapVien = liDoNhapVien;
    }

    public BenhAn() {
    }

    public int getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(int soThuTu) {
        this.soThuTu = soThuTu;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public String getMaBenhNhan() {
        return MaBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        MaBenhNhan = maBenhNhan;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLiDoNhapVien() {
        return liDoNhapVien;
    }

    public void setLiDoNhapVien(String liDoNhapVien) {
        this.liDoNhapVien = liDoNhapVien;
    }

    @Override
    public String toString() {
        return "BenhAn{" +
                "soThuTu=" + soThuTu +
                ", maBenhAn='" + maBenhAn + '\'' +
                ", tenBenhNhan='" + tenBenhNhan + '\'' +
                ", MaBenhNhan='" + MaBenhNhan + '\'' +
                ", ngayNhapVien='" + ngayNhapVien + '\'' +
                ", ngayRaVien='" + ngayRaVien + '\'' +
                ", liDoNhapVien='" + liDoNhapVien + '\'' +
                '}';
    }
    public String getThongTin(){
      return   this.soThuTu+","+this.maBenhAn+","+this.tenBenhNhan+","+this.maBenhAn+","+this.ngayNhapVien+","+this.ngayRaVien+","+this.liDoNhapVien;
    }
}
