package ss7_abstract_class_and_interface.bai_tap.resizeable_hinh_hoc;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        double percent = random.nextDouble()*100;
        Circle circle = new Circle(3.2);
        Rectangle rectangle = new Rectangle(20, 10);
        Square square = new Square(20);
        ResizeAble[] hinh = new ResizeAble[]{circle,rectangle,square};
        System.out.println("diện tích lúc đầu: "+ circle.getArea());
        circle.resize(percent);
        System.out.println("diện tích lúc đầu"+ rectangle.getArea());
        rectangle.resize(percent);
        System.out.println("diện tích hình vuông lúc đầu: "+square.getArea1());
        square.resize(percent);
    }
}
