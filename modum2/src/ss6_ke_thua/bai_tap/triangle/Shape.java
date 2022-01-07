package ss6_ke_thua.bai_tap.triangle;

public class Shape {
    private String color = "yellow";

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
