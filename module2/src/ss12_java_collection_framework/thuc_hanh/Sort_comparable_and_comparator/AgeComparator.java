package ss12_java_collection_framework.thuc_hanh.Sort_comparable_and_comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
//        if (o1.getName()>o2.getName()){
//            return 1;
//        }
//        else if (o1.getAge()< o2.getAge()){
//            return -1;
//        }
//        else {
//            return 0;
//        }
//
//    }
        return o1.getName().compareTo(o2.getName());
    }
}