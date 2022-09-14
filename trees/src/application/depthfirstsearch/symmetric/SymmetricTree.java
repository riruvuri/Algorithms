package application.depthfirstsearch.symmetric;

import binarysearchtrees.algorithm.BinaryTreeNode;

public class SymmetricTree {

    static Boolean check_if_symmetric(BinaryTreeNode root) {
        if (root == null) {
            return true;
        }
        // Write your code here.
        return isSymmetric(root.left, root.right);
    }

    static boolean isSymmetric(BinaryTreeNode left, BinaryTreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null || !left.value.equals(right.value)) {
            return false;
        }

        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
