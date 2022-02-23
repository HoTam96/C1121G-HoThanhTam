package case_study.models;

public class Customer extends Person {
    private Booking makhachHang;
    private String loaiKhach;
    private String diaChi;
    private static int numberOfCustomer = 1;
    private int id;


    public Customer(String hoTen, String ngaySinh, String gioiTinh, String cMND, double soDienThoai, String email, Booking makhachHang, String loaiKhach, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, cMND, soDienThoai, email);
        this.makhachHang = makhachHang;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
        this.id = numberOfCustomer++;
    }

    public Customer() {
        this.id = numberOfCustomer++;
    }

    public static int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public static void setNumberOfCustomer(int numberOfCustomer) {
        Customer.numberOfCustomer = numberOfCustomer;
    }

    public Customer(Booking makhachHang) {
        this.makhachHang = makhachHang;
    }

    public Booking getMakhachHang() {
        return makhachHang;
    }

    public void setMakhachHang(Booking makhachHang) {
        this.makhachHang = makhachHang;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                ", makhachHang= " + makhachHang.getMaKhachHang() +
                ", loaiKhach= " + loaiKhach +
                ", diaChi= " + diaChi +
                '}';
    }

    public String getInForCustomer() {
        return this.getHoTen() + "," + this.getNgaySinh() + "," + this.getGioiTinh() + "," + this.getcMND() + "," + this.getSoDienThoai() + "," + this.getEmail() + "," + this.makhachHang.getMaKhachHang() + "," + this.loaiKhach + "," + this.diaChi;
    }
}
