package DSA.binarytrees;

public class BIN_DELETE_Two {

    // Calculating Height
    private int height(Node node) {
        if(node== null) {
            return 0;
        } else {
            int left = height(node.left);
            int right = height(node.right);
            return Math.max(left,right)+1;
        }
    }

    // Level Order Travsersal

    public void levelOrderTraversal(Node node) {
        int h = height(node);
        for(int i=1;i<=h;i++) {
            levelOrderTraversalHelper(node, i);
        }
    }
    private void levelOrderTraversalHelper(Node node,int level) {
        if(node == null) {
            return;
        }
        if(level==1) {System.out.print(node.data+" ");}
        if(level>1) {
            levelOrderTraversalHelper(node.left, level-1);
            levelOrderTraversalHelper(node.right, level-1);
        }
    }

    // Right Most Number

    public int rightMost(Node node) {
        if(node == null) {
            return 0;
        }
        while(node.right.right!=null) {
            node = node.right;
        }
        int a = node.right.data;
        node.right = null;
        return a;
    }

    // Insertion
    public Node insert(Node node,int key,int right_most) {
        if(node == null) {
            return null;
        }
        if(node.data == key) {
            node.data = right_most;
            return node;
        }
        insert(node.left, key, right_most);
        insert(node.right, key, right_most);

        return node;
    }

    public static void main(String[] args) {
        Node node = new Node(13);
        node.left = new Node(12);
        node.left.left = new Node(4);
        node.left.right = new Node(19);

        node.right = new Node(10);
        node.right.left = new Node(16);
        node.right.right = new Node(9);

        // Display
        BIN_DELETE_Two bin_DELETE_Two = new BIN_DELETE_Two();
        bin_DELETE_Two.levelOrderTraversal(node);
        // Right Most
        int right_most = bin_DELETE_Two.rightMost(node);
        System.out.println("\nRight Most Number is -> "+right_most);
        bin_DELETE_Two.insert(node, 12, right_most);
        bin_DELETE_Two.levelOrderTraversal(node);

    }
}

class Node {
    Node left;
    int data;
    Node right;

    Node (int data) {
        this.data = data;
    }
}