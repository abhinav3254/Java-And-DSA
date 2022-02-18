package DSA.binarytrees;

import java.util.Scanner;

public class LevelOrderTraversal {


    Scanner sc = new Scanner(System.in);

    public Node createTree () {
        Node node;
        System.out.print("Enter Data:- ");
        int data = sc.nextInt();
        if(data == -1) {
            return null;
        }
        node = new Node(data);

        System.out.println(data+"'s left");
        node.left = createTree();
        System.out.println(data+"'s right");
        node.right = createTree();

        return node;
    }

    public void levelOrderTraversal(Node node) {
        for(int i = 0;i<=height(node);i++){
            loT(node,i);
        }
    }

    public void loT (Node node,int level) {
        if(node == null) {
            return;
        }
        if(level == 1) {
            System.out.print(node.data+" ");
        }
        else{
            loT(node.left,level-1);
            loT(node.right,level-1);
        }
    }

    public int height (Node node) {
        if (node == null) {
            return 0;
        }

        int left = height(node.left);
        int right = height(node.right);

        return Math.max(left,right)+1;
    }

    class Node {
        Node left;
        int data;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}

class Main3 {
    public static void main(String[] args) {
        LevelOrderTraversal orderTraversal = new LevelOrderTraversal();
        LevelOrderTraversal.Node node = orderTraversal.createTree();

        System.out.println(orderTraversal.height(node));

        orderTraversal.levelOrderTraversal(node);
    }
}
