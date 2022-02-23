package case_study_c08.ultill;

import case_study.data.validate.TotalValidate;
import case_study_c08.models.NganHang;
import case_study_c08.models.TaiKhoanThanhToan;
import case_study_c08.models.TaiKhoanTietKiem;
import casetudy_c09.model.DienThoai;
import casetudy_c09.model.DienThoaiChinhHang;
import casetudy_c09.model.DienThoaiXachTay;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderWriteFileC08 {

    public static void writeFileCsv(List<NganHang> nganHangList, String pathFile, boolean append) {
        List<String> strings = new ArrayList<>();
        for (NganHang element : nganHangList) {
            strings.add(element.getInFor());
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
    public static List<NganHang> readerFile(String pathFile) {
        List<NganHang> nganHangList = new ArrayList<>();
        File file = new File(pathFile);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] arr;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                if (arr.length == 6) {
                    NganHang nganHang = new TaiKhoanThanhToan(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], Double.parseDouble(arr[5]));
                    nganHangList.add(nganHang);
                } else {
                    NganHang nganHang = new TaiKhoanTietKiem(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], Double.parseDouble(arr[4]), arr[5], Double.parseDouble(arr[6]), Integer.parseInt(arr[7]));
                    nganHangList.add(nganHang);
                }

            }

            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return nganHangList;
    }
}
