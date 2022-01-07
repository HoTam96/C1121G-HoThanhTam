package ss6_ke_thua.bai_tap.shape;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(String color, double height) {
        super(color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * this.height;
    }

    @Override
    public String toString() {
        return " bán kính đấy là: " + radius + "màu sắc là: " + getColor() + "chiều cao hình trụ: " + height;
    }

}
