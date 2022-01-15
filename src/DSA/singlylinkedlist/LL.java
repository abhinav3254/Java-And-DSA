package DSA.singlylinkedlist;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public void addFirst (int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }
        size +=1;
    }
    public void display () {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void addLast (int data) {
        if(tail == null){
            System.out.println("Insert an item First");
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }

    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

}
