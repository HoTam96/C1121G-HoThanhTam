package LuyenTapONha.compareto;

import java.util.Arrays;

public class TestSinhVien {
    public static void main(String[] args) {
        SinhVien sinhVien1 = new SinhVien(100,"nguyễn văn D","c11 g21",10);
        SinhVien sinhVien2 = new SinhVien(150,"hồ thanh A","c11 g1",9);
        SinhVien sinhVien3 = new SinhVien(200,"hồ thanh p","c11 g19",8);
    SinhVien[] s_v1 = {sinhVien1,sinhVien2,sinhVien3};
        System.out.println("ban đầu "+Arrays.toString(s_v1));
        Arrays.sort(s_v1);
        System.out.println("lúc sau" + Arrays.toString(s_v1));
        System.out.println("tìm kiếm tâm" + Arrays.binarySearch(s_v1,sinhVien1));
    }
}
