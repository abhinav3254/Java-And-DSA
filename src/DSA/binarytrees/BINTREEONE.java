package DSA.binarytrees;

import java.util.Scanner;

public class BINTREEONE {

    Scanner sc = new Scanner(System.in);
    public Node createTree() {
        System.out.print("Data :- ");
        int data = sc.nextInt();
        if(data == -1) {
            return null;
        } 
        Node node = new Node(data);

        System.out.print(data+"'s left");
        node.left = createTree();
        System.out.print(data+"'s right");
        node.right = createTree();

        return node;
    }

    public void displayTree(Node node) {
        if(node == null) {
            return;
        }
        Node temp = node;
            System.out.print(temp.data+" ");
            displayTree(node.left);
            displayTree(node.right);
    }

    public int heightTree(Node node) {
        if(node == null) {
            return 0;
        }
        int left = heightTree(node.left);
        int right = heightTree(node.right);
        return Math.max(left, right)+1;
    }

    // Level Order Travsersal Starts From Here
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
}
class Main5 {
    public static void main(String[] args) {
        BINTREEONE b = new BINTREEONE();
        BINTREEONE.Node root = b.createTree();
        b.displayTree(root);
        System.out.println();
        System.out.print(b.heightTree(root)+" is the height of the tree");
    }
}
