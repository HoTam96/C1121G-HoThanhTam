package LuyenTapONha.phuong_tien_di_chuyen;

public class XeDap extends PhuongTienDiChuyen {
    private HangSanXuat hangSanXuat;
    public XeDap(HangSanXuat hangSanXuat){
super("xe đạp",hangSanXuat);
    }

    @Override
    public double layVanToc() {
        return 10;
    }
}
