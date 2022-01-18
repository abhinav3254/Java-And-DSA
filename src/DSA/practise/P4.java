package DSA.practise;

public class P4 {
    Node head;
    public void addLast(int data){
        Node node = new Node(data);
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
class A4{
    public static void main(String[] args) {
        P4 p4 = new P4();
        p4.addLast(1);
        p4.addLast(2);
        p4.addLast(3);
        p4.addLast(4);
        p4.addLast(5);

        p4.display();
    }
}
