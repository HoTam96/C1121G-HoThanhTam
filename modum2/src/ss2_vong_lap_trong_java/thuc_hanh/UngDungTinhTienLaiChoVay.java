package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số tiền muốn gửi");
        double tienGui = Double.parseDouble(sc.nextLine());
        System.out.println("nhập số tháng muốn gửi");
        double thangGui = Double.parseDouble(sc.nextLine());
        System.out.println("nhập lãi xuất");
        double laiSuat = Double.parseDouble(sc.nextLine());
//lãi xuất từng tháng
      double tongLaiXuat=0;
      for (int i=0;i<thangGui;i++){
          tongLaiXuat+=tienGui*(laiSuat/100)/12*thangGui;
          tienGui+=tongLaiXuat;
      }
    }
}
