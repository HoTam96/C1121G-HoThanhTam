package ss2_vong_lap_trong_java.bai_tap.hien_thi_cac_loai_hinh;

public class TopRight {
    public static void main(String[] args) {

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("     ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}