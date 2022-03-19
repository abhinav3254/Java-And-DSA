package DSA.binarytrees;

import java.util.Scanner;

public class BIN_DELETE_One {
    Scanner sc = new Scanner(System.in);
    public Node insert() {
        System.out.print("Data:- ");
        int data = sc.nextInt();

        if(data == -1) {
            return null;
        } 
        Node node = new Node(data);
        System.out.print(data+"' left");
        node.left = insert();
        System.out.print(data+"'s right");
        node.right = insert();
        return node;
    }

    public void inOrder(Node node) {
        if(node == null) {
            return;
        } else {
            inOrder(node.left);
            System.out.print(node.data+" ");
            inOrder(node.right);
        }
    }

    // Level Order Travsersal

    public void levelOrderTraversal (Node node) {
        int h = height(node);
        for(int i=1;i<=h;i++) {
            helper(node,i);
        }
    }

    private void helper(Node node,int level) {
        if(node == null) {
            return;
        }
        if (level == 1) {
            System.out.print(node.data+" ");
        } else if(level>1) {
            helper(node.left, level-1);
            helper(node.right, level-1);
        }
    }
    // height Of the Binary tree

    private int height(Node node) {
        if(node == null) {
            return 0;
        } 
        int left = height(node.left);
        int right  = height(node.right);

        return Math.max(left, right)+1;
    } 

    public static void main(String[] args) {
        Node node = null;
        BIN_DELETE_One bin_DELETE_One = new BIN_DELETE_One();
        node = bin_DELETE_One.insert();
        System.out.println("Display");
        bin_DELETE_One.inOrder(node);
        System.out.println();
        System.out.println("Level Order Travsersal:- ");
        bin_DELETE_One.levelOrderTraversal(node);
    }
}
class Node {
    Node left;
    int data;
    Node right;

    Node (int data) {
        this.data = data;
    }
}
