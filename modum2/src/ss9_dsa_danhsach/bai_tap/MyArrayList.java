package ss9_dsa_danhsach.bai_tap;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private int deFaultCapacity = 10;
    //mang chua cac phan tu
    Object element[];

    //suc chua mac di h khi khoi tao la 10;
    public MyArrayList() {
        element = new Object[deFaultCapacity];
    }

    public MyArrayList(int deFaultCapacity) {
        if (deFaultCapacity >= 0) {
            element = new Object[deFaultCapacity];
        } else {
            throw new IllegalArgumentException("capacity" + deFaultCapacity);
        }
        this.deFaultCapacity = deFaultCapacity;

    }

    public int size() {
        return this.size;
    }

    public void clean() {
        size = 0;
        for (int i = 0; i < element.length; i++) {
            element[i] = null;
        }

    }

    public boolean add(E elements) {
        if (element.length == size) {
            ensureCapacity(10);
        }
        element[size] = elements;
        size++;
        return true;
    }

    public void add(E temp, int index) {
        if (index > element.length) {
            throw new IllegalArgumentException("index " + index);
        } else if (element.length == size) {
            ensureCapacity(10);
        }
        if (element[index] == null) {
            element[index] = temp;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                element[i] = element[i - 1];
            }
            element[index] = temp;
            size++;
        }
    }

    //tang kich thuoc mang
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.element.length + minCapacity;
            element = Arrays.copyOf(element, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity " + minCapacity);
        }
    }

    //get 1 phan tu tai 1 vi tri thu i
    public E get(int index) {
        return (E) element[index];
    }

    //    tim kiem vi tri cua phan tu trong mang
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.element[i].equals(element)) ;
            return i;
        }
        return index;
    }
    public boolean contains(E element){
        return this.indexOf(element) >=0;

    }
//    phuong thuc clone(coppy mang)
    public MyArrayList<E> clone(){
        MyArrayList<E> v = new MyArrayList<>();
        v.element = Arrays.copyOf(this.element ,this.size);
        v.size = this.size;
        return v;
    }
//    remove
    public E remove (int index){
        if(index<0||index>size){
            throw new IllegalArgumentException("EROSS" + index);
        }
        else {
            E element1 = (E) element[index];
            for (int i =1; i<size-1;i++){
                element[i]= element[i+1];
            }
            element[size-1]=null;
            size--;
            return element1;
        }


    }


}
