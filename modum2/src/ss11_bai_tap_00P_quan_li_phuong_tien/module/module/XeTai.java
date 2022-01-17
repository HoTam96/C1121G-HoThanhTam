package ss11_bai_tap_00P_quan_li_phuong_tien.module.module;

public class XeTai extends Viheicle {
    private float trongTai;

    public XeTai(String bienKiemSoat, HangSanXuat hangSanXuat, int namSanXuat, String chuSoHuu, float trongTai) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }


    public XeTai(String bienKiemSoat) {
        super(bienKiemSoat);
    }

    public XeTai() {
    }

    @Override
    public String toString() {
        return "XeTai" +
                super.toString()+
                "trongTai=" + trongTai +
                '}';
    }
}
