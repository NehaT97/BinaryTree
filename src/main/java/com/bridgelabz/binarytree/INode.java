package com.bridgelabz.binarytree;

public class INode<T> {
    private T key;
    private INode<T> left;
    private INode<T> right;

    public INode(T key) {
        this.key = key;
    }

    public T getkey() {
        return key;
    }

    public void setkey(T key) {
        this.key = key;
    }

    public INode<T> getLeft() {
        return left;
    }

    public void setLeft(INode<T> left) {
        this.left = left;
    }

    public INode<T> getRight() {
        return right;
    }

    public void setRight(INode<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "INode{" +
                "key=" + key +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
