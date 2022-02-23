package ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Square extends Rectangle {

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
}
