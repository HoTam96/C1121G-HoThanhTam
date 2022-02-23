package ss12_java_collection_framework.thuc_hanh.Sort_comparable_and_comparator;

public class StudentController {
    public static void main(String[] args) {


        StudentService studentService = new StudentService();
        Student student1 = new Student("tâm", 11, "đà nẵng");
        Student student2 = new Student("anh", 15, "quảng nam");
        Student student3 = new Student("bống", 12, "đà nẵng");
studentService.add(student1);
studentService.add(student2);
studentService.add(student3);
studentService.display();
        System.out.println("-----------------");
studentService.sapxepTheoTen();
        studentService.display();
        System.out.println("-----------------");
        studentService.sapXepTheoTuoi();
        studentService.display();

    }
}