package DSA.binarytrees;

public class BinTwo {
    public Node1 insert(Node1 node, int data) {
        if(node == null) {
            return new Node1(data);
        } else if(data<node.data){
            node.left = insert(node.left,data);
        } else if(data> node.data){
            node.right = insert(node.right, data);
        }

        return node;
    }

    public void print(Node1 node) {
        if(node == null) {
            return;
        }
        print(node.left);
        System.out.print(node.data+" ");
        print(node.right);
    }

    public static void main(String[] args) {
        BinTwo binTwo = new BinTwo();
        Node1 root = null;
        root = binTwo.insert(root,8);
        root = binTwo.insert(root,3);
        root = binTwo.insert(root,6);
        root = binTwo.insert(root,10);
        root = binTwo.insert(root,4);
        root = binTwo.insert(root,7);
        root = binTwo.insert(root,1);
        root = binTwo.insert(root,14);
        root = binTwo.insert(root,13);

        binTwo.print(root);
    }
}

class Node1 {
    Node1 left;
    int data;
    Node1 right;

    public Node1(int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }
}
