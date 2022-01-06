package ss4_lop_va_doi_tuong_trong_java.bai_tap.stop_watch;

import com.sun.org.apache.bcel.internal.generic.Select;

import java.sql.Date;
import java.time.LocalTime;

public class BuildStopWatch {
    private long startTime;

    public BuildStopWatch(long startTime) {
        this.startTime = startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public long endTime() {
        return System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime() - (this.getStartTime());
    }

    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
