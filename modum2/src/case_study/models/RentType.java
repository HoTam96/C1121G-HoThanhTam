package case_study.models;

public class RentType {
    private int year;
    private int month;
    private int day;
    private double hour;
    private String renType;

    public RentType(int year, int month, int day, double hour) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
    }

    public RentType(String renType) {
        this.renType = renType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public String getRenType() {
        return renType;
    }

    public void setRenType(String renType) {
        this.renType = renType;
    }

    @Override
    public String toString() {
        return "RentType{" +
                "renType='" + renType + '\'' +
                '}';
    }
}
