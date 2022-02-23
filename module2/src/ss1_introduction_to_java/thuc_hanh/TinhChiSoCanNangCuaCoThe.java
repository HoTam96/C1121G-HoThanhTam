package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class TinhChiSoCanNangCuaCoThe {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("nhập vào cân nặng của bạn");
        double weight = data.nextDouble();
        System.out.println("nhâp vào chiều cao của bn");
        double height = data.nextDouble();
        double BMI = weight/ Math.pow(height,2);
        if (BMI>=30){
            System.out.println("obese");
        }
       else if (BMI>=25){
            System.out.println("overWeight");
        }
       else if (BMI>=18.5){
            System.out.println("normal");
        }
       else {
            System.out.println("underweight");
        }
    }
}
