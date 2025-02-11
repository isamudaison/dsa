package org.creft.data.structure.graph;

import java.sql.Array;
import java.util.*;

public class Graph<T> {
    private final Map<NodeIdentifier, Node<T>> nodeIndex;
    private final Map<Node<T>, List<Node<T>>> nodeGraph;

    public Graph() {
        this.nodeGraph = new HashMap<>();
        this.nodeIndex = new HashMap<>();
    }

    public void addRelation(Node<T> primary, Node<T> neighbor){
        //see if we know about the primary node
        Node<T> parent = nodeIndex.get(primary.getNodeIdentifier());
        if(parent != null){
            nodeGraph.get(parent).add(neighbor);
        }
        else{
            //we need to add this as a new entry
            NodeIdentifier primaryNodeID = primary.getNodeIdentifier();
            nodeIndex.put(primaryNodeID, primary);
            nodeGraph.put(primary, new ArrayList<>(Collections.singletonList(neighbor)));
        }
    }

    public List<Node<T>> getNeighbors(Node<T> node){
        NodeIdentifier nodeIdentifier = node.getNodeIdentifier();

        Node<T> parentNode = nodeIndex.get(nodeIdentifier);

        if(parentNode != null){
            return nodeGraph.get(parentNode);
        }
        else return new ArrayList<Node<T>>(0);
    }
}
