package com.bridgelabz.binarytree;

import java.util.Objects;

public class MyBinaryTree<T extends Comparable<T>> {

    private INode<T> root;

    public MyBinaryTree() {
    }

    /* Uc1 :Adding Elements To Tree */
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

    /* Uc2: creating Tree for given size */
    public int size() {
        return getSizeRecursively(root);
    }

    private int getSizeRecursively(INode<T> current) {
        if (Objects.isNull(current)) {
            return 0;
        } else {
            return 1 + getSizeRecursively(current.getLeft()) + getSizeRecursively(current.getRight());
        }
    }

    /*Uc3: Search Element */
    public boolean search(T key) {
        boolean isEleFound = searchRecursively(root, key);
        if (isEleFound) {
            System.out.println(key + " is found in binary tree");
            return true;
        }
        System.out.println(key + " is not found in binary tree");
        return false;
    }

    private boolean searchRecursively(INode<T> current, T key) {
        if (Objects.isNull(current)) {
            return false;
        }
        int compareValue = key.compareTo(current.getkey());
        if (compareValue == 0) {
            return true;
        } else if (compareValue > 0) {
            return searchRecursively(current.getRight(), key);
        } else {
            return searchRecursively(current.getLeft(), key);
        }
    }

}
