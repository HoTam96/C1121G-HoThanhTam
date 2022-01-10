package ss7_abstract_class_and_interface.bai_tap.interface_Colorable_hinh_hoc;

public class Square extends Rectangle implements Colorable {

    public Square(String color) {
        super(color);
    }

    public Square(String color, boolean filled, double width, double height) {
        super(color, filled, width, height);
    }

    public Square(double width, double height) {
        super(width, height);
    }

    public Square(double side) {
        super(side, side);
    }

    public double getArea1() {
        return this.getHeight() * this.getWidth();
    }

//   @Override
//   public double getArea() {
//      return super.getArea();
//   }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void howTocolor() {
        System.out.println("màu là: "+getColor());
    }

    @Override
    public double getArea2() {
       return this.getHeight() * this.getWidth();
    }


}
