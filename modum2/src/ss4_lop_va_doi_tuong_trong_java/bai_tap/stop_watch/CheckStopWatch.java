package ss4_lop_va_doi_tuong_trong_java.bai_tap.stop_watch;

public class CheckStopWatch {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        long start = System.currentTimeMillis();
        System.out.println(start);
        StopWatch buildStopWatch = new StopWatch(start);
        buildStopWatch.getStartTime();
        buildStopWatch.selectionSort(array);
        buildStopWatch.endTime();
        System.out.println("thời gian là: " + buildStopWatch.getElapsedTime());

    }
}
