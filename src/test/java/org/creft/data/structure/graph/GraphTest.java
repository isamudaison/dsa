package org.creft.data.structure.graph;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    Node<String> nodeA = new Node<>("A");
    Node<String> nodeB = new Node<>("B");
    Node<String> nodeC = new Node<>("C");
    Graph<String> graph;
    @BeforeEach
    void setUp() {
        graph = new Graph<>();

    }

    @AfterEach
    void tearDown() {
        this.graph = null;
    }

    @Test
    void addRelation() {
        graph.addRelation(nodeA, nodeB);
        graph.addRelation(nodeB, nodeC);
        graph.addRelation(nodeA, nodeC);

        List<Node<String>> neighborsOfA = graph.getNeighbors(nodeA);

        assertNotNull(neighborsOfA, "Expected neighbors of A to be a list");
        assertEquals(2, neighborsOfA.size());
        assertEquals(nodeB, neighborsOfA.getFirst());
        assertEquals(nodeC, neighborsOfA.getLast());

        List<Node<String>> neighborsOfB = graph.getNeighbors(nodeB);

        assertNotNull(neighborsOfB, "Expected neighbors of B to be a list");
        assertEquals(1, neighborsOfB.size());
        assertEquals(nodeC, neighborsOfB.getFirst());
    }

    @Test
    void getNeighbors() {
    }
}