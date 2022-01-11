package ss8_clean_code.thuc_hanh.refactoring_split_variable;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        ArrayList<Integer>mainArray = new ArrayList<Integer>();
        ArrayList<Integer>cloneArray = new ArrayList<Integer>();
        int[]inputArr = {1,3,5};
        int tempValue =0;
        for (int element : inputArr) {
            mainArray.add(element);
            tempValue+=element;
            cloneArray.add(tempValue);
        }
        System.out.println(cloneArray);

    }
}
