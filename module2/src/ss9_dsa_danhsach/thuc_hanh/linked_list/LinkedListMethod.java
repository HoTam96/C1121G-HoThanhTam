package ss9_dsa_danhsach.thuc_hanh.linked_list;

import javax.xml.soap.Node;

public class LinkedListMethod {
    private Node head;
    private int numNodes;

    public LinkedListMethod(Node head, int numNodes) {
        this.head = head;
        this.numNodes = numNodes;
    }

    public LinkedListMethod(Object data) {
        head = new Node(data);
    }

    private class Node{
        private Node next;
        private Object data;
        public Node (Object data){
            this.data=data;
        }

        public Object getData() {
            return this.data;
        }
    }
}
