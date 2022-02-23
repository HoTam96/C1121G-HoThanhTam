package LuyenTapONha.test;

import java.sql.Date;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class TestDate {
    public static void main(String[] args) {
//        long t1 = System.currentTimeMillis();
//        for (int i =1 ;i<10;i++){
//            System.out.println(i);
//        }
//        long t2 = System.currentTimeMillis();
//        System.out.println(t1);
//        System.out.println(t2);
//        System.out.println((t2-t1));
//        System.out.println(TimeUnit.DAYS.toSeconds(30*365));
//        System.out.println(TimeUnit.HOURS.toDays(24));
//

        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);
        System.out.println(date.getDate()+"/"+date.getMonth()+1+"/"+ (date.getYear() + 1900));


    }
}
