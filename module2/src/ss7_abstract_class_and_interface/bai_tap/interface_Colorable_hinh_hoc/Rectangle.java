package ss7_abstract_class_and_interface.bai_tap.interface_Colorable_hinh_hoc;

public class Rectangle extends Shape implements Colorable {
    private double width;
    private double height;

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this.width = 1;
        this.height = 2;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height + this.width) / 2;
    }

    public static void tam() {
        System.out.println("tam");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public void howTocolor() {
        System.out.println("màu hình chữ nhật là: "+ getColor());
    }

    @Override
    public double getArea2() {
        return this.height * this.width;
    }


}
