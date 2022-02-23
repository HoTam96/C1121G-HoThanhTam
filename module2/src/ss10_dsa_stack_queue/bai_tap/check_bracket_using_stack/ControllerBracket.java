package ss10_dsa_stack_queue.bai_tap.check_bracket_using_stack;

import java.util.Scanner;

public class ControllerBracket {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập vào biểu thức cần kiểm tra");
        String data = sc.nextLine();
        CheckBracKet checkBracKet = new CheckBracKet();
        checkBracKet.checkBreak(data);
    }
}
