package case_study.module.data.write_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileCsv {


//    ghi file trinh do
    public static void writeTrinhDo(List<String>list,String pathFile,Boolean append){
        writeFileString(list,pathFile,append);
    }
    public static void writeViTri(List<String>list,String pathFile,Boolean append){
        writeFileString(list,pathFile,append);
    }

//    method tái sử dụng
    public static void writeFileString(List<String>stringList, String pathFile,Boolean append){

        FileWriter fileWriter = null;
        try {
            File file = new File(pathFile);
            if (!file.exists()){
                System.out.println("dmc");
            }
            fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String element:stringList) {
                bufferedWriter.write(element);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
