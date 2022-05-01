package DSA.linkedlist.practise;

public class D4 {
    int size = 0;
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public void insertFirst(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
        }
        else {
            node.next = head;
            head = node;
        }
        size = size+1;
    }

    public void insertLast (int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
        } else {
            Node temp = head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        size = size+1;
    }

    public void insertAt(int index,int val) {
        Node node = new Node(val);
        if(index == 1) {
            insertFirst(val);
            return;
        }
        if(index == size) {
            insertLast(val);
            return;
        } else {
            Node temp = head;
            Node temp2 = temp.next;
            int i = 2;
            while(i != index) {
                i = i+1;
                temp = temp.next;
                temp2 = temp2.next;
            }
            temp.next = node;
            node.next = temp2;
        }
        size = size+1;
    }

    public void deleteFirst() {
        head = head.next;
        size = size-1;
    }

    public void deleteLast() {
        Node temp = head;
        while (temp.next.next!=null) {
            temp = temp.next;
        }
        temp.next = null;
        size = size-1;
    }

    public void deleteAt(int index) {
        if(index == 1) {
            deleteFirst();
        } else if (index == size) {
            deleteLast();
        } else {
            Node temp = head;
            Node temp2 = temp.next.next;
            int i = 2;
            while (i!=index) {
                i++;
                temp = temp.next;
                temp2 = temp2.next;
            }
            temp.next = temp2;
        }
        size = size-1;
    }

    public void display() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        D4 d4 = new D4();
        d4.insertFirst(1);
        d4.insertFirst(2);
        d4.insertFirst(3);
        d4.insertFirst(4);

        d4.insertLast(10);
        d4.insertLast(20);
        d4.insertLast(30);
        d4.insertLast(40);

        System.out.println();

        d4.insertAt(5,5050);


        d4.display();

        d4.deleteFirst();

        d4.display();

        d4.deleteLast();
        d4.display();

        d4.deleteAt(4);
        d4.display();

        System.out.println("size is :- "+d4.size);
    }
}
