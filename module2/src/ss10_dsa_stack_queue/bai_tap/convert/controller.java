package ss10_dsa_stack_queue.bai_tap.convert;

import java.util.Scanner;

public class controller {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập vào số muốn chuyển đổi ra hệ nhị phân");
        int data = sc.nextInt();
        ConvertFromDecimalToBinaryService converts = new ConvertFromDecimalToBinaryService();
     converts.convert(data);
    }
}
