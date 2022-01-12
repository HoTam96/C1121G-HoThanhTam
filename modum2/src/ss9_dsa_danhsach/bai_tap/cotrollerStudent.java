package ss9_dsa_danhsach.bai_tap;

import java.util.Arrays;

public class cotrollerStudent {
    public static void main(String[] args) {
        MyArrayList<MethodStudent> studentMyArrayList = new MyArrayList<>();

        MethodStudent student1 = new MethodStudent(1, "tam");
        MethodStudent student2 = new MethodStudent(2, "huy");
        MethodStudent student3 = new MethodStudent(3, "tuan");
        MethodStudent student4 = new MethodStudent(4, "thuong");
        MethodStudent student5 = new MethodStudent(5, "tinh");
        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
        studentMyArrayList.add(student3);
        studentMyArrayList.add(student4);
        studentMyArrayList.add(student5,4);
        System.out.println(studentMyArrayList.size());
        System.out.println(studentMyArrayList.size());
        System.out.println(studentMyArrayList.get(2).getName());

//       for (int i =0; i<studentMyArrayList.size();i++){
//           MethodStudent methodStudent = (MethodStudent) studentMyArrayList.element[i];
//           System.out.println(methodStudent.getId());
//           System.out.println(methodStudent.getName());
//
//       }

    }
}
