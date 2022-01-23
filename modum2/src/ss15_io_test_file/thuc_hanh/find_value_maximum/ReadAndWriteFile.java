package ss15_io_test_file.thuc_hanh.find_value_maximum;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteFile {
    public static final String PATHFILE = ("src/ss15_io_test_file/thuc_hanh/find_value_maximum/find.csv");
    public static final String PATHFILE1 = ("src/ss15_io_test_file/thuc_hanh/find_value_maximum/writeFile.csv");
private static ArrayList<Integer>arrayList=new ArrayList<>();

    public static Integer readFile(String path) {
        int max=0;

        try {
            File file = new File(path);
            if (!file.exists()){
                throw new FileNotFoundException("đường đãn ko tồn tại");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";

            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                } else {
                    arrayList.add(Integer.parseInt(line));
                }
            }
            bufferedReader.close();
            System.out.println(arrayList);
            max = arrayList.get(0);
            for (int i =1;i<arrayList.size();i++){
                if (max<arrayList.get(i)){
                    max = arrayList.get(i);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("số nó là"+ max);
return max;

    }
    public static void writeFile(String file,int max, Boolean append){
        File file1 = new File(file);
        try {
            FileWriter fileWriter = new FileWriter(file1,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("số lớn nhất đọc được từ file find là: "+ max);
//            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
       int max =  readFile(PATHFILE);
        writeFile(PATHFILE1,max,true);

    }
}
