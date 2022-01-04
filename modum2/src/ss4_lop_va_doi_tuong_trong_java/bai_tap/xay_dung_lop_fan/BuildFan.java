package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

public class BuildFan {
    private SpeedFan speedFan;
    private boolean statusFan;
    private double radius;
    private String color;

    public BuildFan(SpeedFan speedFan, boolean statusFan, double radius, String color) {
        this.speedFan = speedFan;
        this.statusFan = statusFan;
        this.radius = radius;
        this.color = color;
    }

    public SpeedFan getSpeedFan() {
        return speedFan;
    }

    public void setSpeedFan(SpeedFan speedFan) {
        this.speedFan = speedFan;
    }

    public boolean isStatusFan() {
        return statusFan;
    }

    public void setStatusFan(boolean statusFan) {
        this.statusFan = statusFan;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String informationFan() {
        return "bán kính quạt là " + this.radius + " màu sắc của quạt " + this.color+ " có 3 tốc độ "+ "fast "+
                this.speedFan.fast + " ,medium "+ this.speedFan.medium+ " ,slow "+ this.speedFan.slow;
    }

    public String statusFanOn() {
        return "tốc độ của quạt đang chạy là: " + this.getSpeedFan().fast +"," +" màu sắc của quạt là: " + this.color + " bán kinhs cánh quạt là: " + this.radius
                + " fan is on";
    }

    public String  statusFanOff (){
        return "màu sắc của quạt là: "+ this.color + "bán kính cánh quạt " + this.radius + " fan is off";
    }
}

