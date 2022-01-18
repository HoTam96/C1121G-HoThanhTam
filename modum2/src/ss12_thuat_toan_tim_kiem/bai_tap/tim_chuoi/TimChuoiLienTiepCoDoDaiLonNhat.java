package ss12_thuat_toan_tim_kiem.bai_tap.tim_chuoi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TimChuoiLienTiepCoDoDaiLonNhat {
    private static ArrayList<String> arrayList = new ArrayList<>();
    private static ArrayList<ArrayList<String>> arrayList1 = new ArrayList<>();

    public void findString(String data) {
        data = data.trim();
        data = data.replaceAll("\\s+", " ");
        String[] arr = new String[data.length()];
        for (int i = 0; i < data.length(); i++) {
            arr[i] = data.charAt(i) + "";
        }
        String max = arr[0];
        arrayList.add(max);
        for (int i = 1; i < arr.length; i++) {
            if (max.compareTo(arr[i]) < 0) {
                max = arr[i];
                arrayList.add(max);
            } else if (max.compareTo(arr[i]) > 0) {
                max = arr[i];
                arrayList1.add(arrayList);
                arrayList = new ArrayList<>();
                arrayList.add(max);
            }
        }
        arrayList1.add(arrayList);
        System.out.println(arrayList1);

        int maxLength = arrayList1.get(0).size();
        int index = 0;
        for (int i = 1; i < arrayList1.size(); i++) {
            if (maxLength < arrayList1.get(i).size()) {
                maxLength = arrayList1.get(i).size();
                index = i;
            }
        }
        System.out.println("chuổi con có độ dài lớn nhất là: " + arrayList1.get(index) + " chiều dài: " + maxLength);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 chuổi dài");
        String str = sc.nextLine();
        TimChuoiLienTiepCoDoDaiLonNhat find = new TimChuoiLienTiepCoDoDaiLonNhat();
        find.findString(str);


    }

}
