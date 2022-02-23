package casetudy_c09.view.ultill;

import case_study.data.validate.TotalValidate;
import case_study_c10.models.ExportProduct;
import case_study_c10.models.ImportedProduct;
import case_study_c10.models.Product;
import case_study_c10.product.impl.ExportProductImpl;
import case_study_c10.product.impl.ImportProductImpl;
import casetudy_c09.model.DienThoai;
import casetudy_c09.model.DienThoaiChinhHang;
import casetudy_c09.model.DienThoaiXachTay;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RederWriteFileC09csv {

    public static void writeFileCsv(List<DienThoai> dienThoaiList, String pathFile, boolean append) {
        List<String> strings = new ArrayList<>();
        for (DienThoai element : dienThoaiList) {
            strings.add(element.getInForPhone());
        }
        writeFile(strings,pathFile,append);
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
    public static List<DienThoai> readerFile(String pathFile) {
        List<DienThoai> productList = new ArrayList<>();
        File file = new File(pathFile);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] arr;
                while ((line = bufferedReader.readLine()) != null) {
                    arr = line.split(",");
                 if (arr[5].matches(TotalValidate.REGEX_SO)){
                     DienThoai dienThoai = new DienThoaiChinhHang(Integer.parseInt(arr[0]),arr[1],Double.parseDouble(arr[2]),
                             Integer.parseInt(arr[3]),arr[4],Integer.parseInt(arr[5]),arr[6]);
                     productList.add(dienThoai);
                 }else {
                     DienThoai dienThoai = new  DienThoaiXachTay(Integer.parseInt(arr[0]),arr[1],Double.parseDouble(arr[2]),
                             Integer.parseInt(arr[3]),arr[4],arr[5],arr[6]);
                     productList.add(dienThoai);

                 }

                }

            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return productList;
    }
}
