package DSA.linkedlist.practise;

public class D2 {

    Node head = null;
    public void insertData(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void display() {
        Node temp = head;
        if(temp == null) {
            System.out.println("Linked List Empty");
        }
        while(temp.next!=null) {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    class Node {
        Node next;
        int data;

        Node (int data) {
            this.data = data;
        }
    }
}
