package DSA.binarytrees;

import java.util.Scanner;

public class BIN_DELETE_One {
    Scanner sc = new Scanner(System.in);

    public Node insert() {
        System.out.print("Data:- ");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }
        Node node = new Node(data);
        System.out.print(data + "' left");
        node.left = insert();
        System.out.print(data + "'s right");
        node.right = insert();
        return node;
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        } else {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    // Level Order Travsersal

    public void levelOrderTraversal(Node node) {
        int h = height(node);
        for (int i = 1; i <= h; i++) {
            helper(node, i);
        }
    }

    private void helper(Node node, int level) {
        if (node == null) {
            return;
        }
        if (level == 1) {
            System.out.print(node.data + " ");
        } else if (level > 1) {
            helper(node.left, level - 1);
            helper(node.right, level - 1);
        }
    }
    // height Of the Binary tree

    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);

        return Math.max(left, right) + 1;
    }

    // Right Most Element
    public int rightMost(Node node) {
        if (node == null) {
            return 0;
        } else {
            while (node.right.right != null) {
                node = node.right;
            }
        }
        System.out.println();
        System.out.print(node.data + " right node element");
        int a = node.right.data;
        node.right = null;
        return a;
    }

    // public boolean search(Node node,int key) {
    // if(node==null) {
    // return false;
    // }
    // if(node.data == key) {
    // return true;
    // }

    // boolean res1 = search(node.left, key);

    // if(res1) return true;

    // boolean res2 = search(node.right, key);

    // return res2;
    // }

    public Node search(Node node, int key,int val) {
        if (node == null) {
            return null;
        }
        if (node.data == key) {
            node.data = val;
            return node;
        }

        search(node.left, key,val);

        search(node.right, key,val);

        return node;
    }

    public static void main(String[] args) {
        // Node node = null;
        BIN_DELETE_One bin_DELETE_One = new BIN_DELETE_One();
        // node = bin_DELETE_One.insert();

        Node node = new Node(13);
        node.left = new Node(12);
        node.left.left = new Node(4);
        // node.left.left.left = new Node(-1);
        // node.left.left.right = new Node(-1);
        node.left.right = new Node(19);
        // node.left.right.left = new Node(-1);
        // node.left.right.right = new Node(-1);

        node.right = new Node(10);
        node.right.left = new Node(16);
        // node.right.left.left = new Node(-1);
        // node.right.left.right = new Node(-1);
        node.right.right = new Node(9);
        // node.right.right.left = new Node(-1);
        // node.right.right.right = new Node(-1);

        System.out.println("Display");
        bin_DELETE_One.inOrder(node);
        System.out.println();
        System.out.println("Level Order Travsersal:- ");
        bin_DELETE_One.levelOrderTraversal(node);
        System.out.println();
        int right_most = bin_DELETE_One.rightMost(node);
        System.out.println("\n"+right_most+"  is the right most.........");

        // search
        System.out.println("search");
        bin_DELETE_One.search(node, 12,right_most);
        System.out.println();
        System.out.println("Level Order Travsersal:- ");
        bin_DELETE_One.levelOrderTraversal(node);
    }

}

class Node {
    Node left;
    int data;
    Node right;

    Node(int data) {
        this.data = data;
    }
}
