package linkedlist;

public class Three {
    static class Node {
        private final int data;
        private Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void addElement(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println("X");
    }

    public static void main(String[] args) {
        Three three = new Three();
        three.addElement(10);
        three.addElement(20);
        three.addElement(30);
        three.addElement(40);

        three.printList();
    }
}
