package ss6_ke_thua.bai_tap.triangle;

public class Triangle extends Shape {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle() {

    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double p = perimeter() / 2;
        return Math.pow(p * ((p - side1) * (p - side2) * (p - side3)), 0.5);

    }

    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "PropertyTriangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                "màu sắc là: " + getColor() + "}";
    }
}
