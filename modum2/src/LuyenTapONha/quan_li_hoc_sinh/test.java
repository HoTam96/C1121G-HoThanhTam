package LuyenTapONha.quan_li_hoc_sinh;

public class test {
    public static void main(String[] args) {
        Lop lop1 = new Lop("c11", "cntt1");
        Lop lop2 = new Lop("c12", "cntt2");
        Lop lop3 = new Lop("c13", "cntt3");

        NgaySinh ngaySinh1 = new NgaySinh(12, 2, 2013);
        NgaySinh ngaySinh2 = new NgaySinh(12, 2, 2013);
        NgaySinh ngaySinh3 = new NgaySinh(14, 2, 2015);

        SinhVien sinhvien1 = new SinhVien(112, "hồ thanh tâm", ngaySinh1, 6.0, lop1);
        SinhVien sinhvien2 = new SinhVien(113, "hồ thanh tài", ngaySinh2, 5.0, lop2);
        SinhVien sinhvien3 = new SinhVien(114, "hồ thanh thiên", ngaySinh3, 4.0, lop3);

        System.out.println(sinhvien1.getLop().getTenKhoa());

        if (sinhvien1.checkPassOrFall()) {
            System.out.println("sinh viên đâu");
        }
        else
        {
            System.out.println("sinh viên rớt");
        }
        if (sinhvien2.checkPassOrFall()) {
            System.out.println("sinh viên đâu");
        }
        else
        {
            System.out.println("sinh viên rớt");
        }
        if (sinhvien3.checkPassOrFall()) {
            System.out.println("sinh viên đâu");
        }
        else
        {
            System.out.println("sinh viên rớt");
        }

        System.out.println(sinhvien1.checkBirthDay(sinhvien2));
        System.out.println(ngaySinh1);
        System.out.println(ngaySinh1.equals(ngaySinh2));

    }
}
