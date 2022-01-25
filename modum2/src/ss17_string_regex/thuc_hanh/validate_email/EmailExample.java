package ss17_string_regex.thuc_hanh.validate_email;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Matcher matcher1;

    public static boolean validate(String email) {
        String Email_regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        boolean str = email.matches(Email_regex);
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 email");
        String email = sc.nextLine();
        boolean a = validate(email);
        System.out.println(a);
    }
}
