package tthi_modum2.ultill;

import tthi_modum2.model.BenhAn;
import tthi_modum2.model.BenhAnThuong;
import tthi_modum2.model.BenhAnVip;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadandWriteFile {
    public static void writeFileCsv(List<BenhAn> benhAnList, String pathFile, boolean append) {
        List<String> strings = new ArrayList<>();
        for (BenhAn element : benhAnList) {
            strings.add(element.getThongTin());
        }
        writeFile(strings, pathFile, append);
    }

    public static void writeFile(List<String> stringList, String pathFile, boolean append) {
        File file = new File(pathFile);
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String element : stringList) {
                bufferedWriter.write(element);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //đọc file
    public static List<BenhAn> readerFile(String pathFile) {
        List<BenhAn> benhAnList = new ArrayList<>();
        File file = new File(pathFile);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] arr;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                if (arr.length == 8) {
                   BenhAn benhAnThuong = new BenhAnThuong(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],Double.parseDouble(arr[7]));
                benhAnList.add(benhAnThuong);
                } else {
                   BenhAn benhAnVip = new BenhAnVip(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8]);
                benhAnList.add(benhAnVip);
                }
            }
            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return benhAnList;
    }

}
