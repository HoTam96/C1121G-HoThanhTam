package ss5_access_modifier_static_method.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.15);
        System.out.println(circle1.getRadius());
        System.out.println(circle2.getRadius());
        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());
    }

}
