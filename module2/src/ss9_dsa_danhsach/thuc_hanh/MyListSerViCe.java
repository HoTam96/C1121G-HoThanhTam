package ss9_dsa_danhsach.thuc_hanh;

import java.util.ArrayList;
import java.util.Arrays;

class MyListService {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    ArrayList<Integer> arrayListList = new ArrayList<Integer>();

    public MyListService() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCaPa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add (int element){
        if (size==elements.length){
            ensureCaPa();
        }
        elements[size++]=element;
    }
    public String get(int index){
        if (index>=size||index<0){
            throw new IndexOutOfBoundsException("index: "+ index+ "size "+ index);
        }
        return (String) elements[index];

    }
    public void display(){
        arrayListList.add(1);
        arrayListList.add(2);
        arrayListList.add(3);
        arrayListList.add(4);
        System.out.println("element1: "+ arrayListList.get(1));
        System.out.println("element2: "+ arrayListList.get(2));
//        arrayListList.get(-1);
//        System.out.println("element -1: " + arrayListList.get(-1));

    }

}