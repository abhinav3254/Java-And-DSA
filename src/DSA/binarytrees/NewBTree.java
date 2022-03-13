package DSA.binarytrees;

import java.util.Scanner;

import DSA.binarytrees.BTree.Node;

public class NewBTree {
    Scanner sc = new Scanner(System.in);

    // Creating Tree
    public Node createTree() { 
        Node node; 
        System.out.print("DATA :-");
        int data = sc.nextInt();
        if(data == -1) {
            return null;
        }

        node  = new Node(data);

        System.out.println(data+"'s left");
        node.left = createTree();
        System.out.println(data+"'s right");
        node.right = createTree();

        return node;
    }

    // Tree Structure
    class Node {
        Node left;
        Node right;
        int data ;
        Node (int data) {
            this.data = data;
        }
    }
}
