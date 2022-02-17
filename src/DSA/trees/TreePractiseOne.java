package DSA.trees;

import java.util.Scanner;

public class TreePractiseOne {
    Scanner sc = new Scanner(System.in);
    public Node createTree() {
        Node node;
        System.out.print("Enter Data");
        int data = sc.nextInt();

        if(data == -1) {
            return null;
        }

        node = new Node(data);

        System.out.println("Enter left of "+data);
        node.left = createTree();
        System.out.println("Enter right of "+data);
        node.right = createTree();

        return node;
    }

    public void inOrder(Node node) {
        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }

    class Node {
        Node left;
        int data;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}
