package ss17_string_regex.bai_tap.validate_phone;

import java.util.Scanner;

public class NumberPhone {

    public static boolean checkPhone(String phone) {
        String regex = "^\\d{2}\\-\\d{10}$";
        boolean phoneRegex = phone.matches(regex);
        return phoneRegex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check;
        do {
            System.out.println("nhập vào số điện thoại cần check");
            String phone = sc.nextLine();
            check = checkPhone(phone);
            System.out.println("number phone: " + phone + "là hợp lệ true or false: " + check);
        } while (!check);


    }
}
