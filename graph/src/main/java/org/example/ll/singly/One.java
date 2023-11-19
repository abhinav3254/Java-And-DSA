package org.example.ll.singly;

public class One<T> {

    private Node<T> head;
    private Node<T> tail;


    public void insert(T data) {
        if (head == null) {
            head = new Node<>(data);
            tail = head;
        } else {
            tail.next = new Node<>(data);
            tail = tail.next;
        }
    }

    public void displayList() {
        Node<T> temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println(" null ");
    }

    public static void main(String[] args) {
        One<Integer> integerOne = new One<>();
        integerOne.insert(10);
        integerOne.insert(20);
        integerOne.insert(30);
        integerOne.insert(40);
        integerOne.insert(50);

        integerOne.displayList();
    }

}
