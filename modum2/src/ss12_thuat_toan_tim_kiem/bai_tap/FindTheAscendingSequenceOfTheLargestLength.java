package ss12_thuat_toan_tim_kiem.bai_tap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindTheAscendingSequenceOfTheLargestLength {
   private static ArrayList<String>arrayList= new ArrayList<>();
//   private static ArrayList<String>arrayList1= new ArrayList<>();
    public void findString(String data){
        data = data.trim();
        data=data.replaceAll("\\s+"," ");
        String []arr = new String[data.length()];
   for (int i =0;i<data.length();i++){
       arr[i]=data.charAt(i)+"";
   }
  String max = arr[0];
   arrayList.add(max);
   for (int i =1;i<arr.length;i++){
       if (max.compareTo(arr[i])<0){
           max=arr[i];
           arrayList.add(max);
       }
   }
        System.out.println(Arrays.toString(arr));
        System.out.println(arrayList);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 chuổi");
        String str = sc.nextLine();
        FindTheAscendingSequenceOfTheLargestLength find = new FindTheAscendingSequenceOfTheLargestLength();
        find.findString(str);


    }

}
