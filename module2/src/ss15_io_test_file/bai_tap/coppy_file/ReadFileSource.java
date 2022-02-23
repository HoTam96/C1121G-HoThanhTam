package ss15_io_test_file.bai_tap.coppy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadFileSource {
    private static final String PATH = "src/ss15_io_test_file/bai_tap/coppy_file/data.csv";
    private static final String PATH1 = "src/ss15_io_test_file/bai_tap/coppy_file/count.csv";
    private static ArrayList<String>arrayList = new ArrayList<>();

    public static String[] readFileData(String path) {
        int count =0;
        String[] arr = new String[0];
        try {

            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            int character;
            String temp = "";
            while ((character = fileReader.read()) != -1) {
                temp += (char) character;
            }
            fileReader.close();
            temp =  temp.trim();
           temp=  temp.replaceAll("\\s+","");

             arr = temp.split("\n");
            System.out.println(Arrays.toString(arr));

            for (String element :arr) {
                count+=element.length();
            }
            System.out.println(count);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

return arr;

    }
    public  static void writeFile(String path,String[] arr,boolean append){
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(arr);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
      String[] result =   readFileData(PATH);
      writeFile(PATH1,result,true);

    }

}
