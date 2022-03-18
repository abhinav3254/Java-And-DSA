package DSA.binary_search_trees;

public class BSTTwo {
    public Node insert(Node node, int val) {
        if (node == null) {
            return createFirstNode(val);
        }

        if (val < node.data) {
            node.left = insert(node.left, val);
        } else if (val > node.data) {
            node.right = insert(node.right, val);
        }

        return node;
    }

    private Node createFirstNode(int val) {
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;

        return node;
    }

    // Level Order Travsersal

    public void display(Node node) {
        int h = height(node);
        for (int i = 1; i <= h; i++) {
            helper(node, i);
        }
    }

    private void helper(Node node, int level) {
        if (node == null) {
            return;
        } else if (level == 1) {
            System.out.print(node.data + " ");
        } else if (level > 1) {
            helper(node.left, level - 1);
            helper(node.right, level - 1);
        }
    }

    // Height of the tree
    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);

        return Math.max(left, right) + 1;
    }

    // Find Min Value from the BST

    public void minValue (Node node) {
        if(node == null ) {
            return;
        } else {
            while(node.left != null) {
                node = node.left;
            }
            System.out.println(node.data+" is the min value");
        }
    }

    // Find Max Value from the BST

    /*
     * --> max value in the bst will lie in the right most side of the Tree
     */

    public void maxValue(Node node) {
        if (node == null) {
            return;
        } else {
            while (node.right != null) {
                node = node.right;
            }

            System.out.println(node.data + " is the Max Value in the Tree");
        }
    }
}

class Node {
    int data;
    Node left;
    Node right;
}

class BSTTwoApp {
    public static void main(String[] args) {
        Node root = null;
        BSTTwo bstTwo = new BSTTwo();

        root = bstTwo.insert(root, 8);
        root = bstTwo.insert(root, 3);
        root = bstTwo.insert(root, 6);
        root = bstTwo.insert(root, 10);
        root = bstTwo.insert(root, 4);
        root = bstTwo.insert(root, 7);
        root = bstTwo.insert(root, 1);
        root = bstTwo.insert(root, 14);
        root = bstTwo.insert(root, 13);

        System.out.println("Level order Travsersal");
        bstTwo.display(root);

        System.out.println();
        System.out.println("Max Value in the BST is");

        bstTwo.maxValue(root);

        System.out.println();
        System.out.println("Min Value in the BST is");

        bstTwo.minValue(root);

    }
}