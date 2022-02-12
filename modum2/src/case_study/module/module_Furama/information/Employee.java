package case_study.module.module_Furama.information;

public class Employee extends Person {

    private static int numberOfEmployee =1;
    private  int id ;
    private String maNhanVien;
    private String trinhDo;
    private String viTri;
    private  double luong;

    public Employee(String hoTen, String ngaySinh, String gioiTinh, String cMND, double soDienThoai, String email, String maNhanVien, String trinhDo, String viTri, double luobg) {
        super(hoTen, ngaySinh, gioiTinh, cMND, soDienThoai, email);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luobg;
        this.id = numberOfEmployee++ ;

    }

    public Employee() {
    }

    public Employee(  String maNhanVien, String trinhDo, String viTri, double luong) {
        this.id  = numberOfEmployee++ ;
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public static int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public static void setNumberOfEmployee(int numberOfEmployee) {
        Employee.numberOfEmployee = numberOfEmployee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "{" +
                super.toString()+
                ", maNhanVien='" + maNhanVien + '\'' +
                ", trinhDo=" + trinhDo +
                ", viTri=" + viTri +
                ", luong=" + luong +
                ", id=" + id +
                '}';
    }
    public String getInForEmployee(){
        return this.getHoTen()+ "," +this.getNgaySinh()+ "," +this.getGioiTinh()+ "," + this.getcMND()+ "," + this.getSoDienThoai()+ "," + this.getEmail()+ "," +this.maNhanVien+ "," +this.trinhDo+ "," +this.viTri+ "," +luong;
    }
}
