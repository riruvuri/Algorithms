package application.depthfirstsearch;

import binarysearchtrees.algorithm.BinaryTreeNode;

public class BinaryTreeHeight {

    public int getMaxHeight(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        return bstHelper(root);
    }

    private int bstHelper(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = bstHelper(node.left) + 1;
        int rightHeight = bstHelper(node.right) + 1;

        int currentHeight = Math.max(leftHeight, rightHeight);

        return currentHeight;
    }
}
