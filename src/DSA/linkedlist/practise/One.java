package DSA.linkedlist.practise;

public class One {

    Node head = null;
    Node tail = null;
    public void insert(int data) {
        Node node = new Node(data);

        if(head==null & tail==null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = tail.next;
        }
    }

    public void print() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" -->  ");
            temp = temp.next;
        }
        System.out.println("X");
    }

    public static void main(String[] args) {
        One one = new One();
        one.insert(10);
        one.insert(20);
        one.insert(30);
        one.insert(40);

        one.print();
    }
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
