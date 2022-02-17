package case_study.models;

public class Contract {
    private Booking maBooking;
    private double tienCoc;
    private double tongSoTienThanhToan;
    private Booking maKhachHang;
    private static int numberContract = 1;
    private int soHopDong;


    public Contract(Booking maBooking, double tienCoc, double tongSoTienThanhToan, Booking maKhachHang) {
        this.maBooking = maBooking;
        this.tienCoc = tienCoc;
        this.tongSoTienThanhToan = tongSoTienThanhToan;
        this.maKhachHang = maKhachHang;
        this.soHopDong = numberContract++;
    }

    public Contract() {
    }

    public static int getNumberContract() {
        return numberContract;
    }

    public static void setNumberContract(int numberContract) {
        Contract.numberContract = numberContract;
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

    public int getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(int soHopDong) {
        this.soHopDong = soHopDong;
    }

    public String getInForContract(){
        return this.maBooking.getMaBooking()+","+this.tienCoc+","+this.tongSoTienThanhToan+","+this.maKhachHang.getMaKhachHang();
    }

    @Override
    public String toString() {
        return "Contact{" +
                "soHopDong='" + "HD - " + soHopDong + '\'' +
                ", maBooking=" + maBooking.getMaBooking() +
                ", tienCoc=" + tienCoc +
                ", tongSoTienThanhToan=" + tongSoTienThanhToan +
                ", maKhachHang=" + maKhachHang.getMaKhachHang() +
                '}';
    }
}
