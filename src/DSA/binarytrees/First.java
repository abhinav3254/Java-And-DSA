package DSA.binarytrees;

import java.util.Scanner;

public class First {

    static Scanner sc = new Scanner(System.in);

    public static Node createNode() {
        Node node;
        System.out.print("Enter Data:- ");
        int data = sc.nextInt();

        if(data == -1) {
            return null;
        }

        node = new Node(data);
        System.out.println("Left of "+data);
        node.left = createNode();
        System.out.println("Right of "+data);
        node.right = createNode();
        return node;
    }

    public static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public static void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(Node root) {
        if(root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);

    }
    static class Node {
        Node right;
        int data;
        Node left;

        public Node(int data) {
            this.data = data;
        }
    }
}
