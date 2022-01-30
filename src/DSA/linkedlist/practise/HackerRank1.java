package DSA.linkedlist.practise;

public class HackerRank1 {
    private Node head;
    private Node tail;

    public void addLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }
        tail.next = node;
        tail = tail.next;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void nodeFromTail(int index){
        int count = 0;
        Node temp = head;
        while(temp!=null) {
            count = count + 1;
            temp = temp.next;
        }
        Node temp1 = head;
        System.out.println(count+" elements in the Linked List");
        for(int i = 1;i<count-index;i++){
            temp1 = temp1.next;
        }
        System.out.println(temp1.data);
    }
    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}

class A{
    public static void main(String[] args) {
        HackerRank1 hackerRank1 = new HackerRank1();
        hackerRank1.addLast(3);
        hackerRank1.addLast(2);
        hackerRank1.addLast(1);
        hackerRank1.addLast(0);

        hackerRank1.display();
        hackerRank1.nodeFromTail(2);
    }
}


