package LuyenTapONha.phuong_tien_di_chuyen;

public class MayBay extends PhuongTienDiChuyen {
    private String loaiNhienLieu;
    private HangSanXuat hangSanXuat;

    public MayBay(HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super("máy bay", hangSanXuat);
        this.setLoaiNhienLieu(loaiNhienLieu);
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void catCanh() {
        System.out.println("cất cánh>>>>");
    }

    public void haCanh() {
        System.out.println("hạ cánh<<<<");
    }

    @Override
    public double layVanToc() {
        return 600;
    }


}


