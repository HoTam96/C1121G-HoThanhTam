package ss6_ke_thua.bai_tap.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder("yellow", 20);
        System.out.println(cylinder.toString());
        System.out.println("diện tích hình tròn đấy trụ là: " + cylinder.getArea());
        System.out.println("thể tích hình trụ là " + cylinder.getVolume());
        System.out.println("bán kính của đấy hình trụ là: " + Circle.radius);
        cylinder.change();
        System.out.println("bán kính của đấy hình trụ là: " + Circle.radius);
        Circle.change1();
        System.out.println("bán kính của đấy hình trụ là: " + Circle.radius);
        Circle circle1 = new Circle("yellow");

    }
}
