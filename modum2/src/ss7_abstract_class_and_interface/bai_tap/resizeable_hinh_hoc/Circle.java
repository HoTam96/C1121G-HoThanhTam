package ss7_abstract_class_and_interface.bai_tap.resizeable_hinh_hoc;


import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;

public class Circle extends Shape implements ResizeAble {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
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

public double getArea (){
    return (Math.PI * Math.pow(this.radius,2));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void resize(double percent) {
        System.out.println("diện tích lúc sau "+getArea()*percent);

    }
}
