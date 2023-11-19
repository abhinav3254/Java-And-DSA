package org.example.tree;

import java.util.Scanner;

public class GenericsBST<T> {

    private GenericsNode<T> node;

    public void insert(T data) {
        node = insertHelper(node,data);
    }

    public GenericsNode<T> insertHelper(GenericsNode<T> node,T data) {

        if (node == null) {
            node = new GenericsNode<>(data);
            return node;
        }

        Comparable<T> comparable = (Comparable<T>) data;

        if (comparable.compareTo(node.data)<0) {
            //left
            node.left = insertHelper(node.left,data);
        } else if (comparable.compareTo(node.data)>0) {
            // right
            node.right = insertHelper(node.right,data);
        }

        return node;

    }

    public void display() {
        display(node);
    }

    private void display(GenericsNode<T> node) {
        if (node == null) return;
        display(node.left);
        System.out.print(node.data+" ");
        display(node.right);
    }

    public static void main(String[] args) {
        GenericsBST<Integer> genericsInteger = new GenericsBST<>();
        genericsInteger.insert(10);
        genericsInteger.insert(5);
        genericsInteger.insert(15);
        genericsInteger.insert(3);
        genericsInteger.insert(7);
        genericsInteger.insert(12);
        genericsInteger.insert(20);
        genericsInteger.insert(1);
        genericsInteger.insert(4);
        genericsInteger.insert(9);
        genericsInteger.insert(14);

        genericsInteger.display();

        System.out.println();

        GenericsBST<String> genericsString = getStringGenericsBST();

        genericsString.display();


    }

    private static GenericsBST<String> getStringGenericsBST() {
        GenericsBST<String> genericsString = new GenericsBST<>();
        genericsString.insert("apple");
        genericsString.insert("banana");
        genericsString.insert("orange");
        genericsString.insert("grape");
        genericsString.insert("kiwi");
        genericsString.insert("mango");
        genericsString.insert("pear");
        genericsString.insert("melon");
        genericsString.insert("strawberry");
        genericsString.insert("pineapple");
        genericsString.insert("peach");
        return genericsString;
    }

}
