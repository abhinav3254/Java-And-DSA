package DSA.doublylinkedlist.learnt;

public class L1 {
    Node head;
    Node tail;

    void addFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }else{
            head.prev = node;
            node.next = head;
            head = node;
        }
    }

    public void addLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
    }

    void displayHead(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayTail(){
        Node temp = tail;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
    }

    class Node{
        Node next;
        int data;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }
}

class A1{
    public static void main(String[] args) {
        L1 l1 = new L1();
//        l1.addFirst(1);
//        l1.addFirst(2);
//        l1.addFirst(3);
//        l1.addFirst(4);
//        l1.addFirst(5);
//
//        l1.displayHead();
//        l1.displayTail();

        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);

        l1.displayHead();
        l1.displayTail();
    }
}
