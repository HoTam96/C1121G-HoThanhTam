package LuyenTapONha.collection.stack;

import java.util.Scanner;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stackChuoi = new Stack<String>();
        System.out.println("nhập vào một chuổi");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            stackChuoi.push(s.charAt(i)+"");
        }
        System.out.println("chuổi mới là: "+stackChuoi);
        System.out.println("chuổi đảo ngược");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stackChuoi.pop());
        }
        System.out.println("chuổi mới là: "+stackChuoi);



    }
}
