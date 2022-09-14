package application.depthfirstsearch.validbst;

import binarysearchtrees.algorithm.BinaryTreeNode;

public class ValidBST {

    static Boolean is_bst(BinaryTreeNode root) {
        if (root == null) {
            return true;
        }
        return bstHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean bstHelper(BinaryTreeNode node, int lowerbound, int upperbound) {
        if (node == null) {
            return true;
        }

        if (node.value < lowerbound || node.value > upperbound) {
            return false;
        }

        return bstHelper(node.left, lowerbound, node.value) && bstHelper(node.right, node.value, upperbound);
    }
}
