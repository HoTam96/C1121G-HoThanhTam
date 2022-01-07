package ss6_ke_thua.bai_tap.point_moveablepoint;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void speed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr1 = {xSpeed, ySpeed};
        return arr1;
    }

    public void move() {
        super.setX(getX() + xSpeed);
        super.setY(getY() + ySpeed);
    }

    public float[] getXY() {
        float[] arr4 = {super.getX(), super.getY()};
        return arr4;
    }

    @Override
    public String toString() {
        return "(x,y), speed = (xs,ys)";
    }


}
