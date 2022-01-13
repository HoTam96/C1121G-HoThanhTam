package ss10_dsa_stack_queue.bai_tap.checking_palindrome;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class ServicePalindrome {
  private Stack<String>checkStringStack= new Stack<>();
  private Queue<String>checkStringQueue = new LinkedList<>();

public String chekcStack(String data){
    String str ="";
   for (int i =0;i<data.length();i++){
       checkStringStack.push(data.charAt(i)+"");
   }
   int size = checkStringStack.size();
    for (int i =1;i<size;i++){
        str+=checkStringStack.pop();
    }

    return str;

}
public String checkQueue(String data){
    String str1 ="";
    for (int i =0;i<data.length();i++){
        checkStringQueue.offer(data.charAt(i)+"");
    }
    int size = checkStringQueue.size();
    for (int i =1;i<size;i++){
        str1+=checkStringQueue.poll();
    }
    return str1;
}
public boolean equal(String temp1,String temp2){
    return temp1.equals(temp2);
}


}
