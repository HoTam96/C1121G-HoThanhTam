package LuyenTapONha.QuanLiRapPhim;

public class test {
    public static void main(String[] args) {


        NgayChieu ngayChieu = new NgayChieu(12, 2, 2019);
        NgayChieu ngayChieu1 = new NgayChieu(13, 3, 2019);
        NgayChieu ngayChieu2 = new NgayChieu(14, 4, 2019);

        HangSanXuat hangSanXuat = new HangSanXuat("disny", "singapo");
        HangSanXuat hangSanXuat1 = new HangSanXuat("phương nam", "vietnam");
        HangSanXuat hangSanXuat2 = new HangSanXuat("hồng kong", "china");

        BoPhim boPhim = new BoPhim("đất phương nam", 2001, hangSanXuat, 180000, ngayChieu);
        BoPhim boPhim1 = new BoPhim("cánh đồng bất tận", 2002, hangSanXuat1, 180000, ngayChieu);
        BoPhim boPhim2 = new BoPhim("chiến tranh", 2003, hangSanXuat2, 280000, ngayChieu);

        if (boPhim.checkGiaVe(boPhim2)) {
            System.out.println("giá vé của " + boPhim.getTenPhim() + " re hơn so với " + boPhim2.getTenPhim());

        } else {
            System.out.println("giá vé của " + boPhim.getTenPhim() + " đắt hơn so với " + boPhim2.getTenPhim());
        }

//        System.out.println( "thên hảng phim là:"+ boPhim.hienThiTenHangPhim());
        System.out.println(boPhim.getHangSanXuat10().getTenHangPhimm());



    }
}
