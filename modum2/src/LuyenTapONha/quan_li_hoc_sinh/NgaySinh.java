package LuyenTapONha.quan_li_hoc_sinh;

import java.util.Objects;

public class NgaySinh {
    private int day;
    private int month;
    private int year;
    public NgaySinh(int day,int month,int year){
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return getDay()+"/"+getMonth()+"/"+ getYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NgaySinh ngaySinh = (NgaySinh) o;
        return day == ngaySinh.day && month == ngaySinh.month && year == ngaySinh.year;
    }

}
