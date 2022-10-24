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

    int listLength = 0;
    Node head = null;
    public void addElement(int data) {
        listLength++;
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

    public void printMiddle() {
        Node temp = head;
        int newListLength;
        if (listLength%2 == 0) {
            newListLength = listLength/2;
        } else {
            newListLength = (listLength+1)/2;
        }
        int i = 1;

        while (true) {
            if (i == newListLength) {
                System.out.print("Middle element in the list is --> "+temp.data);
                break;
            }
            temp = temp.next;
            i++;
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
        three.addElement(50);
        three.addElement(60);

        three.printList();

        three.printMiddle();
    }
}
