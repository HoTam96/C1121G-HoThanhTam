package case_study.models;

public class Booking implements Comparable<Booking> {
    private String maBooking;
    private String ngayBatDau;
    private String ngayKetThuc;
    private String maKhachHang;
    private Facility tenDichVu;
    private String loaiDichVu;
    private static int number=1;
    private int id;


    public Booking(String maBooking, String ngayBatDau, String ngayKetThuc, String maKhachHang, Facility tenDichVu, String loaiDichVu) {
        this.maBooking = maBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.maKhachHang = maKhachHang;
        this.tenDichVu = tenDichVu;
        this.loaiDichVu = loaiDichVu;
        this.id= number++;
    }

    public Booking() {
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Booking.number = number;
    }

    public Booking(String maBooking) {
        this.maBooking = maBooking;
    }


    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public Facility getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(Facility tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "maBooking='" + maBooking + '\'' +
                ", ngayBatDau='" + ngayBatDau + '\'' +
                ", ngayKetThuc='" + ngayKetThuc + '\'' +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", tenDichVu='" + tenDichVu.getServiceName() + '\'' +
                ", ID='" + id + '\'' +
                ", loaiDichVu='" + loaiDichVu + '\'' +
                '}';
    }

    public String getInForBooking(){
        return (this.maBooking+","+ this.ngayBatDau+","+this.ngayKetThuc+","+this.maKhachHang+","+this.getTenDichVu().getServiceName()+","+this.loaiDichVu);
    }

    @Override
    public int compareTo(Booking o) {
        return this.getMaBooking().compareTo(o.maBooking);
    }
}
