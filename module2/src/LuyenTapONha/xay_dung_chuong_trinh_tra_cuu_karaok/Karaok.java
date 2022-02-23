package LuyenTapONha.xay_dung_chuong_trinh_tra_cuu_karaok;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Karaok implements Comparable<Karaok> {
    private String maBaiHat;
    private String tenCaSi;
    private String tenBaiHat;
    private String theLoai;

    public Karaok(String maBaiHat, String tenCaSi, String tenBaiHat, String theLoai) {
        this.maBaiHat = maBaiHat;
        this.tenCaSi = tenCaSi;
        this.tenBaiHat = tenBaiHat;
        this.theLoai = theLoai;
    }

    public String getMaBaiHat() {
        return maBaiHat;
    }

    public void setMaBaiHat(String maBaiHat) {
        this.maBaiHat = maBaiHat;
    }

    public String getTenCaSi() {
        return tenCaSi;
    }

    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    public String getTenBaiHat() {
        return tenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        this.tenBaiHat = tenBaiHat;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    @Override
    public String toString() {
        return "Karaok{" +
                "maBaiHat='" + maBaiHat + '\'' +
                ", tenCaSi='" + tenCaSi + '\'' +
                ", tenBaiHat='" + tenBaiHat + '\'' +
                ", theLoai='" + theLoai + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Karaok)) return false;
        Karaok karaok = (Karaok) o;
        return Objects.equals(getMaBaiHat(), karaok.getMaBaiHat()) || Objects.equals(getTenCaSi(), karaok.getTenCaSi()) || Objects.equals(getTenBaiHat(), karaok.getTenBaiHat());
    }


    @Override
    public int compareTo(Karaok o) {
        return this.getTenBaiHat().compareTo(o.getTenBaiHat());
    }

}









