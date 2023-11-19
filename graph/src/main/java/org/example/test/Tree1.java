package org.example.test;

import java.util.Scanner;

public class Tree1 {

    private static Scanner sc;

    public static Node createTree() {

        Node root = null;

        System.out.print("data ");
        int data = sc.nextInt();

        if (data == -1) return null;

        root = new Node(data);

        System.out.println("left of "+data);
        root.left = createTree();

        System.out.println("right of "+data);
        root.right = createTree();

        return root;
    }

    public static void printTree(Node node) {
        if (node == null) return;
        System.out.print(node.data+" ");
        printTree(node.left);
        printTree(node.right);
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        printTree(root);
    }

}
