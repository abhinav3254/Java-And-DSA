package DSA.linkedlist.practise;

public class GFG1 {
    public static void main(String[] args) {
        LLBody ll = new LLBody();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.display();

//        ll.deleteAllList();
//        ll.display();

//        ll.delAt(3);
//        ll.display();

        ll.length();

        ll.existsLoop();
    }
}
