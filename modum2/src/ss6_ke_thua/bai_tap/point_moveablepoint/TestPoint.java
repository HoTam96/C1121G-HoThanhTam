package ss6_ke_thua.bai_tap.point_moveablepoint;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point();
        point.setXY(2, 6);
        System.out.println(Arrays.toString(point.getXY()));
        MovablePoint movablePoint = new MovablePoint(2, 4, 5, 6);
        movablePoint.speed(7, 8);
        movablePoint.move();
        System.out.println(Arrays.toString(movablePoint.getXY()));
        System.out.println(movablePoint.toString());
    }
}
