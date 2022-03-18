package DSA.binarytrees;

import java.util.Scanner;


public class BINTREETWO {
    static Scanner  sc = new Scanner(System.in);
    static public Node createTree() {
        System.out.print("Enter DATA");
        int data = sc.nextInt();
        if(data == -1) {
            return null;
        }

        Node node = new Node(data);

        System.out.println(data+"'s Left Value");
        node.left = createTree();
        
        System.out.println(data+"'s Right Value");
        node.right = createTree();

        return node;
    }

    static public int heightTree(Node node) {
        if(node == null) {
            return 0;
        } 
        int left = heightTree(node.left);
        int right = heightTree(node.right);

        return Math.max(left, right)+1;
    }

    // Leve Order Starts From Here

    static public void LevelOrder(Node node,int height) {
        for (int i = 1;i<=height;i++) {
            helper(node,i);
        }
    }

    static private void helper(Node node,int height) {
        if(node == null) {
            return;
        }
        if(height == 1) {
            System.out.print(node.data+" ");
        }
        else if (height>1) {
            helper(node.left, height-1);
            helper(node.right, height-1);
        }
    }

    // Normal Display Method
    static public void display(Node node) {
        if(node == null) {
            return;
        } 
        System.out.print(node.data+" ");
        display(node.left);
        display(node.right);
    }
    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node node = createTree();
        int height = heightTree(node);
        System.out.println();
        System.out.println();
        System.out.println("Height Of the tree is:- "+height);
        System.out.println("Level Order From Here");
        LevelOrder(node, height);
        // display(node);
    }
}
