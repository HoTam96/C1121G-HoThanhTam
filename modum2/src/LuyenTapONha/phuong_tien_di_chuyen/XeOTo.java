package LuyenTapONha.phuong_tien_di_chuyen;

public class XeOTo extends PhuongTienDiChuyen {
    private HangSanXuat hangSanXuat;
    private String loaiNhienLieu;
    public XeOTo(HangSanXuat hangSanXuat,String loaiNhienLieu){
        super("xe ô tô",hangSanXuat);
        this.setLoaiNhienLieu(loaiNhienLieu);
    }


    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 150;
    }
}
