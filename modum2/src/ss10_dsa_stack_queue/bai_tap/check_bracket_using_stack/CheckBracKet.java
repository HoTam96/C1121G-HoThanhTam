package ss10_dsa_stack_queue.bai_tap.check_bracket_using_stack;

import java.util.ArrayList;
import java.util.Stack;

public class CheckBracKet {
    private Stack<String> stringStack = new Stack<>();
    private Stack<String> stringStack1 = new Stack<>();
    private ArrayList<String> arrayList1 = new ArrayList<>();
    private ArrayList<String> arrayList2 = new ArrayList<>();

    public void checkBreak(String data) {
        for (int i = 0; i < data.length(); i++) {
            char kiTu = data.charAt(i);
            if (kiTu == '(' || kiTu == '{' || kiTu == '[') {
                stringStack.push(kiTu + "");
            }
        }
        int size1 = stringStack.size();

        for (int i = 0; i < data.length(); i++) {
            char kiTu1 = data.charAt(i);
            if (kiTu1 == ')' || kiTu1 == '}' || kiTu1 == ']') {
                stringStack1.push(kiTu1 + "");
            }
        }
        int size2 = stringStack1.size();
        if (size1 == 0 && size2 == 0) {
            System.out.println("biểu thức không có dấu ngoặc");
        } else if (size1 == size2) {
            int n = stringStack.size();
            for (int i = 0; i < n; i++) {
                arrayList1.add(stringStack.pop());
            }
            for (int i = 0; i < n; i++) {
                arrayList2.add(stringStack1.pop());
            }

            for (int i = 0; i < n; i++) {
                int count = 0;
                if (arrayList1.get(i) == "(") {
                    arrayList1.set(i, ")");
                } else if (arrayList1.get(i) == "{") {
                    arrayList1.set(i, "}");
                } else {
                    arrayList1.set(i, "]");
                }
                for (int j = 0; j < n; j++) {
                    if (arrayList1.get(i) == arrayList2.get(j)) {
                        arrayList1.remove(i);
                        arrayList2.remove(j);
                        count++;
                        i--;
                        j--;
                        break;
                    }
                }

            }
            if (arrayList1.size() == arrayList2.size()) {
                System.out.println("biểu thức hợp lệ");
            } else {
                System.out.println("biểu thức không hợp lệ");
            }

        } else {
            System.out.println("biểu thức không hợp lệ");
        }


    }


}
