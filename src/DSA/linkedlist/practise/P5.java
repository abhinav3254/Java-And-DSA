package DSA.linkedlist.practise;

public class P5 {
    Node head;
    int size;
    public void addLast(int data){
        Node node = new Node(data);
        size++;
        if(head == null){
            head = node;
        } else {
            Node temp = head;

            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next = node;
            node.next = null;
        }
    }

    public void delFirst(){
        head = head.next;
    }

    void delLast(){
        Node temp = head;
        for (int i = 1; i < size-1; i++) {
            temp = temp.next;
        }
        temp.next = null;
    }
    public void delLast1(){
        Node temp = head;
        Node temp1 = head.next;
        while(temp1.next!=null){
            temp = temp.next;
            temp1 = temp1.next;
        }
        temp.next = null;
    }

    public void delLast2(){
        Node temp=head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }
    void display () {
        Node temp = head;
        while (temp!=null){
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

class A5{
    public static void main(String[] args) {
        P5 p5 = new P5();
        p5.addLast(1);
        p5.addLast(2);
        p5.addLast(3);
        p5.addLast(4);
        p5.addLast(5);

        p5.display();

//        p5.delFirst();

//        p5.delLast();

//        p5.delLast1();
//        p5.delLast1();
//        p5.delLast1();
//        p5.delLast1();
//
//        p5.addLast(13);
//        p5.addLast(14);
//        p5.addLast(15);

        p5.delLast2();
        p5.delLast2();

        p5.display();
    }
}
