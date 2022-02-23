package tthi_modum2.model;

public class BenhAnVip extends BenhAn {
    private String loaiVip;
    private String thoiHanVip;

    public BenhAnVip(int soThuTu, String maBenhAn, String tenBenhNhan, String maBenhNhan, String ngayNhapVien, String ngayRaVien, String liDoNhapVien, String loaiVip, String thoiHanVip) {
        super(soThuTu, maBenhAn, tenBenhNhan, maBenhNhan, ngayNhapVien, ngayRaVien, liDoNhapVien);
        this.loaiVip = loaiVip;
        this.thoiHanVip = thoiHanVip;
    }

    public BenhAnVip() {
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    public String getThoiHanVip() {
        return thoiHanVip;
    }

    public void setThoiHanVip(String thoiHanVip) {
        this.thoiHanVip = thoiHanVip;
    }

    @Override
    public String toString() {
        return "BenhAnVip{" +
                super.toString()+
                "loaiVip='" + loaiVip + '\'' +
                ", thoiHanVip='" + thoiHanVip + '\'' +
                '}';
    }

    @Override
    public String getThongTin() {
        return super.getThongTin()+","+this.loaiVip+","+this.thoiHanVip;
    }
}
