package ss10_dsa_stack_queue.bai_tap.checking_palindrome;

import java.util.Arrays;

public class PalindromeController {
    public static void main(String[] args) {
        String data = "Able was I ere I saw elbA";
        ServicePalindrome palindrome = new ServicePalindrome();
       String element =  palindrome.chekcStack(data);
       String element1=  palindrome.checkQueue(data);
        System.out.println(element);
        System.out.println(element1);

        System.out.println("hai chuổi bằng nhau: "+palindrome.equal(element,element1));
    }

}
