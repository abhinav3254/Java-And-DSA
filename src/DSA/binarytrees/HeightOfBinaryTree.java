package DSA.binarytrees;

import java.util.Scanner;

public class HeightOfBinaryTree {

    Scanner sc = new Scanner(System.in);
    public Node createTree () {
        Node node;
        System.out.print("Enter Data:- ");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        node = new Node(data);

        System.out.println(data+"'s left :- ");
        node.left = createTree();

        System.out.println(data+"'s right :- ");
        node.right = createTree();

        return node;
    }

    public void inOrderTraversal (Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data+" ");
        inOrderTraversal(node.right);
    }

    public int height (Node node) {
        if(node == null) {
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);

        return Math.max(left, right)+1;
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

class Main {
    public static void main(String[] args) {
        HeightOfBinaryTree heightOfBinaryTree = new HeightOfBinaryTree();

        HeightOfBinaryTree.Node node = heightOfBinaryTree.createTree();

        System.out.println(heightOfBinaryTree.height(node));

        heightOfBinaryTree.inOrderTraversal(node);

        
        System.out.println();

        System.out.println("Height of Binary Tree is :- ");
        System.out.println(heightOfBinaryTree.height(node));


    }
}
