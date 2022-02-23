package ss11_bai_tap_00P_quan_li_phuong_tien.module.until;

import ss11_bai_tap_00P_quan_li_phuong_tien.module.module.HangSanXuat;
import ss11_bai_tap_00P_quan_li_phuong_tien.module.module.OTo;
import ss11_bai_tap_00P_quan_li_phuong_tien.module.module.XeMay;
import ss11_bai_tap_00P_quan_li_phuong_tien.module.module.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class  WriteReaderFile {
    public static void writeFileOTo(String path, List<OTo> oToList, boolean append) {
        List<String> stringList = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists()) {
                System.out.println("không tìm thấy file");
            }
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (OTo element : oToList) {
                stringList.add(element.getInfoCsv());
            }
            writeFileString(path, stringList, append);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writeFileXeTai(String path, List<XeTai> xeTaiList, boolean append) {
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (XeTai element : xeTaiList) {
                stringList.add(element.getInFoXeTai());
                bufferedWriter.newLine();
            }
            writeFileString(path, stringList, append);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void writeFileXeMay(String path, List<XeMay> xeMayList, boolean append) {
        List<String> stringList = new ArrayList<>();
//        File file = new File(path);
//        try {
//            FileWriter fileWriter = new FileWriter(file, append);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (XeMay element : xeMayList) {
                stringList.add(element.getInFoXeMay());
            }
            writeFileString(path, stringList, append);

//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }

    //    method tái sử dụng
    private static void writeFileString(String path, List<String> stringList, boolean append) {

        try {
            File file = new File(path);
            if (!file.exists()) {
                System.out.println("file không tồn tại");
            }
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String element : stringList) {
                bufferedWriter.write(element);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    //đọc file
    public static List<OTo> readerFile(String pathFile) {
        List<OTo> oToList = new ArrayList<>();

        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                throw new IllegalArgumentException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = " ";
            String[] arr;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                HangSanXuat hangSanXuat = new HangSanXuat(arr[1]);
                OTo oTo = new OTo(arr[0], hangSanXuat, Integer.parseInt(arr[2]), arr[3], Integer.parseInt(arr[4]), arr[5]);
                oToList.add(oTo);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return oToList;

    }
    public static List<XeMay> xeMayReaderFiel(String path)  {
        List<XeMay>xeMayList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String [] arr;
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                HangSanXuat hangSanXuat = new HangSanXuat(arr[1]);
                XeMay xeMay = new XeMay(arr[0],hangSanXuat,Integer.parseInt(arr[2]),arr[3],Float.parseFloat(arr[4]));
                xeMayList.add(xeMay);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
return xeMayList;
    }

}


