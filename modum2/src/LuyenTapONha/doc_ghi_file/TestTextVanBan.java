package LuyenTapONha.doc_ghi_file;

import javax.sound.sampled.Line;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class TestTextVanBan {


    public static void main(String[] args)  {


        File file = new File("D:\\codegym\\codegymC1121G1\\modum2\\helllo\\tuandayy\\tammmm.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("haha");




//        file.mkdirs();
//        file.deleteOnExit();

//        PrintWriter printWriter = new PrintWriter("D:\\codegym\\codegymC1121G1\\modum2\\tamday\\tuanday\\tam.txt");
//        printWriter.println("xin chào mimh là tâm đây");
//        printWriter.println("rất vui đươc lm quen. sau đây mình có bài toán: ");
//printWriter.println(2+3);
//printWriter.print(2);
//printWriter.println(2.4);
//        printWriter.print(2);
//        printWriter.println(" xin chòa các bạn");
//printWriter.flush();
//printWriter.close();
//cánh 1 : đọc văn bản dùng dorech
//        List<String>alltext= Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
//        for (String element:alltext) {
//            System.out.println(element);
//        }
//        BufferedReader br = Files.newBufferedReader(file.toPath(),StandardCharsets.UTF_8);
//String line = null;
//while (true){
//    line = br.readLine();
//    if (line ==null){
//break;
//    }
//    else {
//        System.out.println(line);
//    }
//}

    }

}
