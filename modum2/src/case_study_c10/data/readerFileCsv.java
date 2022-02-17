package case_study_c10.data;

import case_study_c10.models.ExportProduct;
import case_study_c10.models.ImportedProduct;
import case_study_c10.product.impl.ExportProductImpl;
import case_study_c10.product.impl.ImportProductImpl;

import java.io.*;

public class readerFileCsv {
    public static void readerFile(String pathFile) {
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
                }
            } else if (pathFile.equals(ImportProductImpl.PATH_IMPORT)) {
                while ((line = bufferedReader.readLine()) != null) {
                    arr = line.split(",");
                    ImportedProduct importedProduct = new ImportedProduct(Integer.parseInt(arr[0]), arr[1],
                            arr[2], Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], Double.parseDouble(arr[6]), arr[7], Double.parseDouble(arr[8]));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
