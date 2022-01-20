package LuyenTapONha.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestReget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strTest = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\d{2}[-|/]\\d{2}[-|/]\\d{4}");
        Matcher matcher = pattern.matcher(strTest);
        while(matcher.find()) {
            System.out.println(strTest.substring(matcher.start(), matcher.end()));
        }

//        System.out.println(strTest);


//        for (String element :strTest) {
//            System.out.println("chuổi "+ element +" kiểm tra chuổi: "+ element.matches(".*[a-zA-z].*"));
//        }
//        for (String element : strTest) {
//            System.out.println("chuổi "+ element + " kiểm tra chuổi "+ element.matches(".*[0-9].*"));
//        }


    }

}