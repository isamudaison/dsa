package org.creft.data.structure.list;

import org.creft.data.structure.graph.NodeIdentifier;

public class ListNode<T extends Comparable<T>> {

    private ListNode<T> next;
    private ListNode<T> prev;
    private final NodeIdentifier<T> nodeIdentifier;

    public ListNode(NodeIdentifier<T> nodeIdentifier) {
        this.nodeIdentifier = nodeIdentifier;
    }

    public NodeIdentifier<T> getNodeIdentifier() {
        return nodeIdentifier;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    public ListNode<T> getPrev() {
        return prev;
    }

    public void setPrev(ListNode<T> prev) {
        this.prev = prev;
    }
}
