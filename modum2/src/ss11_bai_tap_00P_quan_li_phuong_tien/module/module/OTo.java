package ss11_bai_tap_00P_quan_li_phuong_tien.module.module;

public class OTo extends Viheicle implements Comparable<OTo> {
    private  int soChoNgoi;
    private String kieuXe;

    public OTo(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public OTo(String bienKiemSoat) {
        super(bienKiemSoat);
    }

    public OTo() {
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "OTo{" +
                "bienKiemSoat='" + getBienKiemSoat()  + '\'' +
                ", hangSanXuat='" + getHangSanXuat() + '\'' +
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
