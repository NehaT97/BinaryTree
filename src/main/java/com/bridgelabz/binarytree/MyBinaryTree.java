package com.bridgelabz.binarytree;

import java.util.Objects;

public class MyBinaryTree<T extends Comparable<T>> {

    private INode<T> root;

    public MyBinaryTree() {
    }

    public void add(T key) {
        this.root = addRecursively(root, key);
    }

    private INode<T> addRecursively(INode<T> current, T key) {
        if (Objects.isNull(current)) {
            return new INode<>(key);
        }
        int result = key.compareTo(current.getkey());
        if (0 == result) {
            return current;
        }
        if (result > 0) {
            current.setRight(addRecursively(current.getRight(), key));
        } else {
            current.setLeft(addRecursively(current.getLeft(), key));
        }
        return current;
    }


    public void display() {
        System.out.println(root);
    }


}
