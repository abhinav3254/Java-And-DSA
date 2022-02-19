package DSA.binarytrees;

import java.util.Scanner;

public class BTree {
    Scanner sc = new Scanner(System.in);
    public Node createTree() {
        System.out.print("Data:- ");
        int data = sc.nextInt();
        if(data == -1) {
            return null;
        }

        Node node = new Node(data);

        System.out.println(data+"'s left");
        node.left = createTree();
        System.out.println(data+"'s right");
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

    public void preOrder(Node node) {
        if(node == null) {
            return;
        }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node node) {
        if(node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }

    public int heightOfTree(Node node) {
        if(node == null) {
            return 0;
        }
        int left = heightOfTree(node.left);
        int right = heightOfTree(node.right);

        return Math.max(left,right)+1;
    }

    public int maxInBTree(Node node) {
        if(node == null) {
            return 0;
        }

        var val = node.data;
        int left = maxInBTree(node.left);
        int right = maxInBTree(node.right);

        if(left>val) {
            val = left;
        }
        if(right>val) {
            val = right;
        }

        return val;
    }

    class Node {
        int data;
        Node left,right;

        Node (int data) {
            this.data = data;
        }
    }
}

class Main4 {
    public static void main(String[] args) {
        BTree bTree = new BTree();
        BTree.Node node = bTree.createTree();
        System.out.println();
        System.out.println("InOrder:- ");
        bTree.inOrder(node);
//        System.out.println();
//        System.out.println("preOrder:- ");
//        bTree.preOrder(node);
//        System.out.println();
//        System.out.println("PostOrder:- ");
//        bTree.postOrder(node);

        System.out.println("Height :- "+bTree.heightOfTree(node));

        System.out.println("Max in Tree is :- "+bTree.maxInBTree(node));
    }
}
