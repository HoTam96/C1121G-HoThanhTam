package ss11_bai_tap_00P_quan_li_phuong_tien.module.module;

public class KieuXe {
    private String duLich;
    private String xeKhach;

    public KieuXe(String duLich, String xeKhach) {
        this.duLich = duLich;
        this.xeKhach = xeKhach;
    }

    public KieuXe() {
    }

    public String getDuLich() {
        return duLich;
    }

    public void setDuLich(String duLich) {
        this.duLich = duLich;
    }

    public String getXeKhach() {
        return xeKhach;
    }

    public void setXeKhach(String xeKhach) {
        this.xeKhach = xeKhach;
    }

    @Override
    public String toString() {
        return "KieuXe{" +
                "duLich='" + duLich + '\'' +
                ", xeKhach='" + xeKhach + '\'' +
                '}';
    }
}
