package ss6_ke_thua.bai_tap.point;

public class TestPoint {
    public static void main(String[] args) {
//        Point3D point3D = new Point3D(2f,5f,6f);
//        System.out.println( point3D.toString());
        float x = 4f;
        float y = 7f;
        float z = 8f;

        Point2D point2D4D = new Point2D(x, y);
        System.out.println(point2D4D.toString());
        float[] arr = new float[]{x, y};
        System.out.println(point2D4D.getXY(arr));
        Point3D point3D = new Point3D(x, y, z);

        float[] arr5 = new float[]{x, y, z};
        System.out.println(point3D.getXYZ(arr5));
        System.out.println(point3D.toString());

    }

}
