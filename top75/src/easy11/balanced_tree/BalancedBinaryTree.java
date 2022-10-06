package easy11.balanced_tree;

import binarysearchtrees.algorithm.BinaryTreeNode;

public class BalancedBinaryTree {
    public boolean isBalanced(BinaryTreeNode binaryTreeNode) {
        if (binaryTreeNode == null || binaryTreeNode.left == null || binaryTreeNode.right == null) {
            return true;
        }

        int treeHeight = dfsHelper(binaryTreeNode);

        return treeHeight >= 0;
    }

    private int dfsHelper(BinaryTreeNode binaryTreeNode) {
        if (binaryTreeNode == null) {
            return 0;
        }

        int leftHeight = 0;
        if (binaryTreeNode.left != null) {
            leftHeight = dfsHelper(binaryTreeNode.left) + 1;
        }

        int rightHeight = 0;
        if (binaryTreeNode.right != null) {
            rightHeight = dfsHelper(binaryTreeNode.right) + 1;
        }

        if (leftHeight < 0 || rightHeight < 0 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight);
    }
}
