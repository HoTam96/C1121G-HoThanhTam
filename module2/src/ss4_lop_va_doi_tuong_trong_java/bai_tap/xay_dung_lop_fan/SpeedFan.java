package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

public class SpeedFan {
    private int speed;


    public SpeedFan(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public final int slow = 1;
    public final int medium = 2;
    public final int fast = 3;

}
