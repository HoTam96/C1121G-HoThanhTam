package LuyenTapONha.folder;

import java.io.File;
import java.io.IOException;

public class test {
    public static void xoaFile(File file){
        if (file.isFile()){
            file.delete();
        }else if (file.isDirectory()){
            File[]arrayFile = file.listFiles();
            for (File fx: arrayFile) {
                System.out.println("haha");
            }
//            xóa bản thân thư mục sau khi đã xóa các file con.
            file.delete();
        }
    }



    public static void main(String[] args) throws IOException {
        File folder = new File("D:\\codegym\\codegymC1121G1\\modum2");
        System.out.println(folder.exists());
//        tạo thư mục: 1 thư mục ta dùng mkdir.

        File d1 = new File("D:\\codegym\\codegymC1121G1\\modum2\\tamho_5\\tamho9\\tamho4\\vidu2.txt");
        //        file1.createNewFile(); // tạo file
//tạo nhiều thư mục cùng 1 lúc .
//        d1.mkdirs();
//        File file1 = new File("D:\\codegym\\codegymC1121G1\\modum2\\tamho_7\\tam1\\tam2\\tam3");
//        File file2 = new File("D:\\codegym\\codegymC1121G1\\modum2\\tamh1\\tam5\\tam6\\tam7");
//        File file3 = new File("D:\\codegym\\codegymC1121G1\\modum2\\tamh2\\tam5\\tam6\\tam7");
//
//        file1.mkdirs();
//        file2.mkdirs();
//        file3.mkdirs();

//xóa file thông qua đường dẫn ( xoas vị trí cuối cùng ko có thu mục khác bên trong
        File tamho_7 = new File("D:\\codegym\\codegymC1121G1\\modum2\\tamho_1");
//        tamho_7.deleteOnExit();

//xóa file ngoài hệ thống.
//        File filengoaihethong = new File("C:\\Users\\Admin\\Downloads\\TaiLieuTrienKhaiLopC1121G1\\c.");
//filengoaihethong.deleteOnExit();

xoaFile(tamho_7);

    }

}
