package ss10_dsa_stack_queue.bai_tap.convert;

import java.util.Stack;

public class ConvertFromDecimalToBinaryService {
    private  Stack<Integer>convert= new Stack<>();

    public void convert(int data){
        int soDu;
        while (data>0){
      soDu=data%2;
      convert.push(soDu);
      data/=2;
    }
        int n =convert.size();
        for (int i =0;i<n;i++){
            System.out.println(convert.pop());
        }


        }
}

