package application.depthfirstsearch.bottom_up.unival_subtree;

import binarysearchtrees.algorithm.BinaryTreeNode;

public class UnivalSubtrees {
    public static int find_single_value_trees(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] count = new int[1];
        dfsHelper(root, count);
        return count[0];
    }

    private static boolean dfsHelper(BinaryTreeNode node, int[] count) {
        // base case
        if (node.left == null && node.right == null) {
            count[0]++;
            return true;
        }

        boolean univalLeft = true;
        if (node.left != null) {
            univalLeft = dfsHelper(node.left, count);
            univalLeft = univalLeft && node.left.value == node.value;
        }

        boolean univalRight = true;
        if (node.right != null) {
            univalRight = dfsHelper(node.right, count);

            univalRight = univalRight && node.right.value == node.value;
        }

        if (univalLeft && univalRight) {
            count[0]++;
        }

        return univalLeft && univalRight;
    }
}
