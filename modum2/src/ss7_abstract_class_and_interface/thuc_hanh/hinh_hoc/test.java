package ss7_abstract_class_and_interface.thuc_hanh.hinh_hoc;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        ComparableCircle[] circles=new ComparableCircle[3];
        circles[0]= new ComparableCircle(3.4);
        circles[1]= new ComparableCircle();
        circles[2]= new ComparableCircle("blue",false,3.2);

        System.out.println("chưa sắp sếp");
        for (ComparableCircle circle: circles) {
            System.out.print(circle);
        }
        Arrays.sort(circles);
        for (ComparableCircle circle: circles) {
            System.out.print( circle+",");
        }
        
    }
}
