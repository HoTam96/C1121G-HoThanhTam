package ss17_string_regex.thuc_hanh.validate_count;

import java.util.Scanner;

public class AccountExample {
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static boolean checkAccount(String account) {
        String acCountRegex = "^[a-z0-9_]{6,}$";
        boolean check = account.matches(acCountRegex);
        return check;
    }

    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("nhập vào tài khoản");
//        String acCount = sc.nextLine();
//        System.out.println(checkAccount(acCount));
        for (String account : validAccount) {
            boolean isvalid = checkAccount(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = checkAccount(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }

    }

}
