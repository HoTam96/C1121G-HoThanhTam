package ss11_bai_tap_00P_quan_li_phuong_tien.module.module;

public class XeTai extends Viheicle {
    private float trongTai;

    public XeTai(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, float trongTai) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public XeTai(String bienKiemSoat) {
        super(bienKiemSoat);
    }

    public XeTai() {
    }

    public float getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(float trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                super.toString()+
                "trongTai=" + trongTai +
                '}';
    }
}
