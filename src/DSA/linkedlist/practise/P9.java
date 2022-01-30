package DSA.linkedlist.practise;

public class P9 {
    private Node head;

    public void addLast(int data){
        Node node = new Node(data);
        if(head==null){
            head = node;
        } else {
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    private Node tail;
    public void addLastPointer(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        } else{
            tail.next = node;
            tail = tail.next;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}

class A1{
    public static void main(String[] args) {
        P9 p9 = new P9();
//        p9.addLast(1);
//        p9.addLast(2);
//        p9.addLast(3);
//        p9.addLast(4);
//        p9.addLast(5);
//        p9.addLast(6);

        p9.addLastPointer(100);
        p9.addLastPointer(200);
        p9.addLastPointer(300);
        p9.addLastPointer(400);
        p9.addLastPointer(500);

        p9.display();
    }
}
