package ss12_java_collection_framework.thuc_hanh.distinguish_between_hashcode_hashmap;

import java.util.*;

import static java.util.Collections.*;

public class StudentService {
    Map<Student,Integer> studenthashmap = new HashMap<>();
    Set<Student>studentSet=new HashSet<>();


    public void add(Student key,int value){
        studenthashmap.put(key,value);
    }

        public  void display(){
            Set<Student>key=studenthashmap.keySet();
            for (Student element:key) {
                System.out.println(element+" có giá trị là "+ studenthashmap.get(element));
            }


    }
    public void them(Student student){
        studentSet.add(student);
    }
    public void hienThi(){
        for (Student elemnet:studentSet) {
            System.out.println("hashset"+elemnet);
        }
    }

}
