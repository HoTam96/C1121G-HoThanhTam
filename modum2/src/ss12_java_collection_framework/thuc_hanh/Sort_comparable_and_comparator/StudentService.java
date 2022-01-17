package ss12_java_collection_framework.thuc_hanh.Sort_comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentService {
    List<Student>studentList=new ArrayList<>();

public void add(Student student){
    studentList.add(student);


}
public void display(){
    for (Student element :studentList) {
        System.out.println(element);
    }

}
public void sapxepTheoTen(){
    Collections.sort(studentList);
}

public void sapXepTheoTuoi(){
//    AgeComparator ageComparator = new AgeComparator();
//    Collections.sort(studentList,new AgeComparator());
  Collections.sort(studentList,new AgeComparator());
}

}
