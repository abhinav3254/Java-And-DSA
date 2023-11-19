package org.example.tree;

public class GenericsNode<T> {

    T data;
    GenericsNode<T> left;
    GenericsNode<T> right;

    public GenericsNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
