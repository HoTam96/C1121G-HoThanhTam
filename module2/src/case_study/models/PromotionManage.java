//package case_study.models;
//
//public class PromotionManage implements Comparable<PromotionManage> {
//    private int yearUse;
//    private Booking data;
//
//    public PromotionManage(int yearUse, Booking data) {
//        this.yearUse = yearUse;
//        this.data = data;
//    }
//
//    public PromotionManage() {
//    }
//
//    public PromotionManage(int yearUse) {
//        this.yearUse = yearUse;
//    }
//
//    public int getYearUse() {
//        return yearUse;
//    }
//
//    public void setYearUse(int yearUse) {
//        this.yearUse = yearUse;
//    }
//
//    public Booking getData() {
//        return data;
//    }
//
//    public void setData(Booking data) {
//        this.data = data;
//    }
//
//    @Override
//    public String toString() {
//        return "PromotionManage{" +
//                "yearUse=" + yearUse +
//                ", Mã BooKing=" + data.getMaBooking() +
//                ", Mã Khach Hang=" + data.getMaKhachHang() +
//                ", Loại Dịch Vu=" + data.getLoaiDichVu() +
//                ",Tên Dịch vụ=" + data.getTenDichVu() +
//                '}';
//    }
//
//    @Override
//    public int compareTo(PromotionManage o) {
//       return data.getMaBooking().compareTo(o.data.getMaBooking());
//    }
//}
