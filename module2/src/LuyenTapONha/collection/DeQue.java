package LuyenTapONha.collection;

import java.util.*;

public class DeQue {
    public static void main(String[] args) {
        Queue<String>danhSach = new LinkedList<String>();
        Queue<String>danhsach1 =  new PriorityQueue<String>();

//        Deque<String>danhSach = new ArrayDeque<String>();
//            danhSach.offer("thanh tâm");
//            danhSach.offer("thanh tú");
//            danhSach.offer("thanh quang");
//            danhSach.offerFirst("duong");
//            danhSach.offerFirst("duong1");
//            danhSach.offerLast("duong2");
//            danhSach.offer("duong3");

      while (true){
          String ten = danhSach.poll();
          if (ten==null){
              break;
          }
          System.out.print(ten);
      }
        System.out.println("sau "+danhSach);



    }


}
