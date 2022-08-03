package teach.practise;

public class LinkedList {

    private Node head = null;

    public void insert(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next!=null) {
                temp = temp.next;
            }

            temp.next = node;
        }
    }

    public void printData() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println("X");
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);

        linkedList.printData();
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
