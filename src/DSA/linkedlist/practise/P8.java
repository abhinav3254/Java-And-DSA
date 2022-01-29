package DSA.linkedlist.practise;

public class P8 {
    private Node head;

    public void addFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        Node temp = head;
        while(temp.next !=null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data);
        }
    }
    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
