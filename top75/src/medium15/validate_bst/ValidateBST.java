package medium15.validate_bst;

import binarysearchtrees.algorithm.BinaryTreeNode;

public class ValidateBST {
    public boolean isValidBST(BinaryTreeNode root) {
        return bstHeightHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean bstHeightHelper(BinaryTreeNode root, Integer lowerBound, Integer upperBound) {
        if (root == null) {
            return true;
        }
        if (root.value < lowerBound || root.value > upperBound) {
            return false;
        }

        if (bstHeightHelper(root.left, lowerBound, root.value)
                && bstHeightHelper(root.right, root.value, upperBound)) {
            return true;
        }

        return false;
    }
}
