package case_study.module.module_Furama.information;

public class Customer extends Person {
    private Booking makhachHang;
    private LoaiKhach loaiKhach;
    private String diaChi;
    private static int numberOfCustomer=1;
    private  int id;


    public Customer(String hoTen, String ngaySinh, String gioiTinh, String cMND, double soDienThoai, String email, Booking makhachHang, LoaiKhach loaiKhach, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, cMND, soDienThoai, email);
        this.makhachHang = makhachHang;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
        this.id = numberOfCustomer++;
    }

    public Customer() {
        this.id = numberOfCustomer++;
    }

    public Booking getMakhachHang() {
        return makhachHang;
    }

    public void setMakhachHang(Booking makhachHang) {
        this.makhachHang = makhachHang;
    }

    public LoaiKhach getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(LoaiKhach loaiKhach) {
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
                ", loaiKhach= " + loaiKhach.getLoaiKhach() +
                ", Ngày bắt đầu= " + makhachHang.getNgayBatDau() +
                ", Ngày kết thúc= " + makhachHang.getNgayKetThuc() +
                ", diaChi= " + diaChi +
                ", Id= "+ id +
                '}';
    }
    public String getInForEmployee(){
        return this.getHoTen()+ "," +this.getNgaySinh()+ "," +this.getGioiTinh()+ "," + this.getcMND()+ "," + this.getSoDienThoai()+ "," + this.getEmail()+ "," + this.makhachHang+ "," +this.loaiKhach+ "," +this.diaChi;
    }
}
