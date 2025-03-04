package org.creft.data.algorithm.search;

import org.creft.data.structure.graph.NodeIdentifier;
import org.creft.data.structure.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeUtilTest {

    @Test
    void findDegreesOfSeparation() {

        NodeIdentifier<Integer> rootNodeIdentifier = new NodeIdentifier<>(1);
        TreeNode<String> root = new TreeNode<>("A", rootNodeIdentifier);
        NodeIdentifier<Integer> node2NodeIdentifier = new NodeIdentifier<>(2);
        TreeNode<String> node2 = new TreeNode<>("B", node2NodeIdentifier);
        NodeIdentifier<Integer> node3NodeIdentifier = new NodeIdentifier<>(3);
        TreeNode<String> node3 = new TreeNode<>("C", node3NodeIdentifier);
        NodeIdentifier<Integer> node4NodeIdentifier = new NodeIdentifier<>(4);
        TreeNode<String> node4 = new TreeNode<>("D", node4NodeIdentifier);
        NodeIdentifier<Integer> node5NodeIdentifier = new NodeIdentifier<>(5);
        TreeNode<String> node5 = new TreeNode<>("E", node5NodeIdentifier);
        NodeIdentifier<Integer> node6NodeIdentifier = new NodeIdentifier<>(6);
        TreeNode<String> node6 = new TreeNode<>("F", node6NodeIdentifier);

        root.getChildren().add(node2);
        root.getChildren().add(node3);
        node2.getChildren().add(node4);
        node2.getChildren().add(node5);
        node3.getChildren().add(node6);

        assertEquals(2, TreeUtil.findDegreesOfSeparation(root, node5NodeIdentifier)); // Output: 2
        assertEquals(2, TreeUtil.findDegreesOfSeparation(root, node6NodeIdentifier)); // Output: 2
        assertEquals(1, TreeUtil.findDegreesOfSeparation(root, node3NodeIdentifier)); // Output: 1
        assertEquals(-1, TreeUtil.findDegreesOfSeparation(root, new NodeIdentifier<>("ABC"))); // Output: -1 (not found)
    }
}