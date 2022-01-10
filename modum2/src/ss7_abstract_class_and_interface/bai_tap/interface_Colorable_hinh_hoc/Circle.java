package ss7_abstract_class_and_interface.bai_tap.interface_Colorable_hinh_hoc;


public class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1;
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
