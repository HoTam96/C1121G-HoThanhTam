package casetudy_c09.model;

public class DienThoaiXachTay extends DienThoai{
    private String quocGiaXachTay;
    private String TrangThai;

    public DienThoaiXachTay(int id, String tenSanPham, double giaBan, int soLuonbg, String nhaSanXuat, String quocGiaXachTay, String trangThai) {
        super(id, tenSanPham, giaBan, soLuonbg, nhaSanXuat);
        this.quocGiaXachTay = quocGiaXachTay;
        TrangThai = trangThai;
    }

    public DienThoaiXachTay() {
    }

    public String getQuocGiaXachTay() {
        return quocGiaXachTay;
    }

    public void setQuocGiaXachTay(String quocGiaXachTay) {
        this.quocGiaXachTay = quocGiaXachTay;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String trangThai) {
        TrangThai = trangThai;
    }

    @Override
    public String toString() {
        return "DienThoaiXachTay{" +
                super.toString()+
                "QuocGiaXachTay='" + quocGiaXachTay + '\'' +
                ", TrangThai='" + TrangThai + '\'' +
                '}';
    }

    @Override
    public String getInForPhone() {
        return super.getInForPhone()+","+this.quocGiaXachTay +","+this.TrangThai;
    }
}
