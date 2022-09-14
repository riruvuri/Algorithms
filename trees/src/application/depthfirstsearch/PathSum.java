package application.depthfirstsearch;

import binarysearchtrees.algorithm.BinaryTreeNode;

/**
 * LC# 112
 *
 * Each node is visited exactly once in the binary tree.
 * Time complexity: O(n)
 *
 * O(node_count).
 *
 * Space used for input: O(node_count).
 * Auxiliary space used: O(node_count).
 * Space used for output: O(node_count).
 * So, total space complexity: O(node_count).
 *
 */
public class PathSum {

    private boolean pathSumHelper(BinaryTreeNode currentNode, int currentSum) {
        boolean isPathFound = false;
        currentSum -= currentNode.value;
        if (currentNode.left == null && currentNode.right == null) {
            if (currentSum == 0) {
                isPathFound = true;
            }
            return isPathFound;
        }

        if (currentNode.left != null) {
            isPathFound = pathSumHelper(currentNode.left, currentSum);
        }

        if (!isPathFound && currentNode.right != null) {
            isPathFound = pathSumHelper(currentNode.right, currentSum);
        }

        return isPathFound;
    }

    public boolean hasPathSum(BinaryTreeNode binaryTreeNode, int targetSum) {
        if (binaryTreeNode == null) {
            return false;
        }
        return pathSumHelper(binaryTreeNode, targetSum);
    }
}
