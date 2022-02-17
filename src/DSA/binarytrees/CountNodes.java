package DSA.binarytrees;

import java.util.Scanner;

public class CountNodes {

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


    // Using Different Way Counting Nodes
    public int countNode2(Node node) {
        if(node == null) {
            return 0;
        }
        int left = countNode2(node.left);
        int right = countNode2(node.right);

        return left+right+1;
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

class Main2 {
    public static void main(String[] args) {
        CountNodes countNodes = new CountNodes();

        CountNodes.Node node = countNodes.createTree();

        countNodes.inOrder(node);

        System.out.println("Total Node in the tree is :- "+ countNodes.countNode());

        System.out.println("Total Node 2nd way output is :- "+countNodes.countNode2(node));
    }
}
