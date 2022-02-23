package LuyenTapONha.QuanLiRapPhim;

public class NgayChieu {
    private int day;
    private int month;
    private int year;
    public NgayChieu (int day,int month,int year){
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }


    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
