package ss11_bai_tap_00P_quan_li_phuong_tien.module.module;

public class XeMay extends Viheicle {
    private float congSuat;

    public XeMay(String bienKiemSoat, HangSanXuat hangSanXuat, int namSanXuat, String chuSoHuu, float congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }


    public XeMay(String bienKiemSoat) {
        super(bienKiemSoat);
    }

    public XeMay() {
    }

    @Override
    public String toString() {
        return "XeMay" +
                super.toString()+
                " congSuat=" + congSuat +
                '}';
    }
    public String getInFoXeMay() {
        return this.getBienKiemSoat() + "," + this.getHangSanXuat().getTenHangSanXuat() + "," +
                this.getNamSanXuat() + "," + this.getChuSoHuu() + "," + this.congSuat;
    }
}
