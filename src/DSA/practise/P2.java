package DSA.practise;

public class P2 {
    private Node head;
    private int size;

    public void addFirst(int data){
        Node new_node = new Node(data);
        size++;
        if(head==null){
            head = new_node;
        }

        else{
            new_node.next = head;
            head = new_node;
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

    public void getSize(){
        System.out.println(size);
    }

    class Node{
        private int data;
        protected Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}

class Main1{
    public static void main(String[] args) {
        P2 p2 = new P2();
        p2.addFirst(1);
        p2.addFirst(2);
        p2.addFirst(3);
        p2.addFirst(4);
        p2.addFirst(5);
        p2.addFirst(6);

        p2.display();
        p2.getSize();

    }
}
