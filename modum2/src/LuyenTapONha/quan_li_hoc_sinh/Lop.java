package LuyenTapONha.quan_li_hoc_sinh;

import java.util.Objects;

public class Lop implements Comparable<Lop> {
    private String tenLop;
    private String tenKhoa;

    public Lop(String tenLop, String tenKhoa) {
        this.setTenLop(tenLop);
        this.setTenKhoa(tenKhoa);
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }



    @Override
    public String toString() {
        return "Lop{" +
                "tenLop='" + tenLop + '\'' +
                ", tenKhoa='" + tenKhoa + '\'' +
                '}';
    }

    @Override
    public int compareTo(Lop o) {
//       if (this.tenLop.compareTo(o.tenLop)>0){
//           return 1;
//       }else if (this.tenLop.compareTo(o.tenLop)<0){
//           return -1;
//       }
//       else {
//           return 0;
//       }
        if (tenLop.compareTo(o.tenLop)==0){
            return this.tenKhoa.compareTo(o.tenKhoa);
        }else {
            return tenLop.compareTo(o.tenLop);
        }

    }
}

