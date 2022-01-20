package DSA.practise;

public class D1 {
    protected Node head;
    protected Node tail;

    public void addLast(int data) {
        Node node = new Node(data);
        if(head==null){
            head = node;
            tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = tail.next;
        }
    }

    public void deleteBegin(){
        head = head.next;
        head.prev = null;
    }

    public void deleteLast(){
        tail = tail.prev;
        tail.next = null;
    }

    public void display() {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayReverse(){

        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    class Node{
        private Node prev;
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}

class AA{

    public static void main(String[] args) {
        D1 d1 = new D1();
        d1.addLast(1);
        d1.addLast(2);
        d1.addLast(3);
        d1.addLast(4);
        d1.addLast(5);


        d1.display();

        d1.displayReverse();

        d1.deleteBegin();

        d1.display();
        d1.displayReverse();

        d1.deleteLast();

        d1.display();
        d1.displayReverse();
    }
}