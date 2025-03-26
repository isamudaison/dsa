package org.creft.data.structure.list;

import org.creft.data.structure.graph.NodeIdentifier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    private DoublyLinkedList<Integer> doublyLinkedList;
    private ListNode<Integer> nodeA;
    private ListNode<Integer> nodeB;
    private ListNode<Integer> nodeC;
    private ListNode<Integer> nodeD;
    private ListNode<Integer> nodeE;
    private ListNode<Integer> nodeF;
    private ListNode<Integer> nodeG;


    @BeforeEach
    void setUp() {
        this.doublyLinkedList = new DoublyLinkedList<>(10);
        nodeA = new ListNode<>(new NodeIdentifier<>(1));
        nodeB = new ListNode<>(new NodeIdentifier<>(2));
        nodeC = new ListNode<>(new NodeIdentifier<>(3));
        nodeD = new ListNode<>(new NodeIdentifier<>(4));
        nodeE = new ListNode<>(new NodeIdentifier<>(5));
        nodeF = new ListNode<>(new NodeIdentifier<>(6));
        nodeG = new ListNode<>(new NodeIdentifier<>(7));
    }

    @Test
    void addNodeToTail() {
        this.doublyLinkedList.addNodeToTail(nodeA);

        assertEquals(nodeA, this.doublyLinkedList.getTail());
    }

    @Test
    void addNodeToHead() {
        this.doublyLinkedList.addNodeToHead(nodeA);

        assertEquals(nodeA, this.doublyLinkedList.getTail());
    }

    @Test
    void removeNodeByRef() {
        this.doublyLinkedList.addNodeToHead(nodeA);

        assertEquals(nodeA, this.doublyLinkedList.getTail());

        this.doublyLinkedList.removeNode(nodeA);

        assertEquals(0, this.doublyLinkedList.getSize());

        assertNull(this.doublyLinkedList.findNode(new NodeIdentifier<>(1)));
    }

    @Test
    void findNode() {

        this.doublyLinkedList.addNodeToHead(nodeA);
        this.doublyLinkedList.addNodeToHead(nodeB);
        this.doublyLinkedList.addNodeToHead(nodeC);
        this.doublyLinkedList.addNodeToHead(nodeD);
        this.doublyLinkedList.addNodeToHead(nodeE);

        assertEquals(nodeC, this.doublyLinkedList.findNode(new NodeIdentifier<>(3)));
    }

    @Test
    void testRemoveNodeById() {

        this.doublyLinkedList.addNodeToHead(nodeA);

        assertEquals(nodeA, this.doublyLinkedList.getTail());

        this.doublyLinkedList.removeNode(new NodeIdentifier<>(1));

        assertEquals(0, this.doublyLinkedList.getSize());

        assertNull(this.doublyLinkedList.findNode(nodeA));

    }

    @Test
    void getHead() {

        this.doublyLinkedList.addNodeToHead(nodeA);

        assertEquals(nodeA, this.doublyLinkedList.getHead());

        this.doublyLinkedList.addNodeToHead(nodeC);

        assertEquals(nodeC, this.doublyLinkedList.getHead());
    }

    @Test
    void setHead() {

        this.doublyLinkedList.setHead(nodeA);

        assertEquals(nodeA, this.doublyLinkedList.getHead());

        this.doublyLinkedList.setHead(nodeC);

        assertEquals(nodeC, this.doublyLinkedList.getHead());
    }

    @Test
    void getTail() {

        this.doublyLinkedList.setTail(nodeA);

        assertEquals(nodeA, this.doublyLinkedList.getTail());

        this.doublyLinkedList.setTail(nodeC);

        assertEquals(nodeC, this.doublyLinkedList.getTail());
    }

    @Test
    void setTail() {

        this.doublyLinkedList.setTail(nodeA);

        assertEquals(nodeA, this.doublyLinkedList.getTail());

        this.doublyLinkedList.setTail(nodeC);

        assertEquals(nodeC, this.doublyLinkedList.getTail());
    }

    @Test
    void getSize() {

        this.doublyLinkedList.addNodeToHead(nodeA);

        assertEquals(1, this.doublyLinkedList.getSize());

        this.doublyLinkedList.addNodeToHead(nodeB);

        assertEquals(2, this.doublyLinkedList.getSize());

        this.doublyLinkedList.addNodeToHead(nodeC);

        assertEquals(3, this.doublyLinkedList.getSize());

        this.doublyLinkedList.removeNode(nodeA);

        assertEquals(2, this.doublyLinkedList.getSize());

    }
}