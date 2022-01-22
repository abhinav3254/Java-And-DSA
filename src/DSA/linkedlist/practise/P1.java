package DSA.linkedlist.practise;

public class P1 {
    private Node head;
    private int size;

    public void addFirst(int data){
        Node node = new Node(data);
        size++;
        if(head == null){
            head = node;
        }else{
            node.next = head;
            head = node;
        }
    }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}

class Main {
    public static void main(String[] args) {
        P1 p1 = new P1();
        p1.addFirst(1);
        p1.addFirst(2);
        p1.addFirst(3);
        p1.addFirst(4);
        p1.addFirst(5);

        p1.display();
    }
}
