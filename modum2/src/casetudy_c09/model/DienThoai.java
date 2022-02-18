package casetudy_c09.model;

public class DienThoai {
    private int id ;
    private String tenSanPham;
    private double giaBan;
    private int soLuonbg;
    private String nhaSanXuat;

    public DienThoai(int id, String tenSanPham, double giaBan, int soLuonbg, String nhaSanXuat) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.soLuonbg = soLuonbg;
        this.nhaSanXuat = nhaSanXuat;
    }

    public DienThoai() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuonbg() {
        return soLuonbg;
    }

    public void setSoLuonbg(int soLuonbg) {
        this.soLuonbg = soLuonbg;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return "DienThoai{" +
                "id=" + id +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", giaBan=" + giaBan +
                ", soLuonbg=" + soLuonbg +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                '}';
    }
    public String getInForPhone(){
        return this.id+","+this.tenSanPham+","+this.giaBan+","+this.soLuonbg+","+this.nhaSanXuat;
    }
}
