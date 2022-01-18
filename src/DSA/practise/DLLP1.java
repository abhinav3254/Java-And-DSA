package DSA.practise;

public class DLLP1 {
    Node head;
    Node tail;
    void addLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
            node.prev = null;
            node.next = null;
        }else{
            tail.next = node;
            tail = tail.next;
            
        }
    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}

class AP1{
    public static void main(String[] args) {
        DLLP1 dllp1 = new DLLP1();
        dllp1.addLast(1);
        dllp1.addLast(2);
        dllp1.addLast(3);
        dllp1.addLast(4);
        dllp1.addLast(5);

        dllp1.display();
    }
}
