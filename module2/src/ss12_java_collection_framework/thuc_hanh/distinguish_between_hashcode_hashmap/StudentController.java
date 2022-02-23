package ss12_java_collection_framework.thuc_hanh.distinguish_between_hashcode_hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StudentController {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Student student1 = new Student("a", 14, "quảng nam");
        Student student2 = new Student("b", 16, "đà nẵng");
        Student student3 = new Student("c", 18, "hà nội");
        Student student4 = new Student("d", 18, "quảng nam");
        studentService.add(student1,1);
        studentService.add(student2,2);
        studentService.add(student3,3);
        studentService.add(student4,4);

studentService.display();

studentService.them(student1);
studentService.them(student2);
studentService.them(student3);
studentService.them(student4);
studentService.hienThi();
    }

}
