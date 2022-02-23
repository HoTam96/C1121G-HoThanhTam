package LuyenTapONha.QuanLiThuVien;

public class test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(15,12,2009);
        Ngay ngay2 = new Ngay(16,10,2008);
        Ngay ngay3 = new Ngay(17,9,2007);

        TacGia tacGia1 = new TacGia("hồ thanh tâm",ngay1);
        TacGia tacGia2 = new TacGia("hồ thanh tú",ngay2);
        TacGia tacGia3 = new TacGia("hồ thanh quang",ngay3);

        Sach sach1 = new Sach("rừng xà nu",2000,2001,tacGia1);
        Sach sach2 = new Sach("qua đèo ngang",5000,2001,tacGia2);
        Sach sach3 = new Sach("bánh trôi nước",8000,2003,tacGia3);

sach1.inSach();
sach2.inSach();
sach3.inSach();

        System.out.println(sach1.checkNXB(sach2));
        System.out.println("giá tiền sau khi giảm của s1 là: "+sach1.giaSauKhiGiam(10));
        System.out.println("giá tiền sau khi giảm cẩu s2 là: "+sach2.giaSauKhiGiam(20));
        System.out.println("giá tiền sau khi giảm của s3 là: "+sach3.giaSauKhiGiam(30));


    }
}
