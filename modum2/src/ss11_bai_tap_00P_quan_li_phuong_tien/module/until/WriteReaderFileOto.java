package ss11_bai_tap_00P_quan_li_phuong_tien.module.until;

import ss11_bai_tap_00P_quan_li_phuong_tien.module.module.HangSanXuat;
import ss11_bai_tap_00P_quan_li_phuong_tien.module.module.OTo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReaderFileOto {
    public static void writeFile(String Path,List<OTo>oToList, boolean append){


        try {
            File file = new File(Path);
            if(!file.exists()){
                throw new FileNotFoundException("không tìm thấy file");
            }
            FileWriter fileWriter = new FileWriter(file,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (OTo element :oToList) {
                bufferedWriter.write(element.getInfoCsv());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static List<OTo> readerFile(String pathFile){
        List<OTo>oToList= new ArrayList<>();

        try {
            File file = new File(pathFile);
            if (!file.exists()){
                throw new IllegalArgumentException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = " ";
            String [] arr ;
            while ((line= bufferedReader.readLine())!=null){
               arr = line.split(",");
               HangSanXuat hangSanXuat = new HangSanXuat(arr[1]);
               OTo oTo = new OTo(arr[0],hangSanXuat,Integer.parseInt(arr[2]),arr[3],Integer.parseInt(arr[4]),arr[5]);
               oToList.add(oTo);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return oToList;

    }
}
