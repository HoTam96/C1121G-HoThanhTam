package ss6_ke_thua.bai_tap.shape;

public class Circle {
    protected static double radius = 6;
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public void change() {
        radius = 7;

    }

    public static double change1() {
        return radius = 8;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

}
