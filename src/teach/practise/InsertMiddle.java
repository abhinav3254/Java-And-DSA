package teach.practise;

public class InsertMiddle {

    static Node head = null;
    static Node tail = null;
    public static void insert(int data) {

        Node node = new Node(data);

        if(head == null && tail == null) {
            head = node;
            tail = node;
        }

        else {
            tail.next = node;
            tail = tail.next;
        }

    }

    public  static void print() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void insertAt(int data , int index) {
        Node temp = head;
        Node temp1 = temp.next;

        for (int i = 1; i < index-1; i++) {
            temp = temp.next;
            temp1 = temp1.next;
        }

        Node node = new Node(data);
        temp.next = node;
        node.next = temp1;
    }

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insertAt(55,2);

        print();
    }
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
