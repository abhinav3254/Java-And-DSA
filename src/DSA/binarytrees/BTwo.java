package DSA.binarytrees;

import java.util.Scanner;

public class BTwo {

    Scanner sc = new Scanner(System.in);

    public Node insert () {
        System.out.print("Enter Data:- ");
        int data = sc.nextInt();
        if(data == -1) {
            return null;
        }
        System.out.println();
        Node node = new Node(data);
        System.out.println("Enter left of "+data);
        node.left = insert();
        System.out.println("Enter right of "+data);
        node.right = insert();

        return node;
    }

    public void inOrder(Node node) {
        if(node == null) {
            return;
        } else {
            inOrder(node.left);
            System.out.print(node.data+"  ");
            inOrder(node.right);
        }
    }

    public static void main(String[] args) {
        BTwo bTwo = new BTwo();

        Node node = bTwo.insert();
        bTwo.inOrder(node);
    }
    class Node {
        int data;
        Node left;
        Node right;

        public Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
