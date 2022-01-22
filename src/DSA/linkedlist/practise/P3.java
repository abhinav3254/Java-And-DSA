package DSA.linkedlist.practise;

public class P3 {
    Node head;

    public void addLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        else {
            Node temp = head;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void headPosition(){
        System.out.println(head.data);
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
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
class Main3{
    public static void main(String[] args) {
        P3 p3 = new P3();
        p3.addLast(1);
        p3.addLast(2);
        p3.addLast(3);
        p3.addLast(4);
        p3.addLast(5);
        p3.addLast(6);

        p3.headPosition();

        p3.display();
    }
}
