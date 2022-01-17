package ss11_bai_tap_00P_quan_li_phuong_tien.module.module;

import java.util.Objects;

public abstract class Viheicle  {

    private String bienKiemSoat;
    private HangSanXuat hangSanXuat;
    private int namSanXuat;
    private String chuSoHuu;

    public Viheicle(String bienKiemSoat, HangSanXuat hangSanXuat, int namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public Viheicle(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public Viheicle() {
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "{" +
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", hangSanXuat=" + hangSanXuat.getTenHangSanXuat() +
                ", namSanXuat=" + namSanXuat +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Viheicle)) return false;
        Viheicle viheicle = (Viheicle) o;
        return  Objects.equals(getBienKiemSoat(), viheicle.getBienKiemSoat());
    }

}
