package ss7_abstract_class_and_interface.bai_tap.resizeable_hinh_hoc;

import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Rectangle;

public class Square extends Rectangle implements ResizeAble {

    public Square() {
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
        return "A Square with side=xxx, which is a subclass of yyy";
    }

    @Override
    public void resize(double percent) {
        System.out.println("diện tích hình vuông sau "+this.getArea1()*percent);
    }
}
