package org.creft.data.structure.graph;

public class BTreeNode<T extends Comparable<T>> {
    private final T data;
    private BTreeNode<T> left;
    private BTreeNode<T> right;

    public BTreeNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public BTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BTreeNode<T> left) {
        this.left = left;
    }

    public BTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BTreeNode<T> right) {
        this.right = right;
    }
}
