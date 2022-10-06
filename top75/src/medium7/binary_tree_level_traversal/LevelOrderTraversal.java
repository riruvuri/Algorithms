package medium7.binary_tree_level_traversal;

import binarysearchtrees.algorithm.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public List<List<Integer>> traverse(BinaryTreeNode treeNode) {
        if (treeNode == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> outputList = new ArrayList<>();
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(treeNode);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> levelOutput = new ArrayList<>();
            outputList.add(levelOutput);
            while (size-- > 0) {
                BinaryTreeNode currentNode = queue.poll();
                levelOutput.add(currentNode.value);

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }

        return outputList;
    }
}
