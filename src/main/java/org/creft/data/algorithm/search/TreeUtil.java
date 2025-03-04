package org.creft.data.algorithm.search;

import org.creft.data.structure.graph.NodeIdentifier;
import org.creft.data.structure.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeUtil {

    //Use BFS to find the # of degrees of separation between two nodes in tree
    public static <T extends Comparable<T>> int findDegreesOfSeparation(TreeNode<T> root, NodeIdentifier<?> targetNodeIdentifier){
        if(root == null) return -1;
        if(root.getNodeIdentifier().equals(targetNodeIdentifier)) return 0;

        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.add(root);
        int degreesOfSeparation = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            degreesOfSeparation++;

            for(int i = 0; i < size; i++){
                TreeNode<T> currentTreeNode = queue.poll();

                assert currentTreeNode != null;
                for(TreeNode<T> child : currentTreeNode.getChildren()){
                    if(child.getNodeIdentifier().equals(targetNodeIdentifier))
                        return degreesOfSeparation;

                    queue.add(child);
                }
            }
        }
        return -1;
    }
}
