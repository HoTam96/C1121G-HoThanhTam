package ss15_io_test_file.thuc_hanh.calculate_number_sum_of_file_text;

import java.io.*;

public class ReadFileText {
    private static final String PATHFILE = "src/ss15_io_test_file/thuc_hanh/calculate_number_sum_of_file_text/sum.csv";

    public static void readFileText(String pathFile) {
        try {
            File file = new File(pathFile);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line  = "";
            int sum =0;
            while (true) {
                if ((line= bufferedReader.readLine()) == null) {
                    break;
                } else {
                    sum += (Integer.parseInt(line));
                }
            }
            bufferedReader.close();
            System.out.println("tổng các số trong file là: " + sum);

        } catch (IOException e) {
            System.out.println("lỗi ");
        }

    }

    public static void main(String[] args) {
        readFileText(PATHFILE);
    }


}
