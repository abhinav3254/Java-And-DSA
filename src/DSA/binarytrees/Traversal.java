package DSA.binarytrees;

public class Traversal {
    public static void main(String[] args) {
        First first = new First();

        First.Node node = first.createNode();

        System.out.println("InOrder:- ");
        first.inOrder(node);

        System.out.println("Preorder");
        first.preOrder(node);

        System.out.println("PostOrder");
        first.postOrder(node);

    }
}
