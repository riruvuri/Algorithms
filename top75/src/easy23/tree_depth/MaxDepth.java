package easy23.tree_depth;

import binarysearchtrees.algorithm.BinaryTreeNode;

public class MaxDepth {
    public int findMaxDepth(BinaryTreeNode root) {
        if (root == null)  {
            return 0;
        }

        return maxDepthHelper(root);
    }

    private int maxDepthHelper(BinaryTreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }

        int leftHeight = 0, rightHeight = 0;
        if (treeNode.left != null) {
            leftHeight = maxDepthHelper(treeNode.left);
        }

        if (treeNode.right != null) {
            rightHeight = maxDepthHelper(treeNode.right);
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
