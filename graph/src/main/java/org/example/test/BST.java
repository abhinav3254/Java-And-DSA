package org.example.test;

import java.util.Scanner;

public class BST {

    private static Scanner sc;

    private static Node root;

    public static void createBsTree(int data) {
        root = createBsTree(root,data);
    }

    private static Node createBsTree(Node node, int data) {
        if (node == null) {
            node = new Node(data);
            return node;
        } else if (data>node.data) {
//            insert right
            node.right = createBsTree(node.right,data);
        } else {
//            insert left
            node.left = createBsTree(node.left,data);
        }
        return node;
    }

    public static void displayBst() {
        displayBstHelper(root);
    }

    private static void displayBstHelper(Node node) {
        if (node == null) return;
        System.out.print(node.data+" ");
        displayBstHelper(node.left);
        displayBstHelper(node.right);
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        createBsTree(50);
        createBsTree(40);
        createBsTree(60);
        createBsTree(10);
        createBsTree(90);
        createBsTree(30);

        displayBst();

    }

}
