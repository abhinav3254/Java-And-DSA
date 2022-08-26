package adarshjain.singlylinkedlist;

public class One {
    static class Node {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public Node insert (int data) {
        Node node = new Node(data);
        if (head != null) {
            node.next = head;
        }
        head = node;

        return node;
    }

    public void print (Node node) {
        Node temp = node;

        while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println("X");
    }

    public static void main(String[] args) {
        One one = new One();
        Node node = one.insert(10);
        node = one.insert(20);
        node = one.insert(30);
        node = one.insert(40);
        node = one.insert(50);

        one.print(node);

        System.out.println(one.head.data);
    }
}
