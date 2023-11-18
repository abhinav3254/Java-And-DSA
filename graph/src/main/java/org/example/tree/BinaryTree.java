package org.example.tree;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree() {}


    private static class Node {
        private final int value;
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

    private void populate(Scanner scanner,Node node) {
        System.out.println("Do you want insert left of "+node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of left of "+node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }

        System.out.println("Do you want insert right of "+node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of right of "+node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner,node.right);
        }
    }


    public void display() {
        display(root,"");
    }

    private void display(Node node,String indent) {
        if (node==null) {
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,"\t");
        display(node.right,"\t");
    }


}
