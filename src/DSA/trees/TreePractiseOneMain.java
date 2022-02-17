package DSA.trees;

public class TreePractiseOneMain {
    public static void main(String[] args) {
        TreePractiseOne treePractiseOne = new TreePractiseOne();
        TreePractiseOne.Node node = treePractiseOne.createTree();

        System.out.println("Inorder Traversal :- ");
        treePractiseOne.inOrder(node);
    }
}
