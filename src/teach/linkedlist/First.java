package teach.linkedlist;

public class First {

    private Node head = null;
    static int count = 0;

    public Node addData(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }

        count++;
        return node;
    }

    public void printData(Node node) {
        Node temp = node;
        while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println("X");
    }

    public static void main(String[] args) {
        First first = new First();
        Node node = first.addData(10);
        node = first.addData(20);
        node = first.addData(30);
        node = first.addData(40);
        node = first.addData(50);

        first.printData(node);

        System.out.println("Length of the Linked List-> "+count);
    }
}

//creating node
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
