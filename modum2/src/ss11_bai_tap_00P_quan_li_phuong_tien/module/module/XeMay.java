package ss11_bai_tap_00P_quan_li_phuong_tien.module.module;

public class XeMay extends Viheicle {
    private float congSuat;

    public XeMay(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, float congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoat) {
        super(bienKiemSoat);
    }

    public XeMay() {
    }

    public float getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(float congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                super.toString()+
                " congSuat=" + congSuat +
                '}';
    }
}
