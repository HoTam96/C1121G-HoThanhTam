package LuyenTapONha.quan_li_danh_sach_sinh_vien;

import LuyenTapONha.quan_li_sinh_vien.SinhVien;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVienLan2 {

    private static ArrayList<SinhVienONha> listDanhSach=new ArrayList<>();
    static {
        SinhVienONha sinhVienONha = new SinhVienONha("001","tú",2003,8.5);
        SinhVienONha sinhVienONha1 = new SinhVienONha("002","tâm",2003,8.5);
        SinhVienONha sinhVienONha2= new SinhVienONha("003","quang",2003,8.5);
    listDanhSach.add(sinhVienONha);
    listDanhSach.add(sinhVienONha1);
    listDanhSach.add(sinhVienONha2);

    }



    public DanhSachSinhVienLan2() {
        this.listDanhSach = new ArrayList<SinhVienONha>();
    }

    public DanhSachSinhVienLan2(ArrayList<SinhVienONha> listDanhSach) {
        this.listDanhSach = listDanhSach;
    }

    public ArrayList<SinhVienONha> getListDanhSach() {
        return listDanhSach;
    }

    public void setListDanhSach(ArrayList<SinhVienONha> listDanhSach) {
        this.listDanhSach = listDanhSach;
    }

    //    thêm sinh viên
    public void add(SinhVienONha sinhVien) {
        this.listDanhSach.add(sinhVien);
    }

    //    in danh sách sinh viên
    public void in() {
        for (SinhVienONha sinhVien : listDanhSach) {
            System.out.println(sinhVien);

        }
    }

    //kiểm tra danh sách có rỗng hay không
    public boolean kiemTraDanhSach() {
        return this.listDanhSach.isEmpty();
    }

    //lấy số lượng sinh viên trong danh sách
    public int laysoluongsinhvientrongdanhsach() {
        return this.listDanhSach.size();
    }

    //làm rỗng danh sách sinh viên
    public void remove() {
        this.listDanhSach.removeAll(listDanhSach);
    }

    //    xóa sinh viên khỏi danh sách dựa vào mã sinh viên
    public boolean xoaDuaVaoMaSinhVien(SinhVienONha sinhVienONha) {
        return this.listDanhSach.remove(sinhVienONha);

    }

    public boolean kiemTraSinhViencoTonTai(SinhVienONha sinhVienONha) {
        return listDanhSach.contains(sinhVienONha);
    }

    //    8. Tìm kiếm sinh viên dựa theo tên
    public void timKiemTheoTen(String ten) {
        for (SinhVienONha sinhVien : listDanhSach) {
            if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
                System.out.println(sinhVien.getHoVaTen());
            }
        }
    }

    //xuất ra màn hình sinh viên có điểm từ cao đến thâp
    public void sapXepDiemGiamDantangdan() {
        Collections.sort(this.getListDanhSach(), new Comparator<SinhVienONha>() {
                    @Override
                    public int compare(SinhVienONha o1, SinhVienONha o2) {
                        if (o1.getDiemTrungBinh() > o2.getDiemTrungBinh()) {
                            return -1;
                        } else if (o1.getDiemTrungBinh() < o2.getDiemTrungBinh()) {
                            return 1;

                        } else {
                            return 0;
                        }
                    }
                }
        );
    }

    public void luuFile(File file2) {
        try {
            OutputStream op = new FileOutputStream(file2);
            ObjectOutputStream oos = new ObjectOutputStream(op);
            for (SinhVienONha sv:listDanhSach) {
                oos.writeObject(sv);
            }
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void docghifile(File file) throws IOException, ClassNotFoundException {
//        đọc 1 đối tượng
//        InputStream is = new FileInputStream(file);
//        ObjectInputStream ois = new ObjectInputStream(is);
//SinhVienONha sv = (SinhVienONha) ois.readObject();
//        System.out.println(sv);
//        ois.close();

//        đọc 1 list danh sách
        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        SinhVienONha sv1 = null;
        for (SinhVienONha svien :listDanhSach) {
            while (true){
                Object oj = ois.readObject();
                if (oj==null){
                    break;
                }
                else if (oj!=null){
                    sv1 = (SinhVienONha) oj;



                }
            }
        }


    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
// lưu 1 đối tượng xuống file
//        try {
//            File file1 = new File("D:\\codegym\\codegymC1121G1\\modum2\\tamday\\tuanday\\tam.txt");
//            OutputStream outputStream = new FileOutputStream(file1);
//            ObjectOutputStream oos = new ObjectOutputStream(outputStream);
//            SinhVienONha sinhVienONha = new SinhVienONha("001", "hồ thanh tam", 1996, 10);
//            oos.writeObject(sinhVienONha);
//            oos.flush();
//            oos.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
DanhSachSinhVienLan2 danhSachSinhVienLan2 = new DanhSachSinhVienLan2();
        File file2 = new File("D:\\codegym\\codegymC1121G1\\modum2\\tamday\\tuanday\\hothanhtam.txt");
//        SinhVienONha sinhVienONha = new SinhVienONha("001","tâm",1992,9);
//        danhSachSinhVienLan2.add(sinhVienONha);
//danhSachSinhVienLan2.luuFile(file2);

danhSachSinhVienLan2.docghifile(file2);

    }

}
