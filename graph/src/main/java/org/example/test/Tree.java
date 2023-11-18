package org.example.test;

import java.util.Scanner;

public class Tree {

    static Scanner sc = null;

    static Node createTree() {

        Node root = null;

        System.out.println("data: ");
        int data = sc.nextInt();

        if (data == -1) return null;

        root = new Node(data);

        System.out.println("Enter left of "+data);
        root.left = createTree();

        System.out.println("Enter right of "+data);
        root.right = createTree();

        return root;
    }

    public static void printTree(Node node) {
        if (node == null) return;
        System.out.println(node.data+" ");
        printTree(node.left);
        printTree(node.right);
    }

    public static void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);
    }

    public static void postOrder(Node node) {
        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }

    public static void preOrder(Node node) {
        if (node == null) return;
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        Node node = createTree();
//        printTree(node);

        System.out.println("inorder LDR");
        inorder(node);
        System.out.println();
        System.out.println("postorder LRD");
        postOrder(node);
        System.out.println();
        System.out.println("preorder RLD");
        preOrder(node);

    }

}
