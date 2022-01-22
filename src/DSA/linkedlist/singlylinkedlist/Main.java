package DSA.linkedlist.singlylinkedlist;

public class Main {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.display();

//        ll.addLast(66);
//        ll.addLast(55);

//        ll.addAtIndex(25,3);
//        ll.addAtIndex(77,3);
//
//        ll.display();

        // here indexing start from zero
        ll.delete(2);
        ll.display();

    }
}
