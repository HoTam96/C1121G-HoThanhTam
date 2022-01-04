package LuyenTapONha.phuong_tien_di_chuyen;

public class test {
    public static void main(String[] args) {
HangSanXuat hang1 = new HangSanXuat("trường hải","việt nam");
HangSanXuat hang2 = new HangSanXuat("toyota","nhật bản");
HangSanXuat hang3 = new HangSanXuat("yammaha","hàn quốc");

PhuongTienDiChuyen vihicle1 = new MayBay(hang1,"jetA1");
PhuongTienDiChuyen vihicle2 = new XeOTo(hang2,"xăng95");
PhuongTienDiChuyen vihicle3 = new XeDap(hang3);
MayBay mayBay = new MayBay(hang1,"jetA1");


       vihicle1.layTenHangSanXuat();

       vihicle2.batDau();
       vihicle3.tangToc();
       vihicle1.dungLai();
        System.out.println(  vihicle1.layVanToc());

        mayBay.catCanh();
        mayBay.haCanh();

        vihicle2.layVanToc();
        vihicle3.layVanToc();

vihicle3.layTenHangSanXuat();
        System.out.println(vihicle3.getHangSanXuat().getTenQuocGia());
    }
}
