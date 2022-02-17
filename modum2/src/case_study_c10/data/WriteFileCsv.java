package case_study_c10.data;

import case_study_c10.models.Product;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// mehtod tái sử dụng
public class WriteFileCsv {
    public static void writeFileCsv(List<Product> productList, String pathFile, boolean append) {
        List<String> strings = new ArrayList<>();
        for (Product element : productList) {
            strings.add(element.getInForProduct());
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
}
