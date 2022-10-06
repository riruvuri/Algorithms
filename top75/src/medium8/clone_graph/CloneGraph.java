package medium8.clone_graph;

import binarysearchtrees.algorithm.TreeNode;

import java.util.*;

public class CloneGraph {

    public TreeNode clone(TreeNode root) {
        if (root == null) {
            return root;
        }
        Queue<TreeNode> refQueue = new LinkedList<>();
        refQueue.add(root);
        Map<Integer, TreeNode> newElementMap = new HashMap<>();
        newElementMap.put(root.value, new TreeNode(root.value));

        while (!refQueue.isEmpty()) {
            TreeNode currentNode = refQueue.poll();
            List<TreeNode> existingChildren = currentNode.children;
            TreeNode newNode = newElementMap.get(currentNode.value);

            if (existingChildren != null) {
                for (TreeNode existingChild : existingChildren) {
                    if (!newElementMap.containsKey(existingChild.value)) {
                        newElementMap.put(existingChild.value, new TreeNode(existingChild.value));

                        refQueue.add(existingChild);
                    }
                    newNode.children.add(newElementMap.get(existingChild.value));
                }
            }
        }

        return newElementMap.get(root.value);
    }
}
