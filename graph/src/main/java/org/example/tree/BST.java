package org.example.tree;

import java.util.Scanner;

public class BST {

    private static Scanner sc;

    private static Node root;

    public static void insert(int data) {
        root = insert(root,data);
    }

    private static Node insert(Node node,int data) {

        if (node == null) {
            node = new Node(data);
        }

        if (data<node.data) {
            node.left = insert(node.left,data);
        }
        else if (data>node.data) {
            node.right = insert(node.right,data);
        }

        return node;
    }

    public static void printTree() {
        printTree(root);
    }

    private static void printTree(Node node) {
        if (node == null) return;
        System.out.println(node.data);
        printTree(node.left);
        printTree(node.right);
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        insert(40);
        insert(20);
        insert(60);
        insert(10);
        insert(30);
        insert(50);
        insert(70);


        printTree();

    }

}
