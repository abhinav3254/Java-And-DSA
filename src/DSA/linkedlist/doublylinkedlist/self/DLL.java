package DSA.linkedlist.doublylinkedlist.self;

public class DLL {
    private Node head;
    private Node tail;
    private int size;


    public void addFirst (int data) {
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node temp = head;
        System.out.print("Null");
        while (temp!=null){
            System.out.print(" <-"+temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    class Node {
        private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
        }
    }
}
