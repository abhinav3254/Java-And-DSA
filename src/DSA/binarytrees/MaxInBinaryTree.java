package DSA.binarytrees;

import java.util.Scanner;

public class MaxInBinaryTree {

    private int count;
    Scanner sc = new Scanner(System.in);
    public Node createTree() {
        Node node;
        System.out.print("Enter Data:- ");
        int data = sc.nextInt();

        if(data == -1) {
            return null;
        }

        node = new Node(data);
        count++;

        System.out.println(data+"'s left");
        node.left = createTree();
        System.out.println(data+"'s right");
        node.right = createTree();

        return node;
    }

    public int countNode () {
        return count;
    }

    public void inOrder (Node node) {
        if(node == null) {
            return;
        } 

        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }

    public int maxValue (Node node) {
        if(node == null ) {
            return 0;
        } 
        int left = maxValue(node.left);
        int right = maxValue(node.right);

        return Math.max(left, right);

    }

    class Node {
        Node left;
        int data;
        Node right;

        Node (int data) {
            this.data = data;
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        CountNodes countNodes = new CountNodes();

        CountNodes.Node node = countNodes.createTree();

        countNodes.inOrder(node);

        System.out.println("Max Value in the Tree is :- ");
        System.out.println(countNodes.maxValue(node));

        System.out.println("Total Node in the tree is :- "+ countNodes.countNode());
    }
}
