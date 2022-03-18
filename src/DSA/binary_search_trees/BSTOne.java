package DSA.binary_search_trees;

public class BSTOne {
    public Node insert(Node node, int val) {
        if (node == null) {
            return createFisrtNode(val);
        }
        if (val < node.data) {
            node.left = insert(node.left, val);
        } else if (val > node.data) {
            node.right = insert(node.right, val);
        }

        return node;
    }

    public Node createFisrtNode(int val) {
        Node node = new Node();
        node.left = null;
        node.data = val;
        node.right = null;

        return node;
    }

    // Level Order Travsersal
    public void displayLOT(Node node) {
        int h = height(node);
        System.out.println();
        System.out.println("Height of the tree is :- " + h);
        System.out.println();
        for (int i = 1; i <= h; i++) {
            helper(node, i);
        }
    }

    private void helper(Node node, int height) {
        // if (node == null) {
        //     return;
        // }
        // if (height == 1) {
        //     System.out.print(node.data + " ");
        // } else if (height > 1) {
        //     helper(node.left, height - 1);
        //     helper(node.right, height - 1);
        // }
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

    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);

        return Math.max(left, right) + 1;
    }

    public void display(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        display(node.left);
        display(node.right);
    }
}

class Node {
    int data;
    Node left;
    Node right;
}

class BSTApp {
    public static void main(String[] args) {
        BSTOne bstOne = new BSTOne();
        Node root = null;

        root = bstOne.insert(root, 8);
        root = bstOne.insert(root, 3);
        root = bstOne.insert(root, 6);
        root = bstOne.insert(root, 10);
        root = bstOne.insert(root, 4);
        root = bstOne.insert(root, 7);
        root = bstOne.insert(root, 1);
        root = bstOne.insert(root, 14);
        root = bstOne.insert(root, 13);

        // bstOne.displayLOT(root);

        System.out.println("Normal travsersal");
        bstOne.display(root);

        // Level Order Travsersal
        System.out.println();
        System.out.println("Level Order Travsersal Starts Here");
        bstOne.displayLOT(root);


    }
}