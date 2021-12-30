package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("nhập vào tháng muốn hiển thị");
        int month = data.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng "+month + " có 31 ngày");
                 break;
            case 2:
                System.out.println("có 28 hoặc 29 ngày phụ thuộc vào năm bn muốn kiểm tra");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tháng "+ month+"có 30 ngày");
            default:
                System.out.println("cần nhập đúng tháng muốn kiểm tra");
        }

    }
}
