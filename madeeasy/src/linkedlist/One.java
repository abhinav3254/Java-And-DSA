package linkedlist;

public class One {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;

    public void insertData (int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void printData () {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println("X");
    }

    public static void main(String[] args) {
        One one = new One();
        one.insertData(10);
        one.insertData(20);
        one.insertData(30);
        one.insertData(40);

        one.printData();
    }
}
