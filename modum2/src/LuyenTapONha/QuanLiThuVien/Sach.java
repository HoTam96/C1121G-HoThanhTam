package LuyenTapONha.QuanLiThuVien;

public class Sach {
    private String tenSach;
    private double giaBan;
    private int namXuatBan;
    private TacGia tacGia;
    public Sach(String ten,double gia,int nXB, TacGia tacGia){
        this.setTenSach(ten);
        this.setGiaBan(gia);
        this.setNamXuatBan(nXB);
        this.setTacGia(tacGia);
    }

    public String getTenSach() {
        return this.tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaBan() {
        return this.giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getNamXuatBan() {
        return this.namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public TacGia getTacGia() {
        return this.tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }
    public void inSach(){
        System.out.println(this.tenSach);
    }
public boolean checkNXB(Sach sachkhac){
        return this.namXuatBan==sachkhac.namXuatBan;
}
public double giaSauKhiGiam(double x){
        return this.giaBan*(1-x/100);
}
}
