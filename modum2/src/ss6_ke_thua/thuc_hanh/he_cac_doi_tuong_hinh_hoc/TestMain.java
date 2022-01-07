package ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class TestMain {
    public static void main(String[] args) {
        Shape shape = new Shape();

        Square square2 = new Square(20);
        Rectangle rectangle = new Rectangle(100, 500);
        System.out.println("diện tích hình là:" + rectangle.getArea());
        Square square1 = new Square(10, 20);
        System.out.println(square1.getArea());
        System.out.println(square2.getHeight());
        System.out.println(square2.getWidth());
        System.out.println("diện tích là:" + square2.getArea1());
        System.out.println("diện thích sau khi kế thừa" + square2.getArea());
        System.out.println(square1.getArea());

        Rectangle rectangle1 = new Rectangle(10, 5);
        System.out.println(rectangle1.getHeight());
        System.out.println(rectangle1.getWidth());

        Rectangle rectangle6 = new Rectangle(20, 40);


    }
}
