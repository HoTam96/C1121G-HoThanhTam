package case_study.module.module_Furama.information;

public class Contact {
    private String soHopDong;
    private Booking maBooking;
    private double tienCoc;
    private double tongSoTienThanhToan;
    private Booking maKhachHang;

    public Contact(String soHopDong, Booking maBooking, double tienCoc, double tongSoTienThanhToan, Booking maKhachHang) {
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.tienCoc = tienCoc;
        this.tongSoTienThanhToan = tongSoTienThanhToan;
        this.maKhachHang = maKhachHang;
    }

    public Contact() {
    }

    public String getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(String soHopDong) {
        this.soHopDong = soHopDong;
    }

    public Booking getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(Booking maBooking) {
        this.maBooking = maBooking;
    }

    public double getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(double tienCoc) {
        this.tienCoc = tienCoc;
    }

    public double getTongSoTienThanhToan() {
        return tongSoTienThanhToan;
    }

    public void setTongSoTienThanhToan(double tongSoTienThanhToan) {
        this.tongSoTienThanhToan = tongSoTienThanhToan;
    }

    public Booking getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(Booking maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

}
