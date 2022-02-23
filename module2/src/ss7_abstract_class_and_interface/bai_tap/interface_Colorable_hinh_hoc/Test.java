package ss7_abstract_class_and_interface.bai_tap.interface_Colorable_hinh_hoc;

import ss7_abstract_class_and_interface.bai_tap.resizeable_hinh_hoc.ResizeAble;

public class Test {
    public static void main(String[] args) {
        Colorable color = new Square("yello");
        color.howTocolor();
        Square square = new Square("yello",true,20,10);
        Rectangle rectangle5 = new Rectangle("black",true,20,20);
        Colorable [] color1 = new Colorable[]{square,rectangle5};
        for (Colorable colorable :color1) {
            System.out.println("diện tích là: "+ colorable.getArea2());
        }

        for (Colorable colorable1 :color1){
            System.out.println(colorable1.getArea2());
            if (colorable1 instanceof Square){
                Colorable colorable6 =  (Square)colorable1;
              colorable6.howTocolor();
            }

        }
    }
}
