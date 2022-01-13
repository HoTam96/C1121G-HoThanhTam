package ss10_dsa_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseElement {
    public static void main(String[] args) {
        Stack<String> array = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String data = sc.nextLine();
        data.trim();
        String[] arr = data.split("\\s");
        String[] arr1 = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            array.push(arr[i]);
        }

        System.out.println(Arrays.toString(array.toArray()));
        System.out.println(Arrays.toString(arr));
        System.out.println( array.size());
        System.out.println("chuổi đảo ngược");
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = array.pop();
        }
        System.out.println(Arrays.toString(arr1));


    }

}
