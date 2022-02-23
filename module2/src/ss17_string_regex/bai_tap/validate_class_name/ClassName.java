package ss17_string_regex.bai_tap.validate_class_name;

import java.util.Scanner;

public class ClassName {


    public static boolean checkName(String name) {
        String regex = "^[CAP]\\d{4}[GHIKLM]$";
        boolean check = name.matches(regex);
        return check;
    }

    public static void main(String[] args) {
        boolean check;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhập tên cần kiểm tra");
            String name = sc.nextLine();
            check = checkName(name);
            System.out.println("name: " + name + "là hợp lệ true hay false: " + check);
        } while (!check);

    }
}
