package org.example.tree;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree() {}


    private static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node (int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

    }


//    root node
    private Node root;

    // insert elements
    public void populate(Scanner scanner) {
        System.out.println("Enter the root node value :- ");
        int value = scanner.nextInt();
        root = new Node(value);
//        this is a helper method for recursive call
        populate(scanner,root);
    }

    private void populate(Scanner scanner,Node root) {

    }

}
