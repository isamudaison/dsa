package org.creft.data.structure.list;

import org.creft.data.structure.graph.NodeIdentifier;

public class DoublyLinkedList<T extends Comparable<T>> {

    final private ListNode<T> head;
    final private ListNode<T> tail;
    private int size;
    private int capacity;

    public DoublyLinkedList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.head = new ListNode<>(null);
        this.tail = new ListNode<>(null);
        this.head.setNext(this.tail);
        this.tail.setPrev(this.head);
    }

    public boolean addNodeToTail(ListNode<T> node){
        if(this.size >= capacity)
            return false;

        ListNode<T> previousEnd = this.tail.getPrev();
        previousEnd.setNext(node);
        node.setPrev(previousEnd);
        node.setNext(this.tail);
        this.tail.setPrev(node);
        this.size++;
        return true;
    }

    public boolean addNodeToHead(ListNode<T> node){
        if(this.size >= capacity)
            return false;

        ListNode<T> previousBegin = this.head.getNext();
        previousBegin.setPrev(node);
        node.setNext(previousBegin);
        node.setPrev(this.head);
        this.head.setNext(node);
        this.size++;
        return true;
    }

    public void removeNode(NodeIdentifier<T> nodeId){
        //find the node
        ListNode<T> nodeToRemove = findNode(nodeId);
        removeNode(nodeToRemove);
    }

    public ListNode<T> findNode(NodeIdentifier<T> nodeId){
        ListNode<T> currentNode = this.head.getNext();
        while(currentNode != null){
            if(nodeId.equals(currentNode.getNodeIdentifier()))
                return currentNode;
            else
                currentNode = currentNode.getNext();
        }

        return null;
    }

    public ListNode<T> findNode(ListNode node){
        ListNode<T> currentNode = this.head.getNext();
        while(currentNode != null){
            if(currentNode.equals(node))
                return currentNode;
            else
                currentNode = currentNode.getNext();
        }

        return null;
    }

    public void removeNode(ListNode<T> node){
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
        this.size--;
    }

    public ListNode<T> getHead() {
        return head.getNext();
    }

    public void setHead(ListNode<T> head) {
        this.addNodeToHead(head);
    }

    public ListNode<T> getTail() {
        return tail.getPrev();
    }

    public void setTail(ListNode<T> tail) {
        this.addNodeToTail(tail);
    }

    public int getSize() {
        return size;
    }
}
