package case_study_c10.data;

import case_study_c10.models.ExportProduct;
import case_study_c10.models.ImportedProduct;
import case_study_c10.models.Product;
import case_study_c10.product.impl.ExportProductImpl;
import case_study_c10.product.impl.ImportProductImpl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderFileCsv {
    public static List<Product> readerFile(String pathFile) {
        List<Product> productList = new ArrayList<>();
        File file = new File(pathFile);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] arr;
            if (pathFile.equals(ExportProductImpl.PATH_EXPORT)) {
                while ((line = bufferedReader.readLine()) != null) {
                    arr = line.split(",");
                    ExportProduct exportProduct = new ExportProduct(Integer.parseInt(arr[0]), arr[1],
                            arr[2], Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5],
                            Double.parseDouble(arr[6]), arr[7]);
                    productList.add(exportProduct);
                }
            } else if (pathFile.equals(ImportProductImpl.PATH_IMPORT)) {
                while ((line = bufferedReader.readLine()) != null) {
                    arr = line.split(",");
                    ImportedProduct importedProduct = new ImportedProduct(Integer.parseInt(arr[0]), arr[1],
                            arr[2], Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], Double.parseDouble(arr[6]), arr[7], Double.parseDouble(arr[8]));
                    productList.add(importedProduct);
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
