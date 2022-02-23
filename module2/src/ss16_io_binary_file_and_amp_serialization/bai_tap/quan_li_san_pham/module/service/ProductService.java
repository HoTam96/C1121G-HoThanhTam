package ss16_io_binary_file_and_amp_serialization.bai_tap.quan_li_san_pham.module.service;

import ss16_io_binary_file_and_amp_serialization.bai_tap.quan_li_san_pham.module.module.Product;
import ss16_io_binary_file_and_amp_serialization.bai_tap.quan_li_san_pham.view.until.ReaderWriteFileProducrt;
import ss16_io_binary_file_and_amp_serialization.thuc_hanh.danh_sach_sinh_vien.ReaderWriteFile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService  {
//    private static List<Product>productList= new ArrayList<>();
    private static final String PathFile = "src/ss16_io_binary_file_and_amp_serialization/bai_tap/quan_li_san_pham/view/until/FileProduct.csv";

    public void add (){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập  coede ");
        String code = sc.nextLine();
        System.out.println("nhập id ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập name ");
        String name = sc.nextLine();
        System.out.println("nhập hãng sản xuất ");
        String hangsanxuat = sc.nextLine();
        System.out.println("nhập gía");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println(" nhập thông thông khác");
        String other = sc.nextLine();

        Product product = new Product(code,id,name,hangsanxuat,price,other);
        List<Product>productList=ReaderWriteFileProducrt.readerProduct(PathFile);
        productList.add(product);
        ReaderWriteFileProducrt.writeProduct(productList,PathFile);
    }
    public void display(){
        List<Product>productList = ReaderWriteFileProducrt.readerProduct(PathFile);
        for (Product element :productList) {
            System.out.println(element);
        }
    }
    public void find(String name){
        List<Product>productList = ReaderWriteFileProducrt.readerProduct(PathFile);
        for (Product element : productList) {
            System.out.println(element.getProductName().contains(name));
        }

    }
}