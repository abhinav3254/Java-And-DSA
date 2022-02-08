package DSA.linkedlist.practise;

public class LLBody {
    public Node head;
    Node temp;
    public void addLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            temp = node;
        }
        else{
            temp.next = node;
            temp = temp.next;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteAllList(){
        head = null;
    }
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
