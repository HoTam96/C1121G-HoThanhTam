package ss15_io_test_file.bai_tap.doc_File_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Quocgia> readFile(String pathFile){
        List<Quocgia>quocgiaList= new ArrayList<>();

        try {
            File file = new File(pathFile);
            if (!file.exists()){
                throw new IllegalArgumentException("không tìm thấy file");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            String line ="";
            String [] arr;

            while ((line = bufferedReader.readLine())!=null){
                arr = line.split(",");
                Quocgia quocgia = new Quocgia(Integer.parseInt(arr[0]),arr[1],arr[2]);
                quocgiaList.add(quocgia);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
return quocgiaList;
    }

    public static void main(String[] args) {
        List<Quocgia>quocgiaList=readFile("src/ss15_io_test_file/bai_tap/doc_File_csv/List.csv");
        for (Quocgia element:quocgiaList) {
            System.out.println(element);
        }
    }
}
