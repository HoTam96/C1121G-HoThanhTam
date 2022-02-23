package ss5_access_modifier_static_method.bai_tap.access_modifier;

public class Circle {
private double radius = 1;
private String red = "red";
public Circle(){
}
public Circle(double radius){
    this.radius = radius;
}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }
    public  double getArea(){
    return Math.PI * Math.pow(radius,2);
    }

}

