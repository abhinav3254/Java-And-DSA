package DSA.binarytrees;

import java.util.Scanner;

public class BThree {

    Scanner sc = new Scanner(System.in);

    public Node insert() {
        System.out.print("Data:- ");
        int data = sc.nextInt();
        if(data == -1) {
            return null;
        }

        Node node = new Node(data);

        System.out.println("left of "+data);
        node.left = insert();
        System.out.println("Right of "+data);
        node.right = insert();

        return node;
    }

    public void print(Node node) {
        if (node == null) {
            return;
        }
        print(node.left);
        System.out.print(node.data+" ");
        print(node.right);
    }

    public static void main(String[] args) {
        BThree bThree = new BThree();

        Node node = bThree.insert();
        bThree.print(node);
    }
    static class Node {
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
