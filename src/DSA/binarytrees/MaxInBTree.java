package DSA.binarytrees;

import java.util.Scanner;

public class MaxInBTree {
    Scanner sc = new Scanner(System.in);

    public Node createTree() {
        Node node;
        System.out.print("Enter Data:- ");
        int data = sc.nextInt();

        if(data == -1) {
            return null;
        }

        node = new Node(data);

        System.out.println(data+"'s left");
        node.left = createTree();
        System.out.println(data+"'s right");
        node.right = createTree();

        return node;
    }

    public void inOrder(Node node) {
        if(node == null ) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }

    public int findMax(Node node) {
        if(node  == null ){
            return Integer.MIN_VALUE;
        }
        int left = findMax(node.left);
        int value = node.data;
        int right = findMax(node.right);

        if(left>value) {
            value = left;
        } else if(right>value) {
            value = right;
        }
        return value;
        }

    public int findMin(Node node) {
        if(node == null) {
            return Integer.MAX_VALUE;
        }

        int left = findMin(node.left);
        int value = node.data;
        int right = findMin(node.left);

        if (left < value)
            value = left;
        if (right < value)
            value = right;
        return value;
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
        MaxInBTree max = new MaxInBTree();
        MaxInBTree.Node node = max.createTree();
        System.out.println();
        System.out.println(max.findMax(node));
        System.out.println("Minimum value is :- "+max.findMin(node));
    }
}
