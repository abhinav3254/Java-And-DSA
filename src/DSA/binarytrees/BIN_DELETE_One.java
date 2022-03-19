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

    // Right Most Element
    public int rightMost(Node node) {
        if(node == null) {
            return 0;
        } else {
            while (node.right.right!=null) {
                node = node.right;
            }
        }
        System.out.println();
        System.out.print(node.data+" right node element");
        int a = node.right.data;
        node.right = null;
        return a;
    }

    public void search(Node node,int val) {
        int h = height(node);
        for(int i = 1;i<=h;i++) {
            searchHelper(node, i,val);
        }
    }
    public void searchHelper(Node node,int level,int val) {
        if(node == null) {
            return;
        }
        if(level == 1) {
            if(node.data == val){
                System.out.print("item found at level "+level);
            }
            if(level>1) {
                searchHelper(node.left, level-1, val);
                searchHelper(node.right, level-1, val);
            }
        }
    }

    public static void main(String[] args) {
        //Node node = null;
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
        System.out.println(right_most);

        // search
        System.out.println("search");
        // if(bin_DELETE_One.search(node, 12)){
        //     System.out.println("Item Found");
        // } else{
        //     System.out.println("Not Found");
        // }

        // bin_DELETE_One.search(node, 12);
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
