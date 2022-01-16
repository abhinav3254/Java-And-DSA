package DSA.singlylinkedlist;

public class LLP {
    private Node head;
    private Node tail;
    private int size=0;

    public void insertFirst (int data) {
        Node node = new Node(data);

        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast (int data) {
        if(tail == null){
            System.out.println("Insert Data First");
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }

    public void printData () {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("End");
    }


    public void insertAtIndex (int data,int index) {
        try {
            if (index == 0) {
                insertFirst(data);
                return;
            }
            if (index == size) {
                insertLast(data);
                return;
            }
            if(index>size || index<0) {
                throw new Exception();
            }
            Node node = new Node(data);
            Node temp = head;
            Node temp1 = head.next;
            for (int i = 1; i < index-1; i++) {
                temp = temp.next;
                temp1 = temp1.next;
            }
            temp.next = node;
            node.next = temp1;
            size++;
        } catch (Exception e){
            System.out.println("Enter Valid Index");
        }
    }

    public void delFirst () {
        head = head.next;
        printData();
    }

    public void delLast () {
        Node temp = head;
        while(temp.next!=tail) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        printData();
    }

    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
