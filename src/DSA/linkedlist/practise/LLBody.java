package DSA.linkedlist.practise;

public class LLBody {
    public Node head;
    Node temp;
    private int count = 0;
    public void addLast(int data){
        count++;
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

    public void delAt(int index){
        Node temp = head;
        Node temp1 = head.next;
        for(int i = 1;i<index-1;i++){
            temp1 = temp1.next;
            temp = temp.next;
        }
        temp.next = temp1.next;
    }

    public void length(){
        System.out.println(count);
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
