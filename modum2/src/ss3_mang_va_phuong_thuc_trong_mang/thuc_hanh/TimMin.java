package ss3_mang_va_phuong_thuc_trong_mang.thuc_hanh;

public class TimMin {
    public static int minvalue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] array1 = {20, 14, 6, 7, 8, 5};
        int value = minvalue(array1);
        System.out.println(" số nhỏ nhất trong mảng là: " + value);
    }

}
