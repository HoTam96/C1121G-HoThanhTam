package ss3_mang_va_phuong_thuc_trong_mang.bai_tap;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int max = array[0][0];
        String index = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    index = i + "-" + j;

                }
            }

        }
        System.out.println("số lớn nhất trong mảng là: "+max+ " vị trí thứ "+index);

    }
}
