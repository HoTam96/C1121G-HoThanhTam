package LuyenTapONha.xay_dung_chuong_trinh_tra_cuu_karaok;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachKaRaOk {
    private ArrayList<Karaok> danhSach;

    public DanhSachKaRaOk(ArrayList<Karaok> danhSach) {
        this.danhSach = danhSach;
    }

    public DanhSachKaRaOk() {
        this.danhSach = new ArrayList<Karaok>();
    }

    public ArrayList<Karaok> getDanhSach() {
        return danhSach;
    }

    public void setDanhSach(ArrayList<Karaok> danhSach) {
        this.danhSach = danhSach;
    }

    //    them bài hát
    public void themBaiHat(Karaok baiHat) {
        this.danhSach.add(baiHat);
    }

    //    in ra bài hát đã them
    public void display() {
        for (Karaok baiHat : danhSach) {
            System.out.println(baiHat);
        }
    }

    //    xóa bài hát vừa thêm dựa vào mã bài hát
    public boolean remove(String maBaiHat) {
        return (this.danhSach.remove(maBaiHat));
    }

    //xóa tất cả các bài hát đã chọn
    public boolean removeall() {
        return this.danhSach.removeAll(danhSach);
    }

    //    tìm bài hát theo tên được nhập vào
    public void tenCaSi(String ten) {
        for (Karaok tenCaSi : danhSach) {
            if (tenCaSi.getTenCaSi().indexOf(ten) >= 0) {
                System.out.println("tên bài hát được tìm thấy là: " + tenCaSi.getTenBaiHat());
            } else if (tenCaSi.getTenCaSi().indexOf(ten) < 0) {
                System.out.println("không tìm thấy bài hát");
            }
        }

    }

    //    tìm kiếm theo tên bài hát được nhập vào
    public void tenBaiHat(String tenBaiHat) {
        for (Karaok tenBaiHat1 : danhSach) {
            if (tenBaiHat1.getTenBaiHat().indexOf(tenBaiHat) >= 0) {
                System.out.println("tên bài hát được tìm thấy là: " + tenBaiHat1.getTenBaiHat());
            } else if (tenBaiHat1.getTenBaiHat().indexOf(tenBaiHat) < 0) {
                System.out.println("không tìm thấy bài hát");
            }
        }

    }

    //    tìm kiếm bài hát dựa vào mã bài hát
    public void maBaiHat(String maBaiHat) {
        for (Karaok maBaiHat1 : danhSach) {
            if (maBaiHat1.getMaBaiHat().indexOf(maBaiHat) >= 0) {
                System.out.println("tên bài hát được tìm thất là: " + maBaiHat1.getTenBaiHat());
            } else if (maBaiHat1.getMaBaiHat().indexOf(maBaiHat) < 0) {
                System.out.println("không tìm thấy bài hát");
            }

        }
    }

}
