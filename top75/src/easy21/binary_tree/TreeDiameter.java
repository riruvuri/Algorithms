package easy21.binary_tree;

import binarysearchtrees.algorithm.BinaryTreeNode;

public class TreeDiameter {

    public int findDiameter(BinaryTreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }

        int[] maxDiameter = new int[1];
        diameterHelper(treeNode, maxDiameter);

        return maxDiameter[0];
    }

    private int diameterHelper(BinaryTreeNode treeNode, int[] maxDiameter) {
        if (treeNode == null) {
            return 0;
        }

        int leftHeight = 0;
        int rightHeight = 0;
        if (treeNode.left != null) {
            leftHeight = diameterHelper(treeNode.left, maxDiameter);
        }

        if (treeNode.right != null) {
            rightHeight = diameterHelper(treeNode.right, maxDiameter);
        }

        int height = Math.max(leftHeight, rightHeight) + 1;
        int currentDiameter = leftHeight + rightHeight;
        maxDiameter[0] = Math.max(maxDiameter[0], currentDiameter);

        return height;
    }
}
