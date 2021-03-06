package DSA.binary_search_trees;

/*
        10
        /   \
        5     40
        /  \      \
        1    7      50 */
public class BSTThree {

    public Node insert(Node node ,int data) {
        if(node == null ){
            return newNode(data);
        } else {
            if(data>=node.data) {
                node.right = insert(node.right, data);
            } else if (data<node.data) {
                node.left = insert(node.left, data);
            }
        }
        return node;
    }

    // Display

    public void display(Node node) {
        int h = height(node);
        for(int i=1;i<=h;i++) {
            helper(node,i);
        }
    }

    private void helper(Node node,int level) {
        if(node == null) {
            return;
        } if (level == 1) {
            System.out.print(node.data+" ");
        } else if (level>1) {
            helper(node.left, level-1);
            helper(node.right, level-1);
        }
    }

    private int height(Node node) {
        if(node == null) {
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);

        return Math.max(left, right)+1;
    }

    private Node newNode(int data) {
        Node node = new Node();
        node.left = null;
        node.right = null;
        node.data = data;

        return node;
    }

    // Inorder Traversal

    public void inOrder(Node node) {
        if(node == null) {
            return;
        } else {
            inOrder(node.left);
            System.out.print(node.data+" ");
            inOrder(node.right);
        }
    }

    // Search For a Val

    public boolean search(Node node,int val) {
        if(node == null) {
            return false;
        } else {
            if (node.data == val) {
                return true;
            } else if (val>node.data) {
                search(node.right, val);
            } else if (val<node.data) {
                search(node.left, val);
            }
        }
        return false;
    }


    class Node {
        Node left;
        Node right;
        int data;
    }

    public static void main(String[] args) {
        BSTThree bstThree = new BSTThree();
        BSTThree.Node node = null;
        // 10, 5, 1, 7, 40, 50
        node = bstThree.insert(node, 10);
        node = bstThree.insert(node, 5);
        node = bstThree.insert(node, 1);
        node = bstThree.insert(node, 7);
        node = bstThree.insert(node, 40);
        node = bstThree.insert(node, 50);

        System.out.println("Level Order Traversal:-");
        bstThree.display(node);
        System.out.println();
        System.out.println("Inorder Traversal");
        bstThree.inOrder(node);
        System.out.println();
        System.out.println("Searching Start Here");
        if (bstThree.search(node, 10)) {
            System.out.println("Item Found");
        } else {
            System.out.println("Item Not found");
        }
    }
}
