package DSA.trees;

import java.util.Scanner;

public class First {

    static Scanner sc = new Scanner(System.in);

    public static Node createNode() {
        Node node;
        System.out.print("Enter Data:- ");
        int data = sc.nextInt();

        if(data == -1) {
            return null;
        }

        node = new Node(data);
        System.out.println("Left of "+data);
        node.left = createNode();
        System.out.println("Right of "+data);
        node.right = createNode();
        return node;
    }

    public static void main(String[] args) {
        createNode();
    }

    static class Node {
        Node right;
        int data;
        Node left;

        public Node(int data) {
            this.data = data;
        }
    }
}
