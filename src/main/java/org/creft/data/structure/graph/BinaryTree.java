package org.creft.data.structure.graph;

import java.util.concurrent.atomic.AtomicInteger;

public class BinaryTree<T extends Comparable<T>> {
    private BTreeNode<T> rootNode;

    public BinaryTree(BTreeNode<T> rootNode) {
        this.rootNode = rootNode;
    }

    public BTreeNode<T> getRootNode() {
        return rootNode;
    }

    public void setRootNode(BTreeNode<T> rootNode) {
        rootNode.setLeft(this.rootNode.getLeft());
        rootNode.setRight(this.rootNode.getRight());
        this.rootNode = rootNode;
    }

    //get the 'diameter' of the btree
    public int getDiameter(){
        AtomicInteger diameter = new AtomicInteger(0);

        dfsGetDiameter(this.rootNode, diameter);

        return diameter.get();
    }

    private int dfsGetDiameter(BTreeNode<T> rootNode, AtomicInteger diameter){

        if(rootNode == null)
            return 0;

        int leftLength = dfsGetDiameter(rootNode.getLeft(), diameter);
        int rightLength = dfsGetDiameter(rootNode.getRight(), diameter);

        diameter.set(Math.max(diameter.get(), leftLength+rightLength));

        return Math.max(leftLength, rightLength) + 1;
    }
}
