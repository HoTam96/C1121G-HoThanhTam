package LuyenTapONha.quan_li_hoc_sinh;


import java.util.Set;
import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        TreeSet<Lop> lopTreeSet = new TreeSet<>();
//       lopTreeSet.add("1");
//       lopTreeSet.add("2");
//       lopTreeSet.add("3");
//       lopTreeSet.add("4");
//        System.out.println(lopTreeSet.size());

        Lop lop1 = new Lop("a", "1");
        Lop lop2 = new Lop("a", "1");
        Lop lop3 = new Lop("d", "3");
        Lop lop4 = new Lop("d", "4");
        Lop lop5 = new Lop("e", "5");
        Lop lop6 = new Lop("f", "6");

        lopTreeSet.add(lop1);
        lopTreeSet.add(lop2);
        lopTreeSet.add(lop3);
        lopTreeSet.add(lop4);


        System.out.println(lopTreeSet.size());
        System.out.println(lopTreeSet.last());
        System.out.println(lopTreeSet.first());

//
//
//        for (Lop e: lopTreeSet) {
//            System.out.println(e);
//        }


//        lopTreeSet.add("1");
//        lopTreeSet.add("4");
//        lopTreeSet.add("2");
//        lopTreeSet.add("0");
//        System.out.println("size: "+ lopTreeSet.size());
//        for (String e:lopTreeSet) {
//            System.out.println(e);
//        }


//        for (Lop e :lopSet) {
//            System.out.println(e.getTenLop());
//        }


//        NgaySinh ngaySinh1 = new NgaySinh(12, 2, 2013);
//        NgaySinh ngaySinh2 = new NgaySinh(12, 2, 2013);
//        NgaySinh ngaySinh3 = new NgaySinh(14, 2, 2015);
//
//        SinhVien sinhvien1 = new SinhVien(112, "hồ thanh tâm", ngaySinh1, 6.0, lop1);
//        SinhVien sinhvien2 = new SinhVien(113, "hồ thanh tài", ngaySinh2, 5.0, lop2);
//        SinhVien sinhvien3 = new SinhVien(114, "hồ thanh thiên", ngaySinh3, 4.0, lop3);
//
//        System.out.println(sinhvien1.getLop().getTenKhoa());
//
//        if (sinhvien1.checkPassOrFall()) {
//            System.out.println("sinh viên đâu");
//        }
//        else
//        {
//            System.out.println("sinh viên rớt");
//        }
//        if (sinhvien2.checkPassOrFall()) {
//            System.out.println("sinh viên đâu");
//        }
//        else
//        {
//            System.out.println("sinh viên rớt");
//        }
//        if (sinhvien3.checkPassOrFall()) {
//            System.out.println("sinh viên đâu");
//        }
//        else
//        {
//            System.out.println("sinh viên rớt");
//        }
//
//        System.out.println(sinhvien1.checkBirthDay(sinhvien2));
//        System.out.println(ngaySinh1);
//        System.out.println(ngaySinh1.equals(ngaySinh2));

    }


}
