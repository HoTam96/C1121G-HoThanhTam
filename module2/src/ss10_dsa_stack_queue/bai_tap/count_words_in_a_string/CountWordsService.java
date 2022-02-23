package ss10_dsa_stack_queue.bai_tap.count_words_in_a_string;

import java.util.*;

public class CountWordsService {
    public static void main(String[] args) {


        Map<String, Integer> data = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 chuổi");
        String str = sc.nextLine();
        str = str.trim().replaceAll("\\s+", " ");
        System.out.println(str);

        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (data.keySet().contains(arr[i])){
                data.put(arr[i], data.get(arr[i]) + 1);
            } else {

                data.put(arr[i], 1);

            }
        }
        System.out.println(data);

    }

}
