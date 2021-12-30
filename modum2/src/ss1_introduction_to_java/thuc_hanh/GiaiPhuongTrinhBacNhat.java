package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("phương trình bậc nhất");
        System.out.println("phương trình bậc nhất có dạng 'a * x + b = 0', vui lòng nhập vào hằng số:");
        Scanner data = new Scanner(System.in);
        System.out.println("a: ");
        int a = data.nextInt();
        System.out.println("b: ");
        int b = data.nextInt();

        if (a != 0) {
            double nghiem = -b / a;
            System.out.println("phương trình có nghiệm duuy nhất: x= " + nghiem);
        }
        else {
            if (b==0){
                System.out.println("phương trình có vô số nghiệm");
            }
            else {
                System.out.println("phương trình vô nghiêm");
            }
        }

    }
}
