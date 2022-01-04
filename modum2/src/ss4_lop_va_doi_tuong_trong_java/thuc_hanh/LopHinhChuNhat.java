package ss4_lop_va_doi_tuong_trong_java.thuc_hanh;

import java.util.Scanner;

public class LopHinhChuNhat {
    private double width;
    private double height;


    public LopHinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area (){
        return this.width * this.height;
    }
    public double perimeter (){
        return (this.width+this.height)/2;
    }
    public void displayarea(){
        System.out.println("diện thích hình chữ nhật là: "+ this.area());
        System.out.println("chu vi hình chữ nhật là: "+ this.perimeter());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập chiều dài ");
        double width = Double.parseDouble(sc.nextLine());
        System.out.println("nhập chiều rộng");
        double height = Double.parseDouble(sc.nextLine());

        LopHinhChuNhat lopHinhChuNhat = new LopHinhChuNhat(width,height);
        lopHinhChuNhat.displayarea();
    }

}
