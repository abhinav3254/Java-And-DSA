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
        System.out.println();
        System.out.println("preOrder:- ");
        bTree.preOrder(node);
        System.out.println();
        System.out.println("PostOrder:- ");
        bTree.postOrder(node);
    }
}
