package ss7_abstract_class_and_interface.thuc_hanh.hinh_hoc;

import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    public ComparableCircle(Double radius) {
        super(radius);
    }


    @Override
    public int compareTo(ComparableCircle o) {
                if (getRadius()>o.getRadius()){
            return 1;
        }
        else if(getRadius()<o.getRadius()){
            return -1;
        }
        else {
            return 1;
        }
    }
}
