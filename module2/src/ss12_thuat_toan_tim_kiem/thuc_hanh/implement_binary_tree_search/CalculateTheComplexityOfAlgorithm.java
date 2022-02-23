package ss12_thuat_toan_tim_kiem.thuc_hanh.implement_binary_tree_search;

import java.util.Scanner;

public class CalculateTheComplexityOfAlgorithm {
    public void calculate(String inputString){
        int[] frequentChar = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
            int ascii = (int) inputString.charAt(i);
            System.out.println(ascii);
            frequentChar[ascii] += 1;
        }
        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + character +
                "' with a frequency of " + max + " times");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        CalculateTheComplexityOfAlgorithm calculateTheComplexityOfAlgorithm = new CalculateTheComplexityOfAlgorithm();
        calculateTheComplexityOfAlgorithm.calculate(inputString);

    }

}
