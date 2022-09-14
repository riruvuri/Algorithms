package application.depthfirstsearch.bottom_up.maxdiameter;

import binarysearchtrees.algorithm.BinaryTreeNode;

public class BinaryTreeMaxDiameter {

    public int getMaxDiameter(BinaryTreeNode root) {
        int[] diameter = new int[1];

        maxDiameterHelper(root, diameter);
        return diameter[0];
    }

    private int maxDiameterHelper(BinaryTreeNode root, int[] diameter) {
        if (root == null) {
            return 0;
        }

        int left = 0;
        if (root.left != null) {
            left =maxDiameterHelper(root.left, diameter) + 1;
        }

        int right = 0;
        if (root.right != null) {
            right =maxDiameterHelper(root.right, diameter) + 1;
        }

        int maxDiameter = Math.max(left+right, diameter[0]);
        diameter[0] = maxDiameter;

        return Math.max(left, right);
    }
}