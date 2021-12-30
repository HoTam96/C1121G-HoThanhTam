package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào tỉ giá hiện tai của đồng dola so với VND");
        float rate = Float.parseFloat(sc.nextLine());
        System.out.println("nhập số tiền dola ");
        float dolla = Float.parseFloat(sc.nextLine());
        float vnd = rate * dolla;
        System.out.println("số tiền được chuyển đổi là: "+vnd);
    }
}
