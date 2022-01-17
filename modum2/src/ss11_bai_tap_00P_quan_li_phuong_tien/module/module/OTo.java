package ss11_bai_tap_00P_quan_li_phuong_tien.module.module;

public class OTo extends Viheicle implements Comparable<OTo> {
    private  int soChoNgoi;
    private String kieuXe;

    public OTo(String bienKiemSoat, HangSanXuat hangSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public OTo(String bienKiemSoat) {
        super(bienKiemSoat);
    }

    public OTo() {
    }

    @Override
    public String toString() {
        return "OTo{" +
                "bienKiemSoat='" + getBienKiemSoat()  + '\'' +
                ", hangSanXuat='" + getHangSanXuat().getTenHangSanXuat() + '\'' +
                ", namSanXuat=" + getNamSanXuat() +'\'' +
                ", chuSoHuu='" + getChuSoHuu() + '\'' +
                "soChoNgoi=" + soChoNgoi +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }


    @Override
    public int compareTo(OTo o) {
        return this.getBienKiemSoat().compareTo(getBienKiemSoat());
    }


}
