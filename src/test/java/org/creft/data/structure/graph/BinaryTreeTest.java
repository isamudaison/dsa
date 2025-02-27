package org.creft.data.structure.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void getDiameter() {

        BTreeNode<Integer> root = new BTreeNode<>(1);
        root.setLeft(new BTreeNode<>(2));
        root.setRight(new BTreeNode<>(3));
        root.getLeft().setLeft(new BTreeNode<>(4));
        root.getLeft().setRight(new BTreeNode<>(5));
        root.getRight().setLeft(new BTreeNode<>(6));
        root.getRight().setRight(new BTreeNode<>(7));
        root.getLeft().getRight().setLeft(new BTreeNode<>(8));
        root.getLeft().getRight().setRight(new BTreeNode<>(9));
        root.getRight().getLeft().setRight(new BTreeNode<>(10));

        BinaryTree<Integer> btree = new BinaryTree<>(root);

        int diameter = btree.getDiameter();

        assertEquals(6, diameter);
    }
}