package case_study.until;

import case_study.module.module_Furama.information.Booking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class SortByNameDate implements Comparator<Booking> {


    @Override
    public int compare(Booking o1, Booking o2) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date startDay1;
        Date endDay1;
        Date startDay2;
        Date endDay2;
        int resultNumber = 0;
        try {

            startDay1 = dateFormat.parse(o1.getNgayBatDau());
            endDay1 = dateFormat.parse(o1.getNgayKetThuc());
            startDay2 = dateFormat.parse(o2.getNgayBatDau());
            endDay2 = dateFormat.parse(o2.getNgayKetThuc());
            if (startDay1.compareTo(startDay2) == 0) {
                if (endDay1.compareTo(endDay2) > 0) {
                    resultNumber = 1;
                } else if (endDay1.compareTo(endDay2) < 0) {
                    resultNumber = -1;
                }
            } else if (startDay1.compareTo(startDay2) > 0) {
                resultNumber = 1;
            } else {
                resultNumber = -1;
            }


        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultNumber;
    }
}
