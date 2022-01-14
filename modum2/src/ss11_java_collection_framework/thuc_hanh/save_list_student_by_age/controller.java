package ss11_java_collection_framework.thuc_hanh.save_list_student_by_age;

public class controller {
    public static void main(String[] args) {
        ServiceStudent student = new ServiceStudent();
        student.add();

        student.display();
        student.sapxepKeyGiamDan();
        student.linkedhashmap();
    }

}
