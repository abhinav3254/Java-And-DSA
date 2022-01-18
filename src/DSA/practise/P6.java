package DSA.practise;

public class P6 {
    Node head;
    Node tail;

    void addLast(int data){
        Node node = new Node(data);
        if(head==null){
            head = node;
        }
        else{
            tail = node;
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    void displayTail(){
        System.out.println(tail.data);
    }

    class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}

class A6{
    public static void main(String[] args) {
        P6 p6 = new P6();
        p6.addLast(1);
        p6.addLast(2);
        p6.addLast(3);
        p6.addLast(4);
        p6.addLast(5);


        p6.displayTail();

        p6.display();
    }
}
