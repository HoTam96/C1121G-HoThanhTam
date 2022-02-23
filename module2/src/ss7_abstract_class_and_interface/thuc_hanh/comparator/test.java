package ss7_abstract_class_and_interface.thuc_hanh.comparator;

import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Circle[] circle1 = new Circle[3];
        circle1[0]= new Circle(3.2);
        circle1[1]= new Circle();
        circle1[2]= new Circle("blue",true,3.7);
        System.out.println("mảng ban đầu");
        for (Circle circle:circle1) {
            System.out.println(circle);
        }
        CircleComparator comparator = new CircleComparator();
        Arrays.sort(circle1,comparator);
        System.out.println("mảng sau khi sắp  xếp");
        for (Circle circle:circle1) {
            System.out.println(circle);
        }
    }
}
