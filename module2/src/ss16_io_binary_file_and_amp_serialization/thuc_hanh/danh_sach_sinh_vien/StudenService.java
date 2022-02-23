package ss16_io_binary_file_and_amp_serialization.thuc_hanh.danh_sach_sinh_vien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudenService {
    private static final String pathFile = "src/ss16_io_binary_file_and_amp_serialization/thuc_hanh/danh_sach_sinh_vien/SinhVien.csv";
private  List<Student>studentList= new ArrayList<>();
public void Add (){
    Scanner sc = new Scanner(System.in);
    System.out.println("nhập id");
    int id = Integer.parseInt(sc.nextLine());
    System.out.println("nhập name");
    String name = sc.nextLine();
    System.out.println("nhập address");
    String address = sc.nextLine();
    Student student = new Student(id,name,address);
    studentList.add(student);
    ReaderWriteFile.writeStudent(studentList,pathFile);
}
public void display(){
    List<Student> studentList1 = ReaderWriteFile.readerStudent(pathFile);
    for (Student element :studentList1) {
        System.out.println(element);
    }

}

}
