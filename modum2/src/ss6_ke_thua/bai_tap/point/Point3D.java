package ss6_ke_thua.bai_tap.point;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getXYZ(float[] array1) {
        return array1[0] + array1[1] + array1[2];

    }

    @Override
    public String toString() {
        return "3 số X,Y,Z là: " + "x:" + getX() + "y: " + getY() + "z: " + getZ();
    }
}


