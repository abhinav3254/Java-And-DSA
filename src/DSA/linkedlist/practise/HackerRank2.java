package DSA.linkedlist.practise;

public class HackerRank2 {
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

    public Node addAt(int index,int data) {
        Node node = new Node(data);
        Node temp = head;
        Node helper = head.next;
        for(int i = 1;i<index;i++){
            temp = temp.next;
            helper = helper.next;
        }
        temp.next = node;
        node.next = helper;

        return node;
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}

class A2{
    public static void main(String[] args) {
        HackerRank2 hackerRank2 = new HackerRank2();

        hackerRank2.addLast(16);
        hackerRank2.addLast(3);
        hackerRank2.addLast(7);

        hackerRank2.display();

        hackerRank2.addAt(2,1);
        hackerRank2.display();
    }
}
