package DSA.linkedlist.practise;

public class P7 {
    private Node head;

    public void addLast(int data){
        Node node = new Node(data);
        if(head==null){
            head = node;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
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
class A7{
    public static void main(String[] args) {
        P7 p7 = new P7();
        p7.addLast(1);
        p7.addLast(2);
        p7.addLast(3);
        p7.addLast(4);
        p7.addLast(5);

        p7.display();
    }
}
