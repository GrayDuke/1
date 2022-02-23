package Num1;

import java.util.Arrays;

public class NewLinckedList {
    private int size;
    private Node head;

    public void add(Integer num){
        if(head == null){
            this.head = new Node(num);
        }else{
            Node temp = head;
            while(temp.getNext() !=null){
                temp = temp.getNext();
            }
            temp.setNext(new Node(num));
        }
        size++;
    }

    public void remove(Integer index){
        Node temp = head;
        Integer index_now = 0;
        if(size>index) {
            if (index == 0) {
                head = head.getNext();
                size--;
            }else{
                while(index_now != index-1){
                    temp = temp.getNext();
                }
                temp.setNext(temp.getNext().getNext());
                size--;
            }
        }else{
            System.out.println("ERROR");

        }

    }

    public void get(Integer index){
        Node temp = head;
        if(size>index){
            for(int i = 0; i<index;i++){
                temp = temp.getNext();
            }
            System.out.println(temp.getValue());
        }else{
            System.out.println("ERROR");
        }
    }


    public String toString() {
        int[] mas = new int[size];
        Node temp = head;
        int indx = 0;

        while(temp != null){
            mas[indx++] = temp.getValue();
            temp = temp.getNext();
        }

        return Arrays.toString(mas);
    }


    public class Node{
        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
