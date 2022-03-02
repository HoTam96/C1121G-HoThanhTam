package ss10_dsa_stack_queue.bai_tap.check_bracket_using_stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

    public static void main(String[] args) {
        String str = "abcdefaba";
        str = str.trim();
        char[]arr = new char[str.length()];

        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <str.length() ; j++) {
                if (str.charAt(i)==str.charAt(j)){
                    arr[i] = str.charAt(i);
                    for (int k = 0; k <arr.length; k++) {
                        for (int l = 0; l <arr.length ; l++) {
                            if (arr[l]==arr[k]){
                            }

                        }

                    }

                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }

}
