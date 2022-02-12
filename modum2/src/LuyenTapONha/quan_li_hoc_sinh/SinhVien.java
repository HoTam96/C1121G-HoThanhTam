package LuyenTapONha.quan_li_hoc_sinh;

public class SinhVien {
    private int codeStudent;
    private String hoVaTen;
    private NgaySinh ngaySinh;
    private double diemTrungBinh;
    private Lop lop;
    public SinhVien (int codeStudent,String hoVaTen,NgaySinh ngaySinh,double diemTrungBinh,Lop lop){
        this.setCodeStudent(codeStudent);
        this.setHoVaTen(hoVaTen);
        this.setNgaySinh(ngaySinh);
        this.setDiemTrungBinh(diemTrungBinh);
        this.setLop(lop);
    }

    public int getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(int codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public NgaySinh getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(NgaySinh ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }
    public boolean checkPassOrFall(){
        return this.diemTrungBinh>=5;

    }
    public boolean checkBirthDay(SinhVien sinhvienkhac){
        return this.ngaySinh.getDay()==sinhvienkhac.ngaySinh.getDay();
    }



}
