package DSA.binarytrees;

public class BinTwo {
    public Node1 insert(Node1 node, int data) {
        if(node == null) {
            return new Node1(data);
        } else if(data<node.data){
            node.left = insert(node,data);
        } else if(data> node.data){
            node.right = insert(node, data);
        }

        return node;
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
