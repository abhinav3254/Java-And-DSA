package DSA.doublylinkedlist.learnt;

public class DLL {
    private Node head;

    public void addFirst(int data){
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node node = head;
        while (node!=null){
            System.out.print(node.data+"->");
            node = node.next;
        }
        System.out.println("End");
    }

    private class Node {
        private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
        }
    }
}
