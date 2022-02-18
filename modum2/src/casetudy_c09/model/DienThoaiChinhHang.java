package casetudy_c09.model;

public class DienThoaiChinhHang extends DienThoai {
    private int thoiGianBaoHanh;
    private String phamViBaoHanh;

    public DienThoaiChinhHang(int id, String tenSanPham, double giaBan, int soLuonbg, String nhaSanXuat, int thoiGianBaoHanh, String phamViBaoHanh) {
        super(id, tenSanPham, giaBan, soLuonbg, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public DienThoaiChinhHang() {
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public String toString() {
        return "DienThoaiChinhHang{" +
                super.toString()+
                "thoiGianBaoHanh=" + thoiGianBaoHanh +
                ", phamViBaoHanh=" + phamViBaoHanh +
                '}';
    }

    @Override
    public String getInForPhone() {
        return super.getInForPhone()+","+this.thoiGianBaoHanh+","+this.phamViBaoHanh;
    }
}
