package org.creft.data.structure.graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node<T> {

    private final T data;
    private List<Node<T>> relations;
    private Map<Node<T>, Boolean> relationMap;
    private NodeIdentifier nodeIdentifier;
    private boolean visited = false;

    public Node(T data) {
        this.data = data;
        this.relationMap = new HashMap<>();
        this.nodeIdentifier = new NodeIdentifier(data.toString());
    }

    public NodeIdentifier getNodeIdentifier() {
        return nodeIdentifier;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }


    public T getData() {
        return data;
    }
}
