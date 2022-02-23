package ss12_java_collection_framework.thuc_hanh.save_list_student_by_age;

import java.util.*;

public class ServiceStudent {
    private Map<String,Integer>student= new HashMap<>();
    public void add(){
        student.put("anh",8);
        student.put("hồng",12);
        student.put("danh",15);
        student.put("tiến",19);
        student.put("tuan",28);

    }
    public void display(){
        System.out.println(student);
    }
    public void sapxepKeyGiamDan(){
        Map<String,Integer>studen1 = new TreeMap<>(student);
        System.out.println("tree map "+studen1);
        System.out.println("1"+studen1.keySet());
        System.out.println("2"+studen1.values());
        Set<String>taphop=studen1.keySet();
        for (String elemrnt:taphop) {
            System.out.println(elemrnt +" có giá trị là "+ studen1.get(elemrnt));
        }


    }
    public void linkedhashmap(){
        Map<String,Integer>student2= new LinkedHashMap<>(16,0.75f,true);
        student2.put("dương" ,13);
        student2.put("dũng" ,12);
        student2.put("lược" ,10);
        student2.put("tế" ,15);
        System.out.println("linked hash mapp "+student2);
    }



}
