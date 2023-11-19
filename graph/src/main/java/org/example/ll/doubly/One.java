package org.example.ll.doubly;

public class One<T> {

    private Node<T> head;
    private Node<T> tail;
    private Node<T> temp;

    public void insert(T data) {
        if (head == null) {
            head = new Node<>(data);
            tail = head;
            temp = head;
        } else {
            temp.next = new Node<>(data);
            temp.next.prev = temp;
            temp = temp.next;
            tail = temp;
        }
    }

    public void displayListReverse() {
        System.out.print(" null");
        while (temp != null) {
            System.out.print(" == "+temp.data);
            temp = temp.prev;
        }
        // again shifting temp to tail last index
        temp = tail;
        System.out.println(" == null ");
    }

    public static void main(String[] args) {
        One<Integer> one = new One<>();
        one.insert(10);
        one.insert(20);
        one.insert(30);
        one.insert(40);
        one.insert(50);

        one.displayListReverse();

    }

}
