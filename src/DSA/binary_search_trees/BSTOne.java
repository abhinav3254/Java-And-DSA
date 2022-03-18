package DSA.binary_search_trees;

public class BSTOne {
    public Node insert(Node node, int val) {
        if (node == null) {
            return createFisrtNode(val);
        }
        if (val < node.data) {
            insert(node.left, val);
        } else if (val > node.data) {
            insert(node.right, val);
        }

        return node;
    }

    public Node createFisrtNode(int val) {
        Node node = new Node(val);
        node.left = null;
        node.data = val;
        node.right = null;

        return node;
    }

    // Level Order Travsersal
    public void displayLOT(Node node) {
        int h = height(node);
        for(int i = 1;i<=h;i++) {

        }
    }

    public void helper(Node node) {
        
    }

    public int height (Node node) {
        if(node == null) {
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);

        return Math.max(left, right)+1;
    }

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    class BSTApp {
        public static void main(String[] args) {
            BSTOne bstOne = new BSTOne();
            Node root = null;

            bstOne.insert(root, 8);
        }
    }
}