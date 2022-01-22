package DSA.linkedlist.circularlinkedlist;

public class CLL {
    private Node head;
    private Node tail;

    public void insertData(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
            tail.next = head;
        }
    }

    public void display(){
        Node temp = head;
        do {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }while (temp!=head);
        System.out.println("null");
    }

    public void delBegining() {
        head = head.next;
        tail.next = head;
    }

    public void delLast(){
        Node temp = head;
//        do{
//            temp = temp.next;
//        } while (temp.next != tail);
//        tail = temp;
//        tail.next = head;

        while(temp.next!=tail){
            temp = temp.next;
        }
        tail = temp;
        tail.next = head;
    }

    public void falseDisplay(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ----->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}

class ALL {
    public static void main(String[] args) {
        CLL cll = new CLL();
        cll.insertData(1);
        cll.insertData(2);
        cll.insertData(3);
        cll.insertData(4);
        cll.insertData(5);
        cll.insertData(6);

        cll.display();

//        cll.delBegining();
        cll.delLast();
        cll.delLast();

        cll.display();
//        cll.falseDisplay();
    }
}
