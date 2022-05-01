package DSA.linkedlist.practise;

public class D3 {
    private Node head;
    public void insertData(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void display() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println("X");
    }

    public static void main(String[] args) {
        D3 d3 = new D3();
        d3.insertData(1);
        d3.insertData(2);
        d3.insertData(3);
        d3.insertData(4);
        d3.insertData(5);
        d3.insertData(6);

        d3.display();
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
