package DSA.genrics;

import java.io.IOException;
import java.util.Scanner;

public class One<T> {

    Node<T> head = null;

    public void addData(T data) {
        Node<T> node = new Node<T>(data);
        if(head == null) {
            head = node;
        } else {
            Node<T> temp = head;
            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void printData() {
        Node<T> temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println("X");
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        One<String> one = new One<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Data:- ");
            String data = sc.nextLine();
            one.addData(data);
        }

        one.printData();
    }
}

class Node<T> {
    T data;
    Node next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}
