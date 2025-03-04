package org.creft.data.structure.tree;

import org.creft.data.structure.graph.NodeIdentifier;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T extends Comparable<T>> {
    T data;
    NodeIdentifier<?> nodeIdentifier;
    List<TreeNode<T>> children;

    public TreeNode(T data, NodeIdentifier<?> nodeIdentifier) {
        this.nodeIdentifier = nodeIdentifier;
        this.data = data;
        this.children = new ArrayList<>();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodeIdentifier<?> getNodeIdentifier() {
        return nodeIdentifier;
    }

    public void setNodeIdentifier(NodeIdentifier<?> nodeIdentifier) {
        this.nodeIdentifier = nodeIdentifier;
    }

    public List<TreeNode<T>> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode<T>> children) {
        this.children = children;
    }
}
